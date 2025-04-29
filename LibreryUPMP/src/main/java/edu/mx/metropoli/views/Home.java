
package edu.mx.metropoli.views;

// @author #LaMetro

public class Home extends javax.swing.JPanel {


    public Home() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bienvenido = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        Calle = new javax.swing.JLabel();
        Colonia = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        ext = new javax.swing.JLabel();
        IMG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1070, 450));
        setMinimumSize(new java.awt.Dimension(1070, 450));
        setPreferredSize(new java.awt.Dimension(1070, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bienvenido1.png"))); // NOI18N
        add(Bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        Direccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Direccion.png"))); // NOI18N
        add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 126, 20));

        Calle.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        Calle.setForeground(new java.awt.Color(0, 0, 0));
        Calle.setText("Calle Popocatépetl S/N, Colonia Tres Cerritos ");
        add(Calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        Colonia.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        Colonia.setForeground(new java.awt.Color(0, 0, 0));
        Colonia.setText("Heroica Puebla de Zaragoza Puebla 72480");
        Colonia.setAlignmentY(0.0F);
        add(Colonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 245, -1, -1));

        Telefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Telefono2.png"))); // NOI18N
        Telefono.setAlignmentY(0.0F);
        add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 120, -1));

        Numero.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        Numero.setForeground(new java.awt.Color(0, 0, 0));
        Numero.setText("222 582 5222");
        add(Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 230, -1, -1));

        ext.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        ext.setForeground(new java.awt.Color(0, 0, 0));
        ext.setText("Ext: 123");
        add(ext, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 245, -1, -1));

        IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ilustracion1.png"))); // NOI18N
        add(IMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 630, 450));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO-verde-300x64.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 325, 440, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenido;
    private javax.swing.JLabel Calle;
    private javax.swing.JLabel Colonia;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel IMG;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel ext;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
