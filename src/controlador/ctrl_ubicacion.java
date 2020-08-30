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
import model.class_ubicacion;

/**
 *
 * @author ruben
 */
public class ctrl_ubicacion {
    class_ubicacion ubicacion;
    private String sql;
    
    
    public ctrl_ubicacion(Integer id_ubicacion, String cod_ubicacion, String descripcionubicacion) {
        ubicacion = new class_ubicacion(id_ubicacion,cod_ubicacion,descripcionubicacion);
        sql = "";
    }
    
    
    public class_ubicacion actualizar_ubicacion_detalle(){
        
             
        buscar_sql(4);   
        conexion cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DE LA UBICACION SATISFACTORIA");
            cnn.cerrar();
            ubicacion.setStatus(true);
            return ubicacion;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN  DE LA UBICACION ");
            cnn.cerrar();
            ubicacion.setStatus(false);
            return ubicacion;
        }
       
    }
    
    
    public class_ubicacion actualizar_ubicacion(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "LA UBICACION EXISTE EN LA BASE DE DATOS");    
                    ubicacion.setStatus(true);
                    cnn.cerrar(); 
                    return ubicacion;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                ubicacion.setStatus(false);
                return ubicacion;
            }    
         }   
        else{
             cnn.cerrar();
             ubicacion.setStatus(false);
             return ubicacion;
        }
        
        
        buscar_sql(1);
        
          
        cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DE LA UBICACION SATISFACTORIA");
             cnn.cerrar();
             ubicacion.setStatus(true);
             return ubicacion;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DE LA UBICACION");
            cnn.cerrar();
            ubicacion.setStatus(true);
            return ubicacion;
        }
               
       
    }
    
    public class_ubicacion buscaridubicacion(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "LA UBICACION EXISTE EN LA BASE DE DATOS");    
                    ubicacion.setStatus(false);
                    cnn.cerrar(); 
                    return ubicacion;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                ubicacion.setStatus(true);
                return ubicacion;
            }    
         }   
        else{
             cnn.cerrar();
             ubicacion.setStatus(true);
             return ubicacion;
        }
        
        ubicacion.setStatus(true);
        cnn.cerrar(); 
        return ubicacion;
         
       
    }
    
        
    
    public void consulta_ubicacion(JTable tabla){
        Integer i;
        
        buscar_sql(2);
        
        conexion cnn = new conexion(sql,"buscar");
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
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
    
    public Integer buscar_ubicacion(){
        Integer ubicacion;
        
        buscar_sql(5);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    ubicacion = cnn.rs.getInt(1);
                    cnn.cerrar(); 
                    return ubicacion;
                }
                else{
                    cnn.cerrar(); 
                    return 0;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                return 0;
            }    
         }   
        else{
             cnn.cerrar();
             return 0;
        }
    }
    
    public void consulta_ubicacion_codigo(JTable tabla){
        Integer i;
        
        buscar_sql(6);
        
        conexion cnn = new conexion(sql,"buscar");
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
                
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getString(1),
                        cnn.rs.getString(2)
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
    
    public void consulta_ubicacion_descripcion(JTable tabla){
        Integer i;
        
        buscar_sql(7);
        
        conexion cnn = new conexion(sql,"buscar");
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
                
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getString(1),
                        cnn.rs.getString(2)
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
    
    
    public void buscar_sql(Integer consulta) {
        
        
        switch (consulta){
            case 1:
                 sql = "INSERT INTO tbl_ubicacion VALUES(DEFAULT,'" + ubicacion.getCod_ubicacion().toUpperCase() + "','"  + ubicacion.getDescripcionubicacion().toUpperCase() + "');";
       
                break;  
            case 2:
                sql = "SELECT id_ubicacion,codigo_ubicacion,descripcion FROM tbl_ubicacion;"; 
       
                break;    
                
            case 3:
                sql = "SELECT codigo_ubicacion FROM tbl_ubicacion WHERE codigo_ubicacion = '" + ubicacion.getCod_ubicacion().trim() + "';"; 
                                
                break;    
            
            case 4: 
                sql = "UPDATE tbl_ubicacion SET codigo_ubicacion = '" + ubicacion.getCod_ubicacion().toUpperCase() + "',descripcion='" + ubicacion.getDescripcionubicacion().toUpperCase() +  "' WHERE id_ubicacion = " + ubicacion.getId_ubicacion() + ";";    
                break;
                
            case 5:
                sql = "SELECT id_ubicacion,codigo_ubicacion FROM tbl_ubicacion WHERE codigo_ubicacion = '" + ubicacion.getCod_ubicacion().trim() + "';"; 
                                
                break;  
            
            case 6:
                sql = "SELECT codigo_ubicacion,descripcion FROM tbl_ubicacion WHERE codigo_ubicacion LIKE '%" + ubicacion.getCod_ubicacion().trim() + "%';"; 
                                
                break;      
             
            case 7:
                sql = "SELECT codigo_ubicacion,descripcion FROM tbl_ubicacion WHERE descripcion LIKE '%" + ubicacion.getDescripcionubicacion().trim() + "%';"; 
                                
                break;     
                
          
                
        }
       
         System.out.println(sql); 
    }
}
