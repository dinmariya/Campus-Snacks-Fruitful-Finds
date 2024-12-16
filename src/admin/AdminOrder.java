
package admin;


import CONNECTOR.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.sql.SQLException;



public class AdminOrder extends javax.swing.JFrame {
    private String adminName, adID,adpass,adname, adpassword;
    private ImageIcon adminImage;
    private int adid;

        PreparedStatement pst = null;
        ResultSet rs = null;
    
    public AdminOrder(String adminName, ImageIcon adminImage) {
        
        initComponents();
        this.adminName = adminName;  
        this.adminImage = adminImage;
         setupOrdersTable();
    
        loadAdminOrders();
        
        
        
}  private void setupOrdersTable() {
    ordersTable.setModel(new DefaultTableModel(
        new Object[][]{},
        new String[]{"Order ID", "Full Name", "Address", "Image", "Product Name", "Price", "Quantity", "Order Date", "Order Status"}
    ));

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        or = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        UserMenu = new javax.swing.JLabel();
        Signup_Back = new javax.swing.JButton();
        Decline = new javax.swing.JButton();
        accept = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ordersTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        or.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(29, 126, 55)));

        UserMenu.setFont(new java.awt.Font("Javanese Text", 1, 36)); // NOI18N
        UserMenu.setForeground(new java.awt.Color(29, 126, 55));
        UserMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserMenu.setText("Orders");
        UserMenu.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UserMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UserMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Signup_Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Signup_Back.setText("<");
        Signup_Back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Signup_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Signup_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Signup_BackActionPerformed(evt);
            }
        });

        Decline.setBackground(new java.awt.Color(246, 39, 39));
        Decline.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        Decline.setForeground(new java.awt.Color(255, 255, 255));
        Decline.setText("Decline");
        Decline.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(245, 251, 252), new java.awt.Color(243, 251, 252), new java.awt.Color(243, 249, 249), new java.awt.Color(242, 250, 250)));
        Decline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeclineActionPerformed(evt);
            }
        });

        accept.setBackground(new java.awt.Color(233, 243, 249));
        accept.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        accept.setText("Accept");
        accept.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(245, 251, 252), new java.awt.Color(243, 251, 252), new java.awt.Color(243, 249, 249), new java.awt.Color(242, 250, 250)));
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        ordersTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(ordersTable);

        javax.swing.GroupLayout orLayout = new javax.swing.GroupLayout(or);
        or.setLayout(orLayout);
        orLayout.setHorizontalGroup(
            orLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(orLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orLayout.createSequentialGroup()
                        .addComponent(Signup_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(orLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Decline, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                        .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(orLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        orLayout.setVerticalGroup(
            orLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orLayout.createSequentialGroup()
                .addGroup(orLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(orLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Signup_Back)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Decline)
                    .addComponent(accept))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(or, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(or, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Signup_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signup_BackActionPerformed
    
        AdminDashFrame adminframe = new AdminDashFrame(adminName, adminImage);   
    adminframe.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_Signup_BackActionPerformed

    private void DeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeclineActionPerformed
        int selectedRow = ordersTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an order to decline.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int orderId = (int) ordersTable.getValueAt(selectedRow, 0); // Get the order ID from the selected row

    try (Connection conn = DBconnect.connect();
         PreparedStatement updateStmt = conn.prepareStatement("UPDATE userOrders SET Order_Status = 'DECLINED' WHERE order_id = ?")) {

        // Update Order_Status to "DECLINED"
        updateStmt.setInt(1, orderId);
        int rowsUpdated = updateStmt.executeUpdate();

        if (rowsUpdated > 0) {
            // If status updated successfully, remove the row from the table
            DefaultTableModel model = (DefaultTableModel) ordersTable.getModel();
            model.removeRow(selectedRow); // Remove the selected row from the JTable

            JOptionPane.showMessageDialog(this, "Order declined.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update order status.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating order: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_DeclineActionPerformed

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        int selectedRow = ordersTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an order to accept.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int orderId = (int) ordersTable.getValueAt(selectedRow, 0); // Get the order ID from the selected row

    try (Connection conn = DBconnect.connect();
         PreparedStatement updateStmt = conn.prepareStatement("UPDATE userOrders SET Order_Status = 'ACCEPTED' WHERE order_id = ?")) {

        // Update Order_Status to "ACCEPTED"
        updateStmt.setInt(1, orderId);
        int rowsUpdated = updateStmt.executeUpdate();

        if (rowsUpdated > 0) {
            // If status updated successfully, remove the row from the table
            DefaultTableModel model = (DefaultTableModel) ordersTable.getModel();
            model.removeRow(selectedRow); // Remove the selected row from the JTable

            JOptionPane.showMessageDialog(this, "Order accepted.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update order status.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating order: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
             
    }//GEN-LAST:event_acceptActionPerformed

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
            java.util.logging.Logger.getLogger(AdminOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AdminOrder( adminName, adminImage).setVisible(true);
            }
        });
    }
    
    
private void loadAdminOrders() {
    ordersTable.setModel(new DefaultTableModel(
        new Object[][]{},
         new String[]{"Order ID", "Full Name", "Address", "Image", "Product Name", "Price", "Quantity", "Order Date", "Order Status"}
    ));

     DefaultTableModel model = (DefaultTableModel) ordersTable.getModel();
    model.setRowCount(0);

    try (java.sql.Connection connection = DBconnect.connect()) {
        if (connection == null || connection.isClosed()) {
            System.out.println("Database connection failed.");
            return;
        }
        String query = """
            SELECT 
                o.order_id, 
                cd.full_name, 
                cd.address, 
                o.productImage, 
                o.productName, 
                o.productPrice, 
                o.quantity, 
                o.orderDate,
                o.Order_Status  -- Add Order_Status here
            FROM userOrders o 
            INNER JOIN checkout_details cd 
                ON o.checkID = cd.checkout_id 
            ORDER BY o.orderDate DESC
        """;

        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            if (!rs.isBeforeFirst()) {
                System.out.println("No orders found in the database.");
                return;
            }

            while (rs.next()) {
                int orderId = rs.getInt("order_id");
                String fullName = rs.getString("full_name");
                String address = rs.getString("address");
                String productName = rs.getString("productName");
                double productPrice = rs.getDouble("productPrice");
                int quantity = rs.getInt("quantity");
                String orderDate = rs.getString("orderDate");
                String orderStatus = rs.getString("Order_Status");  // Retrieve Order_Status

                ImageIcon productImage = null;
                try {
                    byte[] imageBytes = rs.getBytes("productImage");
                    if (imageBytes != null && imageBytes.length > 0) {
                        BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(imageBytes));
                        if (bufferedImage != null) {
                            productImage = new ImageIcon(bufferedImage);
                        }
                    }
                } catch (Exception e) {
                    System.err.println("Image processing failed for Order ID: " + orderId);
                    e.printStackTrace();
                }

                // Add the data to the table, including the Order_Status
                model.addRow(new Object[]{orderId, fullName, address, productImage, productName, productPrice, quantity, orderDate, orderStatus});
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }


    ordersTable.setRowHeight(60); // Default row height

    // Custom renderer to autofit the image in the cell
    ordersTable.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof ImageIcon) {
                ImageIcon originalIcon = (ImageIcon) value;
                int rowHeight = table.getRowHeight();
                int columnWidth = table.getColumnModel().getColumn(column).getWidth();

                // Scale the image to fit the cell
                Image scaledImage = originalIcon.getImage().getScaledInstance(columnWidth, rowHeight, Image.SCALE_SMOOTH);
                JLabel label = new JLabel(new ImageIcon(scaledImage));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                return label;
            }
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    });
    adjustColumnWidths();

    SwingUtilities.invokeLater(() -> {
        ordersTable.getTableHeader().resizeAndRepaint();
        ordersTable.updateUI();
    });
}

private void adjustColumnWidths() {
    // Ensure auto-resize mode is off
    ordersTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

    // Loop through all columns to adjust their widths
    for (int column = 0; column < ordersTable.getColumnCount(); column++) {
        int headerWidth = 0;
        int contentWidth = 0;

        // Calculate header width
        TableColumn tableColumn = ordersTable.getColumnModel().getColumn(column);
        TableCellRenderer headerRenderer = ordersTable.getTableHeader().getDefaultRenderer();
        Component headerComponent = headerRenderer.getTableCellRendererComponent(
            ordersTable, tableColumn.getHeaderValue(), false, false, 0, column);
        headerWidth = headerComponent.getPreferredSize().width + 10;

        // Calculate content width
        for (int row = 0; row < ordersTable.getRowCount(); row++) {
            TableCellRenderer cellRenderer = ordersTable.getCellRenderer(row, column);
            Component cellComponent = ordersTable.prepareRenderer(cellRenderer, row, column);
            contentWidth = Math.max(cellComponent.getPreferredSize().width + 10, contentWidth);
        }

        // Set the column width to the maximum of header and content widths
        int preferredWidth = Math.max(headerWidth, contentWidth);
        tableColumn.setPreferredWidth(preferredWidth);
    }

    // Refresh the table and header layout
    ordersTable.getTableHeader().resizeAndRepaint();
    ordersTable.revalidate();
    ordersTable.repaint();
}
private void updateOrderStatus(String newStatus) {
    int selectedRow = ordersTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an order to update.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int orderId = (int) ordersTable.getValueAt(selectedRow, 0); // Get the order ID of the selected row

    try (Connection conn = DBconnect.connect();
         PreparedStatement updateStmt = conn.prepareStatement("UPDATE userOrders SET Order_Status = ? WHERE order_id = ?");
         PreparedStatement deleteStmt = conn.prepareStatement("DELETE FROM userOrders WHERE order_id = ?")) {

        // Update the Order_Status
        updateStmt.setString(1, newStatus);
        updateStmt.setInt(2, orderId);
        int rowsUpdated = updateStmt.executeUpdate();

        if (rowsUpdated > 0) {
            // If the status is updated, delete the row
            deleteStmt.setInt(1, orderId);
            int rowsDeleted = deleteStmt.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Order status updated to " + newStatus + " and order removed.", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadAdminOrders(); // Refresh table data
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete the order after status update.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update order status.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating order: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

// Adding button listeners for Accept and Decline buttons




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Decline;
    private javax.swing.JButton Signup_Back;
    private javax.swing.JLabel UserMenu;
    private javax.swing.JButton accept;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel or;
    private javax.swing.JTable ordersTable;
    // End of variables declaration//GEN-END:variables
}
