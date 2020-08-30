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
import model.class_almacen;

/**
 *
 * @author ruben
 */
public class ctrl_almacen {
 
    class_almacen almacen;
    private String sql;
    
    
    public ctrl_almacen(Integer id_almacen,String codigo_almacen, String descripcion, String tipo,Integer id_almacen_otro) {
        almacen = new class_almacen(id_almacen,codigo_almacen,descripcion,tipo,id_almacen_otro);
        sql = "";
    }
    
    
    
    public String consulta_tipoalmacen(){
        
        buscar_sql(5);   
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                               
                    almacen.setTipo(cnn.rs.getString(1));
                    cnn.cerrar();
                    return almacen.getTipo();
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                return "Seleccione...";
            }    
         }   
        else{
             cnn.cerrar();
             return "Seleccione...";
        }
        
        return "Seleccione...";
    }
    
    public class_almacen actualizar_almacen_detalle(){
        
             
        buscar_sql(4);   
        conexion cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DEL ALMACÉN SATISFACTORIA");
            cnn.cerrar();
            almacen.setStatus(true);
            return almacen;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN  DEL ALMACÉN ");
            cnn.cerrar();
            almacen.setStatus(false);
            return almacen;
        }
       
    }
    
    
    public class_almacen actualizar_almacen(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "EL ALMACÉN EXISTE EN LA BASE DE DATOS");    
                    almacen.setStatus(true);
                    cnn.cerrar();
                    return almacen;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                almacen.setStatus(false);
                return almacen;
            }    
         }   
        else{
             cnn.cerrar();
             almacen.setStatus(false);
             return almacen;
        }
        
        
        buscar_sql(1);
        
          
        cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DEL ALMACÉN SATISFACTORIA");
             cnn.cerrar();
             almacen.setStatus(true);
             return almacen;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL ALMACÉN");
            cnn.cerrar();
            almacen.setStatus(true);
            return almacen;
        }
               
       
    }
    
    public class_almacen buscaridalmacen(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "EL ALMACÉN EXISTE EN LA BASE DE DATOS");    
                    almacen.setStatus(false);
                    cnn.cerrar();
                    return almacen;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                almacen.setStatus(true);
                return almacen;
            }    
         }   
        else{
             cnn.cerrar();
             almacen.setStatus(true);
             return almacen;
        }
        
        almacen.setStatus(true);
        return almacen;
         
       
    }
    
        
    
    public void consulta_almacen(JTable tabla){
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
                        cnn.rs.getString(1),
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
    
    
    public void buscar_sql(Integer consulta) {
        
        
        switch (consulta){
            case 1:
                 sql = "INSERT INTO tbl_almacen VALUES(DEFAULT,'" + almacen.getCodigo_almacen()  + "','" + almacen.getDescripcion() + "','" + almacen.getTipo() + "');";
       
                break;  
            case 2:
                sql = "SELECT codigo_almacen,descripcion,tipo FROM tbl_almacen;"; 
       
                break;    
                
            case 3:
                sql = "SELECT codigo_almacen FROM tbl_almacen WHERE codigo_almacen = '" + almacen.getCodigo_almacen() + "';"; 
                                
                break;    
            
            case 4: 
                sql = "UPDATE tbl_almacen SET codigo_almacen = '" + almacen.getCodigo_almacen() + "',descripcion='" + almacen.getDescripcion() +  "', tipo='" + almacen.getTipo() +  "' WHERE id_almacen = " + almacen.getId_almacen() + ";";    
                break;
                
            case 5:
                sql = "SELECT tipo FROM tbl_almacen WHERE codigo_almacen = '" + almacen.getCodigo_almacen() + "';";
                break;
                
        }
       
         
    }
    
    
    
    
}
