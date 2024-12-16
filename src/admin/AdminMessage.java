
package admin;

import CONNECTOR.DBconnect;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class AdminMessage extends javax.swing.JFrame {
private String adminName;
private ImageIcon adminImage;

   // Declare components

    public AdminMessage(String adminName, ImageIcon adminImage) {
        this(adminName);
           this.adminImage = adminImage;
    }

    public AdminMessage(String adminName) {
        initComponents();
        this.adminName = adminName;
     
     
        populateUserComboBox();
        refreshMessages();
    }
  
    @SuppressWarnings("unchecked")
    
    private void populateUserComboBox() {
        try (Connection con = new DBconnect().connect()) {
            String query = "SELECT FullName FROM userInfo"; // Ensure Admin table has the 'Username' column
            try (PreparedStatement ps = con.prepareStatement(query); ResultSet rs = ps.executeQuery()) {
                adminComboBox.removeAllItems(); // Clear existing items
                while (rs.next()) {
                    adminComboBox.addItem(rs.getString("FullName")); // Add each admin username
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading fullname usernames: " + e.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Picture = new javax.swing.JLabel();
        Signup_Back = new javax.swing.JButton();
        adminComboBox = new javax.swing.JComboBox<>();
        sendMessage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ConversationLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 575));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(29, 126, 55)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 61, 388, -1));

        Picture.setFont(new java.awt.Font("Javanese Text", 1, 36)); // NOI18N
        Picture.setForeground(new java.awt.Color(29, 126, 55));
        Picture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Picture.setText("Message");
        Picture.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Picture.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Picture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 167, 55));

        Signup_Back.setBackground(new java.awt.Color(73, 73, 73));
        Signup_Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Signup_Back.setForeground(new java.awt.Color(235, 235, 235));
        Signup_Back.setText("Back");
        Signup_Back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Signup_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Signup_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Signup_BackActionPerformed(evt);
            }
        });
        jPanel1.add(Signup_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 50, -1));

        adminComboBox.setBackground(new java.awt.Color(204, 204, 255));
        adminComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adminComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User" }));
        adminComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(54, 142, 232), new java.awt.Color(39, 157, 250), new java.awt.Color(39, 157, 250), new java.awt.Color(39, 157, 250)));
        adminComboBox.setName("Select User"); // NOI18N
        adminComboBox.setPreferredSize(new java.awt.Dimension(102, 102));
        adminComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(adminComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 69, 208, 25));

        sendMessage.setBackground(new java.awt.Color(37, 248, 175));
        sendMessage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sendMessage.setText("Send");
        sendMessage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageActionPerformed(evt);
            }
        });
        jPanel1.add(sendMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 57, -1));

        messageTextArea.setColumns(20);
        messageTextArea.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        messageTextArea.setRows(5);
        messageTextArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(248, 248, 248)));
        messageTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                messageTextAreaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(messageTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 367, 140));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(500, 500));

        ConversationLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConversationLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ConversationLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(16, 115, 45)));
        jScrollPane2.setViewportView(ConversationLabel);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 370, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageActionPerformed
      String selectedUser = (String) adminComboBox.getSelectedItem();
        String message = messageTextArea.getText();
        if (selectedUser != null && !message.isEmpty()) {
            try (Connection con = new DBconnect().connect()) {
                String query = "INSERT INTO messages (sender_name, receiver_name, messageFromAdmin, timestamp) " +
                               "VALUES (?, ?, ?, datetime('now'))";
                try (PreparedStatement ps = con.prepareStatement(query)) {
                    ps.setString(1, adminName); // Replace with logged-in admin's name
                    ps.setString(2, selectedUser);
                    ps.setString(3, message);
                    ps.executeUpdate();
                }
                messageTextArea.setText("");
                refreshMessages();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error sending message: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a user and enter a message.");
        }
    }

    private void refreshMessages() {
    try (Connection con = new DBconnect().connect()) {
        // Updated query to include timestamp
        String query = "SELECT sender_name, messageFromUsers, messageFromAdmin, timestamp " +
                       "FROM messages WHERE receiver_name = ? OR sender_name = ? " +
                       "ORDER BY timestamp ASC"; // Show in chronological order

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, adminName); // Logged-in admin's name
            ps.setString(2, adminName);
            try (ResultSet rs = ps.executeQuery()) {
                StringBuilder conversation = new StringBuilder("<html>"); // Use HTML formatting
                while (rs.next()) {
                    String sender = rs.getString("sender_name");
                    String userMessage = rs.getString("messageFromUsers");
                    String adminMessage = rs.getString("messageFromAdmin");
                    String timestamp = rs.getString("timestamp"); // Fetch timestamp

                    // Format timestamp (you can customize this format)
                    String formattedTimestamp = formatTimestamp(timestamp);

                    // Append user messages to the conversation
                    if (userMessage != null && !userMessage.trim().isEmpty()) {
                        conversation.append("<b>").append(sender).append(":</b> ").append(userMessage)
                                    .append(" <i>(").append(formattedTimestamp).append(")</i><br>");
                    }
                    // Append admin messages to the conversation
                    if (adminMessage != null && !adminMessage.trim().isEmpty()) {
                        conversation.append("<b>").append(sender).append(":</b> ").append(adminMessage)
                                    .append(" <i>(").append(formattedTimestamp).append(")</i><br>");
                    }
                }
                conversation.append("</html>");
                ConversationLabel.setText(conversation.toString()); // Update label text
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error refreshing messages: " + e.getMessage());
    }
}

// Method to format the timestamp as you prefer (example: "2024-12-08 14:23:45")
private String formatTimestamp(String timestamp) {
    // Example: You can format it to show "MM/dd/yyyy HH:mm:ss"
    // You can customize this format as needed.
    try {
        SimpleDateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat targetFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = originalFormat.parse(timestamp);
        return targetFormat.format(date);
    } catch (ParseException e) {
        e.printStackTrace();
        return timestamp; // Return original timestamp if parsing fails
    }


    
    }//GEN-LAST:event_sendMessageActionPerformed

    private void Signup_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signup_BackActionPerformed
       
        AdminDashFrame adminframe = new AdminDashFrame(adminName, adminImage);
        adminframe.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Signup_BackActionPerformed

    private void messageTextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messageTextAreaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextAreaMouseClicked

    private void adminComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminComboBoxActionPerformed
      
    
    
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
            java.util.logging.Logger.getLogger(AdminMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                
                String adminName = null;
                ImageIcon adminImage = null;
            new AdminMessage(adminName,adminImage).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConversationLabel;
    private javax.swing.JLabel Picture;
    private javax.swing.JButton Signup_Back;
    private javax.swing.JComboBox<String> adminComboBox;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JButton sendMessage;
    // End of variables declaration//GEN-END:variables
}
