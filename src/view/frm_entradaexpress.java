/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.itextpdf.text.DocumentException;
import controlador.ctrl_comun;
import controlador.ctrl_entrada;
import controlador.ctrl_material;
import controlador.ctrl_ubicacion;
import formatos_pdf.pdf_recepcion;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.class_entrada;
import javax.swing.UIManager;
import model.class_material;

/**
 *
 * @author ruben
 */
public class frm_entradaexpress extends javax.swing.JFrame {

     
    public frm_entradaexpress() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(240,240,240));
        this.setTitle("SISTIMACA - ENTRADA DIRECTA");
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

        txt_documento = new javax.swing.JTextField();
        txt_idubicacion = new javax.swing.JTextField();
        txt_posicion = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_numeromaterial = new javax.swing.JTextField();
        lbl_descripcionmaterial = new javax.swing.JLabel();
        txt_descripcionmaterial = new javax.swing.JTextField();
        lbl_cantidad = new javax.swing.JLabel();
        spin_cantidad = new javax.swing.JSpinner();
        lbl_almacen = new javax.swing.JLabel();
        cmb_procedencia = new javax.swing.JComboBox<>();
        lbl_ubicacion = new javax.swing.JLabel();
        lbl_procedencia = new javax.swing.JLabel();
        bot_buscar = new javax.swing.JButton();
        lbl_fechaingreso = new javax.swing.JLabel();
        cmb_almacen = new javax.swing.JComboBox<>();
        bot_contabilizar = new javax.swing.JButton();
        panel_foto = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();
        lbl_valoracion = new javax.swing.JLabel();
        cmb_valoracion = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        lbl_encabezadoalmacen2 = new javax.swing.JLabel();
        lbl_imagentimaca2 = new javax.swing.JLabel();
        bot_reiniciar = new javax.swing.JButton();
        bot_cerrar = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_nromaterial = new javax.swing.JLabel();
        date_ingreso = new com.toedter.calendar.JDateChooser();
        bot_documento = new javax.swing.JButton();
        lbl_proyecto = new javax.swing.JLabel();
        txt_ubicacion = new javax.swing.JTextField();
        lbl_ubicacionexiste = new javax.swing.JLabel();
        lbl_umb = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_posicionentrada = new javax.swing.JTable();
        bot_borrar = new javax.swing.JButton();
        txt_idproyecto = new javax.swing.JTextField();
        bot_buscarreporte = new javax.swing.JButton();
        txt_descripcionproyecto = new javax.swing.JTextField();
        lbl_observacion = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        area_observacion = new javax.swing.JTextArea();

        txt_documento.setText("0");
        txt_documento.setToolTipText("");

        txt_idubicacion.setToolTipText("");

        txt_posicion.setText("0");

        txt_id.setText("0");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_numeromaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_numeromaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_numeromaterialKeyReleased(evt);
            }
        });
        getContentPane().add(txt_numeromaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 30));

        lbl_descripcionmaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_descripcionmaterial.setText("DESCRIPCIÓN MATERIAL");
        getContentPane().add(lbl_descripcionmaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txt_descripcionmaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_descripcionmaterial.setEnabled(false);
        getContentPane().add(txt_descripcionmaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 630, 30));

        lbl_cantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_cantidad.setText("CANTIDAD");
        getContentPane().add(lbl_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        spin_cantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        spin_cantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(spin_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 30));

        lbl_almacen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_almacen.setText("ALMACÉN");
        getContentPane().add(lbl_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        cmb_procedencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(cmb_procedencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 260, 30));

        lbl_ubicacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_ubicacion.setText("UBICACIÓN");
        getContentPane().add(lbl_ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        lbl_procedencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_procedencia.setText("PROCEDENCIA");
        getContentPane().add(lbl_procedencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        bot_buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bot_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        bot_buscar.setText("Buscar");
        bot_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(bot_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 110, 30));
        complemento.DisableBorderButton(bot_buscar);

        lbl_fechaingreso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_fechaingreso.setText("FECHA INGRESO");
        getContentPane().add(lbl_fechaingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        cmb_almacen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmb_almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_almacenActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 30));

        bot_contabilizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_contabilizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contabilizar.png"))); // NOI18N
        bot_contabilizar.setText("CONTABILIZAR MATERIAL");
        bot_contabilizar.setEnabled(false);
        bot_contabilizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_contabilizarActionPerformed(evt);
            }
        });
        getContentPane().add(bot_contabilizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));
        complemento.DisableBorderButton(bot_contabilizar);

        panel_foto.setBackground(new java.awt.Color(255, 255, 255));
        panel_foto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FOTO REFERENCIAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        panel_foto.setForeground(new java.awt.Color(0, 0, 255));

        lbl_foto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_fotoLayout = new javax.swing.GroupLayout(panel_foto);
        panel_foto.setLayout(panel_fotoLayout);
        panel_fotoLayout.setHorizontalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );
        panel_fotoLayout.setVerticalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );

        getContentPane().add(panel_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 310, 330));

        lbl_valoracion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_valoracion.setText("VALORACIÓN");
        getContentPane().add(lbl_valoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        cmb_valoracion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(cmb_valoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 260, 30));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(null);

        lbl_encabezadoalmacen2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_encabezadoalmacen2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_encabezadoalmacen2.setText("ENTRADA DIRECTA");
        jPanel7.add(lbl_encabezadoalmacen2);
        lbl_encabezadoalmacen2.setBounds(260, 10, 160, 29);

        lbl_imagentimaca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TIMACA.png"))); // NOI18N
        jPanel7.add(lbl_imagentimaca2);
        lbl_imagentimaca2.setBounds(10, 0, 230, 60);

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
        bot_reiniciar.setBounds(1140, 20, 120, 33);
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
        bot_cerrar.setBounds(1265, 20, 120, 29);
        complemento.DisableBorderButton(bot_cerrar);

        lbl_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_usuario.setText("USUARIO");
        jPanel7.add(lbl_usuario);
        lbl_usuario.setBounds(890, 10, 250, 17);

        lbl_nombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_nombres.setText("NOMBRES");
        lbl_nombres.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(lbl_nombres);
        lbl_nombres.setBounds(890, 40, 250, 17);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jPanel3);
        jPanel3.setBounds(871, 10, 0, 40);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        lbl_nromaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_nromaterial.setText("NÚMERO DE MATERIAL");
        getContentPane().add(lbl_nromaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        getContentPane().add(date_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 130, 30));

        bot_documento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_documento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        bot_documento.setText("VER DOCUMENTO");
        bot_documento.setEnabled(false);
        bot_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_documentoActionPerformed(evt);
            }
        });
        getContentPane().add(bot_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 650, -1, -1));

        lbl_proyecto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_proyecto.setText("PROYECTO");
        getContentPane().add(lbl_proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 160, -1));

        txt_ubicacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_ubicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ubicacionKeyReleased(evt);
            }
        });
        getContentPane().add(txt_ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 120, 30));

        lbl_ubicacionexiste.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(lbl_ubicacionexiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 150, 20));

        lbl_umb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(lbl_umb, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 120, 20));

        table_posicionentrada.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        table_posicionentrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "POSICIÓN", "NRO MATERIAL", "MATERIAL", "CANTIDAD INGRESADA", "UMB", "FECHA DE INGRESO", "ALMACEN DESTINO", "UBICACION", "VALORACION", "OBSERVACIONES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_posicionentrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_posicionentradaMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table_posicionentrada);
        if (table_posicionentrada.getColumnModel().getColumnCount() > 0) {
            table_posicionentrada.getColumnModel().getColumn(9).setMinWidth(0);
            table_posicionentrada.getColumnModel().getColumn(9).setPreferredWidth(0);
            table_posicionentrada.getColumnModel().getColumn(9).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 1030, 150));

        bot_borrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        bot_borrar.setText("BORRAR POSICIÓN");
        bot_borrar.setEnabled(false);
        bot_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_borrarActionPerformed(evt);
            }
        });
        getContentPane().add(bot_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 650, 250, 30));

        txt_idproyecto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_idproyecto.setEnabled(false);
        getContentPane().add(txt_idproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 70, -1));

        bot_buscarreporte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bot_buscarreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Search.png"))); // NOI18N
        bot_buscarreporte.setText("Buscar");
        bot_buscarreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_buscarreporteActionPerformed(evt);
            }
        });
        getContentPane().add(bot_buscarreporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        txt_descripcionproyecto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_descripcionproyecto.setEnabled(false);
        getContentPane().add(txt_descripcionproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 270, -1));

        lbl_observacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_observacion.setText("OBSERVACIONES");
        getContentPane().add(lbl_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        area_observacion.setColumns(20);
        area_observacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        area_observacion.setLineWrap(true);
        area_observacion.setRows(5);
        area_observacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                area_observacionKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(area_observacion);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 340, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_buscarActionPerformed
        frm_buscarmaterial frm = new frm_buscarmaterial(3);
        frm.setVisible(true);
    }//GEN-LAST:event_bot_buscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ctrl_comun control = new ctrl_comun(1);
        cmb_almacen =  control.cargar_combo(cmb_almacen,"Seleccione...");
        control = new ctrl_comun(12);
        cmb_valoracion =  control.cargar_combo(cmb_valoracion,"Seleccione...");
        control = new ctrl_comun(15);
        cmb_procedencia =  control.cargar_combo(cmb_procedencia,"Seleccione...");
        
        
        
        txt_numeromaterial.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void cmb_almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_almacenActionPerformed
        /*if (evt.getModifiers() != 0){
           
           if (!cmb_almacen.getSelectedItem().equals("Seleccione...")){
            ctrl_entrada entrada  = new ctrl_entrada(
                    0, //id_entrada,
                    0, 
                    0, //id_material, 
                    "", //descripcionmaterial
                    0, //idvaloracion
                    "", //descripcionvaloracion
                    1,  //moneda
                    "", // descripcion_moneda,  
                    Integer.parseInt(cmb_almacen.getSelectedItem().toString().substring(0,3).trim()), //id_almacen,
                    "", //descripcion_almacen,
                    0,
                    "", //ubicacion
                    0, //iddocumento
                    0,//idcompra
                    0, //nrofactura
                    "", //fecha_entrada,
                    0, //cantidad_ingresada,
                    0.0, //precio_unitario,
                    0.0, //monto,
                    0.0, //flete
                    0.0, //monto
                    "" //observacion
                           
            ); 
             
          
            cmb_ubicacion =  entrada.cargarmaterial_almacen(cmb_ubicacion,"Seleccione...",3);
           } 
       }*/
    }//GEN-LAST:event_cmb_almacenActionPerformed

    private void bot_contabilizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_contabilizarActionPerformed
       
        frm_progress frm = new frm_progress(1,Integer.parseInt(spin_cantidad.getValue().toString()));
        frm.setVisible(true);
        
  
 
    }//GEN-LAST:event_bot_contabilizarActionPerformed

    private void bot_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_reiniciarActionPerformed
       frm_entradaexpress frm = new frm_entradaexpress();
       frm.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_bot_reiniciarActionPerformed

    private void bot_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_cerrarActionPerformed
        Integer resp = JOptionPane.showConfirmDialog(null, "ESTÁ SEGURO EN SALIR?");
        if (resp.equals(0)){
            this.dispose();
        }    

    }//GEN-LAST:event_bot_cerrarActionPerformed

    private void bot_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_documentoActionPerformed
        try {
            pdf_recepcion.dato("\\\\192.168.0.3\\dist\\Documentos_SisTimaca",Integer.parseInt(txt_documento.getText()),"Express");
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(frm_entradaexpress.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_entradaexpress.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bot_documentoActionPerformed

    private void txt_numeromaterialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numeromaterialKeyReleased
        if ( ( (evt.getKeyCode() >= 48 ) && (evt.getKeyCode() <= 57 ) ) || ( (evt.getKeyCode() >= 37 ) && (evt.getKeyCode() <= 40 ) ) || ((evt.getKeyCode() >= 96 ) && (evt.getKeyCode() <= 105 )) || (evt.getKeyCode() == 144) || (evt.getKeyCode() == 127) || (evt.getKeyCode() == 8)  || (evt.getKeyCode() == 10)){       
            if(txt_numeromaterial.getText().trim().length() > 7){
                ctrl_material material = null;
                class_material modelo_material = null;

                material = new ctrl_material(0,Integer.parseInt(txt_numeromaterial.getText().trim()),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);

                modelo_material = material.consultar_descripcionmaterial();

                txt_descripcionmaterial.setText(modelo_material.getDescripcion());
                lbl_umb.setText(modelo_material.getDescripcion_medida());
                //bot_documento.setEnabled(false);
            }    
        }
        else{
             if (evt.getKeyCode() == 27){
         
                    bot_reiniciar.doClick();
                    
             }
             else{
                JOptionPane.showMessageDialog(null, "CARÁCTER NO VÁLIDO. SOLO NÚMEROS (1..9)", "SISTIMACA - USUARIO", JOptionPane.ERROR_MESSAGE,null);
                txt_numeromaterial.setText("");
                txt_descripcionmaterial.setText("");
             }   
        }     



    }//GEN-LAST:event_txt_numeromaterialKeyReleased

    private void txt_ubicacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ubicacionKeyReleased
        
        if(!txt_ubicacion.getText().trim().equals("")){
            ctrl_ubicacion ubicacion = new ctrl_ubicacion(0, txt_ubicacion.getText().trim(),"");
               
            if(ubicacion.buscar_ubicacion().equals(0)){
                lbl_ubicacionexiste.setText("UBICACIÓN NO EXISTE");
                lbl_ubicacionexiste.setForeground(Color.RED);
            }
            else{
                lbl_ubicacionexiste.setText("UBICACIÓN EXISTE");
                lbl_ubicacionexiste.setForeground(Color.GREEN);
                bot_contabilizar.setEnabled(true);
            }
            txt_idubicacion.setText(ubicacion.buscar_ubicacion().toString());
        }   
        else{
            lbl_ubicacionexiste.setText("");
            txt_idubicacion.setText("0");
        }
    }//GEN-LAST:event_txt_ubicacionKeyReleased

    private void table_posicionentradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_posicionentradaMouseClicked
        bot_borrar.setEnabled(true);
    }//GEN-LAST:event_table_posicionentradaMouseClicked

    private void bot_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_borrarActionPerformed
        class_entrada modelo_entrada = null;
        ctrl_entrada entrada = null;
        
           entrada  = new ctrl_entrada(
                    0, //id_entrada,
                    Integer.parseInt(txt_posicion.getText().trim()), 
                    Integer.parseInt(table_posicionentrada.getValueAt(table_posicionentrada.getSelectedRow(),1).toString()), //id_material, 
                    "", //descripcionmaterial
                    0, //idvaloracion
                    "", //descripcionvaloracion
                    1,  //moneda
                    "", // descripcion_moneda,  
                    0, //id_almacen,
                    "", //descripcion_almacen,
                    0, //id_ubicacion
                    "", //ubicacion
                    0, //id_procedencia
                    "", //descrpcion_procedencia
                     0, //id_clasedemovimiento
                    "", //descrpcion_clasedemovimiento
                     0, //id_proyecto
                    "", //descrpcion_proyecto
                     0,
                    "", //codigo_alterno
                    Integer.parseInt(txt_documento.getText().trim()), //iddocumento
                    0,//idcompra
                    0, //nrofactura
                    "", //fecha_entrada,
                    Integer.parseInt(table_posicionentrada.getValueAt(table_posicionentrada.getSelectedRow(),3).toString()), //cantidad_ingresada,
                    0.0, //precio_unitario,
                    0.0, //monto,
                    0.0, //flete
                    0.0, //monto
                    "", //observacion
                    true //status
                           
            ); 
        
         modelo_entrada = entrada.borrar_posicion(table_posicionentrada,table_posicionentrada.getSelectedRow());
         bot_borrar.setEnabled(false);
    }//GEN-LAST:event_bot_borrarActionPerformed

    private void bot_buscarreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_buscarreporteActionPerformed
        frm_buscarproyecto frm = new frm_buscarproyecto(7);
        frm.setVisible(true);
    }//GEN-LAST:event_bot_buscarreporteActionPerformed

    private void area_observacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_area_observacionKeyReleased
        if(area_observacion.getText().trim().length() > 60){
            area_observacion.setText(area_observacion.getText().trim().substring(0, 60));
        }
    }//GEN-LAST:event_area_observacionKeyReleased
    
    public static void contabilizar_entrada(){
                 
        String fecha_ingreso;
        class_entrada modelo_entrada;
       
        fecha_ingreso = funciones.fecha_convertir_date(date_ingreso, 1);
        
           if (!cmb_almacen.getSelectedItem().equals("Seleccione...") &&
               !txt_idubicacion.getText().trim().equals("0") &&    
               !cmb_procedencia.getSelectedItem().equals("Seleccione...") && 
               !cmb_valoracion.getSelectedItem().equals("Seleccione...") &&
               !txt_id.getText().trim().equals("0") &&
               !fecha_ingreso.equals("") &&
               !txt_numeromaterial.getText().equals("")){
                
                ctrl_entrada entrada  = new ctrl_entrada(
                    Integer.parseInt(txt_documento.getText().trim()), //id_entrada,
                    Integer.parseInt(txt_posicion.getText().trim()), 
                    Integer.parseInt(txt_numeromaterial.getText().trim()), //id_material, 
                    txt_descripcionmaterial.getText().trim(), //descripcionmaterial
                    Integer.parseInt(cmb_valoracion.getSelectedItem().toString().substring(0,3).trim()), //idvaloracion
                    cmb_valoracion.getSelectedItem().toString().substring(4,cmb_valoracion.getSelectedItem().toString().length()).trim(), //descripcionvaloracion
                    1,  //moneda
                    "", // descripcion_moneda,  
                    Integer.parseInt(cmb_almacen.getSelectedItem().toString().substring(0,3).trim()), //id_almacen,
                    cmb_almacen.getSelectedItem().toString().substring(4,cmb_almacen.getSelectedItem().toString().length()).trim(), //descripcion_almacen,
                    Integer.parseInt(txt_idubicacion.getText().trim()),
                    txt_ubicacion.getText().trim(), //ubicacion
                    Integer.parseInt(cmb_procedencia.getSelectedItem().toString().substring(0,3).trim()),
                    cmb_procedencia.getSelectedItem().toString().substring(4,cmb_procedencia.getSelectedItem().toString().length()).trim(), //procedencia
                    1, //clase de material
                    "", //descripcion clase material
                    Integer.parseInt(txt_id.getText().trim()),
                    "", //proyecto
                    Integer.parseInt(frm_principalM1.lbl_cedula.getText()),
                    "",
                    Integer.parseInt(txt_documento.getText().trim()), //iddocumento
                    0,//idcompra
                    0, //nrofactura
                    fecha_ingreso, //fecha_entrada,
                    Integer.parseInt(spin_cantidad.getValue().toString()), //cantidad_ingresada,
                    0.0, //precio_unitario,
                    0.0, //monto,
                    0.0, //flete
                    0.0, //monto
                    area_observacion.getText().trim(), //observacion
                    true       
                ); 
                //table_posicionentrada
                    
                area_observacion.setText("");
                txt_numeromaterial.setText("");
                txt_descripcionmaterial.setText("");
                spin_cantidad.setValue(1);
                cmb_almacen.setSelectedIndex(0);
                txt_ubicacion.setText("");
                date_ingreso.setDate(null);
                txt_id.setText("0");
                txt_idproyecto.setText("");
                txt_descripcionproyecto.setText("");  
                cmb_procedencia.setSelectedIndex(0);
                cmb_valoracion.setSelectedIndex(0);   
                bot_contabilizar.setEnabled(false); 
                lbl_ubicacionexiste.setText("");
                lbl_foto.setIcon(null);
                txt_numeromaterial.requestFocusInWindow();
                bot_buscar.setEnabled(false);
                txt_numeromaterial.setEnabled(false);
                lbl_umb.setText("");
                modelo_entrada = entrada.crear_entrada_express_detalle(table_posicionentrada);
                
                if (modelo_entrada.isStatus()){
                    JOptionPane.showMessageDialog(null, "DATOS AGREGADOS SATISFACTORIAMENTE");
                    txt_posicion.setText(modelo_entrada.getPosicion().toString());
                    txt_documento.setText(String.valueOf(modelo_entrada.getId_documento()));
                    bot_documento.setEnabled(true);
                    bot_buscar.setEnabled(true);
                    txt_numeromaterial.setEnabled(true);
                }
                
           }
           else{
               JOptionPane.showMessageDialog(null,"DATOS INCOMPLETOS");
           }
        
        
        
    } 
    
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
                new frm_entradaexpress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JTextArea area_observacion;
    private javax.swing.JButton bot_borrar;
    protected static javax.swing.JButton bot_buscar;
    private javax.swing.JButton bot_buscarreporte;
    private javax.swing.JButton bot_cerrar;
    protected static javax.swing.JButton bot_contabilizar;
    protected static javax.swing.JButton bot_documento;
    private javax.swing.JButton bot_reiniciar;
    protected static javax.swing.JComboBox<String> cmb_almacen;
    protected static javax.swing.JComboBox<String> cmb_procedencia;
    protected static javax.swing.JComboBox<String> cmb_valoracion;
    protected static com.toedter.calendar.JDateChooser date_ingreso;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl_almacen;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_descripcionmaterial;
    private javax.swing.JLabel lbl_encabezadoalmacen2;
    private javax.swing.JLabel lbl_fechaingreso;
    protected static javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_imagentimaca2;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_nromaterial;
    private javax.swing.JLabel lbl_observacion;
    private javax.swing.JLabel lbl_procedencia;
    private javax.swing.JLabel lbl_proyecto;
    private javax.swing.JLabel lbl_ubicacion;
    protected static javax.swing.JLabel lbl_ubicacionexiste;
    protected static javax.swing.JLabel lbl_umb;
    protected static javax.swing.JLabel lbl_usuario;
    private javax.swing.JLabel lbl_valoracion;
    private javax.swing.JPanel panel_foto;
    protected static javax.swing.JSpinner spin_cantidad;
    protected static javax.swing.JTable table_posicionentrada;
    protected static javax.swing.JTextField txt_descripcionmaterial;
    protected static javax.swing.JTextField txt_descripcionproyecto;
    protected static javax.swing.JTextField txt_documento;
    public static javax.swing.JTextField txt_id;
    protected static javax.swing.JTextField txt_idproyecto;
    protected static javax.swing.JTextField txt_idubicacion;
    protected static javax.swing.JTextField txt_numeromaterial;
    protected static javax.swing.JTextField txt_posicion;
    protected static javax.swing.JTextField txt_ubicacion;
    // End of variables declaration//GEN-END:variables
}
