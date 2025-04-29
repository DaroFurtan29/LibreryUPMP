
package edu.mx.metropoli.views;

//@author Admin

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

public class UsoComputadoras extends javax.swing.JPanel {

    public UsoComputadoras() {
        initComponents();
    }

    public void Actualizar(String tabla){
        String sql = "SELECT ALL computadora, a.Nombre as Nombre, a.Matricula as Matricula, c.Carrera as Carrera, FechaVisita FROM computadora com JOIN alumno a ON com.IDalumno = a.IDalumno JOIN carreras c ON c.idCarreras = a.idCarreras ORDER BY FechaVisita DESC;" + tabla;
        System.out.println(sql);
        Statement st;
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Computadora");
        model.addColumn("Alumno");
        model.addColumn("Matricula");
        model.addColumn("Carrera");
        model.addColumn("Fecha de Vista");
        TABLA_COMPUTADORAS.setModel(model);
        TABLA_COMPUTADORAS.getColumnModel().getColumn(0).setPreferredWidth(40);
        TABLA_COMPUTADORAS.getColumnModel().getColumn(1).setPreferredWidth(150);
        TABLA_COMPUTADORAS.getColumnModel().getColumn(2).setPreferredWidth(60);
        TABLA_COMPUTADORAS.getColumnModel().getColumn(3).setPreferredWidth(200);
        TABLA_COMPUTADORAS.getColumnModel().getColumn(0).setResizable(false);
        TABLA_COMPUTADORAS.getColumnModel().getColumn(1).setResizable(false);
        TABLA_COMPUTADORAS.getColumnModel().getColumn(2).setResizable(false);
        TABLA_COMPUTADORAS.getColumnModel().getColumn(3).setResizable(false);
        
        TABLA_COMPUTADORAS.setRowSelectionAllowed(false);
        TABLA_COMPUTADORAS.setRowHeight(25);
        
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TEXT_VISITA = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_COMPUTADORAS = new javax.swing.JTable();
        ACTUALIZAR = new javax.swing.JButton();
        REGISTRAR = new javax.swing.JButton();
        matricula_text = new javax.swing.JLabel();
        MATRICULA = new javax.swing.JTextField();
        computadora_text = new javax.swing.JLabel();
        COMPUTADORAS = new javax.swing.JComboBox<>();
        EXPORTAR = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1070, 450));
        setMinimumSize(new java.awt.Dimension(1070, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMaximumSize(new java.awt.Dimension(1070, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(1070, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TEXT_VISITA.setFont(new java.awt.Font("Gotham", 1, 24)); // NOI18N
        TEXT_VISITA.setForeground(new java.awt.Color(0, 0, 0));
        TEXT_VISITA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXT_VISITA.setText("Uso de Computadoras");
        jPanel1.add(TEXT_VISITA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1070, -1));

        TABLA_COMPUTADORAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TABLA_COMPUTADORAS);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 880, 390));

        ACTUALIZAR.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        ACTUALIZAR.setText("Mostrar / Actualizar");
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });
        jPanel1.add(ACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        REGISTRAR.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        REGISTRAR.setText("REGISTRAR");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });
        jPanel1.add(REGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 150, -1));

        matricula_text.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        matricula_text.setForeground(new java.awt.Color(0, 0, 0));
        matricula_text.setText("Matricula o Num de Control");
        jPanel1.add(matricula_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        MATRICULA.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        MATRICULA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(MATRICULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, 150, -1));

        computadora_text.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        computadora_text.setForeground(new java.awt.Color(0, 0, 0));
        computadora_text.setText("Computadora");
        jPanel1.add(computadora_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        COMPUTADORAS.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        COMPUTADORAS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1", "2", "3", "4", "6", "7" }));
        jPanel1.add(COMPUTADORAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 150, -1));

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

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
        // ACTUALIZAR TABLA DE VISITAS
        Actualizar("");
    }//GEN-LAST:event_ACTUALIZARActionPerformed

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
        // REGISTRAR VISITAS
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        String m="";
        int com=0;
        String query = "";

        m=MATRICULA.getText();
        com=COMPUTADORAS.getSelectedIndex();
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

    }//GEN-LAST:event_REGISTRARActionPerformed

    private void EXPORTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXPORTARActionPerformed
        // Exportar Datos
        ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(TABLA_COMPUTADORAS);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_EXPORTARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JComboBox<String> COMPUTADORAS;
    private javax.swing.JButton EXPORTAR;
    private javax.swing.JTextField MATRICULA;
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JTable TABLA_COMPUTADORAS;
    private javax.swing.JLabel TEXT_VISITA;
    private javax.swing.JLabel computadora_text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel matricula_text;
    // End of variables declaration//GEN-END:variables
}
