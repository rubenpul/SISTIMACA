/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controlador.ctrl_comun;
import controlador.ctrl_entrada;
import controlador.ctrl_material;
import controlador.ctrl_salida;
import formatos_excel.reporte_entrada;
import formatos_excel.reporte_salida;
import java.awt.Color;
import java.awt.Desktop;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jxl.write.WriteException;
import model.class_entrada;
import model.class_material;
import static view.frm_salidaexpress.txt_id;

/**
 *
 * @author ruben
 */
public class frm_reportesalidamaterial extends javax.swing.JFrame {

   
    public frm_reportesalidamaterial() {
        initComponents();
        this.getContentPane().setBackground(new Color(245,245,245));
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("SISTIMACA - REPORTE SALIDA DE MAESTRO DE MATERIAL");
        
        this.setIconImage(new ImageIcon(funciones.logoempresa()).getImage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_salida = new javax.swing.JTable();
        group_reporte = new javax.swing.ButtonGroup();
        txt_id = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lbl_encabezadoalmacen2 = new javax.swing.JLabel();
        lbl_imagentimaca2 = new javax.swing.JLabel();
        bot_reiniciar = new javax.swing.JButton();
        bot_cerrar = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        radio_todos = new javax.swing.JRadioButton();
        radio_nromaterial = new javax.swing.JRadioButton();
        radio_almacen = new javax.swing.JRadioButton();
        radio_proyecto = new javax.swing.JRadioButton();
        lbl_fechadesde = new javax.swing.JLabel();
        lbl_fechahasta1 = new javax.swing.JLabel();
        txt_nromaterial = new javax.swing.JTextField();
        bot_buscar = new javax.swing.JButton();
        txt_descripcionmaterial = new javax.swing.JTextField();
        cmb_almacen = new javax.swing.JComboBox<>();
        date_desde = new com.toedter.calendar.JDateChooser();
        date_hasta = new com.toedter.calendar.JDateChooser();
        bot_generareporte = new javax.swing.JButton();
        txt_idproyecto = new javax.swing.JTextField();
        bot_buscarreporte = new javax.swing.JButton();
        txt_descripcionproyecto = new javax.swing.JTextField();

        table_salida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "numeromaterial", "codigomaestro", "descripcionmaterial", "marca", "modelo", "umb", "clase", "articulo", "almacen", "ubicacion", "proyecto", "cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_salida);

        txt_id.setText("0");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(null);

        lbl_encabezadoalmacen2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_encabezadoalmacen2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_encabezadoalmacen2.setText("REPORTE MAESTRO DE MATERIAL");
        jPanel7.add(lbl_encabezadoalmacen2);
        lbl_encabezadoalmacen2.setBounds(270, 10, 250, 29);

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
        bot_cerrar.setBounds(1250, 20, 110, 29);
        complemento.DisableBorderButton(bot_cerrar);

        lbl_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_usuario.setText("USUARIO");
        jPanel7.add(lbl_usuario);
        lbl_usuario.setBounds(870, 10, 230, 17);

        lbl_nombres.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_nombres.setText("NOMBRES");
        lbl_nombres.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(lbl_nombres);
        lbl_nombres.setBounds(872, 30, 230, 17);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 60));

