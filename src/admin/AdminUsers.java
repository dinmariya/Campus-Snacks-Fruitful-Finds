
package admin;

import CONNECTOR.DBconnect;
import java.awt.FontMetrics;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class AdminUsers extends javax.swing.JFrame {
    private String adminName, adID,adpass,adname, adpassword;
    private ImageIcon adminImage;
    
    private DefaultTableModel tableModel;
    Connection con = null;
   
 

    public AdminUsers(String adminName, ImageIcon adminImage) {
        initComponents();
        this.adminName = adminName;  
        this.adminImage = adminImage;
        tableModel = (DefaultTableModel) love.getModel();
        // Loads the table with users from the database
        loadUserData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        UserMenu = new javax.swing.JLabel();
        Signup_Back = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Delete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        love = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 102));

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(29, 126, 55)));

        UserMenu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UserMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserMenu.setText("User Management");
        UserMenu.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UserMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UserMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Signup_Back.setBackground(new java.awt.Color(73, 73, 73));
        Signup_Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Signup_Back.setForeground(new java.awt.Color(235, 235, 235));
        Signup_Back.setText("<");
        Signup_Back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Signup_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Signup_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Signup_BackActionPerformed(evt);
            }
        });

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Signup_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(Refresh)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Signup_Back)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UserMenu)
                        .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jLabel2))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 51));
        jPanel2.setLayout(null);

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete);
        Delete.setBounds(340, 20, 72, 20);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 430, 61));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(null);

        jPanel4.setPreferredSize(new java.awt.Dimension(800, 800));

        love.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        love.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(love);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 205, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel4);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 390, 440);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 430, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Signup_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signup_BackActionPerformed
        // TODO add your handling code here:
    AdminDashFrame adminframe = new AdminDashFrame(adminName, adminImage);   
    adminframe.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_Signup_BackActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try{ 
        DefaultTableModel tableModel = (DefaultTableModel) love.getModel();
        int selectedRow = love.getSelectedRow();
        System.out.println("Selected row in view: " + selectedRow);
        
        if (selectedRow != -1) {
            int modelRow = love.convertRowIndexToModel(selectedRow); // Map view index to model
            System.out.println("Converted row in model: " + modelRow);
            System.out.println("Model row count: " + tableModel.getRowCount());

            if (modelRow >= 0 && modelRow < tableModel.getRowCount()) {
                Object value = tableModel.getValueAt(modelRow, 0);
                if (value instanceof Integer) {
                    int userId = (Integer) value;
                    deleteUser(userId); // Delete user
                    tableModel.removeRow(modelRow); // Remove from model
                    JOptionPane.showMessageDialog(null, "User deleted successfully.");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid ID format.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selected row is out of bounds.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }

    }//GEN-LAST:event_DeleteActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        refreshTable();
    }//GEN-LAST:event_RefreshActionPerformed

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
            java.util.logging.Logger.getLogger(AdminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                String adminName=null; 
                ImageIcon adminImage=null;
                new AdminUsers(adminName, adminImage).setVisible(true);
            }
        });
    }
    
    private void loadUserData() {
    con = DBconnect.connect();
    try{
        String query = "SELECT ID, FullName, Num, Birthday, Email FROM userInfo";  // Replace with your actual table and column names
        PreparedStatement statement = con.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        // DefaultTableModel to manage the table's data
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("User_ID");
        model.addColumn("Full Name");
        model.addColumn("Num");
        model.addColumn("Birthday");
        model.addColumn("Email");

        // Iterate through the result set and populate the table model
        while (resultSet.next()) {
            int userId = resultSet.getInt("ID");
            String name = resultSet.getString("FullName");
            String no = resultSet.getString("Num");
            String bday = resultSet.getString("Birthday");
            String email = resultSet.getString("Email");

            model.addRow(new Object[]{userId, name, no, bday, email});
        }
        love.setModel(model);
        autofitColumns();

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading user data from database.", "Error", JOptionPane.ERROR_MESSAGE);
}
}
   private void autofitColumns() {
    FontMetrics metrics = love.getFontMetrics(love.getFont());

    for (int column = 0; column < love.getColumnCount(); column++) {
        int width = 0;

        // Include the header width
        String columnName = love.getColumnName(column);
        width = Math.max(width, metrics.stringWidth(columnName) + 10); // Add padding

        // Include the content width
        for (int row = 0; row < love.getRowCount(); row++) {
            Object value = love.getValueAt(row, column);
            if (value != null) {
                width = Math.max(width, metrics.stringWidth(value.toString()) + 10); // Add padding
            }
        }

        // Set the column width
        love.getColumnModel().getColumn(column).setPreferredWidth(width);
    }
}
    
    private void refreshTable() {
        tableModel.setRowCount(0);

        try {
            con = DBconnect.connect();

            String query = "SELECT ID, FullName, Num, Birthday, Email FROM userInfo";  // Adjust column names as per your table structure
            try (PreparedStatement statement = con.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {

                // Loop through the result set and add rows to the JTable
                while (resultSet.next()) {
                    int userId = resultSet.getInt("ID");
                    String name = resultSet.getString("FullName");
                    String no = resultSet.getString("Num");
                    String bday = resultSet.getString("Birthday");
                    String email = resultSet.getString("Email"); // Assuming "role" is the user role column

                    // Add a new row to the table
                    tableModel.addRow(new Object[]{userId, name, no, bday, email});
                }
                autofitColumns();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching users: " + ex.getMessage());
        }
    }
     private void deleteUser(int userId) {
        try (Connection con = DBconnect.connect()) { // Use try-with-resources for auto-closing
        String query = "DELETE FROM userInfo WHERE ID = ?";
        try (PreparedStatement statement = con.prepareStatement(query)) {
            statement.setInt(1, userId);
            int result = statement.executeUpdate(); // Execute the delete query
            
            if (result > 0) {
                refreshTable(); // Refresh table to reflect changes
            } else {
                JOptionPane.showMessageDialog(null, "User not found.");
            }}
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error deleting user: " + ex.getMessage());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Signup_Back;
    private javax.swing.JLabel UserMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable love;
    // End of variables declaration//GEN-END:variables
}
