
package user;

import CONNECTOR.DBconnect;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class UserCart extends javax.swing.JFrame {
private String fname, contact, bdate, mail, address,username,password,userName, email;
    private int userId;
    private ImageIcon usersImage;
    private UserCart productImage;private Component checkoutDialog;

    public UserCart(String fname, String contact, String bdate, String mail, String address, String username, String password, String userName, ImageIcon usersImage, String email) {
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
    
    Connection connection = null;
 
    loadCartData();

}
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        UserMenu = new javax.swing.JLabel();
        Signup_Back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        remove = new javax.swing.JButton();
        checkout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 575));

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(29, 126, 55)));

        UserMenu.setFont(new java.awt.Font("Javanese Text", 1, 36)); // NOI18N
        UserMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserMenu.setText("Cart");
        UserMenu.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UserMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UserMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Signup_Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Signup_Back.setText("<");
        Signup_Back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Signup_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Signup_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Signup_BackActionPerformed(evt);
            }
        });

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
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
        cartTable.setPreferredSize(new java.awt.Dimension(400, 10000));
        jScrollPane2.setViewportView(cartTable);

        remove.setBackground(new java.awt.Color(255, 204, 204));
        remove.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        checkout.setBackground(new java.awt.Color(255, 204, 204));
        checkout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        checkout.setText("CHECK OUT");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Signup_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(checkout))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(remove)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Signup_Back)
                            .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Signup_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signup_BackActionPerformed
       UserMenu menu = new UserMenu(fname, contact, bdate, mail, address,username,password,userName,usersImage, email);
       menu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_Signup_BackActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        int selectedRow = cartTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select an item to reduce its quantity.");
            return;
        }
        String productName = (String) cartTable.getValueAt(selectedRow, 1);
        int currentQuantity = (int) cartTable.getValueAt(selectedRow, 3);
        if (currentQuantity > 1) {
            try (Connection connection = DBconnect.connect()) {
                String updateSQL = "UPDATE cart SET quantity = quantity - 1 WHERE productName = ?";
                try (PreparedStatement stmt = connection.prepareStatement(updateSQL)) {
                    stmt.setString(1, productName);
                    stmt.executeUpdate();
                }
                cartTable.setValueAt(currentQuantity - 1, selectedRow, 3);
                JOptionPane.showMessageDialog(null, "Reduced quantity of " + productName + " by 1.");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error reducing quantity: " + e.getMessage());
            }
        } else {
            try (Connection connection = DBconnect.connect()) {
                String deleteSQL = "DELETE FROM cart WHERE productName = ?";
                try (PreparedStatement stmt = connection.prepareStatement(deleteSQL)) {
                    stmt.setString(1, productName);
                    stmt.executeUpdate();
                }
                DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, productName + " has been removed from the cart.");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error deleting item: " + e.getMessage());
            }}
    }//GEN-LAST:event_removeActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        checkoutSelectedRow();
    }//GEN-LAST:event_checkoutActionPerformed

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
            java.util.logging.Logger.getLogger(UserCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


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
                new UserCart(fname, contact, bdate, mail, address,username,password,userName,usersImage, email).setVisible(true);
            }
        });
    }
   
 
    private void loadCartData() {
    String[] columnHeaders = {"Image", "Product Name", "Price", "Quantity"};
    DefaultTableModel model = new DefaultTableModel(new Object[][]{}, columnHeaders) {
        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (columnIndex == 0) { // Image column
                return ImageIcon.class;
            }
            return Object.class;
        }
    };
    cartTable.setModel(model);

    try (Connection connection = DBconnect.connect()) {
        String query = "SELECT productImage, productName, productPrice, quantity FROM cart";
        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                // Retrieve data from ResultSet
                byte[] imageBytes = rs.getBytes("productImage");
                String productName = rs.getString("productName");
                double productPrice = rs.getDouble("productPrice");
                int quantity = rs.getInt("quantity");

                ImageIcon productImage = null;
                if (imageBytes != null) {
                    try (InputStream in = new ByteArrayInputStream(imageBytes)) {
                        BufferedImage bufferedImage = ImageIO.read(in);
                        if (bufferedImage != null) {
                            productImage = new ImageIcon(bufferedImage);
                            productImage = scaleImageIcon(productImage, 50, 50);
                        } else {
                            System.out.println("Error: Image data is invalid.");
                        }
                    } catch (IOException ex) {
                        System.out.println("Error reading image: " + ex.getMessage());
                    }
                } else {
                    System.out.println("No image available.");
                }

// If image is null, use a default image


model.addRow(new Object[]{productImage, productName, productPrice, quantity});
            }
        }
    } catch (Exception e) {
        e.printStackTrace(); // Debugging output
        JOptionPane.showMessageDialog(null, "Error loading cart data: " + e.getMessage());
    }

    // Auto resize rows and columns
    cartTable.setRowHeight(50); // Set default row height for images
    autoResizeTableColumns(cartTable); // Adjust column widths to content
}
   
    private void checkoutSelectedRow() {
    int selectedRow = cartTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Please select an item to check out.");
        return;
    }
    DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
    ImageIcon productImage = (ImageIcon) model.getValueAt(selectedRow, 0);
    String productName = (String) model.getValueAt(selectedRow, 1);
    double productPrice = (double) model.getValueAt(selectedRow, 2);
    int quantity = (int) model.getValueAt(selectedRow, 3);
    JTextField fullNameField = new JTextField();
    JTextField addressField = new JTextField();
    JLabel infoLabel = new JLabel("Note: No cancellation of orders.");
    Object[] checkoutFields = {
        infoLabel,
        "Full Name:", fullNameField,
        "Address:", addressField
    };
    int option = JOptionPane.showConfirmDialog(
        null,
        checkoutFields,
        "Checkout",
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE
    );
    if (option == JOptionPane.OK_OPTION) {
        String fullName = fullNameField.getText().trim();
        String address = addressField.getText().trim();
        if (fullName.isEmpty() || address.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Full name and address are required.");
            return;
        }
        try (Connection connection = DBconnect.connect()) {
            String insertCheckoutSQL = "INSERT INTO checkout_details (full_name, address) VALUES (?, ?)";
            try (PreparedStatement stmt = connection.prepareStatement(insertCheckoutSQL, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, fullName);
                stmt.setString(2, address);
                stmt.executeUpdate();
                ResultSet keys = stmt.getGeneratedKeys();
                if (keys.next()) {
                    int checkoutId = keys.getInt(1);
                    String insertOrderSQL = "INSERT INTO userOrders (checkID, productImage, productName, productPrice, quantity, orderDate) VALUES (?, ?, ?, ?, ?, ?)";
                    try (PreparedStatement orderStmt = connection.prepareStatement(insertOrderSQL)) {
                        byte[] imageBytes = imageIconToBytes(productImage);
                        orderStmt.setInt(1, checkoutId);
                        orderStmt.setBytes(2, imageBytes);
                        orderStmt.setString(3, productName);
                        orderStmt.setDouble(4, productPrice);
                        orderStmt.setInt(5, quantity);
                        orderStmt.setString(6, LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
                        orderStmt.executeUpdate();
                    }
                    String deleteProductSQL = "DELETE FROM cart WHERE productName = ? AND productPrice = ? AND quantity = ?";
                    try (PreparedStatement deleteStmt = connection.prepareStatement(deleteProductSQL)) {
                        deleteStmt.setString(1, productName);
                        deleteStmt.setDouble(2, productPrice);
                        deleteStmt.setInt(3, quantity);
                        deleteStmt.executeUpdate();}
                            model.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(null, "Order placed successfully!");
                }}} catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error during checkout: " + ex.getMessage());
        }}}

    private byte[] imageIconToBytes(ImageIcon icon) throws IOException {
        BufferedImage bufferedImage = new BufferedImage(
        icon.getIconWidth(),
        icon.getIconHeight(),
        BufferedImage.TYPE_INT_RGB
    );
    Graphics g = bufferedImage.createGraphics();
    icon.paintIcon(null, g, 0, 0);
    g.dispose();

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ImageIO.write(bufferedImage, "png", baos);
    return baos.toByteArray();
}


   private void autoResizeTableColumns(JTable table) {
    final TableColumnModel columnModel = table.getColumnModel();
    for (int column = 0; column < table.getColumnCount(); column++) {
        int width = 50; // Minimum width
        for (int row = 0; row < table.getRowCount(); row++) {
            TableCellRenderer renderer = table.getCellRenderer(row, column);
            Component comp = table.prepareRenderer(renderer, row, column);
            width = Math.max(comp.getPreferredSize().width + 10, width);
        }
        TableCellRenderer headerRenderer = table.getTableHeader().getDefaultRenderer();
        Component headerComp = headerRenderer.getTableCellRendererComponent(table, table.getColumnName(column), false, false, -1, column);
        width = Math.max(headerComp.getPreferredSize().width + 10, width);
        columnModel.getColumn(column).setPreferredWidth(width);
    }}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Signup_Back;
    private javax.swing.JLabel UserMenu;
    private java.awt.Canvas canvas1;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton checkout;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton remove;
    // End of variables declaration//GEN-END:variables

  public ImageIcon scaleImageIcon(ImageIcon icon, int width, int height) {
    if (icon != null) {
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
    return null; // Or return a default image
// Return null if the icon is null
}}