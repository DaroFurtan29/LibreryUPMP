
package Usuarios;

// @author #LaMetro

import ConectionDB.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Prestamo_Alumno extends javax.swing.JPanel {

    public Prestamo_Alumno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TITULO_TEXT = new javax.swing.JLabel();
        DESCRIPCION_TEXT = new javax.swing.JLabel();
        MATRICULA = new javax.swing.JTextField();
        LIBRO_TEXT = new javax.swing.JLabel();
        LIBRO = new javax.swing.JTextField();
        MATRICULA_TEXT1 = new javax.swing.JLabel();
        PRESTAR_LIBRO = new javax.swing.JButton();
        DEVOLVER_LIBRO = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(980, 530));
        setMinimumSize(new java.awt.Dimension(980, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(980, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TITULO_TEXT.setFont(new java.awt.Font("Gotham", 3, 36)); // NOI18N
        TITULO_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        TITULO_TEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITULO_TEXT.setText("PRESTAMOS DE LIBROS");
        TITULO_TEXT.setAlignmentY(0.0F);
        jPanel1.add(TITULO_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 60));

        DESCRIPCION_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        DESCRIPCION_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        DESCRIPCION_TEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DESCRIPCION_TEXT.setText("<html><center>Estimado Alumno<p>para cualquier prestamo o devolucion del libro tiene que llenar los siguientes campos<html>");
        jPanel1.add(DESCRIPCION_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 980, -1));

        MATRICULA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(MATRICULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 400, 30));

        LIBRO_TEXT.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        LIBRO_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        LIBRO_TEXT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LIBRO_TEXT.setText("Titulo del Libro");
        LIBRO_TEXT.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(LIBRO_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 30));

        LIBRO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(LIBRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 400, 30));

        MATRICULA_TEXT1.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        MATRICULA_TEXT1.setForeground(new java.awt.Color(0, 0, 0));
        MATRICULA_TEXT1.setText("Matricula");
        jPanel1.add(MATRICULA_TEXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 30));

        PRESTAR_LIBRO.setBackground(new java.awt.Color(0, 35, 96));
        PRESTAR_LIBRO.setFont(new java.awt.Font("Gilroy", 1, 36)); // NOI18N
        PRESTAR_LIBRO.setForeground(new java.awt.Color(255, 255, 255));
        PRESTAR_LIBRO.setText("REGISTRAR PRESTAMO");
        PRESTAR_LIBRO.setToolTipText("");
        PRESTAR_LIBRO.setBorderPainted(false);
        PRESTAR_LIBRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESTAR_LIBROActionPerformed(evt);
            }
        });
        jPanel1.add(PRESTAR_LIBRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 60));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PRESTAR_LIBROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESTAR_LIBROActionPerformed
        // REGISTRAR EL PRESTAMO DEL LIBRO
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        String m,l ="";
        String query = "";
        
        m=MATRICULA.getText();
        l=LIBRO.getText();
        
        query = "INSERT INTO prestamo values (default,(select IDlibro from libro where UPPER(Titulo) LIKE '%?%'),(select IDalumno from alumno where Matricula = ?),now(),null);";
        //       INSERT INTO prestamo values (default,(select IDlibro from libro where UPPER(Titulo) LIKE '%algebra lineal%'),(select IDalumno from alumno where Matricula = 2023140013),now(),null);
        
        try{
            PreparedStatement pst = conexion.prepareStatement(query);
            
            pst.setString(1, m);
            pst.setString(1, l);
            int n=pst.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO");
        }
        
    }//GEN-LAST:event_PRESTAR_LIBROActionPerformed

    private void DEVOLVER_LIBROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEVOLVER_LIBROActionPerformed
        // DEVOLVER EL LIBRO
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        String m="";
        String query = "";
        
        m=MATRICULA.getText();
        
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
    private javax.swing.JLabel DESCRIPCION_TEXT;
    private javax.swing.JButton DEVOLVER_LIBRO;
    private javax.swing.JLabel FONDO;
    private javax.swing.JTextField LIBRO;
    private javax.swing.JLabel LIBRO_TEXT;
    private javax.swing.JTextField MATRICULA;
    private javax.swing.JLabel MATRICULA_TEXT1;
    private javax.swing.JButton PRESTAR_LIBRO;
    private javax.swing.JLabel TITULO_TEXT;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
