
package admin;


import CONNECTOR.DBconnect;
import java.awt.Component;
import java.awt.Graphics2D;
import java.sql.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;


public class AdminMenu extends javax.swing.JFrame {
    private String adminName, adID,adpass,adname, adpassword;
    private ImageIcon adminImage;
   

    private TableCellRenderer centerRenderer;
    

    
    public AdminMenu(String adminName, ImageIcon adminImage) {
        initComponents();
          this.adminName = adminName;  
        this.adminImage=  adminImage;
        allData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Menu_Back = new javax.swing.JButton();
        products = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        drinks = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ADD = new javax.swing.JButton();
        pastry = new javax.swing.JButton();
        all = new javax.swing.JButton();
        fruits = new javax.swing.JButton();
        chips = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(430, 581));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu_Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Menu_Back.setText("<");
        Menu_Back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Menu_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menu_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_BackActionPerformed(evt);
            }
        });
        jPanel1.add(Menu_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 29, -1));

        products.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        products.setText("Products");
        jPanel1.add(products, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, 33));

        Delete.setBackground(new java.awt.Color(255, 204, 204));
        Delete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Delete.setText("CLICK TO REMOVE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        drinks.setBackground(new java.awt.Color(255, 204, 204));
        drinks.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        drinks.setText("DRINKS");
        drinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinksActionPerformed(evt);
            }
        });
        jPanel1.add(drinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 90, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(29, 126, 55)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 45, 420, -1));

        ADD.setBackground(new java.awt.Color(255, 204, 204));
        ADD.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 70, -1));

        pastry.setBackground(new java.awt.Color(255, 204, 204));
        pastry.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pastry.setText("PASTRY");
        pastry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastryActionPerformed(evt);
            }
        });
        jPanel1.add(pastry, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 90, -1));

        all.setBackground(new java.awt.Color(255, 204, 204));
        all.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        all.setText("ALL");
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });
        jPanel1.add(all, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, -1));

        fruits.setBackground(new java.awt.Color(255, 204, 204));
        fruits.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fruits.setText("FRUITS");
        fruits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitsActionPerformed(evt);
            }
        });
        jPanel1.add(fruits, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        chips.setBackground(new java.awt.Color(255, 204, 204));
        chips.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chips.setText("CHIPS");
        chips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chipsActionPerformed(evt);
            }
        });
        jPanel1.add(chips, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 80, -1));

        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productsTable.setPreferredSize(new java.awt.Dimension(400, 10000));
        productsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(productsTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 410, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_BackActionPerformed
       
        AdminDashFrame adminframe = new AdminDashFrame(adminName,adminImage);
adminframe.setVisible(true);
this.dispose();
        
    }//GEN-LAST:event_Menu_BackActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
         int selectedRow = productsTable.getSelectedRow(); // Get the selected row
        if (selectedRow != -1) { // Check if a row is selected
            // Get values from all columns (assuming columns: productID, productName, price, stocks, image)
            String productIDStr = (String) productsTable.getValueAt(selectedRow, 4); // productID
            String productName = (String) productsTable.getValueAt(selectedRow, 1);   // productName
            String priceStr = (String) productsTable.getValueAt(selectedRow, 2);       // price
            String stocksStr = (String) productsTable.getValueAt(selectedRow, 3);      // stocks
            ImageIcon productImage = (ImageIcon) productsTable.getValueAt(selectedRow, 0); // image

            try {
                // Convert productID, price, and stocks to appropriate data types
                int productID = Integer.parseInt(productIDStr);
                double price = Double.parseDouble(priceStr); // Assuming price is a double
                int stocks = Integer.parseInt(stocksStr);

                // Connect to the database and prepare the DELETE query
                Connection conn = DBconnect.connect();
                String query = "DELETE FROM products WHERE productID = ?";

                try (PreparedStatement pst = conn.prepareStatement(query)) {
                    pst.setInt(1, productID); // Set the product ID to delete
                    int result = pst.executeUpdate();

                    if (result > 0) {
                        // If the deletion is successful, remove the row from JTable
                        ((DefaultTableModel) productsTable.getModel()).removeRow(selectedRow);
                        JOptionPane.showMessageDialog(null, "Product deleted successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error deleting product.");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                } finally {
                    try {
                        if (conn != null) conn.close(); // Close the connection
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            } catch (NumberFormatException ex) {
                // If parsing fails, show an error message
                JOptionPane.showMessageDialog(null, "Invalid Product ID, price, or stocks.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void drinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinksActionPerformed
        drinksData();
    }//GEN-LAST:event_drinksActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
       AddMenu add = new AddMenu(adminName, adminImage);
       add.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ADDActionPerformed

    private void pastryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastryActionPerformed
        pastryData();
    }//GEN-LAST:event_pastryActionPerformed

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        allData();
    }//GEN-LAST:event_allActionPerformed

    private void fruitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitsActionPerformed
        fruitsData();
    }//GEN-LAST:event_fruitsActionPerformed

    private void chipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsActionPerformed
        chipsData();
    }//GEN-LAST:event_chipsActionPerformed

    private void productsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsTableMouseClicked
     
    }//GEN-LAST:event_productsTableMouseClicked

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
             String adminName = null;
                ImageIcon adminImage = null;
                new AdminMenu(adminName, adminImage).setVisible(true);
            }
        });
    }
   private void allData() {
    try {
        try (Connection connection = DBconnect.connect()) {
            String query = "SELECT productImage, productName, price, stocks, productID FROM Products";
            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {

                DefaultTableModel tableModel = new DefaultTableModel();
                tableModel.addColumn("Image");
                tableModel.addColumn("Name");
                tableModel.addColumn("Price");
                tableModel.addColumn("Stocks");
                tableModel.addColumn("Product ID");

                while (resultSet.next()) {
                    String name = resultSet.getString("productName");
                    String price = resultSet.getString("price");
                    String stocks = resultSet.getString("stocks");
                    String productId = resultSet.getString("productID");

                    byte[] imageBytes = resultSet.getBytes("productImage");
                    ImageIcon imageIcon = null;
                    if (imageBytes != null) {
                        InputStream in = new ByteArrayInputStream(imageBytes);
                        BufferedImage bi = ImageIO.read(in);
                        Image resizedImage = bi.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
                        imageIcon = new ImageIcon(resizedImage);
                    }
                    tableModel.addRow(new Object[]{imageIcon, name, price, stocks, productId});
                }
                
               ((DefaultTableCellRenderer) productsTable.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
                for (int column = 0; column < productsTable.getColumnCount(); column++) {
            productsTable.getColumnModel().getColumn(column).setCellRenderer(centerRenderer);
               productsTable.setModel(tableModel); // Set table model

                productsTable.getColumnModel().getColumn(0).setCellRenderer(new TableCellRenderer() {
                    @Override
                    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                        JLabel label = new JLabel();
                        if (value instanceof ImageIcon) {
                            ImageIcon icon = (ImageIcon) value;
                            Image img = icon.getImage();

                            int cellWidth = table.getColumnModel().getColumn(column).getWidth();
                            int cellHeight = table.getRowHeight(row);

                            Image resizedImage = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
                            label.setIcon(new ImageIcon(resizedImage));
                            label.setText(null);
                        } else {
                            label.setIcon(null);
                            label.setText(value != null ? value.toString() : "");
                        }
                        return label;
                    }
                });

                productsTable.setRowHeight(100);

                } for (int column = 0; column < productsTable.getColumnCount(); column++) {
                    int maxWidth = 50; // Set a minimum width

                    TableCellRenderer headerRenderer = productsTable.getTableHeader().getDefaultRenderer();
                    Component headerComponent = headerRenderer.getTableCellRendererComponent(productsTable, productsTable.getColumnName(column), false, false, -1, column);
                    maxWidth = Math.max(maxWidth, headerComponent.getPreferredSize().width);

                    for (int row = 0; row < productsTable.getRowCount(); row++) {
                        TableCellRenderer cellRenderer = productsTable.getCellRenderer(row, column);
                        Component cellComponent = cellRenderer.getTableCellRendererComponent(productsTable, productsTable.getValueAt(row, column), false, false, row, column);
                        maxWidth = Math.max(maxWidth, cellComponent.getPreferredSize().width);
                    }

                    productsTable.getColumnModel().getColumn(column).setPreferredWidth(maxWidth + 10); // Add padding
                }
                productsTable.revalidate(); // Refresh table
                productsTable.repaint();   // Redraw table
            }
        }
    } catch (SQLException | IOException ex) {
        JOptionPane.showMessageDialog(null, "Error fetching data from database: " + ex.getMessage());
    }
}

 private void chipsData() {
   try {
    DefaultTableModel model = (DefaultTableModel) productsTable.getModel();
    model.setRowCount(0);

    Connection connection = DBconnect.connect();
    String query = "SELECT p.productImage, p.productName, p.price, p.stocks, p.productID " +
                   "FROM Products p JOIN Category c ON p.categoryID = c.categoryID " +
                   "WHERE c.categoryName = 'Chips'";
    PreparedStatement statement = connection.prepareStatement(query);
    ResultSet resultSet = statement.executeQuery();

    while (resultSet.next()) {
        String name = resultSet.getString("productName");
        String price = resultSet.getString("price");
        String stocks = resultSet.getString("stocks");
        String productId = resultSet.getString("productID");
        
        byte[] imageBytes = resultSet.getBytes("productImage");
        ImageIcon imageIcon = null;

        if (imageBytes != null) {
            InputStream in = new ByteArrayInputStream(imageBytes);
            BufferedImage bufferedImage = ImageIO.read(in);
            Image scaledImage = bufferedImage.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(scaledImage);
        }
        model.addRow(new Object[]{imageIcon, name, price, stocks, productId});
    }

    for (int column = 0; column < productsTable.getColumnCount(); column++) {
        TableColumn tableColumn = productsTable.getColumnModel().getColumn(column);
        int preferredWidth = 100, maxWidth = 300;

        TableCellRenderer headerRenderer = productsTable.getTableHeader().getDefaultRenderer();
        Component headerComponent = headerRenderer.getTableCellRendererComponent(productsTable, tableColumn.getHeaderValue(), false, false, -1, column);
        preferredWidth = Math.max(preferredWidth, headerComponent.getPreferredSize().width);

        for (int row = 0; row < productsTable.getRowCount(); row++) {
            TableCellRenderer cellRenderer = productsTable.getCellRenderer(row, column);
            Component c = productsTable.prepareRenderer(cellRenderer, row, column);
            preferredWidth = Math.max(preferredWidth, c.getPreferredSize().width + 10);
            if (preferredWidth >= maxWidth) break;
        }
        tableColumn.setPreferredWidth(preferredWidth);
    }

    productsTable.setRowHeight(100);
    productsTable.revalidate();
    productsTable.repaint();
} catch (SQLException | IOException ex) {
    JOptionPane.showMessageDialog(null, "Error fetching data: " + ex.getMessage());
}}

    private void fruitsData(){
        try {
    DefaultTableModel model = (DefaultTableModel) productsTable.getModel();
    model.setRowCount(0);

    Connection connection = DBconnect.connect();
    String query = "SELECT p.productImage, p.productName, p.price, p.stocks, p.productID " +
                   "FROM Products p JOIN Category c ON p.categoryID = c.categoryID " +
                   "WHERE c.categoryName = 'Fruits'";
    PreparedStatement statement = connection.prepareStatement(query);
    ResultSet resultSet = statement.executeQuery();

    while (resultSet.next()) {
        String name = resultSet.getString("productName");
        String price = resultSet.getString("price");
        String stocks = resultSet.getString("stocks");
        String productId = resultSet.getString("productID");
        byte[] imageBytes = resultSet.getBytes("productImage");
        ImageIcon imageIcon = null;

        if (imageBytes != null) {
            InputStream in = new ByteArrayInputStream(imageBytes);
            BufferedImage bufferedImage = ImageIO.read(in);
            Image scaledImage = bufferedImage.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(scaledImage);
        }
        model.addRow(new Object[]{imageIcon, name, price, stocks, productId});
    }
    for (int column = 0; column < productsTable.getColumnCount(); column++) {
        TableColumn tableColumn = productsTable.getColumnModel().getColumn(column);
        int preferredWidth = 100, maxWidth = 300;

        TableCellRenderer headerRenderer = productsTable.getTableHeader().getDefaultRenderer();
        Component headerComponent = headerRenderer.getTableCellRendererComponent(productsTable, tableColumn.getHeaderValue(), false, false, -1, column);
        preferredWidth = Math.max(preferredWidth, headerComponent.getPreferredSize().width);

        for (int row = 0; row < productsTable.getRowCount(); row++) {
            TableCellRenderer cellRenderer = productsTable.getCellRenderer(row, column);
            Component c = productsTable.prepareRenderer(cellRenderer, row, column);
            preferredWidth = Math.max(preferredWidth, c.getPreferredSize().width + 10);
            if (preferredWidth >= maxWidth) break;
        }
        tableColumn.setPreferredWidth(preferredWidth);
    }
    productsTable.setRowHeight(100);
    productsTable.revalidate();
    productsTable.repaint();
} catch (SQLException | IOException ex) {
    JOptionPane.showMessageDialog(null, "Error fetching data: " + ex.getMessage());
}    
}
    private void pastryData(){
        try {
    DefaultTableModel model = (DefaultTableModel) productsTable.getModel();
    model.setRowCount(0);

    Connection connection = DBconnect.connect();
    String query = "SELECT p.productImage, p.productName, p.price, p.stocks, p.productID " +
                   "FROM Products p JOIN Category c ON p.categoryID = c.categoryID " +
                   "WHERE c.categoryName = 'Pastry'";
    PreparedStatement statement = connection.prepareStatement(query);
    ResultSet resultSet = statement.executeQuery();

    while (resultSet.next()) {
        String name = resultSet.getString("productName");
        String price = resultSet.getString("price");
        String stocks = resultSet.getString("stocks");
        String productId = resultSet.getString("productID");
        byte[] imageBytes = resultSet.getBytes("productImage");
        ImageIcon imageIcon = null;

        if (imageBytes != null) {
            InputStream in = new ByteArrayInputStream(imageBytes);
            BufferedImage bufferedImage = ImageIO.read(in);
            Image scaledImage = bufferedImage.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(scaledImage);
        }
        model.addRow(new Object[]{imageIcon, name, price, stocks, productId});
    }
    for (int column = 0; column < productsTable.getColumnCount(); column++) {
        TableColumn tableColumn = productsTable.getColumnModel().getColumn(column);
        int preferredWidth = 100, maxWidth = 300;

        TableCellRenderer headerRenderer = productsTable.getTableHeader().getDefaultRenderer();
        Component headerComponent = headerRenderer.getTableCellRendererComponent(productsTable, tableColumn.getHeaderValue(), false, false, -1, column);
        preferredWidth = Math.max(preferredWidth, headerComponent.getPreferredSize().width);

        for (int row = 0; row < productsTable.getRowCount(); row++) {
            TableCellRenderer cellRenderer = productsTable.getCellRenderer(row, column);
            Component c = productsTable.prepareRenderer(cellRenderer, row, column);
            preferredWidth = Math.max(preferredWidth, c.getPreferredSize().width + 10);
            if (preferredWidth >= maxWidth) break;
        }
        tableColumn.setPreferredWidth(preferredWidth);
    }
    productsTable.setRowHeight(100);
    productsTable.revalidate();
    productsTable.repaint();
} catch (SQLException | IOException ex) {
    JOptionPane.showMessageDialog(null, "Error fetching data: " + ex.getMessage());
}    
}
    private void drinksData(){
        try {
    DefaultTableModel model = (DefaultTableModel) productsTable.getModel();
    model.setRowCount(0);

    Connection connection = DBconnect.connect();
    String query = "SELECT p.productImage, p.productName, p.price, p.stocks, p.productID " +
                   "FROM Products p JOIN Category c ON p.categoryID = c.categoryID " +
                   "WHERE c.categoryName = 'Drinks'";
    PreparedStatement statement = connection.prepareStatement(query);
    ResultSet resultSet = statement.executeQuery();

    while (resultSet.next()) {
        String name = resultSet.getString("productName");
        String price = resultSet.getString("price");
        String stocks = resultSet.getString("stocks");
        String productId = resultSet.getString("productID");
        byte[] imageBytes = resultSet.getBytes("productImage");
        ImageIcon imageIcon = null;

        if (imageBytes != null) {
            InputStream in = new ByteArrayInputStream(imageBytes);
            BufferedImage bufferedImage = ImageIO.read(in);
            Image scaledImage = bufferedImage.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(scaledImage);
        }
        model.addRow(new Object[]{imageIcon, name, price, stocks, productId});
    }
    for (int column = 0; column < productsTable.getColumnCount(); column++) {
        TableColumn tableColumn = productsTable.getColumnModel().getColumn(column);
        int preferredWidth = 100, maxWidth = 300;

        TableCellRenderer headerRenderer = productsTable.getTableHeader().getDefaultRenderer();
        Component headerComponent = headerRenderer.getTableCellRendererComponent(productsTable, tableColumn.getHeaderValue(), false, false, -1, column);
        preferredWidth = Math.max(preferredWidth, headerComponent.getPreferredSize().width);

        for (int row = 0; row < productsTable.getRowCount(); row++) {
            TableCellRenderer cellRenderer = productsTable.getCellRenderer(row, column);
            Component c = productsTable.prepareRenderer(cellRenderer, row, column);
            preferredWidth = Math.max(preferredWidth, c.getPreferredSize().width + 10);
            if (preferredWidth >= maxWidth) break;
        }
        tableColumn.setPreferredWidth(preferredWidth);
    }
    productsTable.setRowHeight(100);
    productsTable.revalidate();
    productsTable.repaint();
} catch (SQLException | IOException ex) {
    JOptionPane.showMessageDialog(null, "Error fetching data: " + ex.getMessage());
}    
}
    
            // Calculate width from h}}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Menu_Back;
    private javax.swing.JButton all;
    private javax.swing.JButton chips;
    private javax.swing.JButton drinks;
    private javax.swing.JButton fruits;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pastry;
    private javax.swing.JLabel products;
    private javax.swing.JTable productsTable;
    // End of variables declaration//GEN-END:variables

}
