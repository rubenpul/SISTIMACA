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
import model.class_salida;

/**
 *
 * @author ruben
 */
public class ctrl_salida {
    
    private class_salida salida;
    class_entrada entrada;
    private Integer posicion_act;
    private String sql;
    private String condicion;
    public ctrl_salida(Integer id_salida, Integer posicion, Integer id_material, String descripcion_material,  Integer id_usuario, String nombre_usuario, Integer id_almacen, String descripcion_almacen, Integer id_ubicacion, String descripcion_ubicacion, String fecha_salida, Integer id_proyecto,Integer id_movimiento,Integer id_documento,Integer cantidad_salida,String destino, String justificacion, boolean status) {
    
        salida = new class_salida(id_salida, posicion, id_material, descripcion_material, id_usuario, nombre_usuario, id_almacen, descripcion_almacen, id_ubicacion, descripcion_ubicacion, fecha_salida, cantidad_salida, id_proyecto,id_movimiento,id_documento,destino, justificacion, status);
   
    }
    
    
    public Boolean consultar_salida_material(String fechadesde,String fechahasta,JTable tabla){
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
        if(!salida.getId_material().equals(0)){
            
            ctrl_material material2 = null;
            class_material modelo_material2 = null;
        
            material2 = new ctrl_material(0,salida.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
            modelo_material2 = material2.consultar_descripcionmaterial();
            
            salida.setId_material(modelo_material2.getId_material());
        }
        
        
        if(!fechadesde.equals("")){
            if(!fechahasta.equals("")){
                /*sql = "SELECT a.numero_material, a.descripcionmaterial,count(a.numero_material) as cantidad, a.codigo_umb,a.descripcionclase, a.descripcionarticulo, ";
                sql += "a.descripcionvaloracion, descripcionmoneda, a.descripcionalmacen, a.descripcionubicacion, a.descripcionprocedencia, ";
                sql += "a.descripcionproyecto,  a.codigo_movimiento, b.marca, b.modelo, b.stock_inicial, b.stock_maximo, ";
                sql += "b.stock_minimo,b.stock_pedido,a.fecha_entrada ";*/
                sql = "SELECT a.numero_material,CONCAT(left(a.descripcionclase,2),'-',a.numero_material,'-',left(a.descripcionarticulo,3)) as codigomaestro, ";
                sql += "a.descripcionmaterial,b.marca,b.modelo,a.unidadmedida,a.descripcionclase, a.descripcionarticulo,a.descripcionalmacen, ";
                sql += "a.descripcionubicacion, a.descripcionproyecto, a.cantidad_salida as cantidad ";
                sql += "FROM sistimaca.vw_salida a ";
                sql += "INNER JOIN tbl_maestromaterial b ON ";
                sql += "a.fk_material = b.id_material ";
                sql += "WHERE 1=1 ";
                sql += "AND a.fecha_salida BETWEEN '" + fechadesde + "' AND '" + fechahasta + "' ";
                
                if(!salida.getId_material().equals(0)){
                    sql += "AND a.fk_material = " + salida.getId_material() + " ";
                }    
                if (!salida.getId_proyecto().equals(0)){
                    sql += "AND a.fk_proyecto = " + salida.getId_proyecto() + " ";
                }   
                if (!salida.getId_almacen().equals(0)){
                    sql += "AND a.fk_almacen = " + salida.getId_almacen() + " ";
                }
                
                
                                
                conexion cnn = new conexion(sql,"buscar");
            
                if (cnn.estado){
            
                    try{
                        while(cnn.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn.rs.getInt(1),   //numerodematerial
                            cnn.rs.getString(2),   //codigomaestro
                            cnn.rs.getString(3),   //descripcionmaterial
                            cnn.rs.getString(4),//marca
                            cnn.rs.getString(5),   //modelo
                            cnn.rs.getString(6),//unidadmedida
                            cnn.rs.getString(7),//descripcionclase
                            cnn.rs.getString(8),//descripcionarticulo
                            cnn.rs.getString(9),//DESCRIPCIONalmacen
                            cnn.rs.getString(10),//ubicacion
                            cnn.rs.getString(11),//proyecto
                            cnn.rs.getInt(12)//cantidad
                            
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
    
    public class_salida crear_posicion(JTable tabla) throws SQLException{
        
        conexion cnn;
        Integer i;
               
        if (salida.getId_documento().equals(0)){
            salida.setId_documento(asignar_nro_documento());
            salida.setPosicion(1);
            salida.setStatus(true);
            
            
        }
        else{
            salida.setPosicion(salida.getPosicion()+1);
            salida.setStatus(true);
        }    
        
        
        if (salida.isStatus()){
            ctrl_material material = null;
             class_material modelo_material = null;

             material = new ctrl_material(0,salida.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);

             modelo_material = material.consultar_descripcionmaterial();                    

             entrada  = new class_entrada(0,0,modelo_material.getId_material(),"",0,"",1,"",salida.getId_almacen(),"",salida.getId_ubicacion(),"",0,"",3,"",0,"",0,"",0,0,0,"",salida.getCantidad_salida(),0.0,0.0,0.0,0.0,"",true);

             //DESINCORPA DE LA ENTRADA DE MATERIAL
             buscar_sql(19);
             conexion cnn2 = new conexion(sql,"");
             cnn2.cerrar();
         
             //ACTUALIZA LA TABLA DE SALIDA DE MATERIAL
            buscar_sql(2);
            cnn = new conexion(sql,"");
            cnn.cerrar();
             
        
            //actualizar maestro de material
            buscar_sql(14);
            cnn = new conexion(sql,"");
            cnn.cerrar();
        
            /*sql = "CALL actualizar_stockdisponible_material()";
            cnn = new conexion(sql,"");
            cnn.cerrar();*/
           
            
            
            consultar_salida_detalle(tabla);      
         
        }   
         return salida;
        
    
        
        
    }
    
    public void Actualizar_estatus_reserva(Integer id_reserva,Integer posicion){
         //DESHABILITA LA RESERVA - POSICION
            sql = "UPDATE tbl_reserva_det ";
            sql += "SET anulado = TRUE ";
            sql += "WHERE fk_reserva = " + id_reserva + " AND posicion = " + posicion;
            
            conexion cnn = new conexion(sql,"");
            cnn.cerrar();
            
    }
    
    public Integer asignar_nro_documento(){
        Integer nro_documento=0;
        
        buscar_sql(13);
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
    
    
     public void consultar_salida_detalle(JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        //modelotabla.setRowCount(0);
        
        ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,salida.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
        modelo_material = material.consultar_descripcionmaterial();
        

        
       
                    modelotabla.addRow(new Object[]{
                        salida.getPosicion(),   //posicion
                        salida.getId_material(),   //nromaterial
                        modelo_material.getDescripcion(),//material
                        salida.getCantidad_salida(),   //cantidad a comprar
                        modelo_material.getDescripcion_medida(),
                        salida.getFecha_salida(),//precio unitario
                        salida.getNombre_usuario(),//precio total
                        salida.getDescripcion_almacen(),
                        salida.getDestino(),
                        salida.getJustificacion(),
                    });
        
        
    }
    
    public class_salida borrar_posicion(JTable tabla,Integer pos){
        Integer i;
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        salida.setPosicion(Integer.parseInt(modelotabla.getValueAt(pos,0).toString()));
        
        modelotabla.removeRow(pos);
        tabla.revalidate();
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"");
        cnn.cerrar();
        
        //ACTUALIZAR MAESTRO MATERIAL
        buscar_sql(14);
        cnn = new conexion(sql,"");
        cnn.cerrar();
        
        /*sql = "CALL actualizar_stockdisponible_material()";
        cnn = new conexion(sql,"");
        cnn.cerrar();*/
        
        
        salida.setStatus(true);
        
       
        for(i = 0; i <= modelotabla.getRowCount()-1 ;i++){
           modelotabla.setValueAt(i+1, i,0);
        } 
        
        buscar_sql(4);
        
        cnn = new conexion(sql,"buscar");
        
            
            if (cnn.estado){
            
                try{
                    
                    while(cnn.rs.next()){
                        salida.setPosicion(cnn.rs.getInt(9));
                        buscar_sql(5);                       
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
        
        
        
        return salida;
    }  
     
     
    public class_salida crear_salida_express(JTable tabla) {
        conexion cnn;
        Integer resp = 0;
        Integer i;
        
            buscar_sql(10);
            cnn = new conexion(sql,"buscar");
            
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                        if (cnn.rs.getInt(1) < salida.getCantidad_salida()){
                             JOptionPane.showMessageDialog(null, "LA CANTIDAD DE MATERIAL DE SALIDA SOBREPASA AL REGISTRADO EN EL INVENTARIO");
                             salida.setStatus(false);
                        }  
                        else{
                             salida.setStatus(true);
                             
                             
                        }
                    }
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();   
                   
            if (salida.getId_documento().equals(0)){
                salida.setId_documento(asignar_nro_documento());
                salida.setPosicion(1);
                salida.setStatus(true);            
            }
            else{
                salida.setPosicion(salida.getPosicion()+1);
                salida.setStatus(true);
            }    

            
            
            i=1;
            if (salida.isStatus()){
                
  
                            ctrl_material material = null;
                            class_material modelo_material = null;
        
                            material = new ctrl_material(0,salida.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                            modelo_material = material.consultar_descripcionmaterial();                    
                    
                            entrada  = new class_entrada(0,0,modelo_material.getId_material(),"",0,"",1,"",salida.getId_almacen(),"",salida.getId_ubicacion(),"",0,"",3,"",0,"",0,"",0,0,0,"",salida.getCantidad_salida(),0.0,0.0,0.0,0.0,"",true);
                                             
                            buscar_sql(19);
                            conexion cnn2 = new conexion(sql,"");
                            cnn2.cerrar();
    
               
                
                
                buscar_sql(2);
                cnn = new conexion(sql,"");
                cnn.cerrar();
                
                //actualizar maestro de material
                buscar_sql(14);
                cnn = new conexion(sql,"");
                cnn.cerrar();
                
                /*sql = "CALL actualizar_stockdisponible_material()";
                cnn = new conexion(sql,"");
                cnn.cerrar();*/
                
                
                consultar_salida_detalle(tabla); 
                
                salida.setStatus(true);
            }
            else{
                salida.setStatus(false);
            }
               
         
         return salida;
        
    }
 
   public class_salida crear_salida_express_transferencia() {
        conexion cnn;
        Integer resp = 0;
        Integer i;
        
            buscar_sql(10);
            cnn = new conexion(sql,"buscar");
            
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                        if (cnn.rs.getInt(1) < salida.getCantidad_salida()){
                             JOptionPane.showMessageDialog(null, "LA CANTIDAD DE MATERIAL DE SALIDA SOBREPASA AL REGISTRADO EN EL INVENTARIO");
                             salida.setStatus(false);
                        }  
                        else{
                             salida.setStatus(true);
                             
                             
                        }
                    }
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();   
                   
            salida.setPosicion(1);
            
            i=1;
            if (salida.isStatus()){
                
                //buscar_sql(11);
                //cnn = new conexion(sql,"buscar");
                //i=1;
                //if (cnn.estado){
            
                    //try{
                    //    while(cnn.rs.next() && i <= salida.getCantidad_salida()){
 
                            ctrl_material material = null;
                            class_material modelo_material = null;
        
                            material = new ctrl_material(0,salida.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                            modelo_material = material.consultar_descripcionmaterial();                    
                    
                            entrada  = new class_entrada(0,0,modelo_material.getId_material(),"",0,"",1,"",salida.getId_almacen(),"",salida.getId_ubicacion(),"",0,"",3,"",0,"",0,"",0,0,0,"",salida.getCantidad_salida(),0.0,0.0,0.0,0.0,"",true);
                                             
                            buscar_sql(19);
                            conexion cnn2 = new conexion(sql,"");
                            cnn2.cerrar();
                            //i++;
                       // }
                       // cnn.cerrar();
                    //}    
                    //catch (SQLException err){
                      //  JOptionPane.showMessageDialog(null, err.getMessage());   
                      //  cnn.cerrar();
                 //   }
                //}   
                salida.setId_documento(asignar_nro_documento());
                buscar_sql(2);
                cnn = new conexion(sql,"");
                cnn.cerrar();
                
                //actualizar maestro de material
                buscar_sql(20);
                cnn = new conexion(sql,"");
                cnn.cerrar();
                
                
                salida.setStatus(true);
            }
            else{
                salida.setStatus(false);
            }
               
         
         return salida;
        
    }    
    
    public class_salida crear_salida_express_proyecto() {
        conexion cnn;
        Integer resp = 0;
        //Integer i;
        
            buscar_sql(16);
            cnn = new conexion(sql,"buscar");
            
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                        if (cnn.rs.getInt(1) < salida.getCantidad_salida()){
                             JOptionPane.showMessageDialog(null, "LA CANTIDAD DE MATERIAL DE SALIDA SOBREPASA AL REGISTRADO EN EL INVENTARIO");
                             salida.setStatus(false);
                        }  
                        else{
                             salida.setStatus(true);
                             
                             
                        }
                    }
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();   
                   
            salida.setPosicion(1);
            
            //i=1;
            if (salida.isStatus()){
                
               /* buscar_sql(17);
                cnn = new conexion(sql,"buscar");
                i=1;
                if (cnn.estado){
            
                    try{
                        while(cnn.rs.next() && i <= salida.getCantidad_salida()){
                             entrada  = new class_entrada(cnn.rs.getInt(1),0,0,"",0,"",1,"",0,"",0,"",0,"",0,"",0,"",0,"",0,0,0,"",0,0.0,0.0,0.0,0.0,"",true);*/
                                
                            ctrl_material material = null;
                            class_material modelo_material = null;
        
                            material = new ctrl_material(0,salida.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                            modelo_material = material.consultar_descripcionmaterial();                    
                    
                            entrada  = new class_entrada(0,0,modelo_material.getId_material(),"",0,"",1,"",0,"",0,"",0,"",9,"",salida.getId_proyecto(),"",0,"",0,0,0,"",salida.getCantidad_salida(),0.0,0.0,0.0,0.0,"",true);
                                   
                            buscar_sql(21);
                            conexion cnn2 = new conexion(sql,"");
                            cnn2.cerrar();
                            /*  i++;
                      }
                        cnn.cerrar();
                    }    
                    catch (SQLException err){
                        JOptionPane.showMessageDialog(null, err.getMessage());   
                        cnn.cerrar();
                    }
                } */  
                salida.setId_documento(asignar_nro_documento());
                buscar_sql(2);
                cnn = new conexion(sql,"");
                cnn.cerrar();
                
                //actualizar maestro de material
                buscar_sql(20);
                cnn = new conexion(sql,"");
                cnn.cerrar();
                
                
                salida.setStatus(true);
            }
            else{
                salida.setStatus(false);
            }
               
         
         return salida;
        
    }
    
public void consultar_salida_material_almacen(String fechadesde,String fechahasta,JTable tabla){
        
    DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
        //this.condicion = " WHERE status = TRUE ";
        this.condicion = " WHERE 1=1 ";
        
        
        if (!salida.getId_material().equals(0)){
            this.condicion += " AND numero_material LIKE '%" + salida.getId_material() + "%' ";
        }
        
        if (!salida.getId_documento().equals(0)){
            this.condicion += " AND id_documento = '%" + salida.getId_documento() + "%' ";
        }
        
        if (!salida.getDescripcion_material().equals("")){
            this.condicion += " AND descripcionmaterial LIKE '%" + salida.getDescripcion_material() + "%' ";
        }
 
         if (!fechadesde.equals("") && !fechahasta.equals("") ){
            this.condicion += " AND fecha_salida BETWEEN '" + fechadesde + "' AND '" + fechahasta + "' ";
        }
        
        buscar_sql(18);
        
        conexion cnn = new conexion(sql,"buscar");
 
               if (cnn.estado){
            
                    try{
                        while(cnn.rs.next()){
                            //cnn.rs.getString(12),//status
                            //cnn.rs.getString(13),//observaciones
                        modelotabla.addRow(new Object[]{
                            cnn.rs.getInt(1),   //documento
                            cnn.rs.getInt(2),   //nro material
                            cnn.rs.getString(3),//descripcion
                            cnn.rs.getInt(4),   //posicion
                            cnn.rs.getInt(5),   //cantidad
                            cnn.rs.getString(6),//Umb
                            cnn.rs.getString(7),//fecha de salida
                            cnn.rs.getString(8),//proyecto
                            cnn.rs.getString(9),//DESCRIPCIONalmacen
                            cnn.rs.getString(10),//ubicacion
                            cnn.rs.getString(11),//destino
                            cnn.rs.getString(13),//valoracion
                            cnn.rs.getString(12)//valoracion
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
     
      public void buscar_sql(Integer consulta) {
        
        
        switch (consulta){
            
            case 1:
                sql = "SELECT MAX(id_salida)FROM tbl_salida;";
                break;
            
            case 2:
                
                ctrl_material material = null;
                class_material modelo_material = null;
        
                material = new ctrl_material(0,salida.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                modelo_material = material.consultar_descripcionmaterial();
                
                sql = "INSERT INTO tbl_salida VALUES(DEFAULT," + modelo_material.getId_material()   + "," + salida.getId_usuario() + "," + salida.getId_almacen() + "," + salida.getId_ubicacion() + "," + salida.getId_proyecto() + "," + salida.getId_movimiento() + "," + salida.getId_documento() + "," + salida.getPosicion() + "," + salida.getCantidad_salida() + ",'" + salida.getFecha_salida() + "','" + salida.getDestino() + "','" + salida.getJustificacion() + "');"; 
                                
                break;    
            
            case 3:
                sql = "DELETE FROM tbl_salida WHERE id_salida = " + salida.getId_salida() + " AND posicion = " + salida.getPosicion() + ";";
                
                break;      
          
            case 4:
                sql = "SELECT id_salida, fk_material, numero_material, descripcionmaterial, fk_usuario, descripcionnombres, fk_almacen, descripcionalmacen, posicion, cantidad_salida, unidadmedida, fecha_salida, destino, justificacion ";
                sql += "FROM vw_salida a ";
                sql += "WHERE a.id_documento = " + salida.getId_documento();
                sql += " ORDER BY a.id_salida,a.posicion;";
                
                break;    
            
            case 5:
               sql = "UPDATE tbl_salida SET posicion =  " + posicion_act + " WHERE id_documento = " + salida.getId_documento()  + " AND posicion = " + salida.getPosicion() +";";
                break;   
           
            
            /*case 8:
                sql = "DELETE FROM tbl_ordencompra WHERE id_compra = " + ordendecompra.getId_compra() + " AND posicion = " + ordendecompra.getPosicion() + " AND fk_solicitud = " + ordendecompra.getId_solicitud() +";";
                
                break;      
            case 9:
               sql = "UPDATE tbl_ordencompra SET posicion =  " + posicion_act + " WHERE id_compra = " + ordendecompra.getId_compra() + " AND fk_solicitud = " + ordendecompra.getId_solicitud() + " AND posicion = " + ordendecompra.getPosicion() +";";
                break;  */   
                
            case 10:
                sql = "SELECT count(numero_material) ";
                sql += "FROM vw_entrada ";
                 sql += "WHERE status = true AND numero_material = " + salida.getId_material() + " AND fk_almacen = " + salida.getId_almacen() + " AND fk_ubicacion = " + salida.getId_ubicacion();
                
                break;
                
            case 11:
                
                ctrl_material material2 = null;
                class_material modelo_material2 = null;
        
                material2 = new ctrl_material(0,salida.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                modelo_material2 = material2.consultar_descripcionmaterial();
 
                sql = "SELECT id_entrada FROM tbl_entrada WHERE fk_material = " + modelo_material2.getId_material() + " AND fk_almacen = " + salida.getId_almacen() + " AND fk_ubicacion = " + salida.getId_ubicacion() + " AND status = true; ";
                
                break;
            
            case 12:    
                
                sql = "UPDATE  tbl_entrada SET status = false,fk_movimiento = " + entrada.getClase_movimiento() + " WHERE id_entrada = " + entrada.getId_entrada() + ";";
                break;    
                
            case 13:
                sql = "SELECT MAX(id_documento)FROM tbl_salida;";
                break; 
            
            case 14:
                       
                sql = "UPDATE tbl_maestromaterial ";
                sql += "SET stock_disponible = stock_disponible - " + salida.getCantidad_salida() + ",stock_usado = stock_usado + " + salida.getCantidad_salida() + ", cantidad_saliente = cantidad_saliente + " + salida.getCantidad_salida();
                sql += " WHERE numero_material = " + salida.getId_material();
               
                break;
                
            case 15:
                       
                sql = "UPDATE tbl_maestromaterial ";
                sql += "SET stock_disponible = stock_disponible + " + salida.getCantidad_salida() + ", cantidad_entrante = cantidad_entrante + " + salida.getCantidad_salida() + ", stock_usado = stock_usado - " + salida.getCantidad_salida();
                sql += " WHERE numero_material = " + salida.getId_material();
               
                break;  
                
            case 16:
                sql = "SELECT count(numero_material) ";
                sql += "FROM vw_entrada ";
                 sql += "WHERE status = true AND numero_material = " + salida.getId_material() + " AND fk_proyecto = " + salida.getId_proyecto() + ";";
                
                break;
                
            case 17:
                
                ctrl_material material5 = null;
                class_material modelo_material5 = null;
        
                material5 = new ctrl_material(0,salida.getId_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
                modelo_material5 = material5.consultar_descripcionmaterial();
 
                sql = "SELECT id_entrada FROM tbl_entrada WHERE fk_material = " + modelo_material5.getId_material() + " AND fk_proyecto = " + salida.getId_proyecto() + " AND status = true; ";
                
                break;    
            case 18:
               sql = "SELECT id_documento,numero_material,descripcionmaterial,posicion,cantidad_salida,unidadmedida,fecha_salida,descripcionproyecto,descripcionalmacen,descripcionubicacion,destino,justificacion,codigo_movimiento ";
               sql += "FROM sistimaca.vw_salida ";
               sql += this.condicion; 
               sql += "GROUP BY id_documento,numero_material,descripcionmaterial,posicion,unidadmedida,fecha_salida,descripcionproyecto,descripcionalmacen,descripcionubicacion,destino,justificacion; ";
               break;
            case 19:
 
               sql = "CALL actualizar_entrada_material("+ entrada.getId_material() + "," + entrada.getId_valoracion() + "," + entrada.getId_moneda()  + "," + entrada.getId_almacen() + "," + entrada.getUbicacion() + "," + entrada.getProcedencia() + "," + entrada.getClase_movimiento() + "," + entrada.getId_proyecto() + "," + entrada.getId_usuario() + ",'" + entrada.getCodigo_alterno() + "'," + entrada.getPosicion() + "," + entrada.getId_documento() + "," + entrada.getId_ordendecompra() + "," + entrada.getNro_factura() + ",'" + entrada.getFecha_entrada() + "'," + entrada.getCantidad_ingresada() + "," + entrada.getPrecio_unitario() + "," + entrada.getMonto() + "," + entrada.getFlete() + "," + entrada.getTotal() + ",'" + entrada.getObservaciones() + "'," + entrada.isStatus() + ");"; 
                                
                break;      
            case 20:
                sql = "CALL actualizar_salida_material()";       
                /*sql = "UPDATE tbl_maestromaterial ";
                sql += "SET cantidad_saliente = cantidad_saliente + " + salida.getCantidad_salida();
                sql += " WHERE numero_material = " + salida.getId_material();*/
               
                break;
             case 21:
 
               sql = "CALL actualizar_entrada_material_proyecto("+ entrada.getId_material() + "," + entrada.getId_valoracion() + "," + entrada.getId_moneda()  + "," + entrada.getId_almacen() + "," + entrada.getUbicacion() + "," + entrada.getProcedencia() + "," + entrada.getClase_movimiento() + "," + entrada.getId_proyecto() + "," + entrada.getId_usuario() + ",'" + entrada.getCodigo_alterno() + "'," + entrada.getPosicion() + "," + entrada.getId_documento() + "," + entrada.getId_ordendecompra() + "," + entrada.getNro_factura() + ",'" + entrada.getFecha_entrada() + "'," + entrada.getCantidad_ingresada() + "," + entrada.getPrecio_unitario() + "," + entrada.getMonto() + "," + entrada.getFlete() + "," + entrada.getTotal() + ",'" + entrada.getObservaciones() + "'," + entrada.isStatus() + ");"; 
                                
                break;      
        }
        
        System.out.println(sql);
    } 
    
}
