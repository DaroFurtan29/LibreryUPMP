
package edu.mx.metropoli.views;

import ConectionDB.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author #LaMetro
 */
public class Prestamos extends javax.swing.JPanel {

    public Prestamos() {
        initComponents();
            
    }

    public void mostrar(String tabla){
        String sql = "SELECT a.Nombre as alumno, a.Matricula as alumno, l.Titulo as libro, FechaInicio, FechaFinal, Estatus FROM prestamo p INNER JOIN alumno a on p.IDalumno = a.IDalumno join libro l on p.IDlibro = l.IDlibro; " + tabla;
        System.out.println(sql);
        Statement st;
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Alumno");
        model.addColumn("Matricula");
        model.addColumn("Libro");
        model.addColumn("Fecha de Prestamo");
        model.addColumn("Fecha de Entrega");
        model.addColumn("Estatus");
        prestamos.setModel(model);
        prestamos.getColumnModel().getColumn(0).setPreferredWidth(150);
        prestamos.getColumnModel().getColumn(1).setPreferredWidth(60);
        prestamos.getColumnModel().getColumn(2).setPreferredWidth(250);
        prestamos.getColumnModel().getColumn(3).setPreferredWidth(60);
        prestamos.getColumnModel().getColumn(4).setPreferredWidth(60);
        prestamos.getColumnModel().getColumn(0).setResizable(false);
        prestamos.getColumnModel().getColumn(1).setResizable(false);
        prestamos.getColumnModel().getColumn(2).setResizable(false);
        prestamos.getColumnModel().getColumn(3).setResizable(false);
        prestamos.getColumnModel().getColumn(4).setResizable(false);
        
        prestamos.setRowSelectionAllowed(false);
        prestamos.setRowHeight(25);
        
        String [] datos = new String[6];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                model.addRow(datos);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
}

    public void actualizar(){}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        MostrarPrestamos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prestamos = new javax.swing.JTable();
        Actualizar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1070, 450));
        setMinimumSize(new java.awt.Dimension(1070, 450));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1070, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Gotham", 0, 14)); // NOI18N
        jLabel4.setText("Libro");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 183, -1));

        jLabel3.setFont(new java.awt.Font("Gotham", 0, 14)); // NOI18N
        jLabel3.setText("Matricula");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 183, -1));

        jLabel8.setFont(new java.awt.Font("Gotham", 0, 36)); // NOI18N
        jLabel8.setText("Préstamos");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        matricula.setFont(new java.awt.Font("Gotham", 0, 14)); // NOI18N
        matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaActionPerformed(evt);
            }
        });
        jPanel1.add(matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 183, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 183, -1));

        MostrarPrestamos.setText("Mostrar Prestamos");
        MostrarPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPrestamosActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        prestamos.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        prestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        prestamos.setRowHeight(30);
        jScrollPane1.setViewportView(prestamos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 14, 830, 420));

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("Prestamos");
        jPanel1.getAccessibleContext().setAccessibleDescription("Consuta de informacion de los prestamos de libros de la UPMP");
    }// </editor-fold>//GEN-END:initComponents

    private void matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaActionPerformed

    }//GEN-LAST:event_matriculaActionPerformed

    private void MostrarPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPrestamosActionPerformed
        mostrar("");
    }//GEN-LAST:event_MostrarPrestamosActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        // ACTUALIZAR EL REGISTRO DEL PRESTAMO
        
        
        
    }//GEN-LAST:event_ActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Actualizar;
    public javax.swing.JButton MostrarPrestamos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField matricula;
    public javax.swing.JTable prestamos;
    // End of variables declaration//GEN-END:variables
}
