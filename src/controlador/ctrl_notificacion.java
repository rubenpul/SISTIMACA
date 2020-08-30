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
import model.class_notificacion;

/**
 *
 * @author ruben
 */
public class ctrl_notificacion {
     class_notificacion notificacion;
     String sql;
     
     public ctrl_notificacion(Integer fk_usuario, Integer fk_documento, Boolean visto, String fecharegistro, String fechavisto, Integer usuarioreceptor) {
          notificacion = new class_notificacion(fk_usuario,fk_documento,visto,fecharegistro,fechavisto,usuarioreceptor);
     }
    
     public Boolean consultar_notificacion_activausuario(){
         
         sql = "SELECT usuarioreceptor FROM tbl_notificaciondocumento WHERE visto = " + notificacion.getVisto() + " AND usuarioreceptor = " + notificacion.getUsuarioreceptor();
         
         conexion cnn = new conexion(sql,"buscar");
        
         if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    cnn.cerrar();
                    return true;
                }
                cnn.cerrar(); 
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage()); 
                cnn.cerrar();
                return false;
            }    
                
     }  
     return false;
     
    }
     
    public void actualizar_notificacion_statususuario(){
         
         sql = "UPDATE tbl_notificaciondocumento SET visto = " + notificacion.getVisto() + " WHERE usuarioreceptor = " + notificacion.getUsuarioreceptor();
         
         conexion cnn = new conexion(sql,"");
         cnn.cerrar();
         
    }

     public void consultar_notificacion_activadetalleusuario(JTable tabla){

       DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
         sql = "SELECT a.fk_documento,b.nombres ";
         sql +="FROM tbl_notificaciondocumento a ";
         sql +="INNER JOIN tbl_usuario b ON ";
         sql +="a.fk_usuario = b.id_usuario ";
         sql += "WHERE a.visto = " + notificacion.getVisto() + " AND a.usuarioreceptor = " + notificacion.getUsuarioreceptor();
         
         conexion cnn = new conexion(sql,"buscar");
        
         if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                    
                    sql = "SELECT fk_reserva,'RESERVA DE MATERIAL' as tipodocumento, numero_material, descripcionmat,cantidad_solicitada,cantidad_conformada,cantidad_aprobada,cantidad_autorizada,unidad_medida,observaciones,'" + cnn.rs.getString(2) + "' as usuario ";
                    sql += "FROM vw_reserva_detalle ";
                    sql += "WHERE fk_reserva = " + cnn.rs.getInt(1) + " ";
                    sql += "UNION ";
                    sql += "SELECT fk_solicitud,'SOLICITUD A COMPRAS' as tipodocumento, numero_material, descripcionmat,cantidad_solicitada,cantidad_conformada,cantidad_aprobada,cantidad_autorizada,codigo_umb,observaciones,'" + cnn.rs.getString(2) + "' as usuario ";
                    sql += "FROM vw_solicitud_detalle ";
                    sql += "WHERE fk_solicitud = " + cnn.rs.getInt(1);
                   
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while(cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                        cnn2.rs.getInt(1),   //nrodocumento
                        cnn2.rs.getString(2),   //tipodocumento
                        cnn2.rs.getInt(3),   //nromaterial
                        cnn2.rs.getString(4),//materialsolicituado
                        cnn2.rs.getInt(5),   //cantidad solicitada
                        cnn2.rs.getInt(6),//cantidad conformada
                        cnn2.rs.getInt(7),//cantidad aprobada
                        cnn2.rs.getInt(8),//cantidad autorizada
                        cnn2.rs.getString(9),//umb
                        cnn2.rs.getString(10), //motivo
                        cnn2.rs.getString(11) //usuario
                        });
                    }
                    cnn2.cerrar(); 
                   
                   
                }
                cnn.cerrar(); 
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage()); 
                cnn.cerrar();
                
            }    
                
     }  
    
     
    }
     
     

}
