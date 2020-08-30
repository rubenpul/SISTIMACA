/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controlador.ctrl_comun;
import controlador.ctrl_usuario;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.class_usuario;
import javax.swing.UIManager;

/**
 *
 * @author user
 */
public class frm_usuario extends javax.swing.JFrame {

    public frm_usuario() {
        initComponents();
        this.setTitle("SISTIMACA - USUARIOS");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(245,245,245));
        this.setExtendedState(MAXIMIZED_BOTH);
        
        
        this.setIconImage(new ImageIcon(funciones.logoempresa()).getImage());
        
        
        
        // Cargar Look And Feel (Marcos Windows )
        try{
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        }
        catch(Exception e){} 

        lbl_usuario.setText(frm_principalM1.lbl_usuario.getText().trim());
        lbl_nombre.setText(frm_principalM1.lbl_nombres.getText().trim());
        panel_usuario.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        check_ordencompra = new javax.swing.JCheckBox();
        check_crearordencompra = new javax.swing.JCheckBox();
        check_almacen = new javax.swing.JCheckBox();
        check_area = new javax.swing.JCheckBox();
        check_clasematerial = new javax.swing.JCheckBox();
        check_empresa = new javax.swing.JCheckBox();
        check_grupomaterial = new javax.swing.JCheckBox();
        check_moneda = new javax.swing.JCheckBox();
        check_proyecto = new javax.swing.JCheckBox();
        check_crearmaterial = new javax.swing.JCheckBox();
        check_actualizarmaterial = new javax.swing.JCheckBox();
        check_entradamaterial = new javax.swing.JCheckBox();
        check_maestromateriales = new javax.swing.JCheckBox();
        check_prestamomaterial = new javax.swing.JCheckBox();
        check_salidamaterial = new javax.swing.JCheckBox();
        check_agregarsolicitud = new javax.swing.JCheckBox();
        check_actualizarsolicitud = new javax.swing.JCheckBox();
        check_estatussolicitud = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        check_inventario = new javax.swing.JCheckBox();
        check_solicitud = new javax.swing.JCheckBox();
        check_reporte = new javax.swing.JCheckBox();
        check_administracion = new javax.swing.JCheckBox();
        check_actualizarordencompra = new javax.swing.JCheckBox();
        check_estatusordencompra = new javax.swing.JCheckBox();
        lbl_permisologia1 = new javax.swing.JLabel();
        bot_guardar = new javax.swing.JButton();
        bot_actualizar = new javax.swing.JButton();
        bot_baja = new javax.swing.JButton();
        bot_nuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_login = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_confirmar = new javax.swing.JPasswordField();
        bot_buscar = new javax.swing.JButton();
        lbl_nombres = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        lbl_confirmar = new javax.swing.JLabel();
        cmb_perfil = new javax.swing.JComboBox();
        lbl_perfil = new javax.swing.JLabel();
        lbl_area = new javax.swing.JLabel();
        cmb_area = new javax.swing.JComboBox();
        lbl_firmadigital = new javax.swing.JLabel();
        txt_firmadigital = new javax.swing.JPasswordField();
        lbl_correo = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lbl_encabezadoalmacen2 = new javax.swing.JLabel();
        lbl_imagentimaca2 = new javax.swing.JLabel();
        bot_reiniciar = new javax.swing.JButton();
        bot_cerrar = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        bot_alta = new javax.swing.JButton();
        panel_usuario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_usuario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.add(jPanel6);
        jPanel6.setBounds(20, 280, 590, 1);

