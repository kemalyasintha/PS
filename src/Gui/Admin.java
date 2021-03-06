/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Admin extends javax.swing.JFrame {

    private String user;
    private String password;
    public static String userType;

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        Toolkit tk =Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        this.setSize(x, y);




    }

    public void setCurrentUser(String currentUser) {
        txtUser.setText(currentUser);

    }

    public void setpassword(String pword) {
        password = pword;
    }

    public void setuser(String cuser) {
        user = cuser;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnChangePassword = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnTour = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnConfirmation = new javax.swing.JButton();
        btnTour1 = new javax.swing.JButton();
        btnDiscounts = new javax.swing.JButton();
        btnPayments = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pilgrim Scrutinizer");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        btnChangePassword.setBackground(new java.awt.Color(102, 102, 255));
        btnChangePassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        btnSignOut.setBackground(new java.awt.Color(102, 102, 255));
        btnSignOut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSignOut.setText("Sign Out");
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });

        btnUser.setBackground(new java.awt.Color(255, 255, 255));
        btnUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        btnUser.setText("User");
        btnUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUser.setMaximumSize(new java.awt.Dimension(257, 233));
        btnUser.setMinimumSize(new java.awt.Dimension(257, 233));
        btnUser.setPreferredSize(new java.awt.Dimension(257, 233));
        btnUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        btnTour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tour.png"))); // NOI18N
        btnTour.setText("Tour");
        btnTour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTour.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTour.setMaximumSize(new java.awt.Dimension(257, 233));
        btnTour.setMinimumSize(new java.awt.Dimension(257, 233));
        btnTour.setPreferredSize(new java.awt.Dimension(257, 233));
        btnTour.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTourActionPerformed(evt);
            }
        });

        btnCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer.png"))); // NOI18N
        btnCustomer.setText("Customer");
        btnCustomer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCustomer.setMaximumSize(new java.awt.Dimension(257, 233));
        btnCustomer.setMinimumSize(new java.awt.Dimension(257, 233));
        btnCustomer.setPreferredSize(new java.awt.Dimension(257, 233));
        btnCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnConfirmation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConfirmation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/confirmation.png"))); // NOI18N
        btnConfirmation.setText("Confirmation");
        btnConfirmation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirmation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfirmation.setPreferredSize(new java.awt.Dimension(257, 233));
        btnConfirmation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnTour1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTour1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_icon.png"))); // NOI18N
        btnTour1.setText("Search");
        btnTour1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTour1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTour1.setPreferredSize(new java.awt.Dimension(257, 233));
        btnTour1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTour1ActionPerformed(evt);
            }
        });

        btnDiscounts.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDiscounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/discount.jpg"))); // NOI18N
        btnDiscounts.setText("Discounts");
        btnDiscounts.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDiscounts.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiscounts.setPreferredSize(new java.awt.Dimension(257, 233));
        btnDiscounts.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnPayments.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPayments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/payment_icon.jpg"))); // NOI18N
        btnPayments.setText("Payments");
        btnPayments.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPayments.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPayments.setMaximumSize(new java.awt.Dimension(257, 233));
        btnPayments.setMinimumSize(new java.awt.Dimension(257, 233));
        btnPayments.setPreferredSize(new java.awt.Dimension(257, 233));
        btnPayments.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnReports.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reports.png"))); // NOI18N
        btnReports.setText("Reports");
        btnReports.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReports.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReports.setPreferredSize(new java.awt.Dimension(257, 233));
        btnReports.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txtUser.setEditable(false);
        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnChangePassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnConfirmation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTour1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDiscounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPayments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSignOut)
                    .addComponent(btnChangePassword))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPayments, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnTour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConfirmation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTour1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDiscounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
        ChangePassword cp = new ChangePassword();
        cp.setUser(this.user);
        cp.setCurrentpassword(this.password);
        cp.setCurrentUser(this.user);
        cp.setVisible(true);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    
    private void btnTour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTour1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTour1ActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        User u = new User();
        u.setVisible(true);
        u.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }//GEN-LAST:event_btnUserActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_btnSignOutActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Please sign out.........");
    }//GEN-LAST:event_formWindowClosing

    private void btnTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTourActionPerformed
        // TODO add your handling code here:
        admintour adt =new admintour();
        adt.setVisible(true);
        adt.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }//GEN-LAST:event_btnTourActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed

        customer c = new customer();
        c.setVisible(true);
        c.setDefaultCloseOperation(HIDE_ON_CLOSE);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCustomerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnConfirmation;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDiscounts;
    private javax.swing.JButton btnPayments;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JButton btnTour;
    private javax.swing.JButton btnTour1;
    private javax.swing.JButton btnUser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the user
     */
    
}
