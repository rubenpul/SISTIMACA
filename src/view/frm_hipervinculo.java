/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author ruben
 */
public class frm_hipervinculo extends javax.swing.JFrame {

    /**
     * Creates new form frm_hipervinculo
     */
    public frm_hipervinculo() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_preciounitario1 = new javax.swing.JTextField();
        txt_total1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_preciounitario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_preciounitario1KeyReleased(evt);
            }
        });
        getContentPane().add(txt_preciounitario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 105, 160, -1));
        getContentPane().add(txt_total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_preciounitario1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_preciounitario1KeyReleased
      String monto = null;
      String otromonto = "0,55";
     
           
      /*DecimalFormatSymbols dfs = new DecimalFormatSymbols( Locale.getDefault());
      JOptionPane.showMessageDialog(null,dfs.getDecimalSeparator());*/
     
      otromonto = otromonto.replace(",",".");
      
  //      if ( ( (evt.getKeyCode() >= 48 ) && (evt.getKeyCode() <= 57 ) ) || ( (evt.getKeyCode() >= 37 ) && (evt.getKeyCode() <= 40 ) ) || ((evt.getKeyCode() >= 96 ) && (evt.getKeyCode() <= 105 )) || (evt.getKeyCode() == 144) || (evt.getKeyCode() == 127) || (evt.getKeyCode() == 8)  || (evt.getKeyCode() == 10) || (evt.getKeyCode() == 44)){       
            
            monto = String.valueOf(Math.rint((Double.parseDouble(funciones.separadormilesflotante(txt_preciounitario1.getText().trim(),false)) * Double.parseDouble(otromonto))*100)/100);
            
            monto = monto.replace(".",",");
            
            txt_total1.setText(monto);
            
            txt_preciounitario1.setText(funciones.separadormilesflotante(txt_preciounitario1.getText().trim(),true));
            txt_total1.setText(funciones.separadormilesflotante(txt_total1.getText().trim(),true));
        
 /*       }
        else{
            
                JOptionPane.showMessageDialog(null, "CARÁCTER NO VÁLIDO. SOLO NÚMEROS (1..9)", "SISTIMACA - USUARIO", JOptionPane.ERROR_MESSAGE,null);
                txt_preciounitario1.setText("");
                txt_total1.setText("");
               
        } */  
        
        
    }//GEN-LAST:event_txt_preciounitario1KeyReleased

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
            java.util.logging.Logger.getLogger(frm_hipervinculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_hipervinculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_hipervinculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_hipervinculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_hipervinculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField txt_preciounitario1;
    private javax.swing.JTextField txt_total1;
    // End of variables declaration//GEN-END:variables
}
