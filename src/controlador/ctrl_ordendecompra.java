/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.class_material;
import model.class_ordendecompra;
import model.class_usuario;
import view.funciones;


/**
 *
 * @author ruben
 */
public class ctrl_ordendecompra {
    ctrl_solicitud solicitud;
    class_ordendecompra ordendecompra;
    private Integer posicion_act;
    private Integer solicitud_act;
    private String sql;
    
    
    
    public ctrl_ordendecompra(Integer id_compra, String proveedor, Integer id_solicitud, Integer posicion, Integer nro_material, Integer cantidad_comprar, Double precio_unitario, Double precio_total, String fecha_compra, String justificacion, String observacion) {
        solicitud = new ctrl_solicitud(id_solicitud,0,0,"",0,"",0,0,"",0,"",0,"",0,0,0,0,0,"","","",false,"","","","","","","","","");
        ordendecompra = new class_ordendecompra(id_compra, proveedor, id_solicitud, posicion, nro_material,cantidad_comprar, precio_unitario, precio_total, fecha_compra, justificacion, observacion);
        sql = "";
        posicion_act = 1;
    }
    
    public static String buscarnombreresponsable(Integer cedula){
        class_usuario modelo_usuario= null;
        ctrl_usuario responsable = new ctrl_usuario(cedula,"","", "","",0,"",0,"",0,false,"");
        modelo_usuario = responsable.buscar_usuario();
        
        return modelo_usuario.getNombres();
        
    }
    
    public void consultar_solicitud(JTable tabla){
    
        solicitud.consultar_solicitud_detalle(tabla);
    }
    
     public void consultar_ordendecompra(JTable tabla) throws SQLException{
    
        consultar_ordendecompra_detalle_entrada(tabla);
    }
    
    public String consultar_foto(){
        ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,ordendecompra.getNro_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
        modelo_material = material.consultar_fotomaterial();
        
        return modelo_material.getFoto_material();
        
    }
    
    public class_ordendecompra crear_posicion(JTable tabla) throws SQLException{
        conexion cnn;
        
               
        if (ordendecompra.getId_compra().equals(0)){
            buscar_sql(7);
            cnn = new conexion(sql,"buscar");
            
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                        ordendecompra.setId_compra(cnn.rs.getInt(1)+1);
                        
                    }
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();
            ordendecompra.setPosicion(1);
            buscar_sql(3);
            cnn = new conexion(sql,"");
            cnn.cerrar();
            
            
            ordendecompra.setStatus(true);
            
        }
        else{
            ordendecompra.setPosicion(ordendecompra.getPosicion()+1);
            buscar_sql(3);
            cnn = new conexion(sql,"");
            cnn.cerrar();
            ordendecompra.setStatus(true);
        }    
                
