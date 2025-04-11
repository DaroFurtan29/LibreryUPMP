
package Usuarios;

import edu.mx.metropoli.libreryupmp.Usuario;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// @author #LaMetro

public class AlumnoRegistro extends javax.swing.JFrame {


    public AlumnoRegistro() {
        initComponents();
        SetDate(); 
        initContent();
    }
    
    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        // dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
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
        ShowPanel(new Visitas_Alumno());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TITULO_TEXT = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        VISITA = new javax.swing.JButton();
        PRESTAMO = new javax.swing.JButton();
        COMPUTADORA = new javax.swing.JButton();
        REGISTRATE = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();
        ventana = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        TITULO_TEXT.setBackground(new java.awt.Color(255, 255, 255));
        TITULO_TEXT.setFont(new java.awt.Font("Gotham", 1, 20)); // NOI18N
        TITULO_TEXT.setForeground(new java.awt.Color(255, 255, 255));
        TITULO_TEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITULO_TEXT.setText("BIENVENIDO ALUMNO AL PROGRAMA DE ADMINISTRACION BIBLIOTECARIA #LaMetro");
        jPanel1.add(TITULO_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 980, 90));

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO M c-letra LAMETRO.png"))); // NOI18N
        jPanel1.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void COMPUTADORAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPUTADORAActionPerformed
        // Ver formulario de uso de la computadoras
        
        ShowPanel(new Computadora_Alumno());
        
    }//GEN-LAST:event_COMPUTADORAActionPerformed

    private void VISITAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VISITAActionPerformed
        // ver formulario de visitas
        
        ShowPanel(new Visitas_Alumno());
        
    }//GEN-LAST:event_VISITAActionPerformed

    private void PRESTAMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESTAMOActionPerformed
        // Ver formulario de prestamo de libros
        
        ShowPanel(new Prestamo_Alumno());
        
    }//GEN-LAST:event_PRESTAMOActionPerformed

    private void REGISTRATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRATEActionPerformed
        // formulario de registro
        
        ShowPanel(new Registro_Alumno());
        
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
