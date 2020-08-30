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
import model.class_entrada;
import model.class_material;
import model.class_prestamo;
import view.funciones;

/**
 *
 * @author ruben
 */
public class ctrl_prestamo {
   class_prestamo prestamo;
   class_entrada entrada;
   String sql;
   Integer posicion_act;
   String condicion;
   
    public ctrl_prestamo(Integer id_prestamo, Integer id_material, String descripcionmaterial, Integer id_empresa, String descripcion_empresa, Integer id_area, String descripcion_area, String nombre_solicitante, Integer id_almacen, String descripcionalmacen,Integer id_ubicacion, String descripcionubicacion, Integer id_proyecto, String descripcionproyecto,Integer posicion,Integer cantidad_prestada, Integer id_documento, String fecha_solicitud, String fecha_desde, String fecha_hasta, String justificacion, String fecha_recepcion, Boolean dano, String foto, String descripciondano, Integer id_entrada, Boolean status) {
        prestamo = new class_prestamo(id_prestamo,id_material,descripcionmaterial,id_empresa,descripcion_empresa,id_area,descripcion_area, nombre_solicitante,  id_almacen,  descripcionalmacen, id_ubicacion,  descripcionubicacion, id_proyecto, descripcionproyecto, posicion, cantidad_prestada, id_documento, fecha_solicitud, fecha_desde, fecha_hasta,  justificacion,  fecha_recepcion,  dano, foto,  descripciondano,id_entrada, status);
        sql = "";
    }
    
    public class_prestamo crear_prestamo(JTable tabla) {
        conexion cnn;
        
        Integer i;
        
            buscar_sql(2);
            cnn = new conexion(sql,"buscar");
            
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                        if(cnn.rs.getInt(1) < prestamo.getCantidad_prestada()){
                           JOptionPane.showMessageDialog(null, "LA CANTIDAD SOLICITADA EN MODO DE PRESTAMO SUPERA LO CONTABILIZADO EN EL INVENTARIO");
                           prestamo.setStatus(false);
                        }
                        else{
 
                        }
                    }
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();   
                   
                     
            i=1;
            if (prestamo.getStatus()){
                buscar_sql(3);
                cnn = new conexion(sql,"buscar");
                
                if(prestamo.getId_documento().equals(0)){
                    prestamo.setId_documento(asignar_nro_documento());
                }
                
                if (cnn.estado){
            
                try{
                    while(cnn.rs.next() && i <= prestamo.getCantidad_prestada()){
                         entrada  = new class_entrada(cnn.rs.getInt(1),0,0,"",0,"",1,"",0,"",0,"",0,"",0,"",0,"",0,"",0,0,0,"",0,0.0,0.0,0.0,0.0,"",true);
                         buscar_sql(4);
                         conexion cnn2 = new conexion(sql,"");
                         cnn2.cerrar();
                         prestamo.setId_entrada(cnn.rs.getInt(1));
                          //agregar prestamo
                        buscar_sql(1);
                        cnn2 = new conexion(sql,"");
                        cnn2.cerrar();
                        prestamo.setStatus(true);
                        i++;
                    }
                    cnn.cerrar();
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
                
                 //actualizar maestro de material
                buscar_sql(8);
                cnn = new conexion(sql,"");
                cnn.cerrar();
                
                prestamo.setPosicion(prestamo.getPosicion()+1);
                
                consultar_prestamo_detalle(tabla);
            }    
            cnn.cerrar();   
            
            
           
            
            
               
            }
               
         
         return prestamo;
        
    }
    
    public void consultar_prestamo_detalle(JTable tabla){
        Integer posicion =0;
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
        buscar_sql(7);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    if(!posicion.equals(cnn.rs.getInt(17))){
                        posicion = cnn.rs.getInt(17);
                    
                        modelotabla.addRow(new Object[]{
                            cnn.rs.getInt(1),   //id_prestamo
                            cnn.rs.getInt(19),   //id_documeno
                            cnn.rs.getInt(17), //posicion
                            cnn.rs.getInt(4),//nro_material
                            cnn.rs.getString(3),   //Descripcion
                            cnn.rs.getInt(18),//cantidad
                            cnn.rs.getString(5),//umb
                            cnn.rs.getString(16),//proyecto
                            cnn.rs.getDate(22),//fecha desde
                            cnn.rs.getDate(23), //fecha hasta
                            cnn.rs.getString(20), //nombre solicitante

                        });
                    }    
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
    
    
    public Integer asignar_nro_documento(){
        Integer nro_documento=0;
        
        buscar_sql(6);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                      nro_documento = cnn.rs.getInt(1);
                      
                    }
                    cnn.cerrar(); 
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
                
                if (nro_documento > 0){
                    nro_documento += 1;
                }
                else{
                    nro_documento = 400000000;
                }
        }
        
        return nro_documento;
    }

