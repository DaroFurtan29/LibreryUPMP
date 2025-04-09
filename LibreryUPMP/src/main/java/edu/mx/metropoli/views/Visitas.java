
package edu.mx.metropoli.views;

import ConectionDB.Conectar;
import edu.mx.metropoli.libreryupmp.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author #LaMetro
 */
public class Visitas extends javax.swing.JPanel {

    public Visitas() {
        initComponents();
    }

    public void Actualizar(String tabla){
        String sql = "SELECT a.Nombre as alumno, a.Matricula as alumno, a.Genero as alumno, c.Carrera as carreras, FechaVisita FROM visita v JOIN alumno a ON v.IDalumno = a.IDalumno JOIN carreras c ON v.IDalumno = c.idCarreras ORDER BY FechaVisita ASC;" + tabla;
        System.out.println(sql);
        Statement st;
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Alumno");
        model.addColumn("Matricula");
        model.addColumn("Genero");
        model.addColumn("Carrera");
        model.addColumn("Fecha de Vista");
        VISITA.setModel(model);
        VISITA.getColumnModel().getColumn(0).setPreferredWidth(150);
        VISITA.getColumnModel().getColumn(1).setPreferredWidth(65);
        VISITA.getColumnModel().getColumn(2).setPreferredWidth(55);
        VISITA.getColumnModel().getColumn(3).setPreferredWidth(170);
        VISITA.getColumnModel().getColumn(0).setResizable(false);
        VISITA.getColumnModel().getColumn(1).setResizable(false);
        VISITA.getColumnModel().getColumn(2).setResizable(false);
        VISITA.getColumnModel().getColumn(3).setResizable(false);
        
        VISITA.setRowSelectionAllowed(false);
        VISITA.setRowHeight(25);
        
        String [] datos = new String[5];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                model.addRow(datos);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
}
    
    public void Genero(String tabla){
        String sql = "SELECT a.Nombre as alumno, a.Matricula as alumno, a.Genero as alumno, c.Carrera as carreras, FechaVisita FROM visita v JOIN alumno a ON v.IDalumno = a.IDalumno JOIN carreras c ON v.IDalumno = c.idCarreras ORDER BY FechaVisita ASC;" + tabla;
        System.out.println(sql);
        Statement st;
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Alumno");
        model.addColumn("Matricula");
        TOTAL_VISITAS.setModel(model);
        TOTAL_VISITAS.getColumnModel().getColumn(0).setPreferredWidth(150);
        TOTAL_VISITAS.getColumnModel().getColumn(1).setPreferredWidth(65);
        TOTAL_VISITAS.getColumnModel().getColumn(0).setResizable(false);
        TOTAL_VISITAS.getColumnModel().getColumn(1).setResizable(false);

        
        VISITA.setRowSelectionAllowed(false);
        VISITA.setRowHeight(25);
        
        String [] datos = new String[2];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                model.addRow(datos);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TEXT_TOTAL = new javax.swing.JLabel();
        TEXT_VISITA = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VISITA = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TOTAL_VISITAS = new javax.swing.JTable();
        REGISTRAR = new javax.swing.JButton();
        ACTUALIZAR = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1070, 450));
        setMinimumSize(new java.awt.Dimension(1070, 450));
        setPreferredSize(new java.awt.Dimension(1070, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TEXT_TOTAL.setFont(new java.awt.Font("Gotham", 1, 18)); // NOI18N
        TEXT_TOTAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXT_TOTAL.setText("Total de Visitas");
        jPanel1.add(TEXT_TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 150, -1));

        TEXT_VISITA.setFont(new java.awt.Font("Gotham", 1, 24)); // NOI18N
        TEXT_VISITA.setText("Visitas");
        jPanel1.add(TEXT_VISITA, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        VISITA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(VISITA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 700, 390));

        TOTAL_VISITAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mujeres", "Hombres"
            }
        ));
        jScrollPane2.setViewportView(TOTAL_VISITAS);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 90, 150, 200));

        REGISTRAR.setFont(new java.awt.Font("Gotham", 1, 18)); // NOI18N
        REGISTRAR.setText("REGISTRAR");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });
        jPanel1.add(REGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        ACTUALIZAR.setFont(new java.awt.Font("Gotham", 1, 18)); // NOI18N
        ACTUALIZAR.setText("ACTUALIZAR");
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });
        jPanel1.add(ACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
        // REGISTRAR VISITAS
        
        
    }//GEN-LAST:event_REGISTRARActionPerformed

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
        // ACTUALIZAR TABLA DE VISITAS
        Actualizar("");
    }//GEN-LAST:event_ACTUALIZARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JLabel TEXT_TOTAL;
    private javax.swing.JLabel TEXT_VISITA;
    private javax.swing.JTable TOTAL_VISITAS;
    private javax.swing.JTable VISITA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
