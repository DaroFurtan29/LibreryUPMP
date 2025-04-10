
package edu.mx.metropoli.libreryupmp;

import edu.mx.metropoli.views.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;

// @author #LaMetro

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        SetDate();
        initContent();
    }
    
    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    
   private void ShowPanel(JPanel p) {
        p.setSize(1070, 450);
        p.setLocation(0, 0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
       
    }
    
    private void initContent() {
        ShowPanel(new Home());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        PanelMenu = new javax.swing.JPanel();
        BotonInicio = new javax.swing.JButton();
        BotonVisitas = new javax.swing.JButton();
        BotonLibros = new javax.swing.JButton();
        BotonPrestamo = new javax.swing.JButton();
        labelLogo1 = new javax.swing.JLabel();
        Text_LaMetro = new javax.swing.JLabel();
        panelBanner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PanelDate = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelPixelHeart = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Librery #LaMetro");
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1350, 700));
        setMinimumSize(new java.awt.Dimension(1350, 700));
        setPreferredSize(new java.awt.Dimension(1350, 700));
        setSize(new java.awt.Dimension(1350, 700));

        jPanel3.setBackground(new java.awt.Color(0, 32, 96));
        jPanel3.setMaximumSize(new java.awt.Dimension(1340, 680));
        jPanel3.setMinimumSize(new java.awt.Dimension(1340, 680));
        jPanel3.setPreferredSize(new java.awt.Dimension(1340, 680));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMenu.setBackground(new java.awt.Color(225, 94, 41));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonInicio.setBackground(new java.awt.Color(32, 59, 104));
        BotonInicio.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        BotonInicio.setForeground(new java.awt.Color(255, 255, 255));
        BotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-alt.png"))); // NOI18N
        BotonInicio.setText(" Inicio");
        BotonInicio.setBorderPainted(false);
        BotonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonInicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BotonInicio.setInheritsPopupMenu(true);
        BotonInicio.setRequestFocusEnabled(false);
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });
        PanelMenu.add(BotonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 283, 218, 60));

        BotonVisitas.setBackground(new java.awt.Color(32, 59, 104));
        BotonVisitas.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        BotonVisitas.setForeground(new java.awt.Color(255, 255, 255));
        BotonVisitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-like.png"))); // NOI18N
        BotonVisitas.setText(" Visitas");
        BotonVisitas.setBorderPainted(false);
        BotonVisitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVisitas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonVisitas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BotonVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVisitasActionPerformed(evt);
            }
        });
        PanelMenu.add(BotonVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 349, 218, 60));

        BotonLibros.setBackground(new java.awt.Color(32, 59, 104));
        BotonLibros.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        BotonLibros.setForeground(new java.awt.Color(255, 255, 255));
        BotonLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/books.png"))); // NOI18N
        BotonLibros.setText(" Libros");
        BotonLibros.setBorderPainted(false);
        BotonLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonLibros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonLibros.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BotonLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLibrosActionPerformed(evt);
            }
        });
        PanelMenu.add(BotonLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 481, 218, 60));

        BotonPrestamo.setBackground(new java.awt.Color(32, 59, 104));
        BotonPrestamo.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        BotonPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        BotonPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/graduation-cap.png"))); // NOI18N
        BotonPrestamo.setText(" Préstamos");
        BotonPrestamo.setBorderPainted(false);
        BotonPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonPrestamo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BotonPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPrestamoActionPerformed(evt);
            }
        });
        PanelMenu.add(BotonPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 415, 218, 60));

        labelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO M LA METRO.png"))); // NOI18N
        PanelMenu.add(labelLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, 100));

        Text_LaMetro.setFont(new java.awt.Font("Gotham Black", 0, 45)); // NOI18N
        Text_LaMetro.setForeground(new java.awt.Color(255, 255, 255));
        Text_LaMetro.setText("#LaMetro");
        PanelMenu.add(Text_LaMetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 160, -1, -1));

        jPanel3.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, 650));

        panelBanner.setBackground(new java.awt.Color(225, 94, 41));
        panelBanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("La vida valdrá la pena mientras haya en el mundo seres");
        panelBanner.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 8, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("capaces de hacer magia cuando profesan una pasión");
        panelBanner.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 42, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gothamic", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("\"");
        panelBanner.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("DejaVu Serif", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("- Ángeles Mastretta");
        panelBanner.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gothamic", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("\"");
        panelBanner.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 8, -1, -1));

        jPanel3.add(panelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 1070, 120));
        panelBanner.getAccessibleContext().setAccessibleName("");

        PanelDate.setBackground(new java.awt.Color(225, 94, 41));
        PanelDate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 32, 96));
        jLabel2.setText("We");
        PanelDate.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        labelPixelHeart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPixelHeart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pixel3.png"))); // NOI18N
        PanelDate.add(labelPixelHeart, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 40, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 32, 96));
        jLabel3.setText("read");
        PanelDate.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        dateText.setFont(new java.awt.Font("Keep Calm Med", 0, 24)); // NOI18N
        dateText.setForeground(new java.awt.Color(255, 255, 255));
        dateText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendar2.png"))); // NOI18N
        dateText.setText("  Hoy es {dayname} {day} de {month} del {year}");
        dateText.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dateText.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        PanelDate.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 740, 50));

        jPanel3.add(PanelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 1040, 50));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel3.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 1070, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Libreria #LaMetro");
        getAccessibleContext().setAccessibleDescription("Administracion del Porgrama de la Libreria #LaMetro");

        setSize(new java.awt.Dimension(1366, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        ShowPanel(new Home());
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void BotonLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLibrosActionPerformed
        ShowPanel(new Libros());
    }//GEN-LAST:event_BotonLibrosActionPerformed

    private void BotonPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPrestamoActionPerformed
        ShowPanel(new Prestamos());
    }//GEN-LAST:event_BotonPrestamoActionPerformed

    private void BotonVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVisitasActionPerformed
        ShowPanel(new Visitas());
    }//GEN-LAST:event_BotonVisitasActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonLibros;
    private javax.swing.JButton BotonPrestamo;
    private javax.swing.JButton BotonVisitas;
    private javax.swing.JPanel PanelDate;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JLabel Text_LaMetro;
    private javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelLogo1;
    private javax.swing.JLabel labelPixelHeart;
    private javax.swing.JPanel panelBanner;
    // End of variables declaration//GEN-END:variables
      

}
