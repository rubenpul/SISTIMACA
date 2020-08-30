/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

//q import controlador.ctrl_usuario;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
//q import model.class_usuario;

/**
 *
 * @author ruben
 */
public class frm_principalM extends javax.swing.JFrame {

    
    int actual;
    /* q
    ctrl_usuario usuario = new ctrl_usuario(
                       0, 
                       "", 
                       frm_login.txt_usuario.getText().trim(), 
                       "", 
                       "", 
                       0, 
                       "",
                       0,
                       "",
                       0,
                       true, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false, 
                       false,
                       false, 
                       false, 
                       false
            );
   
     q */
    
    
    public frm_principalM() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SISTIMACA - PRINCIPAL");
        this.getContentPane().setBackground(Color.WHITE);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.actual = 2;
        deshabilitar_ventana(3);
        deshabilitar_ventana(4);
        deshabilitar_ventana(5);
        deshabilitar_ventana(6);
        deshabilitar_ventana(7);
        deshabilitar_ventana(8);
        
        
        // Estilos Para Botones
        style.DisableWel(item_11);
        style.DisableWel(item_12);
        style.DisableWel(item_13);
        style.DisableWel(item_14);
        style.DisableWel(item_15);
        style.DisableWel(item_16);
        style.DisableWel(item_18);
        style.DisableWel(item_19);
        style.DisableWel(item_20);
        style.DisableWel(item_21);
        style.DisableWel(item_22);
        style.DisableWel(item_23);
        style.DisableWel(item_24);
        style.DisableWel(item_25);
        style.DisableWel(item_26);
        style.DisableWel(item_27);
        style.DisableWel(item_28);
        style.DisableWel(item_29);
        style.DisableWel(item_30);
        style.DisableWel(item_31);
        style.DisableWel(item_32);
        style.DisableWel(item_33);
        style.DisableWel(item_34);
        style.DisableWel(item_35);
        style.DisableWel(item_36);
        style.DisableWel(item_37);
        style.DisableWel(item_38);
        style.DisableWel(item_39);
        style.DisableWel(item_40);
        style.DisableWel(item_41);
        style.DisableWel(item_42);
        style.DisableWel(item_43);
        
        
        // Cargar Look And Feel (Marcos Windows )
        try{
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        }
        catch(Exception e){} 

        
        /* q
        class_usuario modelo_usuario;
        modelo_usuario = usuario.buscar_usuario_login();
       
        
        lbl_desusuario.setText(frm_login.txt_usuario.getText().trim());
        lbl_desnombres.setText(modelo_usuario.getNombres());
        lbl_nivel.setText(modelo_usuario.getId_perfil().toString());
        lbl_desnivel.setText(modelo_usuario.getDescripcionperfil());
        lbl_cedula.setText(modelo_usuario.getCedula().toString());
        lbl_area.setText(modelo_usuario.getId_area().toString());
        lbl_desarea.setText(modelo_usuario.getDescripcionarea());
         
        q */
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_cedula = new javax.swing.JLabel();
        lbl_area = new javax.swing.JLabel();
        lbl_desarea = new javax.swing.JLabel();
        lbl_nivel = new javax.swing.JLabel();
        lbl_desnivel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        panel_2 = new javax.swing.JPanel();
        item_11 = new javax.swing.JButton();
        item_12 = new javax.swing.JButton();
        item_13 = new javax.swing.JButton();
        item_14 = new javax.swing.JButton();
        item_15 = new javax.swing.JButton();
        item_16 = new javax.swing.JButton();
        item_18 = new javax.swing.JButton();
        item_19 = new javax.swing.JButton();
        item_20 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        item_40 = new javax.swing.JButton();
        item_41 = new javax.swing.JButton();
        item_42 = new javax.swing.JButton();
        item_43 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        panel_3 = new javax.swing.JPanel();
        item_21 = new javax.swing.JButton();
        item_22 = new javax.swing.JButton();
        item_23 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        item_35 = new javax.swing.JButton();
        item_36 = new javax.swing.JButton();
        item_37 = new javax.swing.JButton();
        panel_4 = new javax.swing.JPanel();
        item_24 = new javax.swing.JButton();
        item_25 = new javax.swing.JButton();
        item_26 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panel_5 = new javax.swing.JPanel();
        item_27 = new javax.swing.JButton();
        item_28 = new javax.swing.JButton();
        item_29 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        item_34 = new javax.swing.JButton();
        item_38 = new javax.swing.JButton();
        item_39 = new javax.swing.JButton();
        panel_6 = new javax.swing.JPanel();
        item_30 = new javax.swing.JButton();
        item_31 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panel_7 = new javax.swing.JPanel();
        item_32 = new javax.swing.JButton();
        item_33 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panel_8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bar = new javax.swing.JPanel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bot_cerrar = new javax.swing.JButton();
        bot_salir = new javax.swing.JButton();
        lbl_imagentimaca3 = new javax.swing.JLabel();
        cinta = new javax.swing.JPanel();
        buton4 = new javax.swing.JButton();
        buton2 = new javax.swing.JButton();
        buton7 = new javax.swing.JButton();
        buton3 = new javax.swing.JButton();
        buton5 = new javax.swing.JButton();
        buton8 = new javax.swing.JButton();
        buton6 = new javax.swing.JButton();
        paso = new javax.swing.JPanel();
        lbl_imagentimaca2 = new javax.swing.JLabel();
        lbl_imagentimaca4 = new javax.swing.JLabel();
        lbl_imagentimaca5 = new javax.swing.JLabel();
        lbl_imagentimaca6 = new javax.swing.JLabel();

