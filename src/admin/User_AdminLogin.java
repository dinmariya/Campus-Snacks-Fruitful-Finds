package admin;

import CONNECTOR.DBconnect;
import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import user.LogSign;
import user.UserProf;
import user.ForgotPass;


public class User_AdminLogin extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public User_AdminLogin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pinkboard = new javax.swing.JPanel();
        Username_1 = new javax.swing.JLabel();
        UsernameBox = new javax.swing.JTextField();
        Password_1 = new javax.swing.JLabel();
        PasswordBox = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pinkboard.setBackground(new java.awt.Color(255, 204, 255));
        pinkboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username_1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Username_1.setText("User Name");
        pinkboard.add(Username_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        UsernameBox.setBackground(new java.awt.Color(248, 248, 248));
        UsernameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameBoxActionPerformed(evt);
            }
        });
        pinkboard.add(UsernameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 230, 31));

        Password_1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Password_1.setText("Password");
        pinkboard.add(Password_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        PasswordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordBoxActionPerformed(evt);
            }
        });
        pinkboard.add(PasswordBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 230, 30));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hide.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
        });
        jPanel2.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visible.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pinkboard.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 40, 30));

        Login.setBackground(new java.awt.Color(61, 58, 58));
        Login.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Log in");
        Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        pinkboard.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 100, 30));

        Back.setBackground(new java.awt.Color(61, 58, 58));
        Back.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        pinkboard.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 100, 30));

        jButton1.setText("Forgot Password?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pinkboard.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        getContentPane().add(pinkboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 330, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Group 13.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Group 11.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 410, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameBoxActionPerformed

    private void PasswordBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordBoxActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
    try {
        String input = UsernameBox.getText();  // get input (username or email) from text field
        char[] passwordChars = PasswordBox.getPassword();
        String password = new String(passwordChars);// get password from password field

        // Connect to the database
        con = DBconnect.connect();  // Assuming your DB connection method

        if (con != null) {
            // First, check for Admin login
            String sqlAdmin = "SELECT * FROM adminEntry WHERE adminName = ? AND adminPass = ?";
            pst = con.prepareStatement(sqlAdmin);
            pst.setString(1, input);
            pst.setString(2, password);
            rs = pst.executeQuery();

            if (rs.next()) {
                // Admin login successful
                int adID = rs.getInt("adminID");
                String adminName = rs.getString("adminName");
                String adpass = rs.getString("adminPass");
                Image adImage = null;
                
                AdminDashFrame admindash = new AdminDashFrame(adminName);
                admindash.setVisible(true);
                admindash.pack();
                this.dispose();
            } else {
                // If not an Admin, check for User login (email or username)
            String sqlUser =  "SELECT userInfo.FullName " + 
                             "FROM userInfo " + 
                             "INNER JOIN userEntry ON userInfo.ID = userEntry.userID " +
                             "WHERE userEntry.userName = ? AND userEntry.userPass = ?";

                pst = con.prepareStatement(sqlUser);
                pst.setString(1, input);  // input is now the email
                pst.setString(2, password);  // set the password

                rs = pst.executeQuery();


            if (rs.next()) {
                // If a match is found, retrieve the user's full name
                String fullName = rs.getString("FullName");
                UserProf userProfile = new UserProf(fullName);  // Pass full name to next frame
                userProfile.setVisible(true);
                userProfile.pack();
                this.dispose();  // Close the login window
            } else {
                // If no match is found, show error message
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid username/email or password", "Login Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }
} catch (HeadlessException | SQLException e) {
    javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", javax.swing.JOptionPane.ERROR_MESSAGE);
} finally {
    try {
        if (rs != null) rs.close();
        if (pst != null) pst.close();
        if (con != null) con.close();
    } catch (SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error closing resources: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}


    
    }//GEN-LAST:event_LoginActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        LogSign backbutton = new LogSign();  // You need to create this class
        backbutton.setVisible(true);
        backbutton.pack();
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseClicked
        // TODO add your handling code here:
        PasswordBox.setEchoChar((char)0);
        hide.setVisible(false);
        show.setVisible(true);
    }//GEN-LAST:event_hideMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        // TODO add your handling code here:
        PasswordBox.setEchoChar('*');
        hide.setVisible(true);
        show.setVisible(false);
    }//GEN-LAST:event_showMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ForgotPass pass = new ForgotPass();  
        pass.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(User_AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField PasswordBox;
    private javax.swing.JLabel Password_1;
    private javax.swing.JTextField UsernameBox;
    private javax.swing.JLabel Username_1;
    private javax.swing.JLabel hide;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pinkboard;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
