/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.math.BigDecimal;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.class_material;
import model.class_cotizacion;
import model.class_proveedor;
import model.class_usuario;
import view.funciones;


/**
 *
 * @author ruben
 */
public class ctrl_cotizacion {
    ctrl_solicitud solicitud;
    class_cotizacion cotizacion;
    private Integer posicion_act;
    private Integer solicitud_act;
    private String sql;
    private String condicion;
    
    
    public ctrl_cotizacion(Integer id_cotizacion, Integer id_proveedor, String rif, String nombre_proveedor, Integer id_solicitud, Integer nro_material, Integer posicion, Integer cedula, Integer codigo_moneda, Integer cantidad_cotizar, Double precio_unitario, Double precio_total, String fecha_cotizacion, String tipoplazoentrega,Integer diasplazoentrega,String condicionpago,String tipotransporteflete,Integer diasflete,Double costoflete,Integer codigo_moneda_flete,String fotocotizacion, String justificacion, String observacion, Boolean recomendacion_comprador, Boolean aprobado_procura, String fecha_aprobado_procura, Boolean aprobado_gerencia, String fecha_aprobado_gerencia, Boolean orden_compra, Integer nro_ordencompra, String fecha_carga_compras, Boolean status){
        solicitud = new ctrl_solicitud(id_solicitud,0,0,"",0,"",0,0,"",0,"",0,"",0,0,0,0,0,"","","",false,"","","","","","","","","");
        cotizacion = new class_cotizacion(id_cotizacion, id_proveedor, rif, nombre_proveedor, id_solicitud, nro_material, posicion, cedula, codigo_moneda, cantidad_cotizar, precio_unitario, precio_total, fecha_cotizacion,tipoplazoentrega,diasplazoentrega,condicionpago,tipotransporteflete,diasflete,costoflete,codigo_moneda_flete,fotocotizacion, justificacion, observacion, recomendacion_comprador, aprobado_procura, fecha_aprobado_procura, aprobado_gerencia, fecha_aprobado_gerencia, orden_compra, nro_ordencompra, fecha_carga_compras, status);
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
    
     public void consultar_cotizacion(JTable tabla) throws SQLException{
    
        consultar_cotizacion_detalle_entrada(tabla);
    }
    
    public String consultar_foto(){
        ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,cotizacion.getNro_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
        modelo_material = material.consultar_fotomaterial();
        
        return modelo_material.getFoto_material();
        
    }
    
    public class_cotizacion crear_posicion(){
        conexion cnn;
        
               
        
            buscar_sql(3);
            cnn = new conexion(sql,"");
            
            if (cnn.estado){
                cotizacion.setStatus(true);
                cnn.cerrar();    
            } 
            else{
                cotizacion.setStatus(false);
                cnn.cerrar();
            }
                       
             
        return cotizacion;
        
    }
    
     public void consultar_cotizacion_detalle(JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        //modelotabla.setRowCount(0);
        
        ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,cotizacion.getNro_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
        modelo_material = material.consultar_descripcionmaterial();
        
        
                 
       
                    modelotabla.addRow(new Object[]{
                        cotizacion.getPosicion(),   //posicion
                        cotizacion.getNombreproveedor(),
                        cotizacion.getNro_material(),   //nromaterial
                        modelo_material.getDescripcion(),//material
                        cotizacion.getCantidad_cotizar(),   //cantidad a cotizar
                        modelo_material.getDescripcion_medida(),
                        cotizacion.getPrecio_unitario(),//precio unitario
                        cotizacion.getPrecio_total(),//precio total
                        cotizacion.getJustificacion(),//justificacion
                        cotizacion.getObservacion() //observacion
                    });
        
        
    }
     
    public void consultar_cotizacion_detalle_entrada(JTable tabla) throws SQLException{
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
        buscar_sql(6);
        
        conexion cnn = new conexion(sql,"buscar");
        
               
       /* ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,cotizacion.getNro_material(),"","","","","","",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"");
        
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
                        cnn.rs.getInt(7),   //cantidad a cotizar
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
     
    public class_cotizacion borrar_posicion(JTable tabla,Integer pos){
        Integer i;
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        cotizacion.setPosicion(Integer.parseInt(modelotabla.getValueAt(pos,0).toString()));
        
        modelotabla.removeRow(pos);
        tabla.revalidate();
        
        buscar_sql(8);
        conexion cnn = new conexion(sql,"");
        cnn.cerrar();
        cotizacion.setStatus(true);
        
       
        for(i = 0; i <= modelotabla.getRowCount()-1 ;i++){
           modelotabla.setValueAt(i+1, i,0);
        } 
        
        buscar_sql(6);
        
        cnn = new conexion(sql,"buscar");
        
            
            if (cnn.estado){
            
                try{
                    
                    while(cnn.rs.next()){
                        cotizacion.setPosicion(cnn.rs.getInt(4));
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
        
        
        
        return cotizacion;
    } 
    
    

    public class_proveedor buscarempresarif(){
        ctrl_proveedor proveedor = null;
        class_proveedor modelo_proveedor;
        
         proveedor = new ctrl_proveedor(
                0,//id_proveedor
                cotizacion.getRif(), //rif
                "", //nombre
                "", //direccion
                "", //ciudad 
                "", //estado
                "", //pais
                "", //codigopostal
                "", //tipo 
                "", //persona contacto
                "", //telefono 1
                "", //telefono 2
                "", //correo electronico
                "", //banco 1 
                "", //nrocuenta 1 
                "", //tipo cuenta 1
                "", //banco 2 
                "", //nrocuenta 2 
                "", //tipo cuenta 2
                "", //banco 3 
                "", //nrocuenta 3 
                "", //tipo cuenta 3
                0, //clase material     
                0, //grupo material 
                false            
         );
         
             modelo_proveedor = proveedor.buscar_proveedor();
                   
            return modelo_proveedor;
        
    }
    
    public void consultar_cotizacion_detalle(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
           
            buscar_sql(12);
            
        /*switch (perfil){
            
            case 0: buscar_sql(10);
                    break;
            case 1: buscar_sql(11);
                    break;
            case 2: buscar_sql(12);
                    break;
            case 3: buscar_sql(13);
                    break;
                    
                    
        }*/
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    
                    cotizacion.setId_cotizacion(cnn.rs.getInt(1));
                    
                    buscar_sql(11);
                    
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //id cotizacion
                            cnn2.rs.getInt(2),   //posicion
                            cnn2.rs.getInt(3),   //numero de material
                            cnn2.rs.getString(4),   //descripcion material
                            cnn2.rs.getInt(5),//cantidad cotizar
                            cnn2.rs.getString(6),  //umb
                            cnn2.rs.getDouble(7),//precio uitario
                            cnn2.rs.getDouble(8) //total
                        });
                    }
                   cnn2.cerrar();
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
    
    public void consultar_cotizaciones(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
            
            buscar_sql(29);
            
        /*switch (perfil){
            
            case 0: buscar_sql(10);
                    break;
            case 1: buscar_sql(11);
                    break;
            case 2: buscar_sql(12);
                    break;
            case 3: buscar_sql(13);
                    break;
                    
                    
        }*/
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    
                    cotizacion.setId_cotizacion(cnn.rs.getInt(1));
                    
                    
                    /*if (solicitud.getId_area().equals(0)){
                        buscar_sql(30);
                    }
                    else{*/
                        buscar_sql(31);
                    //}
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    if (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //id solicitud
                            cnn2.rs.getString(2),   //cantidad de cotizaciones
                            cnn2.rs.getString(3),//area
                            cnn2.rs.getString(4),//area
                            cnn2.rs.getInt(5)
                        });
                    }
                   cnn2.cerrar();
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
    
    public void consultar_cotizacion_por_aprobar(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
            
            buscar_sql(33);
            
               
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    
                    cotizacion.setId_solicitud(cnn.rs.getInt(1));
                         
                    
                    buscar_sql(34);
                    
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    if (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //RESERVA
                            cnn2.rs.getInt(2),   //cedula
                            cnn2.rs.getString(3),   //nombres
                            cnn2.rs.getString(4),   //proyecto
                            cnn2.rs.getString(5),//empresa
                        });
                    }
                   cnn2.cerrar();
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
    
    public void consultar_cotizacion_detalle_poraprobar(Integer perfil,JTable tabla) throws SQLException{
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
           
                    buscar_sql(11);
                    
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                        
                        modelotabla.addRow(new Object[]{
                            //cnn2.rs.getInt(1),   //id cotizacion
                            cnn2.rs.getInt(1),   //posicion
                            cnn2.rs.getInt(2),   //numero de material
                            cnn2.rs.getString(3),   //descripcion material
                            cnn2.rs.getInt(4),//cantidad autorizada
                            cnn2.rs.getString(5),  //umb
                            cnn2.rs.getString(6),//fecha requerida
                            //cnn2.rs.getString(7) //tipo solicitud
                            /*cnn2.rs.getString(8)*/
                        });
                    }
                   cnn2.cerrar();
               
             
       
      
        
    } 
    
     public void consultar_cotizacion_detalle_poraprobar_2(Integer perfil,JTable tabla) throws SQLException{
        String recomendado = "";
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
           
                    buscar_sql(35);
                    
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                        if(cnn2.rs.getString(12).equals("1")){
                            recomendado = "RECOMENDADO";
                        }
                        else{
                            recomendado = "";
                        }
                        
                        //URLabel label = new URLabel(cnn2.rs.getString(13).trim(),"C:\\Users\\ruben\\Desktop\\Internet.png");
                       
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //idcotizacion
                            cnn2.rs.getString(2),   //idcotizacion
                            cnn2.rs.getString(3),   //idcotizacion
                            cnn2.rs.getString(4),   //idcotizacion
                            cnn2.rs.getInt(5),//cantidad_cotizar
                            cnn2.rs.getString(6),  //umb
                            funciones.separadormilesflotante(String.valueOf(BigDecimal.valueOf(cnn2.rs.getDouble(7))).replace(".", ","),true),//preciounitario
                            funciones.separadormilesflotante(String.valueOf(BigDecimal.valueOf(cnn2.rs.getDouble(8))).replace(".", ","),true), //preciototal
                            cnn2.rs.getString(9), //moneda
                            cnn2.rs.getString(10), //moneda
                            cnn2.rs.getString(11), //moneda
                            cnn2.rs.getString(16), //moneda
                            recomendado, //recomendacion comprador
                            cnn2.rs.getString(15).trim(),
                            cnn2.rs.getString(13).trim()
                            
                        });
                    }
                   cnn2.cerrar();
               
             
       
      
        
    } 
    
    public Boolean aprobar_cotizacion_posicion(){
        conexion cnn;
        
        //APRUEBA LA COTIZACION SELECCIONADA      
        buscar_sql(36);
            
                           
        cnn = new conexion(sql,"");
        cnn.cerrar();
        
        //DESHABILITA LAS OTRAS COTIZACIONES DE LA COTIZACION - SOLICITUD Y POSICION
        
        /*buscar_sql(52);
                                       
        cnn = new conexion(sql,"");
        cnn.cerrar();*/
        
        return true;
        
       
    }
    
    public Boolean autorizar_cotizacion_posicion() throws SQLException{
        conexion cnn;
        Integer nro_ordencompra = 0;
        
        buscar_sql(37);
        
        cnn = new conexion(sql,"buscar");
        
        if(cnn.rs.next() && !cotizacion.getRif().equals("WEB") && !cotizacion.getRif().equals("PART")){
                cotizacion.setNro_ordencompra(cnn.rs.getInt(1));
        }
        else{
            buscar_sql(7);
            cnn = new conexion(sql,"buscar");
            
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                         if(cnn.rs.getInt(1) == 0){
                             cotizacion.setNro_ordencompra(1);
                         }
                         else{
                             cotizacion.setNro_ordencompra(cnn.rs.getInt(1)+1);
                         }    
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
        
        buscar_sql(38);
                                 
        cnn = new conexion(sql,"");
        cnn.cerrar();

        
        return true;
        
       
    }
    
    public void consultar_cotizacion_por_autorizar(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
            
            buscar_sql(39);
            
               
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    
                    cotizacion.setId_solicitud(cnn.rs.getInt(1));
                         
                    
                    buscar_sql(42);
                    
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    if (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //RESERVA
                            cnn2.rs.getInt(2),   //cedula
                            cnn2.rs.getString(3),   //nombres
                            cnn2.rs.getString(4),   //proyecto
                            cnn2.rs.getString(5),//empresa
                        });
                    }
                   cnn2.cerrar();
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
    
    public void consultar_cotizacion_detalle_porautorizar(Integer perfil,JTable tabla) throws SQLException{
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
           
                    buscar_sql(43);
                    
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //id cotizacion
                            cnn2.rs.getInt(2),   //posicion
                            cnn2.rs.getInt(3),   //numero de material
                            cnn2.rs.getString(4),   //descripcion material
                            cnn2.rs.getInt(5),//cantidad autorizada
                            cnn2.rs.getString(6),  //umb
                            cnn2.rs.getString(7)//fecha requerida
                            //cnn2.rs.getString(8) //tiposolicitud
                        });
                    }
                   cnn2.cerrar();
               
             
       
 
        
    } 
    
    public void consultar_cotizacion_autorizada(Integer perfil,JTable tabla) throws SQLException{
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
           
                    buscar_sql(40);
                    
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //ordendecompra
                            funciones.formato_ordencompra(cnn2.rs.getInt(2)),   //nroordencompra
                            cnn2.rs.getString(3),   //rif
                            cnn2.rs.getString(4),   //nombreempresa
                            cnn2.rs.getInt(5),//cantidad posiciones
                            funciones.separadormilesflotante(String.valueOf(BigDecimal.valueOf(cnn2.rs.getDouble(6))).replace(".", ","),true), //preciototal
                            cnn2.rs.getString(7)   //moneda
                            
                        });
                    }
                   cnn2.cerrar();  
    } 
    
    
    public void consultar_cotizacion_autorizada_detalle(Integer perfil,JTable tabla) throws SQLException{
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
           
                    buscar_sql(59);
                    
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //0  idcotizacion
                            cnn2.rs.getInt(2),   //1 nrosolicitud
                            cnn2.rs.getInt(3),   //2 posicion
                            cnn2.rs.getInt(4),   //3 nromaterial
                            cnn2.rs.getString(5),//4 material solicitado
                            cnn2.rs.getString(14),   //5 proveedor
                            cnn2.rs.getInt(17),   //6 cantidad cotizada
                            cnn2.rs.getString(18),   //7 umb
                            funciones.separadormilesflotante(String.valueOf(BigDecimal.valueOf(cnn2.rs.getDouble(19))).replace(".", ","),true),   //8 precio unitario
                            cnn2.rs.getString(22),//9 moneda
                            funciones.separadormilesflotante(String.valueOf(BigDecimal.valueOf(cnn2.rs.getDouble(20))).replace(".", ","),true),//10 total
                            cnn2.rs.getInt(29),//11 dias plazo de entrega
                            cnn2.rs.getString(30),//12 condicion de pago
                            cnn2.rs.getString(6),//13 foto cotizacion
                            cnn2.rs.getString(10),//14 empresa
                            cnn2.rs.getString(11),//15 fecha requerida
                            cnn2.rs.getString(13),//16 rif                
                            cnn2.rs.getString(15),//17 telefono
                            cnn2.rs.getString(16),//18 direccion
                            cnn2.rs.getString(23),//19 fecha cotizar
                            cnn2.rs.getString(28),//20 tipo plazo entrega
                            cnn2.rs.getString(31),//21 tipotransporte
                            cnn2.rs.getInt(32),//22 dias flete
                            funciones.separadormilesflotante(String.valueOf(BigDecimal.valueOf(cnn2.rs.getDouble(33))).replace(".", ","),true),//23 costo flete
                            cnn2.rs.getString(34),//24 moneda flete
                            cnn2.rs.getBoolean(35),//25 aprobado procura
                            cnn2.rs.getString(36),//26 fecha aprobado procura
                            cnn2.rs.getBoolean(37),//27 autorizado gerencia
                            cnn2.rs.getString(38),//28 fecha aprobado gerencia
                            cnn2.rs.getBoolean(39),//29 recomendacion comprador
                            cnn2.rs.getBoolean(40),//30 orden de compra
                            cnn2.rs.getInt(41),//31 nro orden de compra
                            cnn2.rs.getString(42),//32 fecha orden de compra
                            
                        });
                    }
                   cnn2.cerrar();
               
             
       
   
        
    }
    
    public void consultar_cotizacion_detalle_porautorizar_2(Integer perfil,JTable tabla) throws SQLException{
        
        String recomendado = "";
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
            
        buscar_sql(44);

        conexion cnn2 = new conexion(sql,"buscar");



        while (cnn2.rs.next()){

            if(cnn2.rs.getString(12).equals("1")){
                recomendado = "RECOMENDADO";
            }
            else{
                recomendado = "";
            }

            modelotabla.addRow(new Object[]{
                cnn2.rs.getInt(1),   //idcotizacion
                cnn2.rs.getString(2),   //rif
                cnn2.rs.getString(3),   //nombre
                cnn2.rs.getString(4),   //telefono
                cnn2.rs.getInt(5),//cantidad_cotizar
                cnn2.rs.getString(6),  //umb
                funciones.separadormilesflotante(String.valueOf(BigDecimal.valueOf(cnn2.rs.getDouble(7))).replace(".", ","),true),//preciounitario
                funciones.separadormilesflotante(String.valueOf(BigDecimal.valueOf(cnn2.rs.getDouble(8))).replace(".", ","),true), //preciototal
                cnn2.rs.getString(9), //moneda
                cnn2.rs.getString(10), //plazoentrega
                cnn2.rs.getString(11), //condicionpago
                cnn2.rs.getString(15), //condicionpago
                recomendado, //recomendacion comprador 
                cnn2.rs.getString(13),
                cnn2.rs.getString(14)
            });
        }
       cnn2.cerrar();
              
    } 
    
    public void consultar_ordendecompra_detalle_entrada(JTable tabla) throws SQLException{
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
        buscar_sql(45);
        
        conexion cnn = new conexion(sql,"buscar");
          
        if (cnn.estado){
            
                while(cnn.rs.next()){
                         
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),   //if proveedor
                        cnn.rs.getString(2),//proveedor
                        funciones.formato_ordencompra(cnn.rs.getInt(3)), //oc
                        cnn.rs.getInt(4),   //posicion
                        cnn.rs.getInt(5),//numero material
                        cnn.rs.getString(6), //material
                        cnn.rs.getInt(7),  //cantidad autorizada
                        cnn.rs.getString(8),  //umb
                        cnn.rs.getDate(9),  //fechacompra
                        cnn.rs.getInt(10),  //fechacompra  
                        cnn.rs.getInt(11),  //fechacompra  
                        cnn.rs.getInt(12),  //fechacompra  
                        cnn.rs.getString(13),
                        cnn.rs.getDouble(14), //preciounitario
                        cnn.rs.getDouble(15), //total
                        cnn.rs.getDouble(16), //flete
                        cnn.rs.getDouble(17), //total + flete
                        cnn.rs.getInt(18)
                    });
                   
                }  
                 cnn.cerrar();
        }
    } 
    
    public String consultar_fecha_cotizacion() throws SQLException {
        String fecha;
        conexion cnn;
                
        buscar_sql(46);
        
        
        cnn = new conexion(sql,"buscar");
        
        if(cnn.rs.next()){
            fecha = cnn.rs.getString(1);
            cnn.cerrar();
            return fecha;
        }
        else{
            cnn.cerrar();
            return "";
        }    
 
       
    }
    
    public String consultar_aprobacion_cotizacion() throws SQLException {
        String resul;
        conexion cnn;
                
        buscar_sql(47);
        
        cnn = new conexion(sql,"buscar");
        
        if(cnn.rs.next()){
            resul = cnn.rs.getString(1);
            cnn.cerrar();
            return resul;
        }
        else{
            cnn.cerrar();
            return "";
        }    
 
       
    }

    public String consultar_autorizacion_cotizacion() throws SQLException {
        String resul;
        conexion cnn;
        
        
        
        buscar_sql(48);
        
        cnn = new conexion(sql,"buscar");
        
        if(cnn.rs.next()){
            resul = cnn.rs.getString(1);
            cnn.cerrar();
            return resul;
        }
        else{
            cnn.cerrar();
            return "";
        }    
 
       
    }
    
    public String consultar_ordendecompra_cotizacion() throws SQLException {
        String resul;
        
        conexion cnn;
                
        buscar_sql(49);
        
        cnn = new conexion(sql,"buscar");
        
        if(cnn.rs.next()){
            resul = cnn.rs.getString(1);
            cnn.cerrar();
            return resul;
        }
        else{
            cnn.cerrar();
            return "";
        }   
       
    }
    
    public void consultar_ordendecompraproveedor_detalle_entrada(JTable tabla) throws SQLException{
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
        buscar_sql(50);
        
        conexion cnn = new conexion(sql,"buscar");
          
        if (cnn.estado){
            
                while(cnn.rs.next()){
                         
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),   //if proveedor
                        cnn.rs.getString(2),//proveedor
                        funciones.formato_ordencompra(cnn.rs.getInt(3)), //oc
                        cnn.rs.getInt(4),   //posicion
                        cnn.rs.getInt(5),//numero material
                        cnn.rs.getString(6), //material
                        cnn.rs.getInt(7),  //cantidad autorizada
                        cnn.rs.getString(8),  //umb
                        cnn.rs.getDate(9),  //fechacompra
                        cnn.rs.getInt(10),
                        cnn.rs.getInt(11),
                        cnn.rs.getInt(12),
                        cnn.rs.getString(13)
                    });
                   
                }  
                 cnn.cerrar();
        }
    } 
    
    public void cotizacion_actualizar_status_cotizacion(){
        conexion cnn;
        
              
        buscar_sql(51);
            
                           
        cnn = new conexion(sql,"");
        cnn.cerrar();
        
        
       
    }    
    
    public void consultar_cotizacion_sin_aprobar(JTable tabla) throws SQLException{
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
        buscar_sql(53);

        conexion cnn2 = new conexion(sql,"buscar");

        while (cnn2.rs.next()){
            modelotabla.addRow(new Object[]{
                cnn2.rs.getInt(1),   //0  idcotizacion
                cnn2.rs.getInt(2),   //1 nrosolicitud
                cnn2.rs.getInt(3),   //2 posicion
                cnn2.rs.getInt(4),   //3 nromaterial
                cnn2.rs.getString(5),//4 material solicitado
                cnn2.rs.getString(14),   //5 proveedor
                cnn2.rs.getInt(17),   //6 cantidad cotizada
                cnn2.rs.getString(18),   //7 umb
                cnn2.rs.getDouble(19),   //8 precio unitario
                cnn2.rs.getString(22),//9 moneda
                cnn2.rs.getDouble(20),//10 total
                cnn2.rs.getInt(29),//11 dias plazo de entrega
                cnn2.rs.getString(30),//12 condicion de pago
                cnn2.rs.getString(6),//13 foto cotizacion
                cnn2.rs.getString(10),//14 empresa
                cnn2.rs.getString(11),//15 fecha requerida
                cnn2.rs.getString(13),//16 rif                
                cnn2.rs.getString(15),//17 telefono
                cnn2.rs.getString(16),//18 direccion
                cnn2.rs.getString(23),//19 fecha cotizar
                cnn2.rs.getString(28),//20 tipo plazo entrega
                cnn2.rs.getString(31),//21 tipotransporte
                cnn2.rs.getInt(32),//22 dias flete
                cnn2.rs.getDouble(33),//23 costo flete
                cnn2.rs.getString(34),//24 moneda flete
                cnn2.rs.getBoolean(35),//25 aprobado procura
                cnn2.rs.getString(36),//26 fecha aprobado procura
                cnn2.rs.getBoolean(37),//27 autorizado gerencia
                cnn2.rs.getString(38),//28 fecha aprobado gerencia
                cnn2.rs.getBoolean(39),//29 recomendacion comprador
                cnn2.rs.getBoolean(40),//30 orden de compra
                cnn2.rs.getInt(41),//31 nro orden de compra
                cnn2.rs.getString(42)//32 fecha orden de compra
                  
                     
            });
        }
       cnn2.cerrar();
    }   

   public void consultar_cotizacion(JTable tabla,Integer opcion) throws SQLException{
        
        String condicion2 = " ";
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
        if (!cotizacion.getId_proveedor().equals(0)){
            condicion2 = " AND fk_proveedor = " + cotizacion.getId_proveedor() + " ";
        }     
 
       if (!cotizacion.getNro_material().equals(0)){
            condicion2 = " AND numero_material LIKE '%" + cotizacion.getNro_material() + "%' ";
        }     
         
       if (!cotizacion.getId_solicitud().equals(0)){
            condicion2 = " AND fk_solicitud LIKE '%" + cotizacion.getId_solicitud() + "%' ";
       }  
       
        
        switch (opcion){
           case 0: this.condicion = "WHERE aprobado_procura = FALSE AND aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE ";
                    break;
           case 1: this.condicion = "WHERE aprobado_procura = TRUE AND aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE ";
                    break;
           case 2: this.condicion = "WHERE aprobado_procura = TRUE AND aprobado_gerencia = TRUE AND status = TRUE ";
                    break; 
           case 3: this.condicion = "WHERE status = FALSE ";
                    break;          
       }

         this.condicion += condicion2; 
       
        buscar_sql(54);

        conexion cnn2 = new conexion(sql,"buscar");

        while (cnn2.rs.next()){
            modelotabla.addRow(new Object[]{
                cnn2.rs.getInt(1),   //0  idcotizacion
                cnn2.rs.getInt(2),   //1 nrosolicitud
                cnn2.rs.getInt(3),   //2 posicion
                cnn2.rs.getInt(4),   //3 nromaterial
                cnn2.rs.getString(5),//4 material solicitado
                cnn2.rs.getString(14),   //5 proveedor
                cnn2.rs.getInt(17),   //6 cantidad cotizada
                cnn2.rs.getString(18),   //7 umb
                cnn2.rs.getDouble(19),   //8 precio unitario
                cnn2.rs.getString(22),//9 moneda
                cnn2.rs.getDouble(20),//10 total
                cnn2.rs.getInt(29),//11 dias plazo de entrega
                cnn2.rs.getString(30),//12 condicion de pago
                cnn2.rs.getString(6),//13 foto cotizacion
                cnn2.rs.getString(10),//14 empresa
                cnn2.rs.getString(11),//15 fecha requerida
                cnn2.rs.getString(13),//16 rif                
                cnn2.rs.getString(15),//17 telefono
                cnn2.rs.getString(16),//18 direccion
                cnn2.rs.getString(23),//19 fecha cotizar
                cnn2.rs.getString(28),//20 tipo plazo entrega
                cnn2.rs.getString(31),//21 tipotransporte
                cnn2.rs.getInt(32),//22 dias flete
                cnn2.rs.getDouble(33),//23 costo flete
                cnn2.rs.getString(34),//24 moneda flete
                cnn2.rs.getBoolean(35),//25 aprobado procura
                cnn2.rs.getString(36),//26 fecha aprobado procura
                cnn2.rs.getBoolean(37),//27 autorizado gerencia
                cnn2.rs.getString(38),//28 fecha aprobado gerencia
                cnn2.rs.getBoolean(39),//29 recomendacion comprador
                cnn2.rs.getBoolean(40),//30 orden de compra
                cnn2.rs.getInt(41),//31 nro orden de compra
                cnn2.rs.getString(42),//32 fecha orden de compra
                     
            });
        }
       cnn2.cerrar();
                       
    }     

    public class_cotizacion actualizar_posicion(){
        conexion cnn;
        
               
        
            buscar_sql(55);
            cnn = new conexion(sql,"");
            
            if (cnn.estado){
                cotizacion.setStatus(true);
                cnn.cerrar();    
            } 
            else{
                cotizacion.setStatus(false);
                cnn.cerrar();
            }
                       
             
        return cotizacion;
        
    }
    
 public Boolean consultar_posicion() throws SQLException {
        conexion cnn;
                
        buscar_sql(56);
        
        cnn = new conexion(sql,"buscar");
        
        if(cnn.rs.next()){
            cnn.cerrar();
            return true;
        }
        else{
            cnn.cerrar();
            return false;
        }    
 
       
    }
    
    public class_cotizacion anular_posicion(){
        conexion cnn;
        
               
        
            buscar_sql(57);
            cnn = new conexion(sql,"");
            
            if (cnn.estado){
                cotizacion.setStatus(true);
                cnn.cerrar();    
            } 
            else{
                cotizacion.setStatus(false);
                cnn.cerrar();
            }
                       
             
        return cotizacion;
        
    } 
    