        check_ordencompra.setBackground(new java.awt.Color(250, 250, 250));
        check_ordencompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        check_ordencompra.setText("Orden de Compra");
        check_ordencompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_ordencompraActionPerformed(evt);
            }
        });
        jPanel9.add(check_ordencompra);
        check_ordencompra.setBounds(20, 260, 149, 25);

        check_crearordencompra.setBackground(new java.awt.Color(255, 255, 255));
        check_crearordencompra.setText("Crear Orden de Compra");
        jPanel9.add(check_crearordencompra);
        check_crearordencompra.setBounds(30, 290, 141, 23);

        check_almacen.setBackground(new java.awt.Color(255, 255, 255));
        check_almacen.setText("Almacén");
        jPanel9.add(check_almacen);
        check_almacen.setBounds(30, 40, 65, 23);

        check_area.setBackground(new java.awt.Color(255, 255, 255));
        check_area.setText("Área");
        jPanel9.add(check_area);
        check_area.setBounds(30, 70, 49, 23);

        check_clasematerial.setBackground(new java.awt.Color(255, 255, 255));
        check_clasematerial.setText("Clase Material");
        jPanel9.add(check_clasematerial);
        check_clasematerial.setBounds(30, 100, 93, 23);

        check_empresa.setBackground(new java.awt.Color(255, 255, 255));
        check_empresa.setText("Empresa");
        jPanel9.add(check_empresa);
        check_empresa.setBounds(30, 130, 67, 23);

        check_grupomaterial.setBackground(new java.awt.Color(255, 255, 255));
        check_grupomaterial.setText("Grupo Material");
        jPanel9.add(check_grupomaterial);
        check_grupomaterial.setBounds(30, 160, 95, 23);

        check_moneda.setBackground(new java.awt.Color(255, 255, 255));
        check_moneda.setText("Moneda");
        jPanel9.add(check_moneda);
        check_moneda.setBounds(30, 190, 63, 23);

        check_proyecto.setBackground(new java.awt.Color(255, 255, 255));
        check_proyecto.setText("Proyecto");
        jPanel9.add(check_proyecto);
        check_proyecto.setBounds(30, 220, 69, 23);

        check_crearmaterial.setBackground(new java.awt.Color(255, 255, 255));
        check_crearmaterial.setText("Crear Material");
        jPanel9.add(check_crearmaterial);
        check_crearmaterial.setBounds(200, 40, 93, 23);

        check_actualizarmaterial.setBackground(new java.awt.Color(255, 255, 255));
        check_actualizarmaterial.setText("Actualizar Material");
        jPanel9.add(check_actualizarmaterial);
        check_actualizarmaterial.setBounds(200, 70, 113, 23);

        check_entradamaterial.setBackground(new java.awt.Color(255, 255, 255));
        check_entradamaterial.setText("Entrada Material");
        jPanel9.add(check_entradamaterial);
        check_entradamaterial.setBounds(200, 100, 105, 23);

        check_maestromateriales.setBackground(new java.awt.Color(255, 255, 255));
        check_maestromateriales.setText("Maestro de Materiales");
        jPanel9.add(check_maestromateriales);
        check_maestromateriales.setBounds(200, 130, 131, 23);

        check_prestamomaterial.setBackground(new java.awt.Color(255, 255, 255));
        check_prestamomaterial.setText("Préstamo de Material");
        jPanel9.add(check_prestamomaterial);
        check_prestamomaterial.setBounds(200, 160, 127, 23);

        check_salidamaterial.setBackground(new java.awt.Color(255, 255, 255));
        check_salidamaterial.setText("Salida de Material");
        jPanel9.add(check_salidamaterial);
        check_salidamaterial.setBounds(200, 190, 109, 23);

        check_agregarsolicitud.setBackground(new java.awt.Color(255, 255, 255));
        check_agregarsolicitud.setText("Agregar Solicitud");
        jPanel9.add(check_agregarsolicitud);
        check_agregarsolicitud.setBounds(370, 40, 107, 23);

        check_actualizarsolicitud.setBackground(new java.awt.Color(255, 255, 255));
        check_actualizarsolicitud.setText("Seguimiento Solicitud");
        jPanel9.add(check_actualizarsolicitud);
        check_actualizarsolicitud.setBounds(370, 70, 125, 23);

        check_estatussolicitud.setBackground(new java.awt.Color(255, 255, 255));
        check_estatussolicitud.setText("Estatus Solicitud");
        jPanel9.add(check_estatussolicitud);
        check_estatussolicitud.setBounds(370, 100, 103, 23);

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.add(jPanel5);
        jPanel5.setBounds(295, 5, 10, 10);

        check_inventario.setBackground(new java.awt.Color(250, 250, 250));
        check_inventario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        check_inventario.setText("Inventario");
        check_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_inventarioActionPerformed(evt);
            }
        });
        jPanel4.add(check_inventario);
        check_inventario.setBounds(180, 0, 99, 25);

        check_solicitud.setBackground(new java.awt.Color(250, 250, 250));
        check_solicitud.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        check_solicitud.setText("Solicitudes");
        check_solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_solicitudActionPerformed(evt);
            }
        });
        jPanel4.add(check_solicitud);
        check_solicitud.setBounds(350, 0, 99, 25);

        check_reporte.setBackground(new java.awt.Color(250, 250, 250));
        check_reporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        check_reporte.setText("Reportes");
        jPanel4.add(check_reporte);
        check_reporte.setBounds(510, 0, 89, 25);

        check_administracion.setBackground(new java.awt.Color(250, 250, 250));
        check_administracion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        check_administracion.setText("Administración");
        check_administracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_administracionActionPerformed(evt);
            }
        });
        jPanel4.add(check_administracion);
        check_administracion.setBounds(10, 0, 127, 25);

        jPanel9.add(jPanel4);
        jPanel4.setBounds(20, 10, 600, 30);

        check_actualizarordencompra.setBackground(new java.awt.Color(255, 255, 255));
        check_actualizarordencompra.setText("Seguimiento Orden de Compra");
        check_actualizarordencompra.setActionCommand("A");
        jPanel9.add(check_actualizarordencompra);
        check_actualizarordencompra.setBounds(30, 320, 171, 23);

        check_estatusordencompra.setBackground(new java.awt.Color(255, 255, 255));
        check_estatusordencompra.setText("Estatus Orden de Compra");
        check_estatusordencompra.setActionCommand("A");
        jPanel9.add(check_estatusordencompra);
        check_estatusordencompra.setBounds(30, 350, 149, 23);

        lbl_permisologia1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_permisologia1.setForeground(new java.awt.Color(0, 138, 218));
        lbl_permisologia1.setText("PERMISOLOGIA");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GESTIONAC - ACTUALIZAR USUARIO");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bot_guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        bot_guardar.setText("GUARDAR");
        bot_guardar.setEnabled(false);
        bot_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_guardarActionPerformed(evt);
            }
        });
        bot_guardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bot_guardarKeyPressed(evt);
            }
        });
        getContentPane().add(bot_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 190, -1));
        complemento.DisableBorderButton(bot_guardar);

        bot_actualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        bot_actualizar.setText("ACTUALIZAR");
        bot_actualizar.setEnabled(false);
        bot_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_actualizarActionPerformed(evt);
            }
        });
        bot_actualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bot_actualizarKeyPressed(evt);
            }
        });
        getContentPane().add(bot_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 160, -1));
        complemento.DisableBorderButton(bot_actualizar);

        bot_baja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_baja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/baja.png"))); // NOI18N
        bot_baja.setText("DAR BAJA");
        bot_baja.setEnabled(false);
        bot_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_bajaActionPerformed(evt);
            }
        });
        bot_baja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bot_bajaKeyPressed(evt);
            }
        });
        getContentPane().add(bot_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 160, -1));
        complemento.DisableBorderButton(bot_baja);

        bot_nuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        bot_nuevo.setText("NUEVO USUARIO");
        bot_nuevo.setEnabled(false);
        bot_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_nuevoActionPerformed(evt);
            }
        });
        bot_nuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bot_nuevoKeyPressed(evt);
            }
        });
        getContentPane().add(bot_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 190, -1));
        complemento.DisableBorderButton(bot_nuevo);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jPanel3);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 166, 590, 0));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_cedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_cedula.setText("ID");
        lbl_cedula.setToolTipText("");
        jPanel10.add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lbl_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_login.setText("USUARIO");
        jPanel10.add(lbl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lbl_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_password.setText("PASSWORD");
        jPanel10.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        txt_cedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyPressed(evt);
            }
        });
        jPanel10.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 200, -1));

        txt_nombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_login, org.jdesktop.beansbinding.ObjectProperty.create(), txt_nombres, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombresKeyPressed(evt);
            }
        });
        jPanel10.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 320, -1));

        txt_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_confirmar, org.jdesktop.beansbinding.ObjectProperty.create(), txt_password, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });
        jPanel10.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 320, -1));

        txt_confirmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cmb_perfil, org.jdesktop.beansbinding.ObjectProperty.create(), txt_confirmar, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_confirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_confirmarKeyPressed(evt);
            }
        });
        jPanel10.add(txt_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 320, -1));

        bot_buscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bot_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        bot_buscar.setText("Buscar");
        bot_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_buscarActionPerformed(evt);
            }
        });
        bot_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bot_buscarKeyPressed(evt);
            }
        });
        jPanel10.add(bot_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, 30));
        complemento.DisableBorderButton(bot_buscar);

        lbl_nombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nombres.setText("NOMBRES");
        jPanel10.add(lbl_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txt_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_password, org.jdesktop.beansbinding.ObjectProperty.create(), txt_login, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_loginKeyPressed(evt);
            }
        });
        jPanel10.add(txt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 320, -1));

        lbl_confirmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_confirmar.setText("CONFIRMAR");
        jPanel10.add(lbl_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        cmb_perfil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmb_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_perfilActionPerformed(evt);
            }
        });
        jPanel10.add(cmb_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 440, 30));

        lbl_perfil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_perfil.setText("PERFIL");
        jPanel10.add(lbl_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        lbl_area.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_area.setText("ÁREA");
        jPanel10.add(lbl_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        cmb_area.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmb_area.setEnabled(false);
        cmb_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_areaActionPerformed(evt);
            }
        });
        jPanel10.add(cmb_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 260, 30));

        lbl_firmadigital.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_firmadigital.setText("FIRMA DIGITAL");
        jPanel10.add(lbl_firmadigital, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        txt_firmadigital.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_firmadigital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_firmadigitalKeyPressed(evt);
            }
        });
        jPanel10.add(txt_firmadigital, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 200, -1));

        lbl_correo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_correo.setText("EMAIL INSTITUCIONAL");
        jPanel10.add(lbl_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        txt_correo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel10.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 260, -1));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 670, 400));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(null);

        lbl_encabezadoalmacen2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_encabezadoalmacen2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_encabezadoalmacen2.setText("ADMINISTRACIÓN USUARIO");
        jPanel7.add(lbl_encabezadoalmacen2);
        lbl_encabezadoalmacen2.setBounds(250, 10, 220, 29);

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
        bot_reiniciar.setBounds(1113, 20, 130, 33);
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
        lbl_usuario.setBounds(860, 10, 240, 17);

        lbl_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_nombre.setText("NOMBRES");
        lbl_nombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(lbl_nombre);
        lbl_nombre.setBounds(862, 30, 240, 17);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jPanel8);
        jPanel8.setBounds(1110, 10, 1, 40);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 60));

        bot_alta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_alta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alta.png"))); // NOI18N
        bot_alta.setText("DAR ALTA");
        bot_alta.setEnabled(false);
        bot_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_altaActionPerformed(evt);
            }
        });
        bot_alta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bot_altaKeyPressed(evt);
            }
        });
        getContentPane().add(bot_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 160, -1));
        complemento.DisableBorderButton(bot_nuevo);

        panel_usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRES", "USUARIO", "NIVEL", "ÁREA", "E-MAIL", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_usuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_usuario);
        if (table_usuario.getColumnModel().getColumnCount() > 0) {
            table_usuario.getColumnModel().getColumn(0).setMinWidth(60);
            table_usuario.getColumnModel().getColumn(0).setPreferredWidth(60);
            table_usuario.getColumnModel().getColumn(0).setMaxWidth(60);
            table_usuario.getColumnModel().getColumn(2).setMinWidth(60);
            table_usuario.getColumnModel().getColumn(2).setPreferredWidth(60);
            table_usuario.getColumnModel().getColumn(2).setMaxWidth(60);
            table_usuario.getColumnModel().getColumn(6).setMinWidth(50);
            table_usuario.getColumnModel().getColumn(6).setPreferredWidth(50);
            table_usuario.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        panel_usuario.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 620, 550));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("RESUMEN DE USUARIOS");
        panel_usuario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        getContentPane().add(panel_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 640, 620));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_buscarActionPerformed
        
       
        boolean resp;
        String tmp;
        class_usuario modelo_usuario;
       
        
        if (!txt_cedula.getText().equals("")){

             ctrl_usuario usuario = new ctrl_usuario(
                       Integer.parseInt(txt_cedula.getText().trim()), 
                       "", 
                       "", 
                       "", 
                       "", 
                       0, 
                       "",
                       0,
                       "",
                       0,
                       true,
                       ""
            );

            modelo_usuario = usuario.buscar_usuario();

            if (modelo_usuario.isConsultaestatus()){

                txt_cedula.setText(String.valueOf(modelo_usuario.getCedula()));
                txt_nombres.setText(String.valueOf(modelo_usuario.getNombres()));
                txt_login.setText(modelo_usuario.getId_usuario()) ;
                txt_password.setText(String.valueOf(modelo_usuario.getPassword()));
                txt_confirmar.setText(String.valueOf(modelo_usuario.getPassword()));
                txt_firmadigital.setText(String.valueOf(modelo_usuario.getFirmadigital()));
                txt_correo.setText(String.valueOf(modelo_usuario.getEmail()));
                       
                 
                ctrl_comun control = new ctrl_comun(8);
                cmb_perfil =  control.cargar_combo(cmb_perfil,modelo_usuario.getDescripcionperfil());
      
               control = new ctrl_comun(2);
                cmb_area =  control.cargar_combo(cmb_area,modelo_usuario.getDescripcionarea());

                if (!frm_principalM1.lbl_desnivel.getText().equals("NIVEL 33")){
                    
                    txt_cedula.setEnabled(false);
                    txt_nombres.setEnabled(false);
                    txt_login.setEnabled(false);
                    txt_password.setEnabled(true);
                    txt_confirmar.setEnabled(true);
                    
                    bot_actualizar.setEnabled(true);    
                    bot_baja.setEnabled(false);
                    bot_nuevo.setEnabled(false);
                    
                    bot_guardar.setEnabled(false);
                    bot_buscar.setEnabled(false);
                  
                    //cmb_area.setEnabled(false);
                    cmb_perfil.setEnabled(false);
                    if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("0") || 
                            cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("1") || 
                            cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("2") || 
                            cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("3") || 
                            cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("4")  || 
                            cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("5")){
                        txt_firmadigital.setEnabled(true);
                    }
                    else{
                        txt_firmadigital.setEnabled(false);
                    }
                }
                else{
                    if (modelo_usuario.isStatus()){
                        txt_cedula.setEnabled(true);
                        txt_nombres.setEnabled(true);
                        txt_login.setEnabled(true);
                        txt_password.setEnabled(true);
                        txt_confirmar.setEnabled(true);
                        txt_firmadigital.setEnabled(true);

                        bot_actualizar.setEnabled(true);
                        bot_baja.setEnabled(true);
                        bot_nuevo.setEnabled(true);

                        cmb_area.setEnabled(true);
                        
                        cmb_perfil.setEnabled(true);
                    }
                    else{
                        txt_cedula.setEnabled(false);
                        txt_nombres.setEnabled(false);
                        txt_login.setEnabled(false);
                        txt_password.setEnabled(false);
                        txt_confirmar.setEnabled(false);
                        txt_firmadigital.setEnabled(false);
                        txt_correo.setEnabled(false);
                        
                        bot_actualizar.setEnabled(false);
                        bot_baja.setEnabled(false);
                        bot_nuevo.setEnabled(true);
                        bot_alta.setEnabled(true);
                        cmb_area.setEnabled(false);
                        cmb_perfil.setEnabled(false);
                    }
                }  
                                        
              
            }
            else{
                
                txt_nombres.requestFocusInWindow();
                
                bot_guardar.setEnabled(true);
                bot_actualizar.setEnabled(false);
                bot_nuevo.setEnabled(false);
                bot_baja.setEnabled(false);
                
                cmb_area.setEnabled(true);
                cmb_perfil.setEnabled(true);
                
                ctrl_comun control = new ctrl_comun(8);
                cmb_perfil =  control.cargar_combo(cmb_perfil,"Seleccione...");
                control = new ctrl_comun(2);
                cmb_area =  control.cargar_combo(cmb_area,"Seleccione...");
                
                txt_nombres.setText("");
                txt_login.setText("");
                txt_password.setText("");
                txt_confirmar.setText("");
                txt_firmadigital.setText("");
                 
                JOptionPane.showMessageDialog(null, "USUARIO NO EXISTE EN LA BASE DE DATOS");
            }

        }

    }//GEN-LAST:event_bot_buscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txt_cedula.requestFocusInWindow();
        ctrl_comun control = new ctrl_comun(8);
        cmb_perfil =  control.cargar_combo(cmb_perfil,"Seleccione...");
        control = new ctrl_comun(2);
        cmb_area =  control.cargar_combo(cmb_area,"Seleccione...");
        
        if (!frm_principalM1.lbl_desnivel.getText().equals("NIVEL 33")){
            txt_cedula.setText(frm_principalM1.lbl_cedula.getText());
            bot_buscar.doClick();
        }
        else{
            bot_nuevo.setEnabled(true);
        }
        
        if (frm_principalM1.lbl_nivel.getText().trim().equals("10")){
        
            ctrl_usuario usuario = new ctrl_usuario(
                 0, 
                 "", 
                 "", 
                 "", 
                 "", 
                 0, 
                 "", 
                 0,
                 "",
                 0,
                 true,
                 ""   
            );
            
            usuario.consulta_usuarios(table_usuario);
            panel_usuario.setVisible(true);
        }
       
        
    }//GEN-LAST:event_formWindowOpened

    private void txt_cedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyPressed
        if (evt.getKeyCode()==10){
            bot_buscar.doClick();
        }
        
        if ( ( (evt.getKeyCode() >= 48 ) && (evt.getKeyCode() <= 57 ) ) || ( (evt.getKeyCode() >= 37 ) && (evt.getKeyCode() <= 40 ) ) || ((evt.getKeyCode() >= 96 ) && (evt.getKeyCode() <= 105 )) || (evt.getKeyCode() == 144) || (evt.getKeyCode() == 127) || (evt.getKeyCode() == 8)  || (evt.getKeyCode() == 10)){       
        
            if(txt_cedula.getText().trim().length() >= 10){
                txt_cedula.setText(txt_cedula.getText().trim().substring(0,9));
            }
        }
        else{
             if (evt.getKeyCode() == 27){
         
                    bot_reiniciar.doClick();
                    
             }
             else{
                JOptionPane.showMessageDialog(null, "CARÁCTER NO VÁLIDO. SOLO NÚMEROS (1..9)", "SISTIMACA - USUARIO", JOptionPane.ERROR_MESSAGE,null);
                txt_cedula.setText("");
             }   
        }

    }//GEN-LAST:event_txt_cedulaKeyPressed

    private void bot_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_guardarActionPerformed
 
        class_usuario modelo_usuario;
        String password = new String(txt_password.getPassword());
        String confirm_password = new String(txt_confirmar.getPassword());
        Integer area=0;
        String firmadigital="";
        boolean validado = false;
        
            //ADMINISTRADOR
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("0")){
                firmadigital = new String(txt_firmadigital.getPassword());
                validado = true;                  
            }
 
        
            //GERENTE DE ADMINISTRACION
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("1")){
                firmadigital = new String(txt_firmadigital.getPassword());
                validado = true;
            }
            
            //GERENTE DE OPERACIONES
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("2")){
                firmadigital = new String(txt_firmadigital.getPassword());
                validado = true;
            }
            
            //JEFE DE PROCURA
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("3")){
                firmadigital = new String(txt_firmadigital.getPassword());
                validado = true;
            }
            
            //JEFE DE DEPARTAMENTO
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("4")){
                
                try{
                    area = Integer.parseInt(cmb_area.getSelectedItem().toString().substring(0, 3).trim());
                    firmadigital = new String(txt_firmadigital.getPassword());
                    if (!area.equals(0)){
                        validado = true;
                    }
                }
                catch(NumberFormatException ex){}    
            }

            //JEFE DE ALMACEN
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("5")){
                firmadigital = new String(txt_firmadigital.getPassword()); 
                validado = true;
            }

            
            //ANALISTA DE ALMACEN
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("6")){
                validado = true;
            }
            
            //COMPRAS
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("7")){
                  validado = true;   
            }

            //ALMACENISTA
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("8")){
                
                validado = true;   
            }

            
            //SOLICITANTE
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("9")){
                
                try{
                    area = Integer.parseInt(cmb_area.getSelectedItem().toString().substring(0, 3).trim());
                    if (!area.equals(0)){
                        validado = true;
                    }
                }
                catch(NumberFormatException ex){}    
            }
            
           
            //TIC
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("10")){
                
                validado = true;
                  
            }
            
            
        if(!txt_correo.getText().equals("") && !txt_cedula.getText().equals("") && !txt_nombres.getText().equals("") && !txt_login.getText().equals("") && !txt_password.getPassword().equals("") && !txt_confirmar.getPassword().equals("") && !cmb_perfil.getSelectedItem().equals("Seleccione...") && validado) {
            
            if (password.equals(confirm_password)){
                                 
                
                ctrl_usuario usuario = new ctrl_usuario(
                       Integer.parseInt(txt_cedula.getText().trim()), 
                       txt_nombres.getText().trim(), 
                       txt_login.getText().trim(), 
                       password, 
                       confirm_password, 
                       Integer.parseInt(cmb_perfil.getSelectedItem().toString().trim().substring(0,3).trim()), 
                       "", 
                       area,
                       firmadigital,
                       0,
                       true,
                       txt_correo.getText().trim()  
                );

                modelo_usuario = usuario.actualizar_usuario();

                if (modelo_usuario.isStatus()){
                    JOptionPane.showMessageDialog(null,"GUARDADO EXITOSAMENTE EL USUARIO " + txt_login.getText().trim().toUpperCase());
                    bot_reiniciar.doClick();
                }
            }
            else{
                 JOptionPane.showMessageDialog(null,"ERROR. NO HAY COINCIDENCIA EN EL PASSWORD");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"DATOS INCOMPLETOS PARA GUARDAR");
        }
    }//GEN-LAST:event_bot_guardarActionPerformed

    private void bot_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_actualizarActionPerformed

        String password = new String(txt_password.getPassword());
        String confirm_password = new String(txt_confirmar.getPassword());
        class_usuario modelo_usuario = null;
        Integer area=0;
        String firmadigital="";
        boolean validado = false;
        
            //ADMINISTRADOR
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("0")){
                firmadigital = new String(txt_firmadigital.getPassword());
                validado = true;
            }
            
            //GERENTE ADMINISTRACION
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("1")){
                firmadigital = new String(txt_firmadigital.getPassword());
                validado = true;
            }
            
            //GERENTE DE OPERACIONES
             if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("2")){
                firmadigital = new String(txt_firmadigital.getPassword());
                validado = true;
            }
             
            //GERENTE DE PROCURA
             if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("3")){
                firmadigital = new String(txt_firmadigital.getPassword());
                validado = true;
            }  
            
            //JEFE DE DEPARTAMENTO 
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("4")){
                
               
                    firmadigital = new String(txt_firmadigital.getPassword());
                  
                  
            }
            
            //JEFE DE ALMACEN
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("5")){
                firmadigital = new String(txt_firmadigital.getPassword()); 
                validado = true;
            }
            
           //ANALISTA DE INVENTARIO
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("6")){
                validado = true;
            }
            
             //COMPRAS
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("7")){
                
                validado = true;
            }
            
            //ALMACENISTA
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("8")){
                
                validado = true;
            }
            
            
            //SOLICITANTE
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("9")){
                
               
            }

            
            //TIC
            if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("10")){
                
                validado = true;
            }
            
             try{
                area = Integer.parseInt(cmb_area.getSelectedItem().toString().substring(0, 3).trim());
                if (!area.equals(0)){
                    validado = true;
                }
             }
             catch(NumberFormatException ex){}
            
            
        if(!txt_correo.getText().equals("") && !txt_cedula.getText().equals("") && !txt_nombres.getText().equals("") && !txt_login.getText().equals("") && !txt_password.getPassword().equals("") && !txt_confirmar.getPassword().equals("") && !cmb_perfil.getSelectedItem().equals("Seleccione...") && validado) {

            if (password.equals(confirm_password)){
            
                 ctrl_usuario usuario = new ctrl_usuario(
                       Integer.parseInt(txt_cedula.getText().trim()), 
                       txt_nombres.getText().trim(), 
                       txt_login.getText().trim(), 
                       password, 
                       confirm_password, 
                       Integer.parseInt(cmb_perfil.getSelectedItem().toString().trim().substring(0,3).trim()), 
                       "",  
                       area,
                       firmadigital,
                       0,
                       true,
                       txt_correo.getText().trim()  
                          
                );

                modelo_usuario = usuario.actualizar_usuario_detalle();

                if (modelo_usuario.isStatus()){
                    JOptionPane.showMessageDialog(null,"DATOS ACTUALIZADOS SATISFACTORIAMENTE DEL USUARIO " + txt_login.getText().trim().toUpperCase());
                    bot_reiniciar.doClick();
                }
            }
            else{
                 JOptionPane.showMessageDialog(null,"ERROR. NO HAY COINCIDENCIA EN EL PASSWORD");
            }    
        }
        else{

            JOptionPane.showMessageDialog(null,"DATOS INCOMPLETOS PARA ACTUALIZAR");
        }
    }//GEN-LAST:event_bot_actualizarActionPerformed

    private void bot_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_bajaActionPerformed
        String sql;
        boolean resp;


        
                 ctrl_usuario usuario = new ctrl_usuario(
                       Integer.parseInt(txt_cedula.getText().trim()), 
                       "", 
                       "", 
                       "", 
                       "", 
                       0, 
                       "",  
                       0,
                       "",
                       0,
                       false,
                       ""   
                );
        resp = usuario.actualizar_status_usuario();

        if (resp){
            bot_baja.setEnabled(false);
            bot_alta.setEnabled(true);
            bot_actualizar.setEnabled(false);
            bot_guardar.setEnabled(false);
            txt_login.setEnabled(false);
            txt_nombres.setEnabled(false);
            txt_password.setEnabled(false);
            txt_confirmar.setEnabled(false);
            cmb_perfil.setEnabled(false);
            cmb_area.setEnabled(false);
            txt_firmadigital.setEnabled(false);
            txt_correo.setEnabled(false);
        }
    }//GEN-LAST:event_bot_bajaActionPerformed

    private void bot_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_nuevoActionPerformed
        bot_reiniciar.doClick();
    }//GEN-LAST:event_bot_nuevoActionPerformed

    private void bot_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bot_buscarKeyPressed
                if (evt.getKeyCode() == 27){
         
                    bot_reiniciar.doClick();
                    
                }
       
    }//GEN-LAST:event_bot_buscarKeyPressed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
         
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void txt_confirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_confirmarKeyPressed
                if (evt.getKeyCode() == 27){
         
                    bot_reiniciar.doClick();
                    
                }
    
    }//GEN-LAST:event_txt_confirmarKeyPressed

    private void bot_guardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bot_guardarKeyPressed
                if (evt.getKeyCode() == 27){
         
                    bot_reiniciar.doClick();
                    
                }
       
    }//GEN-LAST:event_bot_guardarKeyPressed

    private void bot_actualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bot_actualizarKeyPressed
                if (evt.getKeyCode() == 27){
         
                    bot_reiniciar.doClick();
                    
                }
      
    }//GEN-LAST:event_bot_actualizarKeyPressed

    private void bot_bajaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bot_bajaKeyPressed
                if (evt.getKeyCode() == 27){
         
                    bot_reiniciar.doClick();
                    
                }
       
    }//GEN-LAST:event_bot_bajaKeyPressed

    private void bot_nuevoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bot_nuevoKeyPressed
                if (evt.getKeyCode() == 27){
         
                    bot_reiniciar.doClick();
                    
                }
        
    }//GEN-LAST:event_bot_nuevoKeyPressed

    private void txt_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_loginKeyPressed
            if(txt_login.getText().trim().length() >= 20){
                txt_login.setText(txt_login.getText().trim().substring(0,20));
            }
      
    }//GEN-LAST:event_txt_loginKeyPressed

    private void txt_nombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombresKeyPressed
       if (evt.getKeyCode()==10){
            bot_buscar.doClick();
        }
        
        if ( ( (evt.getKeyCode() >= 63 ) && (evt.getKeyCode() <= 90 ) ) || ( (evt.getKeyCode() >= 37 ) && (evt.getKeyCode() <= 40 ) ) || (evt.getKeyCode() == 0 ) || (evt.getKeyCode() == 8 ) || (evt.getKeyCode() == 32 )){       
            if(txt_nombres.getText().trim().length() >= 20){
                txt_nombres.setText(txt_nombres.getText().trim().substring(0,20));
            }

        }
        else{
             if (evt.getKeyCode() == 27){
         
                    bot_reiniciar.doClick();
                    
             }
             else{
                JOptionPane.showMessageDialog(null, "CARÁCTER NO VÁLIDO. SOLO LETRAS (A..Z)", "SISBAL - USUARIO", JOptionPane.ERROR_MESSAGE,null);
                txt_nombres.setText("");
             }   
        }
    }//GEN-LAST:event_txt_nombresKeyPressed

    private void check_administracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_administracionActionPerformed
        if (check_administracion.isSelected()){
             check_almacen.setSelected(true); 
             check_area.setSelected(true);
             check_clasematerial.setSelected(true); 
             check_empresa.setSelected(true); 
             check_grupomaterial.setSelected(true); 
             check_moneda.setSelected(true); 
             check_proyecto.setSelected(true); 
        }
        else{
             check_almacen.setSelected(false); 
             check_area.setSelected(false);
             check_clasematerial.setSelected(false); 
             check_empresa.setSelected(false); 
             check_grupomaterial.setSelected(false); 
             check_moneda.setSelected(false); 
             check_proyecto.setSelected(false); 
            
        }
    }//GEN-LAST:event_check_administracionActionPerformed

    private void check_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_inventarioActionPerformed
        if (check_inventario.isSelected()){
            check_crearmaterial.setSelected(true); 
            check_actualizarmaterial.setSelected(true); 
            check_entradamaterial.setSelected(true); 
            check_maestromateriales.setSelected(true); 
            check_prestamomaterial.setSelected(true); 
            check_salidamaterial.setSelected(true); 
        }
        else{
            check_crearmaterial.setSelected(false); 
            check_actualizarmaterial.setSelected(false); 
            check_entradamaterial.setSelected(false); 
            check_maestromateriales.setSelected(false); 
            check_prestamomaterial.setSelected(false); 
            check_salidamaterial.setSelected(false); 
 
        }
                       
    }//GEN-LAST:event_check_inventarioActionPerformed

    private void check_solicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_solicitudActionPerformed
        if(check_solicitud.isSelected()){
             check_agregarsolicitud.setSelected(true);
             check_actualizarsolicitud.setSelected(true);
             check_estatussolicitud.setSelected(true);
            
        }
        else{
             check_agregarsolicitud.setSelected(false);
             check_actualizarsolicitud.setSelected(false);
             check_estatussolicitud.setSelected(false);
            
        }
       
    }//GEN-LAST:event_check_solicitudActionPerformed

    private void check_ordencompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_ordencompraActionPerformed
         if(check_solicitud.isSelected()){
             check_crearordencompra.setSelected(true);
             check_actualizarordencompra.setSelected(true);
             check_estatusordencompra.setSelected(true);
        }
        else{
             check_crearordencompra.setSelected(false);
             check_actualizarordencompra.setSelected(false);
             check_estatusordencompra.setSelected(false);
        }
    }//GEN-LAST:event_check_ordencompraActionPerformed

    private void cmb_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_perfilActionPerformed
        try{
            if (evt.getModifiers() != 0){
                if(!cmb_perfil.getSelectedItem().equals("Seleccione...")){
                        if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("0")){
                            txt_firmadigital.setEnabled(true);
                            //cmb_area.setEnabled(false);
                        }

                        if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("1")){
                            txt_firmadigital.setEnabled(true);
                            //cmb_area.setEnabled(false);
                        }

                        if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("2")){
                            txt_firmadigital.setEnabled(true);
                            //cmb_area.setEnabled(false);
                        }

                        if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("3")){
                            txt_firmadigital.setEnabled(true);
                             //cmb_area.setEnabled(false);
                        }

                        if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("4")){
                            txt_firmadigital.setEnabled(true);
                            cmb_area.setEnabled(true);
                        }

                        if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("5")){
                            txt_firmadigital.setEnabled(true);
                            //cmb_area.setEnabled(false);
                        }

                        if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("6")){
                            txt_firmadigital.setEnabled(true);
                            //cmb_area.setEnabled(false);
                        }

                        if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("7")){
                            txt_firmadigital.setEnabled(false);
                            //(false);
                        }
                        
                        if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("8")){
                            txt_firmadigital.setEnabled(false);
                            //cmb_area.setEnabled(false);
                        }
                        
                        if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("9")){
                            txt_firmadigital.setEnabled(false);
                            cmb_area.setEnabled(true);
                        }
                        
                        if (cmb_perfil.getSelectedItem().toString().substring(0,3).trim().equals("10")){
                            txt_firmadigital.setEnabled(false);
                            //cmb_area.setEnabled(false);
                        }
                }
            }
        }
        catch(NullPointerException ex){
            
        }
    }//GEN-LAST:event_cmb_perfilActionPerformed

    private void cmb_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_areaActionPerformed

    private void txt_firmadigitalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_firmadigitalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firmadigitalKeyPressed

    private void bot_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_reiniciarActionPerformed
        this.dispose();
        frm_usuario frm = new frm_usuario();
        frm.setVisible(true);
    }//GEN-LAST:event_bot_reiniciarActionPerformed

    private void bot_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_cerrarActionPerformed
        Integer resp = JOptionPane.showConfirmDialog(null, "ESTÁ SEGURO EN SALIR?");
        if (resp.equals(0)){
            this.dispose();
        }    
    }//GEN-LAST:event_bot_cerrarActionPerformed

    private void bot_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_altaActionPerformed
        String sql;
        boolean resp;


        
                 ctrl_usuario usuario = new ctrl_usuario(
                       Integer.parseInt(txt_cedula.getText().trim()), 
                       "", 
                       "", 
                       "", 
                       "", 
                       0, 
                       "",  
                       0,
                       "",
                       0,
                       true,
                       ""  
                          
                );
        resp = usuario.actualizar_status_usuario();

        if (resp){
            bot_baja.setEnabled(true);
            bot_alta.setEnabled(false);
            bot_actualizar.setEnabled(true);
            bot_guardar.setEnabled(false);
            txt_login.setEnabled(true);
            txt_nombres.setEnabled(true);
            txt_password.setEnabled(true);
            txt_confirmar.setEnabled(true);
            txt_cedula.setEnabled(true);
            cmb_perfil.setEnabled(true);
            cmb_area.setEnabled(true);
            txt_firmadigital.setEnabled(true);
        }
    }//GEN-LAST:event_bot_altaActionPerformed

    private void bot_altaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bot_altaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_altaKeyPressed

    private void table_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_usuarioMouseClicked
        Integer fila;
        
        fila = table_usuario.getSelectedRow();
        txt_cedula.setText(table_usuario.getValueAt(fila, 0).toString());
        
        bot_buscar.doClick();
    }//GEN-LAST:event_table_usuarioMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel            0                                                                                                                                              00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000                                   00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 0*/
         //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the for                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000                                                                                                                                                                                                                                                                                                                                                                    m */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_usuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton bot_actualizar;
    private static javax.swing.JButton bot_alta;
    private static javax.swing.JButton bot_baja;
    private static javax.swing.JButton bot_buscar;
    private javax.swing.JButton bot_cerrar;
    private static javax.swing.JButton bot_guardar;
    private static javax.swing.JButton bot_nuevo;
    private javax.swing.JButton bot_reiniciar;
    private javax.swing.JCheckBox check_actualizarmaterial;
    private javax.swing.JCheckBox check_actualizarordencompra;
    private javax.swing.JCheckBox check_actualizarsolicitud;
    private javax.swing.JCheckBox check_administracion;
    private javax.swing.JCheckBox check_agregarsolicitud;
    private javax.swing.JCheckBox check_almacen;
    private javax.swing.JCheckBox check_area;
    private javax.swing.JCheckBox check_clasematerial;
    private javax.swing.JCheckBox check_crearmaterial;
    private javax.swing.JCheckBox check_crearordencompra;
    private javax.swing.JCheckBox check_empresa;
    private javax.swing.JCheckBox check_entradamaterial;
    private javax.swing.JCheckBox check_estatusordencompra;
    private javax.swing.JCheckBox check_estatussolicitud;
    private javax.swing.JCheckBox check_grupomaterial;
    private javax.swing.JCheckBox check_inventario;
    private javax.swing.JCheckBox check_maestromateriales;
    private javax.swing.JCheckBox check_moneda;
    private javax.swing.JCheckBox check_ordencompra;
    private javax.swing.JCheckBox check_prestamomaterial;
    private javax.swing.JCheckBox check_proyecto;
    private javax.swing.JCheckBox check_reporte;
    private javax.swing.JCheckBox check_salidamaterial;
    private javax.swing.JCheckBox check_solicitud;
    private javax.swing.JComboBox cmb_area;
    private javax.swing.JComboBox cmb_perfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_area;
    private static javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_confirmar;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_encabezadoalmacen2;
    private javax.swing.JLabel lbl_firmadigital;
    private javax.swing.JLabel lbl_imagentimaca2;
    private static javax.swing.JLabel lbl_login;
    protected static javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombres;
    private static javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_perfil;
    private javax.swing.JLabel lbl_permisologia1;
    protected static javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_usuario;
    private javax.swing.JTable table_usuario;
    private static javax.swing.JTextField txt_cedula;
    private static javax.swing.JPasswordField txt_confirmar;
    private javax.swing.JTextField txt_correo;
    private static javax.swing.JPasswordField txt_firmadigital;
    private static javax.swing.JTextField txt_login;
    private static javax.swing.JTextField txt_nombres;
    private static javax.swing.JPasswordField txt_password;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
