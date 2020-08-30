/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author ruben
 */
public class frm_entradainventario extends javax.swing.JFrame {

    /**
     * Creates new form frm_entradainventario
     */
    public frm_entradainventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SISTIMACA - ENTRADA DE MATERIAL");
        this.getContentPane().setBackground(new Color(245,245,245));
        this.setExtendedState(MAXIMIZED_BOTH);
        
        
        // Cargar Look And Feel (Marcos Windows )
        try{
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        }
        catch(Exception e){} 
        
        
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_encabezadomaterial = new javax.swing.JLabel();
        lbl_solicitud = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_solicitante = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_aprobacion = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bot_buscar = new javax.swing.JButton();
        txt_solicitud = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lbl_encabezadomaterial2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lbl_encabezadoalmacen2 = new javax.swing.JLabel();
        lbl_imagentimaca2 = new javax.swing.JLabel();
        bot_reiniciar = new javax.swing.JButton();
        bot_cerrar = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_encabezadomaterial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_encabezadomaterial.setForeground(new java.awt.Color(0, 138, 218));
        lbl_encabezadomaterial.setText("APROBACIÓN DE LA SOLICITUD");
        getContentPane().add(lbl_encabezadomaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        lbl_solicitud.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_solicitud.setText("NRO DE SOLICITUD");
        getContentPane().add(lbl_solicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_cedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_cedula.setText("CEDULA");
        jPanel1.add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lbl_solicitante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_solicitante.setText("SOLICITANTE");
        jPanel1.add(lbl_solicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ÁREA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 230, 30));

        txt_cedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 230, 30));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 410, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("EMPRESA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("PROYECTO");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 230, 30));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 230, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 480, 90));

        tbl_aprobacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NIVEL", "APROBADO", "FIRMA"
            }
        ));
        jScrollPane1.setViewportView(tbl_aprobacion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 1360, 90));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("MATERIAL");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CANTIDAD A INGRESAR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("PRECIO UNITARIO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("DESTINO ALMACÉN");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, -1, -1));

        bot_buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_buscar.setIcon(new ImageIcon("imagenes/icon/buscar.png"));
        bot_buscar.setText("Buscar");
        getContentPane().add(bot_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, 30));
        complemento.DisableBorderButton(bot_buscar);

        txt_solicitud.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txt_solicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 120, 30));

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 690, 110, 30));

        jSpinner1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 50, -1));

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 230, 30));

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 230, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new ImageIcon("imagenes/icon/agregar.png"));
        jButton2.setText("AGREGAR MATERIAL");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 760, -1, -1));
        complemento.DisableBorderButton(jButton2);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new ImageIcon("imagenes/icon/imprimir.png"));
        jButton4.setText("IMPRIMIR ");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 720, -1, -1));
        complemento.DisableBorderButton(jButton4);

        lbl_encabezadomaterial2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_encabezadomaterial2.setForeground(new java.awt.Color(0, 138, 218));
        lbl_encabezadomaterial2.setText("DETALLE DE LA SOLICITUD");
        getContentPane().add(lbl_encabezadomaterial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "POSICIÓN", "MATERIAL SOLICITADO", "CANTIDAD", "UM", "GRUPO DE MATERIAL", "FECHA REQUERIDA", "JUSTIFICACION", "OBSERVACION", "ESTADO"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(2).setHeaderValue("CANTIDAD");
            jTable2.getColumnModel().getColumn(3).setHeaderValue("UM");
            jTable2.getColumnModel().getColumn(4).setHeaderValue("GRUPO DE MATERIAL");
            jTable2.getColumnModel().getColumn(5).setHeaderValue("FECHA REQUERIDA");
            jTable2.getColumnModel().getColumn(6).setHeaderValue("JUSTIFICACION");
            jTable2.getColumnModel().getColumn(7).setHeaderValue("OBSERVACION");
            jTable2.getColumnModel().getColumn(8).setHeaderValue("ESTADO");
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 1360, 100));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("NRO FACTURA");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 230, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("UBICACIÓN");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 670, -1, -1));

        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 690, 230, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("TIPO DE SOLICITUD");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 230, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("ORDEN DE COMPRA");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 230, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 130, 430, 90));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(null);

        lbl_encabezadoalmacen2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_encabezadoalmacen2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_encabezadoalmacen2.setText("MÓDULO ENTRADA DE MATERIAL");
        jPanel7.add(lbl_encabezadoalmacen2);
        lbl_encabezadoalmacen2.setBounds(310, 20, 400, 29);

        lbl_imagentimaca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TIMACA.png"))); // NOI18N
        jPanel7.add(lbl_imagentimaca2);
        lbl_imagentimaca2.setBounds(10, 0, 270, 60);

        bot_reiniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_reiniciar.setForeground(new java.awt.Color(255, 255, 255));
        bot_reiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reiniciar.png"))); // NOI18N
        bot_reiniciar.setText("Reiniciar");
        bot_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_reiniciarActionPerformed(evt);
            }
        });
        jPanel7.add(bot_reiniciar);
        bot_reiniciar.setBounds(1130, 20, 113, 33);
        complemento.DisableBorderButton(bot_reiniciar);

        bot_cerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        bot_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        bot_cerrar.setText("Cerrar");
        bot_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_cerrarActionPerformed(evt);
            }
        });
        jPanel7.add(bot_cerrar);
        bot_cerrar.setBounds(1250, 20, 101, 29);
        complemento.DisableBorderButton(bot_cerrar);

        lbl_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_usuario.setText("USUARIO");
        jPanel7.add(lbl_usuario);
        lbl_usuario.setBounds(750, 10, 350, 17);

        lbl_nombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_nombres.setText("NOMBRES");
        lbl_nombres.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(lbl_nombres);
        lbl_nombres.setBounds(752, 30, 350, 17);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jPanel4);
        jPanel4.setBounds(1110, 10, 1, 40);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_reiniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_reiniciarActionPerformed

    private void bot_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_cerrarActionPerformed
        Integer resp = JOptionPane.showConfirmDialog(null, "ESTÁ SEGURO EN SALIR?");
        if (resp.equals(0)){
            this.dispose();
        }    

    }//GEN-LAST:event_bot_cerrarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_entradainventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_entradainventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_entradainventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_entradainventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_entradainventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_buscar;
    private javax.swing.JButton bot_cerrar;
    private javax.swing.JButton bot_reiniciar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_encabezadoalmacen2;
    private javax.swing.JLabel lbl_encabezadomaterial;
    private javax.swing.JLabel lbl_encabezadomaterial2;
    private javax.swing.JLabel lbl_imagentimaca2;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_solicitante;
    private javax.swing.JLabel lbl_solicitud;
    protected static javax.swing.JLabel lbl_usuario;
    private javax.swing.JTable tbl_aprobacion;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_solicitud;
    // End of variables declaration//GEN-END:variables
}