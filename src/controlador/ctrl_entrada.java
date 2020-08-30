/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import model.class_entrada;
import model.class_material;
import view.frm_progress;

/**
 *
 * @author ruben
 */
public class ctrl_entrada {
    
    private class_entrada entrada;
    private Integer posicion_act;
    private String sql;
    private Integer almacen_actual;
    private Integer ubicacion_actual;
    private Integer ubicacion_destino;
    private String condicion;
    
    public ctrl_entrada(Integer id_entrada,Integer posicion, Integer id_material, String descripcion_material, Integer id_valoracion, String descripcion_valoracion, Integer id_moneda, String descripcion_moneda, Integer id_almacen, String descripcion_almacen, Integer ubicacion, String descripcion_ubicacion,Integer procedencia,String descripcion_procedencia, Integer clase_movimiento,String descripcion_movimiento,Integer id_proyecto,String descripcion_proyecto,Integer Id_usuario, String codigo_alterno,Integer id_documento, Integer id_ordendecompra, Integer nro_factura, String fecha_entrada, Integer cantidad_ingresada, Double precio_unitario, Double monto, Double flete, Double total, String observaciones,Boolean status) {
    
        entrada = new class_entrada(id_entrada,posicion,id_material, descripcion_material,id_valoracion, descripcion_valoracion,id_moneda,descripcion_moneda,id_almacen,descripcion_almacen,ubicacion,descripcion_ubicacion,procedencia,descripcion_procedencia,clase_movimiento,descripcion_movimiento,id_proyecto,descripcion_proyecto,Id_usuario,codigo_alterno,id_documento,id_ordendecompra,nro_factura,fecha_entrada,cantidad_ingresada,precio_unitario,monto,flete,total,observaciones,status);
   
    }
    
    public class_entrada crear_posicion(JTable tabla) throws SQLException{
         
        conexion cnn;
        Integer i = 1;
  
        
            if(entrada.getId_documento().equals(0)){
                entrada.setId_documento(asignar_nro_documento());
            }
        
            if (entrada.getId_entrada().equals(0)){
            
                entrada.setPosicion(1);
             
           
                entrada.setStatus(true);
            
            
            }
            else{
                entrada.setPosicion(entrada.getPosicion()+1);
   
                entrada.setStatus(true);
            }    
            
            //while(i <= entrada.getCantidad_ingresada()){
           
            
                buscar_sql(35);
                cnn = new conexion(sql,"");
                cnn.cerrar();
                i++;
            //}     
           
            
            consultar_entrada_detalle(tabla);
        
            //actualizar maestro de material
            buscar_sql(18);
            cnn = new conexion(sql,"");
            cnn.cerrar();
        
           /* sql = "CALL actualizar_stockdisponible_material()";
            cnn = new conexion(sql,"");
            cnn.cerrar();*/
            
            return entrada;
  
        
    }
    
     public void consultar_entrada_detalle(JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        //modelotabla.setRowCount(0);
        
        ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,entrada.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
        modelo_material = material.consultar_descripcionmaterial();
        

        
       
                    modelotabla.addRow(new Object[]{
                        entrada.getPosicion(),   //posicion
                        entrada.getId_material(),   //nromaterial
                        modelo_material.getDescripcion(),//material
                        entrada.getCantidad_ingresada(),   //cantidad a comprar
                        modelo_material.getDescripcion_medida(), //umb
                        entrada.getFecha_entrada(),//justificacion
                        entrada.getDescripcion_almacen(),
                        entrada.getDescripcion_ubicacion(),
                        entrada.getDescripcion_valoracion(),
                        entrada.getObservaciones(),
                    });
        
        
    }
    
