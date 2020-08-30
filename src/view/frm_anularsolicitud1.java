/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controlador.ctrl_reserva;
import controlador.ctrl_solicitud;
import controlador.ctrl_usuario;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.class_usuario;
import static view.frm_reserva.txt_numeromaterial;

/**
 *
 * @author ruben
 */
public class frm_anularsolicitud1 extends javax.swing.JFrame {

    private Integer fila_solicitud;
    private Integer fila_posicion;
    public frm_anularsolicitud1() {
        initComponents();
        this.getContentPane().setBackground(new Color(240,240,240)); 
        this.setExtendedState(MAXIMIZED_BOTH);
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

        bot_buscar = new javax.swing.JButton();
        txt_idreserva = new javax.swing.JTextField();
        lbl_nroreserva = new javax.swing.JLabel();
        lbl_titulodetallesolicitud = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_resumensolicitud = new javax.swing.JTable();
        lbl_desnombre = new javax.swing.JLabel();
        lbl_desempresa = new javax.swing.JLabel();
        lbl_desarea = new javax.swing.JLabel();
        lbl_desproyecto = new javax.swing.JLabel();
        lbl_desgrupoarticulo = new javax.swing.JLabel();
        lbl_descedula = new javax.swing.JLabel();
        lbl_desumb = new javax.swing.JLabel();
        lbl_desfecharequerida = new javax.swing.JLabel();
        lbl_desnumaterial = new javax.swing.JLabel();
        lbl_desmaterial = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_detallesolicitud = new javax.swing.JTable();
        lbl_titulodetallereserva1 = new javax.swing.JLabel();
        bot_anular = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_grupoarticulo = new javax.swing.JLabel();
        lbl_materialsolicitado = new javax.swing.JLabel();
        lbl_umb = new javax.swing.JLabel();
        lbl_numeromaterial = new javax.swing.JLabel();
        lbl_proyecto = new javax.swing.JLabel();
        lbl_area = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_empresa = new javax.swing.JLabel();
        lbl_fecharequerida = new javax.swing.JLabel();
        lbl_justificacion = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        area_justificacion = new javax.swing.JTextArea();
        panel_foto = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbl_encabezadosolicitud = new javax.swing.JLabel();
        lbl_imagentimaca2 = new javax.swing.JLabel();
        bot_reiniciar = new javax.swing.JButton();
        bot_cerrar = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        bot_buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Search.png"))); // NOI18N
        bot_buscar.setText("BUSCAR");
        bot_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_buscarActionPerformed(evt);
            }
        });

        txt_idreserva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_idreserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_idreservaKeyReleased(evt);
            }
        });

        lbl_nroreserva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nroreserva.setText("NRO DE RESERVA");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulodetallesolicitud.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_titulodetallesolicitud.setForeground(new java.awt.Color(0, 138, 218));
        lbl_titulodetallesolicitud.setText("SOLICITUDES PENDIENTES");
        getContentPane().add(lbl_titulodetallesolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        table_resumensolicitud.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID SOLICITUD", "CEDULA", "NOMBRE", "DESCRIPCION AREA", "PROYECTO", "EMPRESA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_resumensolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_resumensolicitudMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table_resumensolicitud);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 1240, 130));

        lbl_desnombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbl_desnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, -1));

        lbl_desempresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbl_desempresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        lbl_desarea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbl_desarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, -1, -1));

        lbl_desproyecto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbl_desproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, -1, -1));

        lbl_desgrupoarticulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbl_desgrupoarticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, -1, -1));

        lbl_descedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbl_descedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        lbl_desumb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbl_desumb, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, -1, -1));

        lbl_desfecharequerida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(lbl_desfecharequerida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 470, -1, -1));

        lbl_desnumaterial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbl_desnumaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, -1, -1));

        lbl_desmaterial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbl_desmaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, -1, -1));

        table_detallesolicitud.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "POSICIÓN", "NRO MATERIAL", "MATERIAL SOLICITADO", "CANTIDAD SOLICITADA", "UMB", "GRUPO DE ARTÍCULO", "FECHA REQUERIDA", "JUSTIFICACIÓN", "OBSERVACIÓN", "EMPRESA", "CEDULA", "NOMBRE", "DESCRIPCION AREA", "PROYECTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_detallesolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_detallesolicitudMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(table_detallesolicitud);
        if (table_detallesolicitud.getColumnModel().getColumnCount() > 0) {
            table_detallesolicitud.getColumnModel().getColumn(9).setMinWidth(0);
            table_detallesolicitud.getColumnModel().getColumn(9).setPreferredWidth(0);
            table_detallesolicitud.getColumnModel().getColumn(9).setMaxWidth(0);
            table_detallesolicitud.getColumnModel().getColumn(10).setMinWidth(0);
            table_detallesolicitud.getColumnModel().getColumn(10).setPreferredWidth(0);
            table_detallesolicitud.getColumnModel().getColumn(10).setMaxWidth(0);
            table_detallesolicitud.getColumnModel().getColumn(11).setMinWidth(0);
            table_detallesolicitud.getColumnModel().getColumn(11).setPreferredWidth(0);
            table_detallesolicitud.getColumnModel().getColumn(11).setMaxWidth(0);
            table_detallesolicitud.getColumnModel().getColumn(12).setMinWidth(0);
            table_detallesolicitud.getColumnModel().getColumn(12).setPreferredWidth(0);
            table_detallesolicitud.getColumnModel().getColumn(12).setMaxWidth(0);
            table_detallesolicitud.getColumnModel().getColumn(13).setMinWidth(0);
            table_detallesolicitud.getColumnModel().getColumn(13).setPreferredWidth(0);
            table_detallesolicitud.getColumnModel().getColumn(13).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 1240, 130));

        lbl_titulodetallereserva1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_titulodetallereserva1.setForeground(new java.awt.Color(0, 138, 218));
        lbl_titulodetallereserva1.setText("DETALLES DE LA SOLICITUD ");
        getContentPane().add(lbl_titulodetallereserva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        bot_anular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_anular.setIcon(new ImageIcon("imagenes/icon/borrar.png"));
        bot_anular.setText("ANULAR POSICION");
        bot_anular.setEnabled(false);
        bot_anular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_anularActionPerformed(evt);
            }
        });
        getContentPane().add(bot_anular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, 250, 40));
        complemento.DisableBorderButton(bot_anular);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        lbl_grupoarticulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_grupoarticulo.setText("GRUPO ARTICULO");
        jPanel1.add(lbl_grupoarticulo);
        lbl_grupoarticulo.setBounds(358, 133, 129, 17);

        lbl_materialsolicitado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_materialsolicitado.setText("MATERIAL SOLICITADO");
        jPanel1.add(lbl_materialsolicitado);
        lbl_materialsolicitado.setBounds(358, 53, 171, 17);

        lbl_umb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_umb.setText("UMB");
        jPanel1.add(lbl_umb);
        lbl_umb.setBounds(358, 93, 32, 17);

        lbl_numeromaterial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_numeromaterial.setText("NUMERO MATERIAL");
        jPanel1.add(lbl_numeromaterial);
        lbl_numeromaterial.setBounds(358, 13, 142, 17);

        lbl_proyecto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_proyecto.setText("PROYECTO");
        jPanel1.add(lbl_proyecto);
        lbl_proyecto.setBounds(30, 170, 78, 17);

        lbl_area.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_area.setText("AREA");
        jPanel1.add(lbl_area);
        lbl_area.setBounds(30, 130, 39, 17);

        lbl_cedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_cedula.setText("CEDULA");
        jPanel1.add(lbl_cedula);
        lbl_cedula.setBounds(30, 50, 57, 17);

        lbl_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nombre.setText("NOMBRES");
        jPanel1.add(lbl_nombre);
        lbl_nombre.setBounds(30, 90, 72, 17);

        lbl_empresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_empresa.setText("EMPRESA");
        jPanel1.add(lbl_empresa);
        lbl_empresa.setBounds(30, 10, 68, 17);

        lbl_fecharequerida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_fecharequerida.setText("FECHA REQUERIDA");
        jPanel1.add(lbl_fecharequerida);
        lbl_fecharequerida.setBounds(958, 13, 138, 17);

        lbl_justificacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_justificacion.setText("JUSTIFICACION");
        jPanel1.add(lbl_justificacion);
        lbl_justificacion.setBounds(968, 73, 116, 17);

        area_justificacion.setColumns(20);
        area_justificacion.setRows(5);
        jScrollPane3.setViewportView(area_justificacion);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(968, 93, 230, 110);

        panel_foto.setBackground(new java.awt.Color(245, 245, 245));
        panel_foto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FOTO REFERENCIAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        panel_foto.setForeground(new java.awt.Color(0, 138, 218));

        lbl_foto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_fotoLayout = new javax.swing.GroupLayout(panel_foto);
        panel_foto.setLayout(panel_fotoLayout);
        panel_fotoLayout.setHorizontalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        panel_fotoLayout.setVerticalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fotoLayout.createSequentialGroup()
                .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel1.add(panel_foto);
        panel_foto.setBounds(788, 13, 0, 0);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 1240, 220));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(null);

        lbl_encabezadosolicitud.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_encabezadosolicitud.setForeground(new java.awt.Color(255, 255, 255));
        lbl_encabezadosolicitud.setText("ANULAR SOLICITUD");
        jPanel7.add(lbl_encabezadosolicitud);
        lbl_encabezadosolicitud.setBounds(320, 10, 150, 29);

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
        lbl_usuario.setBounds(800, 10, 300, 17);

        lbl_nombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_nombres.setText("NOMBRES");
        lbl_nombres.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(lbl_nombres);
        lbl_nombres.setBounds(802, 30, 300, 17);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jPanel3);
        jPanel3.setBounds(1110, 10, 1, 40);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idreservaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idreservaKeyReleased

        if ( ( (evt.getKeyCode() >= 48 ) && (evt.getKeyCode() <= 57 ) ) || ( (evt.getKeyCode() >= 37 ) && (evt.getKeyCode() <= 40 ) ) || ((evt.getKeyCode() >= 96 ) && (evt.getKeyCode() <= 105 )) || (evt.getKeyCode() == 144) || (evt.getKeyCode() == 127) || (evt.getKeyCode() == 8)  || (evt.getKeyCode() == 10)){
        }
        else{
            if (evt.getKeyCode() == 27){

                bot_reiniciar.doClick();

            }
            else{
                JOptionPane.showMessageDialog(null, "CARACTER NO VALIDO. SOLO NÚMEROS (1..9)", "SISTIMACA - USUARIO", JOptionPane.ERROR_MESSAGE,null);
                txt_idreserva.setText("");
            }
        }

    }//GEN-LAST:event_txt_idreservaKeyReleased

    private void bot_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_buscarActionPerformed
       /* ctrl_reserva reserva = null;

        if(!txt_numeroreserva.getText().trim().equals("")){
            reserva = new ctrl_reserva(

                Integer.parseInt(txt_numeroreserva.getText().trim()),
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

            reserva.consultar_reserva_detalle(table_resumenreserva);
        }*/

    }//GEN-LAST:event_bot_buscarActionPerformed

    private void table_resumensolicitudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_resumensolicitudMousePressed
        ctrl_solicitud solicitud = null;
        
        
        
        fila_solicitud = table_resumensolicitud.getSelectedRow();

                   solicitud = new ctrl_solicitud(
                
                Integer.parseInt(table_resumensolicitud.getValueAt(fila_solicitud,0).toString()),
                Integer.parseInt(frm_principalM1.lbl_cedula.getText().trim()),
                Integer.parseInt(frm_principalM1.lbl_area.getText().trim()),
                "",
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
                "", //fecha solicitud
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

        
        
            solicitud.consultar_solicitud_detalle(Integer.parseInt(frm_principalM1.lbl_nivel.getText()),table_detallesolicitud);
        
        
      
    }//GEN-LAST:event_table_resumensolicitudMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ctrl_solicitud solicitud=null;
        
           solicitud = new ctrl_solicitud(
                
                0,
                Integer.parseInt(frm_principalM1.lbl_cedula.getText().trim()),
                Integer.parseInt(frm_principalM1.lbl_area.getText().trim()),
                "",
                0,
                "",
                0,
                Integer.parseInt(table_resumensolicitud.getValueAt(fila_solicitud,1).toString()), //numero de material
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
                "", //fecha solicitud
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
        solicitud.consultar_solicitud_por_aprobar(Integer.parseInt(frm_principalM1.lbl_nivel.getText()),table_resumensolicitud);
        
    }//GEN-LAST:event_formWindowOpened

    private void table_detallesolicitudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_detallesolicitudMousePressed
        Integer fila;
        BufferedImage img;
        
        fila_posicion  = table_detallesolicitud.getSelectedRow();
        
        lbl_desempresa.setText(table_detallesolicitud.getValueAt(fila_posicion, 9).toString());
        lbl_descedula.setText(table_detallesolicitud.getValueAt(fila_posicion, 10).toString());
        lbl_desnombre.setText(table_detallesolicitud.getValueAt(fila_posicion, 11).toString());
        lbl_desarea.setText(table_detallesolicitud.getValueAt(fila_posicion, 12).toString());
        lbl_desproyecto.setText(table_detallesolicitud.getValueAt(fila_posicion, 13).toString());
        lbl_desnumaterial.setText(table_detallesolicitud.getValueAt(fila_posicion, 1).toString());
        
        lbl_desmaterial.setText(table_detallesolicitud.getValueAt(fila_posicion, 2).toString());
        lbl_desumb.setText(table_detallesolicitud.getValueAt(fila_posicion, 4).toString());
        lbl_desgrupoarticulo.setText(table_detallesolicitud.getValueAt(fila_posicion, 5).toString());
        
        //spin_cantidadautorizada.setValue(table_detallereserva.getValueAt(fila_posicion, 3));
        
        lbl_desfecharequerida.setText(table_detallesolicitud.getValueAt(fila_posicion, 6).toString());
        
        area_justificacion.setText(table_detallesolicitud.getValueAt(fila_posicion, 7).toString());
        
        
        ctrl_solicitud  solicitud = new ctrl_solicitud(
                
                0,
                Integer.parseInt(frm_principalM1.lbl_cedula.getText().trim()),
                Integer.parseInt(frm_principalM1.lbl_area.getText().trim()),
                "",
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
                "", //fecha solicitud
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
            img = funciones.decodeToImage(solicitud.consultar_foto());
       
            ImageIcon icon = new ImageIcon(img);
            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lbl_foto.getWidth(),lbl_foto.getHeight(), Image.SCALE_DEFAULT));
            lbl_foto.setText(null);
            lbl_foto.setIcon(icono);
        }
        catch(NullPointerException ex){}
        
     
                        
        bot_anular.setEnabled(true);
        
        
        
        
    }//GEN-LAST:event_table_detallesolicitudMousePressed

    private void bot_anularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_anularActionPerformed
        class_usuario modelo_usuario;
        int respuesta;
        String firma;
        
        ctrl_usuario usuario = new ctrl_usuario(
                      Integer.parseInt(frm_principalM1.lbl_cedula.getText()),
                       "", 
                       "", 
                       "", 
                       "", 
                       0, 
                       "",
                       0,
                       "",
                       0,
                       true
            );

            modelo_usuario = usuario.buscar_usuario();
            
            respuesta = JOptionPane.showConfirmDialog(null,"ESTA POR ANULAR UNA POSICION, DESEA CONTINUAR?");
        
            if (respuesta == 0){
                firma = JOptionPane.showInputDialog("INTRODUZCA SU FIRMA DIGITAL PARA ANULAR");
                
                if(modelo_usuario.getFirmadigital().equals(firma)){
            

            ctrl_solicitud solicitud = new ctrl_solicitud(
                
                Integer.parseInt(table_resumensolicitud.getValueAt(fila_solicitud, 0).toString()),
                Integer.parseInt(frm_principalM1.lbl_cedula.getText().trim()),
                Integer.parseInt(frm_principalM1.lbl_area.getText().trim()),
                frm_principalM1.lbl_desarea.getText().trim(),
                0,
                "",
                0,
                Integer.parseInt(txt_numeromaterial.getText().trim()), //numero de material
                "",             // descripcion de material     
                0,
                "",
                0,
                "",
                Integer.parseInt(table_detallesolicitud.getValueAt(fila_posicion, 0).toString()),
                0,
                0,
                0,
                0,    
                "", //fecha solicitud
                "",
                 area_justificacion.getText().trim().toUpperCase() + " ANULADO POR " + frm_principalM1.lbl_nombres.getText(),
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
        
                if(solicitud.solicitud_posicion_anular(Integer.parseInt(frm_principalM1.lbl_nivel.getText()))){
                        JOptionPane.showMessageDialog(null, "ANULADO POSICION");
                            
                    }
                }
                else{
                    
                    JOptionPane.showMessageDialog(null, "FIRMA DIGITAL ERRADA. VUELVA A INTENTAR");
                }}
            
                bot_anular.setEnabled(false);
    }//GEN-LAST:event_bot_anularActionPerformed

    private void bot_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_reiniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_reiniciarActionPerformed

    private void bot_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_cerrarActionPerformed
        // TODO add your handling code here:
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
                new frm_anularsolicitud1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_justificacion;
    private javax.swing.JButton bot_anular;
    private javax.swing.JButton bot_buscar;
    private javax.swing.JButton bot_cerrar;
    private javax.swing.JButton bot_reiniciar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_area;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_desarea;
    private javax.swing.JLabel lbl_descedula;
    private javax.swing.JLabel lbl_desempresa;
    private javax.swing.JLabel lbl_desfecharequerida;
    private javax.swing.JLabel lbl_desgrupoarticulo;
    private javax.swing.JLabel lbl_desmaterial;
    private javax.swing.JLabel lbl_desnombre;
    private javax.swing.JLabel lbl_desnumaterial;
    private javax.swing.JLabel lbl_desproyecto;
    private javax.swing.JLabel lbl_desumb;
    private javax.swing.JLabel lbl_empresa;
    private javax.swing.JLabel lbl_encabezadosolicitud;
    private javax.swing.JLabel lbl_fecharequerida;
    protected static javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_grupoarticulo;
    private javax.swing.JLabel lbl_imagentimaca2;
    private javax.swing.JLabel lbl_justificacion;
    private javax.swing.JLabel lbl_materialsolicitado;
    private javax.swing.JLabel lbl_nombre;
    protected static javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_nroreserva;
    private javax.swing.JLabel lbl_numeromaterial;
    private javax.swing.JLabel lbl_proyecto;
    private javax.swing.JLabel lbl_titulodetallereserva1;
    private javax.swing.JLabel lbl_titulodetallesolicitud;
    private javax.swing.JLabel lbl_umb;
    protected static javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_foto;
    private javax.swing.JTable table_detallesolicitud;
    private javax.swing.JTable table_resumensolicitud;
    private javax.swing.JTextField txt_idreserva;
    // End of variables declaration//GEN-END:variables
}
