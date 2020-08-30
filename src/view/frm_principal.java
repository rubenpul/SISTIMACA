/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controlador.ctrl_usuario;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JOptionPane;
import model.class_usuario;

/**
 *
 * @author ruben
 */
public class frm_principal extends javax.swing.JFrame {

    
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
   
    
    
    
    public frm_principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.setTitle("SISTIMACA - PRINCIPAL");
        this.setExtendedState(MAXIMIZED_BOTH);
        
        class_usuario modelo_usuario;
        modelo_usuario = usuario.buscar_usuario_login();
        
        lbl_desusuario.setText(frm_login.txt_usuario.getText().trim());
        lbl_desnombres.setText(modelo_usuario.getNombres());
        lbl_nivel.setText(modelo_usuario.getId_perfil().toString());
        lbl_desnivel.setText(modelo_usuario.getDescripcionperfil());
        lbl_cedula.setText(modelo_usuario.getCedula().toString());
        lbl_area.setText(modelo_usuario.getId_area().toString());
        lbl_desarea.setText(modelo_usuario.getDescripcionarea());
        
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_cedula = new javax.swing.JLabel();
        lbl_area = new javax.swing.JLabel();
        lbl_desarea = new javax.swing.JLabel();
        lbl_nivel = new javax.swing.JLabel();
        lbl_desnivel = new javax.swing.JLabel();
        panel_usuario = new javax.swing.JPanel();
        lbl_desusuario = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_desnombres = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        menubar_timaca = new javax.swing.JMenuBar();
        menu_inicio = new javax.swing.JMenu();
        menuitem_cerrarsesion = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuitem_salir = new javax.swing.JMenuItem();
        menu_administracion = new javax.swing.JMenu();
        menuitem_almacen = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuitem_area = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuitem_clasematerial = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuitem_empresa = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuitem_grupomaterial = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menuitem_moneda = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        menuitem_proyecto = new javax.swing.JMenuItem();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator22 = new javax.swing.JPopupMenu.Separator();
        item_umb = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        menuitem_usuario = new javax.swing.JMenuItem();
        menu_almacen = new javax.swing.JMenu();
        jSeparator24 = new javax.swing.JPopupMenu.Separator();
        menuitem_agregarmaterial = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        menuitem_actualizarmaestro = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        menu_entrada = new javax.swing.JMenu();
        menuitem_entrada = new javax.swing.JMenuItem();
        item_entradaexpress = new javax.swing.JMenuItem();
        jSeparator27 = new javax.swing.JPopupMenu.Separator();
        menuitem_maestro = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        menu_prestano = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        menuitem_salida = new javax.swing.JMenuItem();
        jSeparator20 = new javax.swing.JPopupMenu.Separator();
        item_salidaexpress = new javax.swing.JMenuItem();
        jSeparator28 = new javax.swing.JPopupMenu.Separator();
        menu_transferencia = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator26 = new javax.swing.JPopupMenu.Separator();
        item_transferenciaalmacen = new javax.swing.JMenuItem();
        jSeparator29 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator30 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        menu_solicitud = new javax.swing.JMenu();
        menuitem_agregarsolicitud = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator31 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator32 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator33 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator34 = new javax.swing.JPopupMenu.Separator();
        menuitem_actualizarsolicitud = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        menuitem_solicitud = new javax.swing.JMenuItem();
        menu_ordencompras = new javax.swing.JMenu();
        item_crearordendecompra = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        item_actualizarordendecompra = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        item_estatusordendecompra = new javax.swing.JMenuItem();
        menu_reservas = new javax.swing.JMenu();
        item_crearreserva = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator35 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator36 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator37 = new javax.swing.JPopupMenu.Separator();
        item_actualizarreserva = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        item_estatusreserva = new javax.swing.JMenuItem();
        menu_proveedor = new javax.swing.JMenu();
        item_crear_actualizar = new javax.swing.JMenuItem();
        jSeparator25 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        item_crearcotizacion = new javax.swing.JMenuItem();
        jSeparator23 = new javax.swing.JPopupMenu.Separator();
        item_autorizarcotizacion = new javax.swing.JMenuItem();
        menu_reporte = new javax.swing.JMenu();

