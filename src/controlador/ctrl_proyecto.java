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
import model.class_proyecto;
import model.class_usuario;
import view.funciones;

/**
 *
 * @author ruben
 */
public class ctrl_proyecto {
    class_proyecto proyecto;
    ctrl_usuario responsable;
    private String sql;
    
    
    public ctrl_proyecto(Integer id,String id_proyecto, String descripcionproyecto,String fechadesde,String fechahasta,Integer cedularesponsable,String tipo_orden, String nro_orden,String cliente,Integer id_proyecto_otro) {
        proyecto = new class_proyecto(id,id_proyecto,descripcionproyecto,fechadesde,fechahasta,tipo_orden,nro_orden,cliente,id_proyecto_otro);
        responsable = new ctrl_usuario(cedularesponsable,"","", "","",0,"",0,"",0,false,"");
        sql = "";
    }
    
    
    public String buscarnombreresponsable(){
        class_usuario modelo_usuario= null;
        
        modelo_usuario = responsable.buscar_usuario();
        
        return modelo_usuario.getNombres();
        
    }
    
    public class_proyecto actualizar_proyecto_detalle(){
        
        
        buscar_sql(8);
        conexion cnn = new conexion(sql,"");
        
        buscar_sql(4);   
        cnn = new conexion(sql,"");
        
        if (cnn.estado){
            cnn.cerrar();
            buscar_sql(6);   
            cnn = new conexion(sql,"");
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DEL PROYECTO SATISFACTORIA");
            cnn.cerrar();
            proyecto.setStatus(true);
            return proyecto;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN  DEL PROYECTO ");
            cnn.cerrar();
            proyecto.setStatus(false);
            return proyecto;
        }
       
    }
    
    
    public class_proyecto actualizar_proyecto() throws SQLException{
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "EL PROYECTO EXISTE EN LA BASE DE DATOS");    
                    proyecto.setStatus(true);
                    cnn.cerrar(); 
                    return proyecto;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                proyecto.setStatus(false);
                return proyecto;
            }    
         }   
        else{
             cnn.cerrar();
             proyecto.setStatus(false);
             return proyecto;
        }
        
        
        buscar_sql(1);
        
          
        cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            cnn.cerrar();
            
            
            buscar_sql(9);
            cnn = new conexion(sql,"buscar");
            if (cnn.estado){
                try {
                    if(cnn.rs.next()){
                    
                         proyecto.setId_proyecto_alter(cnn.rs.getInt(1));
                        
                    }
                    cnn.cerrar(); 
                } 
                catch (SQLException err) {
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                    proyecto.setStatus(true);
                    return proyecto;
                }    
            }
            
           
            
            buscar_sql(6);
            cnn = new conexion(sql,"");
            
            JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DEL PROYECTO SATISFACTORIA");
             cnn.cerrar();
             proyecto.setStatus(true);
             return proyecto;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL PROYECTO");
            cnn.cerrar();
            proyecto.setStatus(true);
            return proyecto;
        }
               
       
    }
    
    public class_proyecto buscaridproyecto(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "EL PROYECTO EXISTE EN LA BASE DE DATOS");    
                    proyecto.setStatus(false);
                    cnn.cerrar(); 
                    return proyecto;
                }
                cnn.cerrar(); 
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                proyecto.setStatus(true);
                return proyecto;
            }    
         }   
        else{
             cnn.cerrar();
             proyecto.setStatus(true);
             return proyecto;
        }
        
        proyecto.setStatus(true);
        return proyecto;
         
       
    }
    
        
    
    public void consulta_proyecto(JTable tabla){
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
                        funciones.fecha_bd_usuario(cnn.rs.getString(3), 1),
                        funciones.fecha_bd_usuario(cnn.rs.getString(4),1),
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        cnn.rs.getString(7),
                        cnn.rs.getString(8),
                        cnn.rs.getString(9),
                        cnn.rs.getInt(10),
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
    
    public void consulta_proyecto_detalle(JTable tabla){
        Integer i;
        
        buscar_sql(10);
        
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
                        funciones.fecha_bd_usuario(cnn.rs.getString(3), 1),
                        funciones.fecha_bd_usuario(cnn.rs.getString(4),1),
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        cnn.rs.getString(7),
                        cnn.rs.getString(8),
                        cnn.rs.getString(9),
                        cnn.rs.getInt(10),
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
    
    public void consulta_proyecto_detalle_descripcion(JTable tabla){
        Integer i;
        
        buscar_sql(11);
        
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
                        funciones.fecha_bd_usuario(cnn.rs.getString(3), 1),
                        funciones.fecha_bd_usuario(cnn.rs.getString(4),1),
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        cnn.rs.getString(7),
                        cnn.rs.getString(8),
                        cnn.rs.getString(9),
                        cnn.rs.getInt(10),
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
    
    public class_proyecto consulta_fechasproyecto(){
        
        buscar_sql(5);   
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                               
                    proyecto.setFechadesde(cnn.rs.getDate(1).toString());
                    proyecto.setFechahasta(cnn.rs.getDate(2).toString());
                    proyecto.setCedula(cnn.rs.getInt(3));
                    proyecto.setNombres(cnn.rs.getString(4));
                    proyecto.setTipo_orden(cnn.rs.getString(5));
                    proyecto.setDescripcionproyecto(cnn.rs.getString(6));
                    proyecto.setNro_orden(cnn.rs.getString(7));
                    proyecto.setCliente(cnn.rs.getString(8));
                    proyecto.setId_proyecto(cnn.rs.getString(9));
                    cnn.cerrar(); 
                    return proyecto;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                return proyecto;
            }    
         }   
        else{
             cnn.cerrar();
             return proyecto;
        }
        
        return proyecto;
    }
    
    
    
    public void buscar_sql(Integer consulta) {
        
        
        switch (consulta){
            case 1:
                 sql = "INSERT INTO tbl_proyecto VALUES(DEFAULT,'" + proyecto.getId_proyecto().toUpperCase() + "','"  + proyecto.getDescripcionproyecto().toUpperCase() + "','" + proyecto.getFechadesde() + "','" + proyecto.getFechahasta() + "','" + proyecto.getTipo_orden() + "','" + proyecto.getNro_orden().toUpperCase() + "','" + proyecto.getCliente().toUpperCase() + "');";
       
                break;  
                
            case 2:
                sql = "SELECT  a.id_codproyecto, a.descripcion, a.fecha_inicio, a.fecha_fin,b.fk_usuario,c.nombres, a.tipo_orden,a.nro_orden,a.cliente,a.id_proyecto "; 
                sql += "FROM sistimaca.tbl_proyecto a "; 
                sql += "INNER JOIN tbl_responsable_proyecto b ON "; 
                sql += "a.id_proyecto = b.fk_proyecto "; 
                sql += "INNER JOIN tbl_usuario c ON "; 
                sql += "b.fk_usuario = c.id_usuario ";
                
                break;    
                
            case 3:
                sql = "SELECT id_proyecto FROM tbl_proyecto WHERE id_codproyecto = '" + proyecto.getId_proyecto() + "';"; 
                                
                break;    
            
            case 4: 
                sql = "UPDATE tbl_proyecto SET id_codproyecto ='" + proyecto.getId_proyecto().toUpperCase() + "',descripcion='" + proyecto.getDescripcionproyecto().toUpperCase() + "',fecha_inicio='" + proyecto.getFechadesde() + "',fecha_fin='" + proyecto.getFechahasta() +  "',tipo_orden = '" + proyecto.getTipo_orden() + "',nro_orden = '" + proyecto.getNro_orden().toUpperCase() + "',cliente = '" + proyecto.getCliente().toUpperCase() + "' WHERE id_proyecto = " + proyecto.getId_proyecto_alter() + ";";    
                break;
            
            case 5:
                sql = "SELECT  a.fecha_inicio, a.fecha_fin,c.id_usuario,c.nombres,a.tipo_orden,a.descripcion,a.nro_orden,a.cliente,a.id_codproyecto "; 
                sql += "FROM sistimaca.tbl_proyecto a "; 
                sql += "INNER JOIN tbl_responsable_proyecto b ON "; 
                sql += "a.id_proyecto = b.fk_proyecto "; 
                sql += "INNER JOIN tbl_usuario c ON "; 
                sql += "b.fk_usuario = c.id_usuario ";
                sql += "WHERE id_proyecto = " + proyecto.getId() + ";";
              
                break;        
                          
             case 6:
                sql = "INSERT INTO tbl_responsable_proyecto VALUES(" + responsable.usuario.getCedula() + "," + proyecto.getId_proyecto_alter() + ");";
               
                break;
                 
             case 7:
                sql = "UPDATE tbl_responsable_proyecto SET fk_usuario = " + responsable.usuario.getCedula() + " WHERE fk_proyecto = " + proyecto.getId_proyecto() + ";";
               
                break; 
                
             case 8:
                sql = "DELETE FROM tbl_responsable_proyecto  WHERE fk_proyecto = " + proyecto.getId_proyecto_alter() + ";";
               
                break;  
                
             case 9:
                sql = "SELECT MAX(id_proyecto) FROM tbl_proyecto;";
               
                break;   
              case 10:
                sql = "SELECT  a.id_codproyecto, a.descripcion, a.fecha_inicio, a.fecha_fin,b.fk_usuario,c.nombres, a.tipo_orden,a.nro_orden,a.cliente,a.id_proyecto "; 
                sql += "FROM sistimaca.tbl_proyecto a "; 
                sql += "INNER JOIN tbl_responsable_proyecto b ON "; 
                sql += "a.id_proyecto = b.fk_proyecto "; 
                sql += "INNER JOIN tbl_usuario c ON "; 
                sql += "b.fk_usuario = c.id_usuario ";
                sql += "WHERE a.id_codproyecto LIKE '%" + proyecto.getId_proyecto() + "%';";
                
                break;  
                
              case 11:
                sql = "SELECT  a.id_codproyecto, a.descripcion, a.fecha_inicio, a.fecha_fin,b.fk_usuario,c.nombres, a.tipo_orden,a.nro_orden,a.cliente,a.id_proyecto "; 
                sql += "FROM sistimaca.tbl_proyecto a "; 
                sql += "INNER JOIN tbl_responsable_proyecto b ON "; 
                sql += "a.id_proyecto = b.fk_proyecto "; 
                sql += "INNER JOIN tbl_usuario c ON "; 
                sql += "b.fk_usuario = c.id_usuario ";
                sql += "WHERE a.descripcion LIKE '%" + proyecto.getDescripcionproyecto() + "%';";
                
                break;     
                   
                
                
        }
       
        System.out.println(sql);
         
    }
    
    
}