public void consultar_cotizacion_autorizada_todas(Integer perfil,JTable tabla) throws SQLException{
        String generado;
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
           
                    buscar_sql(58);
                    
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                        if (cnn2.rs.getBoolean(8)){
                            generado = "SI";
                        }
                        else{
                            generado = "NO";
                        }
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //ordendecompra
                            funciones.formato_ordencompra(cnn2.rs.getInt(2)),   //nroordencompra
                            cnn2.rs.getString(3),   //rif
                            cnn2.rs.getString(4),   //nombreempresa
                            cnn2.rs.getInt(5),//cantidad posiciones
                            funciones.separadormilesflotante(BigDecimal.valueOf(cnn2.rs.getDouble(6)).toString(),true),  //preciototal
                            cnn2.rs.getString(7),   //moneda
                            generado
                        });
                    }
                   cnn2.cerrar();
               
             
       
 
        
    }    

public void consultar_cotizacion_autorizada_detalle_todas(Integer perfil,JTable tabla) throws SQLException{
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
           
                    buscar_sql(59);
                    
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //0  idcotizacion
                           cnn2.rs.getInt(2),   //1 nrosolicitud
                           cnn2.rs.getInt(3),   //2 posicion
                           cnn2.rs.getInt(4),   //3 nromaterial
                           cnn2.rs.getString(5),//4 material solicitado
                           cnn2.rs.getString(14),   //5 proveedor
                           cnn2.rs.getInt(17),   //6 cantidad cotizada
                           cnn2.rs.getString(18),   //7 umb
                           funciones.separadormilesflotante(BigDecimal.valueOf(cnn2.rs.getDouble(19)).toString(),true),   //8 precio unitario
                           cnn2.rs.getString(22),//9 moneda
                           funciones.separadormilesflotante(BigDecimal.valueOf(cnn2.rs.getDouble(20)).toString(),true),//10 total
                           cnn2.rs.getInt(29),//11 dias plazo de entrega
                           cnn2.rs.getString(30),//12 condicion de pago
                           cnn2.rs.getString(6),//13 foto cotizacion
                           cnn2.rs.getString(10),//14 empresa
                           cnn2.rs.getString(11),//15 fecha requerida
                           cnn2.rs.getString(13),//16 rif                
                           cnn2.rs.getString(15),//17 telefono
                           cnn2.rs.getString(16),//18 direccion
                           cnn2.rs.getString(23),//19 fecha cotizar
                           cnn2.rs.getString(28),//20 tipo plazo entrega
                           cnn2.rs.getString(31),//21 tipotransporte
                           cnn2.rs.getInt(32),//22 dias flete
                           BigDecimal.valueOf(cnn2.rs.getDouble(33)),//23 costo flete
                           cnn2.rs.getString(34),//24 moneda flete
                           cnn2.rs.getBoolean(35),//25 aprobado procura
                           cnn2.rs.getString(36),//26 fecha aprobado procura
                           cnn2.rs.getBoolean(37),//27 autorizado gerencia
                           cnn2.rs.getString(38),//28 fecha aprobado gerencia
                           cnn2.rs.getBoolean(39),//29 recomendacion comprador
                           cnn2.rs.getBoolean(40),//30 orden de compra
                           cnn2.rs.getInt(41),//31 nro orden de compra
                           cnn2.rs.getString(42),//32 fecha orden de compra
                            
                        });
                    }
                   cnn2.cerrar();
    }

