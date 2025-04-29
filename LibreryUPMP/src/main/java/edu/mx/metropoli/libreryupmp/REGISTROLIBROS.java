
package edu.mx.metropoli.libreryupmp;

// @author #LaMetro

import ConectionDB.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class REGISTROLIBROS extends javax.swing.JFrame {

    public REGISTROLIBROS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DESCRIPCION_TEXT = new javax.swing.JLabel();
        LIBRO_TITULO_TEXT = new javax.swing.JLabel();
        AUTOR_TEXT = new javax.swing.JLabel();
        CODIGO_LIBRO_TEXT = new javax.swing.JLabel();
        EDITORIAL_TEXT = new javax.swing.JLabel();
        FECHA_TEXT = new javax.swing.JLabel();
        TITULO = new javax.swing.JTextField();
        AUTOR = new javax.swing.JTextField();
        CODIGO = new javax.swing.JTextField();
        EDITORIAL = new javax.swing.JTextField();
        FECHA = new javax.swing.JTextField();
        REGISTRARLIBRO = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Libros");
        setMinimumSize(new java.awt.Dimension(800, 550));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gotham Bold", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE LIBROS NUEVOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        DESCRIPCION_TEXT.setFont(new java.awt.Font("Gotham Bold", 2, 18)); // NOI18N
        DESCRIPCION_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        DESCRIPCION_TEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DESCRIPCION_TEXT.setText("<html><center>Registre los Libros Nuevos que ingresan a la<p>Biblioteca de la Universidad Politecnica Metropolitana de Puebla<html>");
        jPanel1.add(DESCRIPCION_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 100));

        LIBRO_TITULO_TEXT.setBackground(new java.awt.Color(0, 0, 0));
        LIBRO_TITULO_TEXT.setFont(new java.awt.Font("Gotham", 0, 16)); // NOI18N
        LIBRO_TITULO_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        LIBRO_TITULO_TEXT.setText("Titulo del Libro");
        jPanel1.add(LIBRO_TITULO_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 225, 30));

        AUTOR_TEXT.setBackground(new java.awt.Color(0, 0, 0));
        AUTOR_TEXT.setFont(new java.awt.Font("Gotham", 0, 16)); // NOI18N
        AUTOR_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        AUTOR_TEXT.setText("Autor");
        jPanel1.add(AUTOR_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 225, 30));

        CODIGO_LIBRO_TEXT.setBackground(new java.awt.Color(0, 0, 0));
        CODIGO_LIBRO_TEXT.setFont(new java.awt.Font("Gotham", 0, 16)); // NOI18N
        CODIGO_LIBRO_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        CODIGO_LIBRO_TEXT.setText("Codigo del Libro / ISBN");
        jPanel1.add(CODIGO_LIBRO_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 225, 30));

        EDITORIAL_TEXT.setBackground(new java.awt.Color(0, 0, 0));
        EDITORIAL_TEXT.setFont(new java.awt.Font("Gotham", 0, 16)); // NOI18N
        EDITORIAL_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        EDITORIAL_TEXT.setText("Editorial");
        jPanel1.add(EDITORIAL_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 225, 30));

        FECHA_TEXT.setBackground(new java.awt.Color(0, 0, 0));
        FECHA_TEXT.setFont(new java.awt.Font("Gotham", 0, 16)); // NOI18N
        FECHA_TEXT.setForeground(new java.awt.Color(0, 0, 0));
        FECHA_TEXT.setText("Fecha");
        jPanel1.add(FECHA_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 225, 30));

        TITULO.setFont(new java.awt.Font("Gotham", 0, 16)); // NOI18N
        jPanel1.add(TITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 430, 30));

        AUTOR.setFont(new java.awt.Font("Gotham", 0, 16)); // NOI18N
        jPanel1.add(AUTOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 430, 30));

        CODIGO.setFont(new java.awt.Font("Gotham", 0, 16)); // NOI18N
        jPanel1.add(CODIGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 430, 30));

        EDITORIAL.setFont(new java.awt.Font("Gotham", 0, 16)); // NOI18N
        jPanel1.add(EDITORIAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 430, 30));

        FECHA.setFont(new java.awt.Font("Gotham", 0, 16)); // NOI18N
        jPanel1.add(FECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 430, 30));

        REGISTRARLIBRO.setFont(new java.awt.Font("Gotham", 1, 24)); // NOI18N
        REGISTRARLIBRO.setText("REGISTRAR LIBRO");
        REGISTRARLIBRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARLIBROActionPerformed(evt);
            }
        });
        jPanel1.add(REGISTRARLIBRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 475, 300, 50));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M MARCA DE AGUA.png"))); // NOI18N
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-378, 10, 755, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void REGISTRARLIBROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARLIBROActionPerformed
        // REGISTRAR ALUMNO
        Conectar con = new Conectar();
        Connection conexion = con.conectarToDB();
        String T, A1, A2, C, E, F="";
        String query1 = "";
        String query2 = "";
           
        T=TITULO.getText();
        A1=AUTOR.getText();
        A2=AUTOR.getText();
        C=CODIGO.getText();
        E=EDITORIAL.getText();
        F=FECHA.getText();
        query1 = "INSERT INTO autor (Nombre) values (?);";
        query2 = "INSERT INTO libro (Codigo, Titulo, IDautor, Fecha, Editorial) VALUES (?,?,(select IDautor from autor where Nombre = ?),?,?);";
        //        INSERT INTO autor (Nombre) values ('?');
        //        INSERT INTO libro (Codigo, Titulo, IDautor, Fecha, Editorial) VALUES ('?','?',(select IDautor from autor where Nombre = '?'),'?','?');
        
        try{
            PreparedStatement pst = conexion.prepareStatement(query1);
            
            pst.setString(1, A1);

            int n=pst.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "AUTOR REGISTRADO");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "AUTOR NO REGISTRADO");
        }
        
        try{
            PreparedStatement pst = conexion.prepareStatement(query2);
            

            pst.setString(1, C);
            pst.setString(2, T);
            pst.setString(3, A2);
            pst.setString(4, F);
            pst.setString(5, E);
            int n=pst.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO");
        }
        
    }//GEN-LAST:event_REGISTRARLIBROActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(REGISTROLIBROS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTROLIBROS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTROLIBROS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTROLIBROS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTROLIBROS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AUTOR;
    private javax.swing.JLabel AUTOR_TEXT;
    private javax.swing.JTextField CODIGO;
    private javax.swing.JLabel CODIGO_LIBRO_TEXT;
    private javax.swing.JLabel DESCRIPCION_TEXT;
    private javax.swing.JTextField EDITORIAL;
    private javax.swing.JLabel EDITORIAL_TEXT;
    private javax.swing.JTextField FECHA;
    private javax.swing.JLabel FECHA_TEXT;
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel LIBRO_TITULO_TEXT;
    private javax.swing.JButton REGISTRARLIBRO;
    private javax.swing.JTextField TITULO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
