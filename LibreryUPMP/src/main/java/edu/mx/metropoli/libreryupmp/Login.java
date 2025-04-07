package edu.mx.metropoli.libreryupmp;

import ConectionDB.Conectar;
import ConectionDB.Validacion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.JPanel;

//@author #LaMetro

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        Conectar onj = new Conectar();
        onj.conectarToDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelLogo = new javax.swing.JLabel();
        LabelBackground = new javax.swing.JLabel();
        jPanel4 = new RoundedPanel(50);
        IMGLOCK = new javax.swing.JLabel();
        WELCOMETEXT = new javax.swing.JLabel();
        USUARIO = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        CONTRA = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        BottonGo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libreria #LaMetro");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(225, 94, 41));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO-verde-300x64.png"))); // NOI18N
        jPanel1.add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        LabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Frame5.png"))); // NOI18N
        LabelBackground.setText("jLabel3");
        jPanel1.add(LabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 500));

        jPanel4.setBackground(new java.awt.Color(32, 59, 104));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IMGLOCK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/House Lock1.png"))); // NOI18N
        jPanel4.add(IMGLOCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        WELCOMETEXT.setBackground(new java.awt.Color(0, 0, 0));
        WELCOMETEXT.setFont(new java.awt.Font("Gilroy", 1, 30)); // NOI18N
        WELCOMETEXT.setForeground(new java.awt.Color(255, 255, 255));
        WELCOMETEXT.setText("W E L C O M E");
        jPanel4.add(WELCOMETEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 76, -1, -1));

        USUARIO.setFont(new java.awt.Font("Gilroy", 0, 24)); // NOI18N
        USUARIO.setForeground(new java.awt.Color(255, 255, 255));
        USUARIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profile.png"))); // NOI18N
        USUARIO.setText("User");
        USUARIO.setToolTipText("");
        jPanel4.add(USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 20));

        txtUser.setForeground(new java.awt.Color(255, 102, 0));
        txtUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel4.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 196, 202, 30));

        CONTRA.setFont(new java.awt.Font("Gilroy", 0, 24)); // NOI18N
        CONTRA.setForeground(new java.awt.Color(255, 255, 255));
        CONTRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unlock 1.png"))); // NOI18N
        CONTRA.setText("Password");
        jPanel4.add(CONTRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 250, -1, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel4.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 285, 202, 30));

        BottonGo.setBackground(new java.awt.Color(0, 32, 96));
        BottonGo.setFont(new java.awt.Font("Gilroy", 1, 18)); // NOI18N
        BottonGo.setForeground(new java.awt.Color(255, 255, 255));
        BottonGo.setText("Go");
        BottonGo.setToolTipText("");
        BottonGo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BottonGo.setBorderPainted(false);
        BottonGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonGoActionPerformed(evt);
            }
        });
        jPanel4.add(BottonGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 350, 202, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 340, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 500));

        getAccessibleContext().setAccessibleDescription("Programa de Adminstracion de la Libreria de la Universidad Polítecnica Metropolitana de Puebla");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BottonGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonGoActionPerformed
        Validacion cu = new Validacion();
        boolean codigo = cu.validarUsuario(txtUser, txtPassword);

        if(codigo == true)
        {
            this.dispose();
            Main jmain = new Main();
            jmain.setVisible(true);
        }
    }//GEN-LAST:event_BottonGoActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BottonGo;
    private javax.swing.JLabel CONTRA;
    private javax.swing.JLabel IMGLOCK;
    private javax.swing.JLabel LabelBackground;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel USUARIO;
    private javax.swing.JLabel WELCOMETEXT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    
    
    



    class RoundedPanel extends JPanel{
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
        
    }
    
}
