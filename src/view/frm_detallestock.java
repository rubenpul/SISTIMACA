/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controlador.ctrl_material;
import controlador.ctrl_solicitud;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static view.frm_consultarcotizacion.lbl_usuario;

/**
 *
 * @author ruben
 */
public class frm_detallestock extends javax.swing.JFrame {

    /**
     * Creates new form frm_detallestock
     */
    public frm_detallestock() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SISTIMACA - RESUMEN STOCK");
        
        this.setIconImage(new ImageIcon(funciones.logoempresa()).getImage());
        
        
        // Cargar Look And Feel (Marcos Windows )
        try{
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        }
        catch(Exception e){} 
        
           
       // Instanciamos nuestro modelo de datos, por ejemplo, DefaultTableModel
       // y lo metemos en el JTable
        DefaultTableModel modelotabla = (DefaultTableModel) table_detallematerial.getModel();
       
        // Instanciamos el TableRowSorter y lo añadimos al JTable
        TableRowSorter elQueOrdena = new TableRowSorter(modelotabla);
        table_detallematerial.setRowSorter(elQueOrdena);
        
        lbl_usuario.setText(frm_principalM1.lbl_usuario.getText().trim());
        lbl_nombres.setText(frm_principalM1.lbl_nombres.getText().trim());
    }    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        lbl_encabezadoalmacen2 = new javax.swing.JLabel();
        lbl_imagentimaca2 = new javax.swing.JLabel();
        bot_cerrar = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        lbl_numeromaterial = new javax.swing.JLabel();
        panel_foto = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_descripcion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_usomaterial = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_observacion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_detallematerial = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        lbl_codigomaestro = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_unidadmedidabase = new javax.swing.JLabel();

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
        lbl_encabezadoalmacen2.setText("DETALLE STOCK");
        jPanel7.add(lbl_encabezadoalmacen2);
        lbl_encabezadoalmacen2.setBounds(250, 10, 140, 29);

        lbl_imagentimaca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TIMACA.png"))); // NOI18N
        jPanel7.add(lbl_imagentimaca2);
        lbl_imagentimaca2.setBounds(10, 0, 220, 60);

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
        bot_cerrar.setBounds(810, 10, 100, 29);
        complemento.DisableBorderButton(bot_cerrar);

        lbl_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_usuario.setText("USUARIO");
        jPanel7.add(lbl_usuario);
        lbl_usuario.setBounds(610, 10, 250, 17);

        lbl_nombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_nombres.setText("NOMBRES");
        lbl_nombres.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(lbl_nombres);
        lbl_nombres.setBounds(610, 30, 250, 17);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 60));

        lbl_numeromaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(lbl_numeromaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 120, 20));

        panel_foto.setBackground(new java.awt.Color(255, 255, 255));
        panel_foto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FOTO REFERENCIAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        panel_foto.setForeground(new java.awt.Color(0, 0, 255));

        lbl_foto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_fotoLayout = new javax.swing.GroupLayout(panel_foto);
        panel_foto.setLayout(panel_fotoLayout);
        panel_fotoLayout.setHorizontalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );
        panel_fotoLayout.setVerticalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        getContentPane().add(panel_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 260, 250));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText(" NÚMERO DE MATERIAL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("DESCRIPCIÓN MATERIAL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lbl_descripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(lbl_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 440, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("OBSERVACIONES");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lbl_usomaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(lbl_usomaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 510, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("UNIDAD MEDIDA BASE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        area_observacion.setColumns(20);
        area_observacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        area_observacion.setLineWrap(true);
        area_observacion.setRows(5);
        area_observacion.setEnabled(false);
        jScrollPane1.setViewportView(area_observacion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 310, -1));

        table_detallematerial.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        table_detallematerial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NRO DE MATERIAL", "DESCRIPCIÓN MATERIAL", "VALORACIÓN", "ALMACÉN", "UBICACIÓN", "PROYECTO", "STOCK DISPONIBLE", "UMB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_detallematerial);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 1000, 140));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText(" USO DE MATERIAL");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lbl_codigomaestro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_codigomaestro.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbl_codigomaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 230, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CÓDIGO MATERIAL MAESTRO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lbl_unidadmedidabase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(lbl_unidadmedidabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 300, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_cerrarActionPerformed
        Integer resp = JOptionPane.showConfirmDialog(null, "ESTÁ SEGURO EN SALIR?");
        if (resp.equals(0)){
            this.dispose();
        }
    }//GEN-LAST:event_bot_cerrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ctrl_material material = null;
        BufferedImage img;
        Integer posicion;
        
        posicion = frm_maestromaterial.table_detallematerial.getSelectedRow();
        
        lbl_numeromaterial.setText(frm_maestromaterial.table_detallematerial.getValueAt(posicion, 1).toString());
        lbl_descripcion.setText(frm_maestromaterial.table_detallematerial.getValueAt(posicion, 2).toString());
        lbl_usomaterial.setText(frm_maestromaterial.table_detallematerial.getValueAt(posicion, 14).toString());
        area_observacion.setText(frm_maestromaterial.table_detallematerial.getValueAt(posicion, 15).toString());
        
        lbl_codigomaestro.setText(frm_maestromaterial.txt_codigomaestromaterial.getText());
        
        lbl_unidadmedidabase.setText(frm_maestromaterial.table_detallematerial.getValueAt(posicion, 5).toString());
        
        
        material = new ctrl_material(0,Integer.parseInt(lbl_numeromaterial.getText()),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);

        material.consultar_disponibilidad_material_maestro(table_detallematerial);
                
        ctrl_solicitud solicitud = new ctrl_solicitud(

            0,
            0,
            0,
            "",
            0,
            "",
            0,
            Integer.parseInt(lbl_numeromaterial.getText().trim()), //numero de material
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
            "",
            ""    
        );

        try{
            
            lbl_foto.setIcon(null);
            img = funciones.decodeToImage(solicitud.consultar_foto());

            ImageIcon icon = new ImageIcon(img);
            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(frm_detallestock.lbl_foto.getWidth(), frm_detallestock.lbl_foto.getHeight(), Image.SCALE_DEFAULT));
            
            lbl_foto.setIcon(icono);

        }
        catch(NullPointerException ex){ System.out.println(ex.getMessage()); }

        
        
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
            java.util.logging.Logger.getLogger(frm_detallestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_detallestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_detallestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_detallestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_detallestock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_observacion;
    private javax.swing.JButton bot_cerrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_codigomaestro;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_encabezadoalmacen2;
    protected static javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_imagentimaca2;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_numeromaterial;
    private javax.swing.JLabel lbl_unidadmedidabase;
    private javax.swing.JLabel lbl_usomaterial;
    protected static javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_foto;
    private javax.swing.JTable table_detallematerial;
    // End of variables declaration//GEN-END:variables
}
