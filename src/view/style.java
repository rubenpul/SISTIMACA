/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;


/**
 *
 * @author ROBERT
 */

//
public class style {
    
    
    // Desactiva Borde de Botones
     public static void DisableBorderButton(javax.swing.JButton modelo){
        modelo.setContentAreaFilled(false);
        modelo.setBorder(null);
     }
     
    
     // Desactiva Fondo de Botones
     public static void DisableWel(javax.swing.JButton modelo){
        modelo.setContentAreaFilled(false);
        modelo.setBorder(BorderFactory.createLineBorder(new Color(0,183,220)));
        modelo.setForeground(new Color(0, 183, 220));
        modelo.setHorizontalTextPosition(SwingConstants.CENTER);
        modelo.setVerticalTextPosition(SwingConstants.BOTTOM);
        modelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
     }

     
     
}
