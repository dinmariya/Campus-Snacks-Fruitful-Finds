
package user;

import admin.User_AdminLogin;




public class LogSign extends javax.swing.JFrame {
    
 
    public LogSign() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sign_up = new javax.swing.JButton();
        or = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sign_up.setBackground(new java.awt.Color(153, 255, 255));
        Sign_up.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        Sign_up.setText("Sign up");
        Sign_up.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(255, 255, 255), null, null));
        Sign_up.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign_upActionPerformed(evt);
            }
        });
        getContentPane().add(Sign_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 100, 30));

        or.setFont(new java.awt.Font("Javanese Text", 3, 14)); // NOI18N
        or.setText("or");
        getContentPane().add(or, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 20, -1));

        Login.setBackground(new java.awt.Color(153, 255, 255));
        Login.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        Login.setText("Login");
        Login.setAlignmentY(0.0F);
        Login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(255, 255, 255), null, null));
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 100, 30));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 40));

        jLabel1.setForeground(new java.awt.Color(255, 51, 153));
        jLabel1.setText("Do you have an existing account? ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 230, 30));

        jLabel3.setForeground(new java.awt.Color(255, 51, 153));
        jLabel3.setText("Yes - Login, No -Sign up");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Group 10.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sign_upActionPerformed
        // TODO add your handling code here:
    UserSignup signUpForm = new UserSignup();
    signUpForm.setVisible(true);
    // Close the current login window
    this.dispose();
    }//GEN-LAST:event_Sign_upActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
  
        User_AdminLogin adminLogin = new User_AdminLogin();
        adminLogin.setVisible(true);
        this.dispose();  // Close the current (main) login window

                  
    }//GEN-LAST:event_LoginActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new LogSign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JButton Sign_up;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel or;
    // End of variables declaration//GEN-END:variables
}
