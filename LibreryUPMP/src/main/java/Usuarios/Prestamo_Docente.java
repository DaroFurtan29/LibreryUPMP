
package Usuarios;

// @author #LaMetro

import ConectionDB.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Prestamo_Docente extends javax.swing.JPanel {

    public Prestamo_Docente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NUMERODOCENTE = new javax.swing.JTextField();
        LIBRO = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();
        DEVOLVER_LIBRO = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gotham", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRESTAMOS DE LIBROS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 60));

        jLabel2.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><center>Estimado Docente/Personal Administrativo<p>para cualquier prestamo o devolucion del libro tiene que llenar los siguientes campos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 980, -1));

        jLabel4.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Num de Control");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 30));

        jLabel3.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Titulo del Libro");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 30));

        NUMERODOCENTE.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        NUMERODOCENTE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(NUMERODOCENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 400, -1));

        LIBRO.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        LIBRO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(LIBRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 400, -1));

        jButton1.setBackground(new java.awt.Color(0, 35, 96));
        jButton1.setFont(new java.awt.Font("Gilroy", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRAR PRESTAMO");
        jButton1.setToolTipText("");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 60));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M MARCA DE AGUA.png"))); // NOI18N
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-378, 10, 755, 510));

        DEVOLVER_LIBRO.setBackground(new java.awt.Color(0, 35, 96));
        DEVOLVER_LIBRO.setFont(new java.awt.Font("Gilroy", 1, 36)); // NOI18N
        DEVOLVER_LIBRO.setForeground(new java.awt.Color(255, 255, 255));
        DEVOLVER_LIBRO.setText("REGISTRAR DEVOLUCION");
        DEVOLVER_LIBRO.setToolTipText("");
        DEVOLVER_LIBRO.setBorderPainted(false);
        DEVOLVER_LIBRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEVOLVER_LIBROActionPerformed(evt);
            }
        });
        jPanel1.add(DEVOLVER_LIBRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, 60));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // REGISTRAR EL PRESTAMO DEL LIBRO
        //INSERT INTO prestamo values (default,(select IDlibro from libro where Titulo = ?),(select IDalumno from alumno where Matricula = 2023140013),now(),null,1);
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        String m,l ="";
        String query = "";
        
        m=NUMERODOCENTE.getText();
        l=LIBRO.getText();
        
        query = "INSERT INTO prestamo values (default,(select IDlibro from libro where UPPER(Titulo) LIKE ?),(select IDalumno from alumno where Matricula = ?),now(),null);";
        //       INSERT INTO prestamo values (default,(select IDlibro from libro where UPPER(Titulo) LIKE '%algebra lineal%'),(select IDalumno from alumno where Matricula = 2023140013),now(),null);
        
        try{
            PreparedStatement pst = conexion.prepareStatement(query);
            
            pst.setString(1, l);
            pst.setString(2, m);
            int n=pst.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DEVOLVER_LIBROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEVOLVER_LIBROActionPerformed
        // DEVOLVER EL LIBRO
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        String m="";
        String query = "";
        
        m=NUMERODOCENTE.getText();
        
        query = "UPDATE prestamo set FechaFinal = NOW() where IDalumno = (select IDalumno from alumno where Matricula = ?);";
        //       UPDATE prestamo set FechaFinal = NOW() where IDalumno = (select IDalumno from alumno where Matricula = 197);
        
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
        
    }//GEN-LAST:event_DEVOLVER_LIBROActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DEVOLVER_LIBRO;
    private javax.swing.JLabel FONDO;
    private javax.swing.JTextField LIBRO;
    private javax.swing.JTextField NUMERODOCENTE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
