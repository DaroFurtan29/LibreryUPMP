
package Usuarios;

import edu.mx.metropoli.libreryupmp.Usuario;
import java.awt.BorderLayout;
import javax.swing.JPanel;

// @author #LaMetro

public class MaestroRegistro extends javax.swing.JFrame {

    public MaestroRegistro() {
        initComponents();
        initContent();
    }

    private void ShowPanel(JPanel p) {
        p.setSize(980, 530);
        p.setLocation(0, 0);
        
        ventana.removeAll();
        ventana.add(p, BorderLayout.CENTER);
        ventana.revalidate();
        ventana.repaint();
    }
    
    private void initContent() {
        ShowPanel(new Visita_Docente());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        TITULO_TEXT = new javax.swing.JLabel();
        VISITA = new javax.swing.JButton();
        PRESTAMO = new javax.swing.JButton();
        COMPUTADORA = new javax.swing.JButton();
        REGISTRATE = new javax.swing.JButton();
        ventana = new javax.swing.JPanel();
        REGRESAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Docentes/Adminstrativos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(32, 59, 104));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO M c-letra LAMETRO.png"))); // NOI18N
        jPanel1.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        TITULO_TEXT.setBackground(new java.awt.Color(255, 255, 255));
        TITULO_TEXT.setFont(new java.awt.Font("Gotham", 1, 20)); // NOI18N
        TITULO_TEXT.setForeground(new java.awt.Color(255, 255, 255));
        TITULO_TEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITULO_TEXT.setText("<html><center>BIENVENIDO DOCENTE / PERSONAL ADMINISTRATIVO AL<p>PROGRAMA DE ADMINISTRACION BIBLIOTECARIA #LaMetro<html>");
        jPanel1.add(TITULO_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 980, 90));

        VISITA.setBackground(new java.awt.Color(225, 94, 41));
        VISITA.setFont(new java.awt.Font("Gotham", 1, 18)); // NOI18N
        VISITA.setForeground(new java.awt.Color(255, 255, 255));
        VISITA.setText("VISITA");
        VISITA.setBorderPainted(false);
        VISITA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VISITA.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        VISITA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VISITAActionPerformed(evt);
            }
        });
        jPanel1.add(VISITA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 175, 75));

        PRESTAMO.setBackground(new java.awt.Color(225, 94, 41));
        PRESTAMO.setFont(new java.awt.Font("Gotham", 1, 18)); // NOI18N
        PRESTAMO.setForeground(new java.awt.Color(255, 255, 255));
        PRESTAMO.setText("PRESTAMO");
        PRESTAMO.setBorderPainted(false);
        PRESTAMO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PRESTAMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESTAMOActionPerformed(evt);
            }
        });
        jPanel1.add(PRESTAMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 175, 75));

        COMPUTADORA.setBackground(new java.awt.Color(225, 94, 41));
        COMPUTADORA.setFont(new java.awt.Font("Gotham", 1, 18)); // NOI18N
        COMPUTADORA.setForeground(new java.awt.Color(255, 255, 255));
        COMPUTADORA.setText("<html><center>USO DE COMPUTADORA<html>");
        COMPUTADORA.setBorderPainted(false);
        COMPUTADORA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        COMPUTADORA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPUTADORAActionPerformed(evt);
            }
        });
        jPanel1.add(COMPUTADORA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 175, 75));

        REGISTRATE.setBackground(new java.awt.Color(225, 94, 41));
        REGISTRATE.setFont(new java.awt.Font("Gotham", 1, 18)); // NOI18N
        REGISTRATE.setForeground(new java.awt.Color(255, 255, 255));
        REGISTRATE.setText("REGISTRATE");
        REGISTRATE.setBorderPainted(false);
        REGISTRATE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        REGISTRATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRATEActionPerformed(evt);
            }
        });
        jPanel1.add(REGISTRATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 175, 75));

        ventana.setBackground(new java.awt.Color(255, 255, 255));
        ventana.setMaximumSize(new java.awt.Dimension(980, 530));
        ventana.setMinimumSize(new java.awt.Dimension(980, 530));

        javax.swing.GroupLayout ventanaLayout = new javax.swing.GroupLayout(ventana);
        ventana.setLayout(ventanaLayout);
        ventanaLayout.setHorizontalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        ventanaLayout.setVerticalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel1.add(ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 980, 530));

        REGRESAR.setBackground(new java.awt.Color(0, 35, 96));
        REGRESAR.setFont(new java.awt.Font("Gotham", 1, 18)); // NOI18N
        REGRESAR.setForeground(new java.awt.Color(255, 255, 255));
        REGRESAR.setText("REGRESAR");
        REGRESAR.setBorderPainted(false);
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });
        jPanel1.add(REGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 555, 150, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 650));

        getAccessibleContext().setAccessibleName("Programa de Administracion Bibliotecaria #LaMetro");
        getAccessibleContext().setAccessibleDescription("Programa que registrar la visita, prestamo de libros y/o uso de computadoras de la Biblioteca de la Universidad Politecnica Metropolitana de Puebla");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VISITAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VISITAActionPerformed
        // ver formulario de visitas

        ShowPanel(new Visita_Docente());

    }//GEN-LAST:event_VISITAActionPerformed

    private void PRESTAMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESTAMOActionPerformed
        // Ver formulario de prestamo de libros

        ShowPanel(new Prestamo_Docente());

    }//GEN-LAST:event_PRESTAMOActionPerformed

    private void COMPUTADORAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPUTADORAActionPerformed
        // Ver formulario de uso de la computadoras

        ShowPanel(new Computadora_Docente());

    }//GEN-LAST:event_COMPUTADORAActionPerformed

    private void REGISTRATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRATEActionPerformed
        // formulario de registro

        ShowPanel(new Registro_Docente());

    }//GEN-LAST:event_REGISTRATEActionPerformed

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
        // regresar a la pantalla anterior

        this.dispose();
        Usuario usuario = new Usuario();
        usuario.setVisible(true);

    }//GEN-LAST:event_REGRESARActionPerformed

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
            java.util.logging.Logger.getLogger(MaestroRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaestroRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaestroRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaestroRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaestroRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton COMPUTADORA;
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton PRESTAMO;
    private javax.swing.JButton REGISTRATE;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JLabel TITULO_TEXT;
    private javax.swing.JButton VISITA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel ventana;
    // End of variables declaration//GEN-END:variables
}
