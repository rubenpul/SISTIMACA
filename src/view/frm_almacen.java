/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controlador.ctrl_almacen;
import controlador.ctrl_comun;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.class_almacen;

/**
 *
 * @author ruben
 */
public class frm_almacen extends javax.swing.JFrame {

    /**
     * Creates new form frm_centrocosto
     */
    public frm_almacen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SISTIMACA - ALMACEN");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.getContentPane().setBackground(new Color(245,245,245));

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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane2 = new javax.swing.JScrollPane();
        table_almacen = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        radio_crearalmacen = new javax.swing.JRadioButton();
        txt_almacen = new javax.swing.JTextField();
        lbl_desalmacen1 = new javax.swing.JLabel();
        lbl_destipoalmacen1 = new javax.swing.JLabel();
        cmb_tipoalmacen = new javax.swing.JComboBox();
        lbl_codalmacen = new javax.swing.JLabel();
        txt_codalmacen = new javax.swing.JTextField();
        bot_crear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        radio_actualizaralmacen = new javax.swing.JRadioButton();
        lbl_desnuevoalmacen = new javax.swing.JLabel();
        lbl_nuevaalmacen = new javax.swing.JLabel();
        lbl_nuevoidalmacen = new javax.swing.JLabel();
        txt_nuevoidalmacen = new javax.swing.JTextField();
        txt_nuevaalmacen = new javax.swing.JTextField();
        bot_actualizar = new javax.swing.JButton();
        cmb_almacen = new javax.swing.JComboBox();
        lbl_nuevodestipoalmacen = new javax.swing.JLabel();
        cmb_nuevotipoalmacen = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        lbl_encabezadoalmacen1 = new javax.swing.JLabel();
        lbl_imagentimaca1 = new javax.swing.JLabel();
        bot_reiniciar = new javax.swing.JButton();
        bot_cerrar = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_almacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table_almacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "DESCRIPCIÓN", "TIPO ALMACÉN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_almacen);
        if (table_almacen.getColumnModel().getColumnCount() > 0) {
            table_almacen.getColumnModel().getColumn(0).setMinWidth(100);
            table_almacen.getColumnModel().getColumn(0).setPreferredWidth(100);
            table_almacen.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 510, 190));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radio_crearalmacen.setBackground(new java.awt.Color(255, 255, 255));
        radio_crearalmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radio_crearalmacen.setSelected(true);
        radio_crearalmacen.setText("CREAR ALMACÉN");
        radio_crearalmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_crearalmacenActionPerformed(evt);
            }
        });
        jPanel1.add(radio_crearalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        txt_almacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_almacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_almacenKeyPressed(evt);
            }
        });
        jPanel1.add(txt_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, -1));

        lbl_desalmacen1.setBackground(new java.awt.Color(240, 255, 255));
        lbl_desalmacen1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_desalmacen1.setText("DESCRIPCIÓN ALMACÉN");
        jPanel1.add(lbl_desalmacen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        lbl_destipoalmacen1.setBackground(new java.awt.Color(240, 255, 255));
        lbl_destipoalmacen1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_destipoalmacen1.setText("TIPO ALMACÉN");
        jPanel1.add(lbl_destipoalmacen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        cmb_tipoalmacen.setBackground(new java.awt.Color(240, 255, 255));
        cmb_tipoalmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmb_tipoalmacen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Central", "Satelite" }));
        cmb_tipoalmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipoalmacenActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_tipoalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 160, -1));

        lbl_codalmacen.setBackground(new java.awt.Color(240, 255, 255));
        lbl_codalmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_codalmacen.setText("CÓDIGO ALMACÉN");
        jPanel1.add(lbl_codalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txt_codalmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_almacen, org.jdesktop.beansbinding.ObjectProperty.create(), txt_codalmacen, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_codalmacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codalmacenKeyPressed(evt);
            }
        });
        jPanel1.add(txt_codalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, -1));

        bot_crear.setBackground(new java.awt.Color(240, 255, 255));
        bot_crear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        bot_crear.setText("CREAR");
        bot_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_crearActionPerformed(evt);
            }
        });
        jPanel1.add(bot_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 1030, 150));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radio_actualizaralmacen.setBackground(new java.awt.Color(255, 255, 255));
        radio_actualizaralmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radio_actualizaralmacen.setText("ACTUALIZAR ALMACÉN");
        radio_actualizaralmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_actualizaralmacenActionPerformed(evt);
            }
        });
        jPanel2.add(radio_actualizaralmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lbl_desnuevoalmacen.setBackground(new java.awt.Color(240, 255, 255));
        lbl_desnuevoalmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_desnuevoalmacen.setText("ALMACÉN");
        jPanel2.add(lbl_desnuevoalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lbl_nuevaalmacen.setBackground(new java.awt.Color(240, 255, 255));
        lbl_nuevaalmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nuevaalmacen.setText("NUEVA DESCRIPCION ALMACÉN");
        jPanel2.add(lbl_nuevaalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        lbl_nuevoidalmacen.setBackground(new java.awt.Color(240, 255, 255));
        lbl_nuevoidalmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nuevoidalmacen.setText("NUEVO CODIGO ALMACÉN");
        jPanel2.add(lbl_nuevoidalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        txt_nuevoidalmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_nuevoidalmacen.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_nuevaalmacen, org.jdesktop.beansbinding.ObjectProperty.create(), txt_nuevoidalmacen, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jPanel2.add(txt_nuevoidalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 160, -1));

        txt_nuevaalmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_nuevaalmacen.setEnabled(false);
        txt_nuevaalmacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nuevaalmacenKeyPressed(evt);
            }
        });
        jPanel2.add(txt_nuevaalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 160, -1));

        bot_actualizar.setBackground(new java.awt.Color(240, 255, 255));
        bot_actualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        bot_actualizar.setText("ACTUALIZAR");
        bot_actualizar.setEnabled(false);
        bot_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(bot_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, -1, -1));

        cmb_almacen.setBackground(new java.awt.Color(240, 255, 255));
        cmb_almacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmb_almacen.setEnabled(false);
        cmb_almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_almacenActionPerformed(evt);
            }
        });
        jPanel2.add(cmb_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, -1));

        lbl_nuevodestipoalmacen.setBackground(new java.awt.Color(240, 255, 255));
        lbl_nuevodestipoalmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nuevodestipoalmacen.setText("TIPO ALMACÉN");
        jPanel2.add(lbl_nuevodestipoalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        cmb_nuevotipoalmacen.setBackground(new java.awt.Color(240, 255, 255));
        cmb_nuevotipoalmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmb_nuevotipoalmacen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Central", "Satelite" }));
        cmb_nuevotipoalmacen.setEnabled(false);
        jPanel2.add(cmb_nuevotipoalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 160, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 1030, 150));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(null);

        lbl_encabezadoalmacen1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_encabezadoalmacen1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_encabezadoalmacen1.setText("Administración Almacenes");
        jPanel6.add(lbl_encabezadoalmacen1);
        lbl_encabezadoalmacen1.setBounds(240, 10, 400, 29);

        lbl_imagentimaca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TIMACA.png"))); // NOI18N
        jPanel6.add(lbl_imagentimaca1);
        lbl_imagentimaca1.setBounds(10, 0, 220, 60);

        bot_reiniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_reiniciar.setForeground(new java.awt.Color(255, 255, 255));
        bot_reiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reiniciar.png"))); // NOI18N
        bot_reiniciar.setText("Reiniciar");
        bot_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_reiniciarActionPerformed(evt);
            }
        });
        jPanel6.add(bot_reiniciar);
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
        jPanel6.add(bot_cerrar);
        bot_cerrar.setBounds(1250, 20, 101, 30);
        complemento.DisableBorderButton(bot_cerrar);

        lbl_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_usuario.setText("USUARIO");
        jPanel6.add(lbl_usuario);
        lbl_usuario.setBounds(910, 10, 190, 17);

        lbl_nombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_nombres.setText("NOMBRES");
        lbl_nombres.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel6.add(lbl_nombres);
        lbl_nombres.setBounds(912, 30, 190, 17);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.add(jPanel3);
        jPanel3.setBounds(1110, 10, 1, 40);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 60));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_crearActionPerformed
      
       class_almacen modelo_almacen;
       ctrl_comun control;
        
        if(!txt_codalmacen.getText().equals("") && !txt_almacen.getText().equals("") && !cmb_tipoalmacen.getSelectedItem().equals("Seleccione...")) {
                
                ctrl_almacen almacen = new ctrl_almacen(0,txt_codalmacen.getText().trim().toUpperCase(),txt_almacen.getText().trim().toUpperCase(),cmb_tipoalmacen.getSelectedItem().toString(),0);
                               
                modelo_almacen = almacen.actualizar_almacen();
                
                if (modelo_almacen.isStatus()){
                    
                   almacen.consulta_almacen(table_almacen);
                         
                   control = new ctrl_comun(1); 
                   cmb_almacen =  control.cargar_combo(cmb_almacen,txt_almacen.getText().toUpperCase().trim());
                   
                }
                
        }
        else{
            JOptionPane.showMessageDialog(null,"DATOS INCOMPLETOS PARA GUARDAR");
        } 
        
    }//GEN-LAST:event_bot_crearActionPerformed

    private void radio_crearalmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_crearalmacenActionPerformed
        txt_codalmacen.setEnabled(true);
        txt_almacen.setEnabled(true);
        bot_crear.setEnabled(true);
        cmb_almacen.setEnabled(false);
        txt_nuevaalmacen.setEnabled(false);
        txt_nuevoidalmacen.setEnabled(false);
        bot_actualizar.setEnabled(false);
        radio_actualizaralmacen.setSelected(false);  
        cmb_tipoalmacen.setEnabled(true);
        cmb_nuevotipoalmacen.setEnabled(false);
        jPanel2.setBackground(new Color(250,250,250));
        jPanel1.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_radio_crearalmacenActionPerformed

    private void radio_actualizaralmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_actualizaralmacenActionPerformed
        
        txt_codalmacen.setText("");
        txt_codalmacen.setEnabled(false);
        txt_almacen.setText("");
        txt_almacen.setEnabled(false);
        cmb_tipoalmacen.setEnabled(false);
        bot_crear.setEnabled(false);
        cmb_almacen.setEnabled(true);
        txt_nuevaalmacen.setEnabled(true);
        txt_nuevoidalmacen.setEnabled(true);
        bot_actualizar.setEnabled(true);
        radio_crearalmacen.setSelected(false); 
        cmb_nuevotipoalmacen.setEnabled(true);
        jPanel1.setBackground(new Color(250,250,250));
        jPanel2.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_radio_actualizaralmacenActionPerformed

    private void bot_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_actualizarActionPerformed
        
        String sql;
        class_almacen modelo_almacen= null; 
        ctrl_comun control;
        boolean resp = true;
       
        
        if(!txt_nuevaalmacen.getText().equals("") && !txt_nuevoidalmacen.getText().equals("") && !cmb_almacen.getSelectedItem().equals("Seleccione...") && !cmb_nuevotipoalmacen.getSelectedItem().equals("Seleccione...") ) {

           
            
            if (!txt_nuevoidalmacen.getText().equals(cmb_almacen.getSelectedItem().toString().substring(0,3).trim())){
                
                ctrl_almacen almacen = new ctrl_almacen(0,txt_nuevoidalmacen.getText().trim().toUpperCase(),"","",0);
                
                modelo_almacen = almacen.buscaridalmacen();
                
                resp =  modelo_almacen.isStatus();
            }
            
            // if (resp){ 
                
                ctrl_almacen almacen = new ctrl_almacen(Integer.parseInt(cmb_almacen.getSelectedItem().toString().substring(0,3).trim()),txt_nuevoidalmacen.getText().trim().toUpperCase(),txt_nuevaalmacen.getText().trim().toUpperCase(),cmb_nuevotipoalmacen.getSelectedItem().toString(),Integer.parseInt(cmb_almacen.getSelectedItem().toString().substring(0,3).trim()));
                
                modelo_almacen = almacen.actualizar_almacen_detalle();

                if (modelo_almacen.isStatus()){
                    
                    almacen.consulta_almacen(table_almacen);
                                                    
                    control = new ctrl_comun(1); 
                    cmb_almacen =  control.cargar_combo(cmb_almacen,txt_almacen.getText().toUpperCase().trim());
                    
                    txt_nuevaalmacen.setText("");
                    
                    txt_nuevoidalmacen.setText("");
                                   
                }
            //}
        }
        else{

            JOptionPane.showMessageDialog(null,"DATOS INCOMPLETOS PARA ACTUALIZAR");
        }
        
    }//GEN-LAST:event_bot_actualizarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
             
        
        ctrl_almacen almacen = new ctrl_almacen(0,"","","",0);
        almacen.consulta_almacen(table_almacen);
         
        ctrl_comun control = new ctrl_comun(1);
        cmb_almacen =  control.cargar_combo(cmb_almacen,"Seleccione...");
        
        txt_codalmacen.requestFocusInWindow();
        
            
    }//GEN-LAST:event_formWindowOpened

    private void txt_almacenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_almacenKeyPressed
        if (evt.getKeyCode()==10){
            bot_crear.doClick();
        }
        
        if (evt.getKeyCode() == 27){
         
            bot_reiniciar.doClick();
                    
        }
    }//GEN-LAST:event_txt_almacenKeyPressed

    private void txt_nuevaalmacenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nuevaalmacenKeyPressed
       if (evt.getKeyCode()==10){
            bot_actualizar.doClick();
        }
        
        if (evt.getKeyCode() == 27){
         
            bot_reiniciar.doClick();
                    
        }
    }//GEN-LAST:event_txt_nuevaalmacenKeyPressed

    private void cmb_almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_almacenActionPerformed
        if(evt.getModifiers() != 0){
            if (cmb_almacen.getSelectedItem().equals("Seleccione...")){
                txt_nuevoidalmacen.setText(""); 
                txt_nuevaalmacen.setText("");
                cmb_nuevotipoalmacen.setSelectedItem("Seleccione...");
            }
            else{
                txt_nuevoidalmacen.setText(cmb_almacen.getSelectedItem().toString().substring(5,cmb_almacen.getSelectedItem().toString().length()).trim());
                //txt_nuevaalmacen.setText(cmb_almacen.getSelectedItem().toString().substring(5,cmb_almacen.getSelectedItem().toString().length()).trim());
                 ctrl_almacen almacen = new ctrl_almacen(0,txt_nuevoidalmacen.getText(),"","",0);
                 cmb_nuevotipoalmacen.setSelectedItem(almacen.consulta_tipoalmacen());
            }
        }
    }//GEN-LAST:event_cmb_almacenActionPerformed

    private void cmb_tipoalmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipoalmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_tipoalmacenActionPerformed

    private void txt_codalmacenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codalmacenKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codalmacenKeyPressed

    private void bot_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_reiniciarActionPerformed
       frm_almacen frm = new frm_almacen();
        frm.setVisible(true);
        this.dispose();
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
       
        //</editor-fold>
       
          
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_almacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_actualizar;
    private javax.swing.JButton bot_cerrar;
    private javax.swing.JButton bot_crear;
    private javax.swing.JButton bot_reiniciar;
    private javax.swing.JComboBox cmb_almacen;
    private javax.swing.JComboBox cmb_nuevotipoalmacen;
    private javax.swing.JComboBox cmb_tipoalmacen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_codalmacen;
    private javax.swing.JLabel lbl_desalmacen1;
    private javax.swing.JLabel lbl_desnuevoalmacen;
    private javax.swing.JLabel lbl_destipoalmacen1;
    private javax.swing.JLabel lbl_encabezadoalmacen1;
    private javax.swing.JLabel lbl_imagentimaca1;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_nuevaalmacen;
    private javax.swing.JLabel lbl_nuevodestipoalmacen;
    private javax.swing.JLabel lbl_nuevoidalmacen;
    protected static javax.swing.JLabel lbl_usuario;
    private javax.swing.JRadioButton radio_actualizaralmacen;
    private javax.swing.JRadioButton radio_crearalmacen;
    private javax.swing.JTable table_almacen;
    private javax.swing.JTextField txt_almacen;
    private javax.swing.JTextField txt_codalmacen;
    private javax.swing.JTextField txt_nuevaalmacen;
    private javax.swing.JTextField txt_nuevoidalmacen;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
