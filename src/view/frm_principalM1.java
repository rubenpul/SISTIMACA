/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controlador.ctrl_notificacion;
import controlador.ctrl_usuario;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.class_usuario;

/**
 *
 * @author ruben
 */
public class frm_principalM1 extends javax.swing.JFrame {

    
    int actual;
   
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
                       ""
            );
   
    
    
    
    public frm_principalM1() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SISTIMACA - PRINCIPAL");
        this.getContentPane().setBackground(Color.WHITE);
        this.setExtendedState(MAXIMIZED_BOTH);
        
        this.setIconImage(new ImageIcon(funciones.logoempresa()).getImage());
           
        
        // Cargar Look And Feel (Marcos Windows )
        try{
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        }
        catch(Exception e){} 

           
        class_usuario modelo_usuario;
        modelo_usuario = usuario.buscar_usuario_login();
       
        
        lbl_usuario.setText(frm_login.txt_usuario.getText().trim());
        lbl_nombres.setText(modelo_usuario.getNombres());
        lbl_nivel.setText(modelo_usuario.getId_perfil().toString());
        lbl_desnivel.setText(modelo_usuario.getDescripcionperfil());
        lbl_cedula.setText(modelo_usuario.getCedula().toString());
        lbl_area.setText(modelo_usuario.getId_area().toString());
        lbl_desarea.setText(modelo_usuario.getDescripcionarea());
         
        
       
        habilitar_menuopciones(Integer.parseInt(lbl_nivel.getText()));
        
        ctrl_notificacion notificacion = new ctrl_notificacion(0,0,false,"","",modelo_usuario.getCedula());
        
        if (notificacion.consultar_notificacion_activausuario()){
            lbl_notificacion.setVisible(true);
        }
        else{
            lbl_notificacion.setVisible(false);
        }
        
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_cedula = new javax.swing.JLabel();
        lbl_area = new javax.swing.JLabel();
        lbl_desarea = new javax.swing.JLabel();
        lbl_nivel = new javax.swing.JLabel();
        lbl_desnivel = new javax.swing.JLabel();
        lbl_imagentimaca2 = new javax.swing.JLabel();
        lbl_imagentimaca4 = new javax.swing.JLabel();
        lbl_imagentimaca5 = new javax.swing.JLabel();
        lbl_imagentimaca6 = new javax.swing.JLabel();
        bar = new javax.swing.JPanel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bot_cerrar = new javax.swing.JButton();
        bot_salir = new javax.swing.JButton();
        lbl_imagentimaca3 = new javax.swing.JLabel();
        cinta = new javax.swing.JPanel();
        lbl_notificacion = new javax.swing.JLabel();
        scroll_administrador = new javax.swing.JScrollPane();
        tree_opcionesadministrador = new javax.swing.JTree();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        scroll_solicitante = new javax.swing.JScrollPane();
        tree_opcionessolicitante = new javax.swing.JTree();
        scroll_gerenteadministracion = new javax.swing.JScrollPane();
        tree_opcionesgerenteadministracion = new javax.swing.JTree();
        scroll_gerenteoperaciones = new javax.swing.JScrollPane();
        tree_opcionesgerenteoperaciones = new javax.swing.JTree();
        scroll_procura = new javax.swing.JScrollPane();
        tree_opcionesprocura = new javax.swing.JTree();
        scroll_jefedepartamento = new javax.swing.JScrollPane();
        tree_opcionesjefedepartamento = new javax.swing.JTree();
        scroll_analistaalmacen = new javax.swing.JScrollPane();
        tree_opcionesanalistaalmacen = new javax.swing.JTree();
        scroll_compras = new javax.swing.JScrollPane();
        tree_opcionescompras = new javax.swing.JTree();
        scroll_tic = new javax.swing.JScrollPane();
        tree_opcionestic = new javax.swing.JTree();
        scroll_jefealmacen = new javax.swing.JScrollPane();
        tree_opcionesjefealmacen = new javax.swing.JTree();
        scroll_almacenista = new javax.swing.JScrollPane();
        tree_opcionesalmacenista = new javax.swing.JTree();
        scroll_administrador1 = new javax.swing.JScrollPane();
        tree_opcionesadministrador1 = new javax.swing.JTree();

        lbl_cedula.setText("jLabel1");

        lbl_area.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_area.setText("AREA");

        lbl_desarea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_desarea.setText("AREA");

        lbl_nivel.setText("jLabel1");

        lbl_desnivel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lbl_imagentimaca2.setIcon(new ImageIcon("imagenes/Timaca _RIF.png"));

        lbl_imagentimaca4.setIcon(new ImageIcon("imagenes/eco_rif.png"));

        lbl_imagentimaca5.setIcon(new ImageIcon("imagenes/SMB _RIF.png"));

        lbl_imagentimaca6.setIcon(new ImageIcon("imagenes/AERO_LOGO.png"));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(null);

        bar.setBackground(new java.awt.Color(153, 153, 153));
        bar.setLayout(null);

        lbl_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setText("USUARIO");
        bar.add(lbl_usuario);
        lbl_usuario.setBounds(250, 10, 250, 17);

        lbl_nombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setText("NOMBRES");
        bar.add(lbl_nombres);
        lbl_nombres.setBounds(250, 30, 250, 17);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        bar.add(jPanel2);
        jPanel2.setBounds(240, 10, 1, 40);

        bot_cerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        bot_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/session.png"))); // NOI18N
        bot_cerrar.setText("Cerrar Sesión");
        bot_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_cerrarActionPerformed(evt);
            }
        });
        bar.add(bot_cerrar);
        bot_cerrar.setBounds(1100, 20, 140, 33);
        style.DisableBorderButton(bot_cerrar);

        bot_salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_salir.setForeground(new java.awt.Color(255, 255, 255));
        bot_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        bot_salir.setText("Salir");
        bot_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_salirActionPerformed(evt);
            }
        });
        bar.add(bot_salir);
        bot_salir.setBounds(1270, 20, 113, 29);
        style.DisableBorderButton(bot_salir);

        lbl_imagentimaca3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TIMACA.png"))); // NOI18N
        lbl_imagentimaca3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_imagentimaca3MouseClicked(evt);
            }
        });
        bar.add(lbl_imagentimaca3);
        lbl_imagentimaca3.setBounds(10, 0, 230, 60);

        getContentPane().add(bar);
        bar.setBounds(0, 0, 1440, 60);

        cinta.setBackground(new java.awt.Color(71, 71, 71));
        cinta.setLayout(null);

        lbl_notificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inboxiconanimationsmall.gif"))); // NOI18N
        lbl_notificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_notificacionMouseClicked(evt);
            }
        });
        cinta.add(lbl_notificacion);
        lbl_notificacion.setBounds(50, 0, 66, 50);

        getContentPane().add(cinta);
        cinta.setBounds(0, 60, 1440, 50);

        tree_opcionesadministrador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tree_opcionesadministrador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("SISTIMACA");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administración");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Área");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Clase Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Empresa");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Grupo Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Moneda");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Proyecto");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ubicación");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("UMB");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuario");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Anular Documento");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Crear Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entrada de Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entrada Directa Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Resumen Stock Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Salida Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Salida Directa Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Suprimir Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Devoluciones");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Reingreso");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Transferencias");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Entre Almacenes");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Materiales");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Proyectos");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Ubicación");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Compras");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cotizaciones");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Aprobar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Autorizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Órden de Compra");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Generar");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Proveedores");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Gestionar");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Reservas");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Aprobar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes de Herramientas y/o Equipos");
        javax.swing.tree.DefaultMutableTreeNode treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Seguimiento");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Solicitud a Compras");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Aprobar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Autorizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Conformar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reportes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Entrada de Material");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Toma Física");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Salida de Material");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Compras");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Órden de Compra");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree_opcionesadministrador.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_opcionesadministrador.setShowsRootHandles(true);
        tree_opcionesadministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_opcionesadministradorMouseClicked(evt);
            }
        });
        scroll_administrador.setViewportView(tree_opcionesadministrador);

        getContentPane().add(scroll_administrador);
        scroll_administrador.setBounds(0, 110, 740, 640);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GRUPO TIMACA.png"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 660, 320));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(740, 110, 700, 640);

        scroll_solicitante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scroll_solicitanteMouseClicked(evt);
            }
        });

        tree_opcionessolicitante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tree_opcionessolicitante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("SISTIMACA");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administración");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuario");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Resumen Stock Material");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Reservas");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes de Herramientas y/o Equipos");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Solicitud a Compras");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree_opcionessolicitante.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_opcionessolicitante.setShowsRootHandles(true);
        tree_opcionessolicitante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_opcionessolicitanteMouseClicked(evt);
            }
        });
        scroll_solicitante.setViewportView(tree_opcionessolicitante);

        getContentPane().add(scroll_solicitante);
        scroll_solicitante.setBounds(10, 110, 730, 630);

        tree_opcionesgerenteadministracion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tree_opcionesgerenteadministracion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("SISTIMACA");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administración");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuario");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Resumen Stock Material");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Compras");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cotizaciones");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Aprobar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Autorizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Órden de Compra");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Generar");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Proveedores");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Gestionar");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Reservas");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Aprobar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Solicitud a Compras");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Aprobar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Autorizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reportes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Entrada de Material");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Salida de Material");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree_opcionesgerenteadministracion.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_opcionesgerenteadministracion.setShowsRootHandles(true);
        tree_opcionesgerenteadministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_opcionesgerenteadministracionMouseClicked(evt);
            }
        });
        scroll_gerenteadministracion.setViewportView(tree_opcionesgerenteadministracion);

        getContentPane().add(scroll_gerenteadministracion);
        scroll_gerenteadministracion.setBounds(10, 110, 730, 630);

        tree_opcionesgerenteoperaciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tree_opcionesgerenteoperaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("SISTIMACA");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administración");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuario");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Resumen Stock Material");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Solicitud a Compras");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Autorizar");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree_opcionesgerenteoperaciones.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_opcionesgerenteoperaciones.setShowsRootHandles(true);
        tree_opcionesgerenteoperaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_opcionesgerenteoperacionesMouseClicked(evt);
            }
        });
        scroll_gerenteoperaciones.setViewportView(tree_opcionesgerenteoperaciones);

        getContentPane().add(scroll_gerenteoperaciones);
        scroll_gerenteoperaciones.setBounds(10, 110, 730, 630);

        tree_opcionesprocura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tree_opcionesprocura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("SISTIMACA");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administración");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuario");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Resumen Stock Material");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Compras");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cotizaciones");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Aprobar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Reservas");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Aprobar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes de Herramientas y/o Equipos");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Solicitud a Compras");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Aprobar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reportes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Entrada de Material");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Salida de Material");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree_opcionesprocura.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_opcionesprocura.setShowsRootHandles(true);
        tree_opcionesprocura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_opcionesprocuraMouseClicked(evt);
            }
        });
        scroll_procura.setViewportView(tree_opcionesprocura);

        getContentPane().add(scroll_procura);
        scroll_procura.setBounds(10, 110, 730, 630);

        tree_opcionesjefedepartamento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tree_opcionesjefedepartamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("SISTIMACA");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administración");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuario");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Resumen Stock Material");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Reservas");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Aprobar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes de Herramientas y/o Equipos");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Solicitud a Compras");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Autorizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree_opcionesjefedepartamento.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_opcionesjefedepartamento.setShowsRootHandles(true);
        tree_opcionesjefedepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_opcionesjefedepartamentoMouseClicked(evt);
            }
        });
        scroll_jefedepartamento.setViewportView(tree_opcionesjefedepartamento);

        getContentPane().add(scroll_jefedepartamento);
        scroll_jefedepartamento.setBounds(10, 110, 730, 630);

        tree_opcionesanalistaalmacen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tree_opcionesanalistaalmacen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("SISTIMACA");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administración");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Área");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Clase Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Grupo Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Proyecto");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ubicación");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("UMB");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuario");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Crear Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entrada de Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entrada Directa Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Resumen Stock Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Salida Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Salida Directa Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Suprimir Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Transferencias");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Entre Almacenes");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Materiales");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Proyectos");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Ubicación");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Reservas");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Solicitud a Compras");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Conformar");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reportes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Entrada de Material");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Toma Física");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Salida de Material");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree_opcionesanalistaalmacen.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_opcionesanalistaalmacen.setShowsRootHandles(true);
        tree_opcionesanalistaalmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_opcionesanalistaalmacenMouseClicked(evt);
            }
        });
        scroll_analistaalmacen.setViewportView(tree_opcionesanalistaalmacen);

        getContentPane().add(scroll_analistaalmacen);
        scroll_analistaalmacen.setBounds(10, 110, 730, 630);

        tree_opcionescompras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tree_opcionescompras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("SISTIMACA");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administración");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuario");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Resumen Stock Material");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Compras");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cotizaciones");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Aprobar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Autorizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Órden de Compra");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Generar");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Proveedores");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Gestionar");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree_opcionescompras.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_opcionescompras.setShowsRootHandles(true);
        tree_opcionescompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_opcionescomprasMouseClicked(evt);
            }
        });
        scroll_compras.setViewportView(tree_opcionescompras);

        getContentPane().add(scroll_compras);
        scroll_compras.setBounds(10, 110, 730, 630);

        tree_opcionestic.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tree_opcionestic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("SISTIMACA");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administración");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuario");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Resumen Stock Material");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Solicitud a Compras");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Reservas");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes de Herramientas y/o Equipos");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree_opcionestic.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_opcionestic.setShowsRootHandles(true);
        tree_opcionestic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_opcionesticMouseClicked(evt);
            }
        });
        scroll_tic.setViewportView(tree_opcionestic);

        getContentPane().add(scroll_tic);
        scroll_tic.setBounds(10, 110, 730, 630);

        tree_opcionesjefealmacen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tree_opcionesjefealmacen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("SISTIMACA");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administración");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuario");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entrada de Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entrada Directa Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Resumen Stock Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Salida Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Salida Directa Material");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Reservas");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes de Herramientas y/o Equipos");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Solicitud a Compras");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Conformar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reportes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Entrada de Material");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Toma Física");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Salida de Material");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree_opcionesjefealmacen.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_opcionesjefealmacen.setShowsRootHandles(true);
        tree_opcionesjefealmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_opcionesjefealmacenMouseClicked(evt);
            }
        });
        scroll_jefealmacen.setViewportView(tree_opcionesjefealmacen);

        getContentPane().add(scroll_jefealmacen);
        scroll_jefealmacen.setBounds(10, 110, 730, 630);

        tree_opcionesalmacenista.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tree_opcionesalmacenista.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("SISTIMACA");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administración");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuario");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Resumen Stock Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Salida Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Transferencias");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Materiales");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Reservas");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes de Herramientas y/o Equipos");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Solicitud a Compras");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Conformar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reportes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Entrada de Materia");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Salida de Materiall");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree_opcionesalmacenista.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_opcionesalmacenista.setShowsRootHandles(true);
        tree_opcionesalmacenista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_opcionesalmacenistaMouseClicked(evt);
            }
        });
        scroll_almacenista.setViewportView(tree_opcionesalmacenista);

        getContentPane().add(scroll_almacenista);
        scroll_almacenista.setBounds(10, 110, 730, 630);

        tree_opcionesadministrador1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tree_opcionesadministrador1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("SISTIMACA");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administración");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Área");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Clase Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Empresa");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Grupo Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Moneda");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Proyecto");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ubicación");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("UMB");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuario");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Crear Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entrada de Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entrada Directa Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Resumen Stock Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Salida Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Salida Directa Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Suprimir Material");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Transferencias");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Entre Almacenes");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Materiales");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Proyectos");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Compras");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cotizaciones");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Aprobar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Autorizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Orden de Compra");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Generar");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Proveedores");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Gestionar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Evaluación");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Reservas");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Aprobar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Autorizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Conformar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Solicitudes de Herramientas y/o Equipos");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Solicitud a Compras");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Actualizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Aprobar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Anular");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Autorizar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Consultar");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Crear");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reportes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Almacén");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Entrada de Material");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Salida de Material");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree_opcionesadministrador1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_opcionesadministrador1.setShowsRootHandles(true);
        tree_opcionesadministrador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_opcionesadministrador1MouseClicked(evt);
            }
        });
        scroll_administrador1.setViewportView(tree_opcionesadministrador1);

        getContentPane().add(scroll_administrador1);
        scroll_administrador1.setBounds(10, 110, 730, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_salirActionPerformed
        Integer resp = JOptionPane.showConfirmDialog(null, "ESTÁ SEGURO EN SALIR?");
        if (resp.equals(0)){
            this.dispose();
        }    

    }//GEN-LAST:event_bot_salirActionPerformed

    private void bot_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_cerrarActionPerformed
        frm_login frm = new frm_login();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bot_cerrarActionPerformed

    private void tree_opcionesadministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_opcionesadministradorMouseClicked
        
        try{
           
             //ADMINISTRACION
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Almacén]")){
                frm_almacen frm = new frm_almacen();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Área]")){
                frm_area frm = new frm_area();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Clase Material]")){
                frm_clasematerial frm = new frm_clasematerial();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Empresa]")){
                frm_empresa frm = new frm_empresa();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Grupo Material]")){
                frm_grupomaterial frm = new frm_grupomaterial();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Moneda]")){
                frm_moneda frm = new frm_moneda();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Proyecto]")){
                
                frm_proyecto frm = new frm_proyecto();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Ubicación]")){
                frm_ubicacion frm = new frm_ubicacion();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, UMB]")){
                frm_umb frm = new frm_umb();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Usuario]")){
                frm_usuario frm = new frm_usuario();
                frm.setVisible(true);
            }

            //ALMACEN
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Anular Documento]")){
                frm_anulardocumento frm = new frm_anulardocumento();
                frm.setVisible(true);
            }
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Crear Material]")){
                frm_material frm = new frm_material();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Actualizar Material]")){
                frm_actualizarmaterial frm = new frm_actualizarmaterial();
                frm.setVisible(true);
            } 
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada de Material]")){
                frm_entrada frm = new frm_entrada();
                frm.setVisible(true);
            } 
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada Directa Material]")){
                frm_entradaexpress frm = new frm_entradaexpress();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Resumen Stock Material]")){
                frm_maestromaterial frm = new frm_maestromaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Material]")){
                frm_salida frm = new frm_salida();
                frm.setVisible(true);
            }
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Directa Material]")){
                frm_salidaexpress frm = new frm_salidaexpress();
                frm.setVisible(true);
            } 
            
             //SUPRIMIR MATERIAL
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Suprimir Material]")){
                frm_anularmaterial frm = new frm_anularmaterial();
                frm.setVisible(true); 
            }
            
            //TRANSFERENCIAS
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Materiales]")){
                frm_transferenciamaterial frm = new frm_transferenciamaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Entre Almacenes]")){
                frm_transferenciamaterialubicacion frm = new frm_transferenciamaterialubicacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Proyectos]")){
                frm_transferenciamaterialproyecto frm = new frm_transferenciamaterialproyecto();
                frm.setVisible(true);
            }
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Ubicación]")){
                frm_transferenciamaterialubicacionenalmacen frm = new frm_transferenciamaterialubicacionenalmacen();
                frm.setVisible(true);
            }

            //DEVOLUCIONES
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Crear]")){
                frm_devolucion frm = new frm_devolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Consultar]")){
                frm_consultardevolucion frm = new frm_consultardevolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Reingreso]")){
                frm_reingresodevolucion frm = new frm_reingresodevolucion();
                frm.setVisible(true);
            }
            
            
            //COTIZACIONES
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Crear]")){
                frm_cotizacion frm = new frm_cotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Aprobar]")){
                frm_aprobarcotizacion frm = new frm_aprobarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Autorizar]")){
                frm_autorizarcotizacion frm = new frm_autorizarcotizacion();
                frm.setVisible(true);
            }
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Consultar]")){
                frm_consultarcotizacion frm = new frm_consultarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Actualizar]")){
                frm_actualizarcotizacion frm = new frm_actualizarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Anular]")){
                frm_anularcotizacion frm = new frm_anularcotizacion();
                frm.setVisible(true);
            } 

            //ORDEN DE COMPRA
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Generar]")){
                frm_ordendecompra frm = new frm_ordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Consultar]")){
                frm_consultarordendecompra frm = new frm_consultarordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Anular]")){
                frm_anularordendecompra frm = new frm_anularordendecompra();
                frm.setVisible(true);
            }

            //PROVEEDOR

            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Consultar]")){
                frm_consultarproveedor frm = new frm_consultarproveedor();
                frm.setVisible(true);
            }    
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Gestionar]")){
                frm_proveedor frm = new frm_proveedor(0);
                frm.setVisible(true);
            }            

            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Evaluación]")){
                
            }            

            //RESERVAS
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Crear]")){
                frm_reserva frm = new frm_reserva(0);
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Aprobar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Autorizar]")){
                frm_autorizarreserva frm = new frm_autorizarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Conformar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Actualizar]")){
                frm_actualizarreserva frm = new frm_actualizarreserva();
                frm.setVisible(true);
            } 
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Anular]")){
                frm_anularreserva frm = new frm_anularreserva();
                frm.setVisible(true);
    
            } 
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Consultar]")){
                frm_consultarreserva frm = new frm_consultarreserva();
                frm.setVisible(true);
            } 

            //PRESTAMOS
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Crear]")){
                frm_prestamo frm = new frm_prestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Consultar]")){
                frm_consultarprestamo frm = new frm_consultarprestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Actualizar]")){
                frm_actualizarprestamo frm = new frm_actualizarprestamo();
                frm.setVisible(true);
            }
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Anular]")){
                frm_anularprestamo frm = new frm_anularprestamo();
                frm.setVisible(true);
            }

            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Seguimiento]")){
                frm_seguimientoprestamo frm = new frm_seguimientoprestamo();
                frm.setVisible(true);
            }
            
            //SOLICITUDES A COMPRAS
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Crear]")){
                frm_solicitud frm = new frm_solicitud(0);
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Aprobar]")){
                frm_aprobarsolicitud frm = new frm_aprobarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Autorizar]")){
                frm_autorizarsolicitud frm = new frm_autorizarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Conformar]")){
                frm_conformarsolicitud frm = new frm_conformarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Actualizar]")){
                frm_actualizarsolicitud frm = new frm_actualizarsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Anular]")){
                frm_anularsolicitud frm = new frm_anularsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Consultar]")){
                 frm_consultarsolicitud frm = new frm_consultarsolicitud();
                frm.setVisible(true);
            } 

            //REPORTES
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Entrada de Material]")){
                frm_reporteentradamaterial2 frm = new frm_reporteentradamaterial2();
                frm.setVisible(true);
               
            }

            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Toma Física]")){
                frm_reporte_tomafisica frm = new frm_reporte_tomafisica();
                frm.setVisible(true);               
            }
             
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Salida de Material]")){
                frm_reportesalidamaterial frm = new frm_reportesalidamaterial();
                frm.setVisible(true);               
            }
            
            if(tree_opcionesadministrador.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Compras, Órden de Compra]")){
                frm_reporte_ordendecompra frm = new frm_reporte_ordendecompra();
                frm.setVisible(true);               
            }


            
            
            tree_opcionesadministrador.setSelectionRow(0);
        }
        catch (NullPointerException ex){
            //JOptionPane.showMessageDialog(null,ex.getMessage());
        }        
    }//GEN-LAST:event_tree_opcionesadministradorMouseClicked

    private void tree_opcionessolicitanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_opcionessolicitanteMouseClicked
        try{
           
             //ADMINISTRACION
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Almacén]")){
                frm_almacen frm = new frm_almacen();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Área]")){
                frm_area frm = new frm_area();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Clase Material]")){
                frm_clasematerial frm = new frm_clasematerial();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Empresa]")){
                frm_empresa frm = new frm_empresa();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Grupo Material]")){
                frm_grupomaterial frm = new frm_grupomaterial();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Moneda]")){
                frm_moneda frm = new frm_moneda();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Proyecto]")){
                frm_proyecto frm = new frm_proyecto();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Ubicación]")){
                frm_ubicacion frm = new frm_ubicacion();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, UMB]")){
                frm_umb frm = new frm_umb();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Usuario]")){
                frm_usuario frm = new frm_usuario();
                frm.setVisible(true);
            }

            //ALMACEN
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Anular Documento]")){
                frm_anulardocumento frm = new frm_anulardocumento();
                frm.setVisible(true);
            }
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Crear Material]")){
                frm_material frm = new frm_material();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Actualizar Material]")){
                frm_actualizarmaterial frm = new frm_actualizarmaterial();
                frm.setVisible(true);
            } 
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada de Material]")){
                frm_entrada frm = new frm_entrada();
                frm.setVisible(true);
            } 
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada Directa Material]")){
                frm_entradaexpress frm = new frm_entradaexpress();
                frm.setVisible(true);
            } 
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Resumen Stock Material]")){
                frm_maestromaterial frm = new frm_maestromaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Material]")){
                frm_salida frm = new frm_salida();
                frm.setVisible(true);
            }
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Directa Material]")){
                frm_salidaexpress frm = new frm_salidaexpress();
                frm.setVisible(true);
            } 
            
             //SUPRIMIR MATERIAL
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Suprimir Material]")){
                frm_anularmaterial frm = new frm_anularmaterial();
                frm.setVisible(true); 
            }
            
            //TRANSFERENCIAS
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Materiales]")){
                frm_transferenciamaterial frm = new frm_transferenciamaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Entre Almacenes]")){
                frm_transferenciamaterialubicacion frm = new frm_transferenciamaterialubicacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Proyectos]")){
                frm_transferenciamaterialproyecto frm = new frm_transferenciamaterialproyecto();
                frm.setVisible(true);
            }
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Ubicación]")){
                frm_transferenciamaterialubicacionenalmacen frm = new frm_transferenciamaterialubicacionenalmacen();
                frm.setVisible(true);
            }

            //DEVOLUCIONES
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Crear]")){
                frm_devolucion frm = new frm_devolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Consultar]")){
                frm_consultardevolucion frm = new frm_consultardevolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Reingreso]")){
                frm_reingresodevolucion frm = new frm_reingresodevolucion();
                frm.setVisible(true);
            }            
            
            //COTIZACIONES
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Crear]")){
                frm_cotizacion frm = new frm_cotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Aprobar]")){
                frm_aprobarcotizacion frm = new frm_aprobarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Autorizar]")){
                frm_autorizarcotizacion frm = new frm_autorizarcotizacion();
                frm.setVisible(true);
            }
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Consultar]")){
                frm_consultarcotizacion frm = new frm_consultarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Actualizar]")){
                frm_actualizarcotizacion frm = new frm_actualizarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Anular]")){
                frm_anularcotizacion frm = new frm_anularcotizacion();
                frm.setVisible(true);
            } 

            //ORDEN DE COMPRA
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Generar]")){
                frm_ordendecompra frm = new frm_ordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Consultar]")){
                frm_consultarordendecompra frm = new frm_consultarordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Anular]")){
                frm_anularordendecompra frm = new frm_anularordendecompra();
                frm.setVisible(true);
            }

            //PROVEEDOR

            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Consultar]")){
                frm_consultarproveedor frm = new frm_consultarproveedor();
                frm.setVisible(true);
            }            
            
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Gestionar]")){
                frm_proveedor frm = new frm_proveedor(0);
                frm.setVisible(true);
            }            

            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Evaluación]")){
                
            }            

            //RESERVAS
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Crear]")){
                frm_reserva frm = new frm_reserva(0);
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Aprobar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Autorizar]")){
                frm_autorizarreserva frm = new frm_autorizarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Conformar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Actualizar]")){
                frm_actualizarreserva frm = new frm_actualizarreserva();
                frm.setVisible(true);
            } 
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Anular]")){
                frm_anularreserva frm = new frm_anularreserva();
                frm.setVisible(true);
    
            } 
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Consultar]")){
                frm_consultarreserva frm = new frm_consultarreserva();
                frm.setVisible(true);
            } 

            //PRESTAMOS
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Crear]")){
                frm_prestamo frm = new frm_prestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Consultar]")){
                frm_consultarprestamo frm = new frm_consultarprestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Actualizar]")){
                frm_actualizarprestamo frm = new frm_actualizarprestamo();
                frm.setVisible(true);
            }
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Anular]")){
                frm_anularprestamo frm = new frm_anularprestamo();
                frm.setVisible(true);
            }

            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Seguimiento]")){
                frm_seguimientoprestamo frm = new frm_seguimientoprestamo();
                frm.setVisible(true);
            }
            
            
            
            //SOLICITUDES A COMPRAS
            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Crear]")){
                frm_solicitud frm = new frm_solicitud(0);
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Aprobar]")){
                frm_aprobarsolicitud frm = new frm_aprobarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Autorizar]")){
                frm_autorizarsolicitud frm = new frm_autorizarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Conformar]")){
                frm_conformarsolicitud frm = new frm_conformarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Actualizar]")){
                frm_actualizarsolicitud frm = new frm_actualizarsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Anular]")){
                frm_anularsolicitud frm = new frm_anularsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Consultar]")){
                 frm_consultarsolicitud frm = new frm_consultarsolicitud();
                frm.setVisible(true);
            } 

            //REPORTES
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Entrada de Material]")){
                frm_reporteentradamaterial2 frm = new frm_reporteentradamaterial2();
                frm.setVisible(true);
               
            }

            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Toma Física]")){
                frm_reporte_tomafisica frm = new frm_reporte_tomafisica();
                frm.setVisible(true);               
            }

            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Salida de Material]")){
                frm_reportesalidamaterial frm = new frm_reportesalidamaterial();
                frm.setVisible(true);               
            }

            
            if(tree_opcionessolicitante.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Compras, Órden de Compra]")){
                frm_reporte_ordendecompra frm = new frm_reporte_ordendecompra();
                frm.setVisible(true);               
            }
            
            
            
            tree_opcionessolicitante.setSelectionRow(0);
        }
        catch (NullPointerException ex){
        
        }  
    }//GEN-LAST:event_tree_opcionessolicitanteMouseClicked

    private void tree_opcionesgerenteadministracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_opcionesgerenteadministracionMouseClicked
        try{
           
             //ADMINISTRACION
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Almacén]")){
                frm_almacen frm = new frm_almacen();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Área]")){
                frm_area frm = new frm_area();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Clase Material]")){
                frm_clasematerial frm = new frm_clasematerial();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Empresa]")){
                frm_empresa frm = new frm_empresa();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Grupo Material]")){
                frm_grupomaterial frm = new frm_grupomaterial();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Moneda]")){
                frm_moneda frm = new frm_moneda();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Proyecto]")){
                frm_proyecto frm = new frm_proyecto();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Ubicación]")){
                frm_ubicacion frm = new frm_ubicacion();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, UMB]")){
                frm_umb frm = new frm_umb();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Usuario]")){
                frm_usuario frm = new frm_usuario();
                frm.setVisible(true);
            }

            //ALMACEN
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Anular Documento]")){
                frm_anulardocumento frm = new frm_anulardocumento();
                frm.setVisible(true);
            }
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Crear Material]")){
                frm_material frm = new frm_material();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Actualizar Material]")){
                frm_actualizarmaterial frm = new frm_actualizarmaterial();
                frm.setVisible(true);
            } 
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada de Material]")){
                frm_entrada frm = new frm_entrada();
                frm.setVisible(true);
            } 
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada Directa Material]")){
                frm_entradaexpress frm = new frm_entradaexpress();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Resumen Stock Material]")){
                frm_maestromaterial frm = new frm_maestromaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Material]")){
                frm_salida frm = new frm_salida();
                frm.setVisible(true);
            }
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Directa Material]")){
                frm_salidaexpress frm = new frm_salidaexpress();
                frm.setVisible(true);
            } 
            
             //SUPRIMIR MATERIAL
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Suprimir Material]")){
                frm_anularmaterial frm = new frm_anularmaterial();
                frm.setVisible(true); 
            }
            
            //TRANSFERENCIAS
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Materiales]")){
                frm_transferenciamaterial frm = new frm_transferenciamaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Entre Almacenes]")){
                frm_transferenciamaterialubicacion frm = new frm_transferenciamaterialubicacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Proyectos]")){
                frm_transferenciamaterialproyecto frm = new frm_transferenciamaterialproyecto();
                frm.setVisible(true);
            }
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Ubicación]")){
                frm_transferenciamaterialubicacionenalmacen frm = new frm_transferenciamaterialubicacionenalmacen();
                frm.setVisible(true);
            }   

            //DEVOLUCIONES
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Crear]")){
                frm_devolucion frm = new frm_devolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Consultar]")){
                frm_consultardevolucion frm = new frm_consultardevolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Reingreso]")){
                frm_reingresodevolucion frm = new frm_reingresodevolucion();
                frm.setVisible(true);
            }                  
            
            
            //COTIZACIONES
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Crear]")){
                frm_cotizacion frm = new frm_cotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Aprobar]")){
                frm_aprobarcotizacion frm = new frm_aprobarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Autorizar]")){
                frm_autorizarcotizacion frm = new frm_autorizarcotizacion();
                frm.setVisible(true);
            }
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Consultar]")){
                frm_consultarcotizacion frm = new frm_consultarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Actualizar]")){
                frm_actualizarcotizacion frm = new frm_actualizarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Anular]")){
                frm_anularcotizacion frm = new frm_anularcotizacion();
                frm.setVisible(true);
            } 

            //ORDEN DE COMPRA
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Generar]")){
                frm_ordendecompra frm = new frm_ordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Consultar]")){
                frm_consultarordendecompra frm = new frm_consultarordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Anular]")){
                frm_anularordendecompra frm = new frm_anularordendecompra();
                frm.setVisible(true);
            }

            //PROVEEDOR

            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Consultar]")){
                frm_consultarproveedor frm = new frm_consultarproveedor();
                frm.setVisible(true);
            }                       
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Gestionar]")){
                frm_proveedor frm = new frm_proveedor(0);
                frm.setVisible(true);
            }            

            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Evaluación]")){
                
            }            

            //RESERVAS
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Crear]")){
                frm_reserva frm = new frm_reserva(0);
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Aprobar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Autorizar]")){
                frm_autorizarreserva frm = new frm_autorizarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Conformar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Actualizar]")){
                frm_actualizarreserva frm = new frm_actualizarreserva();
                frm.setVisible(true);
            } 
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Anular]")){
                frm_anularreserva frm = new frm_anularreserva();
                frm.setVisible(true);
    
            } 
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Consultar]")){
                frm_consultarreserva frm = new frm_consultarreserva();
                frm.setVisible(true);
            } 

            //PRESTAMOS
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Crear]")){
                frm_prestamo frm = new frm_prestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Consultar]")){
                frm_consultarprestamo frm = new frm_consultarprestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Actualizar]")){
                frm_actualizarprestamo frm = new frm_actualizarprestamo();
                frm.setVisible(true);
            }
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Anular]")){
                frm_anularprestamo frm = new frm_anularprestamo();
                frm.setVisible(true);
            }
 
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Seguimiento]")){
                frm_seguimientoprestamo frm = new frm_seguimientoprestamo();
                frm.setVisible(true);
            }
            
            //SOLICITUDES A COMPRAS
            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Crear]")){
                frm_solicitud frm = new frm_solicitud(0);
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Aprobar]")){
                frm_aprobarsolicitud frm = new frm_aprobarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Autorizar]")){
                frm_autorizarsolicitud frm = new frm_autorizarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Conformar]")){
                frm_conformarsolicitud frm = new frm_conformarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Actualizar]")){
                frm_actualizarsolicitud frm = new frm_actualizarsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Anular]")){
                frm_anularsolicitud frm = new frm_anularsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Consultar]")){
                 frm_consultarsolicitud frm = new frm_consultarsolicitud();
                frm.setVisible(true);
            } 

            //REPORTES
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Entrada de Material]")){
                frm_reporteentradamaterial2 frm = new frm_reporteentradamaterial2();
                frm.setVisible(true);
               
            }

            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Toma Física]")){
                frm_reporte_tomafisica frm = new frm_reporte_tomafisica();
                frm.setVisible(true);               
            }

            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Salida de Material]")){
                frm_reportesalidamaterial frm = new frm_reportesalidamaterial();
                frm.setVisible(true);               
            }

            
            if(tree_opcionesgerenteadministracion.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Compras, Órden de Compra]")){
                frm_reporte_ordendecompra frm = new frm_reporte_ordendecompra();
                frm.setVisible(true);               
            }
            
            
            tree_opcionesgerenteadministracion.setSelectionRow(0);
        }
        catch (NullPointerException ex){
        
        }  
    }//GEN-LAST:event_tree_opcionesgerenteadministracionMouseClicked

    private void tree_opcionesgerenteoperacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_opcionesgerenteoperacionesMouseClicked
        try{
           
             //ADMINISTRACION
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Almacén]")){
                frm_almacen frm = new frm_almacen();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Área]")){
                frm_area frm = new frm_area();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Clase Material]")){
                frm_clasematerial frm = new frm_clasematerial();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Empresa]")){
                frm_empresa frm = new frm_empresa();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Grupo Material]")){
                frm_grupomaterial frm = new frm_grupomaterial();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Moneda]")){
                frm_moneda frm = new frm_moneda();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Proyecto]")){
                frm_proyecto frm = new frm_proyecto();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Ubicación]")){
                frm_ubicacion frm = new frm_ubicacion();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, UMB]")){
                frm_umb frm = new frm_umb();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Usuario]")){
                frm_usuario frm = new frm_usuario();
                frm.setVisible(true);
            }

            //ALMACEN
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Anular Documento]")){
                frm_anulardocumento frm = new frm_anulardocumento();
                frm.setVisible(true);
            }            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Crear Material]")){
                frm_material frm = new frm_material();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Actualizar Material]")){
                frm_actualizarmaterial frm = new frm_actualizarmaterial();
                frm.setVisible(true);
            } 
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada de Material]")){
                frm_entrada frm = new frm_entrada();
                frm.setVisible(true);
            } 
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada Directa Material]")){
                frm_entradaexpress frm = new frm_entradaexpress();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Resumen Stock Material]")){
                frm_maestromaterial frm = new frm_maestromaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Material]")){
                frm_salida frm = new frm_salida();
                frm.setVisible(true);
            }
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Directa Material]")){
                frm_salidaexpress frm = new frm_salidaexpress();
                frm.setVisible(true);
            } 
            
             //SUPRIMIR MATERIAL
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Suprimir Material]")){
                frm_anularmaterial frm = new frm_anularmaterial();
                frm.setVisible(true); 
            }
            
            //TRANSFERENCIAS
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Materiales]")){
                frm_transferenciamaterial frm = new frm_transferenciamaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Entre Almacenes]")){
                frm_transferenciamaterialubicacion frm = new frm_transferenciamaterialubicacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Proyectos]")){
                frm_transferenciamaterialproyecto frm = new frm_transferenciamaterialproyecto();
                frm.setVisible(true);
            }
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Ubicación]")){
                frm_transferenciamaterialubicacionenalmacen frm = new frm_transferenciamaterialubicacionenalmacen();
                frm.setVisible(true);
            }    

            //DEVOLUCIONES
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Crear]")){
                frm_devolucion frm = new frm_devolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Consultar]")){
                frm_consultardevolucion frm = new frm_consultardevolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Reingreso]")){
                frm_reingresodevolucion frm = new frm_reingresodevolucion();
                frm.setVisible(true);
            }                   
            

            //COTIZACIONES
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Crear]")){
                frm_cotizacion frm = new frm_cotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Aprobar]")){
                frm_aprobarcotizacion frm = new frm_aprobarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Autorizar]")){
                frm_autorizarcotizacion frm = new frm_autorizarcotizacion();
                frm.setVisible(true);
            }
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Consultar]")){
                frm_consultarcotizacion frm = new frm_consultarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Actualizar]")){
                frm_actualizarcotizacion frm = new frm_actualizarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Anular]")){
                frm_anularcotizacion frm = new frm_anularcotizacion();
                frm.setVisible(true);
            } 

            //ORDEN DE COMPRA
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Generar]")){
                frm_ordendecompra frm = new frm_ordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Consultar]")){
                frm_consultarordendecompra frm = new frm_consultarordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Anular]")){
                frm_anularordendecompra frm = new frm_anularordendecompra();
                frm.setVisible(true);
            }

            //PROVEEDOR

            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Consultar]")){
                frm_consultarproveedor frm = new frm_consultarproveedor();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Gestionar]")){
                frm_proveedor frm = new frm_proveedor(0);
                frm.setVisible(true);
            }            

            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Evaluación]")){
                
            }            

            //RESERVAS
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Crear]")){
                frm_reserva frm = new frm_reserva(0);
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Aprobar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Autorizar]")){
                frm_autorizarreserva frm = new frm_autorizarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Conformar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Actualizar]")){
                frm_actualizarreserva frm = new frm_actualizarreserva();
                frm.setVisible(true);
            } 
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Anular]")){
                frm_anularreserva frm = new frm_anularreserva();
                frm.setVisible(true);
    
            } 
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Consultar]")){
                frm_consultarreserva frm = new frm_consultarreserva();
                frm.setVisible(true);
            } 

            //PRESTAMOS
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Crear]")){
                frm_prestamo frm = new frm_prestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Consultar]")){
                frm_consultarprestamo frm = new frm_consultarprestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Actualizar]")){
                frm_actualizarprestamo frm = new frm_actualizarprestamo();
                frm.setVisible(true);
            }
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Anular]")){
                frm_anularprestamo frm = new frm_anularprestamo();
                frm.setVisible(true);
            }
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Seguimiento]")){
                frm_seguimientoprestamo frm = new frm_seguimientoprestamo();
                frm.setVisible(true);
            }
           
            //SOLICITUDES A COMPRAS
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Crear]")){
                frm_solicitud frm = new frm_solicitud(0);
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Aprobar]")){
                frm_aprobarsolicitud frm = new frm_aprobarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Autorizar]")){
                frm_autorizarsolicitud frm = new frm_autorizarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Conformar]")){
               frm_conformarsolicitud frm = new frm_conformarsolicitud();
                frm.setVisible(true); 
            }
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Actualizar]")){
                frm_actualizarsolicitud frm = new frm_actualizarsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Anular]")){
                frm_anularsolicitud frm = new frm_anularsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Consultar]")){
                 frm_consultarsolicitud frm = new frm_consultarsolicitud();
                frm.setVisible(true);
            } 

            //REPORTES
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Entrada de Material]")){
                frm_reporteentradamaterial2 frm = new frm_reporteentradamaterial2();
                frm.setVisible(true);
               
            }

            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Toma Física]")){
                frm_reporte_tomafisica frm = new frm_reporte_tomafisica();
                frm.setVisible(true);               
            }  

            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Salida de Material]")){
                frm_reportesalidamaterial frm = new frm_reportesalidamaterial();
                frm.setVisible(true);               
            }
            
            if(tree_opcionesgerenteoperaciones.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Compras, Órden de Compra]")){
                frm_reporte_ordendecompra frm = new frm_reporte_ordendecompra();
                frm.setVisible(true);               
            }

            
            tree_opcionesgerenteoperaciones.setSelectionRow(0);
        }
        catch (NullPointerException ex){
        
        }  
    }//GEN-LAST:event_tree_opcionesgerenteoperacionesMouseClicked

    private void tree_opcionesprocuraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_opcionesprocuraMouseClicked
        try{
           
             //ADMINISTRACION
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Almacén]")){
                frm_almacen frm = new frm_almacen();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Área]")){
                frm_area frm = new frm_area();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Clase Material]")){
                frm_clasematerial frm = new frm_clasematerial();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Empresa]")){
                frm_empresa frm = new frm_empresa();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Grupo Material]")){
                frm_grupomaterial frm = new frm_grupomaterial();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Moneda]")){
                frm_moneda frm = new frm_moneda();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Proyecto]")){
                frm_proyecto frm = new frm_proyecto();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Ubicación]")){
                frm_ubicacion frm = new frm_ubicacion();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, UMB]")){
                frm_umb frm = new frm_umb();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Usuario]")){
                frm_usuario frm = new frm_usuario();
                frm.setVisible(true);
            }

            //ALMACEN
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Anular Documento]")){
                frm_anulardocumento frm = new frm_anulardocumento();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Crear Material]")){
                frm_material frm = new frm_material();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Actualizar Material]")){
                frm_actualizarmaterial frm = new frm_actualizarmaterial();
                frm.setVisible(true);
            } 
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada de Material]")){
                frm_entrada frm = new frm_entrada();
                frm.setVisible(true);
            } 
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada Directa Material]")){
                frm_entradaexpress frm = new frm_entradaexpress();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Resumen Stock Material]")){
                frm_maestromaterial frm = new frm_maestromaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Material]")){
                frm_salida frm = new frm_salida();
                frm.setVisible(true);
            }
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Directa Material]")){
                frm_salidaexpress frm = new frm_salidaexpress();
                frm.setVisible(true);
            } 
            
             //SUPRIMIR MATERIAL
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Suprimir Material]")){
                frm_anularmaterial frm = new frm_anularmaterial();
                frm.setVisible(true); 
            }
            
            //TRANSFERENCIAS
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Materiales]")){
                frm_transferenciamaterial frm = new frm_transferenciamaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Entre Almacenes]")){
                frm_transferenciamaterialubicacion frm = new frm_transferenciamaterialubicacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Proyectos]")){
                frm_transferenciamaterialproyecto frm = new frm_transferenciamaterialproyecto();
                frm.setVisible(true);
            }
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Ubicación]")){
                frm_transferenciamaterialubicacionenalmacen frm = new frm_transferenciamaterialubicacionenalmacen();
                frm.setVisible(true);
            }    

            //DEVOLUCIONES
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Crear]")){
                frm_devolucion frm = new frm_devolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Consultar]")){
                frm_consultardevolucion frm = new frm_consultardevolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Reingreso]")){
                frm_reingresodevolucion frm = new frm_reingresodevolucion();
                frm.setVisible(true);
            }      
            
            //COTIZACIONES
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Crear]")){
                frm_cotizacion frm = new frm_cotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Aprobar]")){
                frm_aprobarcotizacion frm = new frm_aprobarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Autorizar]")){
                frm_autorizarcotizacion frm = new frm_autorizarcotizacion();
                frm.setVisible(true);
            }
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Consultar]")){
                frm_consultarcotizacion frm = new frm_consultarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Actualizar]")){
                frm_actualizarcotizacion frm = new frm_actualizarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Anular]")){
                frm_anularcotizacion frm = new frm_anularcotizacion();
                frm.setVisible(true);
            } 

            //ORDEN DE COMPRA
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Generar]")){
                frm_ordendecompra frm = new frm_ordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Consultar]")){
                frm_consultarordendecompra frm = new frm_consultarordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Anular]")){
                frm_anularordendecompra frm = new frm_anularordendecompra();
                frm.setVisible(true);
            }

            //PROVEEDOR

            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Consultar]")){
                frm_consultarproveedor frm = new frm_consultarproveedor();
                frm.setVisible(true);
            }               
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Gestionar]")){
                frm_proveedor frm = new frm_proveedor(0);
                frm.setVisible(true);
            }            

            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Evaluación]")){
                
            }            

            //RESERVAS
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Crear]")){
                frm_reserva frm = new frm_reserva(0);
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Aprobar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Autorizar]")){
                frm_autorizarreserva frm = new frm_autorizarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Conformar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Actualizar]")){
                frm_actualizarreserva frm = new frm_actualizarreserva();
                frm.setVisible(true);
            } 
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Anular]")){
                frm_anularreserva frm = new frm_anularreserva();
                frm.setVisible(true);
    
            } 
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Consultar]")){
                frm_consultarreserva frm = new frm_consultarreserva();
                frm.setVisible(true);
            } 

            //PRESTAMOS
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Crear]")){
                frm_prestamo frm = new frm_prestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Consultar]")){
                frm_consultarprestamo frm = new frm_consultarprestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Actualizar]")){
                frm_actualizarprestamo frm = new frm_actualizarprestamo();
                frm.setVisible(true);
            }
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Anular]")){
                frm_anularprestamo frm = new frm_anularprestamo();
                frm.setVisible(true);
            }

            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Seguimiento]")){
                frm_seguimientoprestamo frm = new frm_seguimientoprestamo();
                frm.setVisible(true);
            }
            
            //SOLICITUDES A COMPRAS
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Crear]")){
                frm_solicitud frm = new frm_solicitud(0);
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Aprobar]")){
                frm_aprobarsolicitud frm = new frm_aprobarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Autorizar]")){
                frm_autorizarsolicitud frm = new frm_autorizarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Conformar]")){
               frm_conformarsolicitud frm = new frm_conformarsolicitud();
                frm.setVisible(true); 
            }
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Actualizar]")){
                frm_actualizarsolicitud frm = new frm_actualizarsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Anular]")){
                frm_anularsolicitud frm = new frm_anularsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Consultar]")){
                 frm_consultarsolicitud frm = new frm_consultarsolicitud();
                frm.setVisible(true);
            } 

            //REPORTES
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Entrada de Material]")){
                frm_reporteentradamaterial2 frm = new frm_reporteentradamaterial2();
                frm.setVisible(true);
               
            }

            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Toma Física]")){
                frm_reporte_tomafisica frm = new frm_reporte_tomafisica();
                frm.setVisible(true);               
            }  

            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Salida de Material]")){
                frm_reportesalidamaterial frm = new frm_reportesalidamaterial();
                frm.setVisible(true);               
            }
            
            if(tree_opcionesprocura.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Compras, Órden de Compra]")){
                frm_reporte_ordendecompra frm = new frm_reporte_ordendecompra();
                frm.setVisible(true);               
            }

            
            tree_opcionesprocura.setSelectionRow(0);
        }
        catch (NullPointerException ex){
        
        }  
    }//GEN-LAST:event_tree_opcionesprocuraMouseClicked

    private void tree_opcionesjefedepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_opcionesjefedepartamentoMouseClicked
        try{
           
             //ADMINISTRACION
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Almacén]")){
                frm_almacen frm = new frm_almacen();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Área]")){
                frm_area frm = new frm_area();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Clase Material]")){
                frm_clasematerial frm = new frm_clasematerial();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Empresa]")){
                frm_empresa frm = new frm_empresa();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Grupo Material]")){
                frm_grupomaterial frm = new frm_grupomaterial();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Moneda]")){
                frm_moneda frm = new frm_moneda();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Proyecto]")){
                frm_proyecto frm = new frm_proyecto();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Ubicación]")){
                frm_ubicacion frm = new frm_ubicacion();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, UMB]")){
                frm_umb frm = new frm_umb();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Usuario]")){
                frm_usuario frm = new frm_usuario();
                frm.setVisible(true);
            }

            //ALMACEN
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Anular Documento]")){
                frm_anulardocumento frm = new frm_anulardocumento();
                frm.setVisible(true);
            }
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Crear Material]")){
                frm_material frm = new frm_material();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Actualizar Material]")){
                frm_actualizarmaterial frm = new frm_actualizarmaterial();
                frm.setVisible(true);
            } 
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada de Material]")){
                frm_entrada frm = new frm_entrada();
                frm.setVisible(true);
            } 
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada Directa Material]")){
                frm_entradaexpress frm = new frm_entradaexpress();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Resumen Stock Material]")){
                frm_maestromaterial frm = new frm_maestromaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Material]")){
                frm_salida frm = new frm_salida();
                frm.setVisible(true);
            }
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Directa Material]")){
                frm_salidaexpress frm = new frm_salidaexpress();
                frm.setVisible(true);
            } 
            
             //SUPRIMIR MATERIAL
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Suprimir Material]")){
                frm_anularmaterial frm = new frm_anularmaterial();
                frm.setVisible(true); 
            }
            
            //TRANSFERENCIAS
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Materiales]")){
                frm_transferenciamaterial frm = new frm_transferenciamaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Entre Almacenes]")){
                frm_transferenciamaterialubicacion frm = new frm_transferenciamaterialubicacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Proyectos]")){
                frm_transferenciamaterialproyecto frm = new frm_transferenciamaterialproyecto();
                frm.setVisible(true);
            }
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Ubicación]")){
                frm_transferenciamaterialubicacionenalmacen frm = new frm_transferenciamaterialubicacionenalmacen();
                frm.setVisible(true);
            }    

            //DEVOLUCIONES
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Crear]")){
                frm_devolucion frm = new frm_devolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Consultar]")){
                frm_consultardevolucion frm = new frm_consultardevolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Reingreso]")){
                frm_reingresodevolucion frm = new frm_reingresodevolucion();
                frm.setVisible(true);
            }                  
            
            //COTIZACIONES
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Crear]")){
                frm_cotizacion frm = new frm_cotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Aprobar]")){
                frm_aprobarcotizacion frm = new frm_aprobarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Autorizar]")){
                frm_autorizarcotizacion frm = new frm_autorizarcotizacion();
                frm.setVisible(true);
            }
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Consultar]")){
                frm_consultarcotizacion frm = new frm_consultarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Actualizar]")){
                frm_actualizarcotizacion frm = new frm_actualizarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Anular]")){
                frm_anularcotizacion frm = new frm_anularcotizacion();
                frm.setVisible(true);
            } 

            //ORDEN DE COMPRA
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Generar]")){
                frm_ordendecompra frm = new frm_ordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Consultar]")){
                frm_consultarordendecompra frm = new frm_consultarordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Anular]")){
                frm_anularordendecompra frm = new frm_anularordendecompra();
                frm.setVisible(true);
            }

            //PROVEEDOR

            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Consultar]")){
                frm_consultarproveedor frm = new frm_consultarproveedor();
                frm.setVisible(true);
            }
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Gestionar]")){
                frm_proveedor frm = new frm_proveedor(0);
                frm.setVisible(true);
            }            

            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Evaluación]")){
                
            }            

            //RESERVAS
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Crear]")){
                frm_reserva frm = new frm_reserva(0);
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Aprobar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Autorizar]")){
                frm_autorizarreserva frm = new frm_autorizarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Conformar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Actualizar]")){
                frm_actualizarreserva frm = new frm_actualizarreserva();
                frm.setVisible(true);
            } 
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Anular]")){
                frm_anularreserva frm = new frm_anularreserva();
                frm.setVisible(true);
    
            } 
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Consultar]")){
                frm_consultarreserva frm = new frm_consultarreserva();
                frm.setVisible(true);
            } 

            //PRESTAMOS
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Crear]")){
                frm_prestamo frm = new frm_prestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Consultar]")){
                frm_consultarprestamo frm = new frm_consultarprestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Actualizar]")){
                frm_actualizarprestamo frm = new frm_actualizarprestamo();
                frm.setVisible(true);
            }
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Anular]")){
                frm_anularprestamo frm = new frm_anularprestamo();
                frm.setVisible(true);
            }
 
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Seguimiento]")){
                frm_seguimientoprestamo frm = new frm_seguimientoprestamo();
                frm.setVisible(true);
            }

            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Seguimiento]")){
                frm_seguimientoprestamo frm = new frm_seguimientoprestamo();
                frm.setVisible(true);
            }
            
            //SOLICITUDES A COMPRAS
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Crear]")){
                frm_solicitud frm = new frm_solicitud(0);
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Aprobar]")){
                frm_aprobarsolicitud frm = new frm_aprobarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Autorizar]")){
                frm_autorizarsolicitud frm = new frm_autorizarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Conformar]")){
               frm_conformarsolicitud frm = new frm_conformarsolicitud();
                frm.setVisible(true); 
            }
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Actualizar]")){
                frm_actualizarsolicitud frm = new frm_actualizarsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Anular]")){
                frm_anularsolicitud frm = new frm_anularsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Consultar]")){
                 frm_consultarsolicitud frm = new frm_consultarsolicitud();
                frm.setVisible(true);
            } 

            //REPORTES
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Entrada de Material]")){
                frm_reporteentradamaterial2 frm = new frm_reporteentradamaterial2();
                frm.setVisible(true);
               
            }

            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Toma Física]")){
                frm_reporte_tomafisica frm = new frm_reporte_tomafisica();
                frm.setVisible(true);               
            }

            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Salida de Material]")){
                frm_reportesalidamaterial frm = new frm_reportesalidamaterial();
                frm.setVisible(true);               
            }
            
            if(tree_opcionesjefedepartamento.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Compras, Órden de Compra]")){
                frm_reporte_ordendecompra frm = new frm_reporte_ordendecompra();
                frm.setVisible(true);               
            }

            
            tree_opcionesjefedepartamento.setSelectionRow(0);
        }
        catch (NullPointerException ex){
        
        }  
    }//GEN-LAST:event_tree_opcionesjefedepartamentoMouseClicked

    private void tree_opcionesanalistaalmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_opcionesanalistaalmacenMouseClicked
        try{
           
             //ADMINISTRACION
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Almacén]")){
                frm_almacen frm = new frm_almacen();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Área]")){
                frm_area frm = new frm_area();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Clase Material]")){
                frm_clasematerial frm = new frm_clasematerial();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Empresa]")){
                frm_empresa frm = new frm_empresa();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Grupo Material]")){
                frm_grupomaterial frm = new frm_grupomaterial();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Moneda]")){
                frm_moneda frm = new frm_moneda();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Proyecto]")){
                frm_proyecto frm = new frm_proyecto();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Ubicación]")){
                frm_ubicacion frm = new frm_ubicacion();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, UMB]")){
                frm_umb frm = new frm_umb();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Usuario]")){
                frm_usuario frm = new frm_usuario();
                frm.setVisible(true);
            }

            //ALMACEN
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Anular Documento]")){
                frm_anulardocumento frm = new frm_anulardocumento();
                frm.setVisible(true);
            }
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Crear Material]")){
                frm_material frm = new frm_material();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Actualizar Material]")){
                frm_actualizarmaterial frm = new frm_actualizarmaterial();
                frm.setVisible(true);
            } 
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada de Material]")){
                frm_entrada frm = new frm_entrada();
                frm.setVisible(true);
            } 
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada Directa Material]")){
                frm_entradaexpress frm = new frm_entradaexpress();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Resumen Stock Material]")){
                frm_maestromaterial frm = new frm_maestromaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Material]")){
                frm_salida frm = new frm_salida();
                frm.setVisible(true);
            }
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Directa Material]")){
                frm_salidaexpress frm = new frm_salidaexpress();
                frm.setVisible(true);
            } 
            
             //SUPRIMIR MATERIAL
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Suprimir Material]")){
                frm_anularmaterial frm = new frm_anularmaterial();
                frm.setVisible(true); 
            }
            
            //TRANSFERENCIAS
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Materiales]")){
                frm_transferenciamaterial frm = new frm_transferenciamaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Entre Almacenes]")){
                frm_transferenciamaterialubicacion frm = new frm_transferenciamaterialubicacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Proyectos]")){
                frm_transferenciamaterialproyecto frm = new frm_transferenciamaterialproyecto();
                frm.setVisible(true);
            }
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Ubicación]")){
                frm_transferenciamaterialubicacionenalmacen frm = new frm_transferenciamaterialubicacionenalmacen();
                frm.setVisible(true);
            }    

            //DEVOLUCIONES
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Crear]")){
                frm_devolucion frm = new frm_devolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Consultar]")){
                frm_consultardevolucion frm = new frm_consultardevolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Reingreso]")){
                frm_reingresodevolucion frm = new frm_reingresodevolucion();
                frm.setVisible(true);
            }     
            
            //COTIZACIONES
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Crear]")){
                frm_cotizacion frm = new frm_cotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Aprobar]")){
                frm_aprobarcotizacion frm = new frm_aprobarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Autorizar]")){
                frm_autorizarcotizacion frm = new frm_autorizarcotizacion();
                frm.setVisible(true);
            }
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Consultar]")){
                frm_consultarcotizacion frm = new frm_consultarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Actualizar]")){
                frm_actualizarcotizacion frm = new frm_actualizarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Anular]")){
                frm_anularcotizacion frm = new frm_anularcotizacion();
                frm.setVisible(true);
            } 

            //ORDEN DE COMPRA
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Generar]")){
                frm_ordendecompra frm = new frm_ordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Consultar]")){
                frm_consultarordendecompra frm = new frm_consultarordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Anular]")){
                frm_anularordendecompra frm = new frm_anularordendecompra();
                frm.setVisible(true);
            }

            //PROVEEDOR

            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Consultar]")){
                frm_consultarproveedor frm = new frm_consultarproveedor();
                frm.setVisible(true);
            }    
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Gestionar]")){
                frm_proveedor frm = new frm_proveedor(0);
                frm.setVisible(true);
            }            

            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Evaluación]")){
                
            }            

            //RESERVAS
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Crear]")){
                frm_reserva frm = new frm_reserva(0);
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Aprobar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Autorizar]")){
                frm_autorizarreserva frm = new frm_autorizarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Conformar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Actualizar]")){
                frm_actualizarreserva frm = new frm_actualizarreserva();
                frm.setVisible(true);
            } 
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Anular]")){
                frm_anularreserva frm = new frm_anularreserva();
                frm.setVisible(true);
    
            } 
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Consultar]")){
                frm_consultarreserva frm = new frm_consultarreserva();
                frm.setVisible(true);
            } 

            //PRESTAMOS
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Crear]")){
                frm_prestamo frm = new frm_prestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Consultar]")){
                frm_consultarprestamo frm = new frm_consultarprestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Actualizar]")){
                frm_actualizarprestamo frm = new frm_actualizarprestamo();
                frm.setVisible(true);
            }
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Anular]")){
                frm_anularprestamo frm = new frm_anularprestamo();
                frm.setVisible(true);
            }

            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Seguimiento]")){
                frm_seguimientoprestamo frm = new frm_seguimientoprestamo();
                frm.setVisible(true);
            }
            
            //SOLICITUDES A COMPRAS
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Crear]")){
                frm_solicitud frm = new frm_solicitud(0);
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Aprobar]")){
                frm_aprobarsolicitud frm = new frm_aprobarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Autorizar]")){
                frm_autorizarsolicitud frm = new frm_autorizarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Conformar]")){
               frm_conformarsolicitud frm = new frm_conformarsolicitud();
                frm.setVisible(true); 
            }
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Actualizar]")){
                frm_actualizarsolicitud frm = new frm_actualizarsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Anular]")){
                frm_anularsolicitud frm = new frm_anularsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Consultar]")){
                 frm_consultarsolicitud frm = new frm_consultarsolicitud();
                frm.setVisible(true);
            } 

            //REPORTES
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Entrada de Material]")){
                frm_reporteentradamaterial2 frm = new frm_reporteentradamaterial2();
                frm.setVisible(true);
               
            }

            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Toma Física]")){
                frm_reporte_tomafisica frm = new frm_reporte_tomafisica();
                frm.setVisible(true);               
            }

            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Salida de Material]")){
                frm_reportesalidamaterial frm = new frm_reportesalidamaterial();
                frm.setVisible(true);               
            }
            
            if(tree_opcionesanalistaalmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Compras, Órden de Compra]")){
                frm_reporte_ordendecompra frm = new frm_reporte_ordendecompra();
                frm.setVisible(true);               
            }
            
            tree_opcionesanalistaalmacen.setSelectionRow(0);
        }
        catch (NullPointerException ex){
        
        }  
    }//GEN-LAST:event_tree_opcionesanalistaalmacenMouseClicked

    private void tree_opcionescomprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_opcionescomprasMouseClicked
        try{
           
             //ADMINISTRACION
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Almacén]")){
                frm_almacen frm = new frm_almacen();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Área]")){
                frm_area frm = new frm_area();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Clase Material]")){
                frm_clasematerial frm = new frm_clasematerial();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Empresa]")){
                frm_empresa frm = new frm_empresa();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Grupo Material]")){
                frm_grupomaterial frm = new frm_grupomaterial();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Moneda]")){
                frm_moneda frm = new frm_moneda();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Proyecto]")){
                frm_proyecto frm = new frm_proyecto();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Ubicación]")){
                frm_ubicacion frm = new frm_ubicacion();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, UMB]")){
                frm_umb frm = new frm_umb();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Usuario]")){
                frm_usuario frm = new frm_usuario();
                frm.setVisible(true);
            }

            //ALMACEN
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Anular Documento]")){
                frm_anulardocumento frm = new frm_anulardocumento();
                frm.setVisible(true);
            }
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Crear Material]")){
                frm_material frm = new frm_material();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Actualizar Material]")){
                frm_actualizarmaterial frm = new frm_actualizarmaterial();
                frm.setVisible(true);
            } 
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada de Material]")){
                frm_entrada frm = new frm_entrada();
                frm.setVisible(true);
            } 
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada Directa Material]")){
                frm_entradaexpress frm = new frm_entradaexpress();
                frm.setVisible(true);
            } 
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Resumen Stock Material]")){
                frm_maestromaterial frm = new frm_maestromaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Material]")){
                frm_salida frm = new frm_salida();
                frm.setVisible(true);
            }
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Directa Material]")){
                frm_salidaexpress frm = new frm_salidaexpress();
                frm.setVisible(true);
            } 
            
             //SUPRIMIR MATERIAL
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Suprimir Material]")){
                frm_anularmaterial frm = new frm_anularmaterial();
                frm.setVisible(true); 
            }
            
            //TRANSFERENCIAS
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Materiales]")){
                frm_transferenciamaterial frm = new frm_transferenciamaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Entre Almacenes]")){
                frm_transferenciamaterialubicacion frm = new frm_transferenciamaterialubicacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Proyectos]")){
                frm_transferenciamaterialproyecto frm = new frm_transferenciamaterialproyecto();
                frm.setVisible(true);
            }
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Ubicación]")){
                frm_transferenciamaterialubicacionenalmacen frm = new frm_transferenciamaterialubicacionenalmacen();
                frm.setVisible(true);
            }    

            //DEVOLUCIONES
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Crear]")){
                frm_devolucion frm = new frm_devolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Consultar]")){
                frm_consultardevolucion frm = new frm_consultardevolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Reingreso]")){
                frm_reingresodevolucion frm = new frm_reingresodevolucion();
                frm.setVisible(true);
            }                 
            
            
            //COTIZACIONES
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Crear]")){
                frm_cotizacion frm = new frm_cotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Aprobar]")){
                frm_aprobarcotizacion frm = new frm_aprobarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Autorizar]")){
                frm_autorizarcotizacion frm = new frm_autorizarcotizacion();
                frm.setVisible(true);
            }
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Consultar]")){
                frm_consultarcotizacion frm = new frm_consultarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Actualizar]")){
                frm_actualizarcotizacion frm = new frm_actualizarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Anular]")){
                frm_anularcotizacion frm = new frm_anularcotizacion();
                frm.setVisible(true);
            } 

            //ORDEN DE COMPRA
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Generar]")){
                frm_ordendecompra frm = new frm_ordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Consultar]")){
                frm_consultarordendecompra frm = new frm_consultarordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Anular]")){
                frm_anularordendecompra frm = new frm_anularordendecompra();
                frm.setVisible(true);
            }

            //PROVEEDOR

            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Consultar]")){
                frm_consultarproveedor frm = new frm_consultarproveedor();
                frm.setVisible(true);
            }  
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Gestionar]")){
                frm_proveedor frm = new frm_proveedor(0);
                frm.setVisible(true);
            }            

            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Evaluación]")){
                
            }            

            //RESERVAS
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Crear]")){
                frm_reserva frm = new frm_reserva(0);
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Aprobar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Autorizar]")){
                frm_autorizarreserva frm = new frm_autorizarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Conformar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Actualizar]")){
                frm_actualizarreserva frm = new frm_actualizarreserva();
                frm.setVisible(true);
            } 
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Anular]")){
                frm_anularreserva frm = new frm_anularreserva();
                frm.setVisible(true);
    
            } 
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Consultar]")){
                frm_consultarreserva frm = new frm_consultarreserva();
                frm.setVisible(true);
            } 

            //PRESTAMOS
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Crear]")){
                frm_prestamo frm = new frm_prestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Consultar]")){
                frm_consultarprestamo frm = new frm_consultarprestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Actualizar]")){
                frm_actualizarprestamo frm = new frm_actualizarprestamo();
                frm.setVisible(true);
            }
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Anular]")){
                frm_anularprestamo frm = new frm_anularprestamo();
                frm.setVisible(true);
            }
           
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Seguimiento]")){
                frm_seguimientoprestamo frm = new frm_seguimientoprestamo();
                frm.setVisible(true);
            }
            
            //SOLICITUDES A COMPRAS
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Crear]")){
                frm_solicitud frm = new frm_solicitud(0);
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Aprobar]")){
                frm_aprobarsolicitud frm = new frm_aprobarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Autorizar]")){
                frm_autorizarsolicitud frm = new frm_autorizarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Conformar]")){
               frm_conformarsolicitud frm = new frm_conformarsolicitud();
                frm.setVisible(true); 
            }
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Actualizar]")){
                frm_actualizarsolicitud frm = new frm_actualizarsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Anular]")){
                frm_anularsolicitud frm = new frm_anularsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Consultar]")){
                 frm_consultarsolicitud frm = new frm_consultarsolicitud();
                frm.setVisible(true);
            } 

            //REPORTES
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Entrada de Material]")){
                frm_reporteentradamaterial2 frm = new frm_reporteentradamaterial2();
                frm.setVisible(true);
               
            }

            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Toma Física]")){
                frm_reporte_tomafisica frm = new frm_reporte_tomafisica();
                frm.setVisible(true);               
            }

            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Salida de Material]")){
                frm_reportesalidamaterial frm = new frm_reportesalidamaterial();
                frm.setVisible(true);               
            }
            
            if(tree_opcionescompras.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Compras, Órden de Compra]")){
                frm_reporte_ordendecompra frm = new frm_reporte_ordendecompra();
                frm.setVisible(true);               
            }
             
            
            tree_opcionescompras.setSelectionRow(0);
        }
        catch (NullPointerException ex){
        
        }  
    }//GEN-LAST:event_tree_opcionescomprasMouseClicked

    private void lbl_imagentimaca3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_imagentimaca3MouseClicked
          frm_reporteentradamaterial2 frm = new frm_reporteentradamaterial2();
          frm.setVisible(true);
    }//GEN-LAST:event_lbl_imagentimaca3MouseClicked

    private void tree_opcionesticMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_opcionesticMouseClicked
        try{
           
             //ADMINISTRACION
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Almacén]")){
                frm_almacen frm = new frm_almacen();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Área]")){
                frm_area frm = new frm_area();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Clase Material]")){
                frm_clasematerial frm = new frm_clasematerial();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Empresa]")){
                frm_empresa frm = new frm_empresa();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Grupo Material]")){
                frm_grupomaterial frm = new frm_grupomaterial();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Moneda]")){
                frm_moneda frm = new frm_moneda();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Proyecto]")){
                frm_proyecto frm = new frm_proyecto();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Ubicación]")){
                frm_ubicacion frm = new frm_ubicacion();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, UMB]")){
                frm_umb frm = new frm_umb();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Usuario]")){
                frm_usuario frm = new frm_usuario();
                frm.setVisible(true);
            }

            //ALMACEN
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Anular Documento]")){
                frm_anulardocumento frm = new frm_anulardocumento();
                frm.setVisible(true);
            }
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Crear Material]")){
                frm_material frm = new frm_material();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Actualizar Material]")){
                frm_actualizarmaterial frm = new frm_actualizarmaterial();
                frm.setVisible(true);
            } 
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada de Material]")){
                frm_entrada frm = new frm_entrada();
                frm.setVisible(true);
            } 
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada Directa Material]")){
                frm_entradaexpress frm = new frm_entradaexpress();
                frm.setVisible(true);
            } 
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Resumen Stock Material]")){
                frm_maestromaterial frm = new frm_maestromaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Material]")){
                frm_salida frm = new frm_salida();
                frm.setVisible(true);
            }
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Directa Material]")){
                frm_salidaexpress frm = new frm_salidaexpress();
                frm.setVisible(true);
            } 
            
             //SUPRIMIR MATERIAL
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Suprimir Material]")){
                frm_anularmaterial frm = new frm_anularmaterial();
                frm.setVisible(true); 
            }
            
            //TRANSFERENCIAS
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Materiales]")){
                frm_transferenciamaterial frm = new frm_transferenciamaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Entre Almacenes]")){
                frm_transferenciamaterialubicacion frm = new frm_transferenciamaterialubicacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Proyectos]")){
                frm_transferenciamaterialproyecto frm = new frm_transferenciamaterialproyecto();
                frm.setVisible(true);
            }
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Ubicación]")){
                frm_transferenciamaterialubicacionenalmacen frm = new frm_transferenciamaterialubicacionenalmacen();
                frm.setVisible(true);
            }    

            //DEVOLUCIONES
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Crear]")){
                frm_devolucion frm = new frm_devolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Consultar]")){
                frm_consultardevolucion frm = new frm_consultardevolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Reingreso]")){
                frm_reingresodevolucion frm = new frm_reingresodevolucion();
                frm.setVisible(true);
            }      
            
            //COTIZACIONES
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Crear]")){
                frm_cotizacion frm = new frm_cotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Aprobar]")){
                frm_aprobarcotizacion frm = new frm_aprobarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Autorizar]")){
                frm_autorizarcotizacion frm = new frm_autorizarcotizacion();
                frm.setVisible(true);
            }
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Consultar]")){
                frm_consultarcotizacion frm = new frm_consultarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Actualizar]")){
                frm_actualizarcotizacion frm = new frm_actualizarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Anular]")){
                frm_anularcotizacion frm = new frm_anularcotizacion();
                frm.setVisible(true);
            } 

            //ORDEN DE COMPRA
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Generar]")){
                frm_ordendecompra frm = new frm_ordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Consultar]")){
                frm_consultarordendecompra frm = new frm_consultarordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Anular]")){
                frm_anularordendecompra frm = new frm_anularordendecompra();
                frm.setVisible(true);
            }

            //PROVEEDOR

            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Consultar]")){
                frm_consultarproveedor frm = new frm_consultarproveedor();
                frm.setVisible(true);
            }   
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Gestionar]")){
                frm_proveedor frm = new frm_proveedor(0);
                frm.setVisible(true);
            }            

            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Evaluación]")){
                
            }            

            //RESERVAS
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Crear]")){
                frm_reserva frm = new frm_reserva(0);
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Aprobar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Autorizar]")){
                frm_autorizarreserva frm = new frm_autorizarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Conformar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Actualizar]")){
                frm_actualizarreserva frm = new frm_actualizarreserva();
                frm.setVisible(true);
            } 
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Anular]")){
                frm_anularreserva frm = new frm_anularreserva();
                frm.setVisible(true);
    
            } 
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Consultar]")){
                frm_consultarreserva frm = new frm_consultarreserva();
                frm.setVisible(true);
            } 

            //PRESTAMOS
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Crear]")){
                frm_prestamo frm = new frm_prestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Consultar]")){
                frm_consultarprestamo frm = new frm_consultarprestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Actualizar]")){
                frm_actualizarprestamo frm = new frm_actualizarprestamo();
                frm.setVisible(true);
            }
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Anular]")){
                frm_anularprestamo frm = new frm_anularprestamo();
                frm.setVisible(true);
            }

            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Seguimiento]")){
                frm_seguimientoprestamo frm = new frm_seguimientoprestamo();
                frm.setVisible(true);
            }
            
            //SOLICITUDES A COMPRAS
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Crear]")){
                frm_solicitud frm = new frm_solicitud(0);
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Aprobar]")){
                frm_aprobarsolicitud frm = new frm_aprobarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Autorizar]")){
                frm_autorizarsolicitud frm = new frm_autorizarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Conformar]")){
               frm_conformarsolicitud frm = new frm_conformarsolicitud();
                frm.setVisible(true); 
            }
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Actualizar]")){
                frm_actualizarsolicitud frm = new frm_actualizarsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Anular]")){
                frm_anularsolicitud frm = new frm_anularsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Consultar]")){
                 frm_consultarsolicitud frm = new frm_consultarsolicitud();
                frm.setVisible(true);
            } 

            //REPORTES
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Entrada de Material]")){
                frm_reporteentradamaterial2 frm = new frm_reporteentradamaterial2();
                frm.setVisible(true);
               
            }

            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Toma Física]")){
                frm_reporte_tomafisica frm = new frm_reporte_tomafisica();
                frm.setVisible(true);               
            }

            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Salida de Material]")){
                frm_reportesalidamaterial frm = new frm_reportesalidamaterial();
                frm.setVisible(true);               
            }
            
            if(tree_opcionestic.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Compras, Órden de Compra]")){
                frm_reporte_ordendecompra frm = new frm_reporte_ordendecompra();
                frm.setVisible(true);               
            }
            
            
            tree_opcionestic.setSelectionRow(0);
        }
        catch (NullPointerException ex){
        
        }  
    }//GEN-LAST:event_tree_opcionesticMouseClicked

    private void tree_opcionesjefealmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_opcionesjefealmacenMouseClicked
        try{
           
             //ADMINISTRACION
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Almacén]")){
                frm_almacen frm = new frm_almacen();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Área]")){
                frm_area frm = new frm_area();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Clase Material]")){
                frm_clasematerial frm = new frm_clasematerial();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Empresa]")){
                frm_empresa frm = new frm_empresa();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Grupo Material]")){
                frm_grupomaterial frm = new frm_grupomaterial();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Moneda]")){
                frm_moneda frm = new frm_moneda();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Proyecto]")){
                frm_proyecto frm = new frm_proyecto();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Ubicación]")){
                frm_ubicacion frm = new frm_ubicacion();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, UMB]")){
                frm_umb frm = new frm_umb();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Usuario]")){
                frm_usuario frm = new frm_usuario();
                frm.setVisible(true);
            }

            //ALMACEN
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Anular Documento]")){
                frm_anulardocumento frm = new frm_anulardocumento();
                frm.setVisible(true);
            }
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Crear Material]")){
                frm_material frm = new frm_material();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Actualizar Material]")){
                frm_actualizarmaterial frm = new frm_actualizarmaterial();
                frm.setVisible(true);
            } 
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada de Material]")){
                frm_entrada frm = new frm_entrada();
                frm.setVisible(true);
            } 
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada Directa Material]")){
                frm_entradaexpress frm = new frm_entradaexpress();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Resumen Stock Material]")){
                frm_maestromaterial frm = new frm_maestromaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Material]")){
                frm_salida frm = new frm_salida();
                frm.setVisible(true);
            }
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Directa Material]")){
                frm_salidaexpress frm = new frm_salidaexpress();
                frm.setVisible(true);
            } 
            
             //SUPRIMIR MATERIAL
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Suprimir Material]")){
                frm_anularmaterial frm = new frm_anularmaterial();
                frm.setVisible(true); 
            }
            
            //TRANSFERENCIAS
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Materiales]")){
                frm_transferenciamaterial frm = new frm_transferenciamaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Entre Almacenes]")){
                frm_transferenciamaterialubicacion frm = new frm_transferenciamaterialubicacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Proyectos]")){
                frm_transferenciamaterialproyecto frm = new frm_transferenciamaterialproyecto();
                frm.setVisible(true);
            }
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Ubicación]")){
                frm_transferenciamaterialubicacionenalmacen frm = new frm_transferenciamaterialubicacionenalmacen();
                frm.setVisible(true);
            }    

            //DEVOLUCIONES
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Crear]")){
                frm_devolucion frm = new frm_devolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Consultar]")){
                frm_consultardevolucion frm = new frm_consultardevolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Reingreso]")){
                frm_reingresodevolucion frm = new frm_reingresodevolucion();
                frm.setVisible(true);
            }                  
            
            //COTIZACIONES
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Crear]")){
                frm_cotizacion frm = new frm_cotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Aprobar]")){
                frm_aprobarcotizacion frm = new frm_aprobarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Autorizar]")){
                frm_autorizarcotizacion frm = new frm_autorizarcotizacion();
                frm.setVisible(true);
            }
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Consultar]")){
                frm_consultarcotizacion frm = new frm_consultarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Actualizar]")){
                frm_actualizarcotizacion frm = new frm_actualizarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Anular]")){
                frm_anularcotizacion frm = new frm_anularcotizacion();
                frm.setVisible(true);
            } 

            //ORDEN DE COMPRA
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Generar]")){
                frm_ordendecompra frm = new frm_ordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Consultar]")){
                frm_consultarordendecompra frm = new frm_consultarordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Anular]")){
                frm_anularordendecompra frm = new frm_anularordendecompra();
                frm.setVisible(true);
            }

            //PROVEEDOR

            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Consultar]")){
                frm_consultarproveedor frm = new frm_consultarproveedor();
                frm.setVisible(true);
            }   
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Gestionar]")){
                frm_proveedor frm = new frm_proveedor(0);
                frm.setVisible(true);
            }            

            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Evaluación]")){
                
            }            

            //RESERVAS
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Crear]")){
                frm_reserva frm = new frm_reserva(0);
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Aprobar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Autorizar]")){
                frm_autorizarreserva frm = new frm_autorizarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Conformar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Actualizar]")){
                frm_actualizarreserva frm = new frm_actualizarreserva();
                frm.setVisible(true);
            } 
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Anular]")){
                frm_anularreserva frm = new frm_anularreserva();
                frm.setVisible(true);
    
            } 
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Consultar]")){
                frm_consultarreserva frm = new frm_consultarreserva();
                frm.setVisible(true);
            } 

            //PRESTAMOS
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Crear]")){
                frm_prestamo frm = new frm_prestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Consultar]")){
                frm_consultarprestamo frm = new frm_consultarprestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Actualizar]")){
                frm_actualizarprestamo frm = new frm_actualizarprestamo();
                frm.setVisible(true);
            }
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Anular]")){
                frm_anularprestamo frm = new frm_anularprestamo();
                frm.setVisible(true);
            }

            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Seguimiento]")){
                frm_seguimientoprestamo frm = new frm_seguimientoprestamo();
                frm.setVisible(true);
            }
            
            //SOLICITUDES A COMPRAS
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Crear]")){
                frm_solicitud frm = new frm_solicitud(0);
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Aprobar]")){
                frm_aprobarsolicitud frm = new frm_aprobarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Autorizar]")){
                frm_autorizarsolicitud frm = new frm_autorizarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Conformar]")){
                frm_conformarsolicitud frm = new frm_conformarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Actualizar]")){
                frm_actualizarsolicitud frm = new frm_actualizarsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Anular]")){
                frm_anularsolicitud frm = new frm_anularsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Consultar]")){
                 frm_consultarsolicitud frm = new frm_consultarsolicitud();
                frm.setVisible(true);
            } 

            //REPORTES
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Entrada de Material]")){
                frm_reporteentradamaterial2 frm = new frm_reporteentradamaterial2();
                frm.setVisible(true);
               
            }

            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Toma Física]")){
                frm_reporte_tomafisica frm = new frm_reporte_tomafisica();
                frm.setVisible(true);               
            }

            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Salida de Material]")){
                frm_reportesalidamaterial frm = new frm_reportesalidamaterial();
                frm.setVisible(true);               
            }
            
            if(tree_opcionesjefealmacen.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Compras, Órden de Compra]")){
                frm_reporte_ordendecompra frm = new frm_reporte_ordendecompra();
                frm.setVisible(true);               
            }
            


            tree_opcionesjefealmacen.setSelectionRow(0);
        }
        catch (NullPointerException ex){
        
        }  
    }//GEN-LAST:event_tree_opcionesjefealmacenMouseClicked

    private void tree_opcionesalmacenistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_opcionesalmacenistaMouseClicked
        try{
           
             //ADMINISTRACION
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Almacén]")){
                frm_almacen frm = new frm_almacen();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Área]")){
                frm_area frm = new frm_area();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Clase Material]")){
                frm_clasematerial frm = new frm_clasematerial();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Empresa]")){
                frm_empresa frm = new frm_empresa();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Grupo Material]")){
                frm_grupomaterial frm = new frm_grupomaterial();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Moneda]")){
                frm_moneda frm = new frm_moneda();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Proyecto]")){
                frm_proyecto frm = new frm_proyecto();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Ubicación]")){
                frm_ubicacion frm = new frm_ubicacion();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, UMB]")){
                frm_umb frm = new frm_umb();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Administración, Usuario]")){
                frm_usuario frm = new frm_usuario();
                frm.setVisible(true);
            }

            //ALMACEN
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Anular Documento]")){
                frm_anulardocumento frm = new frm_anulardocumento();
                frm.setVisible(true);
            }
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Crear Material]")){
                frm_material frm = new frm_material();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Actualizar Material]")){
                frm_actualizarmaterial frm = new frm_actualizarmaterial();
                frm.setVisible(true);
            } 
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada de Material]")){
                frm_entrada frm = new frm_entrada();
                frm.setVisible(true);
            } 
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Entrada Directa Material]")){
                frm_entradaexpress frm = new frm_entradaexpress();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Resumen Stock Material]")){
                frm_maestromaterial frm = new frm_maestromaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Material]")){
                frm_salida frm = new frm_salida();
                frm.setVisible(true);
            }
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Salida Directa Material]")){
                frm_salidaexpress frm = new frm_salidaexpress();
                frm.setVisible(true);
            } 
            
             //SUPRIMIR MATERIAL
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Suprimir Material]")){
                frm_anularmaterial frm = new frm_anularmaterial();
                frm.setVisible(true); 
            }
            
            //TRANSFERENCIAS
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Materiales]")){
                frm_transferenciamaterial frm = new frm_transferenciamaterial();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Entre Almacenes]")){
                frm_transferenciamaterialubicacion frm = new frm_transferenciamaterialubicacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Proyectos]")){
                frm_transferenciamaterialproyecto frm = new frm_transferenciamaterialproyecto();
                frm.setVisible(true);
            }
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Transferencias, Ubicación]")){
                frm_transferenciamaterialubicacionenalmacen frm = new frm_transferenciamaterialubicacionenalmacen();
                frm.setVisible(true);
            }    

           //DEVOLUCIONES
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Crear]")){
                frm_devolucion frm = new frm_devolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Consultar]")){
                frm_consultardevolucion frm = new frm_consultardevolucion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Almacén, Devoluciones, Reingreso]")){
                frm_reingresodevolucion frm = new frm_reingresodevolucion();
                frm.setVisible(true);
            }            
            
            //COTIZACIONES
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Crear]")){
                frm_cotizacion frm = new frm_cotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Aprobar]")){
                frm_aprobarcotizacion frm = new frm_aprobarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Autorizar]")){
                frm_autorizarcotizacion frm = new frm_autorizarcotizacion();
                frm.setVisible(true);
            }
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Consultar]")){
                frm_consultarcotizacion frm = new frm_consultarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Actualizar]")){
                frm_actualizarcotizacion frm = new frm_actualizarcotizacion();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Cotizaciones, Anular]")){
                frm_anularcotizacion frm = new frm_anularcotizacion();
                frm.setVisible(true);
            } 

            //ORDEN DE COMPRA
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Generar]")){
                frm_ordendecompra frm = new frm_ordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Consultar]")){
                frm_consultarordendecompra frm = new frm_consultarordendecompra();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Órden de Compra, Anular]")){
                frm_anularordendecompra frm = new frm_anularordendecompra();
                frm.setVisible(true);
            }

            //PROVEEDOR

            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Consultar]")){
                frm_consultarproveedor frm = new frm_consultarproveedor();
                frm.setVisible(true);
            }    
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Gestionar]")){
                frm_proveedor frm = new frm_proveedor(0);
                frm.setVisible(true);
            }            

            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Compras, Proveedores, Evaluación]")){
                
            }            

            //RESERVAS
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Crear]")){
                frm_reserva frm = new frm_reserva(0);
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Aprobar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Autorizar]")){
                frm_autorizarreserva frm = new frm_autorizarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Conformar]")){
                frm_aprobarreserva frm = new frm_aprobarreserva();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Actualizar]")){
                frm_actualizarreserva frm = new frm_actualizarreserva();
                frm.setVisible(true);
            } 
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Anular]")){
                frm_anularreserva frm = new frm_anularreserva();
                frm.setVisible(true);
    
            } 
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Consultar]")){
                frm_consultarreserva frm = new frm_consultarreserva();
                frm.setVisible(true);
            } 

            //PRESTAMOS
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Crear]")){
                frm_prestamo frm = new frm_prestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Consultar]")){
                frm_consultarprestamo frm = new frm_consultarprestamo();
                frm.setVisible(true);
            } 
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Actualizar]")){
                frm_actualizarprestamo frm = new frm_actualizarprestamo();
                frm.setVisible(true);
            }
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Anular]")){
                frm_anularprestamo frm = new frm_anularprestamo();
                frm.setVisible(true);
            }

            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Reservas, Solicitudes de Herramientas y/o Equipos, Seguimiento]")){
                frm_seguimientoprestamo frm = new frm_seguimientoprestamo();
                frm.setVisible(true);
            }
            
            //SOLICITUDES A COMPRAS
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Crear]")){
                frm_solicitud frm = new frm_solicitud(0);
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Aprobar]")){
                frm_aprobarsolicitud frm = new frm_aprobarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Autorizar]")){
                frm_autorizarsolicitud frm = new frm_autorizarsolicitud();
                frm.setVisible(true);
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Conformar]")){
               frm_conformarsolicitud frm = new frm_conformarsolicitud();
                frm.setVisible(true); 
            }
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Actualizar]")){
                frm_actualizarsolicitud frm = new frm_actualizarsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Anular]")){
                frm_anularsolicitud frm = new frm_anularsolicitud();
                frm.setVisible(true);

            } 
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Solicitudes, Solicitud a Compras, Consultar]")){
                 frm_consultarsolicitud frm = new frm_consultarsolicitud();
                frm.setVisible(true);
            } 

            //REPORTES
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Entrada de Material]")){
                frm_reporteentradamaterial2 frm = new frm_reporteentradamaterial2();
                frm.setVisible(true);
               
            }

            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Toma Física]")){
                frm_reporte_tomafisica frm = new frm_reporte_tomafisica();
                frm.setVisible(true);               
            }

             if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Almacén, Salida de Material]")){
                frm_reportesalidamaterial frm = new frm_reportesalidamaterial();
                frm.setVisible(true);               
            }           
            
            
            if(tree_opcionesalmacenista.getSelectionPath().toString().trim().equals("[SISTIMACA, Reportes, Compras, Órden de Compra]")){
                frm_reporte_ordendecompra frm = new frm_reporte_ordendecompra();
                frm.setVisible(true);               
            }
            
            
            tree_opcionesalmacenista.setSelectionRow(0);
        }
        catch (NullPointerException ex){
        
        }  
    }//GEN-LAST:event_tree_opcionesalmacenistaMouseClicked

    private void tree_opcionesadministrador1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_opcionesadministrador1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tree_opcionesadministrador1MouseClicked

    private void scroll_solicitanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scroll_solicitanteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_scroll_solicitanteMouseClicked

    private void lbl_notificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_notificacionMouseClicked
        frm_notificacion frm = new frm_notificacion();
        frm.setVisible(true);
    }//GEN-LAST:event_lbl_notificacionMouseClicked

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
                new frm_principalM1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar;
    private javax.swing.JButton bot_cerrar;
    private javax.swing.JButton bot_salir;
    private javax.swing.JPanel cinta;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
    protected static javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_notificacion;
    protected static javax.swing.JLabel lbl_usuario;
    private javax.swing.JScrollPane scroll_administrador;
    private javax.swing.JScrollPane scroll_administrador1;
    private javax.swing.JScrollPane scroll_almacenista;
    private javax.swing.JScrollPane scroll_analistaalmacen;
    private javax.swing.JScrollPane scroll_compras;
    private javax.swing.JScrollPane scroll_gerenteadministracion;
    private javax.swing.JScrollPane scroll_gerenteoperaciones;
    private javax.swing.JScrollPane scroll_jefealmacen;
    private javax.swing.JScrollPane scroll_jefedepartamento;
    private javax.swing.JScrollPane scroll_procura;
    private javax.swing.JScrollPane scroll_solicitante;
    private javax.swing.JScrollPane scroll_tic;
    private javax.swing.JTree tree_opcionesadministrador;
    private javax.swing.JTree tree_opcionesadministrador1;
    private javax.swing.JTree tree_opcionesalmacenista;
    private javax.swing.JTree tree_opcionesanalistaalmacen;
    private javax.swing.JTree tree_opcionescompras;
    private javax.swing.JTree tree_opcionesgerenteadministracion;
    private javax.swing.JTree tree_opcionesgerenteoperaciones;
    private javax.swing.JTree tree_opcionesjefealmacen;
    private javax.swing.JTree tree_opcionesjefedepartamento;
    private javax.swing.JTree tree_opcionesprocura;
    private javax.swing.JTree tree_opcionessolicitante;
    private javax.swing.JTree tree_opcionestic;
    // End of variables declaration//GEN-END:variables