        consultar_ordendecompra_detalle(tabla);
        
    
        return ordendecompra;
        
    }
    
     public void consultar_ordendecompra_detalle(JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        //modelotabla.setRowCount(0);
        
        ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,ordendecompra.getNro_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
        modelo_material = material.consultar_descripcionmaterial();
        
        
       
                    modelotabla.addRow(new Object[]{
                        ordendecompra.getPosicion(),   //posicion
                        ordendecompra.getNro_material(),   //nromaterial
                        modelo_material.getDescripcion(),//material
                        ordendecompra.getCantidad_comprar(),   //cantidad a comprar
                        modelo_material.getUnidad_medida(),
                        ordendecompra.getPrecio_unitario(),//precio unitario
                        ordendecompra.getPrecio_total(),//precio total
                        ordendecompra.getJustificacion(),//justificacion
                        ordendecompra.getObservacion() //observacion
                    });
        
        
    }
     
    public void consultar_ordendecompra_detalle_entrada(JTable tabla) throws SQLException{
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
        buscar_sql(6);
        
        conexion cnn = new conexion(sql,"buscar");
        
               
       /* ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,ordendecompra.getNro_material(),"","","","","","",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"");
        
        modelo_material = material.consultar_descripcionmaterial();*/
        
        if (cnn.estado){
            
                while(cnn.rs.next()){
       
                     posicion_act = cnn.rs.getInt(5);
                     solicitud_act = cnn.rs.getInt(6);
                     buscar_sql(10);
                     conexion cnn2 = new conexion(sql,"buscar");
                        
                     cnn2.rs.next();
                    
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(5),   //posicion
                        cnn2.rs.getInt(1),//nromaterial
                        cnn2.rs.getString(2),//material
                        cnn.rs.getInt(7),   //cantidad a comprar
                        cnn2.rs.getString(3),
                        cnn.rs.getDouble(8),//precio unitario
                        cnn.rs.getDouble(9),//precio total
                        cnn.rs.getString(10),//precio total
                        cnn.rs.getString(11),//justificacion
                        cnn.rs.getString(12), //observacion
                        cnn.rs.getString(2) //proveedor
                    });
                    cnn2.cerrar();
                }
                cnn.cerrar();
        }
    } 
     
    public class_ordendecompra borrar_posicion(JTable tabla,Integer pos){
        Integer i;
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        ordendecompra.setPosicion(Integer.parseInt(modelotabla.getValueAt(pos,0).toString()));
        
        modelotabla.removeRow(pos);
        tabla.revalidate();
        
        buscar_sql(8);
        conexion cnn = new conexion(sql,"");
        cnn.cerrar();
        ordendecompra.setStatus(true);
        
       
        for(i = 0; i <= modelotabla.getRowCount()-1 ;i++){
           modelotabla.setValueAt(i+1, i,0);
        } 
        
        buscar_sql(6);
        
        cnn = new conexion(sql,"buscar");
        
            
            if (cnn.estado){
            
                try{
                    
                    while(cnn.rs.next()){
                        ordendecompra.setPosicion(cnn.rs.getInt(4));
                        buscar_sql(9);                       
                        conexion cnn2 = new conexion(sql,"");
                        posicion_act += 1;
                        cnn2.cerrar();
                    }
                    cnn.cerrar();
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();
        
        
        
        return ordendecompra;
    } 
    
   
    
    public void buscar_sql(Integer consulta) {
        
        
        switch (consulta){
            case 1:
//                 sql = "SELECT numero_material,descripcionmaterial FROM vw_matclasegrupo WHERE numero_material LIKE '%" + Integer.parseInt(solicitud.getNumero_material().toString().trim()) + "%';";
                 
                 break;  
            case 2:
//                 sql = "SELECT numero_material,descripcionmaterial FROM vw_matclasegrupo WHERE descripcionmaterial LIKE '%" + solicitud.getDescripcion_material().trim() + "%';";
       
                break;    
                
            case 3:
                
                sql = "INSERT INTO tbl_ordencompra VALUES(" + ordendecompra.getId_compra() + ",'" + ordendecompra.getProveedor() + "'," + ordendecompra.getId_solicitud() + "," + ordendecompra.getPosicion()  + "," + ordendecompra.getCantidad_comprar() + "," + ordendecompra.getPrecio_unitario() + "," + ordendecompra.getPrecio_total() + ",'" + ordendecompra.getFecha_compra() + "','" + ordendecompra.getJustificacion() + "','" + ordendecompra.getObservacion() + "');"; 
                                
                break;    
            
            case 4: 
//                sql = "INSERT INTO tbl_solicitud_det VALUES(" + ordendecompra.getId_solicitud() + "," + solicitud.getCedula() + "," + solicitud.getId_area() + "," + solicitud.getId_tiposolicitud()  + "," + solicitud.getId_material() + "," + solicitud.getId_empresa() + "," + solicitud.getId_proyecto() + "," + solicitud.getPosicion() + "," + solicitud.getCantidad_solicitada() + ",'" +  solicitud.getFecha_solicitud() + "','" + solicitud.getFecha_requerida() + "','" + solicitud.getJustificacion() + "'," + solicitud.isAutorizado() + ");";  
                break;
                
            case 5:
//                sql = "SELECT id_material FROM tbl_maestromaterial WHERE numero_material = " + solicitud.getNumero_material() + ";";
                break;
            
            case 6:
                sql = "SELECT DISTINCT a.id_compra, a.proveedor,b.usuario,b.nombres, a.posicion,a.fk_solicitud, a.cantidad_comprar, a.preciounitario, a.preciototal, a.fecha_compra, a.justificacion, a.observacion ";
                sql += "FROM sistimaca.tbl_ordencompra a ";
                sql += "INNER JOIN vw_solicitud_detalle b ON ";
                sql += "a.fk_solicitud = b.fk_solicitud ";
                sql += "WHERE a.id_compra = " + ordendecompra.getId_compra();
                sql += " ORDER BY a.fk_solicitud,a.posicion;";
                
                break;    
            
            case 7:
                sql = "SELECT MAX(id_compra)FROM tbl_ordencompra;";
                break;
            
            case 8:
                sql = "DELETE FROM tbl_ordencompra WHERE id_compra = " + ordendecompra.getId_compra() + " AND posicion = " + ordendecompra.getPosicion() + " AND fk_solicitud = " + ordendecompra.getId_solicitud() +";";
                
                break;      
            case 9:
               sql = "UPDATE tbl_ordencompra SET posicion =  " + posicion_act + " WHERE id_compra = " + ordendecompra.getId_compra() + " AND fk_solicitud = " + ordendecompra.getId_solicitud() + " AND posicion = " + ordendecompra.getPosicion() +";";
                break;     
                
            case 10:
                sql = "SELECT numero_material,descripcionmat,unidad_medida ";
                sql += "FROM vw_solicitud_detalle ";
                sql += "WHERE fk_solicitud  = " + solicitud_act  +  " AND posicion = " + posicion_act + ";";
    
                break;
        }
    
    }    
    
}
