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
import model.class_area;
import model.class_usuario;

/**
 *
 * @author ruben
 */
public class ctrl_area {
 
    class_area area;
    ctrl_usuario responsable;
    private String sql;
    
    
    public ctrl_area(Integer id_area, String descripcionarea,Integer cedularesponsable, Integer id_area_otro) {
        area = new class_area(id_area,descripcionarea,id_area_otro);
        responsable = new ctrl_usuario(cedularesponsable,"","", "","",0,"",0,"",0,false,"");
        sql = "";
    }
    
     public String buscarnombreresponsable(){
        class_usuario modelo_usuario= null;
        
        modelo_usuario = responsable.buscar_usuario();
        
        return modelo_usuario.getNombres();
        
    }
    
    public class_area actualizar_area_detalle(){
        
             
        buscar_sql(4);   
        conexion cnn = new conexion(sql,"");
        
        if (cnn.estado){
            cnn.cerrar();
            buscar_sql(6);   
            cnn = new conexion(sql,"");
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DEL ÁREA SATISFACTORIA");
            cnn.cerrar();
            area.setStatus(true);
            return area;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN  DEL ÁREA ");
            cnn.cerrar();
            area.setStatus(false);
            return area;
        }
       
    }
    
    
    public class_area actualizar_area(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "EL ÁREA EXISTE EN LA BASE DE DATOS");    
                    area.setStatus(true);
                    cnn.cerrar();
                    return area;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                area.setStatus(false);
                return area;
            }    
         }   
        else{
             cnn.cerrar();
             area.setStatus(false);
             return area;
        }
        
        
        buscar_sql(1);
        
          
        cnn = new conexion(sql,"");
        
        if (cnn.estado){
            cnn.cerrar();
            /*buscar_sql(5);
            cnn = new conexion(sql,"");*/
            
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DEL ÁREA SATISFACTORIA");
            /* cnn.cerrar();*/
             area.setStatus(true);
             return area;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL ÁREA");
            cnn.cerrar();
            area.setStatus(true);
            return area;
        }
               
       
    }
    
    public class_area buscaridarea(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "EL ÁREA EXISTE EN LA BASE DE DATOS");    
                    area.setStatus(false);
                    cnn.cerrar();
                    return area;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                area.setStatus(true);
                return area;
            }    
         }   
        else{
             cnn.cerrar();
             area.setStatus(true);
             return area;
        }
        
        area.setStatus(true);
        return area;
         
       
    }
    
        
    
    public void consulta_area(JTable tabla){
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
                        //cnn.rs.getString(3)
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
                 sql = "INSERT INTO tbl_area VALUES(" + area.getId_area() + ",'"  + area.getDescripcionarea().toUpperCase() + "');";
       
                break;  
            case 2:
                sql = "SELECT id_area,descripcion ";
                sql +=      "FROM tbl_area;  ";
       
                break;    
                
            case 3:
                sql = "SELECT id_area FROM tbl_area WHERE id_area = " + area.getId_area() + ";"; 
                                
                break;    
            
            case 4: 
                sql = "UPDATE tbl_area SET id_area =" + area.getId_area() + ",descripcion='" + area.getDescripcionarea().toUpperCase() +  "' WHERE id_area = " + area.getId_area_alter() + ";";    
                break;
                
            /*case 5:
                sql = "INSERT INTO tbl_responsable_area VALUES(" + area.getId_area() + ",'"  +  responsable.usuario.getCedula() + "');";
                break;*/
            /*case 6:
                sql = "UPDATE tbl_responsable_area SET fk_usuario = " + responsable.usuario.getCedula() + " WHERE fk_area = " + area.getId_area() + ";";
               
                break; */       
                
        }
       
         
    }
    
}