public class_cotizacion actualizar_posicion_oc(){
        conexion cnn;
        
               
        
            buscar_sql(60);
            cnn = new conexion(sql,"");
            
            if (cnn.estado){
                cotizacion.setStatus(true);
                cnn.cerrar();    
            } 
            else{
                cotizacion.setStatus(false);
                cnn.cerrar();
            }
                       
             
        return cotizacion;
        
    }

   public Boolean anular_cotizacion_solicitud_posicion(){
        conexion cnn;
        
        //DESHABILITAR COTIZACIONES DE LA SOLICITUD
        
        buscar_sql(61);
                         
        cnn = new conexion(sql,"");
        cnn.cerrar();
        
        //DESHABILITAR LA SOLICITUD Y POSICION DE LA TABLA DE SOLICITUD

        buscar_sql(62);
                         
        cnn = new conexion(sql,"");
        
        cnn.cerrar();
        
        return true;
       
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
                
                sql = "INSERT INTO tbl_cotizacion VALUES(DEFAULT," + cotizacion.getId_proveedor() + ","  + cotizacion.getId_solicitud() + "," + cotizacion.getPosicion()  + "," + cotizacion.getCedula()  + "," + cotizacion.getCodigo_moneda() + "," + cotizacion.getCantidad_cotizar() + "," + cotizacion.getPrecio_unitario() + "," + cotizacion.getPrecio_total()  + ",'" + cotizacion.getFecha_cotizacion() + "','" + cotizacion.getTipoplazoentrega() + "'," + cotizacion.getDiasplazoentrega() + ",'" + cotizacion.getCondicionpago() + "','" + cotizacion.getTipotransporteflete() + "'," + cotizacion.getDiasflete() + "," + cotizacion.getCostoflete() + "," + cotizacion.getCodigo_moneda_flete() + ",'" + cotizacion.getFotocotizacion() + "','" + cotizacion.getJustificacion().toUpperCase() + "','" + cotizacion.getObservacion().toUpperCase() + "'," + cotizacion.getRecomendacion_comprador() + ",FALSE,null,FALSE,null,FALSE,0,'" + cotizacion.getFecha_carga_compras() + "',TRUE);"; 
                                
                break;    
            
            case 4: 
//                sql = "INSERT INTO tbl_solicitud_det VALUES(" + ordendecotizacion.getId_solicitud() + "," + solicitud.getCedula() + "," + solicitud.getId_area() + "," + solicitud.getId_tiposolicitud()  + "," + solicitud.getId_material() + "," + solicitud.getId_empresa() + "," + solicitud.getId_proyecto() + "," + solicitud.getPosicion() + "," + solicitud.getCantidad_solicitada() + ",'" +  solicitud.getFecha_solicitud() + "','" + solicitud.getFecha_requerida() + "','" + solicitud.getJustificacion() + "'," + solicitud.isAutorizado() + ");";  
                break;
                
            case 5:
//                sql = "SELECT id_material FROM tbl_maestromaterial WHERE numero_material = " + solicitud.getNumero_material() + ";";
                break;
            
            case 6:
                sql = "SELECT DISTINCT a.id_cotizacion, a.proveedor,b.usuario,b.nombres, a.posicion,a.fk_solicitud, a.cantidad_cotizar, a.preciounitario, a.preciototal, a.fecha_cotizar, a.justificacion, a.observacion ";
                sql += "FROM sistimaca.tbl_cotizacion a ";
                sql += "INNER JOIN vw_solicitud_detalle b ON ";
                sql += "a.fk_solicitud = b.fk_solicitud ";
                sql += "WHERE a.id_cotizacion = " + cotizacion.getId_cotizacion();
                sql += " ORDER BY a.fk_solicitud,a.posicion;";
                
                break;    
            
            case 7:
                sql = "SELECT MAX(nro_ordencompra)FROM tbl_cotizacion;";
                break;
            
            case 8:
                sql = "DELETE FROM tbl_cotizacion WHERE id_cotizacion = " + cotizacion.getId_cotizacion() + " AND posicion = " + cotizacion.getPosicion() + " AND fk_solicitud = " + cotizacion.getId_solicitud() +";";
                
                break;      
            case 9:
               sql = "UPDATE tbl_cotizacion SET posicion =  " + posicion_act + " WHERE id_cotizacion = " + cotizacion.getId_cotizacion() + " AND fk_solicitud = " + cotizacion.getId_solicitud() + " AND posicion = " + cotizacion.getPosicion() +";";
                break;     
                
            case 10:
                sql = "SELECT numero_material,descripcionmat,unidad_medida ";
                sql += "FROM vw_solicitud_detalle ";
                sql += "WHERE fk_solicitud  = " + solicitud_act  +  " AND posicion = " + posicion_act + ";";
    
                break;
            
            case 11:
                sql = "SELECT DISTINCT posicion,numero_material,descripcionmat,cantidad_cotizar,codigo_umb,fecha_requerida ";
                sql += "FROM vw_cotizacion ";
                sql += "WHERE aprobado_procura = FALSE AND aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE AND fk_solicitud = " + cotizacion.getId_solicitud() + ";";
                break;
           case 12:
                sql = "SELECT DISTINCT id_cotizacion ";
                sql += "FROM vw_cotizacion ";
                sql += "WHERE status = TRUE AND id_cotizacion = " + cotizacion.getId_cotizacion() + ";";     
                break;
                
           case 29:
                sql = "SELECT DISTINCT id_cotizacion ";
                sql += "FROM vw_cotizacion ";
                sql += "WHERE status = TRUE; ";
                break;
            
            case 31:
                sql = "SELECT id_cotizacion,nombre,rif,direccion,COUNT(posicion) as cantidadposicion ";
                sql += "FROM vw_cotizacion ";
                sql += "WHERE status = TRUE AND id_cotizacion = " + cotizacion.getId_cotizacion() + " ";
                sql += "GROUP BY id_cotizacion;";
                break;  
            /*case 32:
                sql = "SELECT id_cotizacion,nombre,rif,direccion,cantidad_cotizar,codigo_umb,preciounitario,preciototal ";
                sql += "FROM vw_cotizacion ";
                sql += "WHERE fk_solicitud = " + solicitud.getId_solicitud() + ";";*/    
            case 33:
                sql = "SELECT DISTINCT fk_solicitud  FROM tbl_cotizacion WHERE aprobado_procura = FALSE AND aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE";
                break;
                
            case 34:
                sql = "SELECT DISTINCT fk_solicitud, fk_usuario,usuario,descripcionproyecto,descripcionempresa FROM vw_cotizacion WHERE aprobado_procura = FALSE AND aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE AND fk_solicitud = " + cotizacion.getId_solicitud()  + " ORDER BY fk_solicitud";
                break; 
            
            case 35:
                sql = "SELECT DISTINCT id_cotizacion,rif,nombre,telefono1,cantidad_cotizar,codigo_umb,preciounitario,preciototal,codigo_moneda,diasplazoentrega,condicionpago,recomendacion_comprador,fotocotizacion,observacion,justificacion,fecha_cotizar ";
                sql += "FROM sistimaca.vw_cotizacion ";
                sql += "WHERE aprobado_procura = FALSE AND aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE AND fk_solicitud = " + cotizacion.getId_solicitud() + " AND posicion = " + cotizacion.getPosicion() + ";";
                break;
            
            case 36:
                sql = "UPDATE tbl_cotizacion ";
                sql += "SET aprobado_procura=" + cotizacion.getAprobado_procura() + ",fecha_aprobado_procura='" + cotizacion.getFecha_aprobado_procura() + "' ";
                sql += "WHERE id_cotizacion = " + cotizacion.getId_cotizacion() + ";";
                break;
                
            case 37:
                sql = "SELECT DISTINCT nro_ordencompra ";
                sql += "FROM sistimaca.vw_cotizacion ";
                sql += "WHERE aprobado_gerencia = TRUE AND rif = '" + cotizacion.getRif() + "' AND orden_compra = FALSE AND status = TRUE;";
                break;
            
            case 38:
                sql = "UPDATE tbl_cotizacion ";
                //sql += "SET aprobado_gerencia=" + cotizacion.getAprobado_gerencia() + ",fecha_aprobado_gerencia='" + cotizacion.getFecha_aprobado_gerencia() + "',nro_ordencompra= " + cotizacion.getNro_ordencompra();
                sql += "SET aprobado_procura=" + cotizacion.getAprobado_gerencia() + ",fecha_aprobado_procura='" + cotizacion.getFecha_aprobado_gerencia() + "',aprobado_gerencia=" + cotizacion.getAprobado_gerencia() + ",fecha_aprobado_gerencia='" + cotizacion.getFecha_aprobado_gerencia() + "',nro_ordencompra= " + cotizacion.getNro_ordencompra();
                sql += " WHERE id_cotizacion = " + cotizacion.getId_cotizacion() + ";";
                break;    
           
            case 39:
                //sql = "SELECT DISTINCT fk_solicitud  FROM tbl_cotizacion WHERE aprobado_procura = TRUE AND aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE";
                sql = "SELECT DISTINCT fk_solicitud  FROM tbl_cotizacion WHERE  aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE";
                              
                break;
            
            case 40:
                sql = "SELECT DISTINCT nro_ordencompra,nro_ordencompra,rif,nombre,COUNT(posicion) as cantpos, SUM(preciototal) AS preciototal,codigo_moneda ";
                sql += "FROM vw_cotizacion ";
                sql += "WHERE aprobado_gerencia = TRUE AND orden_compra = FALSE AND status = TRUE ";
                sql += "GROUP BY nro_ordencompra,nombre,codigo_moneda;";
                break;
                
            case 41:
                sql = "SELECT posicion,numero_material,descripcionmat,cantidad_cotizar,codigo_umb,preciounitario,preciototal,codigo_moneda ";
                sql += "FROM vw_cotizacion ";
                sql += "WHERE aprobado_gerencia = TRUE AND orden_compra = FALSE AND status = TRUE AND nro_ordencompra = " + cotizacion.getNro_ordencompra();
                
                break;
            case 42:
                 
                //sql = "SELECT DISTINCT fk_solicitud, fk_usuario,usuario,descripcionproyecto,descripcionempresa FROM vw_cotizacion WHERE aprobado_procura = TRUE AND aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE AND fk_solicitud = " + cotizacion.getId_solicitud()  + " ORDER BY fk_solicitud";
                sql = "SELECT DISTINCT fk_solicitud, fk_usuario,usuario,descripcionproyecto,descripcionempresa FROM vw_cotizacion WHERE aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE AND fk_solicitud = " + cotizacion.getId_solicitud()  + " ORDER BY fk_solicitud";
                
                break;
            
            case 43:
                sql = "SELECT DISTINCT id_cotizacion,posicion,numero_material,descripcionmat,cantidad_cotizar,codigo_umb,fecha_requerida ";
                sql += "FROM vw_cotizacion ";
                //sql += "WHERE aprobado_procura = TRUE AND aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE AND fk_solicitud = " + cotizacion.getId_solicitud() + ";";
                sql += "WHERE aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE AND fk_solicitud = " + cotizacion.getId_solicitud() + ";";
                
                break;   
            
            case 44:    
                sql = "SELECT DISTINCT id_cotizacion,rif,nombre,telefono1,cantidad_cotizar,codigo_umb,preciounitario,preciototal,codigo_moneda,diasplazoentrega,condicionpago,recomendacion_comprador,justificacion,fotocotizacion,fecha_cotizar ";
                sql += "FROM sistimaca.vw_cotizacion ";
                sql += "WHERE  aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE AND fk_solicitud = " + cotizacion.getId_solicitud() + " AND posicion = " + cotizacion.getPosicion() + ";";
                break;
            
            case 45:
                sql = "SELECT fk_proveedor,nombre,nro_ordencompra,posicion,numero_material,descripcionmat,cantidad_cotizar,codigo_umb,fecha_carga_compras,fk_moneda,fk_solicitud,fk_proyecto,descripcionproyecto,preciounitario,preciototal,costoflete,(preciototal+costoflete) as totalconflete,id_cotizacion ";
                sql += "FROM sistimaca.vw_cotizacion ";
                sql += "WHERE status = TRUE AND nro_ordencompra LIKE '%" + cotizacion.getNro_ordencompra() + "%' AND orden_compra = TRUE;";
                break;
            
            case 46:
                sql = "SELECT DISTINCT fecha_carga_compras ";
                sql += "FROM sistimaca.tbl_cotizacion ";
                sql += "WHERE fk_solicitud = " + cotizacion.getId_solicitud() + " AND posicion = " + cotizacion.getPosicion() + " AND status = TRUE; ";
                break;
            
            case 47:
                sql = "SELECT fecha_aprobado_procura ";
                sql += "FROM sistimaca.tbl_cotizacion ";
                sql += "WHERE fk_solicitud = " + cotizacion.getId_solicitud() + " AND posicion = " + cotizacion.getPosicion() + " AND status = TRUE and aprobado_procura = TRUE;";
                break;
            
            case 48:
                sql = "SELECT fecha_aprobado_gerencia ";
                sql += "FROM sistimaca.tbl_cotizacion ";
                sql += "WHERE fk_solicitud = " + cotizacion.getId_solicitud() + " AND posicion = " + cotizacion.getPosicion() + " AND status = TRUE and aprobado_gerencia = TRUE;";
                break; 
            
            case 49:
                sql = "SELECT fecha_carga_compras ";
                sql += "FROM sistimaca.tbl_cotizacion ";
                sql += "WHERE fk_solicitud = " + cotizacion.getId_solicitud() + " AND posicion = " + cotizacion.getPosicion() + " AND status = TRUE and aprobado_gerencia = TRUE AND orden_compra = TRUE;";
                break;      
            case 50:
                sql = "SELECT fk_proveedor,nombre,nro_ordencompra,posicion,numero_material,descripcionmat,cantidad_cotizar,codigo_umb,fecha_carga_compras,fk_moneda,fk_solicitud,fk_proyecto,descripcionproyecto,preciounitario,preciototal,costoflete,(preciototal+costoflete) as totalconflete,id_cotizacion ";
                sql += "FROM sistimaca.vw_cotizacion ";
                sql += "WHERE status = TRUE AND rif = '" + cotizacion.getRif() + "' AND orden_compra = TRUE;";
                break;   
                
             case 51:     
                sql = "UPDATE tbl_cotizacion ";
                sql += "SET status = FALSE, observacion = 'CERRADO' ";
                sql += "WHERE id_cotizacion = "  + cotizacion.getId_cotizacion() ;
                break; 
            
             case 52:   
                sql = "UPDATE tbl_cotizacion ";
                sql += "SET status = FALSE ";
                sql += "WHERE id_cotizacion != " + cotizacion.getId_cotizacion() + " AND fk_solicitud = " + cotizacion.getId_solicitud() + " AND posicion = " + cotizacion.getPosicion() + ";";
                break;
                
             case 53:   
                sql = "SELECT id_cotizacion, fk_solicitud, posicion, numero_material, descripcionmat, fotocotizacion, fk_proyecto, codigoproyecto, descripcionproyecto, descripcionempresa, fecha_requerida, fk_proveedor, rif, nombre, telefono1, direccion, cantidad_cotizar, codigo_umb, preciounitario, preciototal, fk_moneda, codigo_moneda, fecha_cotizar, fk_usuario, usuario, justificacion, observacion, tipoplazoentrega, diasplazoentrega, condicionpago, tipotransporteflete, diasflete, costoflete, monedaflete, aprobado_procura, fecha_aprobado_procura, aprobado_gerencia, fecha_aprobado_gerencia, recomendacion_comprador, orden_compra, nro_ordencompra, fecha_carga_compras, status ";
                sql += "FROM vw_cotizacion ";
                sql += "WHERE aprobado_procura = FALSE AND aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE ";
                 sql += "ORDER BY fk_solicitud";
                break; 
            
             case 54:   
                sql = "SELECT id_cotizacion, fk_solicitud, posicion, numero_material, descripcionmat, fotocotizacion, fk_proyecto, codigoproyecto, descripcionproyecto, descripcionempresa, fecha_requerida, fk_proveedor, rif, nombre, telefono1, direccion, cantidad_cotizar, codigo_umb, preciounitario, preciototal, fk_moneda, codigo_moneda, fecha_cotizar, fk_usuario, usuario, justificacion, observacion, tipoplazoentrega, diasplazoentrega, condicionpago, tipotransporteflete, diasflete, costoflete, monedaflete, aprobado_procura, fecha_aprobado_procura, aprobado_gerencia, fecha_aprobado_gerencia, recomendacion_comprador, orden_compra, nro_ordencompra, fecha_carga_compras, status ";
                sql += "FROM vw_cotizacion ";
                sql += this.condicion;
                 sql += "ORDER BY fk_solicitud";
                break;   
             
             case 55:
                sql = "UPDATE tbl_cotizacion ";   
                sql += "SET fk_moneda = " + cotizacion.getCodigo_moneda() + ",cantidad_cotizar = " + cotizacion.getCantidad_cotizar() + ", preciounitario = " + cotizacion.getPrecio_unitario() + ", preciototal = " + cotizacion.getPrecio_total() + ", fecha_cotizar = '" + cotizacion.getFecha_cotizacion() + "', tipoplazoentrega = '" + cotizacion.getTipoplazoentrega() + "', diasplazoentrega = " + cotizacion.getDiasplazoentrega() + ", condicionpago = '" + cotizacion.getCondicionpago() + "', tipotransporteflete = '" + cotizacion.getTipotransporteflete() + "', diasflete = " + cotizacion.getDiasflete() + ", costoflete = " + cotizacion.getCostoflete() + ", fk_monedaflete = " + cotizacion.getCodigo_moneda_flete() + ", fotocotizacion = '" + cotizacion.getFotocotizacion() + "', recomendacion_comprador = " + cotizacion.getRecomendacion_comprador() + ", fecha_carga_compras = '" + cotizacion.getFecha_carga_compras() + "' ";
                sql += "WHERE id_cotizacion = " + cotizacion.getId_cotizacion();
                break;
            
            case 56:
                sql = "SELECT id_cotizacion ";   
                sql += "FROM tbl_cotizacion ";
                sql += "WHERE id_cotizacion = " + cotizacion.getId_cotizacion() + " AND aprobado_procura = FALSE AND aprobado_gerencia = FALSE AND orden_compra = FALSE AND status = TRUE; ";
                break;  
                
            case 57:
                sql = "UPDATE tbl_cotizacion ";   
                sql += "SET status = FALSE ";
                sql += "WHERE id_cotizacion = " + cotizacion.getId_cotizacion();
                break;    

            case 58:
                sql = "SELECT nro_ordencompra,nro_ordencompra,rif,nombre,COUNT(posicion) as cantpos, SUM(preciototal) AS preciototal,codigo_moneda,orden_compra ";
                sql += "FROM vw_cotizacion ";
                sql += "WHERE aprobado_gerencia = TRUE AND status = TRUE ";
                sql += "GROUP BY nro_ordencompra,nombre,codigo_moneda;";
                break;
                 
            case 59:
                sql = "SELECT DISTINCT id_cotizacion, fk_solicitud, posicion, numero_material, descripcionmat, fotocotizacion, fk_proyecto, codigoproyecto, descripcionproyecto, descripcionempresa, fecha_requerida, fk_proveedor, rif, nombre, telefono1, direccion, cantidad_cotizar, codigo_umb, preciounitario, preciototal, fk_moneda, codigo_moneda, fecha_cotizar, fk_usuario, usuario, justificacion, observacion, tipoplazoentrega, diasplazoentrega, condicionpago, tipotransporteflete, diasflete, costoflete, monedaflete, aprobado_procura, fecha_aprobado_procura, aprobado_gerencia, fecha_aprobado_gerencia, recomendacion_comprador, orden_compra, nro_ordencompra, fecha_carga_compras, status ";
                sql += "FROM vw_cotizacion ";
                sql += "WHERE aprobado_gerencia = TRUE AND status = TRUE AND nro_ordencompra = " + cotizacion.getNro_ordencompra() + ";";
                break;    
            case 60:
                sql = "UPDATE tbl_cotizacion ";   
                sql += "SET fk_proveedor = " + cotizacion.getId_proveedor() + ",fk_moneda = " + cotizacion.getCodigo_moneda() + ",cantidad_cotizar = " + cotizacion.getCantidad_cotizar() + ", preciounitario = " + cotizacion.getPrecio_unitario() + ", preciototal = " + cotizacion.getPrecio_total() + ", fecha_cotizar = '" + cotizacion.getFecha_cotizacion() + "', tipoplazoentrega = '" + cotizacion.getTipoplazoentrega() + "', diasplazoentrega = " + cotizacion.getDiasplazoentrega() + ", condicionpago = '" + cotizacion.getCondicionpago() + "', tipotransporteflete = '" + cotizacion.getTipotransporteflete() + "', diasflete = " + cotizacion.getDiasflete() + ", costoflete = " + cotizacion.getCostoflete() + ", fk_monedaflete = " + cotizacion.getCodigo_moneda_flete() + ", fotocotizacion = '" + cotizacion.getFotocotizacion() + "', recomendacion_comprador = " + cotizacion.getRecomendacion_comprador() + ", fecha_carga_compras = '" + cotizacion.getFecha_carga_compras() + "' ";
                sql += "WHERE nro_ordencompra = " + cotizacion.getNro_ordencompra();
                break;  

             case 61:     
                sql = "UPDATE tbl_cotizacion ";
                sql += "SET status = FALSE, observacion = 'ANULADO' ";
                sql += "WHERE id_cotizacion <> " + cotizacion.getId_cotizacion() + " AND fk_solicitud = "  + cotizacion.getId_solicitud()  + " AND posicion = " + cotizacion.getPosicion();
                break;  
             
            case 62:     
                sql = "UPDATE tbl_solicitud_det ";
                sql += "SET anulado = TRUE ";
                sql += "WHERE fk_solicitud = "  + cotizacion.getId_solicitud()  + " AND posicion = " + cotizacion.getPosicion();
                break;                 
    
        }
    
        System.out.println(sql);
    }    

      
}
