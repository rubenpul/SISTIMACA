/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import model.TransaccionThread;

/**
 *
 * @author ruben
 */
public class frm_progressreporte extends javax.swing.JFrame {

    private Timer t;
    private final ActionListener ac;
    private int x = 0;
    
    
    public frm_progressreporte(Integer proceso,Integer tiempo) {
        initComponents();
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setTitle("CARGANDO REPORTE...");
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(funciones.logoempresa()).getImage());
       
        ImageIcon icon = new ImageIcon("\\\\192.168.0.3\\dist\\imagenes\\loading.gif");
        //ImageIcon icon = new ImageIcon("C:\\Users\\ruben\\Desktop\\loading.gif");
        
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lbl_gif.getWidth(), lbl_gif.getHeight(), Image.SCALE_DEFAULT));
                     
        lbl_gif.setIcon(icono);
        
        TransaccionThread tr = new TransaccionThread(proceso);
        Thread hilo = new Thread (tr);
	hilo.start();
        
        ac = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(hilo.isAlive()){
                    x = x + 1;
                    bar_progress.setValue(x);
                }
                else{
                    bar_progress.setValue(100);
                    dispose();
                    t.stop();
                } 
            }
            
        };
        
        t = new Timer(tiempo,ac);
        t.start();

       

       
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        lbl_imagentimaca2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bar_progress = new javax.swing.JProgressBar();
        lbl_gif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(451, 369));
        setPreferredSize(new java.awt.Dimension(379, 312));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(null);

        lbl_imagentimaca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TIMACA.png"))); // NOI18N
        jPanel7.add(lbl_imagentimaca2);
        lbl_imagentimaca2.setBounds(10, 0, 240, 60);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jPanel3);
        jPanel3.setBounds(1270, 10, 0, 40);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 60));
        getContentPane().add(bar_progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 360, -1));
        getContentPane().add(lbl_gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 430, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 
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
            java.util.logging.Logger.getLogger(frm_progressreporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_progressreporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_progressreporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_progressreporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_progressreporte(0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar_progress;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl_gif;
    private javax.swing.JLabel lbl_imagentimaca2;
    // End of variables declaration//GEN-END:variables
}
