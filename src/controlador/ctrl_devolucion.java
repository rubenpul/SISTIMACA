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
import model.class_devolucion;
import model.class_proveedor;
import view.funciones;

/**
 *
 * @author ruben
 */
public class ctrl_devolucion {
    
    String sql;
    class_devolucion devolucion;
    class_proveedor proveedor;
    private Integer id_proveedor = 0;
    
    public ctrl_devolucion(Integer id_devolucion,Integer fk_material, Integer fk_proyecto, Integer fk_almacen, Integer fk_ubicacion, Integer fk_motivo, Integer fk_proveedor, Integer fk_usuario, String codigo_umb, String descripcionmotivo, Integer posicion, Integer nro_documentoentrada, Integer nro_documentodevolucion, Integer orden_compra, String fecha_entrada, Double cantidad_devuelta, Double cantidad_reingresada, String fecha_reingreso,String fecha_devuelta, String foto, Boolean estatus) {
        devolucion = new class_devolucion(id_devolucion,fk_material, fk_proyecto, fk_almacen, fk_ubicacion, fk_motivo, fk_proveedor, fk_usuario, codigo_umb, descripcionmotivo, posicion, nro_documentoentrada, nro_documentodevolucion, orden_compra, fecha_entrada, cantidad_devuelta, cantidad_reingresada, fecha_reingreso,fecha_devuelta, foto, estatus);
        proveedor = new class_proveedor(0, "", "", "", "","","","","","","","","","","","","","","","","","",0, 0,true);
    }
    
