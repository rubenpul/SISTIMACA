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
import model.class_material;
import view.funciones;

/**
 *
 * @author ruben
 */
public class ctrl_material {
    
    class_material material;
    private String sql;
    Integer nro_material_alter;
    Integer nro_material_alter_2;
    private String filtroconsulta;
    String cadena;
    Integer idalmacen;
    Integer idubicacion;
    Integer cantidadsaliente;
    
    
    public ctrl_material(Integer id_material, Integer numero_material, String codigo_mat_alter, String foto_material, String descripcion, String marca, String modelo, Integer unidad_medida, String descripcion_medida, Integer stock_inicial, Integer stock_disponible, Integer stock_usado, Integer stock_minimo, Integer stock_pedido, Integer stock_maximo, Double preciounitario, Double preciototal, String fecha_actualizacion, Integer id_usuario, String descripcionusuario, Integer cantidad_entrante, Integer cantidad_saliente, String observaciones, String usomaterial, Integer id_clasearticulo, String descripcionclasearticulo, Integer id_grupoarticulo, String descripciongrupoarticulo, Integer id_moneda, String descripcionmoneda, String ubicacion, Integer id_almacen, String descripcionalmacen, Integer id_empresa, String descripcionempresa, Integer id_valoracion, String descripcionvaloracion,Boolean status) {
        material = new class_material(id_material,numero_material,codigo_mat_alter,foto_material,descripcion,marca,modelo,unidad_medida,descripcion_medida,stock_inicial,stock_disponible,stock_usado,stock_minimo,stock_pedido,stock_maximo,preciounitario,preciototal,fecha_actualizacion,id_usuario,descripcionusuario,cantidad_entrante,cantidad_saliente,observaciones,usomaterial,id_clasearticulo,descripcionclasearticulo,id_grupoarticulo,descripciongrupoarticulo,id_moneda,descripcionmoneda,ubicacion,id_almacen,descripcionalmacen,id_empresa,descripcionempresa,id_valoracion,descripcionvaloracion,status);
        sql = "";
        nro_material_alter = 0;
        nro_material_alter_2 = 0;
    }
    
    
    public class_material actualizar_material(){
        
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "EL NUMERO DE MATERIAL EXISTE EN LA BASE DE DATOS");    
                    cnn.cerrar(); 
                    material.setStatus(false);
                    return material;
                }
                cnn.cerrar(); 
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                return material;
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             return material;
        }
        
        
        buscar_sql(1);
        
          
        cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
                buscar_sql(4);
                cnn = new conexion(sql,"buscar");
        
                if (cnn.estado){
            
                    try {
                        if(cnn.rs.next()){
                                           
                            material.setId_material(cnn.rs.getInt(1));
                            cnn.cerrar(); 
                        }   
                    } 
                    catch (SQLException err) {
                        JOptionPane.showMessageDialog(null, err.getMessage());   
                        cnn.cerrar();
                        material.setStatus(false);
                        return material;
                    }    
                }   
                else{
                    cnn.cerrar();
                }        
        }   
             buscar_sql(2);
            
            
            cnn = new conexion(sql,"");
        
            
           
                        
                if (cnn.estado){
            
                    JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DEL ALMACÉN SATISFACTORIA");
                    cnn.cerrar();
                    material.setStatus(true);
                    return material;
                }
                else{
                    JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL ALMACÉN");
                    cnn.cerrar();
                     material.setStatus(false);
                    return material;
                }
       
       
    }
    
    
    public class_material consultar_fotomaterial() {
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    material.setFoto_material(cnn.rs.getString(2));
                    cnn.cerrar();
                    material.setStatus(true);
                    return material;
                }
                else{
                    cnn.cerrar(); 
                    material.setStatus(false);
                    return material;
                }
                
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                return material;
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             return material;
        }
    }    
    
     public class_material consultar_descripcionmaterial() {
        buscar_sql(3);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                   
                    material.setDescripcion(cnn.rs.getString(3));
                    material.setDescripcion_medida(cnn.rs.getString(4));
                    material.setId_material(cnn.rs.getInt(5));
                     
                    material.setStatus(true);
                    cnn.cerrar(); 
                    return material;
                }
                else{
                    cnn.cerrar(); 
                    material.setStatus(false);
                    return material;
                }
                
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                return material;
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             return material;
        }
    }    
    
    public class_material consultar_material() {
        
        buscar_sql(5);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    material.setCodigo_mat_alter(cnn.rs.getString(2));
                    material.setDescripcion(cnn.rs.getString(3));
                    material.setMarca(cnn.rs.getString(4));
                    material.setModelo(cnn.rs.getString(5));
                    material.setDescripcion_medida(cnn.rs.getString(6));
                    material.setDescripcionclasearticulo(cnn.rs.getString(7));
                    material.setDescripciongrupoarticulo(cnn.rs.getString(8));
                    material.setStock_disponible(cnn.rs.getInt(9));
                    material.setCantidad_entrante(cnn.rs.getInt(13));
                    material.setCantidad_saliente(cnn.rs.getInt(14));
                    material.setFoto_material(cnn.rs.getString(15));
                    material.setStock_maximo(cnn.rs.getInt(10));
                    material.setStock_minimo(cnn.rs.getInt(11));
                    material.setStock_pedido(cnn.rs.getInt(12));
                    material.setStock_pedido(cnn.rs.getInt(12));
                    
                    
                    
                    material.setStatus(true);
                    cnn.cerrar(); 
                    return material;
                }
                else{
                    material.setStatus(false);
                    cnn.cerrar(); 
                    return material;
                }
                
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                return material;
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             return material;
        }
    }     

    public class_material actualizar_nromaterial(Integer nromaterial_desde,Integer nromaterial_alter,Integer idalmacen,Integer idubicacion,Integer cantidadsaliente){
        
        nro_material_alter = nromaterial_alter;
        this.idalmacen = idalmacen;
        this.idubicacion = idubicacion;
        this.cantidadsaliente = cantidadsaliente;
       
        
        
        buscar_sql(6);
        conexion cnn = new conexion(sql,"");
        
               
        consultar_descripcionmaterial_2();
        
        nro_material_alter = material.getId_material();
        
        
        if (cnn.estado){
            cnn.cerrar();
            material.setNumero_material(nromaterial_desde);
            consultar_descripcionmaterial();
            nro_material_alter_2 = material.getId_material();
            buscar_sql(7);
            cnn = new conexion(sql,"");
            
            if (cnn.estado){
                cnn.cerrar();
                //buscar_sql(8);
                //cnn = new conexion(sql,"");
                //if(cnn.estado){
                //    cnn.cerrar();
                    buscar_sql(19);
                    cnn = new conexion(sql,"");
                    material.setStatus(true);
                    cnn.cerrar();
                    return material;
                /*}
                else{
                    material.setStatus(false);
                    cnn.cerrar();
                    return material;
                }*/
            }  
            else{
             
                material.setStatus(false);
                cnn.cerrar();
                return material;
            }
         }   
        else{
             
             material.setStatus(false);
             cnn.cerrar();
             return material;
        }
    
    }
    
    public void consultar_material_maestro_detalle(JTable data) {
        
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();

        modelotabla.setRowCount(0);
        
        buscar_sql(5);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                 // a.codigo_mat_alter, a.descripcion as descripcionmaterial,a.marca,a.modelo,b.descripcion as clasematerial,b.descripcionarticulo,c.descripcion,a.stock_disponible,a.cantidad_entrante,a.cantidad_saliente,a.foto_material,a.stock_maximo,a.stock_minimo,a.stock_pedido,a.stock_usado
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getInt(2),
                        cnn.rs.getString(3),
                        cnn.rs.getString(4),
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        cnn.rs.getString(7),
                        cnn.rs.getString(8),
                        cnn.rs.getInt(9),
                        cnn.rs.getInt(10),
                        cnn.rs.getInt(11),
                        cnn.rs.getInt(12),
                        cnn.rs.getInt(13),
                        cnn.rs.getInt(14),
                        cnn.rs.getString(15),
                        cnn.rs.getString(16),
                        cnn.rs.getInt(17)
                        
                   });
                    
                    
                    material.setStatus(true);
                    
                }
               cnn.cerrar();
                
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             
        }
    }     
    
    public void consultar_material_maestro_detalle_descripcion(JTable data) {
        
        String[] aux;
        Integer i = 0;
        
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();

        modelotabla.setRowCount(0);
        this.cadena = "";
        
        if(material.getDescripcion().contains("*")){
            aux = material.getDescripcion().trim().split("\\*");
            while (i < aux.length){
                if (i.equals(0)){
                    this.cadena = "a.descripcion LIKE '%" + aux[i]  + "%' ";
                }
                else{
                    this.cadena += "AND a.descripcion LIKE '%" + aux[i]  + "%' ";
                }
                i++;    
            }
        }    
        else{
            this.cadena += "a.descripcion LIKE '%"  + material.getDescripcion() + "%'";
        }
        
        
        buscar_sql(10);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                 // a.codigo_mat_alter, a.descripcion as descripcionmaterial,a.marca,a.modelo,b.descripcion as clasematerial,b.descripcionarticulo,c.descripcion,a.stock_disponible,a.cantidad_entrante,a.cantidad_saliente,a.foto_material,a.stock_maximo,a.stock_minimo,a.stock_pedido,a.stock_usado
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getInt(2),
                        cnn.rs.getString(3),
                        cnn.rs.getString(4),
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        cnn.rs.getString(7),
                        cnn.rs.getString(8),
                        cnn.rs.getInt(9),
                        cnn.rs.getInt(10),
                        cnn.rs.getInt(11),
                        cnn.rs.getInt(12),
                        cnn.rs.getInt(13),
                        cnn.rs.getInt(14),
                        cnn.rs.getString(15),
                        cnn.rs.getString(16),
                        cnn.rs.getInt(17)
                    });
                    
                    
                    material.setStatus(true);
                    
                }
                cnn.cerrar();
                
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             
        }
    }     
    
    public void consultar_material_maestro_general(JTable data) {
        
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();

        modelotabla.setRowCount(0);
        
        buscar_sql(9);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                 // a.codigo_mat_alter, a.descripcion as descripcionmaterial,a.marca,a.modelo,b.descripcion as clasematerial,b.descripcionarticulo,c.descripcion,a.stock_disponible,a.cantidad_entrante,a.cantidad_saliente,a.foto_material,a.stock_maximo,a.stock_minimo,a.stock_pedido,a.stock_usado
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),   //id
                        cnn.rs.getInt(2),   //nro material
                        cnn.rs.getString(3),//descripcion
                        cnn.rs.getString(4),//marca
                        cnn.rs.getString(5),//modelo
                        cnn.rs.getString(6),//umb
                        cnn.rs.getString(7),//claseart
                        cnn.rs.getString(8),//grupoart
                        cnn.rs.getInt(9),//stockdisp
                        cnn.rs.getInt(10),//stockmin
                        cnn.rs.getInt(11),//stockmax
                        cnn.rs.getInt(12),//stockpedido
                        cnn.rs.getInt(13),
                        cnn.rs.getInt(14),//campo1
                        cnn.rs.getString(15),//uso
                        cnn.rs.getString(16),//obser
                        cnn.rs.getInt(17),//idgrupo
                    });
                    
                    
                    material.setStatus(true);
                    
                }
                cnn.cerrar();
                
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             
        }
    }     
    
    public void consultar_material_maestro_detalle_clasematerial(JTable data) {
        
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();

        modelotabla.setRowCount(0);
        
        buscar_sql(11);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                 // a.codigo_mat_alter, a.descripcion as descripcionmaterial,a.marca,a.modelo,b.descripcion as clasematerial,b.descripcionarticulo,c.descripcion,a.stock_disponible,a.cantidad_entrante,a.cantidad_saliente,a.foto_material,a.stock_maximo,a.stock_minimo,a.stock_pedido,a.stock_usado
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getInt(2),
                        cnn.rs.getString(3),
                        cnn.rs.getString(4),
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        cnn.rs.getString(7),
                        cnn.rs.getString(8),
                        cnn.rs.getInt(10),
                        cnn.rs.getInt(11),
                        cnn.rs.getInt(12),
                        cnn.rs.getInt(13),
                        cnn.rs.getInt(14),
                    });
                    
                    
                    material.setStatus(true);
                    
                }
                cnn.cerrar();
                
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             
        }
    }     
    
    public void consultar_material_maestro_detalle_grupoarticulo(JTable data) {
        
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();

        modelotabla.setRowCount(0);
        
        buscar_sql(12);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                 // a.codigo_mat_alter, a.descripcion as descripcionmaterial,a.marca,a.modelo,b.descripcion as clasematerial,b.descripcionarticulo,c.descripcion,a.stock_disponible,a.cantidad_entrante,a.cantidad_saliente,a.foto_material,a.stock_maximo,a.stock_minimo,a.stock_pedido,a.stock_usado
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getInt(2),
                        cnn.rs.getString(3),
                        cnn.rs.getString(4),
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        cnn.rs.getString(7),
                        cnn.rs.getString(8),
                        cnn.rs.getInt(10),
                        cnn.rs.getInt(11),
                        cnn.rs.getInt(12),
                        cnn.rs.getInt(13),
                        cnn.rs.getInt(14)
                    });
                    
                    
                    material.setStatus(true);
                    
                }
                cnn.cerrar();
                
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             
        }
    }     
    
     public void consultar_material_maestro_detalle_reservaautorizada(JTable data) {
        
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();

        modelotabla.setRowCount(0);
        
        buscar_sql(13);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getInt(2),
                        cnn.rs.getString(3),
                        cnn.rs.getInt(4),
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        cnn.rs.getString(7),
                        cnn.rs.getInt(8),
                        cnn.rs.getInt(9),
                        cnn.rs.getInt(10)
                    });
                    
                    
                    material.setStatus(true);
                    
                }
                cnn.cerrar();
                
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             
        }
    }     
    
    public void consultar_disponibilidad_material_maestro(JTable data) {
        
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();

        modelotabla.setRowCount(0);
        
        buscar_sql(14);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getString(2),
                        cnn.rs.getString(3),
                        cnn.rs.getString(4),
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        cnn.rs.getInt(7),
                        cnn.rs.getString(8)
                    });
                    
                    
                    material.setStatus(true);
                    
                }
                cnn.cerrar();
                
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             
        }
    }     
    
    
    public class_material consultar_disponibilidad_reserva_material_maestro() {
        
                
        buscar_sql(14);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                   
                        
                        material.setStock_disponible(cnn.rs.getInt(7));
                       cnn.cerrar(); 
                        
                }
                
                
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             
        }
        
        return material;
    }     

    public class_material consultar_disponibilidad_reserva_material_maestro2() {
        
                
        buscar_sql(27);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                   
                        
                        material.setStock_disponible(cnn.rs.getInt(1));
                       cnn.cerrar(); 
                        
                }
                
                
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             
        }
        
        return material;
    }     
    
    
     public void consultar_material_maestro_detalle_stockcurso(JTable data) {
        
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();

        modelotabla.setRowCount(0);
        
        buscar_sql(15);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getInt(2),
                        cnn.rs.getString(3),
                        cnn.rs.getInt(4),
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        cnn.rs.getString(7),
                        cnn.rs.getInt(8),
                        cnn.rs.getInt(9),
                        cnn.rs.getInt(10),
                        funciones.formato_ordencompra(cnn.rs.getInt(11))
                    });
                    
                    
                    material.setStatus(true);
                    
                }
                cnn.cerrar();
                
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             
        }
    }     
    
    public class_material actualizar_material_detalle(){
        
        buscar_sql(16);
        conexion cnn = new conexion(sql,"");
            
            
        
        if (cnn.estado){
            
            buscar_sql(17);
            cnn = new conexion(sql,"");
            material.setStatus(true);
            cnn.cerrar();
            return material;
                
         }   
        else{
             
             material.setStatus(false);
             cnn.cerrar();
             return material;
        }
    
    } 
    
    public class_material consultar_numeromaterial() throws SQLException{
        
        buscar_sql(18);
        conexion cnn = new conexion(sql,"buscar");
             
        
        if (cnn.estado){
            if(cnn.rs.next()){
                material.setNumero_material(cnn.rs.getInt(1));
                cnn.cerrar();
                return material;
            }
            else{
                material.setNumero_material(0);
                cnn.cerrar();
                return material;
            }
                
         }   
        else{
             
             material.setNumero_material(0);
             cnn.cerrar();
             return material;
        }
    
    } 
     
    public void consultar_material_maestro_general_2(JTable data) {
        
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();

        modelotabla.setRowCount(0);
        
        buscar_sql(9);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                                    
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getInt(2),
                        cnn.rs.getString(3),
                        cnn.rs.getString(4),
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        cnn.rs.getString(7),
                        cnn.rs.getString(8),
                        cnn.rs.getInt(9),
                        cnn.rs.getInt(10),
                        cnn.rs.getInt(11),
                        cnn.rs.getInt(12),
                        cnn.rs.getInt(13),
                        cnn.rs.getInt(14),
                        cnn.rs.getString(15),
                        cnn.rs.getString(16),
                        cnn.rs.getInt(17)
                    });
                    
                    
                    material.setStatus(true);
                    
                }
                
                cnn.cerrar();
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             
        }
    }
    
    public class_material consultar_descripcionmaterial_2() {
        buscar_sql(20);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                   
                    material.setDescripcion(cnn.rs.getString(3));
                    material.setDescripcion_medida(cnn.rs.getString(4));
                    material.setId_material(cnn.rs.getInt(5));
                     
                    material.setStatus(true);
                    cnn.cerrar(); 
                    return material;
                }
                else{
                    material.setStatus(false);
                    cnn.cerrar(); 
                    return material;
                }
                
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                return material;
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             return material;
        }
    }  

    public void consultar_material_maestro_resumen_reservaautorizada(JTable data) {
        
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();

        modelotabla.setRowCount(0);
        
        buscar_sql(21);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getInt(2),
                        cnn.rs.getString(3),
                        cnn.rs.getInt(4),
                        cnn.rs.getString(5)
                    });
                    
                    
                    material.setStatus(true);
                    
                }
                
                cnn.cerrar();
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             
        }
    }         
    
    public void consultar_material_maestro_resumen_stockcurso(JTable data) {
        
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();

        modelotabla.setRowCount(0);
        
        buscar_sql(22);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getInt(2),
                        cnn.rs.getString(3),
                        cnn.rs.getInt(4),
                        cnn.rs.getString(5)
                    });
                    
                    
                    material.setStatus(true);
                    
                }
                
                cnn.cerrar();
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             
        }
    }     
    
    public Boolean suprimir_material_maestro() throws SQLException{
        Integer clasematerial=1;
        Integer grupomaterial=1;
        
        //SUPRIMIR DE TABLA DE MATCLASEGRUPO
        buscar_sql(23);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
         
            try {
                if(cnn.rs.next()){ 
                    clasematerial = cnn.rs.getInt(1);
                    grupomaterial = cnn.rs.getInt(2);
                    cnn.cerrar();
                }  
                
                buscar_sql(24);
                cnn = new conexion(sql,"");
                cnn.cerrar();
                

                     
            }
            catch(SQLException ex){
 
            }
            
        }     
        
        //suprimir del maestro de materiales
        buscar_sql(25);
        cnn = new conexion(sql,"");
        if (cnn.estado){
            cnn.cerrar(); 
            return true;
        }
        else{
            
            material.setId_clasearticulo(clasematerial);
            material.setId_grupoarticulo(grupomaterial);
            buscar_sql(2);
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return false;                    
        }
  
        
    }
    
    public Boolean consultar_tomafisica(JTable data){
        this.filtroconsulta = "";
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();

        modelotabla.setRowCount(0);
        
        this.filtroconsulta = "WHERE a.fk_material = b.fk_material AND a.status = TRUE ";
        if (!material.getId_clasearticulo().equals(0)){
            this.filtroconsulta += " AND b.fk_clasematerial = " + material.getId_clasearticulo() + " ";
        }
        
        if (!material.getId_almacen().equals(0)){
            this.filtroconsulta += " AND a.fk_almacen = " + material.getId_almacen() + " ";
        }
 
        buscar_sql(26);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getString(2),
                        cnn.rs.getString(3),
                        cnn.rs.getString(4),
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        cnn.rs.getString(7),
                        cnn.rs.getString(8),
                        cnn.rs.getString(9),
                        cnn.rs.getInt(10),
                        "",
                        ""
                    });
                    
                    
                    material.setStatus(true);
                    
                }
                
                cnn.cerrar();
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                material.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             material.setStatus(false);
             
        }
        
        return material.isStatus();
    }
    
     public void buscar_sql(Integer consulta) {
        
        
        switch (consulta){
            case 1:
                 sql = "INSERT INTO tbl_maestromaterial VALUES(DEFAULT," + material.getNumero_material() + ",'" + material.getCodigo_mat_alter() + "','" + material.getFoto_material() + "','" + material.getDescripcion().toUpperCase()  + "','" + material.getMarca().toUpperCase()  + "','" +  material.getModelo().toUpperCase()  + "','" +  material.getUnidad_medida() + "'," + material.getStock_inicial() + "," + material.getStock_disponible() + "," + material.getStock_usado() + "," + material.getStock_minimo() + "," + material.getStock_pedido() + "," + material.getStock_maximo()  + ",'" + material.getFecha_actualizacion() + "'," + material.getId_usuario()  + "," + material.getCantidad_entrante() + "," + material.getCantidad_saliente() + ",'" +  material.getObservaciones() + "','" + material.getUsomaterial() + "',true);";
                
                break;  
            case 2:
                sql = "INSERT INTO tbl_matclasegrupo VALUES(" + material.getId_material() +  "," + material.getId_clasearticulo() + "," + material.getId_grupoarticulo() + ");"; 
       
                break;    
                
            case 3:
                sql = "SELECT a.numero_material,a.foto_material,a.descripcion,b.codigo_umb,id_material FROM tbl_maestromaterial a INNER JOIN tbl_umb b ON a.fk_unidadmedida = b.id_umb WHERE numero_material = " + material.getNumero_material() + ";"; 
                                
                break;    
            
            case 4: 
                sql = "SELECT MAX(id_material) FROM tbl_maestromaterial;";    
                break;
            
            case 5:  //,a.stock_disponible,a.cantidad_entrante,a.cantidad_saliente,a.foto_material,a.stock_maximo,a.stock_minimo,a.stock_pedido,a.stock_usado   
                sql = "SELECT a.id_material,a.numero_material, a.descripcion as descripcionmaterial,a.marca,a.modelo,c.codigo_umb as unidadmedida,b.descripcion as clasematerial,b.descripcionarticulo,a.stock_disponible,a.stock_minimo,a.stock_maximo,a.stock_pedido,a.cantidad_entrante,a.cantidad_saliente,a.usomaterial,a.observaciones,b.fk_grupomaterial ";
                sql += "FROM tbl_maestromaterial a ";
                sql += "INNER JOIN vw_matclasegrupo b ON ";
                sql += "a.id_material = b.fk_material ";
                 sql += "INNER JOIN tbl_umb c ON ";
                sql += "a.fk_unidadmedida = c.id_umb ";
                sql += "WHERE a.numero_material LIKE '%"  + material.getNumero_material() + "%'";
                break;
                
            case 6: 
                sql = "UPDATE tbl_maestromaterial SET stock_disponible = " + material.getStock_disponible() + ",cantidad_entrante = " + material.getCantidad_entrante() + ",cantidad_saliente = " + material.getCantidad_saliente() + " WHERE numero_material= " + nro_material_alter + ";";    
                break;
            
            case 7: 
                
                sql = "UPDATE tbl_entrada SET fk_material = " + nro_material_alter + " WHERE fk_almacen = " + this.idalmacen + " AND fk_ubicacion = " + this.idubicacion + " AND fk_material = " + nro_material_alter_2 + ";";    
                break;    
            
            case 8: 
                sql = "UPDATE tbl_salida SET fk_material = " + nro_material_alter + " WHERE fk_material = " + nro_material_alter_2 + ";";    
                break;
                
                
            case 9:  //,a.stock_disponible,a.cantidad_entrante,a.cantidad_saliente,a.foto_material,a.stock_maximo,a.stock_minimo,a.stock_pedido,a.stock_usado   
                sql = "SELECT a.id_material,a.numero_material, a.descripcion as descripcionmaterial,a.marca,a.modelo,c.codigo_umb as unidadmedida,b.descripcion as clasematerial,b.descripcionarticulo,a.stock_disponible,a.stock_minimo,a.stock_maximo,a.stock_pedido,a.cantidad_entrante,a.cantidad_saliente,a.usomaterial,a.observaciones,b.fk_grupomaterial ";
                sql += "FROM tbl_maestromaterial a ";
                sql += "INNER JOIN vw_matclasegrupo b ON ";
                sql += "a.id_material = b.fk_material ";
                 sql += "INNER JOIN tbl_umb c ON ";
                sql += "a.fk_unidadmedida = c.id_umb ";
                
                break;    
            case 10:  //,a.stock_disponible,a.cantidad_entrante,a.cantidad_saliente,a.foto_material,a.stock_maximo,a.stock_minimo,a.stock_pedido,a.stock_usado   
                sql = "SELECT a.id_material,a.numero_material, a.descripcion as descripcionmaterial,a.marca,a.modelo,c.codigo_umb as unidadmedida,b.descripcion as clasematerial,b.descripcionarticulo,a.stock_disponible,a.stock_minimo,a.stock_maximo,a.stock_pedido,a.cantidad_entrante,a.cantidad_saliente,a.usomaterial,a.observaciones,b.fk_grupomaterial ";
                sql += "FROM tbl_maestromaterial a ";
                sql += "INNER JOIN vw_matclasegrupo b ON ";
                sql += "a.id_material = b.fk_material ";
                 sql += "INNER JOIN tbl_umb c ON ";
                sql += "a.fk_unidadmedida = c.id_umb ";
                sql += "WHERE " + this.cadena;
                break;    
            
            case 11:  //,a.stock_disponible,a.cantidad_entrante,a.cantidad_saliente,a.foto_material,a.stock_maximo,a.stock_minimo,a.stock_pedido,a.stock_usado   
                sql = "SELECT a.id_material,a.numero_material, a.descripcion as descripcionmaterial,a.marca,a.modelo,c.descripcion as unidadmedida,b.descripcion as clasematerial,b.descripcionarticulo,a.stock_disponible,a.stock_maximo,a.stock_minimo,a.stock_pedido,a.cantidad_entrante,a.cantidad_saliente  ";
                sql += "FROM tbl_maestromaterial a ";
                sql += "INNER JOIN vw_matclasegrupo b ON ";
                sql += "a.id_material = b.fk_material ";
                 sql += "INNER JOIN tbl_umb c ON ";
                sql += "a.fk_unidadmedida = c.id_umb ";
                sql += "WHERE b.fk_clasematerial = "  + material.getId_clasearticulo() + ";";
                break;  
            
            case 12:  //,a.stock_disponible,a.cantidad_entrante,a.cantidad_saliente,a.foto_material,a.stock_maximo,a.stock_minimo,a.stock_pedido,a.stock_usado   
                sql = "SELECT a.id_material,a.numero_material, a.descripcion as descripcionmaterial,a.marca,a.modelo,c.descripcion as unidadmedida,b.descripcion as clasematerial,b.descripcionarticulo,a.stock_disponible,a.stock_maximo,a.stock_minimo,a.stock_pedido,a.cantidad_entrante,a.cantidad_saliente  ";
                sql += "FROM tbl_maestromaterial a ";
                sql += "INNER JOIN vw_matclasegrupo b ON ";
                sql += "a.id_material = b.fk_material ";
                 sql += "INNER JOIN tbl_umb c ON ";
                sql += "a.fk_unidadmedida = c.id_umb ";
                sql += "WHERE b.fk_grupomaterial = "  + material.getId_grupoarticulo() + ";";
                break;     
            
            case 13: 
                
                sql = "SELECT fk_reserva,numero_material,descripcionmat,posicion,unidad_medida,descripcionempresa,descripcionproyecto,cantidad_solicitada,cantidad_aprobada,cantidad_autorizada ";
                sql += "FROM vw_reserva_detalle ";
                sql += "WHERE numero_material = " + material.getNumero_material() + " AND aprobado_solicitado = TRUE AND aprobado_gerente = TRUE AND conformado_almacen = FALSE AND anulado = FALSE ";
                
                break;
                
            case 14:
                sql = "SELECT a.numero_material,a.descripcionmaterial,a.descripcionvaloracion,a.descripcionalmacen,a.descripcionubicacion,a.descripcionproyecto,COUNT(a.numero_material) as cantidad,a.codigo_umb ";
                sql += "FROM vw_entrada a ";
                sql += "WHERE a.status = true AND a.numero_material = " + material.getNumero_material();
                sql += " GROUP BY a.numero_material,a.descripcionmaterial,a.descripcionvaloracion,a.descripcionalmacen,a.descripcionubicacion,a.descripcionproyecto;";
                break;
                
            case 15: 
                
                sql = "SELECT b.fk_solicitud,b.numero_material,b.descripcionmat,b.posicion,b.codigo_umb,b.descripcionproyecto,b.descripcionempresa,b.cantidad_solicitada,b.cantidad_aprobada,b.cantidad_autorizada,a.nro_ordencompra ";
                sql += "FROM tbl_cotizacion a ";
                sql += "INNER JOIN vw_solicitud_detalle b ON ";
                sql += "a.fk_solicitud = b.fk_solicitud AND a.posicion = b.posicion ";
                sql += "WHERE b.numero_material = " + material.getNumero_material()  + " AND a.nro_ordencompra != 0 AND a.orden_compra = 1 AND a.status = TRUE AND a.observacion !='CERRADO'";
                
                break;
                
            case 16:
                sql = "UPDATE tbl_maestromaterial ";
                sql += "SET usomaterial = '" + material.getUsomaterial() + "',observaciones = '" + material.getObservaciones() + "',fk_unidadmedida = " + material.getUnidad_medida() + ",modelo = '" + material.getModelo().toUpperCase() + "',marca = '" + material.getMarca().toUpperCase()  + "',descripcion = '" + material.getDescripcion().toUpperCase()  + "',foto_material = '" + material.getFoto_material() + "', stock_minimo = " + material.getStock_minimo() + ",stock_pedido =" + material.getStock_pedido() +  ",stock_maximo =" + material.getStock_maximo() + ",observaciones = '" + material.getObservaciones().toUpperCase()  + "',usomaterial = '" + material.getUsomaterial().toUpperCase() + "'";
                sql += " WHERE numero_material = " + material.getNumero_material();
                 break;
            
            case 17:
                sql = "UPDATE sistimaca.tbl_matclasegrupo ";
                sql += "SET fk_clasematerial = " + material.getId_clasearticulo() + ",fk_grupomaterial = " + material.getId_grupoarticulo();
                sql += " WHERE fk_material = " + material.getId_material();
                break;
            case 18:
                sql = "SELECT MAX(numero_material)+1 FROM tbl_maestromaterial;";
                break;
                
            case 19: 
                sql = "UPDATE tbl_maestromaterial SET stock_disponible = stpck_disponible - " + this.cantidadsaliente + ",cantidad_entrante = cantidad_entrante - " + this.cantidadsaliente + ",cantidad_saliente = cantidad_saliente + " + this.cantidadsaliente +  " WHERE id_material= " + nro_material_alter_2 + ";";    
                break; 
            
            case 20:
                
                sql = "SELECT a.numero_material,a.foto_material,a.descripcion,b.codigo_umb,id_material FROM tbl_maestromaterial a INNER JOIN tbl_umb b ON a.fk_unidadmedida = b.id_umb WHERE numero_material = " + nro_material_alter + ";"; 
                                
                break;  
                
            case 21:
                sql = "SELECT id_material,numero_material,descripcionmat,SUM(cantidad_autorizada),unidad_medida FROM vw_reserva_detalle WHERE aprobado_solicitado = TRUE AND aprobado_gerente = TRUE AND conformado_almacen = FALSE AND anulado = FALSE GROUP BY id_material,numero_material,descripcionmat;";
                break;
            
            case 22: 
                sql = "SELECT b.fk_material,b.numero_material,b.descripcionmat,SUM(cantidad_cotizar) AS cantidad, b.codigo_umb ";
                sql += "FROM tbl_cotizacion a ";
                sql += "INNER JOIN vw_solicitud_detalle b ON ";
                sql += "a.fk_solicitud = b.fk_solicitud AND a.posicion = b.posicion ";
                sql += "WHERE a.nro_ordencompra != 0 AND a.orden_compra = 1 AND a.status = true AND a.observacion !='CERRADO' ";
                sql += "GROUP BY b.fk_material,b.numero_material,b.descripcionmat;";
                break;
                
            case 23:
                sql = "SELECT fk_clasematerial,fk_grupomaterial ";
                sql += "FROM tbl_matclasegrupo ";
                sql += "WHERE fk_material = " + material.getId_material();
                break;
            
            case 24:
                sql = "DELETE ";
                sql += "FROM tbl_matclasegrupo ";
                sql += "WHERE fk_material = " + material.getId_material();
                break; 
             
            case 25:
                sql = "DELETE ";
                sql += "FROM tbl_maestromaterial ";
                sql += "WHERE id_material = " + material.getId_material();
                break;  
                
            case 26:
                sql = "SELECT a.numero_material, CONCAT(LEFT(b.descripcion,2),'-',a.numero_material,'-', b.fk_grupomaterial) AS codigomaestro,a.descripcionmaterial,b.marca,b.modelo,a.codigo_umb,a.descripcionalmacen,a.descripcionubicacion,a.descripcionvaloracion, COUNT(a.numero_material) AS cantidad ";
                sql += "FROM vw_entrada a, vw_matclasegrupo b ";
                sql += this.filtroconsulta + " "; 
                sql += "GROUP BY a.numero_material,a.descripcionmaterial,a.codigo_umb,a.descripcionalmacen,a.descripcionubicacion,a.descripcionvaloracion;";
                         
                break;    
            
             case 27:
                sql = "SELECT COUNT(a.numero_material) ";
                sql += "FROM vw_entrada a ";
                sql += "WHERE a.status = true AND a.numero_material = " + material.getNumero_material();
                break;    
                
                        
        }
       
         System.out.println(sql);
    }
    
    
}