private void habilitar_menuopciones(int c){
    switch(c){
        case 0:
            tree_opcionesadministrador.setVisible(true);
            scroll_administrador.setVisible(true);
            tree_opcionesgerenteadministracion.setVisible(false);
            scroll_gerenteadministracion.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            scroll_solicitante.setVisible(false);
            tree_opcionesgerenteoperaciones.setVisible(false);
            scroll_gerenteoperaciones.setVisible(false);
            tree_opcionesprocura.setVisible(false);
            scroll_procura.setVisible(false);
            tree_opcionesjefedepartamento.setVisible(false);
            scroll_jefedepartamento.setVisible(false);
            tree_opcionesanalistaalmacen.setVisible(false);
            scroll_analistaalmacen.setVisible(false);
            tree_opcionescompras.setVisible(false);
            scroll_compras.setVisible(false);
            tree_opcionestic.setVisible(false);
            scroll_tic.setVisible(false);
            tree_opcionesjefealmacen.setVisible(false);
            scroll_jefealmacen.setVisible(false);
            tree_opcionesalmacenista.setVisible(false);
            scroll_almacenista.setVisible(false);
        break;
        case 1:
            tree_opcionesadministrador.setVisible(false);
            scroll_administrador.setVisible(false);
            tree_opcionesgerenteadministracion.setVisible(true);
            scroll_gerenteadministracion.setVisible(true);
            tree_opcionessolicitante.setVisible(false);
            scroll_solicitante.setVisible(false);
            tree_opcionesgerenteoperaciones.setVisible(false);
            scroll_gerenteoperaciones.setVisible(false);
            tree_opcionesprocura.setVisible(false);
            scroll_procura.setVisible(false);
            tree_opcionesjefedepartamento.setVisible(false);
            scroll_jefedepartamento.setVisible(false);
            tree_opcionesanalistaalmacen.setVisible(false);
            scroll_analistaalmacen.setVisible(false);
            tree_opcionescompras.setVisible(false);
            scroll_compras.setVisible(false);
            tree_opcionestic.setVisible(false);
            scroll_tic.setVisible(false);
            tree_opcionesjefealmacen.setVisible(false);
            scroll_jefealmacen.setVisible(false);
            tree_opcionesalmacenista.setVisible(false);
            scroll_almacenista.setVisible(false);
            
            break;
        case 2:
            tree_opcionesadministrador.setVisible(false);
            scroll_administrador.setVisible(false);
            tree_opcionesgerenteadministracion.setVisible(false);
            scroll_gerenteadministracion.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            scroll_solicitante.setVisible(false);
            tree_opcionesgerenteoperaciones.setVisible(true);
            scroll_gerenteoperaciones.setVisible(true);
            tree_opcionesprocura.setVisible(false);
            scroll_procura.setVisible(false);
            tree_opcionesjefedepartamento.setVisible(false);
            scroll_jefedepartamento.setVisible(false);
            tree_opcionesanalistaalmacen.setVisible(false);
            scroll_analistaalmacen.setVisible(false);
            tree_opcionescompras.setVisible(false);
            scroll_compras.setVisible(false);
            tree_opcionestic.setVisible(false);
            scroll_tic.setVisible(false);
            tree_opcionesjefealmacen.setVisible(false);
            scroll_jefealmacen.setVisible(false);
            tree_opcionesalmacenista.setVisible(false);
            scroll_almacenista.setVisible(false);
        break;
        case 3:
            tree_opcionesadministrador.setVisible(false);
            scroll_administrador.setVisible(false);
            tree_opcionesgerenteadministracion.setVisible(false);
            scroll_gerenteadministracion.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            scroll_solicitante.setVisible(false);
            tree_opcionesgerenteoperaciones.setVisible(false);
            scroll_gerenteoperaciones.setVisible(false);
            tree_opcionesprocura.setVisible(true);
            scroll_procura.setVisible(true);
            tree_opcionesjefedepartamento.setVisible(false);
            scroll_jefedepartamento.setVisible(false);
            tree_opcionesanalistaalmacen.setVisible(false);
            scroll_analistaalmacen.setVisible(false);
            tree_opcionescompras.setVisible(false);
            scroll_compras.setVisible(false);
            tree_opcionestic.setVisible(false);
            scroll_tic.setVisible(false);
            tree_opcionesjefealmacen.setVisible(false);
            scroll_jefealmacen.setVisible(false);
            tree_opcionesalmacenista.setVisible(false);
            scroll_almacenista.setVisible(false);
        break;
        case 4:
            tree_opcionesadministrador.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            tree_opcionesadministrador.setVisible(false);
            scroll_administrador.setVisible(false);
            tree_opcionesgerenteadministracion.setVisible(false);
            scroll_gerenteadministracion.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            scroll_solicitante.setVisible(false);
            tree_opcionesgerenteoperaciones.setVisible(false);
            scroll_gerenteoperaciones.setVisible(false);
            tree_opcionesprocura.setVisible(false);
            scroll_procura.setVisible(false);
            tree_opcionesjefedepartamento.setVisible(true);
            scroll_jefedepartamento.setVisible(true);
            tree_opcionesanalistaalmacen.setVisible(false);
            scroll_analistaalmacen.setVisible(false);
            tree_opcionescompras.setVisible(false);
            scroll_compras.setVisible(false);
            tree_opcionestic.setVisible(false);
            scroll_tic.setVisible(false);
            tree_opcionesjefealmacen.setVisible(false);
            scroll_jefealmacen.setVisible(false);
            tree_opcionesalmacenista.setVisible(false);
            scroll_almacenista.setVisible(false);
        break;
        case 5:
            tree_opcionesadministrador.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            tree_opcionesadministrador.setVisible(false);
            scroll_administrador.setVisible(false);
            tree_opcionesgerenteadministracion.setVisible(false);
            scroll_gerenteadministracion.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            scroll_solicitante.setVisible(false);
            tree_opcionesgerenteoperaciones.setVisible(false);
            scroll_gerenteoperaciones.setVisible(false);
            tree_opcionesprocura.setVisible(false);
            scroll_procura.setVisible(false);
            tree_opcionesjefedepartamento.setVisible(false);
            scroll_jefedepartamento.setVisible(false);
            tree_opcionesanalistaalmacen.setVisible(false);
            scroll_analistaalmacen.setVisible(false);
            tree_opcionescompras.setVisible(false);
            scroll_compras.setVisible(false);
            tree_opcionestic.setVisible(false);
            scroll_tic.setVisible(false);
            tree_opcionesjefealmacen.setVisible(true);
            scroll_jefealmacen.setVisible(true);
            tree_opcionesalmacenista.setVisible(false);
            scroll_almacenista.setVisible(false);
        break;
        case 6:
            tree_opcionesadministrador.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            tree_opcionesadministrador.setVisible(false);
            scroll_administrador.setVisible(false);
            tree_opcionesgerenteadministracion.setVisible(false);
            scroll_gerenteadministracion.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            scroll_solicitante.setVisible(false);
            tree_opcionesgerenteoperaciones.setVisible(false);
            scroll_gerenteoperaciones.setVisible(false);
            tree_opcionesprocura.setVisible(false);
            scroll_procura.setVisible(false);
            tree_opcionesjefedepartamento.setVisible(false);
            scroll_jefedepartamento.setVisible(false);
            tree_opcionesanalistaalmacen.setVisible(true);
            scroll_analistaalmacen.setVisible(true);
            tree_opcionescompras.setVisible(false);
            scroll_compras.setVisible(false);
            tree_opcionestic.setVisible(false);
            scroll_tic.setVisible(false);
            tree_opcionesjefealmacen.setVisible(false);
            scroll_jefealmacen.setVisible(false);
            tree_opcionesalmacenista.setVisible(false);
            scroll_almacenista.setVisible(false);
        break;
        case 7:
            tree_opcionesadministrador.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            tree_opcionesadministrador.setVisible(false);
            scroll_administrador.setVisible(false);
            tree_opcionesgerenteadministracion.setVisible(false);
            scroll_gerenteadministracion.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            scroll_solicitante.setVisible(false);
            tree_opcionesgerenteoperaciones.setVisible(false);
            scroll_gerenteoperaciones.setVisible(false);
            tree_opcionesprocura.setVisible(false);
            scroll_procura.setVisible(false);
            tree_opcionesjefedepartamento.setVisible(false);
            scroll_jefedepartamento.setVisible(false);
            tree_opcionesanalistaalmacen.setVisible(false);
            scroll_analistaalmacen.setVisible(false);
            tree_opcionescompras.setVisible(true);
            scroll_compras.setVisible(true);
            tree_opcionestic.setVisible(false);
            scroll_tic.setVisible(false);
            tree_opcionesjefealmacen.setVisible(false);
            scroll_jefealmacen.setVisible(false);
            tree_opcionesalmacenista.setVisible(false);
            scroll_almacenista.setVisible(false);
        break;
    case 8:
            tree_opcionesadministrador.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            tree_opcionesadministrador.setVisible(false);
            scroll_administrador.setVisible(false);
            tree_opcionesgerenteadministracion.setVisible(false);
            scroll_gerenteadministracion.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            scroll_solicitante.setVisible(false);
            tree_opcionesgerenteoperaciones.setVisible(false);
            scroll_gerenteoperaciones.setVisible(false);
            tree_opcionesprocura.setVisible(false);
            scroll_procura.setVisible(false);
            tree_opcionesjefedepartamento.setVisible(false);
            scroll_jefedepartamento.setVisible(false);
            tree_opcionesanalistaalmacen.setVisible(false);
            scroll_analistaalmacen.setVisible(false);
            tree_opcionescompras.setVisible(false);
            scroll_compras.setVisible(false);
            tree_opcionestic.setVisible(false);
            scroll_tic.setVisible(false);
            tree_opcionesjefealmacen.setVisible(false);
            scroll_jefealmacen.setVisible(false);
            tree_opcionesalmacenista.setVisible(true);
            scroll_almacenista.setVisible(true);
        break;

    case 9:
            tree_opcionesadministrador.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            tree_opcionesadministrador.setVisible(false);
            scroll_administrador.setVisible(false);
            tree_opcionesgerenteadministracion.setVisible(false);
            scroll_gerenteadministracion.setVisible(false);
            tree_opcionessolicitante.setVisible(true);
            scroll_solicitante.setVisible(true);
            tree_opcionesgerenteoperaciones.setVisible(false);
            scroll_gerenteoperaciones.setVisible(false);
            tree_opcionesprocura.setVisible(false);
            scroll_procura.setVisible(false);
            tree_opcionesjefedepartamento.setVisible(false);
            scroll_jefedepartamento.setVisible(false);
            tree_opcionesanalistaalmacen.setVisible(false);
            scroll_analistaalmacen.setVisible(false);
            tree_opcionescompras.setVisible(false);
            scroll_compras.setVisible(false);
            tree_opcionestic.setVisible(false);
            scroll_tic.setVisible(false);
            tree_opcionesjefealmacen.setVisible(false);
            scroll_jefealmacen.setVisible(false);
            tree_opcionesalmacenista.setVisible(false);
            scroll_almacenista.setVisible(false);
        break;
    case 10:
            tree_opcionesadministrador.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            tree_opcionesadministrador.setVisible(false);
            scroll_administrador.setVisible(false);
            tree_opcionesgerenteadministracion.setVisible(false);
            scroll_gerenteadministracion.setVisible(false);
            tree_opcionessolicitante.setVisible(false);
            scroll_solicitante.setVisible(false);
            tree_opcionesgerenteoperaciones.setVisible(false);
            scroll_gerenteoperaciones.setVisible(false);
            tree_opcionesprocura.setVisible(false);
            scroll_procura.setVisible(false);
            tree_opcionesjefedepartamento.setVisible(false);
            scroll_jefedepartamento.setVisible(false);
            tree_opcionesanalistaalmacen.setVisible(false);
            scroll_analistaalmacen.setVisible(false);
            tree_opcionescompras.setVisible(false);
            scroll_compras.setVisible(false);
            tree_opcionestic.setVisible(true);
            scroll_tic.setVisible(true);
            tree_opcionesjefealmacen.setVisible(false);
            scroll_jefealmacen.setVisible(false);
            tree_opcionesalmacenista.setVisible(false);
            scroll_almacenista.setVisible(false);
        break;
        
        
    } 

}



}