    public void consultar_devoluciones(JTable tabla,Integer nivel, String fechadesde, String fechahasta,Integer nro_material){
        String cadena = "";
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
        cadena = "WHERE 1=1 AND estatus = TRUE ";
        
               
        if (!fechadesde.equals("") && !fechahasta.equals("")){
            cadena += "AND fecha_devuelta BETWEEN '" + fechadesde + "' AND '" + fechahasta + "' ";
        }

        if (!nro_material.equals(0)){
            cadena += "AND numero_material = " + nro_material + " ";
        }

        if (!devolucion.getOrden_compra().equals(0)){
            cadena += "AND orden_compra = " + devolucion.getOrden_compra() + " ";
        }

             
        /*switch (nivel){
            case 4: this.cadena += " AND fk_area = " + devolucion.get + " ";
                     break;
            case 9: this.cadena += " AND fk_usuario = " + solicitud.getCedula() + " AND fk_area = " + solicitud.getId_area() + " ";
                     break;
            case 10: this.cadena += " AND fk_usuario = " + solicitud.getCedula() + " ";
                     break;         
        } */
        
        
        sql = "SELECT id_devolucion,fk_almacen,fk_ubicacion,fk_usuario,fk_proyecto, fk_material, fk_proveedor,orden_compra, numero_material, descripcionmaterial,cantidad_devuelta, cantidad_reingresada,(cantidad_devuelta - cantidad_reingresada) as pendiente, codigo_umb,descripcionmotivo,fecha_entrada,nro_documentoentrada,fecha_devuelta,descripcionproyecto,descripcionalmacen, descripcionubicacion,nombres ";
        sql +="FROM vw_devolucion ";
        sql += cadena;
        
               
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                         
                        cnn.rs.getInt(1),   //id_devolucion
                        cnn.rs.getInt(2),   //fk_almacen
                        cnn.rs.getInt(3),   //fk_ubicacion
                        cnn.rs.getInt(4),   //fk_usuario
                        cnn.rs.getInt(5),//fk_proyecto
                        cnn.rs.getInt(6),//fk_material
                        cnn.rs.getInt(7),//fk_proveedor
                        cnn.rs.getInt(8),//orden_compra
                        cnn.rs.getInt(9), //numero_material
                        cnn.rs.getString(10), //descripcionmaterial
                        cnn.rs.getDouble(11), //cantidad_devuelta
                        cnn.rs.getDouble(12), //cantidad_reingresada
                        cnn.rs.getDouble(13), //cantidad_pendiente
                        cnn.rs.getString(14), //codigo_umb
                        cnn.rs.getString(15), //descripcionmotivo
                        cnn.rs.getDate(16), //fecha_entrada
                        cnn.rs.getInt(17), //nro_documentoentrada
                        cnn.rs.getDate(18), //fecha_devuelta
                        cnn.rs.getString(19), //descripcionproyecto
                        funciones.formato_ordencompra(cnn.rs.getInt(8)), //oc con formato
                        cnn.rs.getString(20), //descripcionalmacen
                        cnn.rs.getString(21), //descripcionubicacion  
                        cnn.rs.getString(22) //nombres 
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
    
    public class_devolucion crear_posicion(JTable tabla) throws SQLException{
        conexion cnn;
        
        
               
        if (devolucion.getNro_documentodevolucion().equals(0)){
            
            sql = "SELECT MAX(nro_documentodevolucion)FROM tbl_devolucion;";
            
            cnn = new conexion(sql,"buscar");
            
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                        devolucion.setNro_documentodevolucion(cnn.rs.getInt(1)+1);
                    }
                    
                    if (devolucion.getNro_documentodevolucion().equals(1)){
                        devolucion.setNro_documentodevolucion(700000000);
                    }
                    
                    
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();
            
            sql = "INSERT INTO tbl_devolucion VALUES(DEFAULT," + devolucion.getFk_material() + "," + devolucion.getFk_proyecto() + "," +  devolucion.getFk_almacen() + "," +  devolucion.getFk_ubicacion() + "," +  devolucion.getFk_motivo() + "," +  devolucion.getFk_proveedor() + "," + devolucion.getFk_usuario() + ",'" + devolucion.getCodigo_umb() + "','" +  devolucion.getDescripcionmotivo() + "'," + devolucion.getPosicion() + "," + devolucion.getNro_documentoentrada() + "," +  devolucion.getNro_documentodevolucion() + "," + devolucion.getOrden_compra() + ",'" +  devolucion.getFecha_entrada() + "'," + devolucion.getCantidad_devuelta() + "," +  devolucion.getCantidad_reingresada() + ",'" + devolucion.getFecha_reingreso() + "','" + devolucion.getFecha_devuelta() + "','" + devolucion.getFoto() + "'," + devolucion.getEstatus() + ");";
         
            cnn = new conexion(sql,"");
            cnn.cerrar();
                       
                        
            
        }
        else{
            sql = "INSERT INTO tbl_devolucion VALUES(DEFAULT," + devolucion.getFk_material() + "," + devolucion.getFk_proyecto() + "," +  devolucion.getFk_almacen() + "," +  devolucion.getFk_ubicacion() + "," +  devolucion.getFk_motivo() + "," +  devolucion.getFk_proveedor() + "," + devolucion.getFk_usuario() + ",'" + devolucion.getCodigo_umb() + "','" +  devolucion.getDescripcionmotivo() + "'," + devolucion.getPosicion() + "," + devolucion.getNro_documentoentrada() + "," +  devolucion.getNro_documentodevolucion() + "," + devolucion.getOrden_compra() + ",'" +  devolucion.getFecha_entrada() + "'," + devolucion.getCantidad_devuelta() + "," +  devolucion.getCantidad_reingresada() + ",'" + devolucion.getFecha_reingreso() + "','" +  devolucion.getFecha_devuelta() + "','" + devolucion.getFoto() + "'," + devolucion.getEstatus() + ");";
            cnn = new conexion(sql,"");
            cnn.cerrar();
        }    
                
        consultar_devolucion_detalle(tabla);
        
        //INHABILITAR DEL INVENTARIO EL MATERIAL DEVUELTO                                           
        sql = "CALL actualizar_entrada_material_devolucion("+ devolucion.getFk_material() + ",0,0," + devolucion.getFk_almacen() + "," + devolucion.getFk_ubicacion() + ",0,14,0,0,'',0," + devolucion.getNro_documentoentrada() + "," + devolucion.getOrden_compra() + ",0,''," + devolucion.getCantidad_devuelta() + ",0,0,0,0,'',TRUE);"; 
                    
        cnn = new conexion(sql,"");
        cnn.cerrar();
        
        //REGISTRAR LA SALIDA DEL MATERIAL POR DEVOLUCION
               
         sql = "INSERT INTO tbl_salida VALUES(DEFAULT," + devolucion.getFk_material()   + "," + devolucion.getFk_usuario() + "," + devolucion.getFk_almacen() + "," + devolucion.getFk_ubicacion() + "," + devolucion.getFk_proyecto() + ",14," + asignar_nro_documento() + ",1," + devolucion.getCantidad_devuelta() + ",'" + devolucion.getFecha_devuelta() + "','DEVOLUCIÓN AL PROVEEDOR','DEVOLUCION AL PROVEEDOR');"; 
               
        cnn = new conexion(sql,"");
        cnn.cerrar();
                
        //actualizar maestro de material
        sql = "UPDATE tbl_maestromaterial ";
        sql += "SET stock_disponible = stock_disponible - " + devolucion.getCantidad_devuelta() + ",stock_usado = stock_usado + " + devolucion.getCantidad_devuelta() + ", cantidad_saliente = cantidad_saliente + " + devolucion.getCantidad_devuelta();
        sql += " WHERE id_material = " + devolucion.getFk_material();
                cnn = new conexion(sql,"");
                cnn.cerrar();
    
        return devolucion;
        
    }

public Integer asignar_nro_documento(){
        Integer nro_documento=0;
        
         sql = "SELECT MAX(id_documento)FROM tbl_salida;";
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

   public Integer asignar_nro_documento_entrada(){
        Integer nro_documento=0;
        
        sql = "SELECT MAX(id_documento)FROM tbl_entrada;";
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                      nro_documento = cnn.rs.getInt(1);
                      cnn.cerrar();
                    }
                    
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
                
                if (nro_documento > 0){
                    nro_documento += 1;
                }
                else{
                    nro_documento = 500000000;
                }
        }
        
