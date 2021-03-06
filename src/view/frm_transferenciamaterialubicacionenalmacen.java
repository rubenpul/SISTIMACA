/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controlador.ctrl_comun;
import controlador.ctrl_entrada;
import controlador.ctrl_material;
import controlador.ctrl_ubicacion;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JOptionPane;
import model.class_entrada;
import model.class_material;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

/**
 *
 * @author ruben
 */
public class frm_transferenciamaterialubicacionenalmacen extends javax.swing.JFrame {

    /**
     * Creates new form frm_transferenciamaterialubicacion
     */
    public frm_transferenciamaterialubicacionenalmacen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(245,245,245));
        this.setTitle("SISTIMACA - TRANSFERENCIA DE UBICACIÓN EN ALMACÉN");
        this.setExtendedState(MAXIMIZED_BOTH);
        
        this.setIconImage(new ImageIcon(funciones.logoempresa()).getImage());
        
        
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

        txt_idubicacion = new javax.swing.JTextField();
        lbl_cantidadentrante = new javax.swing.JLabel();
        lbl_descantidadentrante = new javax.swing.JLabel();
        lbl_cantidadsaliente = new javax.swing.JLabel();
        lbl_descantidadsaliente = new javax.swing.JLabel();
        panel_desde = new javax.swing.JPanel();
        lbl_descripcionmaterial = new javax.swing.JLabel();
        lbl_marca = new javax.swing.JLabel();
        lbl_modelo = new javax.swing.JLabel();
        lbl_grupomaterial = new javax.swing.JLabel();
        lbl_codmatalternativo = new javax.swing.JLabel();
        lbl_umb = new javax.swing.JLabel();
        lbl_stockdisponible = new javax.swing.JLabel();
        lbl_clasematerial = new javax.swing.JLabel();
        lbl_materialdesde2 = new javax.swing.JLabel();
        lbl_desdescripcion = new javax.swing.JLabel();
        lbl_desmarca = new javax.swing.JLabel();
        lbl_desmodelo = new javax.swing.JLabel();
        lbl_desclasematerial = new javax.swing.JLabel();
        lbl_desgrupomaterial = new javax.swing.JLabel();
        lbl_desumb = new javax.swing.JLabel();
        lbl_desstockdisponible = new javax.swing.JLabel();
        lbl_descodmaterial = new javax.swing.JLabel();
        txt_nromaterial = new javax.swing.JTextField();
        bot_buscardesde = new javax.swing.JButton();
        lbl_nromaterialdesde1 = new javax.swing.JLabel();
        cmb_almacenactual = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lbl_almacen3 = new javax.swing.JLabel();
        bot_actualizarmaterial = new javax.swing.JButton();
        lbl_almacen = new javax.swing.JLabel();
        lbl_almacen1 = new javax.swing.JLabel();
        cmb_ubicacionactual = new javax.swing.JComboBox<>();
        lbl_almacen4 = new javax.swing.JLabel();
        spin_cantidadtrans = new javax.swing.JSpinner();
        lbl_cantumb = new javax.swing.JLabel();
        lbl_ubicacionexiste = new javax.swing.JLabel();
        txt_ubicaciondestino = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lbl_encabezadoalmacen2 = new javax.swing.JLabel();
        lbl_imagentimaca2 = new javax.swing.JLabel();
        bot_reiniciar = new javax.swing.JButton();
        bot_cerrar = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        lbl_cantidadentrante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_cantidadentrante.setText("CANTIDAD ENTRANTE");

        lbl_descantidadentrante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lbl_cantidadsaliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_cantidadsaliente.setText("CANTIDAD SALIENTE");

        lbl_descantidadsaliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_desde.setBackground(new java.awt.Color(255, 255, 255));
        panel_desde.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_desde.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_descripcionmaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_descripcionmaterial.setText("DESCRIPCIÓN DE MATERIAL");
        panel_desde.add(lbl_descripcionmaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lbl_marca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_marca.setText("MARCA");
        panel_desde.add(lbl_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lbl_modelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_modelo.setText("MODELO");
        panel_desde.add(lbl_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lbl_grupomaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_grupomaterial.setText("GRUPO DE MATERIAL");
        panel_desde.add(lbl_grupomaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        lbl_codmatalternativo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_codmatalternativo.setText("CÓDIGO DE MATERIAL ");
        panel_desde.add(lbl_codmatalternativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lbl_umb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_umb.setText("UMB");
        panel_desde.add(lbl_umb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        lbl_stockdisponible.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_stockdisponible.setText("STOCK DISPONIBLE");
        panel_desde.add(lbl_stockdisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        lbl_clasematerial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_clasematerial.setText("CLASE DE MATERIAL");
        panel_desde.add(lbl_clasematerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        lbl_materialdesde2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_materialdesde2.setForeground(new java.awt.Color(0, 138, 218));
        lbl_materialdesde2.setText("DETALLE DE MATERIAL");
        panel_desde.add(lbl_materialdesde2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        lbl_desdescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_desde.add(lbl_desdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 250, 20));

        lbl_desmarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_desde.add(lbl_desmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 190, 20));

        lbl_desmodelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_desde.add(lbl_desmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 270, 20));

        lbl_desclasematerial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_desde.add(lbl_desclasematerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 280, 20));

        lbl_desgrupomaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_desde.add(lbl_desgrupomaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 310, 20));

        lbl_desumb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_desde.add(lbl_desumb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 290, 20));

        lbl_desstockdisponible.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_desde.add(lbl_desstockdisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 260, 20));

        lbl_descodmaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_desde.add(lbl_descodmaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 220, 20));

        getContentPane().add(panel_desde, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 700, 310));

        txt_nromaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_nromaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nromaterialKeyReleased(evt);
            }
        });
        getContentPane().add(txt_nromaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 30));

        bot_buscardesde.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_buscardesde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        bot_buscardesde.setText("Buscar");
        bot_buscardesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_buscardesdeActionPerformed(evt);
            }
        });
        getContentPane().add(bot_buscardesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));
        complemento.DisableBorderButton(bot_buscardesde);

        lbl_nromaterialdesde1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_nromaterialdesde1.setText("NRO DE MATERIAL");
        getContentPane().add(lbl_nromaterialdesde1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        cmb_almacenactual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmb_almacenactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_almacenactualActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_almacenactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 210, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_almacen3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_almacen3.setText("UBICACIÓN DESTINO");
        jPanel1.add(lbl_almacen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        bot_actualizarmaterial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bot_actualizarmaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh.png"))); // NOI18N
        bot_actualizarmaterial.setText("ACTUALIZAR");
        bot_actualizarmaterial.setEnabled(false);
        bot_actualizarmaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_actualizarmaterialActionPerformed(evt);
            }
        });
        jPanel1.add(bot_actualizarmaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        lbl_almacen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_almacen.setText("ALMACÉN ACTUAL");
        jPanel1.add(lbl_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lbl_almacen1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_almacen1.setText("UBICACIÓN ACTUAL");
        jPanel1.add(lbl_almacen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        cmb_ubicacionactual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmb_ubicacionactual.setEnabled(false);
        cmb_ubicacionactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ubicacionactualActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_ubicacionactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, -1));

        lbl_almacen4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_almacen4.setText("CANTIDAD");
        jPanel1.add(lbl_almacen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        spin_cantidadtrans.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        spin_cantidadtrans.setEnabled(false);
        jPanel1.add(spin_cantidadtrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 70, -1));

        lbl_cantumb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(lbl_cantumb, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 70, 20));

        lbl_ubicacionexiste.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(lbl_ubicacionexiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 150, 20));

        txt_ubicaciondestino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_ubicaciondestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ubicaciondestinoKeyReleased(evt);
            }
        });
        jPanel1.add(txt_ubicaciondestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 960, 140));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(null);

        lbl_encabezadoalmacen2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_encabezadoalmacen2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_encabezadoalmacen2.setText("TRANSFERENCIA DE UBICACIÓN EN ALMACÉN");
        jPanel7.add(lbl_encabezadoalmacen2);
        lbl_encabezadoalmacen2.setBounds(270, 20, 400, 29);

        lbl_imagentimaca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TIMACA.png"))); // NOI18N
        jPanel7.add(lbl_imagentimaca2);
        lbl_imagentimaca2.setBounds(10, 0, 240, 60);

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
        bot_reiniciar.setBounds(1123, 20, 120, 33);
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
        bot_cerrar.setBounds(1250, 20, 100, 29);
        complemento.DisableBorderButton(bot_cerrar);

        lbl_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_usuario.setText("USUARIO");
        jPanel7.add(lbl_usuario);
        lbl_usuario.setBounds(770, 10, 330, 17);

        lbl_nombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_nombres.setText("NOMBRES");
        lbl_nombres.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(lbl_nombres);
        lbl_nombres.setBounds(772, 30, 330, 17);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jPanel3);
        jPanel3.setBounds(1110, 10, 1, 40);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_buscardesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_buscardesdeActionPerformed
        frm_buscarmaterial frm = new frm_buscarmaterial(11);
        frm.setVisible(true);
    }//GEN-LAST:event_bot_buscardesdeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        ctrl_comun control = new ctrl_comun(1);
      //  cmb_almacendestino =  control.cargar_combo(cmb_almacendestino,"Seleccione...");
        
        txt_nromaterial.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void bot_actualizarmaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_actualizarmaterialActionPerformed
        frm_progress frm = new frm_progress(5,Integer.parseInt(spin_cantidadtrans.getValue().toString()));
        frm.setVisible(true);
                
      
        
       
    }//GEN-LAST:event_bot_actualizarmaterialActionPerformed

    private void cmb_almacenactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_almacenactualActionPerformed
      try{  
        
        if (evt.getModifiers() != 0){
           
           if (!cmb_almacenactual.getSelectedItem().equals("Seleccione...")){
            ctrl_entrada entrada  = new ctrl_entrada(
                    0, //id_entrada,
                    0, 
                    Integer.parseInt(txt_nromaterial.getText().trim()), //id_material, 
                    "", //descripcionmaterial
                    0, //idvaloracion
                    "", //descripcionvaloracion
                    1,  //moneda
                    "", // descripcion_moneda,  
                    Integer.parseInt(cmb_almacenactual.getSelectedItem().toString().substring(0,3).trim()), //id_almacen,
                    "", //descripcion_almacen,
                    0,
                    "", //ubicacion
                     0, //id_procedencia
                    "", //descripcion_procedencia
                     0, //id_clasedemovimiento
                    "", //descripcion_clasedemovimiento
                     0, //id_proyecto
                    "", //descripcion_proyecto
                    0,
                    "", // codigo alterno
                    0, //iddocumento
                    0,//idcompra
                    0, //nrofactura
                    "", //fecha_entrada,
                    0, //cantidad_ingresada,
                    0.0, //precio_unitario,
                    0.0, //monto,
                    0.0, //flete
                    0.0, //monto
                    "", //observacion
                    true //status       
            ); 
             
          
            cmb_ubicacionactual =  entrada.cargarmaterial_almacen(cmb_ubicacionactual,"Seleccione...",2);
            cmb_ubicacionactual.setEnabled(true);
            
//            cmb_almacendestino =  entrada.cargarmaterial_almacen(cmb_almacendestino,"Seleccione...",8);
           } 
           else{
               cmb_ubicacionactual.setEnabled(false);
           }
       }
      }catch(NullPointerException ex){} 
    }//GEN-LAST:event_cmb_almacenactualActionPerformed

    private void bot_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_reiniciarActionPerformed
        frm_transferenciamaterialubicacionenalmacen frm = new frm_transferenciamaterialubicacionenalmacen();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bot_reiniciarActionPerformed

    private void bot_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_cerrarActionPerformed
        Integer resp = JOptionPane.showConfirmDialog(null, "ESTÁ SEGURO EN SALIR?");
        if (resp.equals(0)){
            this.dispose();
        }    

    }//GEN-LAST:event_bot_cerrarActionPerformed

    private void cmb_ubicacionactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ubicacionactualActionPerformed
       try{
        if(evt.getModifiers() != 0 ){
            if(!cmb_ubicacionactual.getSelectedItem().equals("Seleccione...")){
               spin_cantidadtrans.setEnabled(true);
               
                           ctrl_entrada entrada  = new ctrl_entrada(
                                    0, //id_entrada,
                                    0, 
                                    Integer.parseInt(txt_nromaterial.getText().trim()), //id_material, 
                                    "", //descripcionmaterial
                                    0, //idvaloracion
                                    "", //descripcionvaloracion
                                    1,  //moneda
                                    "", // descripcion_moneda,  
                                    Integer.parseInt(cmb_almacenactual.getSelectedItem().toString().substring(0,3).trim()), //id_almacen,
                                    "", //descripcion_almacen,
                                    Integer.parseInt(cmb_ubicacionactual.getSelectedItem().toString().substring(0,3).trim()),
                                    "", //ubicacion
                                     0, //id_procedencia
                                    "", //descripcion_procedencia
                                     0, //id_clasedemovimiento
                                    "", //descripcion_clasedemovimiento
                                     0, //id_proyecto
                                    "", //descripcion_proyecto
                                    0,
                                    "", // codigo alterno
                                    0, //iddocumento
                                    0,//idcompra
                                    0, //nrofactura
                                    "", //fecha_entrada,
                                    0, //cantidad_ingresada,
                                    0.0, //precio_unitario,
                                    0.0, //monto,
                                    0.0, //flete
                                    0.0, //monto
                                    "", //observacion
                                    true //status       
                            ); 

                    lbl_desstockdisponible.setText(entrada.consultarmaterial_cantidadubicacion().toString());   

                    spin_cantidadtrans.setValue(Integer.parseInt(lbl_desstockdisponible.getText()));
            }
            else{
              // cmb_almacendestino.setEnabled(false);
              
            }
        }
       }catch(NullPointerException ex){ }   
        
       
    }//GEN-LAST:event_cmb_ubicacionactualActionPerformed

    private void txt_nromaterialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nromaterialKeyReleased
        if ( ( (evt.getKeyCode() >= 48 ) && (evt.getKeyCode() <= 57 ) ) || ( (evt.getKeyCode() >= 37 ) && (evt.getKeyCode() <= 40 ) ) || ((evt.getKeyCode() >= 96 ) && (evt.getKeyCode() <= 105 )) || (evt.getKeyCode() == 144) || (evt.getKeyCode() == 127) || (evt.getKeyCode() == 8)  || (evt.getKeyCode() == 10)){       
            ctrl_material material = null;
            class_material modelo_material = null;
        
                            
                material = new ctrl_material(
                    0,
                    Integer.parseInt(txt_nromaterial.getText().trim().toUpperCase()),
                    "",
                    "",
                    "",
                    "",
                    "",
                    0,
                    "",
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0.0,
                    0.0,
                    "",
                    0,
                    "",
                    0,
                    0,
                    "",
                    "",
                    0,
                    "",
                    0,
                    "",
                    0,
                    "",
                    "",
                    0,
                    "",
                    0,
                    "",
                    0,
                    "",
                    true

                );

                modelo_material = material.consultar_material();

                if (modelo_material.isStatus()){
                
                    lbl_descodmaterial.setText(modelo_material.getCodigo_mat_alter());
                    lbl_desdescripcion.setText(modelo_material.getDescripcion());
                    lbl_desmarca.setText(modelo_material.getMarca());
                    lbl_desmodelo.setText(modelo_material.getModelo());
                    lbl_desclasematerial.setText(modelo_material.getDescripcionclasearticulo());
                    lbl_desgrupomaterial.setText(modelo_material.getDescripciongrupoarticulo());
                    lbl_desumb.setText(modelo_material.getDescripcion_medida());
                    lbl_desstockdisponible.setText(String.valueOf(modelo_material.getStock_disponible()));
                    lbl_descantidadentrante.setText(String.valueOf(modelo_material.getCantidad_entrante()));
                    lbl_descantidadsaliente.setText(String.valueOf(modelo_material.getCantidad_saliente()));
                    lbl_cantumb.setText(modelo_material.getDescripcion_medida());
                    spin_cantidadtrans.setValue(modelo_material.getStock_disponible());
            
                }
            
                ctrl_entrada entrada  = new ctrl_entrada(
                    0, //id_entrada,
                    0, 
                    Integer.parseInt(txt_nromaterial.getText().trim()), //id_material, 
                    "", //descripcionmaterial
                    0, //idvaloracion
                    "", //descripcionvaloracion
                    1,  //moneda
                    "", // descripcion_moneda,  
                    0, //id_almacen,
                    "", //descripcion_almacen,
                    0,
                    "", //ubicacion
                     0, //id_procedencia
                    "", //descripcion_procedencia
                      0, //id_clasedemovimiento
                    "", //descripcion_clasedemovimiento
                       0, //id_proyecto
                    "", //descripcion_proyecto
                    0,
                    "", //codigo alterno
                    0, //iddocumento
                    0,//idcompra
                    0, //nrofactura
                    "", //fecha_entrada,
                    0, //cantidad_ingresada,
                    0.0, //precio_unitario,
                    0.0, //monto,
                    0.0, //flete
                    0.0, //monto
                    "", //observacion
                    true       
                ); 
             
          
                cmb_almacenactual =  entrada.cargarmaterial_almacen(cmb_almacenactual,"Seleccione...",1);

        }
        else{
             if (evt.getKeyCode() == 27){
         
                    bot_reiniciar.doClick();
                    
             }
             else{
                JOptionPane.showMessageDialog(null, "CARÁCTER NO VÁLIDO. SOLO NÚMEROS (1..9)", "SISTIMACA - USUARIO", JOptionPane.ERROR_MESSAGE,null);
                txt_nromaterial.setText("");
             }   
        }            
        

    }//GEN-LAST:event_txt_nromaterialKeyReleased

    private void txt_ubicaciondestinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ubicaciondestinoKeyReleased
        
        if(!txt_ubicaciondestino.getText().trim().equals("")){
            ctrl_ubicacion ubicacion = new ctrl_ubicacion(0, txt_ubicaciondestino.getText().trim(),"");
               
            if(ubicacion.buscar_ubicacion().equals(0)){
                lbl_ubicacionexiste.setText("UBICACIÓN NO EXISTE");
                lbl_ubicacionexiste.setForeground(Color.RED);
                 bot_actualizarmaterial.setEnabled(false);
            }
            else{
                lbl_ubicacionexiste.setText("UBICACIÓN EXISTE");
                lbl_ubicacionexiste.setForeground(Color.GREEN);
                if(txt_ubicaciondestino.getText().trim().toUpperCase().equals(cmb_ubicacionactual.getSelectedItem().toString().trim().substring(4, cmb_ubicacionactual.getSelectedItem().toString().trim().length()).trim())){
                    JOptionPane.showMessageDialog(null, "LA UBICACIÓN ACTUAL ES IDÉNTICA A LA UBICACIÓN DESTINO");
                    bot_actualizarmaterial.setEnabled(false);
                    spin_cantidadtrans.setEnabled(false);
                }
                else{
                   bot_actualizarmaterial.setEnabled(true);
                   spin_cantidadtrans.setEnabled(true);
                }
               
            }
            txt_idubicacion.setText(ubicacion.buscar_ubicacion().toString());
        }   
        else{
            lbl_ubicacionexiste.setText("");
            txt_idubicacion.setText("0");
            bot_actualizarmaterial.setEnabled(false);
        }
    }//GEN-LAST:event_txt_ubicaciondestinoKeyReleased
 
    public static void actualizar_material_ubicacion_enalmacen(){
         class_entrada modelo_entrada;
        
        String fecha_contabilizacion;
        
        fecha_contabilizacion = funciones.fecha_bd_usuario(funciones.getfechacalendario(), 2);
        
        if (/*!cmb_almacendestino.getSelectedItem().equals("Seleccione...") &&*/ !txt_idubicacion.getText().equals("0") &&
            !cmb_almacenactual.getSelectedItem().equals("Seleccione...")  && !cmb_ubicacionactual.getSelectedItem().equals("Seleccione...") ){ 
           
           if(Integer.parseInt(spin_cantidadtrans.getValue().toString()) <= Integer.parseInt(lbl_desstockdisponible.getText())){ 
            
  
            
            //DATOS DE ENTRADA -ALMACEN ENTRANTE
            ctrl_entrada entrada_2  = new ctrl_entrada(
                    0, //id_entrada,
                    0, 
                    Integer.parseInt(lbl_descodmaterial.getText().trim()), //id_material, 
                    "", //descripcionmaterial
                    0, //idvaloracion
                    "", //descripcionvaloracion
                    0,  //moneda
                    "", // descripcion_moneda,  
                    Integer.parseInt(cmb_almacenactual.getSelectedItem().toString().substring(0,3).trim()), //id_almacen,
                    "", //descripcion_almacen,
                    Integer.parseInt(cmb_ubicacionactual.getSelectedItem().toString().substring(0,3).trim()),//id_ubicacion
                    "", //ubicacion
                    0,//id_procedencia
                    "", //procedencia
                    13,//id_clasedemovimiento
                    "TRANSFERENCIA", //descripcion_clasedemovimiento
                    0,//id_proyecto
                    "", //descripcion_proyecto
                    Integer.parseInt(frm_principalM1.lbl_cedula.getText()),
                    "",//codigo_alterno
                    0, //iddocumento
                    0,//idcompra
                    0, //nrofactura
                    fecha_contabilizacion, //fecha_entrada,
                    Integer.parseInt(spin_cantidadtrans.getValue().toString()), //cantidad_ingresada,
                    0.0, //precio_unitario,
                    0.0, //monto,
                    0.0, //flete
                    0.0, //monto
                    "", //observacion
                    true //status
                           
            ); 
            
            modelo_entrada = entrada_2.transferencia_ubicacion_enalmacen(Integer.parseInt(txt_idubicacion.getText().trim()),Integer.parseInt(lbl_desstockdisponible.getText()));
            
            if (modelo_entrada.isStatus()){
                
               JOptionPane.showMessageDialog(null, "ACTUALIZADO REGISTRO");
               bot_reiniciar.doClick();
            }
          }
          else{
            JOptionPane.showMessageDialog(null, "LA CANTIDAD A TRANSFERIR ES SUPERIOR A LA CANTIDAD DISPONIBLE EN LA UBICACIÓN ACTUAL");
             bot_actualizarmaterial.setEnabled(false);
          } 
        }
        else{
             JOptionPane.showMessageDialog(null, "FALTAN DATOS POR COMPLETAR PARA REALIZAR LA TRANSFERENCIA DEL MATERIAL");
             bot_actualizarmaterial.setEnabled(false);
        }
       
    }

            
  
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
                new frm_transferenciamaterialubicacionenalmacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton bot_actualizarmaterial;
    protected static javax.swing.JButton bot_buscardesde;
    private javax.swing.JButton bot_cerrar;
    protected static javax.swing.JButton bot_reiniciar;
    protected static javax.swing.JComboBox<String> cmb_almacenactual;
    protected static javax.swing.JComboBox<String> cmb_ubicacionactual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl_almacen;
    private javax.swing.JLabel lbl_almacen1;
    private javax.swing.JLabel lbl_almacen3;
    private javax.swing.JLabel lbl_almacen4;
    protected static javax.swing.JLabel lbl_cantidadentrante;
    protected static javax.swing.JLabel lbl_cantidadsaliente;
    protected static javax.swing.JLabel lbl_cantumb;
    private javax.swing.JLabel lbl_clasematerial;
    private javax.swing.JLabel lbl_codmatalternativo;
    protected static javax.swing.JLabel lbl_descantidadentrante;
    protected static javax.swing.JLabel lbl_descantidadsaliente;
    protected static javax.swing.JLabel lbl_desclasematerial;
    protected static javax.swing.JLabel lbl_descodmaterial;
    private javax.swing.JLabel lbl_descripcionmaterial;
    protected static javax.swing.JLabel lbl_desdescripcion;
    protected static javax.swing.JLabel lbl_desgrupomaterial;
    protected static javax.swing.JLabel lbl_desmarca;
    protected static javax.swing.JLabel lbl_desmodelo;
    protected static javax.swing.JLabel lbl_desstockdisponible;
    protected static javax.swing.JLabel lbl_desumb;
    private javax.swing.JLabel lbl_encabezadoalmacen2;
    private javax.swing.JLabel lbl_grupomaterial;
    private javax.swing.JLabel lbl_imagentimaca2;
    private javax.swing.JLabel lbl_marca;
    private javax.swing.JLabel lbl_materialdesde2;
    private javax.swing.JLabel lbl_modelo;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_nromaterialdesde1;
    private javax.swing.JLabel lbl_stockdisponible;
    private javax.swing.JLabel lbl_ubicacionexiste;
    private javax.swing.JLabel lbl_umb;
    protected static javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_desde;
    protected static javax.swing.JSpinner spin_cantidadtrans;
    protected static javax.swing.JTextField txt_idubicacion;
    protected static javax.swing.JTextField txt_nromaterial;
    protected static javax.swing.JTextField txt_ubicaciondestino;
    // End of variables declaration//GEN-END:variables
}
