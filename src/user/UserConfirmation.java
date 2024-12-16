

package user;

import CONNECTOR.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement; // Correct import
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rachel
 */
public class UserConfirmation extends javax.swing.JFrame {
    
      // Instance variables
    private String fname, contact, bdate, mail, address,username,password;
    private int userId;

    
    public UserConfirmation(int userId, String fname, String contact, String bdate, String mail, String address, String username, String password) {
        initComponents(); 
        this.userId = userId;
        this.fname = fname;
        this.contact = contact;
        this.bdate = bdate;
        this.mail = mail;
        this.address = address;
        this.username = username;
        this.password = password;
    }
    private boolean validateFields(String fname, String contact, String bdate, String mail, String address) {
    StringBuilder errorMessage = new StringBuilder("Sorry, invalid ");

    boolean hasError = false;

    if (fname == null || fname.trim().isEmpty() || !fname.matches("[a-zA-Z.\\s]+")) {
        errorMessage.append("name");
        hasError = true;
    }
    if (contact == null || contact.trim().isEmpty() || !contact.matches("\\d{11}")) {
        if (hasError) errorMessage.append(", ");
        errorMessage.append("number");
        hasError = true;
    }
    if (bdate == null || bdate.trim().isEmpty()) {
        if (hasError) errorMessage.append(", ");
        errorMessage.append("birthday");
        hasError = true;
    }
    if (mail == null || mail.trim().isEmpty() || !mail.contains("@")) {
        if (hasError) errorMessage.append(", ");
        errorMessage.append("email");
        hasError = true;
    }
    if (address == null || address.trim().isEmpty()) {
        if (hasError) errorMessage.append(", ");
        errorMessage.append("address");
        hasError = true;
    }

    if (hasError) {
        JOptionPane.showMessageDialog(this, errorMessage.toString() + ".", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    return true; // All validations passed
}

    public UserConfirmation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Uname = new javax.swing.JLabel();
        password_Text = new javax.swing.JLabel();
        User_nameBox = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Passwordbox1 = new javax.swing.JPasswordField();
        Confirm_Account = new javax.swing.JButton();
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Signup_Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Uname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Uname.setText("User Name");
        jPanel1.add(Uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        password_Text.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        password_Text.setText("Password");
        jPanel1.add(password_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        User_nameBox.setBackground(new java.awt.Color(248, 248, 248));
        User_nameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_nameBoxActionPerformed(evt);
            }
        });
        jPanel1.add(User_nameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 230, 31));