        lbl_cedula.setText("jLabel1");

        lbl_area.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_area.setText("AREA");

        lbl_desarea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_desarea.setText("AREA");

        lbl_nivel.setText("jLabel1");

        lbl_desnivel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(null);

        jScrollPane2.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(920, 490));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_2.setBackground(new java.awt.Color(255, 255, 255));
        panel_2.setAutoscrolls(true);
        panel_2.setLayout(null);

        item_11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_11.setForeground(new java.awt.Color(0, 183, 220));
        item_11.setIcon(new ImageIcon("imagenes/icon/menu/agregar.png"));
        item_11.setText("Crear Material");
        item_11.setToolTipText("");
        item_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_11ActionPerformed(evt);
            }
        });
        panel_2.add(item_11);
        item_11.setBounds(200, 80, 170, 140);

        item_12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_12.setForeground(new java.awt.Color(0, 183, 220));
        item_12.setIcon(new ImageIcon("imagenes/icon/menu/actualizar.png"));
        item_12.setText("Actualizar Material");
        item_12.setToolTipText("");
        item_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_12ActionPerformed(evt);
            }
        });
        panel_2.add(item_12);
        item_12.setBounds(420, 80, 170, 140);

        item_13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_13.setForeground(new java.awt.Color(0, 183, 220));
        item_13.setIcon(new ImageIcon("imagenes/icon/menu/entrada.png"));
        item_13.setText("Entrada de Material");
        item_13.setToolTipText("");
        item_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_13ActionPerformed(evt);
            }
        });
        panel_2.add(item_13);
        item_13.setBounds(640, 80, 170, 140);

        item_14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_14.setForeground(new java.awt.Color(0, 183, 220));
        item_14.setIcon(new ImageIcon("imagenes/icon/menu/entrada.png"));
        item_14.setText("Entrada Directa");
        item_14.setToolTipText("");
        item_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_14ActionPerformed(evt);
            }
        });
        panel_2.add(item_14);
        item_14.setBounds(860, 80, 170, 140);

        item_15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_15.setForeground(new java.awt.Color(0, 183, 220));
        item_15.setIcon(new ImageIcon("imagenes/icon/menu/maestro.png"));
        item_15.setText("Resumen Stock");
        item_15.setToolTipText("");
        item_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_15ActionPerformed(evt);
            }
        });
        panel_2.add(item_15);
        item_15.setBounds(1090, 80, 170, 140);

        item_16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_16.setForeground(new java.awt.Color(0, 183, 220));
        item_16.setIcon(new ImageIcon("imagenes/icon/menu/salida.png"));
        item_16.setText("Salida Express");
        item_16.setToolTipText("");
        item_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_16ActionPerformed(evt);
            }
        });
        panel_2.add(item_16);
        item_16.setBounds(860, 270, 170, 140);

        item_18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_18.setForeground(new java.awt.Color(0, 183, 220));
        item_18.setIcon(new ImageIcon("imagenes/icon/menu/transferencia.png"));
        item_18.setText("Anular Prestamo");
        item_18.setToolTipText("");
        item_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_18ActionPerformed(evt);
            }
        });
        panel_2.add(item_18);
        item_18.setBounds(420, 270, 170, 140);

        item_19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_19.setForeground(new java.awt.Color(0, 183, 220));
        item_19.setIcon(new ImageIcon("imagenes/icon/menu/transferencia.png"));
        item_19.setText("Crear Prestamo");
        item_19.setToolTipText("");
        item_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_19ActionPerformed(evt);
            }
        });
        panel_2.add(item_19);
        item_19.setBounds(200, 270, 170, 140);

        item_20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_20.setForeground(new java.awt.Color(0, 183, 220));
        item_20.setIcon(new ImageIcon("imagenes/icon/menu/salida.png"));
        item_20.setText("Salida de Material ");
        item_20.setToolTipText("");
        item_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_20ActionPerformed(evt);
            }
        });
        panel_2.add(item_20);
        item_20.setBounds(640, 270, 170, 140);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Transferencia");
        panel_2.add(jLabel7);
        jLabel7.setBounds(100, 450, 400, 22);

        item_40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_40.setForeground(new java.awt.Color(0, 183, 220));
        item_40.setIcon(new ImageIcon("imagenes/icon/menu/material.png"));
        item_40.setText("Material");
        item_40.setToolTipText("");
        item_40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_40ActionPerformed(evt);
            }
        });
        panel_2.add(item_40);
        item_40.setBounds(200, 500, 170, 140);

        item_41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_41.setForeground(new java.awt.Color(0, 183, 220));
        item_41.setIcon(new ImageIcon("imagenes/icon/menu/almacen.png"));
        item_41.setText("Almacen");
        item_41.setToolTipText("");
        item_41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_41ActionPerformed(evt);
            }
        });
        panel_2.add(item_41);
        item_41.setBounds(420, 500, 170, 140);

        item_42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_42.setForeground(new java.awt.Color(0, 183, 220));
        item_42.setIcon(new ImageIcon("imagenes/icon/menu/maestro.png"));
        item_42.setText("Entre Proyectos");
        item_42.setToolTipText("");
        item_42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_42ActionPerformed(evt);
            }
        });
        panel_2.add(item_42);
        item_42.setBounds(640, 500, 170, 140);

        item_43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_43.setForeground(new java.awt.Color(0, 183, 220));
        item_43.setIcon(new ImageIcon("imagenes/icon/menu/anular.png"));
        item_43.setText("Anular");
        item_43.setToolTipText("");
        item_43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_43ActionPerformed(evt);
            }
        });
        panel_2.add(item_43);
        item_43.setBounds(860, 500, 170, 140);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("ALMACEN");
        panel_2.add(jLabel9);
        jLabel9.setBounds(50, 20, 400, 29);

        jPanel1.add(panel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 790));

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 130, 1360, 490);

        panel_3.setBackground(new java.awt.Color(255, 255, 255));
        panel_3.setLayout(null);

        item_21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_21.setForeground(new java.awt.Color(0, 183, 220));
        item_21.setIcon(new ImageIcon("imagenes/icon/menu/agregar.png"));
        item_21.setText("Agregar Solicitud");
        item_21.setToolTipText("");
        item_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_21ActionPerformed(evt);
            }
        });
        panel_3.add(item_21);
        item_21.setBounds(200, 80, 170, 140);

        item_22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_22.setForeground(new java.awt.Color(0, 183, 220));
        item_22.setIcon(new ImageIcon("imagenes/icon/menu/seguimiento.png"));
        item_22.setText("Seguimiento Solicitud");
        item_22.setToolTipText("");
        item_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_22ActionPerformed(evt);
            }
        });
        panel_3.add(item_22);
        item_22.setBounds(1100, 80, 170, 140);

        item_23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_23.setForeground(new java.awt.Color(0, 183, 220));
        item_23.setIcon(new ImageIcon("imagenes/icon/menu/estatus.png"));
        item_23.setText("Estatus Solicitudes");
        item_23.setToolTipText("");
        item_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_23ActionPerformed(evt);
            }
        });
        panel_3.add(item_23);
        item_23.setBounds(200, 270, 170, 140);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("SOLICITUDES");
        panel_3.add(jLabel6);
        jLabel6.setBounds(50, 20, 400, 29);

        item_35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_35.setForeground(new java.awt.Color(0, 183, 220));
        item_35.setIcon(new ImageIcon("imagenes/icon/menu/prestamo.png"));
        item_35.setText("Conformar");
        item_35.setToolTipText("");
        item_35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_35ActionPerformed(evt);
            }
        });
        panel_3.add(item_35);
        item_35.setBounds(420, 80, 170, 140);

        item_36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_36.setForeground(new java.awt.Color(0, 183, 220));
        item_36.setIcon(new ImageIcon("imagenes/icon/menu/anular.png"));
        item_36.setText("Anular");
        item_36.setToolTipText("");
        item_36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_36ActionPerformed(evt);
            }
        });
        panel_3.add(item_36);
        item_36.setBounds(870, 80, 170, 140);

        item_37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_37.setForeground(new java.awt.Color(0, 183, 220));
        item_37.setIcon(new ImageIcon("imagenes/icon/menu/autorizar.png"));
        item_37.setText("Autorizar");
        item_37.setToolTipText("");
        item_37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_37ActionPerformed(evt);
            }
        });
        panel_3.add(item_37);
        item_37.setBounds(640, 80, 170, 140);

        getContentPane().add(panel_3);
        panel_3.setBounds(0, 130, 1620, 490);

        panel_4.setBackground(new java.awt.Color(255, 255, 255));
        panel_4.setLayout(null);

        item_24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_24.setForeground(new java.awt.Color(0, 183, 220));
        item_24.setIcon(new ImageIcon("imagenes/icon/menu/agregar.png"));
        item_24.setText("Crear");
        item_24.setToolTipText("");
        item_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_24ActionPerformed(evt);
            }
        });
        panel_4.add(item_24);
        item_24.setBounds(200, 80, 170, 140);

        item_25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_25.setForeground(new java.awt.Color(0, 183, 220));
        item_25.setIcon(new ImageIcon("imagenes/icon/menu/seguimiento.png"));
        item_25.setText("Seguimiento");
        item_25.setToolTipText("");
        item_25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_25ActionPerformed(evt);
            }
        });
        panel_4.add(item_25);
        item_25.setBounds(420, 80, 170, 140);

        item_26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_26.setForeground(new java.awt.Color(0, 183, 220));
        item_26.setIcon(new ImageIcon("imagenes/icon/menu/estatus.png"));
        item_26.setText("Estatus");
        item_26.setToolTipText("");
        item_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_26ActionPerformed(evt);
            }
        });
        panel_4.add(item_26);
        item_26.setBounds(640, 80, 170, 140);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("ORDEN DE COMPRA");
        panel_4.add(jLabel5);
        jLabel5.setBounds(50, 20, 400, 29);

        getContentPane().add(panel_4);
        panel_4.setBounds(0, 130, 1620, 490);

        panel_5.setBackground(new java.awt.Color(255, 255, 255));
        panel_5.setLayout(null);

        item_27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_27.setForeground(new java.awt.Color(0, 183, 220));
        item_27.setIcon(new ImageIcon("imagenes/icon/menu/agregar.png"));
        item_27.setText("Crear");
        item_27.setToolTipText("");
        item_27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_27ActionPerformed(evt);
            }
        });
        panel_5.add(item_27);
        item_27.setBounds(200, 80, 170, 140);

        item_28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_28.setForeground(new java.awt.Color(0, 183, 220));
        item_28.setIcon(new ImageIcon("imagenes/icon/menu/aprobar.png"));
        item_28.setText("Aprobar");
        item_28.setToolTipText("");
        item_28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_28ActionPerformed(evt);
            }
        });
        panel_5.add(item_28);
        item_28.setBounds(420, 80, 170, 140);

        item_29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_29.setForeground(new java.awt.Color(0, 183, 220));
        item_29.setIcon(new ImageIcon("imagenes/icon/menu/autorizar.png"));
        item_29.setText("Autorizar");
        item_29.setToolTipText("");
        item_29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_29ActionPerformed(evt);
            }
        });
        panel_5.add(item_29);
        item_29.setBounds(640, 80, 170, 140);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("RESERVAS");
        panel_5.add(jLabel4);
        jLabel4.setBounds(50, 20, 400, 29);

        item_34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_34.setForeground(new java.awt.Color(0, 183, 220));
        item_34.setIcon(new ImageIcon("imagenes/icon/menu/anular.png"));
        item_34.setText("Anular");
        item_34.setToolTipText("");
        item_34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_34ActionPerformed(evt);
            }
        });
        panel_5.add(item_34);
        item_34.setBounds(870, 80, 170, 140);

        item_38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_38.setForeground(new java.awt.Color(0, 183, 220));
        item_38.setIcon(new ImageIcon("imagenes/icon/menu/estatus.png"));
        item_38.setText("Estatus");
        item_38.setToolTipText("");
        item_38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_38ActionPerformed(evt);
            }
        });
        panel_5.add(item_38);
        item_38.setBounds(200, 270, 170, 140);

        item_39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_39.setForeground(new java.awt.Color(0, 183, 220));
        item_39.setIcon(new ImageIcon("imagenes/icon/menu/seguimiento.png"));
        item_39.setText("Seguimiento");
        item_39.setToolTipText("");
        item_39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_39ActionPerformed(evt);
            }
        });
        panel_5.add(item_39);
        item_39.setBounds(1090, 80, 170, 140);

        getContentPane().add(panel_5);
        panel_5.setBounds(0, 130, 1620, 490);

        panel_6.setBackground(new java.awt.Color(255, 255, 255));
        panel_6.setLayout(null);

        item_30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_30.setForeground(new java.awt.Color(0, 183, 220));
        item_30.setIcon(new ImageIcon("imagenes/icon/menu/agregar.png"));
        item_30.setText("Crear / Actualizar");
        item_30.setToolTipText("");
        item_30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_30ActionPerformed(evt);
            }
        });
        panel_6.add(item_30);
        item_30.setBounds(200, 80, 170, 140);

        item_31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_31.setForeground(new java.awt.Color(0, 183, 220));
        item_31.setIcon(new ImageIcon("imagenes/icon/menu/evaluacion.png"));
        item_31.setText("Evaluación de Cumplimiento");
        item_31.setToolTipText("");
        item_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_31ActionPerformed(evt);
            }
        });
        panel_6.add(item_31);
        item_31.setBounds(420, 80, 170, 140);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("PROVEEDORES");
        panel_6.add(jLabel3);
        jLabel3.setBounds(50, 20, 400, 29);

        getContentPane().add(panel_6);
        panel_6.setBounds(0, 130, 1620, 490);

        panel_7.setBackground(new java.awt.Color(255, 255, 255));
        panel_7.setLayout(null);

        item_32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_32.setForeground(new java.awt.Color(0, 183, 220));
        item_32.setIcon(new ImageIcon("imagenes/icon/menu/agregar.png"));
        item_32.setText("Crear / Actualizar");
        item_32.setToolTipText("");
        item_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_32ActionPerformed(evt);
            }
        });
        panel_7.add(item_32);
        item_32.setBounds(200, 80, 170, 140);

        item_33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_33.setForeground(new java.awt.Color(0, 183, 220));
        item_33.setIcon(new ImageIcon("imagenes/icon/menu/autorizar.png"));
        item_33.setText("Autorizar Cotización");
        item_33.setToolTipText("");
        item_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_33ActionPerformed(evt);
            }
        });
        panel_7.add(item_33);
        item_33.setBounds(420, 80, 170, 140);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("COTIZACIONES");
        panel_7.add(jLabel2);
        jLabel2.setBounds(50, 20, 400, 29);

        getContentPane().add(panel_7);
        panel_7.setBounds(0, 130, 1620, 490);

        panel_8.setBackground(new java.awt.Color(255, 255, 255));
        panel_8.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("REPORTE");
        panel_8.add(jLabel1);
        jLabel1.setBounds(50, 20, 400, 29);

        getContentPane().add(panel_8);
        panel_8.setBounds(0, 130, 1620, 490);

        bar.setBackground(new java.awt.Color(51, 51, 51));
        bar.setLayout(null);

        lbl_usuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setText("USUARIO");
        bar.add(lbl_usuario);
        lbl_usuario.setBounds(110, 10, 67, 17);

        lbl_nombres.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setText("NOMBRES");
        bar.add(lbl_nombres);
        lbl_nombres.setBounds(110, 30, 72, 17);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        bar.add(jPanel2);
        jPanel2.setBounds(105, 10, 1, 40);

        bot_cerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        bot_cerrar.setIcon(new ImageIcon("imagenes/icon/session.png"));
        bot_cerrar.setText("Cerrar Sesión");
        bot_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_cerrarActionPerformed(evt);
            }
        });
        bar.add(bot_cerrar);
        bot_cerrar.setBounds(1100, 20, 140, 25);
        style.DisableBorderButton(bot_cerrar);

        bot_salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_salir.setForeground(new java.awt.Color(255, 255, 255));
        bot_salir.setIcon(new ImageIcon("imagenes/icon/cerrar.png"));
        bot_salir.setText("Salir");
        bot_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_salirActionPerformed(evt);
            }
        });
        bar.add(bot_salir);
        bot_salir.setBounds(1240, 20, 113, 25);
        style.DisableBorderButton(bot_salir);

        lbl_imagentimaca3.setIcon(new ImageIcon("imagenes/logo.png"));
        bar.add(lbl_imagentimaca3);
        lbl_imagentimaca3.setBounds(10, 0, 90, 60);

        getContentPane().add(bar);
        bar.setBounds(0, 0, 1430, 60);

        cinta.setBackground(new java.awt.Color(71, 71, 71));
        cinta.setLayout(null);

        buton4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buton4.setForeground(new java.awt.Color(255, 255, 255));
        buton4.setIcon(new ImageIcon("imagenes/icon/menu/compra.png"));
        buton4.setText("Orden de Compra");
        buton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton4ActionPerformed(evt);
            }
        });
        cinta.add(buton4);
        buton4.setBounds(340, 10, 180, 27);
        style.DisableBorderButton(buton4);

        buton2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buton2.setForeground(new java.awt.Color(255, 255, 255));
        buton2.setIcon(new ImageIcon("imagenes/icon/menu/inventario.png"));
        buton2.setText("Almacen");
        buton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton2ActionPerformed(evt);
            }
        });
        cinta.add(buton2);
        buton2.setBounds(10, 10, 160, 27);
        style.DisableBorderButton(buton2);

        buton7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buton7.setForeground(new java.awt.Color(255, 255, 255));
        buton7.setIcon(new ImageIcon("imagenes/icon/menu/cotizar.png"));
        buton7.setText("Cotizaciones");
        buton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton7ActionPerformed(evt);
            }
        });
        cinta.add(buton7);
        buton7.setBounds(860, 10, 150, 27);
        style.DisableBorderButton(buton7);

        buton3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buton3.setForeground(new java.awt.Color(255, 255, 255));
        buton3.setIcon(new ImageIcon("imagenes/icon/menu/solicitud.png"));
        buton3.setText("Solicitudes");
        buton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton3ActionPerformed(evt);
            }
        });
        cinta.add(buton3);
        buton3.setBounds(180, 10, 150, 27);
        style.DisableBorderButton(buton3);

        buton5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buton5.setForeground(new java.awt.Color(255, 255, 255));
        buton5.setIcon(new ImageIcon("imagenes/icon/menu/reserva.png"));
        buton5.setText("Reservas");
        buton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton5ActionPerformed(evt);
            }
        });
        cinta.add(buton5);
        buton5.setBounds(530, 10, 150, 27);
        style.DisableBorderButton(buton5);

        buton8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buton8.setForeground(new java.awt.Color(255, 255, 255));
        buton8.setIcon(new ImageIcon("imagenes/icon/menu/reporte.png"));
        buton8.setText("Reportes");
        buton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton8ActionPerformed(evt);
            }
        });
        cinta.add(buton8);
        buton8.setBounds(1020, 10, 150, 27);
        style.DisableBorderButton(buton8);

        buton6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buton6.setForeground(new java.awt.Color(255, 255, 255));
        buton6.setIcon(new ImageIcon("imagenes/icon/menu/proveedor.png"));
        buton6.setText("Proveedores");
        buton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton6ActionPerformed(evt);
            }
        });
        cinta.add(buton6);
        buton6.setBounds(690, 10, 160, 27);
        style.DisableBorderButton(buton6);

        paso.setBackground(new java.awt.Color(255, 255, 255));
        cinta.add(paso);
        paso.setBounds(10, 40, 180, 1);

        getContentPane().add(cinta);
        cinta.setBounds(0, 60, 1430, 50);

        lbl_imagentimaca2.setIcon(new ImageIcon("imagenes/Timaca _RIF.png"));
        getContentPane().add(lbl_imagentimaca2);
        lbl_imagentimaca2.setBounds(450, 640, 90, 60);

        lbl_imagentimaca4.setIcon(new ImageIcon("imagenes/eco_rif.png"));
        getContentPane().add(lbl_imagentimaca4);
        lbl_imagentimaca4.setBounds(580, 640, 260, 60);

        lbl_imagentimaca5.setIcon(new ImageIcon("imagenes/SMB _RIF.png"));
        getContentPane().add(lbl_imagentimaca5);
        lbl_imagentimaca5.setBounds(1070, 640, 180, 60);

        lbl_imagentimaca6.setIcon(new ImageIcon("imagenes/AERO_LOGO.png"));
        getContentPane().add(lbl_imagentimaca6);
        lbl_imagentimaca6.setBounds(870, 640, 180, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton4ActionPerformed
       deshabilitar_ventana(actual);
       habilitar_ventana(4);
    }//GEN-LAST:event_buton4ActionPerformed

    private void buton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton2ActionPerformed
       deshabilitar_ventana(actual);
       habilitar_ventana(2);
    }//GEN-LAST:event_buton2ActionPerformed

    private void buton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton7ActionPerformed
        deshabilitar_ventana(actual);
        habilitar_ventana(7);
    }//GEN-LAST:event_buton7ActionPerformed

    private void buton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton3ActionPerformed
       deshabilitar_ventana(actual);
       habilitar_ventana(3);
    }//GEN-LAST:event_buton3ActionPerformed

    private void buton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton5ActionPerformed
       deshabilitar_ventana(actual);
       habilitar_ventana(5);
    }//GEN-LAST:event_buton5ActionPerformed

    private void buton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton8ActionPerformed
       deshabilitar_ventana(actual);
       habilitar_ventana(8);
    }//GEN-LAST:event_buton8ActionPerformed

    private void buton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton6ActionPerformed
        deshabilitar_ventana(actual);
        habilitar_ventana(6);
    }//GEN-LAST:event_buton6ActionPerformed

    private void bot_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_salirActionPerformed

    private void bot_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_cerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_cerrarActionPerformed

    private void item_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_11ActionPerformed
        // INVENTARIO -> AGREGAR MATERIAL
    }//GEN-LAST:event_item_11ActionPerformed

    private void item_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_12ActionPerformed
        // INVENTARIO -> ACTUALIZAR MATERIAL
    }//GEN-LAST:event_item_12ActionPerformed

    private void item_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_13ActionPerformed
        // INVENTARIO -> ENTRADA MATERIAL
    }//GEN-LAST:event_item_13ActionPerformed

    private void item_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_14ActionPerformed
        // INVENTARIO -> ENTRADA MATERIAL EXPRESS
    }//GEN-LAST:event_item_14ActionPerformed

    private void item_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_15ActionPerformed
        // INVENTARIO -> MAESTRO DE MATERIAL
    }//GEN-LAST:event_item_15ActionPerformed

    private void item_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_16ActionPerformed
         // INVENTARIO -> SALIDA DE MATERIAL EXPRESS
    }//GEN-LAST:event_item_16ActionPerformed

    private void item_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_18ActionPerformed
        // INVENTARIO -> ANULAR PRESTAMOS
    }//GEN-LAST:event_item_18ActionPerformed

    private void item_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_19ActionPerformed
        // INVENTARIO -> CREAR PRESTAMO 
    }//GEN-LAST:event_item_19ActionPerformed

    private void item_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_20ActionPerformed
         // INVENTARIO -> SALIDA DE MATERIAL
    }//GEN-LAST:event_item_20ActionPerformed

    private void item_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_21ActionPerformed
        // SOLICITUDES -> AGREGAR SOLICITUDES
    }//GEN-LAST:event_item_21ActionPerformed

    private void item_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_22ActionPerformed
        // SOLICITUDES -> SEGUIMIENTO SOLICITUDES
    }//GEN-LAST:event_item_22ActionPerformed

    private void item_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_23ActionPerformed
        // SOLICITUDES -> ESTATUS SOLICITUDES
    }//GEN-LAST:event_item_23ActionPerformed

    private void item_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_24ActionPerformed
        // ORDEN DE COMPRA -> CREAR
    }//GEN-LAST:event_item_24ActionPerformed

    private void item_25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_25ActionPerformed
        // ORDEN DE COMPRA -> SEGUIMIENTO
    }//GEN-LAST:event_item_25ActionPerformed

    private void item_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_26ActionPerformed
        // RESERVA -> ESTATUS
    }//GEN-LAST:event_item_26ActionPerformed

    private void item_27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_27ActionPerformed
        // RESERVA -> CREAR
    }//GEN-LAST:event_item_27ActionPerformed

    private void item_28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_28ActionPerformed
       // RESERVA -> APROBAR
    }//GEN-LAST:event_item_28ActionPerformed

    private void item_29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_29ActionPerformed
          // RESERVA -> AUTORIZAR
    }//GEN-LAST:event_item_29ActionPerformed

    private void item_30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_30ActionPerformed
       // PROVEEDORES -> CREAR / ACTUALIZAR
    }//GEN-LAST:event_item_30ActionPerformed

    private void item_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_31ActionPerformed
       // PROVEEDORES -> EVALUACIÓN
    }//GEN-LAST:event_item_31ActionPerformed

    private void item_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_32ActionPerformed
         // CREAR -> COTIZACIÓN
    }//GEN-LAST:event_item_32ActionPerformed

    private void item_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_33ActionPerformed
         // AUTORIZAR -> COTIZACIÓN
    }//GEN-LAST:event_item_33ActionPerformed

    private void item_34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_34ActionPerformed
         // RESERVA -> ANULAR
    }//GEN-LAST:event_item_34ActionPerformed

    private void item_38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_38ActionPerformed
         // RESERVA -> ESTATUS
    }//GEN-LAST:event_item_38ActionPerformed

    private void item_39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_39ActionPerformed
        // RESERVA -> SEGUIMIENTO
    }//GEN-LAST:event_item_39ActionPerformed

    private void item_35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_35ActionPerformed
        // SOLICITUD -> CONFORMAR
    }//GEN-LAST:event_item_35ActionPerformed

    private void item_36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_36ActionPerformed
        // SOLICITUD -> ANULAR
    }//GEN-LAST:event_item_36ActionPerformed

    private void item_37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_37ActionPerformed
        // SOLICITUD -> AUTORIZAR
    }//GEN-LAST:event_item_37ActionPerformed

    private void item_40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_40ActionPerformed
        // INVENTARIO -> TRANSFERENCIA MATERIAL
    }//GEN-LAST:event_item_40ActionPerformed

    private void item_41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_41ActionPerformed
         // INVENTARIO -> TRANSFERENCIA ALMACEN
    }//GEN-LAST:event_item_41ActionPerformed

    private void item_42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_42ActionPerformed
         // INVENTARIO -> TRANSFERENCIA ENTRE PROYECTOS
    }//GEN-LAST:event_item_42ActionPerformed

    private void item_43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_43ActionPerformed
         // INVENTARIO -> TRANSFERENCIA ANULAR
    }//GEN-LAST:event_item_43ActionPerformed

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
                new frm_principalM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar;
    private javax.swing.JButton bot_cerrar;
    private javax.swing.JButton bot_salir;
    private javax.swing.JButton buton2;
    private javax.swing.JButton buton3;
    private javax.swing.JButton buton4;
    private javax.swing.JButton buton5;
    private javax.swing.JButton buton6;
    private javax.swing.JButton buton7;
    private javax.swing.JButton buton8;
    private javax.swing.JPanel cinta;
    private javax.swing.JButton item_11;
    private javax.swing.JButton item_12;
    private javax.swing.JButton item_13;
    private javax.swing.JButton item_14;
    private javax.swing.JButton item_15;
    private javax.swing.JButton item_16;
    private javax.swing.JButton item_18;
    private javax.swing.JButton item_19;
    private javax.swing.JButton item_20;
    private javax.swing.JButton item_21;
    private javax.swing.JButton item_22;
    private javax.swing.JButton item_23;
    private javax.swing.JButton item_24;
    private javax.swing.JButton item_25;
    private javax.swing.JButton item_26;
    private javax.swing.JButton item_27;
    private javax.swing.JButton item_28;
    private javax.swing.JButton item_29;
    private javax.swing.JButton item_30;
    private javax.swing.JButton item_31;
    private javax.swing.JButton item_32;
    private javax.swing.JButton item_33;
    private javax.swing.JButton item_34;
    private javax.swing.JButton item_35;
    private javax.swing.JButton item_36;
    private javax.swing.JButton item_37;
    private javax.swing.JButton item_38;
    private javax.swing.JButton item_39;
    private javax.swing.JButton item_40;
    private javax.swing.JButton item_41;
    private javax.swing.JButton item_42;
    private javax.swing.JButton item_43;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    protected static javax.swing.JLabel lbl_area;
    protected static javax.swing.JLabel lbl_cedula;
    protected static javax.swing.JLabel lbl_desarea;
    protected static javax.swing.JLabel lbl_desnivel;
    private javax.swing.JLabel lbl_imagentimaca2;
    private javax.swing.JLabel lbl_imagentimaca3;
    private javax.swing.JLabel lbl_imagentimaca4;
    private javax.swing.JLabel lbl_imagentimaca5;
    private javax.swing.JLabel lbl_imagentimaca6;
    protected static javax.swing.JLabel lbl_nivel;
    private javax.swing.JLabel lbl_nombres;
    protected static javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_2;
    private javax.swing.JPanel panel_3;
    private javax.swing.JPanel panel_4;
    private javax.swing.JPanel panel_5;
    private javax.swing.JPanel panel_6;
    private javax.swing.JPanel panel_7;
    private javax.swing.JPanel panel_8;
    private javax.swing.JPanel paso;
    // End of variables declaration//GEN-END:variables


