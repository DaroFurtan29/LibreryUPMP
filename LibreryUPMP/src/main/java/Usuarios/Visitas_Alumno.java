
package Usuarios;

import ConectionDB.Conectar;
import ConectionDB.Validacion;
import javax.swing.JOptionPane;


// @author #LaMetro 

public class Visitas_Alumno extends javax.swing.JPanel {

    public Visitas_Alumno() {
        initComponents();
        Conectar onj = new Conectar();
        onj.conectarToDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        INSERTAR_MATRICULA = new javax.swing.JTextField();
        RegistrarVisita = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(980, 530));
        setMinimumSize(new java.awt.Dimension(980, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(980, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gotham", 0, 24)); // NOI18N
        jLabel1.setText("MATRICULA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, 40));

        jLabel2.setFont(new java.awt.Font("Gotham", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Para llevar un control de las vistas de la Biblioteca, solo debes de teclar tu Matricula ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 980, 60));

        jLabel3.setFont(new java.awt.Font("Gotham", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRA TU VISITA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 60));

        INSERTAR_MATRICULA.setFont(new java.awt.Font("Gotham", 0, 24)); // NOI18N
        INSERTAR_MATRICULA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(INSERTAR_MATRICULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 360, 40));

        RegistrarVisita.setBackground(new java.awt.Color(0, 32, 96));
        RegistrarVisita.setFont(new java.awt.Font("Gotham", 0, 36)); // NOI18N
        RegistrarVisita.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarVisita.setText("REGISTRAR VISITA");
        RegistrarVisita.setBorderPainted(false);
        RegistrarVisita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegistrarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarVisitaActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 380, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarVisitaActionPerformed
        // TODO add your handling code here:
        Validacion cu = new Validacion();
//        boolean codigo = cu.RegistroVisitas;
        
//        if(codigo == true)
        
    }//GEN-LAST:event_RegistrarVisitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField INSERTAR_MATRICULA;
    private javax.swing.JButton RegistrarVisita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
