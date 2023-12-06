/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package REGISTER_LOGIN;

import java.awt.Color;
import java.io.*;
import javax.swing.*;

public class LOGIN extends javax.swing.JFrame {

    public LOGIN() {
        initComponents();
        customizeTextFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEmail_Num = new javax.swing.JTextField();
        jPassHide = new javax.swing.JPasswordField();
        jShowpass = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        btnForgot = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnForgot1 = new javax.swing.JButton();
        btnLogin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 600));

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel1.setText("Instagram");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtEmail_Num.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail_Num.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail_Num.setText("Email or phone number");

        jPassHide.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPassHide.setForeground(new java.awt.Color(153, 153, 153));
        jPassHide.setText("Password");

        jShowpass.setText("Show password");
        jShowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowpassActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(51, 153, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOG IN");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(0, 204, 0));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Create new account");
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnForgot.setBackground(new java.awt.Color(51, 0, 255));
        btnForgot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnForgot.setText("Sign up");
        btnForgot.setBorder(null);
        btnForgot.setBorderPainted(false);
        btnForgot.setContentAreaFilled(false);
        btnForgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("________________________________________________________________________________");

        btnForgot1.setBackground(new java.awt.Color(51, 0, 255));
        btnForgot1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnForgot1.setForeground(new java.awt.Color(51, 153, 255));
        btnForgot1.setText("Forgot password?");
        btnForgot1.setBorder(null);
        btnForgot1.setBorderPainted(false);
        btnForgot1.setContentAreaFilled(false);
        btnForgot1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnForgot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgot1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(btnForgot1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnForgot))
                            .addComponent(jShowpass)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmail_Num)
                                .addComponent(jPassHide, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtEmail_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPassHide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jShowpass)
                .addGap(52, 52, 52)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnForgot1)
                    .addComponent(btnForgot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        btnLogin1.setBackground(new java.awt.Color(255, 102, 153));
        btnLogin1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnLogin1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String emailNum = txtEmail_Num.getText();
        String password = String.valueOf(jPassHide.getPassword());

        if (emailNum.isEmpty() || emailNum.equals("Email or phone number") || password.isEmpty() || password.equals("Password")) {
            JOptionPane.showMessageDialog(this, "Please enter both email/number and password!", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            if (emailNum.isEmpty() || emailNum.equals("Email or phone number")) {
                txtEmail_Num.setBorder(BorderFactory.createLineBorder(Color.RED));
            } else {
                txtEmail_Num.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
            if (password.isEmpty() || password.equals("Password")) {
                jPassHide.setBorder(BorderFactory.createLineBorder(Color.RED));
            } else {
                jPassHide.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(txtEmail_Num.getText() + ".txt"))) {
            String line;
            boolean loggedIn = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Email/Num.: " + emailNum) && reader.readLine().contains("Password: " + password)) {
                    loggedIn = true;
                    break;
                }
            }

            if (loggedIn) {
                txtEmail_Num.setText("Email or phone number");
                jPassHide.setText("Password");
                JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                FacebookMain x = new FacebookMain();
                x.displayUserInfo(emailNum);
                x.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid email/number or password!", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "File does not exist or an error occurred!", "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        SignUp x = new SignUp();
        x.show();
        this.hide();
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotActionPerformed
        JOptionPane.showMessageDialog(this, "Balik buhat account uyy!", "Wakoy labot, muna bungwon man!", JOptionPane.WARNING_MESSAGE);
        SignUp x = new SignUp();
        x.show();
        this.hide();
    }//GEN-LAST:event_btnForgotActionPerformed

    private void jShowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowpassActionPerformed
        if(jShowpass.isSelected()){
            jPassHide.setEchoChar((char)0);
        }else{
            jPassHide.setEchoChar('*');
        }
    }//GEN-LAST:event_jShowpassActionPerformed

    private void btnForgot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnForgot1ActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin1ActionPerformed
    
     private void customizeTextFields() {

    txtEmail_Num.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (txtEmail_Num.getText().equals("Email or phone number")) {
                txtEmail_Num.setText("");
                txtEmail_Num.setForeground(Color.BLACK);
            }
            txtEmail_Num.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }

        public void focusLost(java.awt.event.FocusEvent evt) {
            if (txtEmail_Num.getText().isEmpty()) {
                txtEmail_Num.setText("Email or phone number");
                txtEmail_Num.setForeground(Color.GRAY);
            }
        }
    });

    jPassHide.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            char[] pass = jPassHide.getPassword();
            String passText = String.valueOf(pass);
            if (passText.equals("Password")) {
                jPassHide.setText("");
                jPassHide.setEchoChar('*');
                jPassHide.setForeground(Color.BLACK);
            }
            jPassHide.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }

        public void focusLost(java.awt.event.FocusEvent evt) {
            char[] pass = jPassHide.getPassword();
            String passText = String.valueOf(pass);
            if (passText.isEmpty()) {
                jPassHide.setText("Password");
                jPassHide.setEchoChar((char) 0);
                jPassHide.setForeground(Color.GRAY);
            }
        }
    });
}
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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgot;
    private javax.swing.JButton btnForgot1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassHide;
    private javax.swing.JCheckBox jShowpass;
    private javax.swing.JTextField txtEmail_Num;
    // End of variables declaration//GEN-END:variables
}
