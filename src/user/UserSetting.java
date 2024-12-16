
package user;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import CONNECTOR.DBconnect; 
import admin.User_AdminLogin;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.ImageIcon;


public class UserSetting extends javax.swing.JFrame {
   private String fname, contact, bdate, mail, address,username,password,userName, email;
    private int userId;
    private ImageIcon usersImage;
    
   public UserSetting(String fname, String contact, String bdate, String mail, String address, String username, String password, String userName, ImageIcon usersImage, String email) {
    initComponents();
    this.fname = fname;
    this.contact = contact;
    this.bdate = bdate;
    this.mail = mail;
    this.address = address;
    this.username = username;
    this.password = password;
    this.userName = userName;
    this.usersImage = usersImage; 
    this.email=email;
        // Populate UI components
      
        // ...set other fields
    
        configureComboBoxRenderer();
    }

    private void configureComboBoxRenderer() {
        Login.setRenderer(new javax.swing.plaf.basic.BasicComboBoxRenderer() {
            @Override
            public java.awt.Component getListCellRendererComponent(
                javax.swing.JList<?> list,
                Object value,
                int index,
                boolean isSelected,
                boolean cellHasFocus
            ) {
                java.awt.Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                c.setBackground(new java.awt.Color(255, 204, 255)); // Set background color
                c.setForeground(java.awt.Color.BLACK); // Optional: Set text color
                return c;
            }
        });

        // Attach the ActionListener to handle user actions
        Login.addActionListener(evt -> handleComboBoxAction(evt));
    }

    private void handleComboBoxAction(java.awt.event.ActionEvent evt) {
    String selectedOption = (String) Login.getSelectedItem();

    if (selectedOption != null) {
        switch (selectedOption) {
            case "Login another account":
                int logoutConfirm = JOptionPane.showConfirmDialog(
                    this,
                    "Do you want to login to another account?",
                    "Logout",
                    JOptionPane.YES_NO_OPTION
                );
                if (logoutConfirm == JOptionPane.YES_OPTION) {
                    new User_AdminLogin().setVisible(true);
                    this.dispose();
                }
                break;

            case "Create another account":
                int createAccountConfirm = JOptionPane.showConfirmDialog(
                    this,
                    "Do you want to create another account now?",
                    "Create Account",
                    JOptionPane.YES_NO_OPTION
                );
                if (createAccountConfirm == JOptionPane.YES_OPTION) {
                    new UserSignup().setVisible(true);
                    this.dispose();
                }
                break;

            // Default case removed, no error message displayed
        }
    }

      
  
    }
    private void fetchUserDetailsFromDB(String fullname) {
        Connection con = DBconnect.connect();
        String sql = "SELECT userINFO.ID, userINFO.FullName, userINFO.Num, userInfo.Birthday, userInfo.Email, userInfo.Address, " +
                 "userEntry.userName, userEntry.userPass " +
                 "FROM userInfo " +
                 "INNER JOIN userEntry ON userInfo.ID = userEntry.userID " +
                 "WHERE userInfo.FullName = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, fullname); // Fetch by userId
        ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Store details in instance variables
            fname = rs.getString("FullName");
            contact = rs.getString("Num");
            bdate = rs.getString("Birthday");
            mail= rs.getString("Email");
            address= rs.getString("Address");
            username= rs.getString("userName");
            password = rs.getString("userPass");
            
           } else {
            JOptionPane.showMessageDialog(this, "No user found with the provided name.", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        UserMenu = new javax.swing.JLabel();
        Setting_Back = new javax.swing.JButton();
        Delete_Account = new javax.swing.JButton();
        User_Account = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        Login = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(29, 126, 55)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 104, 430, -1));

