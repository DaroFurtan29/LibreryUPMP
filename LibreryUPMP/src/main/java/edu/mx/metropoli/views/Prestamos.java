
package edu.mx.metropoli.views;

import ConectionDB.Conectar;
import ConectionDB.ExportarExcel;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

// @author #LaMetro

public class Prestamos extends javax.swing.JPanel {

    public Prestamos() {
        initComponents();
            
    }

    public void mostrar(String tabla){
        String sql = "SELECT a.Nombre as Nombre, a.Matricula as Matricula, c.Carrera as Carrera, l.Titulo as Titulo, FechaInicio, FechaFinal FROM prestamo p INNER JOIN alumno a on p.IDalumno = a.IDalumno JOIN carreras c ON c.idCarreras = a.idCarreras join libro l on p.IDlibro = l.IDlibro ORDER BY FechaInicio DESC;" + tabla;
        System.out.println(sql);
        Statement st;
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Alumno");
        model.addColumn("Matricula");
        model.addColumn("Carrera");
        model.addColumn("Libro");
        model.addColumn("Fecha de Prestamo");
        model.addColumn("Fecha de Entrega");
        prestamos.setModel(model);
        prestamos.getColumnModel().getColumn(0).setPreferredWidth(175);
        prestamos.getColumnModel().getColumn(1).setPreferredWidth(75);
        prestamos.getColumnModel().getColumn(2).setPreferredWidth(150);
        prestamos.getColumnModel().getColumn(3).setPreferredWidth(225);
        prestamos.getColumnModel().getColumn(4).setPreferredWidth(75);
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

    DefaultTableModel dm;
    public void BUSCAR (String consulta, JTable prestamos) {
        dm = (DefaultTableModel) prestamos.getModel();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        
        prestamos.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(MATRICULA.getText()));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        MATRICULA = new javax.swing.JTextField();
        MostrarPrestamos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prestamos = new javax.swing.JTable();
        ACTUALIZAR = new javax.swing.JButton();
        EXPORTAR = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1070, 450));
        setMinimumSize(new java.awt.Dimension(1070, 450));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1070, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gotham", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Matricula");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gotham", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Préstamos");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1070, -1));

        MATRICULA.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        MATRICULA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MATRICULAKeyReleased(evt);
            }
        });
        jPanel1.add(MATRICULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 150, -1));

        MostrarPrestamos.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        MostrarPrestamos.setText("Mostrar Todo");
        MostrarPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPrestamosActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        prestamos.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        prestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        prestamos.setRowHeight(30);
        jScrollPane1.setViewportView(prestamos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1050, 350));

        ACTUALIZAR.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        ACTUALIZAR.setText("Actualizar Prestamos");
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });
        jPanel1.add(ACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        EXPORTAR.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        EXPORTAR.setText("Exportar Datos");
        EXPORTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXPORTARActionPerformed(evt);
            }
        });
        jPanel1.add(EXPORTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 410, -1, -1));

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

    private void MostrarPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPrestamosActionPerformed
        mostrar("");
    }//GEN-LAST:event_MostrarPrestamosActionPerformed

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
        // ACTUALIZAR
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        String m ="";
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
        
    }//GEN-LAST:event_ACTUALIZARActionPerformed

    private void MATRICULAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MATRICULAKeyReleased
        // BUSCAR EN LA TABLA, NO EN BASE DE DATOS
        BUSCAR(MATRICULA.getText().toUpperCase(), prestamos);
    }//GEN-LAST:event_MATRICULAKeyReleased

    private void EXPORTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXPORTARActionPerformed
        // Exportar Datos
        ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(prestamos);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_EXPORTARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ACTUALIZAR;
    private javax.swing.JButton EXPORTAR;
    private javax.swing.JTextField MATRICULA;
    public javax.swing.JButton MostrarPrestamos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable prestamos;
    // End of variables declaration//GEN-END:variables
}
