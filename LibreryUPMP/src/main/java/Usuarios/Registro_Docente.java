
package Usuarios;

import ConectionDB.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**@author #LaMetro*/



public class Registro_Docente extends javax.swing.JPanel {

    public Registro_Docente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NOMBRE_TEXT = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JTextField();
        MATRICULA_TEXT = new javax.swing.JLabel();
        NUMERODOCENTE = new javax.swing.JTextField();
        CORREO_TEXT = new javax.swing.JLabel();
        CORREO = new javax.swing.JTextField();
        GENERO_TEXT = new javax.swing.JLabel();
        GENERO = new javax.swing.JTextField();
        REGISTRAR_BOTON = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(980, 530));
        setMinimumSize(new java.awt.Dimension(980, 530));
        setPreferredSize(new java.awt.Dimension(980, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gotham", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRO DE DOCENTES/ADMINISTRATIVOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 60));

        jLabel1.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><center>Estimado Docente/Personal Administrativo<p>Si vienes por primera vez a la Biblioteca de #LaMetro, haga primero su registro<html>");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 980, -1));

        NOMBRE_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        NOMBRE_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        NOMBRE_TEXT.setText("Nombre");
        jPanel1.add(NOMBRE_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 30));

        NOMBRE.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        jPanel1.add(NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 160, 320, -1));

        MATRICULA_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        MATRICULA_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        MATRICULA_TEXT.setText("Numero de Control");
        jPanel1.add(MATRICULA_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 30));

        NUMERODOCENTE.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        jPanel1.add(NUMERODOCENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 220, 320, -1));

        CORREO_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        CORREO_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        CORREO_TEXT.setText("<html>Correo<p>Institucional<hmtl>");
        jPanel1.add(CORREO_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 60));

        CORREO.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        jPanel1.add(CORREO, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 290, 320, 30));

        GENERO_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        GENERO_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        GENERO_TEXT.setText("Genero");
        jPanel1.add(GENERO_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 30));

        GENERO.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        jPanel1.add(GENERO, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 350, 320, -1));

        REGISTRAR_BOTON.setBackground(new java.awt.Color(0, 32, 96));
        REGISTRAR_BOTON.setFont(new java.awt.Font("Gilroy", 0, 36)); // NOI18N
        REGISTRAR_BOTON.setForeground(new java.awt.Color(255, 255, 255));
        REGISTRAR_BOTON.setText("REGISTRARME");
        REGISTRAR_BOTON.setBorderPainted(false);
        REGISTRAR_BOTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRAR_BOTONActionPerformed(evt);
            }
        });
        jPanel1.add(REGISTRAR_BOTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M MARCA DE AGUA.png"))); // NOI18N
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-378, 10, 755, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void REGISTRAR_BOTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRAR_BOTONActionPerformed
        // REGISTRAR DOCENTES
            Conectar con = new Conectar();
            Connection conexion = con.conectarToDB();
            String a, m, c, g="";
            int cr=5;
            String query = "";
           
            a=NOMBRE.getText();
            m=NUMERODOCENTE.getText();
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
        
    }//GEN-LAST:event_REGISTRAR_BOTONActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CORREO;
    private javax.swing.JLabel CORREO_TEXT;
    private javax.swing.JLabel FONDO;
    private javax.swing.JTextField GENERO;
    private javax.swing.JLabel GENERO_TEXT;
    private javax.swing.JLabel MATRICULA_TEXT;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JLabel NOMBRE_TEXT;
    private javax.swing.JTextField NUMERODOCENTE;
    private javax.swing.JButton REGISTRAR_BOTON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