        UserMenu.setFont(new java.awt.Font("Javanese Text", 1, 36)); // NOI18N
        UserMenu.setForeground(new java.awt.Color(29, 126, 55));
        UserMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserMenu.setText("Settings");
        UserMenu.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UserMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UserMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(UserMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 43, 167, 55));

        Setting_Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Setting_Back.setText("<");
        Setting_Back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Setting_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Setting_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Setting_BackActionPerformed(evt);
            }
        });
        jPanel1.add(Setting_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 34, -1));

        Delete_Account.setBackground(new java.awt.Color(255, 204, 255));
        Delete_Account.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        Delete_Account.setText("Delete Account");
        Delete_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_AccountActionPerformed(evt);
            }
        });
        jPanel1.add(Delete_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 291, 60));

        User_Account.setBackground(new java.awt.Color(255, 204, 255));
        User_Account.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        User_Account.setText("  View Account");
        User_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        User_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_AccountActionPerformed(evt);
            }
        });
        jPanel1.add(User_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 291, 60));

        logout.setBackground(new java.awt.Color(255, 204, 255));
        logout.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        logout.setText("   Log Out");
        logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.setPreferredSize(new java.awt.Dimension(159, 24));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 291, 60));

        Login.setBackground(new java.awt.Color(255, 204, 255));
        Login.setFont(new java.awt.Font("Segoe UI Symbol", 0, 23)); // NOI18N
        Login.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Login another account", "Create another account" }));
        Login.setToolTipText("Login / Create");
        Login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Login.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                LoginComponentAdded(evt);
            }
        });
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 290, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 575));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Setting_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Setting_BackActionPerformed
        // TODO add your handling code here:
  
        UserProf prof = new UserProf(fname, contact, bdate, mail, address,username,password,userName,usersImage, email); // Pass the updated name back
        prof.setVisible(true);
        prof.pack();
        this.dispose();  // Close the current frame
 
    }//GEN-LAST:event_Setting_BackActionPerformed

    private void User_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_AccountActionPerformed
        // TODO add your handling code here:
    fetchUserDetailsFromDB(fname);
    UserAccount account = new UserAccount(fname, contact, bdate, mail, address, username, password, userName, usersImage, email);
    account.setVisible(true);
    account.pack();

    // Close the current frame
    this.dispose(); 
     
    }//GEN-LAST:event_User_AccountActionPerformed

    private void Delete_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_AccountActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, 
        "Are you sure you want to delete your account? This action cannot be undone.",
        "Delete Account",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE);

    if (confirm == JOptionPane.YES_OPTION) {
        // Proceed with account deletion
        Connection con = DBconnect.connect();
        String fetchUserIdSQL = "SELECT ID FROM userInfo WHERE FullName = ?";
        String deleteUserSQL = "DELETE FROM userInfo WHERE ID = ?";
        String deleteCredentialsSQL = "DELETE FROM userEntry WHERE userID = ?";

        try {
            con.setAutoCommit(false);// Start a transaction
            
             int userId = -1;

           try (PreparedStatement ps = con.prepareStatement(fetchUserIdSQL)) {
                ps.setString(1, fname);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    userId = rs.getInt("id");
                } else {
                    JOptionPane.showMessageDialog(this, 
                        "No user found with the provided name.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Delete from the `users` table
            try (PreparedStatement ps1 = con.prepareStatement(deleteUserSQL)) {
                ps1.setInt(1, userId);
                ps1.executeUpdate();
            }

            // Delete from the `user_credentials` table
            try (PreparedStatement ps2 = con.prepareStatement(deleteCredentialsSQL)) {
                ps2.setInt(1, userId);
                ps2.executeUpdate();
            }

            // Commit the transaction
            con.commit();

            // Notify the user
            JOptionPane.showMessageDialog(this, 
                "Your account has been successfully deleted.",
                "Account Deleted",
                JOptionPane.INFORMATION_MESSAGE);

            // Redirect to the login screen
            new LogSign().setVisible(true);
            this.dispose();
        } catch (SQLException e) {
            // Handle SQL exceptions
            try {
                con.rollback(); // Rollback transaction if there's an error
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, 
                "An error occurred while deleting your account. Please try again.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (con != null) {
                    con.setAutoCommit(true); // Reset auto-commit to default
                    con.close();
                }
            } catch (SQLException closeEx) {
                closeEx.printStackTrace();
            }
        }
    }

                         
                        
    }//GEN-LAST:event_Delete_AccountActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(this,"Do you want to logout now?","Logout",JOptionPane.YES_NO_OPTION);
        if (a==0){
        new LogSign().setVisible(true);
        this.dispose();
        }
        
    }//GEN-LAST:event_logoutMouseClicked

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
    
        
    }//GEN-LAST:event_LoginActionPerformed

    private void LoginComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_LoginComponentAdded
   
    }//GEN-LAST:event_LoginComponentAdded

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
 
    }//GEN-LAST:event_LoginMouseClicked

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
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                String fname =null; 
                String contact= null;
                String bdate= null;
                String mail= null;
                String address= null;
                String username = null;
                String password = null;
                String userName = null;
                ImageIcon usersImage = null;
                String email=null;
                
                
                new UserSetting(fname, contact, bdate, mail, address,username,password,userName,usersImage, email).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_Account;
    private javax.swing.JComboBox<String> Login;
    private javax.swing.JButton Setting_Back;
    private javax.swing.JLabel UserMenu;
    private javax.swing.JButton User_Account;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
