/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.class_umb;

/**
 *
 * @author ruben
 */
public class ctrl_umb {
    class_umb umb;
    private String sql;
    
    
    public ctrl_umb(Integer id_umb, String cod_umb, String descripcionumb) {
        umb = new class_umb(id_umb,cod_umb,descripcionumb);
        sql = "";
    }
    
    
    public class_umb actualizar_umb_detalle(){
        
             
        buscar_sql(4);   
        conexion cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DE LA UNIDAD DE MEDIDA SATISFACTORIA");
            cnn.cerrar();
            umb.setStatus(true);
            return umb;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN  DE LA UNIDAD DE MEDIDA ");
            cnn.cerrar();
            umb.setStatus(false);
            return umb;
        }
       
    }
    
    
    public class_umb actualizar_umb(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "LA UNIDAD DE MEDIDA EXISTE EN LA BASE DE DATOS");    
                    umb.setStatus(true);
                    cnn.cerrar(); 
                    return umb;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                umb.setStatus(false);
                return umb;
            }    
         }   
        else{
             cnn.cerrar();
             umb.setStatus(false);
             return umb;
        }
        
        
        buscar_sql(1);
        
          
        cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DE LA UNIDAD DE MEDIDA SATISFACTORIA");
             cnn.cerrar();
             umb.setStatus(true);
             return umb;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DE LA UNIDAD DE MEDIDA");
            cnn.cerrar();
            umb.setStatus(true);
            return umb;
        }
               
       
    }
    
    public class_umb buscaridumb(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "LA UNIDAD DE MEDIDA EXISTE EN LA BASE DE DATOS");    
                    umb.setStatus(false);
                    cnn.cerrar(); 
                    return umb;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                umb.setStatus(true);
                return umb;
            }    
         }   
        else{
             cnn.cerrar();
             umb.setStatus(true);
             return umb;
        }
        
        umb.setStatus(true);
        cnn.cerrar(); 
        return umb;
         
       
    }
    
        
    
    public void consulta_umb(JTable tabla){
        Integer i;
        
        buscar_sql(2);
        
        conexion cnn = new conexion(sql,"buscar");
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        for(i = modelotabla.getRowCount()-1; i >=0 ;i--){
            modelotabla.removeRow(i);
            tabla.revalidate();
        } 
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                        //cnn.rs.getInt(1),
                        cnn.rs.getString(2),
                        cnn.rs.getString(3)
                     });
                }
                cnn.cerrar();
            } 
            catch (SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
            }    
        }   
        else{
             cnn.cerrar();
        }
        
        
    }
    
    public class_umb buscardescripcion(){
        
        buscar_sql(5);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                        
                    umb.setDescripcionumb(cnn.rs.getString(3));
                    cnn.cerrar(); 
                    return umb;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                umb.setStatus(true);
                return umb;
            }    
         }   
        else{
             cnn.cerrar();
             umb.setStatus(true);
             return umb;
        }
        
        umb.setStatus(true);
        cnn.cerrar(); 
        return umb;
         
       
    }
    
    
    public void buscar_sql(Integer consulta) {
        
        
        switch (consulta){
            case 1:
                 sql = "INSERT INTO tbl_umb VALUES(DEFAULT,'" + umb.getCod_umb() + "','"  + umb.getDescripcionumb() + "');";
       
                break;  
            case 2:
                sql = "SELECT id_umb,codigo_umb,descripcion FROM tbl_umb;"; 
       
                break;    
                
            case 3:
                sql = "SELECT codigo_umb FROM tbl_umb WHERE codigo_umb = '" + umb.getCod_umb() + "';"; 
                                
                break;    
            
            case 4: 
                sql = "UPDATE tbl_umb SET codigo_umb = '" + umb.getCod_umb() + "',descripcion='" + umb.getDescripcionumb() +  "' WHERE id_umb = " + umb.getId_umb() + ";";    
                break;
                
            case 5:
                sql = "SELECT id_umb,codigo_umb,descripcion FROM tbl_umb WHERE id_umb = " + umb.getId_umb() + ";";    
       
                break; 
                
        }
       
         
    }
}
