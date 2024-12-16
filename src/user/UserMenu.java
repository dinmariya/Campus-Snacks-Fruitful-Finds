
package user;

import CONNECTOR.DBconnect;
import java.awt.Component;
import java.awt.Graphics2D;
import java.sql.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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


public class UserMenu extends javax.swing.JFrame {
    
      private String fname, contact, bdate, mail, address,username,password,userName ,email;
    private int userId;
    private ImageIcon usersImage;

    public UserMenu(String fname, String contact, String bdate, String mail, String address, String username, String password, String userName, ImageIcon usersImage, String email) {
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
        allData();
    }

    private TableCellRenderer centerRenderer;
    

    
    public UserMenu() {
        initComponents();
        allData();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Menu_Back = new javax.swing.JButton();
        products = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        drinks = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cart1 = new javax.swing.JButton();
        pastry = new javax.swing.JButton();
        all = new javax.swing.JButton();
        fruits = new javax.swing.JButton();
        chips = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        loveTable = new javax.swing.JTable();

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

        add.setBackground(new java.awt.Color(255, 204, 204));
        add.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 50, -1));

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

        cart1.setBackground(new java.awt.Color(255, 204, 204));
        cart1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cart1.setText("CART");
        cart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cart1ActionPerformed(evt);
            }
        });
        jPanel1.add(cart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 70, -1));

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

        loveTable.setModel(new javax.swing.table.DefaultTableModel(
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
        loveTable.setPreferredSize(new java.awt.Dimension(400, 10000));
        jScrollPane2.setViewportView(loveTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 410, 500));

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
        UserProf userProfile = new UserProf(fname, contact, bdate, mail, address,username,password,userName,usersImage, email);  // You need to create this class
        userProfile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Menu_BackActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
                                 
    int selectedRow = loveTable.getSelectedRow(); // Get selected row index

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Please select a product to add to the cart.");
    } else {
        try (Connection connection = DBconnect.connect();) {
            // Retrieve product data from the selected row
            ImageIcon productImage = (ImageIcon) loveTable.getValueAt(selectedRow, 0);  // Image column
            String productName = (String) loveTable.getValueAt(selectedRow, 1); // Name column
            String productPriceStr = (String) loveTable.getValueAt(selectedRow, 2); // Price column
            int currentStock = Integer.parseInt((String) loveTable.getValueAt(selectedRow, 3)); // Stock column

            // Debugging prints
            System.out.println("Product Name: " + productName);
            System.out.println("Product Price: " + productPriceStr);
            System.out.println("Current Stock: " + currentStock);
            System.out.println("Product Image: " + (productImage != null ? "Not null" : "Null"));

            // Parse product price to double
            double productPrice = Double.parseDouble(productPriceStr);

            if (currentStock > 0) {
                // Check if product is already in the cart
                String checkCartSQL = "SELECT quantity FROM cart WHERE productName = ?";
                try (PreparedStatement checkStmt = connection.prepareStatement(checkCartSQL)) {
                    checkStmt.setString(1, productName);
                    ResultSet rs = checkStmt.executeQuery();

                    if (rs.next()) {
                        // Product already exists in cart, update quantity
                        int currentQuantity = rs.getInt("quantity");
                        String updateCartSQL = "UPDATE cart SET quantity = ? WHERE productName = ?";
                        try (PreparedStatement updateStmt = connection.prepareStatement(updateCartSQL)) {
                            updateStmt.setInt(1, currentQuantity + 1); // Increment quantity by 1
                            updateStmt.setString(2, productName);
                            updateStmt.executeUpdate();
                        }
                    } else {
                        // Product not in cart, insert new row
                        String insertCartSQL = "INSERT INTO cart (productImage, productName, productPrice, quantity) VALUES (?, ?, ?, ?)";
                        try (PreparedStatement insertStmt = connection.prepareStatement(insertCartSQL)) {
                            // Set product data
                            insertStmt.setString(2, productName);
                            insertStmt.setDouble(3, productPrice); // Set product price as double
                            insertStmt.setInt(4, 1); // Default quantity is 1

                            // Convert ImageIcon to byte array (BLOB)
                            if (productImage != null) {
                                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                                Image image = productImage.getImage();
                                BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                                Graphics2D g2d = bufferedImage.createGraphics();
                                g2d.drawImage(image, 0, 0, null);
                                g2d.dispose();

                                ImageIO.write(bufferedImage, "png", baos); // Save as PNG
                                byte[] imageBytes = baos.toByteArray(); // Convert to byte array
                                insertStmt.setBytes(1, imageBytes); // Use setBytes instead of setBinaryStream
                            }

                            // Execute insert statement
                            insertStmt.executeUpdate();
                        }
                    }
                }

                // Update stock in the products table
                String updateStockSQL = "UPDATE Products SET stocks = stocks - 1 WHERE productName = ?";
                try (PreparedStatement stockStmt = connection.prepareStatement(updateStockSQL)) {
                    stockStmt.setString(1, productName);
                    stockStmt.executeUpdate();
                }

                // Update stock in the JTable (this is just for visual update)
                int updatedStock = currentStock - 1;
                loveTable.setValueAt(String.valueOf(updatedStock), selectedRow, 3);

                JOptionPane.showMessageDialog(null, productName + " has been added to the cart.");
            } else {
                JOptionPane.showMessageDialog(null, "Sorry, this product is out of stock.");
            }
        } catch (Exception ex) {
            ex.printStackTrace(); // Print full stack trace for better debugging
            JOptionPane.showMessageDialog(null, "Error adding product to cart: " + ex.getMessage());
        }
    }

    }//GEN-LAST:event_addActionPerformed

    private void drinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinksActionPerformed
        drinksData();
    }//GEN-LAST:event_drinksActionPerformed

    private void cart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cart1ActionPerformed
        allData();
        UserCart cart = new UserCart(fname, contact, bdate, mail, address,username,password,userName,usersImage, email);
        cart.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cart1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                String email= null;
                new UserMenu(fname, contact, bdate, mail, address,username,password,userName,usersImage, email).setVisible(true);
            }
        });
    }
   private void allData() {
    try {
        try (Connection connection = DBconnect.connect()) {
            String query = "SELECT productImage, productName, price, stocks FROM Products";
            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {

                DefaultTableModel tableModel = new DefaultTableModel();
                tableModel.addColumn("Image");
                tableModel.addColumn("Name");
                tableModel.addColumn("Price");
                tableModel.addColumn("Stocks");

                while (resultSet.next()) {
                    String name = resultSet.getString("productName");
                    String price = resultSet.getString("price");
                    String stocks = resultSet.getString("stocks");

                    byte[] imageBytes = resultSet.getBytes("productImage");
                    ImageIcon imageIcon = null;
                    if (imageBytes != null) {
                        InputStream in = new ByteArrayInputStream(imageBytes);
                        BufferedImage bi = ImageIO.read(in);
                        Image resizedImage = bi.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
                        imageIcon = new ImageIcon(resizedImage);
                    }
                    tableModel.addRow(new Object[]{imageIcon, name, price, stocks});
                }
                
               ((DefaultTableCellRenderer) loveTable.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
                for (int column = 0; column < loveTable.getColumnCount(); column++) {
            loveTable.getColumnModel().getColumn(column).setCellRenderer(centerRenderer);
               loveTable.setModel(tableModel); // Set table model

                loveTable.getColumnModel().getColumn(0).setCellRenderer(new TableCellRenderer() {
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

                loveTable.setRowHeight(100);

                } for (int column = 0; column < loveTable.getColumnCount(); column++) {
                    int maxWidth = 50; // Set a minimum width

                    TableCellRenderer headerRenderer = loveTable.getTableHeader().getDefaultRenderer();
                    Component headerComponent = headerRenderer.getTableCellRendererComponent(loveTable, loveTable.getColumnName(column), false, false, -1, column);
                    maxWidth = Math.max(maxWidth, headerComponent.getPreferredSize().width);

                    for (int row = 0; row < loveTable.getRowCount(); row++) {
                        TableCellRenderer cellRenderer = loveTable.getCellRenderer(row, column);
                        Component cellComponent = cellRenderer.getTableCellRendererComponent(loveTable, loveTable.getValueAt(row, column), false, false, row, column);
                        maxWidth = Math.max(maxWidth, cellComponent.getPreferredSize().width);
                    }

                    loveTable.getColumnModel().getColumn(column).setPreferredWidth(maxWidth + 10); // Add padding
                }
                loveTable.revalidate(); // Refresh table
                loveTable.repaint();   // Redraw table
            }
        }
    } catch (SQLException | IOException ex) {
        JOptionPane.showMessageDialog(null, "Error fetching data from database: " + ex.getMessage());
    }
}

 private void chipsData() {
   try {
    DefaultTableModel model = (DefaultTableModel) loveTable.getModel();
    model.setRowCount(0);

    Connection connection = DBconnect.connect();
    String query = "SELECT p.productImage, p.productName, p.price, p.stocks " +
                   "FROM Products p JOIN Category c ON p.categoryID = c.categoryID " +
                   "WHERE c.categoryName = 'Chips'";
    PreparedStatement statement = connection.prepareStatement(query);
    ResultSet resultSet = statement.executeQuery();

    while (resultSet.next()) {
        String name = resultSet.getString("productName");
        String price = resultSet.getString("price");
        String stocks = resultSet.getString("stocks");
        byte[] imageBytes = resultSet.getBytes("productImage");
        ImageIcon imageIcon = null;

        if (imageBytes != null) {
            InputStream in = new ByteArrayInputStream(imageBytes);
            BufferedImage bufferedImage = ImageIO.read(in);
            Image scaledImage = bufferedImage.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(scaledImage);
        }
        model.addRow(new Object[]{imageIcon, name, price, stocks});
    }

    for (int column = 0; column < loveTable.getColumnCount(); column++) {
        TableColumn tableColumn = loveTable.getColumnModel().getColumn(column);
        int preferredWidth = 100, maxWidth = 300;

        TableCellRenderer headerRenderer = loveTable.getTableHeader().getDefaultRenderer();
        Component headerComponent = headerRenderer.getTableCellRendererComponent(
            loveTable, tableColumn.getHeaderValue(), false, false, -1, column);
        preferredWidth = Math.max(preferredWidth, headerComponent.getPreferredSize().width);

        for (int row = 0; row < loveTable.getRowCount(); row++) {
            TableCellRenderer cellRenderer = loveTable.getCellRenderer(row, column);
            Component c = loveTable.prepareRenderer(cellRenderer, row, column);
            preferredWidth = Math.max(preferredWidth, c.getPreferredSize().width + 10);
            if (preferredWidth >= maxWidth) break;
        }
        tableColumn.setPreferredWidth(preferredWidth);
    }

    loveTable.setRowHeight(100);
    loveTable.revalidate();
    loveTable.repaint();
} catch (SQLException | IOException ex) {
    JOptionPane.showMessageDialog(null, "Error fetching data: " + ex.getMessage());
}}

    private void fruitsData(){
        try {
    DefaultTableModel model = (DefaultTableModel) loveTable.getModel();
    model.setRowCount(0);

    Connection connection = DBconnect.connect();
    String query = "SELECT p.productImage, p.productName, p.price, p.stocks " +
                   "FROM Products p JOIN Category c ON p.categoryID = c.categoryID " +
                   "WHERE c.categoryName = 'Fruits'";
    PreparedStatement statement = connection.prepareStatement(query);
    ResultSet resultSet = statement.executeQuery();

    while (resultSet.next()) {
        String name = resultSet.getString("productName");
        String price = resultSet.getString("price");
        String stocks = resultSet.getString("stocks");
        byte[] imageBytes = resultSet.getBytes("productImage");
        ImageIcon imageIcon = null;

        if (imageBytes != null) {
            InputStream in = new ByteArrayInputStream(imageBytes);
            BufferedImage bufferedImage = ImageIO.read(in);
            Image scaledImage = bufferedImage.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(scaledImage);
        }
        model.addRow(new Object[]{imageIcon, name, price, stocks});
    }
    for (int column = 0; column < loveTable.getColumnCount(); column++) {
        TableColumn tableColumn = loveTable.getColumnModel().getColumn(column);
        int preferredWidth = 100, maxWidth = 300;

        TableCellRenderer headerRenderer = loveTable.getTableHeader().getDefaultRenderer();
        Component headerComponent = headerRenderer.getTableCellRendererComponent(
            loveTable, tableColumn.getHeaderValue(), false, false, -1, column);
        preferredWidth = Math.max(preferredWidth, headerComponent.getPreferredSize().width);

        for (int row = 0; row < loveTable.getRowCount(); row++) {
            TableCellRenderer cellRenderer = loveTable.getCellRenderer(row, column);
            Component c = loveTable.prepareRenderer(cellRenderer, row, column);
            preferredWidth = Math.max(preferredWidth, c.getPreferredSize().width + 10);
            if (preferredWidth >= maxWidth) break;
        }
        tableColumn.setPreferredWidth(preferredWidth);
    }
    loveTable.setRowHeight(100);
    loveTable.revalidate();
    loveTable.repaint();
} catch (SQLException | IOException ex) {
    JOptionPane.showMessageDialog(null, "Error fetching data: " + ex.getMessage());
}    
}
    private void pastryData(){
        try {
    DefaultTableModel model = (DefaultTableModel) loveTable.getModel();
    model.setRowCount(0);

    Connection connection = DBconnect.connect();
    String query = "SELECT p.productImage, p.productName, p.price, p.stocks " +
                   "FROM Products p JOIN Category c ON p.categoryID = c.categoryID " +
                   "WHERE c.categoryName = 'Pastry'";
    PreparedStatement statement = connection.prepareStatement(query);
    ResultSet resultSet = statement.executeQuery();

    while (resultSet.next()) {
        String name = resultSet.getString("productName");
        String price = resultSet.getString("price");
        String stocks = resultSet.getString("stocks");
        byte[] imageBytes = resultSet.getBytes("productImage");
        ImageIcon imageIcon = null;

        if (imageBytes != null) {
            InputStream in = new ByteArrayInputStream(imageBytes);
            BufferedImage bufferedImage = ImageIO.read(in);
            Image scaledImage = bufferedImage.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(scaledImage);
        }
        model.addRow(new Object[]{imageIcon, name, price, stocks});
    }
    for (int column = 0; column < loveTable.getColumnCount(); column++) {
        TableColumn tableColumn = loveTable.getColumnModel().getColumn(column);
        int preferredWidth = 100, maxWidth = 300;

        TableCellRenderer headerRenderer = loveTable.getTableHeader().getDefaultRenderer();
        Component headerComponent = headerRenderer.getTableCellRendererComponent(
            loveTable, tableColumn.getHeaderValue(), false, false, -1, column);
        preferredWidth = Math.max(preferredWidth, headerComponent.getPreferredSize().width);

        for (int row = 0; row < loveTable.getRowCount(); row++) {
            TableCellRenderer cellRenderer = loveTable.getCellRenderer(row, column);
            Component c = loveTable.prepareRenderer(cellRenderer, row, column);
            preferredWidth = Math.max(preferredWidth, c.getPreferredSize().width + 10);
            if (preferredWidth >= maxWidth) break;
        }
        tableColumn.setPreferredWidth(preferredWidth);
    }
    loveTable.setRowHeight(100);
    loveTable.revalidate();
    loveTable.repaint();
} catch (SQLException | IOException ex) {
    JOptionPane.showMessageDialog(null, "Error fetching data: " + ex.getMessage());
}    
}
    private void drinksData(){
        try {
    DefaultTableModel model = (DefaultTableModel) loveTable.getModel();
    model.setRowCount(0);

    Connection connection = DBconnect.connect();
    String query = "SELECT p.productImage, p.productName, p.price, p.stocks " +
                   "FROM Products p JOIN Category c ON p.categoryID = c.categoryID " +
                   "WHERE c.categoryName = 'Drinks'";
    PreparedStatement statement = connection.prepareStatement(query);
    ResultSet resultSet = statement.executeQuery();

    while (resultSet.next()) {
        String name = resultSet.getString("productName");
        String price = resultSet.getString("price");
        String stocks = resultSet.getString("stocks");
        byte[] imageBytes = resultSet.getBytes("productImage");
        ImageIcon imageIcon = null;

        if (imageBytes != null) {
            InputStream in = new ByteArrayInputStream(imageBytes);
            BufferedImage bufferedImage = ImageIO.read(in);
            Image scaledImage = bufferedImage.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(scaledImage);
        }
        model.addRow(new Object[]{imageIcon, name, price, stocks});
    }
    for (int column = 0; column < loveTable.getColumnCount(); column++) {
        TableColumn tableColumn = loveTable.getColumnModel().getColumn(column);
        int preferredWidth = 100, maxWidth = 300;

        TableCellRenderer headerRenderer = loveTable.getTableHeader().getDefaultRenderer();
        Component headerComponent = headerRenderer.getTableCellRendererComponent(
            loveTable, tableColumn.getHeaderValue(), false, false, -1, column);
        preferredWidth = Math.max(preferredWidth, headerComponent.getPreferredSize().width);

        for (int row = 0; row < loveTable.getRowCount(); row++) {
            TableCellRenderer cellRenderer = loveTable.getCellRenderer(row, column);
            Component c = loveTable.prepareRenderer(cellRenderer, row, column);
            preferredWidth = Math.max(preferredWidth, c.getPreferredSize().width + 10);
            if (preferredWidth >= maxWidth) break;
        }
        tableColumn.setPreferredWidth(preferredWidth);
    }
    loveTable.setRowHeight(100);
    loveTable.revalidate();
    loveTable.repaint();
} catch (SQLException | IOException ex) {
    JOptionPane.showMessageDialog(null, "Error fetching data: " + ex.getMessage());
}    
}
    
            // Calculate width from h}}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu_Back;
    private javax.swing.JButton add;
    private javax.swing.JButton all;
    private javax.swing.JButton cart1;
    private javax.swing.JButton chips;
    private javax.swing.JButton drinks;
    private javax.swing.JButton fruits;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable loveTable;
    private javax.swing.JButton pastry;
    private javax.swing.JLabel products;
    // End of variables declaration//GEN-END:variables
}
