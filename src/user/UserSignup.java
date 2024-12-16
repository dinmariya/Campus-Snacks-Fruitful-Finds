/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class UserSignup extends javax.swing.JFrame {
    private String fname, contact, bdate, mail, address,username,password;
    private int userId;

    public UserSignup(int userId, String fname, String contact, String bdate, String mail, String address, String username, String password) {
    initComponents();
    this.userId = userId;
        this.fname = fname;
        this.contact = contact;
        this.bdate = bdate;
        this.mail = mail;
        this.address = address;
        this.username = username;
        this.password = password;
    
    FullName2.setText(fname);
    Contact_box2.setText(contact);
   try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        if (bdate != null) {
            java.util.Date parsedDate = sdf.parse(bdate);
            Date2.setDate(parsedDate);
        }
    } catch (ParseException e) {
        e.printStackTrace();
    }

    Email_box2.setText(mail);
    Address2.setText(address);
}
    public UserSignup() {
        initComponents();
        this.userId = 0;
        this.fname = "";
        this.contact = "";
        this.bdate = "";
        this.mail = "";
        this.address = "";
        this.username = "";
        this.password = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sign_up = new javax.swing.JPanel();
        Full_name3 = new javax.swing.JLabel();
        FullName2 = new javax.swing.JTextField();
        ContactNo3 = new javax.swing.JLabel();
        Contact_box2 = new javax.swing.JTextField();
        Birthday3 = new javax.swing.JLabel();
        Email_box2 = new javax.swing.JTextField();
        Address3 = new javax.swing.JLabel();
        Address2 = new javax.swing.JTextField();
        Signup_Back = new javax.swing.JButton();
        Signup_Next = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Email13 = new javax.swing.JLabel();
        Date2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sign_up.setBackground(new java.awt.Color(255, 204, 255));
        sign_up.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Full_name3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Full_name3.setText("Full Name");
        sign_up.add(Full_name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        FullName2.setBackground(new java.awt.Color(248, 248, 248));
        FullName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullName2ActionPerformed(evt);
            }
        });
        sign_up.add(FullName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 240, 31));

        ContactNo3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ContactNo3.setText("Contact No.");
        sign_up.add(ContactNo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        Contact_box2.setBackground(new java.awt.Color(248, 248, 248));
        Contact_box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contact_box2ActionPerformed(evt);
            }
        });
        sign_up.add(Contact_box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 240, 31));

        Birthday3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Birthday3.setText("Birthday");
        sign_up.add(Birthday3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, -1));

        Email_box2.setBackground(new java.awt.Color(248, 248, 248));
        Email_box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_box2ActionPerformed(evt);
            }
        });
        sign_up.add(Email_box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 250, 31));

        Address3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Address3.setText("Address");
        sign_up.add(Address3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 70, -1));

        Address2.setBackground(new java.awt.Color(248, 248, 248));
        Address2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Address2ActionPerformed(evt);
            }
        });
        sign_up.add(Address2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 250, 31));

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
        sign_up.add(Signup_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 50, -1));

        Signup_Next.setBackground(new java.awt.Color(73, 73, 73));
        Signup_Next.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Signup_Next.setForeground(new java.awt.Color(235, 235, 235));
        Signup_Next.setText("Next");
        Signup_Next.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Signup_Next.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Signup_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Signup_NextActionPerformed(evt);
            }
        });
        sign_up.add(Signup_Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 50, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(91, 89, 89));
        jLabel3.setText("Sign up");
        sign_up.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 75, -1));

        Email13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Email13.setText("Email");
        sign_up.add(Email13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, -1));
        sign_up.add(Date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, -1));

        getContentPane().add(sign_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 320, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Group 11.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 410, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Signup_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signup_NextActionPerformed
        String fname= FullName2.getText();
        String contact = Contact_box2.getText();
        
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        String bdate = Date2.getDate() != null ? dateformat.format(Date2.getDate()) : null;
        
       String mail = Email_box2.getText();
       String address= Address2.getText();
       
       if (validateFields(fname, contact, bdate, mail, address)) {
        UserConfirmation confirmationFrame = new UserConfirmation(userId,fname, contact, bdate, mail, address,username,password);
        confirmationFrame.setVisible(true);
        confirmationFrame.pack();
        this.dispose();
       }
    }

private boolean validateFields(String fname, String contact, String bdate, String mail, String address) {
    if (fname.isEmpty() || contact.isEmpty() || bdate == null || mail.isEmpty() || address.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields are required!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
}
    return true;

    }//GEN-LAST:event_Signup_NextActionPerformed

    private void Signup_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signup_BackActionPerformed
        // TODO add your handling code here:
        LogSign backbutton = new LogSign();  // You need to create this class
        backbutton.setVisible(true);
        backbutton.pack();

        this.dispose();
    }//GEN-LAST:event_Signup_BackActionPerformed

    private void Address2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Address2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Address2ActionPerformed

    private void Email_box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_box2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_box2ActionPerformed

    private void Contact_box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contact_box2ActionPerformed
        // TODO add your handling code here:;
    }//GEN-LAST:event_Contact_box2ActionPerformed

    private void FullName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullName2ActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_FullName2ActionPerformed

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
            java.util.logging.Logger.getLogger(UserSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                int userId = 0;
                String fname = ""; 
                String contact = "";
                String bdate = "";
                String mail = "";
                String address = "";
                String username = "";
                String password = "";
                new UserSignup(userId,fname, contact, bdate, mail, address,username,password).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address2;
    private javax.swing.JLabel Address3;
    private javax.swing.JLabel Birthday3;
    private javax.swing.JLabel ContactNo3;
    private javax.swing.JTextField Contact_box2;
    private com.toedter.calendar.JDateChooser Date2;
    private javax.swing.JLabel Email13;
    private javax.swing.JTextField Email_box2;
    private javax.swing.JTextField FullName2;
    private javax.swing.JLabel Full_name3;
    private javax.swing.JButton Signup_Back;
    private javax.swing.JButton Signup_Next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel sign_up;
    // End of variables declaration//GEN-END:variables
}
