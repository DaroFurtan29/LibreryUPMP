
package Usuarios;

// @author #LaMetro

import ConectionDB.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Registro_Alumno extends javax.swing.JPanel {

    public Registro_Alumno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TITULO_TEXT = new javax.swing.JLabel();
        DESCRIPCION_TEXT = new javax.swing.JLabel();
        NOMBRE_TEXT = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JTextField();
        MATRICULA_TEXT = new javax.swing.JLabel();
        MATRICULA = new javax.swing.JTextField();
        CARRERA_TEXT = new javax.swing.JLabel();
        CARRERA = new javax.swing.JComboBox<>();
        CORREO_TEXT = new javax.swing.JLabel();
        CORREO = new javax.swing.JTextField();
        GENERO = new javax.swing.JTextField();
        GENERO_TEXT = new javax.swing.JLabel();
        REGISTRO = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(980, 530));
        setMinimumSize(new java.awt.Dimension(980, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(980, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TITULO_TEXT.setFont(new java.awt.Font("Gotham", 3, 36)); // NOI18N
        TITULO_TEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITULO_TEXT.setText("REGISTRO DE ALUMNO");
        jPanel1.add(TITULO_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 60));

        DESCRIPCION_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        DESCRIPCION_TEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DESCRIPCION_TEXT.setText("<html><center>Estimado Alumno<p>Registrate si vienes por primera vez a la Biblioteca de #LaMetro<html>");
        jPanel1.add(DESCRIPCION_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 980, -1));

        NOMBRE_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        NOMBRE_TEXT.setText("Nombre");
        jPanel1.add(NOMBRE_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 30));

        NOMBRE.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBREActionPerformed(evt);
            }
        });
        jPanel1.add(NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 320, 30));

        MATRICULA_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        MATRICULA_TEXT.setText("Matricula");
        jPanel1.add(MATRICULA_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 30));

        MATRICULA.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        jPanel1.add(MATRICULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 320, 30));

        CARRERA_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        CARRERA_TEXT.setText("Carrera");
        jPanel1.add(CARRERA_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 30));

        CARRERA.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        CARRERA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ingenieria en Sistemas Computacionales", "Ingenieria en Biotecnologia", "Ingenieria en Administracion y Gestion Empresarial", "Ingenieria en Logistica y Transporte" }));
        jPanel1.add(CARRERA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 320, -1));

        CORREO_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        CORREO_TEXT.setText("<html>Correo <p>Institucional<hmtl>");
        jPanel1.add(CORREO_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 325, -1, 60));

        CORREO.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        jPanel1.add(CORREO, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 320, 30));

        GENERO.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        jPanel1.add(GENERO, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 320, 30));

        GENERO_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        GENERO_TEXT.setText("Genero");
        jPanel1.add(GENERO_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, 30));

        REGISTRO.setBackground(new java.awt.Color(0, 32, 96));
        REGISTRO.setFont(new java.awt.Font("Gilroy", 0, 36)); // NOI18N
        REGISTRO.setForeground(new java.awt.Color(255, 255, 255));
        REGISTRO.setText("REGISTRARME");
        REGISTRO.setBorderPainted(false);
        REGISTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTROActionPerformed(evt);
            }
        });
        jPanel1.add(REGISTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

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

    private void REGISTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTROActionPerformed
        // REGISTRAR ALUMNO
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        String a, m, c, g="";
        int cr=0;
        String query = "";
           
        a=NOMBRE.getText();
        m=MATRICULA.getText();
        cr=CARRERA.getSelectedIndex();
        c=CORREO.getText();
        g=GENERO.getText();
        query = "INSERT INTO alumno (Nombre, Matricula, idCarreras, Correo, Genero) VALUES (?,?,?,?,?);";
        
        try{
            PreparedStatement pst = conexion.prepareStatement(query);
            
            pst.setString(1, a);
            pst.setString(2, m);
            pst.setInt(3, cr);
            pst.setString(4, c);
            pst.setString(5, g);
            int n=pst.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO");
        }
        
    }//GEN-LAST:event_REGISTROActionPerformed

    private void NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBREActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CARRERA;
    private javax.swing.JLabel CARRERA_TEXT;
    private javax.swing.JTextField CORREO;
    private javax.swing.JLabel CORREO_TEXT;
    private javax.swing.JLabel DESCRIPCION_TEXT;
    private javax.swing.JLabel FONDO;
    private javax.swing.JTextField GENERO;
    private javax.swing.JLabel GENERO_TEXT;
    private javax.swing.JTextField MATRICULA;
    private javax.swing.JLabel MATRICULA_TEXT;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JLabel NOMBRE_TEXT;
    private javax.swing.JButton REGISTRO;
    private javax.swing.JLabel TITULO_TEXT;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
