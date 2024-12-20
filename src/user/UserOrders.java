
package user;

import javax.swing.JOptionPane;
import CONNECTOR.DBconnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.sql.Connection;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;





/**
 *
 * @author rachel
 */
public class UserOrders extends javax.swing.JFrame {
 private String fname, contact, bdate, mail, address,username,password,userName, email;
    private int userId;
    private ImageIcon usersImage;

    public UserOrders(String fname, String contact, String bdate, String mail, String address, String username, String password, String userName,ImageIcon usersImage, String email) {
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
  
       
        loadUserOrders();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        UserMenu = new javax.swing.JLabel();
        Signup_Back = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        myordersTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(29, 126, 55)));

        UserMenu.setFont(new java.awt.Font("Javanese Text", 1, 36)); // NOI18N
        UserMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserMenu.setText("My Orders");
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

        Remove.setBackground(new java.awt.Color(255, 204, 204));
        Remove.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Remove.setText("REMOVE");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        Refresh.setBackground(new java.awt.Color(255, 204, 204));
        Refresh.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        myordersTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(myordersTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Signup_Back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UserMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Refresh)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Remove)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Signup_Back)
                            .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void Signup_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signup_BackActionPerformed
        // TODO add your handling code here:
    UserProf prof = new UserProf(fname, contact, bdate, mail, address,username,password,userName,usersImage, email);   
    prof.setVisible(true);

    this.dispose();

    }//GEN-LAST:event_Signup_BackActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
                                  
    int selectedRow = myordersTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Please select an item to reduce its quantity.");
        return;
    }

    // Correct column indices (check if column 1 is productName and column 3 is quantity)
    String productName = (String) myordersTable.getValueAt(selectedRow, 4);  // Assuming product name is in column 4
    int currentQuantity = (int) myordersTable.getValueAt(selectedRow, 6);    // Assuming quantity is in column 6

    if (currentQuantity > 1) {
        try (Connection connection = DBconnect.connect()) {
            String updateSQL = "UPDATE userOrders SET quantity = quantity - 1 WHERE productName = ?";
            try (PreparedStatement stmt = connection.prepareStatement(updateSQL)) {
                stmt.setString(1, productName);
                stmt.executeUpdate();
            }

            // Update the table cell with the new quantity
            myordersTable.setValueAt(currentQuantity - 1, selectedRow, 6);
            JOptionPane.showMessageDialog(null, "Reduced quantity of " + productName + " by 1.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error reducing quantity: " + e.getMessage());
        }
    } else {
        try (Connection connection = DBconnect.connect()) {
            // Delete the item from the cart when quantity is 1
            String deleteSQL = "DELETE FROM userOrders WHERE productName = ?";
            try (PreparedStatement stmt = connection.prepareStatement(deleteSQL)) {
                stmt.setString(1, productName);
                stmt.executeUpdate();
            }

            // Remove the row from the table
            DefaultTableModel model = (DefaultTableModel) myordersTable.getModel();
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(null, productName + " has been removed from the cart.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error deleting item: " + e.getMessage());
        }}
    }//GEN-LAST:event_RemoveActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        loadUserOrders();
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
            java.util.logging.Logger.getLogger(UserOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                String email = null;
                
                new UserOrders(fname, contact, bdate, mail, address,username,password,userName,usersImage, email).setVisible(true);
            }
        });
    }
    private void loadUserOrders() {
    myordersTable.setModel(new DefaultTableModel(
        new Object[][]{},
        new String[]{"Order ID", "Full Name", "Address", "Image", "Product Name", "Price", "Quantity", "Order Date", "Order Status"}
    ));

    DefaultTableModel model = (DefaultTableModel) myordersTable.getModel();
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

    myordersTable.setRowHeight(60); // Default row height

    // Custom renderer to autofit the image in the cell
    myordersTable.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer() {
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
        myordersTable.getTableHeader().resizeAndRepaint();
        myordersTable.updateUI();
    });
}

private void adjustColumnWidths() {
    // Ensure auto-resize mode is off
    myordersTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

    // Loop through all columns to adjust their widths
    for (int column = 0; column < myordersTable.getColumnCount(); column++) {
        int maxWidth = 0;
        
        // Calculate header width
        TableColumn tableColumn = myordersTable.getColumnModel().getColumn(column);
        TableCellRenderer headerRenderer = myordersTable.getTableHeader().getDefaultRenderer();
        Component headerComponent = headerRenderer.getTableCellRendererComponent(
            myordersTable, tableColumn.getHeaderValue(), false, false, 0, column);
        maxWidth = Math.max(maxWidth, headerComponent.getPreferredSize().width);

        // Calculate content width
        for (int row = 0; row < myordersTable.getRowCount(); row++) {
            TableCellRenderer cellRenderer = myordersTable.getCellRenderer(row, column);
            Component cellComponent = myordersTable.prepareRenderer(cellRenderer, row, column);
            maxWidth = Math.max(maxWidth, cellComponent.getPreferredSize().width);
        }

        // Add some padding to the column width
        tableColumn.setPreferredWidth(maxWidth + 10);  // Add 10 for padding
    }

    // Refresh the table and header layout
    myordersTable.getTableHeader().resizeAndRepaint();
    myordersTable.revalidate();
    myordersTable.repaint();
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Remove;
    private javax.swing.JButton Signup_Back;
    private javax.swing.JLabel UserMenu;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable myordersTable;
    // End of variables declaration//GEN-END:variables
}
