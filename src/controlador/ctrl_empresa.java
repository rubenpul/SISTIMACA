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
import model.class_empresa;

/**
 *
 * @author ruben
 */
public class ctrl_empresa {
    class_empresa empresa;
    private String sql;
    
    
    public ctrl_empresa(Integer id_empresa, String descripcionempresa,Integer id_empresa_otro) {
        empresa = new class_empresa(id_empresa,descripcionempresa,id_empresa_otro);
        sql = "";
    }
    
    
    public class_empresa actualizar_empresa_detalle(){
        
             
        buscar_sql(4);   
        conexion cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DE LA EMPRESA SATISFACTORIA");
            cnn.cerrar();
            empresa.setStatus(true);
            return empresa;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN  DE LA EMPRESA ");
            cnn.cerrar();
            empresa.setStatus(false);
            return empresa;
        }
       
    }
    
    
    public class_empresa actualizar_empresa(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "LA EMPRESA EXISTE EN LA BASE DE DATOS");    
                    empresa.setStatus(true);
                    cnn.cerrar();
                    return empresa;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                empresa.setStatus(false);
                return empresa;
            }    
         }   
        else{
             cnn.cerrar();
             empresa.setStatus(false);
             return empresa;
        }
        
        
        buscar_sql(1);
        
          
        cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DE LA EMPRESA SATISFACTORIA");
             cnn.cerrar();
             empresa.setStatus(true);
             return empresa;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DE LA EMPRESA");
            cnn.cerrar();
            empresa.setStatus(true);
            return empresa;
        }
               
       
    }
    
    public class_empresa buscaridempresa(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "LA EMPRESA EXISTE EN LA BASE DE DATOS");    
                    empresa.setStatus(false);
                    cnn.cerrar();
                    return empresa;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                empresa.setStatus(true);
                return empresa;
            }    
         }   
        else{
             cnn.cerrar();
             empresa.setStatus(true);
             return empresa;
        }
        
        empresa.setStatus(true);
        return empresa;
         
       
    }
    
        
    
    public void consulta_empresa(JTable tabla){
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
    
    
    public void buscar_sql(Integer consulta) {
        
        
        switch (consulta){
            case 1:
                 sql = "INSERT INTO tbl_empresa VALUES(" + empresa.getId_empresa() + ",'"  + empresa.getDescripcionempresa() + "');";
       
                break;  
            case 2:
                sql = "SELECT id_empresa,descripcion FROM tbl_empresa;"; 
       
                break;    
                
            case 3:
                sql = "SELECT id_empresa FROM tbl_empresa WHERE id_empresa = " + empresa.getId_empresa() + ";"; 
                                
                break;    
            
            case 4: 
                sql = "UPDATE tbl_empresa SET id_empresa =" + empresa.getId_empresa() + ",descripcion='" + empresa.getDescripcionempresa() +  "' WHERE id_empresa = " + empresa.getId_empresa_alter() + ";";    
                break;
                
            case 5:
                //sql = "SELECT tipo FROM tbl_almacen WHERE id_almacen = " + almacen.getId_almacen() + ";";
                break;
                
        }
    } 
}