        jPanel2.setBackground(new java.awt.Color(73, 73, 73));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hide.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, -1, 28));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 40, 40));

        Passwordbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Passwordbox1ActionPerformed(evt);
            }
        });
        jPanel1.add(Passwordbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 230, 30));

        Confirm_Account.setBackground(new java.awt.Color(156, 207, 253));
        Confirm_Account.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        Confirm_Account.setText("Confirm Account");
        Confirm_Account.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Confirm_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_AccountActionPerformed(evt);
            }
        });
        jPanel1.add(Confirm_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 130, 30));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hide.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
        });
        jPanel1.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 28, -1));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visible.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 28, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visible.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, 28));

        Signup_Back.setBackground(new java.awt.Color(73, 73, 73));
        Signup_Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Signup_Back.setForeground(new java.awt.Color(235, 235, 235));
        Signup_Back.setText("Back");
        Signup_Back.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Signup_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Signup_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Signup_BackActionPerformed(evt);
            }
        });
        jPanel1.add(Signup_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 50, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 320, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Group 13.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void User_nameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_nameBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_User_nameBoxActionPerformed

    private void Confirm_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_AccountActionPerformed
     if (!validateFields(fname, contact, bdate, mail, address)) {
        JOptionPane.showMessageDialog(this, "All fields are required!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Stop if validation fails
    }

    // Check if email is unique
    if (!isEmailUnique(mail)) {
        return; // Stop the process if email is not unique
    }

    // Validate User_name and Password
    if (!validateUserNameAndPassword()) {
        return; // Stop if username or password validation fails
    }

    try (Connection con = DBconnect.connect()) {
        // Insert into 'users' table
        String sqlUsers = "INSERT INTO userInfo (Fullname, Num, Birthday, Email, Address) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement psUsers = con.prepareStatement(sqlUsers, Statement.RETURN_GENERATED_KEYS);

        psUsers.setString(1, fname);
        psUsers.setString(2, contact);
        psUsers.setString(3, bdate);
        psUsers.setString(4, mail);
        psUsers.setString(5, address);

        int userRowsAffected = psUsers.executeUpdate();

        int generatedUserId = 0;
        try (ResultSet rs = psUsers.getGeneratedKeys()) {
            if (rs.next()) {
                generatedUserId = rs.getInt(1);
            }
        }

        // Insert into 'user_credentials' table
        String sqlCredentials = "INSERT INTO userEntry (userID, userName, userPass) VALUES (?, ?, ?)";
        PreparedStatement psCredentials = con.prepareStatement(sqlCredentials);

        psCredentials.setInt(1, generatedUserId);
        psCredentials.setString(2, User_nameBox.getText());
        psCredentials.setString(3, new String(Passwordbox1.getPassword()));

        int credentialsRowsAffected = psCredentials.executeUpdate();

        if (userRowsAffected > 0 && credentialsRowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "User registered successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Open UserProf after registration
            new UserProf(fname).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed. Try again!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        Logger.getLogger(UserConfirmation.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}

// Method to validate User_name and Password
private boolean validateUserNameAndPassword() {
    String userName = User_nameBox.getText();
    String password = new String(Passwordbox1.getPassword());

    // Validate User_name: at least 5 characters, can include letters, numbers, and special characters
    if (userName == null || userName.trim().isEmpty() || !userName.matches("^[a-zA-Z0-9!@#$%^&*()_+={}:;,.<>?/-]{5,}$")) {
        JOptionPane.showMessageDialog(this, "Username must be at least 5 characters, containing letters, numbers, or special characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validate Password: at least 5 characters, only letters and numbers (no special characters)
    if (password == null || password.trim().isEmpty() || !password.matches("^[a-zA-Z0-9]{5,}$")) {
        JOptionPane.showMessageDialog(this, "Password must be at least 5 characters (ABC/123)", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    return true;
}

// Method to check if email is unique
private boolean isEmailUnique(String email) {
    try (Connection con = DBconnect.connect()) {
        // SQL query to check if the email already exists
        String sqlCheckEmail = "SELECT COUNT(*) FROM userInfo WHERE Email = ?";
        PreparedStatement psCheckEmail = con.prepareStatement(sqlCheckEmail);
        psCheckEmail.setString(1, email);

        ResultSet rs = psCheckEmail.executeQuery();
        if (rs.next() && rs.getInt(1) > 0) {
            JOptionPane.showMessageDialog(this, "This email is already in use. Please use a different email.", "Email Error", JOptionPane.ERROR_MESSAGE);
            return false; // Email already exists
        }
    } catch (SQLException ex) {
        Logger.getLogger(UserConfirmation.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    return true; // Email is unique

    }//GEN-LAST:event_Confirm_AccountActionPerformed

    private void hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseClicked
        // TODO add your handling code here:
        Passwordbox1.setEchoChar((char)0);
        hide.setVisible(false);
        show.setVisible(true);
    }//GEN-LAST:event_hideMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        // TODO add your handling code here:
        Passwordbox1.setEchoChar('*');
        hide.setVisible(true);
        show.setVisible(false);
    }//GEN-LAST:event_showMouseClicked

    private void Passwordbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Passwordbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Passwordbox1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void Signup_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signup_BackActionPerformed
        // TODO add your handling code here:
        UserSignup signup = new UserSignup(userId, fname, contact, bdate, mail, address, username, password);
        signup.setVisible(true);
        signup.pack();
        this.dispose();
    }//GEN-LAST:event_Signup_BackActionPerformed

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
            java.util.logging.Logger.getLogger(UserConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int userId =0;
                String fname =null; 
                String contact= null;
                String bdate= null;
                String mail= null;
                String address= null;
                String username = null;
                String password = null;
                new UserConfirmation(userId,fname, contact, bdate, mail, address,username,password).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirm_Account;
    private javax.swing.JPasswordField Passwordbox1;
    private javax.swing.JButton Signup_Back;
    private javax.swing.JLabel Uname;
    private javax.swing.JTextField User_nameBox;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel password_Text;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
