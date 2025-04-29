
package Usuarios;

// @author #LaMetro

import ConectionDB.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Computadora_Docente extends javax.swing.JPanel {

    public Computadora_Docente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DESCRIPCION_TEXT = new javax.swing.JLabel();
        NUMERODOCENTE_TEXT = new javax.swing.JLabel();
        DOCENTE = new javax.swing.JTextField();
        COMPUTADORA_TEXT = new javax.swing.JLabel();
        COMPUTADORA = new javax.swing.JComboBox<>();
        REGISTRO = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MARCA DE AGUA LA METRO.png"))); // NOI18N

        setMaximumSize(new java.awt.Dimension(980, 530));
        setMinimumSize(new java.awt.Dimension(980, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMaximumSize(new java.awt.Dimension(980, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gotham", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USO DE COMPUTADORAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 60));

        DESCRIPCION_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        DESCRIPCION_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        DESCRIPCION_TEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DESCRIPCION_TEXT.setText("<html><center>Estimado Docente/Personal Administrativo<p>Registrate si usaras un equipo de computo de la Biblioteca de #LaMetro<html>");
        jPanel1.add(DESCRIPCION_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 980, -1));

        NUMERODOCENTE_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        NUMERODOCENTE_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        NUMERODOCENTE_TEXT.setText("Numero de Control");
        jPanel1.add(NUMERODOCENTE_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 30));

        DOCENTE.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        jPanel1.add(DOCENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 180, 320, 30));

        COMPUTADORA_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        COMPUTADORA_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        COMPUTADORA_TEXT.setText("<html><center>Numero de<p>Computadora<html>");
        jPanel1.add(COMPUTADORA_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 330, -1, 60));

        COMPUTADORA.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        COMPUTADORA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1", "2", "3", "4", "6", "7" }));
        jPanel1.add(COMPUTADORA, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 350, 320, 30));

        REGISTRO.setBackground(new java.awt.Color(0, 32, 96));
        REGISTRO.setFont(new java.awt.Font("Gilroy", 0, 36)); // NOI18N
        REGISTRO.setForeground(new java.awt.Color(255, 255, 255));
        REGISTRO.setText("REGISTRAR");
        REGISTRO.setBorderPainted(false);
        REGISTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTROActionPerformed(evt);
            }
        });
        jPanel1.add(REGISTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, -1, 60));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M MARCA DE AGUA.png"))); // NOI18N
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-378, 10, 755, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void REGISTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTROActionPerformed
        //REGISTRAR ALUMNO
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        String m="";
        int com=0;
        String query = "";

        m=DOCENTE.getText();
        com=COMPUTADORA.getSelectedIndex();
        query = "INSERT INTO computadora VALUES (default, (select IDalumno from alumno where Matricula = ?),?,now());";
        try{
            PreparedStatement pst = conexion.prepareStatement(query);

            pst.setString(1, m);
            pst.setInt(2, com);
            int n=pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO");
        }
    }//GEN-LAST:event_REGISTROActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> COMPUTADORA;
    private javax.swing.JLabel COMPUTADORA_TEXT;
    private javax.swing.JLabel DESCRIPCION_TEXT;
    private javax.swing.JTextField DOCENTE;
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel NUMERODOCENTE_TEXT;
    private javax.swing.JButton REGISTRO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