private void deshabilitar_ventana(int c){
    switch(c){
        
        case 2:
            jScrollPane2.setVisible(false);
        break;
        case 3:
            panel_3.setVisible(false);
        break;
        case 4:
            panel_4.setVisible(false);
        break;
        case 5:
            panel_5.setVisible(false);
        break;
        case 6:
            panel_6.setVisible(false);
        break;
        case 7:
            panel_7.setVisible(false);
        break;
        case 8:
            panel_8.setVisible(false);
        break;
    
    } 

}

private void habilitar_ventana(int c){
    switch(c){
        case 2:
            jScrollPane2.setVisible(true);
            this.actual = 2;
            paso.setBounds(10,40,180,1);
        break;
        case 3:
            panel_3.setVisible(true);
            this.actual = 3;
            paso.setBounds(170,40,180,1);
        break;
        case 4:
            panel_4.setVisible(true);
            this.actual = 4;
            paso.setBounds(360,40,180,1);
        break;
        case 5:
            panel_5.setVisible(true);
            this.actual = 5;
            paso.setBounds(520,40,180,1);
        break;
        case 6:
            panel_6.setVisible(true);
            this.actual = 6;
            paso.setBounds(690,40,180,1);
        break;
        case 7:
            panel_7.setVisible(true);
            this.actual = 7;
            paso.setBounds(860,40,180,1);
        break;
        case 8:
            panel_8.setVisible(true);
            this.actual = 8;
            paso.setBounds(1000,40,180,1);
        break;
    } 

}



}