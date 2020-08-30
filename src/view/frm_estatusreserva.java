/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controlador.ctrl_reserva;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 *
 * @author ruben
 */
public class frm_estatusreserva extends javax.swing.JFrame {

    /**
     * Creates new form frm_estatusreserva
     */
    private Integer fila_reserva;
    private Integer fila_posicion;
    
    public frm_estatusreserva() {
        initComponents();
        this.getContentPane().setBackground(new Color(245,245,245));
        
        
       // Cargar Look And Feel (Marcos Windows )
        try{
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        }
        catch(Exception e){} 
     
        lbl_usuario.setText(frm_principalM1.lbl_usuario.getText().trim());
        lbl_nombres.setText(frm_principalM1.lbl_nombres.getText().trim());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulodetallereserva = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_resumenreserva = new javax.swing.JTable();
        lbl_titulodetallereserva1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_detallereserva = new javax.swing.JTable();
        panel_foto = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();
        lbl_numeromaterial = new javax.swing.JLabel();
        lbl_materialsolicitado = new javax.swing.JLabel();
        lbl_umb = new javax.swing.JLabel();
        lbl_cantidad = new javax.swing.JLabel();
        lbl_aprobacionjefe = new javax.swing.JLabel();
        lbl_fechaaprobacionjefe = new javax.swing.JLabel();
        lbl_aprobaciongerencia = new javax.swing.JLabel();
        lbl_fechaaprobaciongerencia = new javax.swing.JLabel();
        lbl_conformacionalmacen = new javax.swing.JLabel();
        lbl_anulado = new javax.swing.JLabel();
        lbl_desfecharequerida = new javax.swing.JLabel();
        lbl_desnummaterial = new javax.swing.JLabel();
        lbl_desmaterial = new javax.swing.JLabel();
        lbl_desumb = new javax.swing.JLabel();
        lbl_descantidad = new javax.swing.JLabel();
        lbl_desaprobacionjefe = new javax.swing.JLabel();
        lbl_desfechaaprobacionjefe = new javax.swing.JLabel();
        lbl_desaprobaciongerencia = new javax.swing.JLabel();
        lbl_desfechaaprobaciongerencia = new javax.swing.JLabel();
        lbl_desconformacionalmacen = new javax.swing.JLabel();
        lbl_desfechaconformacionalmacen = new javax.swing.JLabel();
        lbl_fechaconformacionalmacen = new javax.swing.JLabel();
        lbl_desstatus = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_fecharequerida = new javax.swing.JLabel();
        lbl_titulodetallereserva2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbl_encabezadoalmacen2 = new javax.swing.JLabel();
        lbl_imagentimaca2 = new javax.swing.JLabel();
        bot_reiniciar = new javax.swing.JButton();
        bot_cerrar = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulodetallereserva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbl_titulodetallereserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        table_resumenreserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID RESERVA", "CEDULA", "NOMBRE", "DESCRIPCION AREA", "PROYECTO", "EMPRESA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_resumenreserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_resumenreservaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table_resumenreserva);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 1270, 160));

        lbl_titulodetallereserva1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_titulodetallereserva1.setForeground(new java.awt.Color(0, 138, 218));
        lbl_titulodetallereserva1.setText("INFORMACIÓN GENERAL");
        getContentPane().add(lbl_titulodetallereserva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        table_detallereserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "POSICIÓN", "NRO MATERIAL", "MATERIAL SOLICITADO", "CANTIDAD RESERVADA", "UMB", "FECHA REQUERIDA", "APROBACION JEFE DE AREA", "FECHA APROBACION", "APROBACION GERENTE", "FECHA APROBACION GERENTE", "CONFORMACION ALMACEN", "FECHA CONFORMACION", "ESTATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_detallereserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_detallereservaMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(table_detallereserva);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 1270, 130));

        panel_foto.setBackground(new java.awt.Color(255, 255, 255));
        panel_foto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FOTO REFERENCIAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        panel_foto.setForeground(new java.awt.Color(0, 0, 255));

        lbl_foto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_fotoLayout = new javax.swing.GroupLayout(panel_foto);
        panel_foto.setLayout(panel_fotoLayout);
        panel_fotoLayout.setHorizontalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_fotoLayout.setVerticalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_foto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );

        getContentPane().add(panel_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 440, 220, 200));

        lbl_numeromaterial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_numeromaterial.setText("NUMERO MATERIAL");
        getContentPane().add(lbl_numeromaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        lbl_materialsolicitado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_materialsolicitado.setText("MATERIAL SOLICITADO");
        getContentPane().add(lbl_materialsolicitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        lbl_umb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_umb.setText("UMB");
        getContentPane().add(lbl_umb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        lbl_cantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_cantidad.setText("CANTIDAD AUTORIZADA");
        getContentPane().add(lbl_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        lbl_aprobacionjefe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_aprobacionjefe.setText("APROBACION JEFE AREA");
        getContentPane().add(lbl_aprobacionjefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, -1));

        lbl_fechaaprobacionjefe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_fechaaprobacionjefe.setText("FECHA APROBACION JEFE AREA");
        getContentPane().add(lbl_fechaaprobacionjefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, -1, -1));

        lbl_aprobaciongerencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_aprobaciongerencia.setText("APROBACION GERENCIA");
        getContentPane().add(lbl_aprobaciongerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, -1, -1));

        lbl_fechaaprobaciongerencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_fechaaprobaciongerencia.setText("FECHA APROBACION GERENCIA");
        getContentPane().add(lbl_fechaaprobaciongerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, -1, -1));

        lbl_conformacionalmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_conformacionalmacen.setText("CONFORMACION ALMACEN");
        getContentPane().add(lbl_conformacionalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, -1, -1));

        lbl_anulado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_anulado.setText("ESTATUS");
        getContentPane().add(lbl_anulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, -1, -1));
        getContentPane().add(lbl_desfecharequerida, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 620, -1, -1));
        getContentPane().add(lbl_desnummaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 475, -1, -1));
        getContentPane().add(lbl_desmaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 515, -1, -1));
        getContentPane().add(lbl_desumb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 555, -1, -1));
        getContentPane().add(lbl_descantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));
        getContentPane().add(lbl_desaprobacionjefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 480, -1, -1));
        getContentPane().add(lbl_desfechaaprobacionjefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 515, -1, -1));
        getContentPane().add(lbl_desaprobaciongerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 555, -1, -1));
        getContentPane().add(lbl_desfechaaprobaciongerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 595, -1, -1));
        getContentPane().add(lbl_desconformacionalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, -1, -1));
        getContentPane().add(lbl_desfechaconformacionalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, -1, -1));

        lbl_fechaconformacionalmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_fechaconformacionalmacen.setText("FECHA CONFORMACION ALMACEN");
        getContentPane().add(lbl_fechaconformacionalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, -1, -1));
        getContentPane().add(lbl_desstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_fecharequerida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_fecharequerida.setText("FECHA REQUERIDA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_fecharequerida)
                .addContainerGap(868, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(lbl_fecharequerida)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 1020, 220));

        lbl_titulodetallereserva2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_titulodetallereserva2.setForeground(new java.awt.Color(0, 138, 218));
        lbl_titulodetallereserva2.setText("DETALLES RESERVA ");
        getContentPane().add(lbl_titulodetallereserva2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(null);

        lbl_encabezadoalmacen2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_encabezadoalmacen2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_encabezadoalmacen2.setText("ESTATUS RESERVAS");
        jPanel7.add(lbl_encabezadoalmacen2);
        lbl_encabezadoalmacen2.setBounds(320, 10, 200, 29);

        lbl_imagentimaca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TIMACA.png"))); // NOI18N
        jPanel7.add(lbl_imagentimaca2);
        lbl_imagentimaca2.setBounds(10, 0, 220, 60);

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
        bot_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reiniciar.png"))); // NOI18N
        bot_cerrar.setText("Cerrar");
        bot_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_cerrarActionPerformed(evt);
            }
        });
        jPanel7.add(bot_cerrar);
        bot_cerrar.setBounds(1250, 20, 105, 33);
        complemento.DisableBorderButton(bot_cerrar);

        lbl_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_usuario.setText("USUARIO");
        jPanel7.add(lbl_usuario);
        lbl_usuario.setBounds(790, 10, 310, 17);

        lbl_nombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_nombres.setText("NOMBRES");
        lbl_nombres.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(lbl_nombres);
        lbl_nombres.setBounds(792, 30, 310, 17);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jPanel3);
        jPanel3.setBounds(1110, 10, 1, 40);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_resumenreservaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_resumenreservaMousePressed
        ctrl_reserva reserva = null;

        fila_reserva = table_resumenreserva.getSelectedRow();

        reserva = new ctrl_reserva(

            Integer.parseInt(table_resumenreserva.getValueAt(fila_reserva, 0).toString()),
            0,
            0,
            "",
            0,
            0, //numero de material
            "",             // descripcion de material
            0,
            "",
            0,
            "",
            0,
            0,
            0,
            0,
            0,    
            "", //fecha reserva
            "",
            "",
            false,
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        );

        reserva.consultar_reserva_detalle_estatus(Integer.parseInt(frm_principalM1.lbl_nivel.getText()),table_detallereserva);

    }//GEN-LAST:event_table_resumenreservaMousePressed

    private void table_detallereservaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_detallereservaMousePressed
     
        BufferedImage img;

        fila_posicion  = table_detallereserva.getSelectedRow();

        lbl_desnummaterial.setText(table_detallereserva.getValueAt(fila_posicion, 1).toString());
        lbl_desmaterial.setText(table_detallereserva.getValueAt(fila_posicion, 2).toString());
        lbl_desumb.setText(table_detallereserva.getValueAt(fila_posicion, 4).toString());
        lbl_descantidad.setText(table_detallereserva.getValueAt(fila_posicion, 3).toString());
        lbl_desfecharequerida.setText(table_detallereserva.getValueAt(fila_posicion, 5).toString());
        
        lbl_desaprobacionjefe.setText(table_detallereserva.getValueAt(fila_posicion, 6).toString());
        lbl_desfechaaprobacionjefe.setText(table_detallereserva.getValueAt(fila_posicion, 7).toString());
        
        lbl_desaprobaciongerencia.setText(table_detallereserva.getValueAt(fila_posicion, 8).toString());
        lbl_desfechaaprobaciongerencia.setText(table_detallereserva.getValueAt(fila_posicion, 9).toString());

        lbl_desconformacionalmacen.setText(table_detallereserva.getValueAt(fila_posicion, 10).toString());
        lbl_desfechaconformacionalmacen.setText(table_detallereserva.getValueAt(fila_posicion, 11).toString());
        
        lbl_desstatus.setText(table_detallereserva.getValueAt(fila_posicion, 12).toString());
        
        ctrl_reserva reserva = new ctrl_reserva(
            0,
            0,
            0,
            "",
            0,
            Integer.parseInt(table_detallereserva.getValueAt(fila_posicion, 1).toString()), //numero de material
            "",             // descripcion de material
            0,
            "",
            0,
            "",
            0,
            0,
            0,
            0,
            0,    
            "", //fecha reserva
            "",
            "",
            false,
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        );

        try{
            img = funciones.decodeToImage(reserva.consultar_foto());

            ImageIcon icon = new ImageIcon(img);
            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lbl_foto.getWidth(),lbl_foto.getHeight(), Image.SCALE_DEFAULT));
            lbl_foto.setText(null);
            lbl_foto.setIcon(icono);
        }
        catch(NullPointerException ex){
            
        }
       

    }//GEN-LAST:event_table_detallereservaMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ctrl_reserva reserva=null;
        
        reserva = new ctrl_reserva(

            0,
            Integer.parseInt(frm_principalM1.lbl_cedula.getText()),
            Integer.parseInt(frm_principalM1.lbl_area.getText()),
            "",
            0,
            0, //numero de material
            "",             // descripcion de material
            0,
            "",
            0,
            "",
            0,
            0,
            0,
            0,
            0,    
            "", //fecha reserva
            "",
            "",
            false,
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        ); 
        
        reserva.consultar_estatus_reserva(Integer.parseInt(frm_principalM1.lbl_nivel.getText()),table_resumenreserva);
        
    }//GEN-LAST:event_formWindowOpened

    private void bot_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_reiniciarActionPerformed
        frm_estatusreserva frm = new frm_estatusreserva();
        frm.setVisible(true);
        this.dispose();
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
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_estatusreserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_cerrar;
    private javax.swing.JButton bot_reiniciar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_anulado;
    private javax.swing.JLabel lbl_aprobaciongerencia;
    private javax.swing.JLabel lbl_aprobacionjefe;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_conformacionalmacen;
    private javax.swing.JLabel lbl_desaprobaciongerencia;
    private javax.swing.JLabel lbl_desaprobacionjefe;
    private javax.swing.JLabel lbl_descantidad;
    private javax.swing.JLabel lbl_desconformacionalmacen;
    private javax.swing.JLabel lbl_desfechaaprobaciongerencia;
    private javax.swing.JLabel lbl_desfechaaprobacionjefe;
    private javax.swing.JLabel lbl_desfechaconformacionalmacen;
    private javax.swing.JLabel lbl_desfecharequerida;
    private javax.swing.JLabel lbl_desmaterial;
    private javax.swing.JLabel lbl_desnummaterial;
    private javax.swing.JLabel lbl_desstatus;
    private javax.swing.JLabel lbl_desumb;
    private javax.swing.JLabel lbl_encabezadoalmacen2;
    private javax.swing.JLabel lbl_fechaaprobaciongerencia;
    private javax.swing.JLabel lbl_fechaaprobacionjefe;
    private javax.swing.JLabel lbl_fechaconformacionalmacen;
    private javax.swing.JLabel lbl_fecharequerida;
    protected static javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_imagentimaca2;
    private javax.swing.JLabel lbl_materialsolicitado;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_numeromaterial;
    private javax.swing.JLabel lbl_titulodetallereserva;
    private javax.swing.JLabel lbl_titulodetallereserva1;
    private javax.swing.JLabel lbl_titulodetallereserva2;
    private javax.swing.JLabel lbl_umb;
    protected static javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_foto;
    private javax.swing.JTable table_detallereserva;
    private javax.swing.JTable table_resumenreserva;
    // End of variables declaration//GEN-END:variables
}