
package admin;

import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JFileChooser;
import java.io.File;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import user.LogSign;

/**
 *
 * @author User
 */
public class AdminDashFrame extends javax.swing.JFrame {
   private String adminName;
    private ImageIcon adminPic;
    private String adname;
    private String adpassword;

    public AdminDashFrame(String adminName, ImageIcon adminPic) {
        initComponents();
        Admin_UserName.setText(adminName);    // Set username
        if (adminPic != null) {
            AdminPic.setIcon(adminPic);     // Set image
        }
    }
     public AdminDashFrame(String adminName) {
    initComponents();
    Admin_UserName.setText(adminName);  // Set the admin name when the frame is created
    ImageIcon adminImage = getAdminImage(adminName);
        if (adminImage != null) {
            AdminPic.setIcon(adminImage);  // Set the image if it exists
        }
    }
     private ImageIcon getAdminImage(String adminName) {
        ImageIcon adminImage = null;

        try (Connection conn = CONNECTOR.DBconnect.connect()) {
            String sql = "SELECT adminPic FROM adminEntry WHERE adminName = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, adminName);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        byte[] imageBytes = rs.getBytes("adminPic");
                        if (imageBytes != null) {
                            
                            InputStream in = new ByteArrayInputStream(imageBytes);
                        BufferedImage bi = ImageIO.read(in);
                       Image resizedImage = bi.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                        
                        return new ImageIcon(resizedImage);
                    }
                }
            }
        }
    } catch (SQLException | IOException e) {
        System.out.println("Error fetching admin image: " + e.getMessage());
    }
    return null; // Return null if no image found
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminPanel = new javax.swing.JPanel();
        Admin = new javax.swing.JLabel();
        Admin_Orders = new javax.swing.JButton();
        Admin_Menu = new javax.swing.JButton();
        Admin_Message = new javax.swing.JButton();
        Admin_Sales = new javax.swing.JButton();
        Admin_Users = new javax.swing.JButton();
        AdminPic = new javax.swing.JLabel();
        UploadImage = new javax.swing.JButton();
        Admin_UserName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        quit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminPanel.setBackground(new java.awt.Color(255, 255, 204));
        AdminPanel.setPreferredSize(new java.awt.Dimension(400, 580));
        AdminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Admin.setText("Admin ");
        AdminPanel.add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        Admin_Orders.setBackground(new java.awt.Color(255, 204, 255));
        Admin_Orders.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        Admin_Orders.setText("Manage Orders");
        Admin_Orders.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Admin_Orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Admin_OrdersMouseClicked(evt);
            }
        });
        Admin_Orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_OrdersActionPerformed(evt);
            }
        });
        AdminPanel.add(Admin_Orders, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 184, 290, 60));

        Admin_Menu.setBackground(new java.awt.Color(255, 204, 255));
        Admin_Menu.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        Admin_Menu.setText("Manage Products");
        Admin_Menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Admin_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_MenuActionPerformed(evt);
            }
        });
        AdminPanel.add(Admin_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 262, 290, 60));

        Admin_Message.setBackground(new java.awt.Color(255, 204, 255));
        Admin_Message.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        Admin_Message.setText("Message");
        Admin_Message.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Admin_Message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_MessageActionPerformed(evt);
            }
        });
        AdminPanel.add(Admin_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 290, 60));

        Admin_Sales.setBackground(new java.awt.Color(255, 204, 255));
        Admin_Sales.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        Admin_Sales.setText("Sales");
        Admin_Sales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Admin_Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_SalesActionPerformed(evt);
            }
        });
        AdminPanel.add(Admin_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 418, 290, 60));

        Admin_Users.setBackground(new java.awt.Color(255, 204, 255));
        Admin_Users.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        Admin_Users.setText(" Manage Users");
        Admin_Users.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Admin_Users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_UsersActionPerformed(evt);
            }
        });
        AdminPanel.add(Admin_Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 496, 290, 60));

        AdminPic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        AdminPanel.add(AdminPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 150, 120));

        UploadImage.setBackground(new java.awt.Color(233, 243, 249));
        UploadImage.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        UploadImage.setText("Upload Image");
        UploadImage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(245, 251, 252), new java.awt.Color(243, 251, 252), new java.awt.Color(243, 249, 249), new java.awt.Color(242, 250, 250)));
        UploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadImageActionPerformed(evt);
            }
        });
        AdminPanel.add(UploadImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 89, -1));

        Admin_UserName.setBackground(new java.awt.Color(255, 255, 204));
        Admin_UserName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Admin_UserName.setBorder(null);
        Admin_UserName.setSelectionColor(new java.awt.Color(0, 102, 255));
        Admin_UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_UserNameActionPerformed(evt);
            }
        });
        AdminPanel.add(Admin_UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 157, 29));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        quit.setBackground(new java.awt.Color(0, 0, 0));
        quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(quit)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(quit)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        AdminPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 40, 30));

        getContentPane().add(AdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Admin_UsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_UsersActionPerformed
        // TODO add your handling code here:
        String adminName = Admin_UserName.getText();
        AdminUsers users = new AdminUsers(adminName,(ImageIcon) AdminPic.getIcon());
        users.setVisible(true);
        users.pack();
        this.dispose();
    }//GEN-LAST:event_Admin_UsersActionPerformed

    private void Admin_SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_SalesActionPerformed
         String adminName = Admin_UserName.getText();
        AdminSales sales = new AdminSales(adminName,(ImageIcon) AdminPic.getIcon());
        sales.setVisible(true);
        sales.pack();
        this.dispose();
    }//GEN-LAST:event_Admin_SalesActionPerformed

    private void Admin_MessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_MessageActionPerformed
        // TODO add your handling code here:
     String adminName = Admin_UserName.getText();
      AdminMessage mes  = new AdminMessage(adminName,(ImageIcon) AdminPic.getIcon());
    mes.setVisible(true);
     mes.pack();
    this.dispose();
        
    }//GEN-LAST:event_Admin_MessageActionPerformed

    private void Admin_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_MenuActionPerformed
        // TODO add your handling code here:
       String adminName = Admin_UserName.getText();
        AdminMenu menu = new AdminMenu(adminName,(ImageIcon) AdminPic.getIcon());
        menu.setVisible(true);
        menu.pack();
        this.dispose();
    }//GEN-LAST:event_Admin_MenuActionPerformed

    private void Admin_OrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_OrdersActionPerformed
        String adminName = Admin_UserName.getText(); 
        AdminOrder order = new AdminOrder(adminName, (ImageIcon) AdminPic.getIcon());
    order.setVisible(true);
     order.pack();
    this.dispose();
    }//GEN-LAST:event_Admin_OrdersActionPerformed

    private void Admin_OrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admin_OrdersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_OrdersMouseClicked

    private void UploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadImageActionPerformed
        // TODO add your handling code here:
      JFileChooser chooser = new JFileChooser();
    chooser.setDialogTitle("Select an Image");
    chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    
    // Show the file chooser and get the selected file
    int result = chooser.showOpenDialog(null);
    
          
