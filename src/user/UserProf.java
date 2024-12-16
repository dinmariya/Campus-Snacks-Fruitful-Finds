
package user;


import java.io.File;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

import javax.swing.JFileChooser;
import java.sql.PreparedStatement;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class UserProf extends javax.swing.JFrame {
    private String fname, contact, bdate, mail, address,username,password,userName, email;
    private int userId;
    private ImageIcon usersImage;

    public UserProf(String fname, String contact, String bdate, String mail, String address, String username, String password, String userName,ImageIcon usersImage, String email) {
        initComponents();
        this.fname = fname;
        this.contact = contact;
        this.bdate = bdate;
        this.mail = mail;
        this.address = address;
        this.username = username;
        this.password = password;
        this.userName = userName;
        this.email=email;
        
        // Populate the UI with passed data (optional)
        Username_Fullname.setText(fname); // Set the user's full name
        if (usersImage != null) {
            UserPic.setIcon(usersImage); // Set the image if provided
        } else {
            ImageIcon defaultImage = getUsersImage(fname);
            if (defaultImage != null) {
                UserPic.setIcon(defaultImage);
            }
        }
    }

    // Constructor for just fname
    public UserProf(String fname) {
        this(fname, null);
    }

    // Constructor for fname and usersImage
    public UserProf(String fname, ImageIcon usersImage) {
        initComponents();
        this.fname = fname;
        Username_Fullname.setText(fname); // Set the user's name
        if (usersImage != null) {
            UserPic.setIcon(usersImage); // Set the image
        } else {
            ImageIcon defaultImage = getUsersImage(fname);
            if (defaultImage != null) {
                UserPic.setIcon(defaultImage);
            }
        }
    }

    // Default constructor
    public UserProf() {
        initComponents();
    }

    // Method to fetch the user's image from the database
    private ImageIcon getUsersImage(String fname) {
    try (java.sql.Connection conn = CONNECTOR.DBconnect.connect()) {
        String sql = "SELECT Image FROM userInfo WHERE FullName = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, fname);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    byte[] imageBytes = rs.getBytes("Image");
                    if (imageBytes != null) {
                        try (InputStream in = new ByteArrayInputStream(imageBytes)) {
                            BufferedImage bi = ImageIO.read(in);
                            Image resizedImage = bi.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                            return new ImageIcon(resizedImage);
                        }
                    }
                }
            }
        }
    } catch (SQLException | IOException e) {
        System.out.println("Error fetching user image: " + e.getMessage());
    }
    return null; // Return null if no image is found or an error occurs
}

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UserPic = new javax.swing.JLabel();
        Profile = new javax.swing.JLabel();
        UserSetting = new javax.swing.JButton();
        User_Menu = new javax.swing.JButton();
        User_Message = new javax.swing.JButton();
        Username_Fullname = new javax.swing.JLabel();
        UploadImage = new javax.swing.JButton();
        User_Order = new javax.swing.JButton();
        User_Cart1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserPic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        UserPic.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(UserPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 150, 130));

        Profile.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        Profile.setForeground(new java.awt.Color(190, 250, 245));
        Profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Profile.setText("Profile");
        jPanel1.add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 90, 30));

        UserSetting.setBackground(new java.awt.Color(255, 204, 255));
        UserSetting.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        UserSetting.setText("Settings");
        UserSetting.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UserSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserSettingActionPerformed(evt);
            }
        });
        jPanel1.add(UserSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 290, 60));

        User_Menu.setBackground(new java.awt.Color(255, 204, 255));
        User_Menu.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        User_Menu.setText("Menu");
        User_Menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        User_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_MenuActionPerformed(evt);
            }
        });
        jPanel1.add(User_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 290, 60));

        User_Message.setBackground(new java.awt.Color(255, 204, 255));
        User_Message.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        User_Message.setText("Messages");
        User_Message.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        User_Message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_MessageActionPerformed(evt);
            }
        });
        jPanel1.add(User_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 290, 60));

        Username_Fullname.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Username_Fullname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username_Fullname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Username_FullnameMouseClicked(evt);
            }
        });
        jPanel1.add(Username_Fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 320, 40));

        UploadImage.setBackground(new java.awt.Color(233, 243, 249));
        UploadImage.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        UploadImage.setText("Upload Image");
        UploadImage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(245, 251, 252), new java.awt.Color(243, 251, 252), new java.awt.Color(243, 249, 249), new java.awt.Color(242, 250, 250)));
        UploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadImageActionPerformed(evt);
            }
        });
        jPanel1.add(UploadImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        User_Order.setBackground(new java.awt.Color(255, 204, 255));
        User_Order.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        User_Order.setText("Orders");
        User_Order.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        User_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_OrderActionPerformed(evt);
            }
        });
        jPanel1.add(User_Order, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 290, 60));

        User_Cart1.setBackground(new java.awt.Color(255, 204, 255));
        User_Cart1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        User_Cart1.setText("Cart");
        User_Cart1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        User_Cart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_Cart1ActionPerformed(evt);
            }
        });
        jPanel1.add(User_Cart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 290, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 420, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserSettingActionPerformed
   
  UserSetting setting = new UserSetting(fname, contact, bdate, mail, address, username, password, userName, (ImageIcon) UserPic.getIcon(), email); // Pass the updated name back
        setting.setVisible(true);
        setting.pack();
        this.dispose(); 
        
    }//GEN-LAST:event_UserSettingActionPerformed

    private void User_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_MenuActionPerformed
       String fname = Username_Fullname.getText();
        UserMenu menu = new UserMenu(fname, contact, bdate, mail, address, username, password, userName, (ImageIcon) UserPic.getIcon(), email);
        menu.setVisible(true);
        menu.pack();

    this.dispose();
    }//GEN-LAST:event_User_MenuActionPerformed

    private void User_MessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_MessageActionPerformed
        // TODO add your handling code here:
           String fname = Username_Fullname.getText(); 
           UserMessage mes  = new UserMessage(fname, contact, bdate, mail, address, username, password, userName, (ImageIcon) UserPic.getIcon(), email);
            mes.setVisible(true);
            mes.pack();
            this.dispose();
    }//GEN-LAST:event_User_MessageActionPerformed

    private void Username_FullnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Username_FullnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_FullnameMouseClicked

    private void UploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadImageActionPerformed
       JFileChooser chooser = new JFileChooser();
    chooser.setDialogTitle("Select an Image");
    chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

    int result = chooser.showOpenDialog(null);
    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = chooser.getSelectedFile();
        try {
            BufferedImage bi = ImageIO.read(selectedFile);
            Image resizedImage = bi.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            UserPic.setIcon(new ImageIcon(resizedImage));
            UploadImage.setText("Image Uploaded");

            byte[] imageBytes;
            try (FileInputStream fis = new FileInputStream(selectedFile)) {
                imageBytes = fis.readAllBytes();
            }

            // Save image to database
            try (java.sql.Connection conn = CONNECTOR.DBconnect.connect()) {
                String sql = "UPDATE userInfo SET Image = ? WHERE FullName = ?";
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setBytes(1, imageBytes);
                    pstmt.setString(2, Username_Fullname.getText());
                    int rowsUpdated = pstmt.executeUpdate();
                    UploadImage.setText(rowsUpdated > 0 ? "Image Saved!" : "Save Failed");
                }
            }
        } catch (IOException | SQLException ex) {
            System.out.println("Error: Unable to update the image. " + ex.getMessage());
        }
    }

    }//GEN-LAST:event_UploadImageActionPerformed

    private void User_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_OrderActionPerformed
        // TODO add your handling code here:
         String fname = Username_Fullname.getText();
        UserOrders order = new UserOrders(fname, contact, bdate, mail, address, username, password, userName, (ImageIcon) UserPic.getIcon(), email);
        order.setVisible(true);
        order.pack();

    this.dispose();
    }//GEN-LAST:event_User_OrderActionPerformed

    private void User_Cart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_Cart1ActionPerformed
        // TODO add your handling code here:
        String fname = Username_Fullname.getText();
        UserCart cart = null;
        cart = new UserCart(fname, contact, bdate, mail, address, username, password, userName, (ImageIcon) UserPic.getIcon(), email);
        cart.setVisible(true);
        cart.pack();

    this.dispose();
    }//GEN-LAST:event_User_Cart1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                
        new UserProf(fname, contact, bdate, mail, address,username,password,userName,usersImage, email).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Profile;
    private javax.swing.JButton UploadImage;
    private javax.swing.JLabel UserPic;
    private javax.swing.JButton UserSetting;
    private javax.swing.JButton User_Cart1;
    private javax.swing.JButton User_Menu;
    private javax.swing.JButton User_Message;
    private javax.swing.JButton User_Order;
    private javax.swing.JLabel Username_Fullname;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
