
package Usuarios;

// @author #LaMetro 

import ConectionDB.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Visitas_Alumno extends javax.swing.JPanel {

    public Visitas_Alumno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        matricula_text = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MATRICULA = new javax.swing.JTextField();
        RegistrarVisita = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(980, 530));
        setMinimumSize(new java.awt.Dimension(980, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(980, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        matricula_text.setBackground(new java.awt.Color(0, 0, 0));
        matricula_text.setFont(new java.awt.Font("Gotham", 0, 24)); // NOI18N
        matricula_text.setForeground(new java.awt.Color(0, 0, 0));
        matricula_text.setText("MATRICULA");
        jPanel1.add(matricula_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Gotham", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><center>Estimado Alumno, para llevar un control de las vistas de la Biblioteca<p>solo debes teclar tu Matricula Institucional<html>");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 980, 60));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Gotham", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRA TU VISITA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 60));

        MATRICULA.setFont(new java.awt.Font("Gotham", 0, 24)); // NOI18N
        MATRICULA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(MATRICULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 360, 40));

        RegistrarVisita.setBackground(new java.awt.Color(0, 32, 96));
        RegistrarVisita.setFont(new java.awt.Font("Gilroy", 0, 36)); // NOI18N
        RegistrarVisita.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarVisita.setText("REGISTRAR VISITA");
        RegistrarVisita.setBorderPainted(false);
        RegistrarVisita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegistrarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarVisitaActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 380, 50));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M MARCA DE AGUA.png"))); // NOI18N
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-378, 10, 755, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarVisitaActionPerformed
        // REGISTRAR VISITAS
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        String m ="";
        String query = "";
        
        m=MATRICULA.getText();
        
        query = "INSERT INTO visita (IDalumno,FechaVisita) VALUES ((select IDalumno from alumno where Matricula = ?),now());";
        //INSERT INTO visita (IDalumno,FechaVisita) values ((select IDalumno from alumno where Matricula = 2023111202), now());
        
        try{
            PreparedStatement pst = conexion.prepareStatement(query);
            
            pst.setString(1, m);
            int n=pst.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO");
        }
        
    }//GEN-LAST:event_RegistrarVisitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JTextField MATRICULA;
    private javax.swing.JButton RegistrarVisita;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel matricula_text;
    // End of variables declaration//GEN-END:variables
}
