
package edu.mx.metropoli.views;

//@author #LaMetro

import Usuarios.*;
import edu.mx.metropoli.libreryupmp.Main;
import ConectionDB.Conectar;
import ConectionDB.ExportarExcel;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Visitas extends javax.swing.JPanel {

    public Visitas() {
        initComponents();
    }

    public void Actualizar(String tabla){
        String sql = "SELECT ALL a.Nombre as Nombre, a.Matricula as Matricula, a.Genero as Genero, c.Carrera as Carrera, FechaVisita FROM visita v JOIN alumno a ON v.IDalumno = a.IDalumno JOIN carreras c ON c.idCarreras = a.idCarreras ORDER BY FechaVisita DESC;" + tabla;
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
        VISITA.getColumnModel().getColumn(2).setPreferredWidth(40);
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
        String sql = "SELECT a.Genero as alumno, count(a.Genero) as Total FROM visita v INNER JOIN alumno a ON v.IDalumno = a.IDalumno WHERE a.Genero = \"H\" or a.Genero = \"M\" GROUP BY Genero;" + tabla;
        System.out.println(sql);
        Statement st;
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Genero");
        model.addColumn("Total");
        TOTAL_VISITAS.setModel(model);
        TOTAL_VISITAS.getColumnModel().getColumn(0).setPreferredWidth(45);
        TOTAL_VISITAS.getColumnModel().getColumn(1).setPreferredWidth(45);
        TOTAL_VISITAS.getColumnModel().getColumn(0).setResizable(false);
        TOTAL_VISITAS.getColumnModel().getColumn(1).setResizable(false);

        
        TOTAL_VISITAS.setRowSelectionAllowed(false);
        TOTAL_VISITAS.setRowHeight(25);
        
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

        GRUPO_REGISTRO = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TEXT_VISITA = new javax.swing.JLabel();
        TEXT_TOTAL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VISITA = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TOTAL_VISITAS = new javax.swing.JTable();
        ACTUALIZAR = new javax.swing.JButton();
        REGISTRAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MATRICULA = new javax.swing.JTextField();
        CONCENTRAR = new javax.swing.JButton();
        EXPORTAR = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1070, 450));
        setMinimumSize(new java.awt.Dimension(1070, 450));
        setPreferredSize(new java.awt.Dimension(1070, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TEXT_VISITA.setFont(new java.awt.Font("Gotham", 1, 24)); // NOI18N
        TEXT_VISITA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXT_VISITA.setText("Visitas");
        jPanel1.add(TEXT_VISITA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1070, -1));

        TEXT_TOTAL.setFont(new java.awt.Font("Gotham", 1, 18)); // NOI18N
        TEXT_TOTAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXT_TOTAL.setText("Total de Visitas");
        jPanel1.add(TEXT_TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 150, -1));

        VISITA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(VISITA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 730, 390));

        TOTAL_VISITAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TOTAL_VISITAS);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 90, 150, 110));

        ACTUALIZAR.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        ACTUALIZAR.setText("Mostrar / Actualizar");
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });
        jPanel1.add(ACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        REGISTRAR.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        REGISTRAR.setText("REGISTRAR");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });
        jPanel1.add(REGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, -1));

        jLabel1.setFont(new java.awt.Font("Gotham", 0, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><center>Inserte la Matricula o<p>Numero del Control<p>para registar<html>");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 180, 150, -1));

        MATRICULA.setFont(new java.awt.Font("Gotham", 0, 14)); // NOI18N
        MATRICULA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(MATRICULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 150, -1));

        CONCENTRAR.setFont(new java.awt.Font("Gilroy", 0, 18)); // NOI18N
        CONCENTRAR.setText("CONCENTRAR");
        CONCENTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONCENTRARActionPerformed(evt);
            }
        });
        jPanel1.add(CONCENTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, 150, -1));

        EXPORTAR.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        EXPORTAR.setText("Exportar Datos");
        EXPORTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXPORTARActionPerformed(evt);
            }
        });
        jPanel1.add(EXPORTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 150, -1));

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
    }//GEN-LAST:event_REGISTRARActionPerformed

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
        // ACTUALIZAR TABLA DE VISITAS
        Actualizar("");
    }//GEN-LAST:event_ACTUALIZARActionPerformed

    private void CONCENTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONCENTRARActionPerformed
        // ACTUALIZAR TABLA DE TOTALES POR GENERO
        Genero("");
    }//GEN-LAST:event_CONCENTRARActionPerformed

    private void EXPORTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXPORTARActionPerformed
        // Exportar Datos
        ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(VISITA);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_EXPORTARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JButton CONCENTRAR;
    private javax.swing.JButton EXPORTAR;
    private javax.swing.ButtonGroup GRUPO_REGISTRO;
    private javax.swing.JTextField MATRICULA;
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JLabel TEXT_TOTAL;
    private javax.swing.JLabel TEXT_VISITA;
    private javax.swing.JTable TOTAL_VISITAS;
    private javax.swing.JTable VISITA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
