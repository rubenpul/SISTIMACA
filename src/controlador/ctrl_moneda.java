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
import model.class_moneda;

/**
 *
 * @author ruben
 */
public class ctrl_moneda {
    class_moneda moneda;
    private String sql;
    
    
    public ctrl_moneda(Integer id_moneda, String cod_moneda, String descripcionmoneda) {
        moneda = new class_moneda(id_moneda,cod_moneda,descripcionmoneda);
        sql = "";
    }
    
    
    public class_moneda actualizar_moneda_detalle(){
        
             
        buscar_sql(4);   
        conexion cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DE LA MONEDA SATISFACTORIA");
            cnn.cerrar();
            moneda.setStatus(true);
            return moneda;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN  DE LA MONEDA ");
            cnn.cerrar();
            moneda.setStatus(false);
            return moneda;
        }
       
    }
    
    
    public class_moneda actualizar_moneda(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "LA MONEDA EXISTE EN LA BASE DE DATOS");    
                    moneda.setStatus(true);
                    cnn.cerrar(); 
                    return moneda;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                moneda.setStatus(false);
                return moneda;
            }    
         }   
        else{
             cnn.cerrar();
             moneda.setStatus(false);
             return moneda;
        }
        
        
        buscar_sql(1);
        
          
        cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DE LA MONEDA SATISFACTORIA");
             cnn.cerrar();
             moneda.setStatus(true);
             return moneda;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DE LA MONEDA");
            cnn.cerrar();
            moneda.setStatus(true);
            return moneda;
        }
               
       
    }
    
    public class_moneda buscaridmoneda(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "LA MONEDA EXISTE EN LA BASE DE DATOS");    
                    moneda.setStatus(false);
                    cnn.cerrar(); 
                    return moneda;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                moneda.setStatus(true);
                return moneda;
            }    
         }   
        else{
             cnn.cerrar();
             moneda.setStatus(true);
             return moneda;
        }
        
        moneda.setStatus(true);
        cnn.cerrar(); 
        return moneda;
         
       
    }
    
        
    
    public void consulta_moneda(JTable tabla){
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
    
    
    public void buscar_sql(Integer consulta) {
        
        
        switch (consulta){
            case 1:
                 sql = "INSERT INTO tbl_moneda VALUES(DEFAULT,'" + moneda.getCod_moneda() + "','"  + moneda.getDescripcionmoneda() + "');";
       
                break;  
            case 2:
                sql = "SELECT id_moneda,codigo_moneda,descripcion FROM tbl_moneda;"; 
       
                break;    
                
            case 3:
                sql = "SELECT codigo_moneda FROM tbl_moneda WHERE codigo_moneda = '" + moneda.getCod_moneda() + "';"; 
                                
                break;    
            
            case 4: 
                sql = "UPDATE tbl_moneda SET codigo_moneda = '" + moneda.getCod_moneda() + "',descripcion='" + moneda.getDescripcionmoneda() +  "' WHERE id_moneda = " + moneda.getId_moneda() + ";";    
                break;
                
           
                
        }
       
         
    }
}
