/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controlador.ctrl_comun;
import controlador.ctrl_proveedor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ruben
 */
public class frm_consultarproveedor extends javax.swing.JFrame {

    /**
     * Creates new form frm_consultarproveedor
     */
    public frm_consultarproveedor() {
        initComponents();
        
        this.setIconImage(new ImageIcon(funciones.logoempresa()).getImage());
        
       // Cargar Look And Feel (Marcos Windows )
        try{
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        }
        catch(Exception e){} 
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("SISTIMACA - CONSULTAR PROVEEDOR");
        lbl_usuario.setText(frm_principalM1.lbl_usuario.getText().trim());
        lbl_nombres.setText(frm_principalM1.lbl_nombres.getText().trim());
 
        DefaultTableModel modelotabla = (DefaultTableModel) table_proveedor.getModel();
       
        // Instanciamos el TableRowSorter y lo añadimos al JTable
        TableRowSorter elQueOrdena = new TableRowSorter(modelotabla);
        table_proveedor.setRowSorter(elQueOrdena);
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
        table_proveedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_rif = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_razonsocial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmb_tipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmb_clasematerial = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmb_grupoarticulo = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        lbl_encabezadoalmacen2 = new javax.swing.JLabel();
        lbl_imagentimaca2 = new javax.swing.JLabel();
        bot_reiniciar = new javax.swing.JButton();
        bot_cerrar = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_proveedor.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        table_proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "RIF", "RAZÓN SOCIAL", "CIUDAD ", "ESTADO", "PAIS", "TIPO", "PERSONA CONTACTO", "CONTACTO TELEFÓNICO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_proveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_proveedor);
        if (table_proveedor.getColumnModel().getColumnCount() > 0) {
            table_proveedor.getColumnModel().getColumn(0).setMinWidth(0);
            table_proveedor.getColumnModel().getColumn(0).setPreferredWidth(0);
            table_proveedor.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 1320, 490));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("RIF");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txt_rif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rifKeyReleased(evt);
            }
        });
        getContentPane().add(txt_rif, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("RAZÓN SOCIAL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txt_razonsocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_razonsocialKeyReleased(evt);
            }
        });
        getContentPane().add(txt_razonsocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("TIPO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, -1, -1));

        cmb_tipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "LOCAL", "NACIONAL", "INTERNACIONAL" }));
        cmb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipoActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("CLASE DE MATERIAL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        cmb_clasematerial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmb_clasematerial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "LOCAL", "NACIONAL", "INTERNACIONAL" }));
        cmb_clasematerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_clasematerialActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_clasematerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 330, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("GRUPO DE ARTÍCULO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        cmb_grupoarticulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmb_grupoarticulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "LOCAL", "NACIONAL", "INTERNACIONAL" }));
        cmb_grupoarticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_grupoarticuloActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_grupoarticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 410, -1));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(null);

        lbl_encabezadoalmacen2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_encabezadoalmacen2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_encabezadoalmacen2.setText("CONSULTAR PROVEEDOR");
        jPanel7.add(lbl_encabezadoalmacen2);
        lbl_encabezadoalmacen2.setBounds(270, 20, 220, 29);

        lbl_imagentimaca2.setBackground(new java.awt.Color(204, 204, 204));
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
        bot_reiniciar.setBounds(1080, 20, 113, 33);
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
        bot_cerrar.setBounds(1200, 20, 101, 29);
        complemento.DisableBorderButton(bot_cerrar);

        lbl_usuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_usuario.setText("USUARIO");
        jPanel7.add(lbl_usuario);
        lbl_usuario.setBounds(710, 10, 280, 17);

        lbl_nombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_nombres.setText("NOMBRES");
        lbl_nombres.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(lbl_nombres);
        lbl_nombres.setBounds(710, 30, 280, 17);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jPanel5);
        jPanel5.setBounds(1041, 10, 0, 40);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_reiniciarActionPerformed
        frm_consultarproveedor frm = new frm_consultarproveedor();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bot_reiniciarActionPerformed

    private void bot_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_cerrarActionPerformed
        Integer resp = JOptionPane.showConfirmDialog(null, "ESTÁ SEGURO EN SALIR?");
        if (resp.equals(0)){
            this.dispose();
        }
    }//GEN-LAST:event_bot_cerrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ctrl_proveedor proveedor = new ctrl_proveedor(
             0,//id_proveedor
             "", //rif
             "", //nombre
             "", //direccion
             "", //ciudad 
             "", //estado
             "", //pais
             "", //codigopostal
             "", //tipo 
             "", //persona contacto
             "", //telefono 1
             "", //telefono 2
             "", //correo electronico
             "", //banco 1 
             "", //nrocuenta 1 
             "", //tipo cuenta 1
             "", //banco 2 
             "", //nrocuenta 2 
             "", //tipo cuenta 2
             "", //banco 3 
             "", //nrocuenta 3 
             "", //tipo cuenta 3
             0, //clase material     
             0, //grupo material 
             false   
         );

        proveedor.consultar_proveedor_todos(table_proveedor);
        
        ctrl_comun control = new ctrl_comun(9);
        cmb_clasematerial =  control.cargar_combo(cmb_clasematerial,"Seleccione...");
        
        control = new ctrl_comun(10);
        cmb_grupoarticulo =  control.cargar_combo(cmb_grupoarticulo,"Seleccione...");
 
    }//GEN-LAST:event_formWindowOpened

    private void txt_rifKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rifKeyReleased
               
        if (!txt_rif.getText().trim().equals("") && txt_rif.getText().trim().length() >=5){
           
                cmb_clasematerial.setSelectedIndex(0);
                cmb_grupoarticulo.setSelectedIndex(0);
                txt_razonsocial.setText("");
                cmb_tipo.setSelectedIndex(0);
                
            ctrl_proveedor proveedor = new ctrl_proveedor(
                0,//id_proveedor
                txt_rif.getText().trim(), //rif
                "", //nombre
                "", //direccion
                "", //ciudad 
                "", //estado
                "", //pais
                "", //codigopostal
                "", //tipo 
                "", //persona contacto
                "", //telefono 1
                "", //telefono 2
                "", //correo electronico
                "", //banco 1 
                "", //nrocuenta 1 
                "", //tipo cuenta 1
                "", //banco 2 
                "", //nrocuenta 2 
                "", //tipo cuenta 2
                "", //banco 3 
                "", //nrocuenta 3 
                "", //tipo cuenta 3
                0, //clase material     
                0, //grupo material 
                false       
            );
            
            proveedor.consultar_proveedores_rif(table_proveedor);
        }    
    }//GEN-LAST:event_txt_rifKeyReleased

    private void txt_razonsocialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_razonsocialKeyReleased
        if (!txt_razonsocial.getText().trim().equals("")){
           
                cmb_clasematerial.setSelectedIndex(0);
                cmb_grupoarticulo.setSelectedIndex(0);
                txt_rif.setText("");
                cmb_tipo.setSelectedIndex(0);
                
            ctrl_proveedor proveedor = new ctrl_proveedor(
                0,//id_proveedor
                "", //rif
                txt_razonsocial.getText().trim(), //nombre
                "", //direccion
                "", //ciudad 
                "", //estado
                "", //pais
                "", //codigopostal
                "", //tipo 
                "", //persona contacto
                "", //telefono 1
                "", //telefono 2
                "", //correo electronico
                "", //banco 1 
                "", //nrocuenta 1 
                "", //tipo cuenta 1
                "", //banco 2 
                "", //nrocuenta 2 
                "", //tipo cuenta 2
                "", //banco 3 
                "", //nrocuenta 3 
                "", //tipo cuenta 3
                0, //clase material     
                0, //grupo material 
                false       
            );
            
            proveedor.consultar_proveedores_razonsocial(table_proveedor);
        }    
    }//GEN-LAST:event_txt_razonsocialKeyReleased

    private void cmb_clasematerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_clasematerialActionPerformed
        if(evt.getModifiers() != 0){
            if (!cmb_clasematerial.getSelectedItem().toString().equals("Seleccione...")){

                cmb_tipo.setSelectedIndex(0);
                cmb_grupoarticulo.setSelectedIndex(0);
                txt_rif.setText("");
                txt_razonsocial.setText("");
                
                ctrl_proveedor proveedor = new ctrl_proveedor(
                     0,//id_proveedor
                     "", //rif
                     "", //nombre
                     "", //direccion
                     "", //ciudad 
                     "", //estado
                     "", //pais
                     "", //codigopostal
                     "", //tipo 
                     "", //persona contacto
                     "", //telefono 1
                     "", //telefono 2
                     "", //correo electronico
                     "", //banco 1 
                     "", //nrocuenta 1 
                     "", //tipo cuenta 1
                     "", //banco 2 
                     "", //nrocuenta 2 
                     "", //tipo cuenta 2
                     "", //banco 3 
                     "", //nrocuenta 3 
                     "", //tipo cuenta 3
                     Integer.parseInt(cmb_clasematerial.getSelectedItem().toString().substring(0,3).trim()), //clase material     
                     0, //grupo material 
                     false       
                 );
            
                proveedor.consultar_proveedores_clasematerial(table_proveedor);                
            }
        }
    }//GEN-LAST:event_cmb_clasematerialActionPerformed

    private void cmb_grupoarticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_grupoarticuloActionPerformed
        if(evt.getModifiers() != 0){
            if (!cmb_grupoarticulo.getSelectedItem().toString().equals("Seleccione...")){

                cmb_clasematerial.setSelectedIndex(0);
                cmb_tipo.setSelectedIndex(0);
                txt_rif.setText("");
                txt_razonsocial.setText("");
                
                ctrl_proveedor proveedor = new ctrl_proveedor(
                     0,//id_proveedor
                     "", //rif
                     "", //nombre
                     "", //direccion
                     "", //ciudad 
                     "", //estado
                     "", //pais
                     "", //codigopostal
                     "", //tipo 
                     "", //persona contacto
                     "", //telefono 1
                     "", //telefono 2
                     "", //correo electronico
                     "", //banco 1 
                     "", //nrocuenta 1 
                     "", //tipo cuenta 1
                     "", //banco 2 
                     "", //nrocuenta 2 
                     "", //tipo cuenta 2
                     "", //banco 3 
                     "", //nrocuenta 3 
                     "", //tipo cuenta 3
                     0, //clase material     
                     Integer.parseInt(cmb_grupoarticulo.getSelectedItem().toString().substring(0,3).trim()), //grupo material 
                     false       
                 );
            
                proveedor.consultar_proveedores_grupomaterial(table_proveedor);                
            }
        }
    }//GEN-LAST:event_cmb_grupoarticuloActionPerformed

    private void cmb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipoActionPerformed
         if(evt.getModifiers() != 0){
            if (!cmb_tipo.getSelectedItem().toString().equals("Seleccione...")){
 
                cmb_clasematerial.setSelectedIndex(0);
                cmb_grupoarticulo.setSelectedIndex(0);
                txt_rif.setText("");
                txt_razonsocial.setText("");
                
                ctrl_proveedor proveedor = new ctrl_proveedor(
                     0,//id_proveedor
                     "", //rif
                     "", //nombre
                     "", //direccion
                     "", //ciudad 
                     "", //estado
                     "", //pais
                     "", //codigopostal
                     cmb_tipo.getSelectedItem().toString(), //tipo 
                     "", //persona contacto
                     "", //telefono 1
                     "", //telefono 2
                     "", //correo electronico
                     "", //banco 1 
                     "", //nrocuenta 1 
                     "", //tipo cuenta 1
                     "", //banco 2 
                     "", //nrocuenta 2 
                     "", //tipo cuenta 2
                     "", //banco 3 
                     "", //nrocuenta 3 
                     "", //tipo cuenta 3
                     0, //clase material     
                     0, //grupo material 
                     false       
                 );
            
                proveedor.consultar_proveedores_tipo(table_proveedor);                
            }
        }
    }//GEN-LAST:event_cmb_tipoActionPerformed

    private void table_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_proveedorMouseClicked
        frm_consultadetalleproveedor frm = new frm_consultadetalleproveedor();
        frm.setVisible(true);
    }//GEN-LAST:event_table_proveedorMouseClicked

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
            java.util.logging.Logger.getLogger(frm_consultarproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_consultarproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_consultarproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_consultarproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_consultarproveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_cerrar;
    private javax.swing.JButton bot_reiniciar;
    private javax.swing.JComboBox<String> cmb_clasematerial;
    private javax.swing.JComboBox<String> cmb_grupoarticulo;
    private javax.swing.JComboBox<String> cmb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_encabezadoalmacen2;
    private javax.swing.JLabel lbl_imagentimaca2;
    private javax.swing.JLabel lbl_nombres;
    protected static javax.swing.JLabel lbl_usuario;
    protected static javax.swing.JTable table_proveedor;
    private javax.swing.JTextField txt_razonsocial;
    private javax.swing.JTextField txt_rif;
    // End of variables declaration//GEN-END:variables
}