if (result == JFileChooser.APPROVE_OPTION) {
    File selectedFile = chooser.getSelectedFile();

    try {
       
        BufferedImage bi = ImageIO.read(selectedFile);
        Image resizedImage = bi.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        AdminPic.setIcon(new ImageIcon(resizedImage)); 
        UploadImage.setText("Image Uploaded");

        
        byte[] imageBytes;
        try (FileInputStream fis = new FileInputStream(selectedFile)) {
            imageBytes = fis.readAllBytes();
        }

        try ( 
                Connection conn = CONNECTOR.DBconnect.connect()) {
            String sql = "UPDATE adminEntry SET adminPic = ? WHERE adminName = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setBytes(1, imageBytes);
                pstmt.setString(2, Admin_UserName.getText());
                int rowsUpdated = pstmt.executeUpdate();
                
                if (rowsUpdated > 0) {
                    UploadImage.setText("Image Saved!");
                } else {
                    UploadImage.setText("Save Failed");
                }
            }
        }

    } catch (IOException | SQLException ex) {
        System.out.println("Error: Unable to update the image.");
    }
} 

        
    }//GEN-LAST:event_UploadImageActionPerformed

    private void Admin_UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_UserNameActionPerformed

    private void quitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseClicked
        // TODO add your handling code here:
        int Y = JOptionPane.showConfirmDialog(this,"Do you want to logout now?","Logout",JOptionPane.YES_NO_OPTION);
        if (Y==0){
            new LogSign().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_quitMouseClicked

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
            java.util.logging.Logger.getLogger(AdminDashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  String adminName = null;
                ImageIcon adminImage = null;
                new AdminDashFrame(adminName, adminImage).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin;
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JLabel AdminPic;
    private javax.swing.JButton Admin_Menu;
    private javax.swing.JButton Admin_Message;
    private javax.swing.JButton Admin_Orders;
    private javax.swing.JButton Admin_Sales;
    private javax.swing.JTextField Admin_UserName;
    private javax.swing.JButton Admin_Users;
    private javax.swing.JButton UploadImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel quit;
    // End of variables declaration//GEN-END:variables
}