        lbl_cedula.setText("jLabel1");

        lbl_area.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_area.setText("AREA");

        lbl_desarea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_desarea.setText("AREA");

        lbl_nivel.setText("jLabel1");

        lbl_desnivel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_usuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_desusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel_usuario.add(lbl_desusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        lbl_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_usuario.setText("USUARIO");
        panel_usuario.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        lbl_desnombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel_usuario.add(lbl_desnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        lbl_nombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nombres.setText("NOMBRES");
        panel_usuario.add(lbl_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        getContentPane().add(panel_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1310, 50));

        menu_inicio.setText("INICIO");
        menu_inicio.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        menuitem_cerrarsesion.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_cerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/session.png"))); // NOI18N
        menuitem_cerrarsesion.setText("Cerrar Sesión");
        menuitem_cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_cerrarsesionActionPerformed(evt);
            }
        });
        menu_inicio.add(menuitem_cerrarsesion);
        menu_inicio.add(jSeparator1);

        menuitem_salir.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        menuitem_salir.setText("Salir");
        menuitem_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_salirActionPerformed(evt);
            }
        });
        menu_inicio.add(menuitem_salir);

        menubar_timaca.add(menu_inicio);

        menu_administracion.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        menuitem_almacen.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_almacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/centrocosto.png"))); // NOI18N
        menuitem_almacen.setText("Almacén");
        menuitem_almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_almacenActionPerformed(evt);
            }
        });
        menu_administracion.add(menuitem_almacen);
        menu_administracion.add(jSeparator2);

        menuitem_area.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_area.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/area.png"))); // NOI18N
        menuitem_area.setText("Área");
        menuitem_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_areaActionPerformed(evt);
            }
        });
        menu_administracion.add(menuitem_area);
        menu_administracion.add(jSeparator3);

        menuitem_clasematerial.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_clasematerial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/material.png"))); // NOI18N
        menuitem_clasematerial.setText("Clase Material");
        menuitem_clasematerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_clasematerialActionPerformed(evt);
            }
        });
        menu_administracion.add(menuitem_clasematerial);
        menu_administracion.add(jSeparator4);

        menuitem_empresa.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_empresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empresa.png"))); // NOI18N
        menuitem_empresa.setText("Empresa");
        menuitem_empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_empresaActionPerformed(evt);
            }
        });
        menu_administracion.add(menuitem_empresa);
        menu_administracion.add(jSeparator5);

        menuitem_grupomaterial.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_grupomaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/taller.png"))); // NOI18N
        menuitem_grupomaterial.setText("Grupo de Artículo");
        menuitem_grupomaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_grupomaterialActionPerformed(evt);
            }
        });
        menu_administracion.add(menuitem_grupomaterial);
        menu_administracion.add(jSeparator6);

        menuitem_moneda.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_moneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/moneda.png"))); // NOI18N
        menuitem_moneda.setText("Moneda");
        menuitem_moneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_monedaActionPerformed(evt);
            }
        });
        menu_administracion.add(menuitem_moneda);
        menu_administracion.add(jSeparator7);

        menuitem_proyecto.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_proyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proyecto.png"))); // NOI18N
        menuitem_proyecto.setText("Proyecto");
        menuitem_proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_proyectoActionPerformed(evt);
            }
        });
        menu_administracion.add(menuitem_proyecto);
        menu_administracion.add(jSeparator21);

        jMenuItem3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/select.png"))); // NOI18N
        jMenuItem3.setText("Ubicacion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_administracion.add(jMenuItem3);

        jSeparator22.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menu_administracion.add(jSeparator22);

        item_umb.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        item_umb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/balance.png"))); // NOI18N
        item_umb.setText("UMB");
        item_umb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_umbActionPerformed(evt);
            }
        });
        menu_administracion.add(item_umb);
        menu_administracion.add(jSeparator8);

        menuitem_usuario.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        menuitem_usuario.setText("Usuario");
        menuitem_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_usuarioActionPerformed(evt);
            }
        });
        menu_administracion.add(menuitem_usuario);

        menubar_timaca.add(menu_administracion);

        menu_almacen.setText("ALMACEN");
        menu_almacen.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        menu_almacen.add(jSeparator24);

        menuitem_agregarmaterial.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_agregarmaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingresar.png"))); // NOI18N
        menuitem_agregarmaterial.setText("Crear Material");
        menuitem_agregarmaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_agregarmaterialActionPerformed(evt);
            }
        });
        menu_almacen.add(menuitem_agregarmaterial);
        menu_almacen.add(jSeparator14);

        menuitem_actualizarmaestro.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_actualizarmaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/material3.png"))); // NOI18N
        menuitem_actualizarmaestro.setText("Actualizar Material");
        menuitem_actualizarmaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_actualizarmaestroActionPerformed(evt);
            }
        });
        menu_almacen.add(menuitem_actualizarmaestro);
        menu_almacen.add(jSeparator9);

        menu_entrada.setText("Entrada de Material");
        menu_entrada.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N

        menuitem_entrada.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_entrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/material2.png"))); // NOI18N
        menuitem_entrada.setText("Entrada de Material");
        menuitem_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_entradaActionPerformed(evt);
            }
        });
        menu_entrada.add(menuitem_entrada);

        item_entradaexpress.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        item_entradaexpress.setText("Entrada de Material Directa");
        item_entradaexpress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_entradaexpressActionPerformed(evt);
            }
        });
        menu_entrada.add(item_entradaexpress);

        menu_almacen.add(menu_entrada);
        menu_almacen.add(jSeparator27);

        menuitem_maestro.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_maestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/material4.png"))); // NOI18N
        menuitem_maestro.setLabel("Resumen Stock");
        menuitem_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_maestroActionPerformed(evt);
            }
        });
        menu_almacen.add(menuitem_maestro);
        menu_almacen.add(jSeparator11);

        menu_prestano.setText("Gestion Prestamo");
        menu_prestano.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/preload.png"))); // NOI18N
        jMenuItem1.setText("Crear Prestamo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_prestano.add(jMenuItem1);
        menu_prestano.add(jSeparator10);

        jMenuItem4.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jMenuItem4.setText("Anular Pretamo");
        menu_prestano.add(jMenuItem4);

        menu_almacen.add(menu_prestano);
        menu_almacen.add(jSeparator15);

        menuitem_salida.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salidastock.png"))); // NOI18N
        menuitem_salida.setText("Salida de Material");
        menuitem_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_salidaActionPerformed(evt);
            }
        });
        menu_almacen.add(menuitem_salida);
        menu_almacen.add(jSeparator20);

        item_salidaexpress.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        item_salidaexpress.setText("Salida de Material Express");
        item_salidaexpress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_salidaexpressActionPerformed(evt);
            }
        });
        menu_almacen.add(item_salidaexpress);
        menu_almacen.add(jSeparator28);

        menu_transferencia.setText("Transferencia");
        menu_transferencia.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/session.png"))); // NOI18N
        jMenuItem2.setText("Tranferencia de Material");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menu_transferencia.add(jMenuItem2);
        menu_transferencia.add(jSeparator26);

        item_transferenciaalmacen.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        item_transferenciaalmacen.setText("Transferencia Almacen");
        item_transferenciaalmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_transferenciaalmacenActionPerformed(evt);
            }
        });
        menu_transferencia.add(item_transferenciaalmacen);
        menu_transferencia.add(jSeparator29);

        jMenuItem5.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jMenuItem5.setText("Transferencia entre Proyectos");
        menu_transferencia.add(jMenuItem5);
        menu_transferencia.add(jSeparator30);

        jMenuItem7.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jMenuItem7.setText("Anular Transferencia");
        menu_transferencia.add(jMenuItem7);

        menu_almacen.add(menu_transferencia);

        menubar_timaca.add(menu_almacen);

        menu_solicitud.setText("SOLICITUDES");
        menu_solicitud.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        menuitem_agregarsolicitud.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_agregarsolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/solicitud2.png"))); // NOI18N
        menuitem_agregarsolicitud.setText("Crear Solicitud");
        menuitem_agregarsolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_agregarsolicitudActionPerformed(evt);
            }
        });
        menu_solicitud.add(menuitem_agregarsolicitud);
        menu_solicitud.add(jSeparator12);

        jMenuItem8.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jMenuItem8.setText("Conformar Solicitud");
        menu_solicitud.add(jMenuItem8);
        menu_solicitud.add(jSeparator31);

        jMenuItem9.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jMenuItem9.setText("Aprobar Solicitud");
        menu_solicitud.add(jMenuItem9);
        menu_solicitud.add(jSeparator32);

        jMenuItem10.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jMenuItem10.setText("Autorizar Solicitud");
        menu_solicitud.add(jMenuItem10);
        menu_solicitud.add(jSeparator33);

        jMenuItem11.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jMenuItem11.setText("Anular Solicitud");
        menu_solicitud.add(jMenuItem11);
        menu_solicitud.add(jSeparator34);

        menuitem_actualizarsolicitud.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_actualizarsolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/solicitud3.png"))); // NOI18N
        menuitem_actualizarsolicitud.setText("Seguimiento Solicitud");
        menuitem_actualizarsolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_actualizarsolicitudActionPerformed(evt);
            }
        });
        menu_solicitud.add(menuitem_actualizarsolicitud);
        menu_solicitud.add(jSeparator13);

        menuitem_solicitud.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        menuitem_solicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/status.png"))); // NOI18N
        menuitem_solicitud.setText("Estatus Solicitudes");
        menuitem_solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_solicitudActionPerformed(evt);
            }
        });
        menu_solicitud.add(menuitem_solicitud);

        menubar_timaca.add(menu_solicitud);

        menu_ordencompras.setText("ORDEN DE COMPRA");
        menu_ordencompras.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        item_crearordendecompra.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        item_crearordendecompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/preload.png"))); // NOI18N
        item_crearordendecompra.setText("Crear Orden de Compra");
        item_crearordendecompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_crearordendecompraActionPerformed(evt);
            }
        });
        menu_ordencompras.add(item_crearordendecompra);
        menu_ordencompras.add(jSeparator18);

        item_actualizarordendecompra.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        item_actualizarordendecompra.setText("Seguimiento Orden de Compra");
        menu_ordencompras.add(item_actualizarordendecompra);
        menu_ordencompras.add(jSeparator19);

        item_estatusordendecompra.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        item_estatusordendecompra.setText("Estatus Orden de Compra");
        menu_ordencompras.add(item_estatusordendecompra);

        menubar_timaca.add(menu_ordencompras);

        menu_reservas.setText("RESERVAS");
        menu_reservas.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        item_crearreserva.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        item_crearreserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/report.png"))); // NOI18N
        item_crearreserva.setText("Crear Reserva");
        item_crearreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_crearreservaActionPerformed(evt);
            }
        });
        menu_reservas.add(item_crearreserva);
        menu_reservas.add(jSeparator16);

        jMenuItem12.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jMenuItem12.setText("Aprobar Reserva");
        menu_reservas.add(jMenuItem12);
        menu_reservas.add(jSeparator35);

        jMenuItem13.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jMenuItem13.setText("Autorizar Reserva");
        menu_reservas.add(jMenuItem13);
        menu_reservas.add(jSeparator36);

        jMenuItem14.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jMenuItem14.setText("Anular Reserva");
        menu_reservas.add(jMenuItem14);
        menu_reservas.add(jSeparator37);

        item_actualizarreserva.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        item_actualizarreserva.setText("Seguimiento Reserva");
        item_actualizarreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_actualizarreservaActionPerformed(evt);
            }
        });
        menu_reservas.add(item_actualizarreserva);
        menu_reservas.add(jSeparator17);

        item_estatusreserva.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        item_estatusreserva.setText("Estatus Reserva");
        item_estatusreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_estatusreservaActionPerformed(evt);
            }
        });
        menu_reservas.add(item_estatusreserva);

        menubar_timaca.add(menu_reservas);

        menu_proveedor.setText("PROVEEDORES");
        menu_proveedor.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        item_crear_actualizar.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        item_crear_actualizar.setText("Crear / Actualizar Proveedor");
        item_crear_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_crear_actualizarActionPerformed(evt);
            }
        });
        menu_proveedor.add(item_crear_actualizar);
        menu_proveedor.add(jSeparator25);

        jMenuItem6.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jMenuItem6.setText("Evaluacion de Cumplimiento Proveedor");
        menu_proveedor.add(jMenuItem6);

        menubar_timaca.add(menu_proveedor);

        jMenu1.setText("COTIZACIONES");
        jMenu1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        item_crearcotizacion.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        item_crearcotizacion.setText("Crear / Actualizar Cotizacion");
        item_crearcotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_crearcotizacionActionPerformed(evt);
            }
        });
        jMenu1.add(item_crearcotizacion);
        jMenu1.add(jSeparator23);

        item_autorizarcotizacion.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        item_autorizarcotizacion.setText("Autorizar Cotizacion");
        item_autorizarcotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_autorizarcotizacionActionPerformed(evt);
            }
        });
        jMenu1.add(item_autorizarcotizacion);

        menubar_timaca.add(jMenu1);

        menu_reporte.setText("REPORTES");
        menu_reporte.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        menubar_timaca.add(menu_reporte);

        setJMenuBar(menubar_timaca);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuitem_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuitem_salirActionPerformed

    private void menuitem_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_entradaActionPerformed
        if (usuario.getPermisologia("ENTRADA MATERIAL")){
              frm_entrada frm = new frm_entrada();
              frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }
        
      
    }//GEN-LAST:event_menuitem_entradaActionPerformed

    private void menuitem_cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_cerrarsesionActionPerformed
        frm_login frm = new frm_login();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuitem_cerrarsesionActionPerformed

    private void menuitem_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_areaActionPerformed
        if (usuario.getPermisologia("AREA")){
            frm_area frm = new frm_area();
            frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }       

    }//GEN-LAST:event_menuitem_areaActionPerformed

    private void menuitem_empresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_empresaActionPerformed
        if (usuario.getPermisologia("EMPRESA")){
            frm_empresa frm = new frm_empresa();
            frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }
    }//GEN-LAST:event_menuitem_empresaActionPerformed

    private void menuitem_almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_almacenActionPerformed
        if (usuario.getPermisologia("ALMACEN")){
            frm_almacen frm = new frm_almacen();
            frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }
       
    }//GEN-LAST:event_menuitem_almacenActionPerformed

    private void menuitem_monedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_monedaActionPerformed
        if (usuario.getPermisologia("MONEDA")){
            frm_moneda frm = new frm_moneda();
            frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }        
    }//GEN-LAST:event_menuitem_monedaActionPerformed

    private void menuitem_proyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_proyectoActionPerformed
        if (usuario.getPermisologia("PROYECTO")){
            frm_proyecto frm = new frm_proyecto();
            frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        } 


    }//GEN-LAST:event_menuitem_proyectoActionPerformed

    private void menuitem_clasematerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_clasematerialActionPerformed
        if (usuario.getPermisologia("CLASE MATERIAL")){
            frm_clasematerial frm = new frm_clasematerial();
            frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }        
        

    }//GEN-LAST:event_menuitem_clasematerialActionPerformed

    private void menuitem_grupomaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_grupomaterialActionPerformed
        if (usuario.getPermisologia("GRUPO ARTICULO")){
            frm_grupoarticulo frm = new frm_grupoarticulo();
            frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }        
        


    }//GEN-LAST:event_menuitem_grupomaterialActionPerformed

    private void menuitem_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_usuarioActionPerformed
        frm_usuario frm = new frm_usuario();
        frm.setVisible(true);
    }//GEN-LAST:event_menuitem_usuarioActionPerformed

    private void menuitem_agregarmaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_agregarmaterialActionPerformed
        if (usuario.getPermisologia("CREAR MATERIAL")){
            frm_material frm = new frm_material();
            frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }       

        
    }//GEN-LAST:event_menuitem_agregarmaterialActionPerformed

    private void menuitem_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_salidaActionPerformed
        if (usuario.getPermisologia("SALIDA MATERIAL")){
            frm_salida frm = new frm_salida();
            frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }


    }//GEN-LAST:event_menuitem_salidaActionPerformed

    private void menuitem_agregarsolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_agregarsolicitudActionPerformed
        if (usuario.getPermisologia("CREAR MATERIAL")){
            frm_solicitud frm = new frm_solicitud();
            frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }


    }//GEN-LAST:event_menuitem_agregarsolicitudActionPerformed

    private void item_crearordendecompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_crearordendecompraActionPerformed
        if (usuario.getPermisologia("CREAR ORDEN DE COMPRA")){
            frm_ordendecompra frm = new frm_ordendecompra();
            frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }


    }//GEN-LAST:event_item_crearordendecompraActionPerformed

    private void item_crearreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_crearreservaActionPerformed
        if (usuario.getPermisologia("CREAR RESERVA")){
            frm_reserva frm = new frm_reserva();
            frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }
        

    }//GEN-LAST:event_item_crearreservaActionPerformed

    private void item_actualizarreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_actualizarreservaActionPerformed
       if (usuario.getPermisologia("ACTUALIZAR RESERVA")){
            frm_seguimientoreserva frm = new frm_seguimientoreserva();
            frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }
    }//GEN-LAST:event_item_actualizarreservaActionPerformed

    private void item_estatusreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_estatusreservaActionPerformed
         if (usuario.getPermisologia("ESTATUS RESERVA")){
            frm_estatusreserva frm = new frm_estatusreserva();
            frm.setVisible(true);
        }     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }
    }//GEN-LAST:event_item_estatusreservaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //if (usuario.getPermisologia("ACTUALIZAR RESERVA")){
            frm_prestamo frm = new frm_prestamo();
            frm.setVisible(true);
        /*}     
        else{
            JOptionPane.showMessageDialog(null, "SIN PERMISO PARA ACCEDER A ESTE MODULO. CONTACTAR AL ADMINISTRADOR");
        }*/
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frm_transferenciamaterial frm = new frm_transferenciamaterial();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void item_umbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_umbActionPerformed
        frm_umb frm = new frm_umb();
        frm.setVisible(true);
    }//GEN-LAST:event_item_umbActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        frm_ubicacion frm = new frm_ubicacion();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void item_crear_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_crear_actualizarActionPerformed
        frm_proveedor frm = new frm_proveedor();
        frm.setVisible(true);
    }//GEN-LAST:event_item_crear_actualizarActionPerformed

    private void menuitem_actualizarsolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_actualizarsolicitudActionPerformed
       
    }//GEN-LAST:event_menuitem_actualizarsolicitudActionPerformed

    private void item_crearcotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_crearcotizacionActionPerformed
        frm_cotizacion frm = new frm_cotizacion();
        frm.setVisible(true);
    }//GEN-LAST:event_item_crearcotizacionActionPerformed

    private void item_autorizarcotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_autorizarcotizacionActionPerformed
        frm_analisisresultado frm = new frm_analisisresultado();
        frm.setVisible(true);
    }//GEN-LAST:event_item_autorizarcotizacionActionPerformed

    private void menuitem_solicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_solicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuitem_solicitudActionPerformed

    private void item_transferenciaalmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_transferenciaalmacenActionPerformed
        frm_transferenciamaterialubicacion frm = new frm_transferenciamaterialubicacion();
        frm.setVisible(true);
    }//GEN-LAST:event_item_transferenciaalmacenActionPerformed

    private void item_entradaexpressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_entradaexpressActionPerformed
        frm_entradaexpress frm = new frm_entradaexpress();
        frm.setVisible(true);
    }//GEN-LAST:event_item_entradaexpressActionPerformed

    private void item_salidaexpressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_salidaexpressActionPerformed
        frm_salidaexpress frm = new frm_salidaexpress();
        frm.setVisible(true);
    }//GEN-LAST:event_item_salidaexpressActionPerformed

    private void menuitem_actualizarmaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_actualizarmaestroActionPerformed