        return nro_documento;
    }

    public void consultar_devolucion_detalle(JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
        sql = "SELECT id_devolucion,fk_almacen,fk_ubicacion,fk_usuario,fk_proyecto, fk_material,fk_proveedor,orden_compra,numero_material, descripcionmaterial, cantidad_devuelta,  codigo_umb, descripcionmotivo, fecha_entrada, nro_documentoentrada,fecha_devuelta, descripcionproyecto,descripcionalmacen,descripcionubicacion,nombres ";
        sql += "FROM vw_devolucion ";
        sql += "WHERE nro_documentodevolucion = " + devolucion.getNro_documentodevolucion();
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                         
                        cnn.rs.getInt(1),   //id_devolucion
                        cnn.rs.getInt(2),   //fk_almacen
                        cnn.rs.getInt(3),   //fk_ubicacion
                        cnn.rs.getInt(4),   //fk_usuario
                        cnn.rs.getInt(5),//fk_proyecto
                        cnn.rs.getInt(6),//fk_material
                        cnn.rs.getInt(7),//fk_proveedor
                        cnn.rs.getInt(8),//orden_compra
                        cnn.rs.getInt(9), //numero_material
                        cnn.rs.getString(10), //descripcionmaterial
                        cnn.rs.getDouble(11), //cantidad_devuelta
                        cnn.rs.getString(12), //codigo_umb
                        cnn.rs.getString(13), //descripcionmotivo
                        cnn.rs.getDate(14), //fecha_entrada
                        cnn.rs.getInt(15), //nro_documentoentrada
                        cnn.rs.getDate(16), //fecha_devuelta
                        cnn.rs.getString(17), //descripcionproyecto
                        funciones.formato_ordencompra(cnn.rs.getInt(8)), //oc con formato
                        cnn.rs.getString(18), //descripcionalmacen
                        cnn.rs.getString(19), //descripcionubicacion  
                        cnn.rs.getString(20) //nombres 
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
    
    public class_proveedor consultar_ordendecompra_proveedor() throws SQLException{
        
        sql = "SELECT fk_proveedor ";
        sql += "FROM vw_cotizacion "; 
        sql += "WHERE  nro_ordencompra = " + devolucion.getOrden_compra() + " AND status = TRUE;";
               
        conexion cnn = new conexion(sql,"buscar");
          
        if (cnn.estado){
            
            if(cnn.rs.next()){
                id_proveedor = cnn.rs.getInt(1);
                
            }  
            cnn.cerrar();
        }       
    
               
        sql = "SELECT nombre,rif,direccion,tipo,personacontacto,telefono1,correoelectronico ";
        sql += "FROM tbl_proveedor ";
        sql += "WHERE id_proveedor = " + id_proveedor + ";";

        cnn = new conexion(sql,"buscar");
        
         if (cnn.estado){
            
            if(cnn.rs.next()){
                proveedor.setNombre(cnn.rs.getString(1));
                proveedor.setRif(cnn.rs.getString(2));
                proveedor.setDireccion(cnn.rs.getString(3));
                proveedor.setTipo(cnn.rs.getString(4));
                proveedor.setPersonacontacto(cnn.rs.getString(5));
                proveedor.setTelefono1(cnn.rs.getString(6));
                proveedor.setCorreoelectronico(cnn.rs.getString(7));
                proveedor.setStatus(true);
                cnn.cerrar();
                return proveedor;
            }
         } 
         proveedor.setStatus(false);
         return proveedor;
    }
    
    public void consultar_ordendecompra_detalle_devolucion(JTable tabla) throws SQLException{
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
        sql = "SELECT fk_almacen,fk_ubicacion, orden_compra,fk_proyecto,fk_usuario,fk_material,numero_material,descripcionmaterial,COUNT(cantidad_ingresada) as cantidad,codigo_umb,posicion,fecha_entrada,descripcionalmacen,descripcionubicacion,descripcionproyecto,usuario,id_documento ";
        sql += "FROM sistimaca.vw_entrada "; 
        sql += "WHERE  orden_compra = " + devolucion.getOrden_compra() + " AND status = TRUE ";
        sql += "GROUP BY fk_almacen,fk_ubicacion, orden_compra,fk_proyecto,fk_usuario,fk_material,numero_material,descripcionmaterial,codigo_umb,posicion,fecha_entrada,descripcionalmacen,descripcionubicacion,descripcionproyecto,usuario,id_documento;";
               
        conexion cnn = new conexion(sql,"buscar");
          
        if (cnn.estado){
            
                while(cnn.rs.next()){
                         
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),   //fk_almacen
                        cnn.rs.getInt(2),//fk_ubicacion
                        cnn.rs.getInt(3), //orden_compra
                        cnn.rs.getInt(4),   //fk_proyecto
                        cnn.rs.getInt(5), //usuario
                        id_proveedor,
                        cnn.rs.getInt(6),//fk_material
                        cnn.rs.getInt(7), //numero_material
                        cnn.rs.getString(8),  //descripcionmaterial
                        cnn.rs.getInt(9),  //cantidad_ingresada
                        cnn.rs.getString(10),  //codigo_umb
                        cnn.rs.getInt(11),  //posicion  
                        cnn.rs.getDate(12),  //fecha_entrada  
                        cnn.rs.getString(13),  //descripcionalmacen  
                        cnn.rs.getString(14),//descripcionubicacion
                        cnn.rs.getString(15), //descripcionproyecto
                        cnn.rs.getString(16), //usuario
                        cnn.rs.getInt(17) //id_documento
                        
                        
                    });
                   
                }  
                 cnn.cerrar();
        }
    } 
    
    public void consultar_detalle_devolucion(JTable tabla) throws SQLException{
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
        sql = "SELECT id_devolucion,fk_material,numero_material,descripcionmaterial,cantidad_devuelta,cantidad_reingresada,codigo_umb,CONCAT(descripcionmotivo,' ',otromotivo) as motivo,fecha_entrada,nro_documentoentrada,fecha_devuelta,descripcionproyecto,orden_compra,descripcionalmacen,descripcionubicacion,nombres ";
        sql += "FROM vw_devolucion "; 
        sql += "WHERE  orden_compra = " + devolucion.getOrden_compra() + " AND estatus = TRUE; ";
               
        conexion cnn = new conexion(sql,"buscar");
          
        if (cnn.estado){
            
                while(cnn.rs.next()){
                        
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),   //id_devolucion
                        cnn.rs.getInt(2),   //id_material
                        cnn.rs.getInt(13),  //oc
                        cnn.rs.getInt(3),   //numero_material
                        cnn.rs.getString(4),//descripcionmaterial
                        cnn.rs.getDouble(5), //cantidad_devuelta
                        cnn.rs.getDouble(6), //cantidad_reingresada
                        cnn.rs.getString(7),   //codigo_umb
                        cnn.rs.getString(8), //motivo
                        cnn.rs.getDate(9), //fecha_entrada
                        cnn.rs.getInt(10),//nro_documentoentrada
                        cnn.rs.getDate(11), //fecha_devuelta
                        cnn.rs.getString(12),  //descripcionproyecto
                        funciones.formato_ordencompra(cnn.rs.getInt(13)),  //orden_compra
                        cnn.rs.getString(14),  //descripcionalmacen
                        cnn.rs.getString(15),  //descripcionubicacion  
                        cnn.rs.getString(16)  //usuario      
                    });
                   
                }  
                 cnn.cerrar();
        }
    } 
    
    public Integer actualizar_posicion(){
        Integer documento=0;
        
        //ACTUALIZA LA CANTIDAD REINGRESADA
        sql = "UPDATE tbl_devolucion ";
        sql += "SET cantidad_reingresada = cantidad_reingresada + " + devolucion.getCantidad_reingresada() + ",fecha_reingreso = '" + devolucion.getFecha_reingreso() + "' ";
        sql += "WHERE id_devolucion = " + devolucion.getId_devolucion() + ";";
        
        conexion cnn = new conexion(sql,"");
        cnn.cerrar();
        
        //SI LA CANTIDAD REINGRESADA ES IGUAL A LA DEVUELTA. SE ANULA LA DEVOLUCION
        sql = "UPDATE tbl_devolucion ";
        sql += "SET estatus = FALSE" + " ";
        sql += "WHERE id_devolucion = " + devolucion.getId_devolucion() + " AND cantidad_reingresada = cantidad_devuelta;";
        
        cnn = new conexion(sql,"");
        cnn.cerrar();
        
        //REALIZAR ENTRADA A INVENTARIO DEL MATERIAL REINGRESADO
        //OC, MATERIAL, DOC ENTRADA, CDM 14
        
        sql = "SELECT fk_material, fk_valoracion, fk_moneda, fk_almacen, fk_ubicacion, fk_procedencia, fk_proyecto, fk_usuario, codigo_alterno, posicion, orden_compra, nro_factura, precio_unitario, monto, flete, total ";
        sql += "FROM tbl_entrada ";
        sql += "WHERE orden_compra = " + devolucion.getOrden_compra() + " AND fk_material = " + devolucion.getFk_material() + " AND id_documento = " + devolucion.getNro_documentoentrada() + " AND fk_movimiento = 14"; 
        
        cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            try {
                if(cnn.rs.next()){
                    documento = asignar_nro_documento_entrada();
                    sql = "CALL entrada_material_directo("+ cnn.rs.getInt(1) + "," + cnn.rs.getInt(2) + "," + cnn.rs.getInt(3)  + "," + cnn.rs.getInt(4) + "," + cnn.rs.getInt(5) + "," + cnn.rs.getInt(6) + ",1," + cnn.rs.getInt(7) + "," + cnn.rs.getInt(8) + ",'" + cnn.rs.getString(9) + "'," + cnn.rs.getInt(10) + "," + documento + "," + cnn.rs.getInt(11) + "," + cnn.rs.getInt(12) + ",'" + devolucion.getFecha_reingreso() + "'," + devolucion.getCantidad_reingresada() + "," + cnn.rs.getDouble(13) + "," + cnn.rs.getDouble(14) + "," + cnn.rs.getDouble(15) + "," + cnn.rs.getDouble(16) + ",'MATERIAL REINGRESADO POR DEVOLUCIÓN',TRUE);";
                    conexion cnn2 = new conexion(sql,"");
                    cnn2.cerrar();
                    
                }
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"ERROR EN LA CONSULTA. " + ex.getMessage());
            }
                 
        }
               
        cnn.cerrar();
             
             
        return documento;
    }
    
    
}
