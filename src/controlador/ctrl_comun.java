/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import view.funciones;

/**
 *
 * @author ruben
 */
public class ctrl_comun {
    
    Integer consulta;
    String sql;

    public ctrl_comun(Integer consulta) {
        
        switch (consulta) {
            case 1: sql="select id_almacen,codigo_almacen,tipo from tbl_almacen;"; 
                    break;
            case 2: sql="select id_area,descripcion from tbl_area;"; 
                    break;
            case 3: sql="select id_clasematerial,codigo_material,descripcion from tbl_clasematerial;"; 
                    break;    
            case 4: sql="select id_empresa,descripcion from tbl_empresa;"; 
                    break;  
            case 5: sql="select id_grupomaterial,descripcion from tbl_grupomaterial;"; 
                    break;  
            case 6: sql="select id_moneda,codigo_moneda from tbl_moneda;"; 
                    break;   
            case 7: sql="select id_proyecto,descripcion,id_codproyecto,fecha_inicio,fecha_fin from tbl_proyecto;"; 
                    break;  
            case 8: sql="select id_perfil,CONCAT(descripcion,'-',abreviatura) from tbl_perfil;"; 
                    break;  
            case 9: sql="select id_clasematerial,descripcion from tbl_clasematerial;"; 
                    break;  
            case 10: sql="select id_grupomaterial,descripcion from tbl_grupomaterial;"; 
                    break;   
            case 11: sql="select id_tiposolicitud,descripcion from tbl_tiposolicitud;"; 
                    break;
            case 12: sql="select id_valoracion,descripcion from tbl_valoracion;"; 
                    break; 
            case 13: sql="select id_umb,codigo_umb from tbl_umb;"; 
                    break; 
            case 14: sql="select id_ubicacion,codigo_ubicacion,descripcion from tbl_ubicacion;"; 
                    break;    
            case 15: sql="select id_procedencia,descripcion from tbl_procedencia;"; 
                    break;
            case 16: sql="select id_area,descripcion from tbl_area where id_area != 0;"; 
                    break;  
            case 17: sql = "SELECT id_proveedor,nombre FROM tbl_proveedor WHERE nombre != '';";        
                    break; 
            case 18: sql = "SELECT id_motivo,descripcion FROM tbl_motivodevolucion;";        
                    break;         
        }
        
             
    }
    
     
    
    
     public JComboBox cargar_combo(JComboBox combo,String pordefecto){
        String cadena;
        
        
        combo.removeAllItems();
        combo.addItem("Seleccione...");
        cadena = "";
       
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    if(!cnn.rs.getString(2).trim().equals("Cadena")){
                        if (!cnn.rs.getString(2).trim().equals("")){
                            cadena = String.valueOf(cnn.rs.getInt(1)) + "  -  " + cnn.rs.getString(2).trim();
                        }
                        else{
                            cadena = String.valueOf(cnn.rs.getInt(1));
                        }
                        
                    }
                    else{
                        cadena = String.valueOf(cnn.rs.getString(1));
                    }
                    combo.addItem(cadena); 
                    
                    if (cnn.rs.getString(2).trim().equals(pordefecto)){
                        combo.setSelectedItem(cadena);
                    }
                }
                cnn.cerrar();
                return combo;
            } 
            catch (SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                return combo;
            }    
        }   
        else{
             cnn.cerrar();
             return combo;
        }
    }
    
    public JComboBox cargar_combo_mes(JComboBox combo,String sql,String pordefecto){
        String cadena;
        
        
        combo.removeAllItems();
        combo.addItem("Seleccione...");
        cadena = "";
       
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    cadena = String.valueOf(cnn.rs.getInt(1));
                
                    combo.addItem(funciones.descripcion_mes(cadena)); 
                }    
                         
                combo.setSelectedItem("Seleccione...");
                cnn.cerrar();
                return combo;
            } 
            catch (SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                return combo;
            }    
        }   
        else{
             cnn.cerrar();
             return combo;
        }
    }
}
