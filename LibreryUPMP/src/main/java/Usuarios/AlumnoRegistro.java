
package Usuarios;

import edu.mx.metropoli.libreryupmp.Usuario;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author #LaMetro
 */
public class AlumnoRegistro extends javax.swing.JFrame {


    public AlumnoRegistro() {
        initComponents();
    }
    
    // 
       private void ShowPanel(JPanel p) {
        p.setSize(980, 530);
        p.setLocation(0, 0);
        
        ventana.removeAll();
        ventana.add(p, BorderLayout.CENTER);
        ventana.revalidate();
        ventana.repaint();
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        REGRESAR = new javax.swing.JToggleButton();
        VISITA = new javax.swing.JToggleButton();
        REGISTRAR_NUEVO = new javax.swing.JToggleButton();
        PRESTAMO_REG1 = new javax.swing.JToggleButton();
        USO_COMPUTADORA = new javax.swing.JToggleButton();
        ventana = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Alumnos");
        setBackground(new java.awt.Color(32, 59, 104));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1250, 700));
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setPreferredSize(new java.awt.Dimension(1250, 700));
        setSize(new java.awt.Dimension(1250, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(32, 59, 104));
        jPanel1.setMaximumSize(new java.awt.Dimension(1250, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(1250, 700));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO ALUMNOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 740, 30));

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO M c-letra LAMETRO.png"))); // NOI18N
        jPanel1.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        REGRESAR.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        REGRESAR.setText("REGRESAR");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });
        jPanel1.add(REGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 150, 60));

        VISITA.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        VISITA.setText("VISITA");
        VISITA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VISITAActionPerformed(evt);
            }
        });
        jPanel1.add(VISITA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 175, 75));

        REGISTRAR_NUEVO.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        REGISTRAR_NUEVO.setText("REGISTRATE");
        REGISTRAR_NUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRAR_NUEVOActionPerformed(evt);
            }
        });
        jPanel1.add(REGISTRAR_NUEVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 175, 75));

        PRESTAMO_REG1.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        PRESTAMO_REG1.setText("PRESTAMO");
        PRESTAMO_REG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESTAMO_REG1ActionPerformed(evt);
            }
        });
        jPanel1.add(PRESTAMO_REG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 175, 75));

        USO_COMPUTADORA.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        USO_COMPUTADORA.setText("<html><center>USOO DE COMPUTADORA<html>");
        USO_COMPUTADORA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USO_COMPUTADORAActionPerformed(evt);
            }
        });
        jPanel1.add(USO_COMPUTADORA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 175, 75));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 700));

        getAccessibleContext().setAccessibleDescription("Registrar la visita, prestamo de libros o el uso de las computadoras de la Biblioteca");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VISITAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VISITAActionPerformed
        // PONER FORMULARIO DE VISITA
        
        ShowPanel(new Visitas_Alumno());
        
    }//GEN-LAST:event_VISITAActionPerformed

    private void PRESTAMO_REG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESTAMO_REG1ActionPerformed
        // PONER FORMULARIO DE PRESTAMO
        
        ShowPanel(new Prestamo_Alumno());
        
    }//GEN-LAST:event_PRESTAMO_REG1ActionPerformed

    private void USO_COMPUTADORAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USO_COMPUTADORAActionPerformed
        // PONER USO DE LA COMPUTADORA
        
        ShowPanel(new Computadora_Alumno());
        
    }//GEN-LAST:event_USO_COMPUTADORAActionPerformed

    private void REGISTRAR_NUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRAR_NUEVOActionPerformed
        // FORMULARIO SI EL ALUMNO ES NUEVO
        
        ShowPanel(new Registro_Alumno());
        
    }//GEN-LAST:event_REGISTRAR_NUEVOActionPerformed

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
        // REGRESAR A LA PANTALLA ANTERIOR - POR CUALQUIER CAUSA 
        
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
            java.util.logging.Logger.getLogger(AlumnoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnoRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JToggleButton PRESTAMO_REG1;
    private javax.swing.JToggleButton REGISTRAR_NUEVO;
    private javax.swing.JToggleButton REGRESAR;
    private javax.swing.JToggleButton USO_COMPUTADORA;
    private javax.swing.JToggleButton VISITA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel ventana;
    // End of variables declaration//GEN-END:variables
}