        group_reporte.add(radio_todos);
        radio_todos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radio_todos.setSelected(true);
        radio_todos.setText("Todos");
        radio_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_todosActionPerformed(evt);
            }
        });
        getContentPane().add(radio_todos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        group_reporte.add(radio_nromaterial);
        radio_nromaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radio_nromaterial.setText("Número de Material");
        radio_nromaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_nromaterialActionPerformed(evt);
            }
        });
        getContentPane().add(radio_nromaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        group_reporte.add(radio_almacen);
        radio_almacen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radio_almacen.setText("Almacén");
        radio_almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_almacenActionPerformed(evt);
            }
        });
        getContentPane().add(radio_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        group_reporte.add(radio_proyecto);
        radio_proyecto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radio_proyecto.setText("Proyecto");
        radio_proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_proyectoActionPerformed(evt);
            }
        });
        getContentPane().add(radio_proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lbl_fechadesde.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_fechadesde.setText("Fecha Desde");
        getContentPane().add(lbl_fechadesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lbl_fechahasta1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_fechahasta1.setText("Fecha Hasta");
        getContentPane().add(lbl_fechahasta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        txt_nromaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_nromaterial.setEnabled(false);
        txt_nromaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nromaterialActionPerformed(evt);
            }
        });
        txt_nromaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nromaterialKeyReleased(evt);
            }
        });
        getContentPane().add(txt_nromaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 80, -1));

        bot_buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bot_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Search.png"))); // NOI18N
        bot_buscar.setText("Buscar");
        bot_buscar.setEnabled(false);
        bot_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(bot_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        txt_descripcionmaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_descripcionmaterial.setEnabled(false);
        txt_descripcionmaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionmaterialActionPerformed(evt);
            }
        });
        getContentPane().add(txt_descripcionmaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 200, -1));

        cmb_almacen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmb_almacen.setEnabled(false);
        getContentPane().add(cmb_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 200, -1));

        date_desde.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(date_desde, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 110, -1));

        date_hasta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(date_hasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 110, -1));

        bot_generareporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bot_generareporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        bot_generareporte.setText("GENERAR REPORTE");
        bot_generareporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_generareporteActionPerformed(evt);
            }
        });
        getContentPane().add(bot_generareporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        txt_idproyecto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_idproyecto.setEnabled(false);
        getContentPane().add(txt_idproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 70, -1));

        bot_buscarreporte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bot_buscarreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Search.png"))); // NOI18N
        bot_buscarreporte.setText("Buscar");
        bot_buscarreporte.setEnabled(false);
        bot_buscarreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_buscarreporteActionPerformed(evt);
            }
        });
        getContentPane().add(bot_buscarreporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        txt_descripcionproyecto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_descripcionproyecto.setEnabled(false);
        getContentPane().add(txt_descripcionproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_reiniciarActionPerformed
        frm_reportesalidamaterial frm = new frm_reportesalidamaterial();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bot_reiniciarActionPerformed

    private void bot_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_cerrarActionPerformed
        Integer resp = JOptionPane.showConfirmDialog(null, "ESTÁ SEGURO EN SALIR?");
        if (resp.equals(0)){
            this.dispose();
        }
    }//GEN-LAST:event_bot_cerrarActionPerformed

    private void radio_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_todosActionPerformed
        txt_nromaterial.setText("");
        txt_descripcionmaterial.setText("");
        txt_nromaterial.setEnabled(false);
        bot_buscar.setEnabled(false);
        cmb_almacen.setSelectedItem("Seleccione...");
        cmb_almacen.setEnabled(false);
        txt_id.setText("0");
        txt_idproyecto.setText("");
        txt_descripcionproyecto.setText(""); 
        bot_buscarreporte.setEnabled(false);
    }//GEN-LAST:event_radio_todosActionPerformed

    private void radio_nromaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_nromaterialActionPerformed
        txt_nromaterial.setText("");
        txt_descripcionmaterial.setText("");
        txt_nromaterial.setEnabled(true);
        bot_buscar.setEnabled(true);
        cmb_almacen.setSelectedItem("Seleccione...");
        cmb_almacen.setEnabled(false);
        txt_id.setText("0");
        txt_idproyecto.setText("");
        txt_descripcionproyecto.setText(""); 
        bot_buscarreporte.setEnabled(false);
    }//GEN-LAST:event_radio_nromaterialActionPerformed

    private void radio_almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_almacenActionPerformed
        txt_nromaterial.setText("");
        txt_descripcionmaterial.setText("");
        txt_nromaterial.setEnabled(false);
        bot_buscar.setEnabled(false);
        cmb_almacen.setSelectedItem("Seleccione...");
        cmb_almacen.setEnabled(true);
        txt_id.setText("0");
        txt_idproyecto.setText("");
        txt_descripcionproyecto.setText(""); 
        bot_buscarreporte.setEnabled(false);
    }//GEN-LAST:event_radio_almacenActionPerformed

    private void radio_proyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_proyectoActionPerformed
        txt_nromaterial.setText("");
        txt_descripcionmaterial.setText("");
        txt_nromaterial.setEnabled(false);
        bot_buscar.setEnabled(false);
        cmb_almacen.setSelectedItem("Seleccione...");
        cmb_almacen.setEnabled(false);
        txt_id.setText("0");
        txt_idproyecto.setText("");
        txt_descripcionproyecto.setText(""); 
        bot_buscarreporte.setEnabled(true);
    }//GEN-LAST:event_radio_proyectoActionPerformed

    private void txt_nromaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nromaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nromaterialActionPerformed

    private void txt_nromaterialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nromaterialKeyReleased
        ctrl_material material = null;
        class_material modelo_material = null;

        if ( ( (evt.getKeyCode() >= 48 ) && (evt.getKeyCode() <= 57 ) ) || ( (evt.getKeyCode() >= 37 ) && (evt.getKeyCode() <= 40 ) ) || ((evt.getKeyCode() >= 96 ) && (evt.getKeyCode() <= 105 )) || (evt.getKeyCode() == 144) || (evt.getKeyCode() == 127) || (evt.getKeyCode() == 8)  || (evt.getKeyCode() == 10)){

            material = new ctrl_material(0,Integer.parseInt(txt_nromaterial.getText().trim()),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);

            modelo_material = material.consultar_descripcionmaterial();

            txt_descripcionmaterial.setText(modelo_material.getDescripcion());

        }
        else{
            if (evt.getKeyCode() == 27){

                bot_reiniciar.doClick();

            }
            else{
                JOptionPane.showMessageDialog(null, "CARÁCTER NO VÁLIDO. SOLO NÚMEROS (1..9)", "SISTIMACA - REPORTE ENTRADA", JOptionPane.ERROR_MESSAGE,null);
                txt_nromaterial.setText("");
                txt_descripcionmaterial.setText("");
            }
        }
    }//GEN-LAST:event_txt_nromaterialKeyReleased

    private void bot_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_buscarActionPerformed
        frm_buscarmaterial frm = new frm_buscarmaterial(9);
        frm.setVisible(true);
    }//GEN-LAST:event_bot_buscarActionPerformed

    private void txt_descripcionmaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionmaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionmaterialActionPerformed

    private void bot_generareporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_generareporteActionPerformed
        String nombre_archivo;
        String fecha_desde;
        String fecha_hasta;
        Integer numero = (int) (Math.random() * 10000000) + 1;
    
        nombre_archivo = "\\\\192.168.0.3\\dist\\Documentos_SisTimaca\\SalidaMaterial" + numero +".xls";
        //nombre_archivo = "C:\\Users\\ruben\\Desktop\\MaestroMaterial" + numero +".xls";

        class_entrada modelo_salida;
        Boolean resp=false;

        Integer nro_material=0;
        Integer id_proyecto=0;
        Integer id_almacen=0;

        fecha_desde = funciones.fecha_convertir_date(date_desde, 1);
        fecha_hasta = funciones.fecha_convertir_date(date_hasta, 1);

        try{
            nro_material = Integer.parseInt(txt_nromaterial.getText().trim());
        }
        catch(NumberFormatException ex){
            nro_material = 0;
        }

        
        id_proyecto = Integer.parseInt(txt_id.getText().trim());
       

        try{
            id_almacen = Integer.parseInt(cmb_almacen.getSelectedItem().toString().substring(0,3).trim());
        }
        catch(NumberFormatException | NullPointerException ex){
            id_almacen = 0;
        }
        
        ctrl_salida salida  = new ctrl_salida(
                    0, 
                    0, 
                    nro_material,
                    "", //descripcion material
                    0, 
                    "", 
                    id_almacen,
                    "",
                    0,
                    "",
                    "",
                    id_proyecto,
                    1,
                    0,    
                    0,
                    "", 
                    "", 
                    true
                           
            ); 
        
        
        resp=salida.consultar_salida_material(fecha_desde,fecha_hasta,table_salida);

        if (resp){
                        
            reporte_salida ex = new reporte_salida(new File(nombre_archivo), "DATOS DE SALIDA DE MATERIAL", table_salida);

            try {
                try {
                    if(ex.excel_export_reporte()){

                        File archivo_abrir = new File(nombre_archivo);
                        Desktop.getDesktop().open(archivo_abrir);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "ERROR EN EXPORTAR ARCHIVO EXCEL");
                    }
                } catch (WriteException ex1) {
                    
                }
            }catch (IOException ex1) {
                JOptionPane.showMessageDialog(null, "ERROR ABRIR ARCHIVO");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "NO HAY DATOS PARA LA CONSULTA");
        }
    }//GEN-LAST:event_bot_generareporteActionPerformed

    private void bot_buscarreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_buscarreporteActionPerformed
        frm_buscarproyecto frm = new frm_buscarproyecto(14);
        frm.setVisible(true);
    }//GEN-LAST:event_bot_buscarreporteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ctrl_comun control = new ctrl_comun(1);
        cmb_almacen =  control.cargar_combo(cmb_almacen,"Seleccione...");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frm_reportesalidamaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_reportesalidamaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_reportesalidamaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_reportesalidamaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_reportesalidamaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_buscar;
    private javax.swing.JButton bot_buscarreporte;
    private javax.swing.JButton bot_cerrar;
    private javax.swing.JButton bot_generareporte;
    private javax.swing.JButton bot_reiniciar;
    protected static javax.swing.JComboBox<String> cmb_almacen;
    private com.toedter.calendar.JDateChooser date_desde;
    private com.toedter.calendar.JDateChooser date_hasta;
    private javax.swing.ButtonGroup group_reporte;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_encabezadoalmacen2;
    private javax.swing.JLabel lbl_fechadesde;
    private javax.swing.JLabel lbl_fechahasta1;
    private javax.swing.JLabel lbl_imagentimaca2;
    private javax.swing.JLabel lbl_nombres;
    protected static javax.swing.JLabel lbl_usuario;
    private javax.swing.JRadioButton radio_almacen;
    private javax.swing.JRadioButton radio_nromaterial;
    private javax.swing.JRadioButton radio_proyecto;
    private javax.swing.JRadioButton radio_todos;
    private javax.swing.JTable table_salida;
    protected static javax.swing.JTextField txt_descripcionmaterial;
    protected static javax.swing.JTextField txt_descripcionproyecto;
    protected static javax.swing.JTextField txt_id;
    protected static javax.swing.JTextField txt_idproyecto;
    protected static javax.swing.JTextField txt_nromaterial;
    // End of variables declaration//GEN-END:variables
}
