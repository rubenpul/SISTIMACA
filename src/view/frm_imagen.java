/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author ruben
 */
public class frm_imagen extends javax.swing.JFrame {

    /**
     * Creates new form frm_imagen
     */
    private Integer imagen;
    public frm_imagen(Integer imagen) {
        initComponents();
        this.setTitle("SISTIMACA - DETALLE COTIZACIÓN");
        this.setLocationRelativeTo(null);
        this.imagen = imagen;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        lbl_encabezadoalmacen2 = new javax.swing.JLabel();
        lbl_imagentimaca2 = new javax.swing.JLabel();
        bot_cerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        panel_foto = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(null);

        lbl_encabezadoalmacen2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_encabezadoalmacen2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_encabezadoalmacen2.setText("DETALLE COTIZACIÓN");
        jPanel7.add(lbl_encabezadoalmacen2);
        lbl_encabezadoalmacen2.setBounds(260, 10, 190, 29);

        lbl_imagentimaca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TIMACA.png"))); // NOI18N
        jPanel7.add(lbl_imagentimaca2);
        lbl_imagentimaca2.setBounds(10, 0, 230, 60);

        bot_cerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        bot_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        bot_cerrar.setText("Cerrar");
        bot_cerrar.setToolTipText("");
        bot_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_cerrarActionPerformed(evt);
            }
        });
        jPanel7.add(bot_cerrar);
        bot_cerrar.setBounds(580, 20, 101, 29);
        complemento.DisableBorderButton(bot_cerrar);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jPanel3);
        jPanel3.setBounds(1270, 10, 0, 40);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 60));

        panel_foto.setBackground(new java.awt.Color(255, 255, 255));
        panel_foto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FOTO REFERENCIAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        panel_foto.setForeground(new java.awt.Color(0, 0, 255));

        lbl_foto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_fotoLayout = new javax.swing.GroupLayout(panel_foto);
        panel_foto.setLayout(panel_fotoLayout);
        panel_fotoLayout.setHorizontalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fotoLayout.createSequentialGroup()
                .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_fotoLayout.setVerticalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fotoLayout.createSequentialGroup()
                .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panel_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 410, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bot_cerrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        File fichero = null;
        
        switch(this.imagen){
            case 1: fichero = frm_alternativa.fichero1;
            break;
            case 2: fichero = frm_alternativa.fichero2;
            break;
            case 3: fichero = frm_alternativa.fichero3;
            break;
        }
        
        ImageIcon icon = new ImageIcon(fichero.toString());
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lbl_foto.getWidth(),lbl_foto.getHeight(), Image.SCALE_DEFAULT));
        lbl_foto.setText(null);
        lbl_foto.setIcon(icono);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frm_imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_imagen(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_cerrar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl_encabezadoalmacen2;
    protected static javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_imagentimaca2;
    private javax.swing.JPanel panel_foto;
    // End of variables declaration//GEN-END:variables
}
