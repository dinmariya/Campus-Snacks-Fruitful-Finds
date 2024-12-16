
package user;


import CONNECTOR.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class UserMessage extends javax.swing.JFrame {
    private String fname, contact, bdate, mail, address,username,password,userName, email;
    private int userId;
    private ImageIcon usersImage;

    public UserMessage(String fname, String contact, String bdate, String mail, String address, String username, String password, String userName,ImageIcon usersImage, String email) {
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
 
        populateUserComboBox();
        refreshMessages();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  private void populateUserComboBox() {
        try (Connection con = new DBconnect().connect()) {
            String query = "SELECT adminName FROM adminEntry"; // Ensure Admin table has the 'Username' column
            try (PreparedStatement ps = con.prepareStatement(query); ResultSet rs = ps.executeQuery()) {
                userComboBox.removeAllItems(); // Clear existing items
                while (rs.next()) {
                    userComboBox.addItem(rs.getString("adminName")); // Add each admin username
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading admin usernames: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Picture = new javax.swing.JLabel();
        Signup_Back = new javax.swing.JButton();
        sendMessage = new javax.swing.JButton();
        userComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ConversationLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(29, 126, 55)));

        Picture.setFont(new java.awt.Font("Javanese Text", 1, 36)); // NOI18N
        Picture.setForeground(new java.awt.Color(29, 126, 55));
        Picture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Picture.setText("Message");
        Picture.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Picture.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Picture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        sendMessage.setBackground(new java.awt.Color(37, 248, 175));
        sendMessage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sendMessage.setText("Send");
        sendMessage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageActionPerformed(evt);
            }
        });

        userComboBox.setBackground(new java.awt.Color(204, 204, 255));
        userComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Admin" }));
        userComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(54, 142, 232), new java.awt.Color(39, 157, 250), new java.awt.Color(39, 157, 250), new java.awt.Color(39, 157, 250)));
        userComboBox.setName("Select User"); // NOI18N
        userComboBox.setPreferredSize(new java.awt.Dimension(102, 102));
        userComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userComboBoxActionPerformed(evt);
            }
        });

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

        jScrollPane2.setPreferredSize(new java.awt.Dimension(500, 500));

        ConversationLabel.setBackground(new java.awt.Color(0, 0, 0));
        ConversationLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ConversationLabel.setToolTipText("");
        ConversationLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(17, 122, 65)));
        jScrollPane2.setViewportView(ConversationLabel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Signup_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendMessage)
                    .addComponent(Signup_Back))
                .addGap(20, 20, 20))
        );

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
    String selectedAdmin = (String) userComboBox.getSelectedItem();
         String message = messageTextArea.getText();
        if (selectedAdmin != null && !message.isEmpty()) {
            try (Connection con = new DBconnect().connect()) {
                String query = "INSERT INTO messages (sender_name, receiver_name, messageFromUsers, timestamp) " +
                               "VALUES (?, ?, ?, datetime('now'))";
                try (PreparedStatement ps = con.prepareStatement(query)) {
                    ps.setString(1, fname); // Replace with logged-in user's name if dynamic
                    ps.setString(2, selectedAdmin);
                    ps.setString(3, message);
                    ps.executeUpdate();
                }
                messageTextArea.setText("");
                refreshMessages();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error sending message: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a recipient and enter a message.");
        }
    }

    private void refreshMessages() {
    try (Connection con = new DBconnect().connect()) {
        // Updated query to include timestamp
        String query = "SELECT sender_name, messageFromUsers, messageFromAdmin, timestamp " +
                       "FROM messages WHERE receiver_name = ? OR sender_name = ? " +
                       "ORDER BY timestamp ASC"; // Show in chronological order

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, fname); // Logged-in user's name
            ps.setString(2, fname);
            try (ResultSet rs = ps.executeQuery()) {
                StringBuilder conversation = new StringBuilder("<html>"); // Use HTML formatting
                while (rs.next()) {
                    String sender = rs.getString("sender_name");
                    String userMessage = rs.getString("messageFromUsers");
                    String adminMessage = rs.getString("messageFromAdmin");
                    String timestamp = rs.getString("timestamp"); // Fetch timestamp

                    // Format timestamp (customize this format as needed)
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

// Method to format the timestamp (if necessary)
private String formatTimestamp(String timestamp) {
    // Example: Convert "2024-12-08 14:23:45" to "MM/dd/yyyy HH:mm:ss"
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
        UserProf prof = new UserProf(fname, contact, bdate, mail, address,username,password,userName,usersImage, email);
        prof.setVisible(true);
        this.dispose();        // TODO add your handling code here:

    }//GEN-LAST:event_Signup_BackActionPerformed

    private void userComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userComboBoxActionPerformed

    private void messageTextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messageTextAreaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextAreaMouseClicked
     
    
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
            java.util.logging.Logger.getLogger(UserMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                String email = null;
                
                new UserMessage(fname, contact, bdate, mail, address,username,password,userName,usersImage, email).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConversationLabel;
    private javax.swing.JLabel Picture;
    private javax.swing.JButton Signup_Back;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JButton sendMessage;
    private javax.swing.JComboBox<String> userComboBox;
    // End of variables declaration//GEN-END:variables
}