    public class_entrada borrar_posicion(JTable tabla,Integer pos){
        Integer i;
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        entrada.setPosicion(Integer.parseInt(modelotabla.getValueAt(pos,0).toString()));
        
        modelotabla.removeRow(pos);
        tabla.revalidate();
        
        buscar_sql(31);
        conexion cnn = new conexion(sql,"");
        cnn.cerrar();
        
        
       
        for(i = 0; i <= modelotabla.getRowCount()-1 ;i++){
           modelotabla.setValueAt(i+1, i,0);
        } 
        
        buscar_sql(32);
        
        cnn = new conexion(sql,"buscar");
   
            posicion_act = 1;
            if (cnn.estado){
            
                try{
                    
                    while(cnn.rs.next()){
                        entrada.setPosicion(cnn.rs.getInt(1));
                        buscar_sql(33);                       
                        conexion cnn2 = new conexion(sql,"");
                        posicion_act += 1;
                        cnn2.cerrar();
                    }
                    cnn.cerrar();
                    entrada.setStatus(true);
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();
        
        //actualizar maestro de material
            buscar_sql(34);
            cnn = new conexion(sql,"");
            cnn.cerrar();
        
            /*sql = "CALL actualizar_stockdisponible_material()";
            cnn = new conexion(sql,"");
            cnn.cerrar();*/
            
        return entrada;
    }  
     

    public JComboBox cargarmaterial_almacen(JComboBox combo,String pordefecto,Integer consulta){
        String cadena;
        
        
        combo.removeAllItems();
        combo.addItem("Seleccione...");
        cadena = "";
       
        if (consulta.equals(1)){
            buscar_sql(6);
        }
        else{
            if (consulta.equals(2)){    
                buscar_sql(7);
            }
            else{
                if (consulta.equals(3)){
                    buscar_sql(8);
                }
                else{
                     if (consulta.equals(4)){
                        buscar_sql(11);
                     }
                     else{
                         if(consulta.equals(5)){
                             buscar_sql(20);
                         }
                         else{
                            if(consulta.equals(6)){
                                buscar_sql(27); 
                            }    
                            else{ 
                                if(consulta.equals(7)){
                                    buscar_sql(28); 
                                }
                                else{
                                    if(consulta.equals(8)){
                                        buscar_sql(37); 
                                    }
                                    else{
                                        buscar_sql(12);
                                    }
                                    
                                }    
                            }        
                         }   
                     }
                }
            }
        }
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    if(!cnn.rs.getString(2).trim().equals("Cadena")){
                        if (!cnn.rs.getString(2).trim().equals("")){
                            cadena = String.valueOf(cnn.rs.getInt(1)) + "  -  " + cnn.rs.getString(2).trim();
                        }
                        else{
                            cadena = String.valueOf(cnn.rs.getInt(1));
                        }
                        
                    }
                    else{
                        cadena = String.valueOf(cnn.rs.getString(1));
                    }
                    combo.addItem(cadena); 
                    
                    if (cnn.rs.getString(2).trim().equals(pordefecto)){
                        combo.setSelectedItem(cadena);
                    }
                }
                cnn.cerrar();
                return combo;
            } 
            catch (SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                return combo;
            }    
        }   
        else{
             cnn.cerrar();
             return combo;
        }
    }
    
    public Boolean actualizar_ubicacionmaterial(Integer id_almacenactual,Integer id_ubicacionactual){
        
        almacen_actual  = id_almacenactual;
        ubicacion_actual = id_ubicacionactual;
        
        buscar_sql(9);
        conexion cnn = new conexion(sql,"");
        
        if (cnn.estado){
            cnn.cerrar();
            cnn = new conexion(sql,"");
            cnn.cerrar();
           
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN  DEL PROYECTO ");
            cnn.cerrar();
            return false;
        }
        
          
    }
    
    public class_entrada crear_entrada_express_detalle(JTable tabla) {
        conexion cnn;
        Integer resp = 0;
        Integer i;
              
            buscar_sql(10);
            cnn = new conexion(sql,"buscar");
           
            if(entrada.getId_documento().equals(0)){
                entrada.setId_documento(asignar_nro_documento());
            }
 
            if (entrada.getId_entrada().equals(0)){
            
                entrada.setPosicion(1);
             
           
                entrada.setStatus(true);
            
            
            }
            else{
                entrada.setPosicion(entrada.getPosicion()+1);
   
                entrada.setStatus(true);
            }   
            
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                        resp = JOptionPane.showConfirmDialog(null, "EXISTEN REGISTROS DEL MATERIAL EN LA BASE DE DATOS. DESEA AGREGAR(SI/NO)");
                    }
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();   
                   
            //entrada.setPosicion(1);
            
            //i=1;
            if (resp.equals(0)){
                //while(i <= entrada.getCantidad_ingresada()){
                
    
           
               
          
                buscar_sql(35);
                cnn = new conexion(sql,"");
                    
                //    i++;
                //}
                cnn.cerrar();
               
                //actualizar maestro de material
                buscar_sql(18);
                cnn = new conexion(sql,"");
                cnn.cerrar();
                
                /*sql = "CALL actualizar_stockdisponible_material()";
                cnn = new conexion(sql,"");
                cnn.cerrar();*/
                
                entrada.setStatus(true);
                
            }
            else{
                entrada.setStatus(false);
            }
               
         consultar_entrada_detalle(tabla);
         
         return entrada;
        
    }
     
    
    public void ver_detalle_entrada(JTable data){
        
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();
       
        modelotabla.setRowCount(0);
        
        buscar_sql(13);
        
        conexion cnn = new conexion(sql,"buscar");
            
            if (cnn.estado){
            
                try{
                    while(cnn.rs.next()){
                       modelotabla.addRow(new Object[]{
                            cnn.rs.getInt(1),   //IDDOCUMENTO
                            cnn.rs.getInt(2),   //NUMEROMATERIAL
                            cnn.rs.getString(3),   //DESCRIPCIONMATERIAL
                            cnn.rs.getString(4),//DESCRIPCIONALMACEN
                            cnn.rs.getString(5),   //DESCRIPCIONUBICACION
                            cnn.rs.getString(6),//DESCRIPCIONCLASE
                            cnn.rs.getString(7),//DESCRIPCIONARTICULO
                            cnn.rs.getString(8),//DESCRIPCIONVALORACION
                            cnn.rs.getString(9),//DESCRIPCIONPROCEDENCIA
                            cnn.rs.getString(10),//ORDEN DE COMORA
                            cnn.rs.getString(11),//FECHA
                            cnn.rs.getInt(12),//CANTIDAD
                            cnn.rs.getInt(13),//PROCEDENCIA
                            cnn.rs.getInt(14)//VALORACION
                        });  
                    }
                    cnn.cerrar();
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();      
        
        
    }
     
    /*public void actualizar_documento_entrada(JTable data){
        
        buscar_sql(14);
        conexion cnn = new conexion(sql,"");
        
        crear_entrada_express();
                
        ver_detalle_entrada(data);        
    }*/
    
    
    public Integer asignar_nro_documento(){
        Integer nro_documento=0;
        
        buscar_sql(15);
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
    
    public void buscar_documento_material_entrada(JTable data){
        
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();
       
        modelotabla.setRowCount(0);
        
        buscar_sql(16);
        
        conexion cnn = new conexion(sql,"buscar");
            
            if (cnn.estado){
            
                try{
                    while(cnn.rs.next()){
                       modelotabla.addRow(new Object[]{
                            cnn.rs.getInt(1),   //IDDOCUMENTO
                            cnn.rs.getInt(2),   //NUMEROMATERIAL
                            cnn.rs.getString(3),   //DESCRIPCIONMATERIAL
                            cnn.rs.getString(4),//DESCRIPCIONALMACEN
                            cnn.rs.getString(5),   //DESCRIPCIONUBICACION
                            cnn.rs.getString(6),//DESCRIPCIONCLASE
                            cnn.rs.getString(7),//DESCRIPCIONARTICULO
                            cnn.rs.getString(8),//DESCRIPCIONVALORACION
                            cnn.rs.getString(9),//DESCRIPCIONPROCEDENCIA
                            cnn.rs.getString(10),//ORDEN DE COMORA
                            cnn.rs.getString(11),//FECHA
                            cnn.rs.getInt(12),//CANTIDAD
                            cnn.rs.getInt(13),//PROCEDENCIA
                            cnn.rs.getInt(14)//VALORACION
                        });  
                    }
                    cnn.cerrar();
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();      
        
        
    }
    
    public void anular_documento_material_entrada(JTable data){
        
        buscar_sql(17);
        conexion cnn = new conexion(sql,"");
        
        ver_detalle_entrada(data);        
    }
    
    public class_entrada consultar_material_almacen(){
        
                
        buscar_sql(21);
        
        conexion cnn = new conexion(sql,"buscar");
            
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                            entrada.setId_entrada(cnn.rs.getInt(1)); 
                            entrada.setId_material(cnn.rs.getInt(2)); 
                            entrada.setId_valoracion(cnn.rs.getInt(3)); 
                            entrada.setId_moneda(cnn.rs.getInt(4)); 
                            entrada.setId_almacen(cnn.rs.getInt(5));
                            entrada.setUbicacion(cnn.rs.getInt(6));
                            entrada.setProcedencia(cnn.rs.getInt(7));
                            entrada.setClase_movimiento(cnn.rs.getInt(8));
                            entrada.setId_proyecto(cnn.rs.getInt(9));
                            entrada.setId_usuario(cnn.rs.getInt(10));
                            entrada.setCodigo_alterno(cnn.rs.getString(11));
                            entrada.setPosicion(cnn.rs.getInt(12));
                            entrada.setId_documento(cnn.rs.getInt(13));
                            entrada.setId_ordendecompra(cnn.rs.getInt(14));
                            entrada.setNro_factura(cnn.rs.getInt(15));
                            entrada.setFecha_entrada(cnn.rs.getString(16));
                            entrada.setCantidad_ingresada(cnn.rs.getInt(17));
                            entrada.setPrecio_unitario(cnn.rs.getDouble(18));
                            entrada.setMonto(cnn.rs.getDouble(19));
                            entrada.setFlete(cnn.rs.getDouble(20));
                            entrada.setTotal(cnn.rs.getDouble(21));
                            entrada.setObservaciones(cnn.rs.getString(22));
                                                     
                    }
                    cnn.cerrar();
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();      
        
            return entrada;
    }
    
    public JComboBox cargarmaterial_proyecto(JComboBox combo,String pordefecto,Integer consulta){
        String cadena;
        
        
        combo.removeAllItems();
        combo.addItem("Seleccione...");
        cadena = "";
       
        if (consulta.equals(1)){
            buscar_sql(22);
        }
        else{
            if (consulta.equals(2)){    
                buscar_sql(25);
            }
            /*else{
                if (consulta.equals(3)){
                    buscar_sql(8);
                }
                else{
                     if (consulta.equals(4)){
                        buscar_sql(11);
                     }
                     else{
                         if(consulta.equals(5)){
                             buscar_sql(20);
                         }
                         else{
                            buscar_sql(12);
                         }   
                     }
                }
            }*/
        }
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    if(!cnn.rs.getString(2).trim().equals("Cadena")){
                        if (!cnn.rs.getString(2).trim().equals("")){
                            cadena = String.valueOf(cnn.rs.getInt(1)) + "  -  " + cnn.rs.getString(2).trim();
                        }
                        else{
                            cadena = String.valueOf(cnn.rs.getInt(1));
                        }
                        
                    }
                    else{
                        cadena = String.valueOf(cnn.rs.getString(1));
                    }
                    combo.addItem(cadena); 
                    
                    if (cnn.rs.getString(2).trim().equals(pordefecto)){
                        combo.setSelectedItem(cadena);
                    }
                }
                cnn.cerrar();
                return combo;
            } 
            catch (SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                return combo;
            }    
        }   
        else{
             cnn.cerrar();
             return combo;
        }
    }
    
    public Integer consultarmaterial_cantidadproyecto(){
        Integer resul;
        buscar_sql(23);
        
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                if(cnn.rs.next()){
                    resul = cnn.rs.getInt(1);
                    cnn.cerrar();
                    return resul;
                }
                else{
                    cnn.cerrar();
                    return 0;
                }
                       
            } 
            catch (SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                return 0;
            }    
        }   
        else{
             cnn.cerrar();
             return 0;
        }
        
    }
    
    
    public Integer consultarmaterial_cantidadubicacion(){
        Integer resul;
        buscar_sql(24);
        
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                if(cnn.rs.next()){
                    resul = cnn.rs.getInt(1);
                    cnn.cerrar();
                    return resul;
                }
                else{
                    cnn.cerrar();
                    return 0;
                }
                       
            } 
            catch (SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                return 0;
            }    
        }   
        else{
             cnn.cerrar();
             return 0;
        }
        
    }
    
    public class_entrada consultar_material_proyecto(){
        
                
        buscar_sql(26);
        
        conexion cnn = new conexion(sql,"buscar");
            
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                            entrada.setId_entrada(cnn.rs.getInt(1)); 
                            entrada.setId_material(cnn.rs.getInt(2)); 
                            entrada.setId_valoracion(cnn.rs.getInt(3)); 
                            entrada.setId_moneda(cnn.rs.getInt(4)); 
                            entrada.setId_almacen(cnn.rs.getInt(5));
                            entrada.setUbicacion(cnn.rs.getInt(6));
                            entrada.setProcedencia(cnn.rs.getInt(7));
                            entrada.setClase_movimiento(cnn.rs.getInt(8));
                            entrada.setId_proyecto(cnn.rs.getInt(9));
                            entrada.setId_usuario(cnn.rs.getInt(10));
                            entrada.setCodigo_alterno(cnn.rs.getString(11));
                            entrada.setPosicion(cnn.rs.getInt(12));
                            entrada.setId_documento(cnn.rs.getInt(13));
                            entrada.setId_ordendecompra(cnn.rs.getInt(14));
                            entrada.setNro_factura(cnn.rs.getInt(15));
                            entrada.setFecha_entrada(cnn.rs.getString(16));
                            entrada.setCantidad_ingresada(cnn.rs.getInt(17));
                            entrada.setPrecio_unitario(cnn.rs.getDouble(18));
                            entrada.setMonto(cnn.rs.getDouble(19));
                            entrada.setFlete(cnn.rs.getDouble(20));
                            entrada.setTotal(cnn.rs.getDouble(21));
                            entrada.setObservaciones(cnn.rs.getString(22));
                                                     
                    }
                    cnn.cerrar();
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();      
        
            return entrada;
    }
    
    
    public Boolean consultar_entrada_material(String fechadesde,String fechahasta,JTable tabla){
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
        if(!entrada.getId_material().equals(0)){
            
            ctrl_material material2 = null;
            class_material modelo_material2 = null;
        
            material2 = new ctrl_material(0,entrada.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
            modelo_material2 = material2.consultar_descripcionmaterial();
            
            entrada.setId_material(modelo_material2.getId_material());
        }
        
        
        if(!fechadesde.equals("")){
            if(!fechahasta.equals("")){
                /*sql = "SELECT a.numero_material, a.descripcionmaterial,count(a.numero_material) as cantidad, a.codigo_umb,a.descripcionclase, a.descripcionarticulo, ";
                sql += "a.descripcionvaloracion, descripcionmoneda, a.descripcionalmacen, a.descripcionubicacion, a.descripcionprocedencia, ";
                sql += "a.descripcionproyecto,  a.codigo_movimiento, b.marca, b.modelo, b.stock_inicial, b.stock_maximo, ";
                sql += "b.stock_minimo,b.stock_pedido,a.fecha_entrada ";*/
                sql = "SELECT a.numero_material,CONCAT(left(a.descripcionclase,2),'-',a.numero_material,'-',left(a.descripcionarticulo,3)) as codigomaestro, ";
                sql += "a.descripcionmaterial,b.marca,b.modelo,a.codigo_umb,a.descripcionclase, a.descripcionarticulo,a.descripcionalmacen, ";
                sql += "a.descripcionubicacion, a.descripcionprocedencia, a.descripcionproyecto, count(a.numero_material) as cantidad, ";
                sql += "a.precio_unitario,descripcionmoneda, a.descripcionvaloracion ";
                sql += "FROM sistimaca.vw_entrada a ";
                sql += "INNER JOIN tbl_maestromaterial b ON ";
                sql += "a.fk_material = b.id_material ";
                sql += "WHERE 1=1 ";
                sql += "AND fecha_entrada BETWEEN '" + fechadesde + "' AND '" + fechahasta + "' ";
                
                if(!entrada.getId_material().equals(0)){
                    sql += "AND fk_material = " + entrada.getId_material() + " ";
                }    
                if (!entrada.getId_proyecto().equals(0)){
                    sql += "AND fk_proyecto = " + entrada.getId_proyecto() + " ";
                }   
                if (!entrada.getId_almacen().equals(0)){
                    sql += "AND fk_almacen = " + entrada.getId_almacen() + " ";
                }
                
                sql += "AND a.status = true ";
                sql += "GROUP BY a.numero_material, a.descripcionmaterial,a.descripcionclase, a.descripcionarticulo, ";
                sql += "a.descripcionvaloracion, descripcionmoneda, a.descripcionalmacen, a.descripcionubicacion, a.descripcionprocedencia, ";
                sql += "a.descripcionproyecto, a.codigo_umb, a.codigo_movimiento, b.marca, b.modelo, b.stock_inicial, b.stock_maximo, ";
                sql += "b.stock_minimo,b.stock_pedido,a.fecha_entrada;";
                
                conexion cnn = new conexion(sql,"buscar");
            
                if (cnn.estado){
            
                    try{
                        while(cnn.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn.rs.getInt(1),   //numerodematerial
                            cnn.rs.getString(2),   //descripcionmaterial
                            cnn.rs.getString(3),   //cantidad
                            cnn.rs.getString(4),//umb
                            cnn.rs.getString(5),   //DESCRIPCIONclase
                            cnn.rs.getString(6),//DESCRIPCIONarticulo
                            cnn.rs.getString(7),//DESCRIPCIONvaloracion
                            cnn.rs.getString(8),//DESCRIPCIONmoneda
                            cnn.rs.getString(9),//DESCRIPCIONalmacen
                            cnn.rs.getString(10),//ubicacion
                            cnn.rs.getString(11),//procedencia
                            cnn.rs.getString(12),//proyecto
                            cnn.rs.getInt(13),//codigomovimiento
                            cnn.rs.getDouble(14),//marca
                            cnn.rs.getString(15),//modelo
                            cnn.rs.getString(16)
                        });   
                        
                        }
                        cnn.cerrar();
                        return true;
                    }     
                    catch (SQLException err){
                        JOptionPane.showMessageDialog(null, err.getMessage());   
                        cnn.cerrar();
                        return false;
                    }
                }    
            
                cnn.cerrar();  
                return false;
                         
            }
            else{
                JOptionPane.showMessageDialog(null,"INGRESAR LA FECHA HASTA");
                return false;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"INGRESAR LA FECHA DESDE");
            return false;
        }
        
        
    }
    
    public Integer consultar_material_almacenubicacionproyecto(){
        
        buscar_sql(29);
        Integer material;
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                if(cnn.rs.next()){
                   material =  cnn.rs.getInt(1);
                   cnn.cerrar();
                   return material;
                }
                else{
                    cnn.cerrar();
                    return 0;
                }
                       
            } 
            catch (SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                return 0;
            }    
        }   
        else{
             cnn.cerrar();
             return 0;
        }
        
    }
    
    public Integer consultar_cantidadentranteordendecompra() throws SQLException{
        Integer resul;
        
        conexion cnn;
                
        buscar_sql(19);
        cnn = new conexion(sql,"buscar");
           
        if (cnn.estado){
            try{
                if(cnn.rs.next()){
                    resul = cnn.rs.getInt(1);
                    cnn.cerrar();
                    return resul;
                }
                cnn.cerrar();
            }    
            catch (SQLException err){
                cnn.cerrar();
                return 0;
            }
        }    
        return 0;
    }    
    
    public void consultar_entrada_material_almacen(String fechadesde,String fechahasta,JTable tabla){
        int i=0;
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
        
        modelotabla.setRowCount(0);
        
        JLabel label_verde = new JLabel();
        JLabel label_amarillo = new JLabel();
        JLabel label_rojo = new JLabel();
        
                
        label_verde.setIcon(new ImageIcon("\\\\192.168.0.3\\dist\\imagenes\\Green_Ball.png"));
        label_amarillo.setIcon(new ImageIcon("\\\\192.168.0.3\\dist\\imagenes\\Yellow_Ball.png"));
        label_rojo.setIcon(new ImageIcon("\\\\192.168.0.3\\dist\\imagenes\\Red_Ball.png"));
 
        Object[] rows = new Object[3];
        
        rows[0] = label_verde;
        rows[1] = label_amarillo;
        rows[2] = label_rojo;
        
        //this.condicion = " WHERE status = TRUE ";
        this.condicion = " WHERE 1=1 ";
        
        
        if (!entrada.getId_material().equals(0)){
            this.condicion += " AND numero_material LIKE '%" + entrada.getId_material() + "%' ";
        }
        
        if (!entrada.getId_documento().equals(0)){
            this.condicion += " AND id_documento LIKE '%" + entrada.getId_documento() + "%' ";
        }
        
        if (!entrada.getDescripcion_material().equals("")){
            this.condicion += " AND descripcionmaterial LIKE '%" + entrada.getDescripcion_material() + "%' ";
        }
 
         if (!fechadesde.equals("") && !fechahasta.equals("") ){
            this.condicion += " AND fecha_entrada BETWEEN '" + fechadesde + "' AND '" + fechahasta + "' ";
        }
        
        buscar_sql(30);
        
        conexion cnn = new conexion(sql,"buscar");
 
               if (cnn.estado){
            
                    try{
                        while(cnn.rs.next()){
                                                       
                                            
                                             
                            //cnn.rs.getString(12),//status
                            if (cnn.rs.getInt(13) == 101){ //en stock
                               i=0;
                            }
 
                            if (cnn.rs.getInt(13) == 201){ //en salida
                               i=1;
                            }
                             
                            
                            
                            
                        modelotabla.addRow(new Object[]{
                            cnn.rs.getInt(1),   //documento
                            cnn.rs.getInt(2),   //nro material
                            cnn.rs.getString(3),//descripcion
                            cnn.rs.getInt(4),   //posicion
                            cnn.rs.getInt(5),   //cantidad
                            cnn.rs.getString(6),//Umb
                            cnn.rs.getString(7),//fecha de ingreso
                            cnn.rs.getString(8),//proyecto
                            cnn.rs.getString(9),//DESCRIPCIONalmacen
                            cnn.rs.getString(10),//ubicacion
                            cnn.rs.getString(11),//valoracion
                            rows[i],
                            cnn.rs.getInt(13) //codmovimiento
                        });   
                        
                        }
                        cnn.cerrar();
                     }     
                    catch (SQLException err){
                        JOptionPane.showMessageDialog(null, err.getMessage());   
                        cnn.cerrar();
                     }
                }    
            
                cnn.cerrar();  
                       
    }

    public class_entrada crear_entrada_express() {
        conexion cnn;
        Integer resp = 0;
        Integer i;
        
            buscar_sql(10);
            cnn = new conexion(sql,"buscar");
           
            if(entrada.getId_documento().equals(0)){
                entrada.setId_documento(asignar_nro_documento());
            }
 
              
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                        resp = JOptionPane.showConfirmDialog(null, "EXISTEN REGISTROS DEL MATERIAL EN LA BASE DE DATOS. DESEA AGREGAR(SI/NO)");
                    }
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();   
                   
            entrada.setPosicion(1);
            
            i=1;
            if (resp.equals(0)){
                //while(i <= entrada.getCantidad_ingresada()){
                    buscar_sql(35);
                    cnn = new conexion(sql,"");
                    cnn.cerrar();
                    i++;
                //}
                //actualizar maestro de material
                buscar_sql(18);
                cnn = new conexion(sql,"");
                cnn.cerrar();
                
                entrada.setStatus(true);
                
                /*sql = "CALL actualizar_stockdisponible_material()";
                cnn = new conexion(sql,"");
                cnn.cerrar();*/
            }
            else{
                entrada.setStatus(false);
            }
               
                 
         return entrada;
        
    }
    
    public class_entrada crear_entrada_express_transferencia() {
        conexion cnn;
        Integer resp = 0;
        Integer i;
        
            buscar_sql(10);
            cnn = new conexion(sql,"buscar");
           
            if(entrada.getId_documento().equals(0)){
                entrada.setId_documento(asignar_nro_documento());
            }
 
              
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                        resp = JOptionPane.showConfirmDialog(null, "EXISTEN REGISTROS DEL MATERIAL EN LA BASE DE DATOS. DESEA AGREGAR(SI/NO)");
                    }
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();   
                   
            entrada.setPosicion(1);
            
            i=1;
            if (resp.equals(0)){
                //while(i <= entrada.getCantidad_ingresada()){
                    buscar_sql(35);
                    cnn = new conexion(sql,"");
                    cnn.cerrar();
                    i++;
                //}
                //actualizar maestro de material
                buscar_sql(36);
                cnn = new conexion(sql,"");
                cnn.cerrar();
                
                /*sql = "CALL actualizar_stockdisponible_material()";
                cnn = new conexion(sql,"");
                cnn.cerrar();*/
                
                entrada.setStatus(true);
                
            }
            else{
                entrada.setStatus(false);
            }
               
                 
         return entrada;
        
    }
    
    
    
    public class_entrada crear_entrada_express_proyecto() {
        conexion cnn;
        Integer resp = 0;
        Integer i;
        
            buscar_sql(10);
            cnn = new conexion(sql,"buscar");
           
            if(entrada.getId_documento().equals(0)){
                entrada.setId_documento(asignar_nro_documento());
            }
 
              
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                        //resp = JOptionPane.showConfirmDialog(null, "EXISTEN REGISTROS DEL MATERIAL EN LA BASE DE DATOS. DESEA AGREGAR(SI/NO)");
                    }
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();   
                   
            entrada.setPosicion(1);
            
            i=1;
            if (resp.equals(0)){
                //while(i <= entrada.getCantidad_ingresada()){
                    buscar_sql(35);
                    cnn = new conexion(sql,"");
                    cnn.cerrar();
                 //   i++;
                //}
                //actualizar maestro de material
                buscar_sql(36);
                cnn = new conexion(sql,"");
                cnn.cerrar();
                
                /*sql = "CALL actualizar_stockdisponible_material()";
                cnn = new conexion(sql,"");
                cnn.cerrar();*/
                
                entrada.setStatus(true);
                
            }
            else{
                entrada.setStatus(false);
            }
               
                 
         return entrada;
        
    }
 
    public class_entrada transferencia_ubicacion_enalmacen(Integer id_ubicacion,Integer stock_disponible){
        this.ubicacion_destino = id_ubicacion;
        
        if (entrada.getCantidad_ingresada().equals(stock_disponible)){
            buscar_sql(38);
            conexion cnn = new conexion(sql,"");
            cnn.cerrar();
        }
        else{
            buscar_sql(39);
            conexion cnn = new conexion(sql,"");
            cnn.cerrar();
        }
        return entrada;
    }
    
    public void buscar_sql(Integer consulta) {
        
        
        switch (consulta){
            
            case 1:
                sql = "SELECT MAX(id_entrada)FROM tbl_entrada;";
                break;
            
            case 2:
                
                ctrl_material material = null;
                class_material modelo_material = null;
        
                material = new ctrl_material(0,entrada.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                modelo_material = material.consultar_descripcionmaterial();
                
                sql = "INSERT INTO tbl_entrada VALUES(DEFAULT," + modelo_material.getId_material() + "," + entrada.getId_valoracion() + "," + entrada.getId_moneda()  + "," + entrada.getId_almacen() + "," + entrada.getUbicacion() + "," + entrada.getProcedencia() + "," + entrada.getClase_movimiento() + "," + entrada.getId_proyecto() + "," + entrada.getId_usuario() + ",'" + entrada.getCodigo_alterno() + "'," + entrada.getPosicion() + "," + entrada.getId_documento() + "," + entrada.getId_ordendecompra() + "," + entrada.getNro_factura() + ",'" + entrada.getFecha_entrada() + "'," + entrada.getCantidad_ingresada() + "," + entrada.getPrecio_unitario() + "," + entrada.getMonto() + "," + entrada.getFlete() + "," + entrada.getTotal() + ",'" + entrada.getObservaciones() + "'," + entrada.isStatus() + ");"; 
                                
                break;    
            
            case 3:
                sql = "DELETE FROM tbl_entrada WHERE id_entrada = " + entrada.getId_entrada() + " AND posicion = " + entrada.getPosicion() + ";";
                
                break;      
          
            case 4:
                sql = "SELECT id_entrada, fk_material, descripcionmaterial, numero_material, codigo_umb, fk_valoracion, descripcionvaloracion, fk_moneda, fk_almacen, descripcionalmacen, posicion, ubicacion, id_documento, orden_compra, proveedor, nro_factura, fecha_entrada, cantidad_ingresada, precio_unitario, monto, flete, total, observaciones ";
                sql += "FROM vw_entrada a ";
                sql += "WHERE a.id_entrada = " + entrada.getId_entrada();
                sql += " ORDER BY a.id_entrada,a.posicion;";
                
                break;    
            
            case 5:
               sql = "UPDATE tbl_entrada SET posicion =  " + posicion_act + " WHERE id_entrada = " + entrada.getId_entrada()  + " AND posicion = " + entrada.getPosicion() +";";
                break;   
           
            case 6:
                sql = "SELECT DISTINCT fk_almacen, descripcionalmacen FROM vw_entrada WHERE numero_material = " + entrada.getId_material() + " AND status = TRUE;";
                break;
            
            case 7:
                sql = "SELECT DISTINCT fk_ubicacion, descripcionubicacion FROM vw_entrada WHERE fk_almacen = " + entrada.getId_almacen() + " AND numero_material = " + entrada.getId_material() +" AND status = TRUE;";    
                break;
                
            case 8:
                sql = "SELECT DISTINCT fk_ubicacion, descripcionubicacion FROM vw_entrada WHERE fk_almacen = " + entrada.getId_almacen() +" AND status = TRUE;";    
                break;    
                
            case 9:
                sql = "UPDATE tbl_entrada SET fk_almacen = " + entrada.getId_almacen() + ",fk_ubicacion = " + entrada.getUbicacion() + " WHERE fk_material = " + entrada.getId_material() + " fk_almacen = " + almacen_actual + " AND fk_ubicacion = " + ubicacion_actual + ";";
                break;
             
            case 10:
                sql = "SELECT id_entrada from vw_entrada WHERE numero_material = " + entrada.getId_material() + " AND fk_valoracion = " + entrada.getId_valoracion() + " AND fk_almacen = " + entrada.getId_almacen() + " AND fk_ubicacion = " + entrada.getUbicacion() + " AND status=TRUE";
                break;
                
            case 11:
                sql = "SELECT DISTINCT fk_procedencia, descripcionprocedencia FROM vw_entrada WHERE numero_material = " + entrada.getId_material() + " AND fk_almacen = " + entrada.getId_almacen() +" AND fk_ubicacion = " + entrada.getUbicacion() + ";";    
                break; 
            
             case 12:
                sql = "SELECT DISTINCT fk_valoracion, descripcionvaloracion FROM vw_entrada WHERE numero_material = " + entrada.getId_material() + " AND fk_almacen = " + entrada.getId_almacen() +" AND fk_ubicacion = " + entrada.getUbicacion() + " AND fk_procedencia = " + entrada.getProcedencia() + ";";    
                break;     
                
             case 13: sql = "SELECT DISTINCT   id_documento,numero_material,descripcionmaterial,descripcionalmacen,descripcionubicacion,descripcionclase,descripcionarticulo,descripcionvaloracion,descripcionprocedencia,orden_compra,fecha_entrada,cantidad_ingresada, fk_procedencia,fk_valoracion ";
                      sql += "FROM sistimaca.vw_entrada ";
                      sql += "WHERE status=true;";   
             
             case 14: 
                 
                ctrl_material material2 = null;
                class_material modelo_material2 = null;
        
                material2 = new ctrl_material(0,entrada.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                modelo_material2 = material2.consultar_descripcionmaterial();
                 
                 
                 sql = "DELETE FROM tbl_entrada WHERE id_documento = 0 and fk_material = " + modelo_material2.getId_material() + ";";   
             
                break; 
                
             case 15:
                sql = "SELECT MAX(id_documento)FROM tbl_entrada;";
                break;    
                
             case 16:
                 sql = "SELECT nro_documento,numero_material,descripcionmaterial,descripcionalmacen,descripcionubicacion,descripcionclase,descripcionarticulo,valoracion,procedencia,orden_compra,fecha_entrada,cantidad_ingresada "; 
                 sql += "FROM sistimaca.vw_entrada ";
                 sql += "WHERE 1=1 ";
                 
                 if (!entrada.getId_documento().equals("")){
                     sql += "AND id_documento LIKE '" + entrada.getId_documento() + "%'";
                 }
                 
                 if (!entrada.getId_material().equals("")){
                    ctrl_material material3 = null;
                    class_material modelo_material3 = null;
        
                    material3 = new ctrl_material(0,entrada.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                    modelo_material3 = material3.consultar_descripcionmaterial();
 
                    sql += "AND fk_material LIKE '%" + modelo_material3.getId_material() + "%'";
                 }
                    
                 break;    
            case 17:
                ctrl_material material4 = null;
                class_material modelo_material4 = null;
        
                material4 = new ctrl_material(0,entrada.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                modelo_material4 = material4.consultar_descripcionmaterial();

                
                sql = "UPDATE tbl_entrada SET status = false WHERE id_documento = " + entrada.getId_documento() + " AND id_material = " + modelo_material4.getId_material() + ";";
                break;      
            case 18:
                
                sql = "UPDATE tbl_maestromaterial ";
                sql += "SET stock_disponible = stock_disponible + " + entrada.getCantidad_ingresada() + ", cantidad_entrante = cantidad_entrante + " + entrada.getCantidad_ingresada();
                sql += " WHERE numero_material = " + entrada.getId_material();
               
                break;
            case 19:
                                
                sql = "SELECT COUNT(numero_material) FROM sistimaca.vw_entrada ";   
                sql += "WHERE status = true AND posicion = " + entrada.getPosicion() + " AND orden_compra = " + entrada.getId_ordendecompra() + " AND numero_material = " + entrada.getId_material();
                
                break;
                
            case 20:
                sql = "SELECT DISTINCT fk_almacen, descripcionalmacen FROM vw_entrada WHERE fk_almacen <> " + entrada.getId_almacen() +";";
                break;   

            case 21:
                ctrl_material material5 = null;
                class_material modelo_material5 = null;
        
                material5 = new ctrl_material(0,entrada.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                modelo_material5 = material5.consultar_descripcionmaterial();
                       
                
                sql = "SELECT id_entrada, fk_material, fk_valoracion, fk_moneda, fk_almacen, fk_ubicacion, fk_procedencia, fk_movimiento, fk_proyecto, fk_usuario, codigo_alterno, posicion, id_documento, orden_compra, nro_factura, fecha_entrada, cantidad_ingresada, precio_unitario, monto, flete, total, observaciones ";
                sql += "FROM tbl_entrada ";
                sql += "WHERE fk_almacen = " + entrada.getId_almacen() + " AND fk_ubicacion = " + entrada.getUbicacion() + " AND fk_material = " + modelo_material5.getId_material() + " AND status = TRUE; ";
                break;
           
            case 22:
                sql = "SELECT DISTINCT fk_proyecto, descripcionproyecto FROM vw_entrada WHERE numero_material = " + entrada.getId_material() + " AND status = TRUE;";
                break;  
                
            case 23:
                sql = "SELECT COUNT(fk_material) FROM vw_entrada ";
                sql += "WHERE fk_proyecto = " + entrada.getId_proyecto() + " AND numero_material = " + entrada.getId_material() + " AND status = TRUE;";
                break;  
                
            case 24:
                sql = "SELECT COUNT(fk_material) FROM vw_entrada ";
                sql += "WHERE fk_ubicacion = " + entrada.getUbicacion() + " AND fk_almacen = " + entrada.getId_almacen() + " AND numero_material = " + entrada.getId_material() + " AND status = TRUE; "; 
                break;
           case 25:
                sql = "SELECT DISTINCT id_proyecto, descripcion FROM tbl_proyecto WHERE id_proyecto <> " + entrada.getId_proyecto() + ";";
                break; 
                
           case 26:
               
                ctrl_material material6 = null;
                class_material modelo_material6 = null;
        
                material6 = new ctrl_material(0,entrada.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                modelo_material6 = material6.consultar_descripcionmaterial();
                sql = "SELECT id_entrada, fk_material, fk_valoracion, fk_moneda, fk_almacen, fk_ubicacion, fk_procedencia, fk_movimiento, fk_proyecto, fk_usuario, codigo_alterno, posicion, id_documento, orden_compra, nro_factura, fecha_entrada, cantidad_ingresada, precio_unitario, monto, flete, total, observaciones ";
                sql += "FROM tbl_entrada ";
                sql += "WHERE fk_proyecto = " + entrada.getId_proyecto() + " AND fk_material = " + modelo_material6.getId_material()  + " AND status = TRUE; ";
                break;    
           
           case 27:
                sql = "SELECT DISTINCT fk_almacen, descripcionalmacen FROM vw_entrada WHERE numero_material = " + entrada.getId_material() + " AND fk_proyecto = " + entrada.getId_proyecto() +" AND status = TRUE;";
                break; 
           
           case 28:
                sql = "SELECT DISTINCT fk_ubicacion, descripcionubicacion FROM vw_entrada WHERE fk_almacen = " + entrada.getId_almacen() + " AND numero_material = " + entrada.getId_material() + " AND fk_proyecto = " + entrada.getId_proyecto() +" AND status = TRUE;";
                break;    
                
           case 29:
                sql = "SELECT COUNT(fk_material) FROM vw_entrada ";
                sql += "WHERE fk_ubicacion = " + entrada.getUbicacion() + " AND fk_almacen = " + entrada.getId_almacen() + " AND fk_proyecto = " + entrada.getId_proyecto() + " AND numero_material = " + entrada.getId_material() + " AND status = TRUE;";
                break;       
           
           case 30:
               sql = "SELECT id_documento,numero_material,descripcionmaterial,posicion,count(cantidad_ingresada) as cantidad,codigo_umb,fecha_entrada,descripcionproyecto,descripcionalmacen,descripcionubicacion,descripcionvaloracion,status,codigo_movimiento,observaciones ";
               sql += "FROM sistimaca.vw_entrada ";
               sql += this.condicion; 
               sql += "GROUP BY id_documento,numero_material,descripcionmaterial,posicion,codigo_umb,fecha_entrada,descripcionproyecto,descripcionalmacen,descripcionubicacion,descripcionvaloracion,status; ";

               break;

            case 31:
                sql = "DELETE FROM tbl_entrada WHERE id_documento = " + entrada.getId_documento() + " AND posicion = " + entrada.getPosicion() + ";";
                
                break;      
          
            case 32:
                sql = "SELECT DISTINCT posicion ";
                sql += "FROM vw_entrada a ";
                sql += "WHERE a.id_documento = " + entrada.getId_documento();
                sql += " ORDER BY a.posicion ASC;";
                
                break; 
                
             case 33:
               sql = "UPDATE tbl_entrada SET posicion =  " + posicion_act + " WHERE id_documento = " + entrada.getId_documento()  + " AND posicion = " + entrada.getPosicion() +";";
                break;
                
             case 34:
                
                sql = "UPDATE tbl_maestromaterial ";
                sql += "SET stock_disponible = stock_disponible - " + entrada.getCantidad_ingresada() + ", cantidad_entrante = cantidad_entrante - " + entrada.getCantidad_ingresada();
                sql += " WHERE numero_material = " + entrada.getId_material();
               
                break;   
             case 35:
                                            
                ctrl_material material10 = null;
                class_material modelo_material10 = null;
        
                material10 = new ctrl_material(0,entrada.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                modelo_material10 = material10.consultar_descripcionmaterial();
                
                sql = "CALL entrada_material_directo("+ modelo_material10.getId_material() + "," + entrada.getId_valoracion() + "," + entrada.getId_moneda()  + "," + entrada.getId_almacen() + "," + entrada.getUbicacion() + "," + entrada.getProcedencia() + "," + entrada.getClase_movimiento() + "," + entrada.getId_proyecto() + "," + entrada.getId_usuario() + ",'" + entrada.getCodigo_alterno() + "'," + entrada.getPosicion() + "," + entrada.getId_documento() + "," + entrada.getId_ordendecompra() + "," + entrada.getNro_factura() + ",'" + entrada.getFecha_entrada() + "'," + entrada.getCantidad_ingresada() + "," + entrada.getPrecio_unitario() + "," + entrada.getMonto() + "," + entrada.getFlete() + "," + entrada.getTotal() + ",'" + entrada.getObservaciones() + "'," + entrada.isStatus() + ");"; 
                                
                break;  
             case 36:
                
                sql = "UPDATE tbl_maestromaterial ";
                sql += "SET cantidad_entrante = cantidad_entrante + " + entrada.getCantidad_ingresada();
                sql += " WHERE numero_material = " + entrada.getId_material();
               
                break;  
             
             case 37:
                sql = "SELECT id_almacen,codigo_almacen FROM tbl_almacen WHERE id_almacen <> " + entrada.getId_almacen() +";";
                break;
             
             case 38:

                ctrl_material material11 = null;
                class_material modelo_material11 = null;
        
                material11 = new ctrl_material(0,entrada.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                modelo_material11 = material11.consultar_descripcionmaterial();
                   
                sql = "UPDATE tbl_entrada ";
                sql += "SET fk_movimiento = " + entrada.getClase_movimiento() + ",fk_ubicacion = " + ubicacion_destino + " ";
                sql += "WHERE fk_material = " + modelo_material11.getId_material() + " AND fk_almacen = " + entrada.getId_almacen() + " AND fk_ubicacion = " + entrada.getUbicacion() + " AND status  = TRUE; ";
                break;
            
             case 39:
                 
                ctrl_material material12 = null;
                class_material modelo_material12 = null;
        
                material12 = new ctrl_material(0,entrada.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                modelo_material12 = material12.consultar_descripcionmaterial();
                
                sql = "CALL actualizar_material_ubicacionalmacen("+ modelo_material12.getId_material() + "," + entrada.getId_valoracion() + "," + entrada.getId_moneda()  + "," + entrada.getId_almacen() + "," + entrada.getUbicacion() + "," + entrada.getProcedencia() + "," + entrada.getClase_movimiento() + "," + entrada.getId_proyecto() + "," + entrada.getId_usuario() + ",'" + entrada.getCodigo_alterno() + "'," + entrada.getPosicion() + "," + entrada.getId_documento() + "," + entrada.getId_ordendecompra() + "," + entrada.getNro_factura() + ",'" + entrada.getFecha_entrada() + "'," + entrada.getCantidad_ingresada() + "," + entrada.getPrecio_unitario() + "," + entrada.getMonto() + "," + entrada.getFlete() + "," + entrada.getTotal() + ",'" + entrada.getObservaciones() + "'," + entrada.isStatus() + "," + ubicacion_destino + ");"; 
  
                         
                         
        }
        System.out.println(sql);
    }    
    
}
