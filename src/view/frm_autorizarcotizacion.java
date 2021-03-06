/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.itextpdf.text.DocumentException;
import controlador.ctrl_comun;
import java.awt.Color;
import controlador.ctrl_cotizacion;
import controlador.ctrl_ordendecompra;

import controlador.ctrl_solicitud;
import formatos_pdf.pdf_cotizacion;
import java.awt.Image;
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import model.class_cotizacion;
import model.class_ordendecompra;
import model.class_proveedor;
import model.class_proyecto;
import model.class_solicitud;

/**
 *
 * @author ruben
 */
public class frm_autorizarcotizacion extends javax.swing.JFrame {

    /**
     * Creates new form frm_cotizacion
     */
    public frm_autorizarcotizacion() {
        initComponents();
         this.setExtendedState(MAXIMIZED_BOTH);
         this.setTitle("SISTIMACA - AUTORIZAR COTIZACIONES");
        this.getContentPane().setBackground(new Color(240,240,240));
        
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

        txt_posicion = new javax.swing.JTextField();
        txt_idcotizacion = new javax.swing.JTextField();
        txt_idproveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_posicioncotizacion = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txt_totalposicion = new javax.swing.JTextField();
        lbl_moneda = new javax.swing.JLabel();
        spin_cantidadcotizada = new javax.swing.JSpinner();
        lbl_cantidadcotizada = new javax.swing.JLabel();
        txt_preciounitario = new javax.swing.JTextField();
        lbl_preciounitario = new javax.swing.JLabel();
        txt_cantidadsolicitada = new javax.swing.JTextField();
        lbl_cantidadsolicitada = new javax.swing.JLabel();
        txt_numeromaterial = new javax.swing.JTextField();
        lbl_numeromaterial = new javax.swing.JLabel();
        date_cotizacion = new com.toedter.calendar.JDateChooser();
        lbl_fechacotizacion = new javax.swing.JLabel();
        lbl_proveedor = new javax.swing.JLabel();
        txt_descripcionproveedor = new javax.swing.JTextField();
        lbl_umb2 = new javax.swing.JLabel();
        lbl_umb1 = new javax.swing.JLabel();
        lbl_posicion1 = new javax.swing.JLabel();
        cmb_moneda = new javax.swing.JComboBox<>();
        panel_foto = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();
        txt_rifproveedor = new javax.swing.JTextField();
        bot_buscarproveedor = new javax.swing.JButton();
        lbl_rifproveedor = new javax.swing.JLabel();
        lbl_titulodetalleoc = new javax.swing.JLabel();
        lbl_nrosolicitud = new javax.swing.JLabel();
        txt_numerosolicitud = new javax.swing.JTextField();
        bot_buscar = new javax.swing.JButton();
        lbl_titulodetallesolicitud = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_posicionsolicitud = new javax.swing.JTable();
        lbl_titulosolicitud = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_solicitudpendientes = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        lbl_encabezadoalmacen2 = new javax.swing.JLabel();
        lbl_imagentimaca2 = new javax.swing.JLabel();
        bot_reiniciar = new javax.swing.JButton();
        bot_cerrar = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        txt_posicion.setText("0");

        txt_idcotizacion.setText("0");

        table_posicioncotizacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table_posicioncotizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "POSICIÓN", "PROVEEDOR", "NRO MATERIAL", "MATERIAL", "CANTIDAD A COTIZAR", "UMB", "PRECIO UNITARIO", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_posicioncotizacion);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        txt_totalposicion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_totalposicion.setEnabled(false);
        txt_totalposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalposicionActionPerformed(evt);
            }
        });
        jPanel1.add(txt_totalposicion);
        txt_totalposicion.setBounds(650, 100, 110, 23);

        lbl_moneda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_moneda.setText("MONEDA");
        jPanel1.add(lbl_moneda);
        lbl_moneda.setBounds(780, 80, 127, 15);

        spin_cantidadcotizada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spin_cantidadcotizada.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spin_cantidadcotizada.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spin_cantidadcotizadaStateChanged(evt);
            }
        });
        jPanel1.add(spin_cantidadcotizada);
        spin_cantidadcotizada.setBounds(360, 100, 80, 24);

        lbl_cantidadcotizada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_cantidadcotizada.setText("CANTIDAD COTIZADA");
        jPanel1.add(lbl_cantidadcotizada);
        lbl_cantidadcotizada.setBounds(350, 80, 131, 15);

        txt_preciounitario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_preciounitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_preciounitarioActionPerformed(evt);
            }
        });
        txt_preciounitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_preciounitarioKeyReleased(evt);
            }
        });
        jPanel1.add(txt_preciounitario);
        txt_preciounitario.setBounds(520, 100, 110, 23);

        lbl_preciounitario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_preciounitario.setText("PRECIO UNITARIO");
        jPanel1.add(lbl_preciounitario);
        lbl_preciounitario.setBounds(510, 80, 110, 15);

        txt_cantidadsolicitada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_cantidadsolicitada.setEnabled(false);
        jPanel1.add(txt_cantidadsolicitada);
        txt_cantidadsolicitada.setBounds(200, 100, 80, 23);

        lbl_cantidadsolicitada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_cantidadsolicitada.setText("CANTIDAD SOLICITADA");
        jPanel1.add(lbl_cantidadsolicitada);
        lbl_cantidadsolicitada.setBounds(190, 80, 144, 15);

        txt_numeromaterial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_numeromaterial.setEnabled(false);
        txt_numeromaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numeromaterialActionPerformed(evt);
            }
        });
        jPanel1.add(txt_numeromaterial);
        txt_numeromaterial.setBounds(30, 100, 80, 23);

        lbl_numeromaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_numeromaterial.setText("NÚMERO DE MATERIAL");
        jPanel1.add(lbl_numeromaterial);
        lbl_numeromaterial.setBounds(20, 80, 140, 15);
        jPanel1.add(date_cotizacion);
        date_cotizacion.setBounds(550, 30, 150, 20);

        lbl_fechacotizacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_fechacotizacion.setText("FECHA COTIZACION");
        jPanel1.add(lbl_fechacotizacion);
        lbl_fechacotizacion.setBounds(550, 10, 147, 17);

        lbl_proveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_proveedor.setText("PROVEEDOR");
        jPanel1.add(lbl_proveedor);
        lbl_proveedor.setBounds(260, 10, 89, 17);

        txt_descripcionproveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_descripcionproveedor.setEnabled(false);
        jPanel1.add(txt_descripcionproveedor);
        txt_descripcionproveedor.setBounds(270, 30, 250, 23);

        lbl_umb2.setText("texto");
        lbl_umb2.setToolTipText("");
        jPanel1.add(lbl_umb2);
        lbl_umb2.setBounds(450, 100, 26, 14);

        lbl_umb1.setText("texto");
        jPanel1.add(lbl_umb1);
        lbl_umb1.setBounds(290, 100, 26, 14);

        lbl_posicion1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_posicion1.setText("TOTAL POSICIÓN");
        jPanel1.add(lbl_posicion1);
        lbl_posicion1.setBounds(650, 80, 127, 15);

        cmb_moneda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(cmb_moneda);
        cmb_moneda.setBounds(780, 100, 110, 21);

        panel_foto.setBackground(new java.awt.Color(255, 255, 255));
        panel_foto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FOTO REFERENCIAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        panel_foto.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout panel_fotoLayout = new javax.swing.GroupLayout(panel_foto);
        panel_foto.setLayout(panel_fotoLayout);
        panel_fotoLayout.setHorizontalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        panel_fotoLayout.setVerticalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fotoLayout.createSequentialGroup()
                .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(panel_foto);
        panel_foto.setBounds(910, 0, 170, 140);

        txt_rifproveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_rifproveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rifproveedorKeyReleased(evt);
            }
        });
        jPanel1.add(txt_rifproveedor);
        txt_rifproveedor.setBounds(20, 40, 140, 23);

        bot_buscarproveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_buscarproveedor.setIcon(new ImageIcon("imagenes/icon/buscar.png"));
        bot_buscarproveedor.setText("Buscar");
        bot_buscarproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_buscarproveedorActionPerformed(evt);
            }
        });
        jPanel1.add(bot_buscarproveedor);
        bot_buscarproveedor.setBounds(170, 40, 79, 25);
        complemento.DisableBorderButton(bot_buscarproveedor);

        lbl_rifproveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_rifproveedor.setText("RIF PROVEEDOR");
        jPanel1.add(lbl_rifproveedor);
        lbl_rifproveedor.setBounds(20, 20, 118, 17);

        lbl_titulodetalleoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_titulodetalleoc.setForeground(new java.awt.Color(0, 138, 218));
        lbl_titulodetalleoc.setText("DETALLES COTIZACION");

        lbl_nrosolicitud.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_nrosolicitud.setText("NRO DE SOLICITUD");

        txt_numerosolicitud.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_numerosolicitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_numerosolicitudKeyReleased(evt);
            }
        });

        bot_buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bot_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        bot_buscar.setText("Buscar");
        bot_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_buscarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulodetallesolicitud.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_titulodetallesolicitud.setForeground(new java.awt.Color(0, 138, 218));
        lbl_titulodetallesolicitud.setText("DETALLE COTIZACIÓN");
        getContentPane().add(lbl_titulodetallesolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, -1, -1));

        table_posicionsolicitud.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        table_posicionsolicitud.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID COTIZACION", "POSICIÓN", "NRO MATERIAL", "MATERIAL SOLICITADO", "CANTIDAD AUTORIZADA", "UMB", "FECHA REQUERIDA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_posicionsolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_posicionsolicitudMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(table_posicionsolicitud);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 1330, 210));

        lbl_titulosolicitud.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_titulosolicitud.setForeground(new java.awt.Color(0, 138, 218));
        lbl_titulosolicitud.setText("COTIZACIONES  POR AUTORIZAR");
        getContentPane().add(lbl_titulosolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        table_solicitudpendientes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        table_solicitudpendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DOCUMENTO SOLICITUD", "CÉDULA", "ANALISTA COMPRAS", "PROYECTO", "EMPRESA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_solicitudpendientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_solicitudpendientesMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(table_solicitudpendientes);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1330, 180));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(null);

        lbl_encabezadoalmacen2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_encabezadoalmacen2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_encabezadoalmacen2.setText("AUTORIZAR COTIZACIÓN");
        jPanel7.add(lbl_encabezadoalmacen2);
        lbl_encabezadoalmacen2.setBounds(250, 10, 400, 29);

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
        lbl_usuario.setBounds(790, 10, 310, 17);

        lbl_nombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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

    private void bot_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_buscarActionPerformed
       ctrl_ordendecompra ordendecompra = null;
       
       if(!txt_numerosolicitud.getText().trim().equals("")){
           ordendecompra = new ctrl_ordendecompra(0,"",Integer.parseInt(txt_numerosolicitud.getText().trim()),0,0,0,0.0,0.0,"","","");
           
           ordendecompra.consultar_solicitud(table_posicionsolicitud);
       }
       
       
       
    }//GEN-LAST:event_bot_buscarActionPerformed

    private void table_posicionsolicitudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_posicionsolicitudMousePressed
         Integer filaposicion;
        Integer filasolicitud;
        /*ctrl_ordendecompra ordendecompra=null;
        BufferedImage img;*/
        
        
        filaposicion = table_posicionsolicitud.getSelectedRow();
        filasolicitud = table_solicitudpendientes.getSelectedRow();
        
        /*txt_numeromaterial.setText(table_posicionsolicitud.getValueAt(fila,1).toString());
        txt_cantidadsolicitada.setText(table_posicionsolicitud.getValueAt(fila,3).toString()); 
        lbl_umb1.setText(table_posicionsolicitud.getValueAt(fila,4).toString());
        lbl_umb2.setText(table_posicionsolicitud.getValueAt(fila,4).toString());
        
        ordendecompra = new ctrl_ordendecompra(0,"",0,0,Integer.parseInt(txt_numeromaterial.getText()),0,0.0,0.0,"","","");
        
        try{
            
            img = funciones.decodeToImage(ordendecompra.consultar_foto());
       
            ImageIcon icon = new ImageIcon(img);
            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lbl_foto.getWidth(), lbl_foto.getHeight(), Image.SCALE_DEFAULT));
            lbl_foto.setText(null);
            lbl_foto.setIcon(icono);
        }
        catch(NullPointerException ex){}*/

        frm_autorizarcotizacionprocura frm = new frm_autorizarcotizacionprocura(table_solicitudpendientes.getValueAt(filasolicitud,0).toString(),table_posicionsolicitud.getValueAt(filaposicion,1).toString(),table_posicionsolicitud.getValueAt(filaposicion,2).toString(),table_posicionsolicitud.getValueAt(filaposicion,3).toString(),table_posicionsolicitud.getValueAt(filaposicion,4),table_posicionsolicitud.getValueAt(filaposicion,5).toString());
        frm.setVisible(true);
    }//GEN-LAST:event_table_posicionsolicitudMousePressed

    private void txt_numerosolicitudKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numerosolicitudKeyReleased
               
        if ( ( (evt.getKeyCode() >= 48 ) && (evt.getKeyCode() <= 57 ) ) || ( (evt.getKeyCode() >= 37 ) && (evt.getKeyCode() <= 40 ) ) || ((evt.getKeyCode() >= 96 ) && (evt.getKeyCode() <= 105 )) || (evt.getKeyCode() == 144) || (evt.getKeyCode() == 127) || (evt.getKeyCode() == 8)  || (evt.getKeyCode() == 10)){       
        }
        else{
             if (evt.getKeyCode() == 27){
         
                    bot_reiniciar.doClick();
                    
             }
             else{
                JOptionPane.showMessageDialog(null, "CARÁCTER NO VÁLIDO. SOLO NÚMEROS (1..9)", "SISTIMACA - USUARIO", JOptionPane.ERROR_MESSAGE,null);
                txt_numerosolicitud.setText("");
             }   
        }            
        
            
    }//GEN-LAST:event_txt_numerosolicitudKeyReleased

    private void txt_preciounitarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_preciounitarioKeyReleased
       String monto = null;
        
        if ( ( (evt.getKeyCode() >= 48 ) && (evt.getKeyCode() <= 57 ) ) || ( (evt.getKeyCode() >= 37 ) && (evt.getKeyCode() <= 40 ) ) || ((evt.getKeyCode() >= 96 ) && (evt.getKeyCode() <= 105 )) || (evt.getKeyCode() == 144) || (evt.getKeyCode() == 127) || (evt.getKeyCode() == 8)  || (evt.getKeyCode() == 10)){       
            monto = String.valueOf(Integer.parseInt(txt_preciounitario.getText().trim()) * Integer.parseInt(spin_cantidadcotizada.getValue().toString()));
            txt_totalposicion.setText(monto);
        }
        else{
             if (evt.getKeyCode() == 27){
         
                    bot_reiniciar.doClick();
                    
             }
             else{
                JOptionPane.showMessageDialog(null, "CARÁCTER NO VÁLIDO. SOLO NÚMEROS (1..9)", "SISTIMACA - USUARIO", JOptionPane.ERROR_MESSAGE,null);
                txt_preciounitario.setText("");
                txt_totalposicion.setText("");
             }   
        }   
    }//GEN-LAST:event_txt_preciounitarioKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            
            
        ctrl_cotizacion cotizacion = new ctrl_cotizacion(
                   0, 
                   0, 
                   "", 
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
                   "", //tipo plazo entrega
                    0, //dias plazoentrega
                   "", //condicion de pago
                   "", //tipotransporte
                    0, //diasflete
                    0.0, //costoflete
                    0, //codigomonedaflete
                   "", //fotocotizacion
                    "", //justificacion
                    "", //observacion     
                   false, 
                   false, 
                   "", 
                   false, 
                   "", 
                   false, 
                   0,
                   "",
                   true
                );       
                
            cotizacion.consultar_cotizacion_por_autorizar(Integer.parseInt(frm_principalM1.lbl_nivel.getText()),table_solicitudpendientes);    
                                    
    }//GEN-LAST:event_formWindowOpened

    private void txt_rifproveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rifproveedorKeyReleased
        /*class_cotizacion modelo_cotizacion = null;
        class_proveedor modelo_proveedor = null;
        
            try {
                
                ctrl_cotizacion cotizacion = new ctrl_cotizacion(0,0,txt_rifproveedor.getText().trim(),"",0,0,0,0,0.0,0.0,0,"",0,"","",true);
                
                modelo_proveedor = cotizacion.buscarempresarif();
                
                if(modelo_proveedor.getStatus()){
                    txt_rifproveedor.setText(txt_rifproveedor.getText().trim());
                    txt_descripcionproveedor.setText(modelo_proveedor.getNombre());
                    txt_idproveedor.setText(modelo_proveedor.getId_proveedor().toString());
                        
                }
                else{
                    txt_descripcionproveedor.setText("");
                }
           
            }            
            catch (NumberFormatException ex) {
                txt_descripcionproveedor.setText("");
            }*/
    }//GEN-LAST:event_txt_rifproveedorKeyReleased

    private void spin_cantidadcotizadaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spin_cantidadcotizadaStateChanged
        String monto = null;
        
        if (!txt_preciounitario.getText().trim().equals("")){
            monto = String.valueOf(Integer.parseInt(txt_preciounitario.getText().trim()) * Integer.parseInt(spin_cantidadcotizada.getValue().toString()));
            txt_totalposicion.setText(monto);
        }    
            
    }//GEN-LAST:event_spin_cantidadcotizadaStateChanged

    private void bot_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_reiniciarActionPerformed
       frm_autorizarcotizacion frm = new frm_autorizarcotizacion();
       frm.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_bot_reiniciarActionPerformed

    private void bot_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_cerrarActionPerformed
        Integer resp = JOptionPane.showConfirmDialog(null, "ESTÁ SEGURO EN SALIR?");
        if (resp.equals(0)){
            this.dispose();
        }    

    }//GEN-LAST:event_bot_cerrarActionPerformed

    private void txt_numeromaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numeromaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numeromaterialActionPerformed

    private void txt_preciounitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_preciounitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_preciounitarioActionPerformed

    private void txt_totalposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalposicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalposicionActionPerformed

    private void bot_buscarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_buscarproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_buscarproveedorActionPerformed

    private void table_solicitudpendientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_solicitudpendientesMousePressed
     ctrl_cotizacion cotizacion = null;
        Integer fila_solicitud;

        fila_solicitud = table_solicitudpendientes.getSelectedRow();
        
               cotizacion = new ctrl_cotizacion(
                   0, 
                   0, 
                   "", 
                   "", 
                   Integer.parseInt(table_solicitudpendientes.getValueAt(fila_solicitud, 0).toString()), 
                   0, 
                   0, 
                   Integer.parseInt(frm_principalM1.lbl_cedula.getText().trim()), 
                   0, 
                   0,
                   0.0, 
                   0.0, 
                   "", 
                   "", //tipo plazo entrega
                    0, //dias plazoentrega
                   "", //condicion de pago
                   "", //tipotransporte
                    0, //diasflete
                    0.0, //costoflete
                    0, //codigomonedaflete
                   "", //fotocotizacion
                    "", //justificacion
                    "", //observacion     
                   false, 
                   false, 
                   "", 
                   false, 
                   "", 
                   false, 
                   0,
                   "",     
                   true
                );   

        try {
            cotizacion.consultar_cotizacion_detalle_porautorizar(Integer.parseInt(frm_principalM1.lbl_nivel.getText()),table_posicionsolicitud);
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_table_solicitudpendientesMousePressed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_autorizarcotizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_buscar;
    private javax.swing.JButton bot_buscarproveedor;
    private javax.swing.JButton bot_cerrar;
    protected static javax.swing.JButton bot_reiniciar;
    private javax.swing.JComboBox<String> cmb_moneda;
    private com.toedter.calendar.JDateChooser date_cotizacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_cantidadcotizada;
    private javax.swing.JLabel lbl_cantidadsolicitada;
    private javax.swing.JLabel lbl_encabezadoalmacen2;
    private javax.swing.JLabel lbl_fechacotizacion;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_imagentimaca2;
    private javax.swing.JLabel lbl_moneda;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_nrosolicitud;
    private javax.swing.JLabel lbl_numeromaterial;
    private javax.swing.JLabel lbl_posicion1;
    private javax.swing.JLabel lbl_preciounitario;
    private javax.swing.JLabel lbl_proveedor;
    private javax.swing.JLabel lbl_rifproveedor;
    private javax.swing.JLabel lbl_titulodetalleoc;
    private javax.swing.JLabel lbl_titulodetallesolicitud;
    private javax.swing.JLabel lbl_titulosolicitud;
    private javax.swing.JLabel lbl_umb1;
    private javax.swing.JLabel lbl_umb2;
    protected static javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_foto;
    private javax.swing.JSpinner spin_cantidadcotizada;
    protected static javax.swing.JTable table_posicioncotizacion;
    private javax.swing.JTable table_posicionsolicitud;
    private javax.swing.JTable table_solicitudpendientes;
    private javax.swing.JTextField txt_cantidadsolicitada;
    private javax.swing.JTextField txt_descripcionproveedor;
    private javax.swing.JTextField txt_idcotizacion;
    private javax.swing.JTextField txt_idproveedor;
    private javax.swing.JTextField txt_numeromaterial;
    private javax.swing.JTextField txt_numerosolicitud;
    private javax.swing.JTextField txt_posicion;
    private javax.swing.JTextField txt_preciounitario;
    private javax.swing.JTextField txt_rifproveedor;
    private javax.swing.JTextField txt_totalposicion;
    // End of variables declaration//GEN-END:variables
}