public class_prestamo borrar_posicion_prestamo(JTable tabla){
    
        Integer i;
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.removeRow(prestamo.getPosicion()-1);
        tabla.revalidate();
        
        //ACTUALIZAR ENTRADA
        buscar_sql(9);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
                try{
                    
                    while(cnn.rs.next()){
                        prestamo.setId_entrada(cnn.rs.getInt(1));
                        buscar_sql(10);
                        conexion cnn2 = new conexion(sql,"");
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
        
        //suprimir en tbl_prestamo
        buscar_sql(11);
        cnn = new conexion(sql,"");
        cnn.cerrar();
        prestamo.setStatus(true);
        
       
        for(i = 0; i <= modelotabla.getRowCount()-1 ;i++){
           modelotabla.setValueAt(i+1, i,2);
        } 
        
        buscar_sql(12);
        
        cnn = new conexion(sql,"buscar");
        
            posicion_act = 1;
            if (cnn.estado){
            
                try{
                    
                    while(cnn.rs.next()){
                        prestamo.setPosicion(cnn.rs.getInt(2));
                        buscar_sql(13);                       
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
        
        prestamo.setPosicion(posicion_act-1);
        
        return prestamo;
    }    

    public void consultar_prestamos(JTable tabla,String fechadesde,String fechahasta,Integer opcion){
        
        String condicion2 = " ";
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
        if (!prestamo.getId_proyecto().equals(0)){
            condicion2 = " AND fk_proyecto = " + prestamo.getId_proyecto();
        }     
 
       if (!prestamo.getId_material().equals(0)){
            condicion2 = " AND numero_material LIKE '%" + prestamo.getId_material() + "%'";
        }     
         
       if (!prestamo.getDescripcionmaterial().equals("")){
            condicion2 = " AND descripcionmaterial LIKE '%" + prestamo.getDescripcionmaterial() + "%'";
       }  
       
       if (!prestamo.getId_area().equals(0)){
            condicion2 = " AND fk_area = " + prestamo.getId_area();
       }  
       
       if (!fechadesde.equals("") && !fechahasta.equals("")){
            condicion2 = " AND fecha_solicitud BETWEEN '" + fechadesde + "' AND '" + fechahasta + "'";
       }  
    
        
        switch (opcion){
           case 0: this.condicion = "WHERE 1=1 ";
                    break;
           case 1: this.condicion = "WHERE status = TRUE ";
                    break;
           case 2: this.condicion = "WHERE status = FALSE ";
                    break; 
           case 3: this.condicion = "WHERE status = FALSE AND fecha_recepcion != '' ";
                    break;          
       }

         this.condicion += condicion2; 
       
        buscar_sql(14);
   
                              
        conexion cnn = new conexion(sql,"buscar");
        
            if (cnn.estado){
            
                try{       
                    while (cnn.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn.rs.getInt(1),   //idprestamo
                            0,   //identrada
                            cnn.rs.getInt(3),   //nrodocumento
                            cnn.rs.getInt(4),   //nro material
                            cnn.rs.getString(5),   //descripcionmaterial
                            cnn.rs.getInt(6),//posiciom
                            cnn.rs.getInt(7),//cantidad prestada
                            cnn.rs.getString(8),//codigo umb
                            cnn.rs.getString(9), //proyecto
                            cnn.rs.getString(10), //AREA
                            cnn.rs.getString(11), //nombresolicitante
                            funciones.fecha_bd_usuario(cnn.rs.getDate(12).toString(),1),//fecha solicitud
                            funciones.fecha_bd_usuario(cnn.rs.getDate(13).toString(),1),//fecha solicitud
 
                        
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

    public Boolean actualizar_prestamo(JTable tabla){
        
        sql = "UPDATE tbl_prestamo ";
        sql += "SET nombresolicitante = '" + prestamo.getNombre_solicitante() + "',fecha_desde = '" + prestamo.getFecha_desde() + "',fecha_hasta = '" + prestamo.getFecha_hasta() + "' ";
        sql +="WHERE id_prestamo = " + prestamo.getId_prestamo();
        
        conexion cnn = new conexion(sql,"");
        cnn.cerrar();
        
        return true;
    }
    
    public Boolean actualizarestatusprestamo(String id_prestamo,String id_entrada){
        
        sql = "UPDATE tbl_prestamo";
        sql += "SET status = FALSE, dano = " + prestamo.getDano() + ",descripcion_dano = '" + prestamo.getDescripciondano() + "', foto = '" + prestamo.getFoto() + "'";
        sql += "WHERE id_prestamo IN(" + id_prestamo + ");";
    
        conexion cnn = new conexion(sql,"");
        cnn.cerrar();
        
        sql = "UPDATE tbl_entrada";
        sql += "SET status = TRUE";
        sql += "WHERE id_entrada IN(" + id_entrada + ");";
    
        cnn = new conexion(sql,"");
        cnn.cerrar();
        
        return true;
    }
    
    public void buscar_sql(Integer consulta){
        
        switch (consulta){ 
        
            case 1:
                
                ctrl_material material = null;
                class_material modelo_material = null;
        
                material = new ctrl_material(0,prestamo.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                modelo_material = material.consultar_descripcionmaterial();
                
                sql = "INSERT INTO tbl_prestamo VALUES(DEFAULT," + modelo_material.getId_material() + "," + prestamo.getId_empresa() + "," + prestamo.getId_area()  + "," + prestamo.getId_almacen() + "," + prestamo.getId_ubicacion() + ",1," + prestamo.getId_proyecto() + "," + prestamo.getPosicion() + "," + prestamo.getId_documento() + "," + prestamo.getCantidad_prestada() + ",'" + prestamo.getNombre_solicitante() + "','" + prestamo.getFecha_solicitud() + "','" + prestamo.getFecha_desde() + "','" + prestamo.getFecha_hasta() + "','" + prestamo.getJustificacion() + "','" + prestamo.getFecha_recepcion() + "'," + prestamo.getDano() + ",'" + prestamo.getFoto() + "','" + prestamo.getDescripciondano() + "'," + prestamo.getId_entrada() + ",true);"; 
                                
                break; 
            
            case 2:   
                
                sql = "SELECT COUNT(numero_material) FROM vw_entrada WHERE status = true AND numero_material = " + prestamo.getId_material() + " AND fk_almacen = " + prestamo.getId_almacen() + " AND fk_ubicacion = " + prestamo.getId_ubicacion() + " AND fk_proyecto = " + prestamo.getId_proyecto() ;
                break; 
            
            case 3:
                
                ctrl_material material2 = null;
                class_material modelo_material2 = null;
        
                material2 = new ctrl_material(0,prestamo.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                modelo_material2 = material2.consultar_descripcionmaterial();
 
                sql = "SELECT id_entrada FROM tbl_entrada WHERE fk_material = " + modelo_material2.getId_material() + " AND fk_almacen = " + prestamo.getId_almacen() + " AND fk_ubicacion = " + prestamo.getId_ubicacion() + " AND fk_proyecto = " + prestamo.getId_proyecto() + " AND status = true; ";
                
                break;
            
            case 4:    
                
                sql = "UPDATE  tbl_entrada SET status = false WHERE id_entrada = " + entrada.getId_entrada();
                break;
                
            case 5:    
                
                sql = "SELECT MAX(id_prestamo) FROM tbl_prestamo;";
                break;    
            
            case 6:
                sql = "SELECT MAX(nro_documento) FROM tbl_prestamo;";
                break;  
            
            case 7:
                sql = "SELECT id_prestamo, fk_material, descripcionmaterial, numero_material, codigo_umb, fk_empresa, descripcionempresa, fk_area, descripcionarea, fk_almacen, descripcionalmacen, fk_ubicacion, descripcionubicacion, fk_movimiento, fk_proyecto, descripcionproyecto,posicion, cantidad_prestada, nro_documento, nombresolicitante, fecha_solicitud, fecha_desde, fecha_hasta, justificacion, fecha_recepcion, dano, foto, descripcion_dano, id_entrada, status ";
                sql +="FROM vw_prestamo ";
                sql +="WHERE nro_documento = " + prestamo.getId_documento() + ";";
                
                break;      
            
            case 8:
                       
                sql = "UPDATE tbl_maestromaterial ";
                sql += "SET stock_disponible = stock_disponible - " + prestamo.getCantidad_prestada() + ",stock_usado = stock_usado + " + prestamo.getCantidad_prestada() + ", cantidad_saliente = cantidad_saliente + " + prestamo.getCantidad_prestada();
                sql += " WHERE numero_material = " + prestamo.getId_material();
               
                break;  
           
        case 9:
                sql = "SELECT id_entrada ";
                sql += "FROM tbl_prestamo ";
                sql += "WHERE nro_documento =" + prestamo.getId_documento() + " AND posicion = " + prestamo.getPosicion();
               
                break; 
        
        case 10:
                sql = "UPDATE tbl_entrada ";
                sql += "SET status = TRUE  ";
                sql += "WHERE id_entrada =" + prestamo.getId_entrada();
               
                break;  
        
        case 11:
                sql = "DELETE FROM tbl_prestamo ";
                sql += "WHERE nro_documento =" + prestamo.getId_documento() + " AND posicion = " + prestamo.getPosicion();
               
                break;  
        
        case 12:
                sql = "SELECT DISTINCT nro_documento,posicion ";
                sql += "FROM tbl_prestamo ";
                sql += "WHERE nro_documento = " + prestamo.getId_documento() + " ";
                sql += "ORDER BY posicion ASC";
               
                break;
                
        case 13:
                sql = "UPDATE tbl_prestamo SET posicion =  " + posicion_act + " WHERE nro_documento = " + prestamo.getId_documento() + " AND posicion = " + prestamo.getPosicion() +";";
                break;          
        
        case 14:
                sql = "SELECT DISTINCT id_prestamo,id_entrada,nro_documento,numero_material,descripcionmaterial,posicion,cantidad_prestada,codigo_umb,descripcionproyecto,descripcionarea,nombresolicitante,fecha_desde,fecha_hasta ";
                sql += "FROM vw_prestamo ";
                sql += this.condicion;
                break;        

                
        }
        
    }
    
    
}
