
package edu.mx.metropoli.views;

// @author #LaMetro

import ConectionDB.Conectar;
import ConectionDB.ExportarExcel;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import edu.mx.metropoli.libreryupmp.REGISTROLIBROS;

public class Libros extends javax.swing.JPanel {

    public Libros() {
        initComponents();
    }

    public void Mostrar(String tabla){
        String sql = "SELECT IDlibro, l.Titulo as Libro, a.Nombre as Autor, l.Codigo as Codigo_ISBN, l.Fecha as Fecha, l.Editorial from libro l join autor a on l.IDautor=a.IDautor;" + tabla;
        System.out.println(sql);
        Statement st;
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Numero");
        model.addColumn("Titulo del Libro");
        model.addColumn("Autor");
        model.addColumn("Codigo / ISBN");
        model.addColumn("Fecha");
        model.addColumn("Editorial");
        LIBROS.setModel(model);
        LIBROS.getColumnModel().getColumn(0).setPreferredWidth(40);
        LIBROS.getColumnModel().getColumn(1).setPreferredWidth(200);
        LIBROS.getColumnModel().getColumn(2).setPreferredWidth(100);
        LIBROS.getColumnModel().getColumn(3).setPreferredWidth(50);
        LIBROS.getColumnModel().getColumn(4).setPreferredWidth(75);
        LIBROS.getColumnModel().getColumn(0).setResizable(false);
        LIBROS.getColumnModel().getColumn(1).setResizable(false);
        LIBROS.getColumnModel().getColumn(2).setResizable(false);
        LIBROS.getColumnModel().getColumn(3).setResizable(false);
        LIBROS.getColumnModel().getColumn(4).setResizable(false);
        
        LIBROS.setRowSelectionAllowed(false);
        LIBROS.setRowHeight(25);
        
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
    public void BUSCAR (String consulta, JTable LIBROS) {
        dm = (DefaultTableModel) LIBROS.getModel();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        
        LIBROS.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LIBROBUSCAR = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        LIBROS = new javax.swing.JTable();
        MOSTRAR = new javax.swing.JButton();
        LIBROSNUEVOS = new javax.swing.JButton();
        EXPORTARDATOS = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1070, 450));
        setMinimumSize(new java.awt.Dimension(1070, 450));
        setPreferredSize(new java.awt.Dimension(1070, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gotham", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta de Libros");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1070, -1));

        jLabel2.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del Libro:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 413, -1, -1));

        LIBROBUSCAR.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        LIBROBUSCAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LIBROBUSCARKeyReleased(evt);
            }
        });
        jPanel1.add(LIBROBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 440, -1));

        LIBROS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(LIBROS);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 1050, 350));

        MOSTRAR.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        MOSTRAR.setText("Mostrar Todo");
        MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARActionPerformed(evt);
            }
        });
        jPanel1.add(MOSTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        LIBROSNUEVOS.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        LIBROSNUEVOS.setText("Registrar Libro");
        LIBROSNUEVOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIBROSNUEVOSActionPerformed(evt);
            }
        });
        jPanel1.add(LIBROSNUEVOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        EXPORTARDATOS.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        EXPORTARDATOS.setText("Exportar Datos");
        EXPORTARDATOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXPORTARDATOSActionPerformed(evt);
            }
        });
        jPanel1.add(EXPORTARDATOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

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

    private void MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARActionPerformed
        // MOSTRAR LIBROS
        Mostrar("");
    }//GEN-LAST:event_MOSTRARActionPerformed

    private void EXPORTARDATOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXPORTARDATOSActionPerformed
        // Exportar Datos
        ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(LIBROS);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_EXPORTARDATOSActionPerformed

    private void LIBROSNUEVOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIBROSNUEVOSActionPerformed
        // REGISTRAR NUEVOS LIBROS
        REGISTROLIBROS RL = new REGISTROLIBROS();
        RL.setVisible(true);
        
    }//GEN-LAST:event_LIBROSNUEVOSActionPerformed

    private void LIBROBUSCARKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LIBROBUSCARKeyReleased
        //BUSCAR LIBROS DE LA TABLA, NO DE LA BASE DE DATOS
        BUSCAR(LIBROBUSCAR.getText().toUpperCase(), LIBROS);
        
    }//GEN-LAST:event_LIBROBUSCARKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXPORTARDATOS;
    private javax.swing.JTextField LIBROBUSCAR;
    private javax.swing.JTable LIBROS;
    private javax.swing.JButton LIBROSNUEVOS;
    private javax.swing.JButton MOSTRAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
