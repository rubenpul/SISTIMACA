/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RenderTable;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author ruben
 */
public class RenderTablaMaestroMaterial extends DefaultTableCellRenderer {

	public Component getTableCellRendererComponent(JTable table,
		Object value, boolean isSelected, boolean hasFocus, int row,
		int column) {

		JLabel cell = (JLabel) super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);

		//if(value instanceof String){
		//	String valor = (String) value;
			if(column==8){
				
                            cell.setBackground(Color.LIGHT_GRAY);
					
			}
                        else{
                            if (isSelected){
                                cell.setBackground(Color.BLUE);
                            }
                            else{
                                if(column==8){
				
                                    cell.setBackground(Color.LIGHT_GRAY);
					
                                }
                                else{
                                    cell.setBackground(Color.WHITE);
                                }
                            }
                        }
                            
                        
		//}
		
		return cell;
        }            
}
