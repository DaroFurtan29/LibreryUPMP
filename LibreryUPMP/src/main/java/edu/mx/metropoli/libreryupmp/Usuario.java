
package edu.mx.metropoli.libreryupmp;
import Usuarios.AlumnoRegistro;
import Usuarios.MaestroRegistro;

public class Usuario extends javax.swing.JFrame {
 
    public Usuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TextoBiblioteca = new javax.swing.JLabel();
        LOGO_LIBRO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ADMINSTRADOR = new javax.swing.JToggleButton();
        ALUMNO = new javax.swing.JToggleButton();
        MAESTRO = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selecciona Usuario UPMP");
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(225, 94, 42));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(32, 59, 104));

        TextoBiblioteca.setFont(new java.awt.Font("Gilroy", 3, 48)); // NOI18N
        TextoBiblioteca.setForeground(new java.awt.Color(255, 255, 255));
        TextoBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO M c-letra LAMETRO.png"))); // NOI18N
        TextoBiblioteca.setText("Biblioteca #LaMetro");
        TextoBiblioteca.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextoBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextoBiblioteca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 130));

        LOGO_LIBRO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO_LIBRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LIBRO ICON.png"))); // NOI18N
        jPanel1.add(LOGO_LIBRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 380, 150, -1));

        jLabel2.setFont(new java.awt.Font("Gilroy", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BIENVENIDO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 150, 700, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Selecciona tu Usuario");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 700, -1));

        ADMINSTRADOR.setBackground(new java.awt.Color(0, 32, 96));
        ADMINSTRADOR.setFont(new java.awt.Font("Gilroy", 1, 30)); // NOI18N
        ADMINSTRADOR.setForeground(new java.awt.Color(255, 255, 255));
        ADMINSTRADOR.setText("Administrador");
        ADMINSTRADOR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ADMINSTRADOR.setBorderPainted(false);
        ADMINSTRADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINSTRADORActionPerformed(evt);
            }
        });
        jPanel1.add(ADMINSTRADOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 390, 223, 50));

        ALUMNO.setBackground(new java.awt.Color(0, 32, 96));
        ALUMNO.setFont(new java.awt.Font("Gilroy", 1, 30)); // NOI18N
        ALUMNO.setForeground(new java.awt.Color(255, 255, 255));
        ALUMNO.setText("Alumno");
        ALUMNO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ALUMNO.setBorderPainted(false);
        ALUMNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALUMNOActionPerformed(evt);
            }
        });
        jPanel1.add(ALUMNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 275, 224, 50));

        MAESTRO.setBackground(new java.awt.Color(0, 32, 96));
        MAESTRO.setFont(new java.awt.Font("Gilroy", 1, 30)); // NOI18N
        MAESTRO.setForeground(new java.awt.Color(255, 255, 255));
        MAESTRO.setText("Maestro");
        MAESTRO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MAESTRO.setBorderPainted(false);
        MAESTRO.setMaximumSize(new java.awt.Dimension(30, 50));
        MAESTRO.setMinimumSize(new java.awt.Dimension(130, 50));
        MAESTRO.setPreferredSize(new java.awt.Dimension(130, 50));
        MAESTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAESTROActionPerformed(evt);
            }
        });
        jPanel1.add(MAESTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 390, 223, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        getAccessibleContext().setAccessibleName("Libreria #LaMetro");
        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADMINSTRADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINSTRADORActionPerformed
        // Dirigir a LOGIN
        this.dispose();
            Login Log = new Login();
            Log.setVisible(true);
            
    }//GEN-LAST:event_ADMINSTRADORActionPerformed

    private void ALUMNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALUMNOActionPerformed
        // Dirigir a Registro o Visita del Alumno
        this.dispose();
            AlumnoRegistro alumno = new AlumnoRegistro();
            alumno.setVisible(true);
        
    }//GEN-LAST:event_ALUMNOActionPerformed

    private void MAESTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAESTROActionPerformed
        // Dirigir a Registro o Visita del Maestro o Adminstrativo
        this.dispose();
            MaestroRegistro maestro = new MaestroRegistro();
            maestro.setVisible(true);
        
    }//GEN-LAST:event_MAESTROActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ADMINSTRADOR;
    private javax.swing.JToggleButton ALUMNO;
    private javax.swing.JLabel LOGO_LIBRO;
    private javax.swing.JToggleButton MAESTRO;
    private javax.swing.JLabel TextoBiblioteca;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
