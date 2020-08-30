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
import model.class_clasematerial;

/**
 *
 * @author ruben
 */
public class ctrl_clasematerial {
    class_clasematerial clasematerial;
    private String sql;
    
    
    public ctrl_clasematerial(Integer id_clasematerial, String codigo_material,String descripcionclasematerial,Integer id_clasematerial_otro) {
        clasematerial = new class_clasematerial(id_clasematerial,codigo_material,descripcionclasematerial,id_clasematerial_otro);
        sql = "";
    }
    
    
    public class_clasematerial actualizar_clasematerial_detalle(){
        
             
        buscar_sql(4);   
        conexion cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DE LA CLASE DE MATERIAL SATISFACTORIA");
            cnn.cerrar();
            clasematerial.setStatus(true);
            return clasematerial;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN  DE LA CLASE DE MATERIAL ");
            cnn.cerrar();
            clasematerial.setStatus(false);
            return clasematerial;
        }
       
    }
    
    
    public class_clasematerial actualizar_clasematerial(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "LA CLASE DE MATERIAL EXISTE EN LA BASE DE DATOS");    
                    clasematerial.setStatus(true);
                    cnn.cerrar();
                    return clasematerial;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                clasematerial.setStatus(false);
                return clasematerial;
            }    
         }   
        else{
             cnn.cerrar();
             clasematerial.setStatus(false);
             return clasematerial;
        }
        
        
        buscar_sql(1);
        
          
        cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DE LA CLASE DE MATERIAL SATISFACTORIA");
             cnn.cerrar();
             clasematerial.setStatus(true);
             return clasematerial;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DE LA CLASE DE MATERIAL");
            cnn.cerrar();
            clasematerial.setStatus(true);
            return clasematerial;
        }
               
       
    }
    
    public class_clasematerial buscaridclasematerial(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "LA CLASE DE MATERIAL EXISTE EN LA BASE DE DATOS");    
                    clasematerial.setStatus(false);
                    cnn.cerrar();
                    return clasematerial;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                clasematerial.setStatus(true);
                return clasematerial;
            }    
         }   
        else{
             cnn.cerrar();
             clasematerial.setStatus(true);
             return clasematerial;
        }
        
        clasematerial.setStatus(true);
        return clasematerial;
         
       
    }
    
        
    
    public void consulta_clasematerial(JTable tabla){
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
    
    public void consulta_clasematerial_proveedor(JTable tabla){
        Integer i;
        
        buscar_sql(5);
        
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
                        false,
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
                 sql = "INSERT INTO tbl_clasematerial VALUES(DEFAULT,'" + clasematerial.getCodigo_clasematerial() + "','"  + clasematerial.getDescripcionclasematerial().toUpperCase() + "');";
       
                break;  
            case 2:
                sql = "SELECT codigo_material,descripcion FROM tbl_clasematerial;"; 
       
                break;    
                
            case 3:
                sql = "SELECT codigo_material FROM tbl_clasematerial WHERE codigo_material = '" + clasematerial.getCodigo_clasematerial() + "';"; 
                                
                break;    
            
            case 4: 
                sql = "UPDATE tbl_clasematerial SET codigo_material ='" + clasematerial.getCodigo_clasematerial() + "',descripcion='" + clasematerial.getDescripcionclasematerial().toUpperCase() +  "' WHERE id_clasematerial = " + clasematerial.getId_clasematerial_alter() + ";";    
                break;
                
            case 5:
               sql = "SELECT id_clasematerial,codigo_material,descripcion FROM tbl_clasematerial;"; 
       
                break;
                
        }
       
         
    }
}
