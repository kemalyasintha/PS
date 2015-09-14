/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pilgrimscrutinizer;

import java.awt.HeadlessException;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
import com.mysql.jdbc.PreparedStatement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import Gui.Login;

public class DBOperation {

    String url = "jdbc:mysql://localhost:3306/plgrimscrutinizer";
    String usernamel = "root";
    String passwordl = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    ResultSet lg = null;

    public int login(String username, String password) {
        // TODO add your handling code here:
        try {
            con = (Connection) DriverManager.getConnection(url, this.usernamel, this.passwordl);
            String sql;        // TODO add your handling code here:
            sql = "SELECT Name,Password,Emptype FROM user WHERE Username=?";
            pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, username);
            rs = pst.executeQuery();
            if (rs.next()) {
                /*System.out.println(rs.getString(1));
                 System.out.println(rs.getString(2));
                 System.out.println(rs.getString(3));*/

                if (password.equals(rs.getString(2)) && "Admin Staff".equals(rs.getString(3))) {
                    //JOptionPane.showMessageDialog(null, "password is correct , admin");
                    return 1;
                } else if (password.equals(rs.getString(2)) && "Regular Staff".equals(rs.getString(3))) {
                    //JOptionPane.showMessageDialog(null, "password is correct , regular");
                    return 2;
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Password..!");
                    return 3;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Username..!");
                return 4;

            }

        } catch (SQLException | HeadlessException e) {
            //System.out.println(e);
            JOptionPane.showMessageDialog(null, "Network Error..!");
            return 5;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }

        }
    }

    public int checkUsername(String username) {
        try {
            con = (Connection) DriverManager.getConnection(url, this.usernamel, this.passwordl);
            String query = "SELECT Username FROM user";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                if (username.equals(rs.getString(1))) {
                    return 0;

                }
            }
            return 1;

        } catch (Exception e) {
            //System.out.print(e);
            return 2;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }

        }
    }

    public boolean addNewUser(UserDetails ud) {
        try {
            con = (Connection) DriverManager.getConnection(url, this.usernamel, this.passwordl);
            String query = "INSERT INTO user VALUES(?,?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            pst.setInt(1, ud.getEmpID());
            pst.setString(2, ud.getEmployeeType());
            pst.setString(3, ud.getName());
            pst.setString(4, ud.getAddress());
            pst.setInt(5, ud.getMobile());
            pst.setString(6, ud.getNic());
            pst.setString(7, ud.getUsername());
            pst.setString(8, ud.getPassword());
            pst.executeUpdate();
            return true;
        } catch (Exception ex) {
            //System.out.print(ex);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public int checkNIC(String NIC) {
        try {
            con = (Connection) DriverManager.getConnection(url, this.usernamel, this.passwordl);
            String query = "SELECT NIC FROM user";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                if (NIC.equals(rs.getString(1))) {
                    return 0;

                }
            }
            return 1;

        } catch (Exception e) {
            //System.out.print(e);
            return 2;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }

        }
    }

    public UserDetails getUserDetails(String NIC) {
        UserDetails ud = new UserDetails();
        try {
            con = (Connection) DriverManager.getConnection(url, this.usernamel, this.passwordl);
            String query = "SELECT * FROM user WHERE NIC =?";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            pst.setString(1, NIC);
            rs = pst.executeQuery();
            while (rs.next()) {
                ud.setEmpID(rs.getInt(1));
                ud.setEmployeeType(rs.getString(2));
                ud.setName(rs.getString(3));
                ud.setAddress(rs.getString(4));
                ud.setMobile(rs.getInt(5));
                ud.setNic(rs.getString(6));
                ud.setUsername(rs.getString(7));
            }
            return ud;

        } catch (Exception e) {
            //System.out.println(e);
            return null;
        }

    }

    public boolean editUser(UserDetails user, String Nic) {
        try {
            con = (Connection) DriverManager.getConnection(url, this.usernamel, this.passwordl);
            String query;
            //query = "UPDATE user SET Emptype='"+user.getEmployeeType()+"',Name='"+user.getName()+"', Address='"+user.getAddress()+"',Mobile="+user.getMobile()+",NIC='"+user.getNic()+"' WHERE NIC="+Nic;
            query = "UPDATE user SET Emptype=? , Name=? , Address=? , Mobile=?  WHERE NIC=?";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            pst.setString(1, user.getEmployeeType());
            pst.setString(2, user.getName());
            pst.setString(3, user.getAddress());
            pst.setInt(4, user.getMobile());
            pst.setString(5, user.getNic());
            pst.executeUpdate();
            return true;
        } catch (Exception ex) {
            //System.out.println(ex);
            return false;
        }
    }

    public boolean changePassword(String username, String newPassword) {
        try {
            con = (Connection) DriverManager.getConnection(url, this.usernamel, this.passwordl);
            String query;
            query = "UPDATE user SET Password = ? WHERE Username=?";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            pst.setString(1, newPassword);
            pst.setString(2, username);
            pst.executeUpdate();
            return true;
        } catch (Exception ex) {
            //System.out.println(ex);
            return false;
        }
    }

    public boolean addTour(tourdetails td1) {
        try {
            java.util.Date utilDate = new SimpleDateFormat("ddMMMyyyy").parse(td1.getDate());
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            con = (Connection) DriverManager.getConnection(url, this.usernamel, this.passwordl);
            String query = "INSERT INTO tour VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            pst.setInt(1, td1.getTourid());
            pst.setString(2, td1.getTourname());
            pst.setDate(3, sqlDate);
            pst.setString(4, td1.getDestination());
            pst.setInt(5, td1.getNoofpassengers());
            pst.setInt(6, td1.getNoofdays());
            pst.setInt(7, td1.getPricepercustomer());
            pst.setInt(8, td1.getEstimatedtotalcost());
            pst.setInt(9, td1.getProfitmargin());
            pst.setInt(10, td1.getSecondtimepercentage());
            pst.setInt(11, td1.getThirdtimepercentage());
            pst.setInt(12, td1.getFourthabovepercentage());
            pst.setInt(13, td1.getRatio());
            pst.setInt(14, td1.getAirticket());
            pst.setInt(15, td1.getPassport());
            pst.setInt(16, td1.getVisa());
            pst.setInt(17, td1.getInsurance());
            pst.setInt(18, td1.getTransport());
            pst.setInt(19, td1.getHospitality());
            pst.setInt(20, td1.getYear());
            pst.setString(21, td1.getMonth());
            pst.setInt(22, td1.getDay());
            pst.setString(23, td1.getCurrentdate());
            pst.executeUpdate();
            return true;

        } catch (ParseException ex) {
            return false;
        } catch (Exception e) {
            //e.printStackTrace();
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public ArrayList<tourdetails> getTours() {
        ArrayList<tourdetails> tlist = new ArrayList<tourdetails>();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //get current date time with Date()
        java.util.Date date = new java.util.Date();
        String currentdate = dateFormat.format(date);

        try {
            con = (Connection) DriverManager.getConnection(url, this.usernamel, this.passwordl);
            String query = "SELECT * from tour WHERE tourdate>?";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            pst.setString(1, currentdate);
            rs = pst.executeQuery();
            while (rs.next()) {
                tourdetails td = new tourdetails();
                td.setTourid(rs.getInt(1));
                td.setTourname(rs.getString(2));
                td.setDate(rs.getDate(3).toString());
                td.setDestination(rs.getString(4));
                td.setNoofpassengers(rs.getInt(5));
                td.setNoofdays(rs.getInt(6));
                td.setPricepercustomer(rs.getInt(7));
                td.setEstimatedtotalcost(rs.getInt(8));
                td.setProfitmargin(rs.getInt(9));
                td.setSecondtimepercentage(rs.getInt(10));
                td.setThirdtimepercentage(rs.getInt(11));
                td.setFourthabovepercentage(rs.getInt(12));
                td.setRatio(rs.getInt(13));
                td.setAirticket(rs.getInt(14));
                td.setPassport(rs.getInt(15));
                td.setVisa(rs.getInt(16));
                td.setInsurance(rs.getInt(17));
                td.setTransport(rs.getInt(18));
                td.setHospitality(rs.getInt(19));
                td.setYear(rs.getInt(20));
                td.setMonth(rs.getString(21));
                td.setDay(rs.getInt(22));
                td.setCurrentdate(rs.getDate(23).toString());
                tlist.add(td);
            }
            return tlist;
        } catch (Exception e) {
            //System.out.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                //System.out.println(e);
            }
        }
    }

    public String searchTour(String tourname, String destination, Date tourDate) {
        try {
            con = (Connection) DriverManager.getConnection(url, this.usernamel, this.passwordl);
            String query = "SELECT tourid,tourname,destination,tourdate FROM tour";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                if (tourname.equals(rs.getString(2))) {
                    if (destination.equals(rs.getString(3))) {
                        if (tourDate.equals(rs.getDate(4))) {
                            return rs.getString(1);
                        } else {
                            return "A";
                        }
                    } else {
                        return "B";
                    }
                }
            }
            return "C";

        } catch (SQLException ex) {
            return "D";
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
            }

        }

    }

    public tourdetails viewTourDetails(int tid) {
        try {
            con = (Connection) DriverManager.getConnection(url, this.usernamel, this.passwordl);
            String query = "SELECT * from tour WHERE tourid=?";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            pst.setInt(1, tid);
            rs = pst.executeQuery();
            tourdetails td = new tourdetails();
            while (rs.next()) {
                td.setTourid(rs.getInt(1));
                td.setTourname(rs.getString(2));
                td.setDate(rs.getDate(3).toString());
                td.setDestination(rs.getString(4));
                td.setNoofpassengers(rs.getInt(5));
                td.setNoofdays(rs.getInt(6));
                td.setPricepercustomer(rs.getInt(7));
                td.setEstimatedtotalcost(rs.getInt(8));
                td.setProfitmargin(rs.getInt(9));
                td.setSecondtimepercentage(rs.getInt(10));
                td.setThirdtimepercentage(rs.getInt(11));
                td.setFourthabovepercentage(rs.getInt(12));
                td.setRatio(rs.getInt(13));
                td.setAirticket(rs.getInt(14));
                td.setPassport(rs.getInt(15));
                td.setVisa(rs.getInt(16));
                td.setInsurance(rs.getInt(17));
                td.setTransport(rs.getInt(18));
                td.setHospitality(rs.getInt(19));
                td.setYear(rs.getInt(20));
                td.setMonth(rs.getString(21));
                td.setDay(rs.getInt(22));
                td.setCurrentdate(rs.getDate(23).toString());
            }
            return td;
        } catch (Exception e) {
            //System.out.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public boolean updatetour(tourdetails td1,int tid) {
        try {
            java.util.Date utilDate = new SimpleDateFormat("ddMMMyyyy").parse(td1.getDate());
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            String query ="UPDATE tour SET tourname=?,tourdate=?, destination=?, noofpassengers=?, noofdays=?, pricepercustomer=?,"
                    + "	estimatedtotalcost=?, profitmargin=?, 2ndtimepercentage=?, 3rdtimepercentage=?, 4aboveppercentage=?, ratio=?, "
                    + "airticket=?, passport=?,visa=?, insurance=?,transport=?, hospitality=?,touryear=?,tourmonth=?, 	day=?,currentdate=? WHERE tourid=? ";
            con = (Connection) DriverManager.getConnection(url, this.usernamel, this.passwordl);
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            //pst.setInt(1, td1.getTourid());
            pst.setString(1, td1.getTourname());
            pst.setDate(2, sqlDate);
            pst.setString(3, td1.getDestination());
            pst.setInt(4, td1.getNoofpassengers());
            pst.setInt(5, td1.getNoofdays());
            pst.setInt(6, td1.getPricepercustomer());
            pst.setInt(7, td1.getEstimatedtotalcost());
            pst.setInt(8, td1.getProfitmargin());
            pst.setInt(9, td1.getSecondtimepercentage());
            pst.setInt(10, td1.getThirdtimepercentage());
            pst.setInt(11, td1.getFourthabovepercentage());
            pst.setInt(12, td1.getRatio());
            pst.setInt(13, td1.getAirticket());
            pst.setInt(14, td1.getPassport());
            pst.setInt(15, td1.getVisa());
            pst.setInt(16, td1.getInsurance());
            pst.setInt(17, td1.getTransport());
            pst.setInt(18, td1.getHospitality());
            pst.setInt(19, td1.getYear());
            pst.setString(20, td1.getMonth());
            pst.setInt(21, td1.getDay());
            pst.setString(22, td1.getCurrentdate());
            pst.setInt(23, tid);
            pst.executeUpdate();
            return true;
            
        } catch (Exception e) {
            //e.printStackTrace();
            return false;
        }finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                //System.out.println(e);
            }
        }

    }
}