/*    falta    frm_actualizarmaterial frm = new frm_actualizarmaterial();
        frm.setVisible(true);*/
    }//GEN-LAST:event_menuitem_actualizarmaestroActionPerformed

    private void menuitem_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_maestroActionPerformed
 /*    falta   frm_maestromaterial frm = new frm_maestromaterial();
        frm.setVisible(true);*/
    }//GEN-LAST:event_menuitem_maestroActionPerformed

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
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem item_actualizarordendecompra;
    private javax.swing.JMenuItem item_actualizarreserva;
    private javax.swing.JMenuItem item_autorizarcotizacion;
    private javax.swing.JMenuItem item_crear_actualizar;
    private javax.swing.JMenuItem item_crearcotizacion;
    private javax.swing.JMenuItem item_crearordendecompra;
    private javax.swing.JMenuItem item_crearreserva;
    private javax.swing.JMenuItem item_entradaexpress;
    private javax.swing.JMenuItem item_estatusordendecompra;
    private javax.swing.JMenuItem item_estatusreserva;
    private javax.swing.JMenuItem item_salidaexpress;
    private javax.swing.JMenuItem item_transferenciaalmacen;
    private javax.swing.JMenuItem item_umb;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator22;
    private javax.swing.JPopupMenu.Separator jSeparator23;
    private javax.swing.JPopupMenu.Separator jSeparator24;
    private javax.swing.JPopupMenu.Separator jSeparator25;
    private javax.swing.JPopupMenu.Separator jSeparator26;
    private javax.swing.JPopupMenu.Separator jSeparator27;
    private javax.swing.JPopupMenu.Separator jSeparator28;
    private javax.swing.JPopupMenu.Separator jSeparator29;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator30;
    private javax.swing.JPopupMenu.Separator jSeparator31;
    private javax.swing.JPopupMenu.Separator jSeparator32;
    private javax.swing.JPopupMenu.Separator jSeparator33;
    private javax.swing.JPopupMenu.Separator jSeparator34;
    private javax.swing.JPopupMenu.Separator jSeparator35;
    private javax.swing.JPopupMenu.Separator jSeparator36;
    private javax.swing.JPopupMenu.Separator jSeparator37;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    protected static javax.swing.JLabel lbl_area;
    protected static javax.swing.JLabel lbl_cedula;
    protected static javax.swing.JLabel lbl_desarea;
    protected static javax.swing.JLabel lbl_desnivel;
    protected static javax.swing.JLabel lbl_desnombres;
    private static javax.swing.JLabel lbl_desusuario;
    protected static javax.swing.JLabel lbl_nivel;
    private javax.swing.JLabel lbl_nombres;
    protected static javax.swing.JLabel lbl_usuario;
    private javax.swing.JMenu menu_administracion;
    private javax.swing.JMenu menu_almacen;
    private javax.swing.JMenu menu_entrada;
    private javax.swing.JMenu menu_inicio;
    private javax.swing.JMenu menu_ordencompras;
    private javax.swing.JMenu menu_prestano;
    private javax.swing.JMenu menu_proveedor;
    private javax.swing.JMenu menu_reporte;
    private javax.swing.JMenu menu_reservas;
    private javax.swing.JMenu menu_solicitud;
    private javax.swing.JMenu menu_transferencia;
    private javax.swing.JMenuBar menubar_timaca;
    private javax.swing.JMenuItem menuitem_actualizarmaestro;
    private javax.swing.JMenuItem menuitem_actualizarsolicitud;
    private javax.swing.JMenuItem menuitem_agregarmaterial;
    private javax.swing.JMenuItem menuitem_agregarsolicitud;
    private javax.swing.JMenuItem menuitem_almacen;
    private javax.swing.JMenuItem menuitem_area;
    private javax.swing.JMenuItem menuitem_cerrarsesion;
    private javax.swing.JMenuItem menuitem_clasematerial;
    private javax.swing.JMenuItem menuitem_empresa;
    private javax.swing.JMenuItem menuitem_entrada;
    private javax.swing.JMenuItem menuitem_grupomaterial;
    private javax.swing.JMenuItem menuitem_maestro;
    private javax.swing.JMenuItem menuitem_moneda;
    private javax.swing.JMenuItem menuitem_proyecto;
    private javax.swing.JMenuItem menuitem_salida;
    private javax.swing.JMenuItem menuitem_salir;
    private javax.swing.JMenuItem menuitem_solicitud;
    private javax.swing.JMenuItem menuitem_usuario;
    private javax.swing.JPanel panel_usuario;
    // End of variables declaration//GEN-END:variables
}
