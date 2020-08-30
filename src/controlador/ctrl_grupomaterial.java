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
import model.class_grupomaterial;

/**
 *
 * @author ruben
 */
public class ctrl_grupomaterial {
      class_grupomaterial grupomaterial;
    private String sql;
    
    
    public ctrl_grupomaterial(Integer id_grupomaterial, String descripciongrupomaterial,Integer id_grupomaterial_otro) {
        grupomaterial = new class_grupomaterial(id_grupomaterial,descripciongrupomaterial,id_grupomaterial_otro);
        sql = "";
    }
    
    
    public class_grupomaterial actualizar_grupomaterial_detalle(){
        
             
        buscar_sql(4);   
        conexion cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DE LA GRUPO DE MATERIAL SATISFACTORIA");
            cnn.cerrar();
            grupomaterial.setStatus(true);
            return grupomaterial;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN  DEL GRUPO DE MATERIAL ");
            cnn.cerrar();
            grupomaterial.setStatus(false);
            return grupomaterial;
        }
       
    }
    
    
    public class_grupomaterial actualizar_grupomaterial(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "EL GRUPO DE ARTÍCULO EXISTE EN LA BASE DE DATOS");    
                    cnn.cerrar();  
                    grupomaterial.setStatus(true);
                    return grupomaterial;
                }
                cnn.cerrar(); 
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                grupomaterial.setStatus(false);
                return grupomaterial;
            }    
         }   
        else{
             cnn.cerrar();
             grupomaterial.setStatus(false);
             return grupomaterial;
        }
        
        
        buscar_sql(1);
        
        cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DEL GRUPO DE ARTÍCULO SATISFACTORIA");
             cnn.cerrar();
             grupomaterial.setStatus(true);
             return grupomaterial;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL GRUPO DE ARTÍCULO");
            cnn.cerrar();
            grupomaterial.setStatus(true);
            return grupomaterial;
        }
               
       
    }
    
    public class_grupomaterial buscaridgrupomaterial(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "EL GRUPO DE ARTÍCULO EXISTE EN LA BASE DE DATOS");    
                    cnn.cerrar();  
                    grupomaterial.setStatus(false);
                    return grupomaterial;
                }
                cnn.cerrar(); 
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                grupomaterial.setStatus(true);
                return grupomaterial;
            }    
         }   
        else{
             cnn.cerrar();
             grupomaterial.setStatus(true);
             return grupomaterial;
        }
        
        grupomaterial.setStatus(true);
        return grupomaterial;
         
       
    }
    
        
    
    public void consulta_grupomaterial(JTable tabla){
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
                        cnn.rs.getInt(1),
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
    
    public void consulta_grupomaterial_proveedor(JTable tabla){
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
                        false,
                        cnn.rs.getInt(1),
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
                 sql = "INSERT INTO tbl_grupomaterial VALUES(" + grupomaterial.getId_grupomaterial() + ",'"  + grupomaterial.getDescripciongrupomaterial().toUpperCase() + "');";
       
                break;  
            case 2:
                sql = "SELECT id_grupomaterial,descripcion FROM tbl_grupomaterial;"; 
       
                break;    
                
            case 3:
                sql = "SELECT id_grupomaterial FROM tbl_grupomaterial WHERE id_grupomaterial = " + grupomaterial.getId_grupomaterial() + ";"; 
                                
                break;    
            
            case 4: 
                sql = "UPDATE tbl_grupomaterial SET id_grupomaterial =" + grupomaterial.getId_grupomaterial() + ",descripcion='" + grupomaterial.getDescripciongrupomaterial().toUpperCase() +  "' WHERE id_grupomaterial = " + grupomaterial.getId_grupomaterial_alter() + ";";    
                break;
                
            case 5:
                //sql = "SELECT tipo FROM tbl_almacen WHERE id_almacen = " + almacen.getId_almacen() + ";";
                break;
                
        }
       
         
    }
}
