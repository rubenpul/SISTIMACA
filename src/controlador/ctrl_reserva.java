/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.class_material;

import model.class_reserva;
import model.class_usuario;
import view.funciones;

/**
 *
 * @author ruben
 */
public class ctrl_reserva {
    
    class_reserva reserva;
    ctrl_usuario responsable;
    private Integer posicion_act;
    private String sql;
    String fechadesde;
    String fechahasta;
     String cadena;
    String anulado;
    
    public ctrl_reserva(Integer id_reserva, Integer cedula, Integer id_area, String descripcion_area, Integer id_material, Integer numero_material,String descripcion_material, Integer id_empresa, String descripcion_empresa, Integer id_proyecto, String descripcion_proyecto, Integer posicion, Integer cantidad_solicitada,Integer cantidad_aprobada,Integer cantidad_autorizada,Integer cantidad_cotizada, String fecha_reserva, String fecha_requerida, String justificacion, boolean autorizado, String aprobado_solicitado, String fecha_aprobado_solicitado, String conformado_almacen, String fecha_conformado_almacen, String compras_recibido, String fecha_compras_recibido, String autorizado_gerente, String fecha_autorizado_gerente, String observaciones) {
        reserva = new class_reserva(id_reserva,cedula,id_area,descripcion_area,id_material,numero_material,descripcion_material,id_empresa,descripcion_empresa,id_proyecto,descripcion_proyecto,posicion,cantidad_solicitada,cantidad_aprobada,cantidad_autorizada,cantidad_cotizada,fecha_reserva,fecha_requerida,justificacion,autorizado,aprobado_solicitado,fecha_aprobado_solicitado,conformado_almacen,fecha_conformado_almacen,compras_recibido,fecha_compras_recibido,autorizado_gerente,fecha_autorizado_gerente,observaciones);
        responsable = new ctrl_usuario(cedula,"","", "","",0,"",0,"",0,false,"");
        sql = "";
        posicion_act = 1;
    }
    
     public String buscarnombreresponsable(){
        class_usuario modelo_usuario= null;
        
        modelo_usuario = responsable.buscar_usuario();
        
        return modelo_usuario.getNombres();
        
    }
    
    public void buscar_material(JTable tabla){
        Integer i;
        
        if (reserva.getNumero_material().equals(-1)){
            buscar_sql(2);
        }
        else{
            buscar_sql(1);
        }
        
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
                        cnn.rs.getInt(1),
                        cnn.rs.getString(2)
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
    
    public void buscar_id_material() throws SQLException{
    
        buscar_sql(5);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
           
            if(cnn.rs.next()){
                reserva.setId_material(cnn.rs.getInt(1));
            }
            cnn.cerrar();
            //return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN BÚSQUEDA DE CODIGO DE MATERIAL");
            cnn.cerrar();
           
        }
        
    }
  
    
    
    public class_reserva crear_posicion(JTable tabla) throws SQLException{
        conexion cnn;
        
        buscar_id_material();
        
        if (reserva.getId_reserva().equals(0)){
            buscar_sql(7);
            cnn = new conexion(sql,"buscar");
            
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                        reserva.setId_reserva(cnn.rs.getInt(1)+1);
                    }
                    
                    if(reserva.getId_reserva().equals(1)){
                        reserva.setId_reserva(800000000);
                    }
                    
                }    
                catch (SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage());   
                    cnn.cerrar();
                }
            }    
            cnn.cerrar();
            
            buscar_sql(3);
            cnn = new conexion(sql,"");
            cnn.cerrar();
            reserva.setPosicion(1);
            
            buscar_sql(4);
            cnn = new conexion(sql,"");
            cnn.cerrar();
            
            
        }
        else{
            reserva.setPosicion(reserva.getPosicion()+1);
            buscar_sql(4);
            cnn = new conexion(sql,"");
            cnn.cerrar();
        }    
                
        consultar_reserva_detalle2(tabla);
        
    
        return reserva;
        
    }
    
    public class_reserva borrar_posicion(JTable tabla,Integer pos){
        Integer i;
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        reserva.setPosicion(Integer.parseInt(modelotabla.getValueAt(pos,0).toString()));
        
        modelotabla.removeRow(pos);
        tabla.revalidate();
        
        buscar_sql(8);
        conexion cnn = new conexion(sql,"");
        cnn.cerrar();
        reserva.setStatus(true);
        
       
        for(i = 0; i <= modelotabla.getRowCount()-1 ;i++){
           modelotabla.setValueAt(i+1, i,0);
        } 
        
        buscar_sql(6);
        
        cnn = new conexion(sql,"buscar");
        
            
            if (cnn.estado){
            
                try{
                    
                    while(cnn.rs.next()){
                        reserva.setPosicion(cnn.rs.getInt(1));
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
        
        
        
        return reserva;
    }
    
   
    
    
       
    
    public void consultar_reserva_detalle(JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
        buscar_sql(6);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),   //reserva
                        cnn.rs.getInt(2),   //posicion
                        cnn.rs.getInt(3),   //nromaterial
                        cnn.rs.getString(4),//materialsolicituado
                        cnn.rs.getInt(5),   //cantidad
                        cnn.rs.getString(6),//umb
                        cnn.rs.getString(7),//grupoarticulo
                        cnn.rs.getString(8),//fecharequerida
                        cnn.rs.getString(9),//justificacion
                        cnn.rs.getString(10), //observacion
                        cnn.rs.getString(11), //observacion
                        cnn.rs.getString(13), //observacion
                        cnn.rs.getString(14), //observacion
                        cnn.rs.getString(15),
                        cnn.rs.getString(12)
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
    
    public void consultar_reserva_detalle2(JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
        buscar_sql(6);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),   //posicion
                        cnn.rs.getInt(2),   //nromaterial
                        cnn.rs.getString(3),//materialsolicituado
                        cnn.rs.getInt(4),   //cantidad
                        cnn.rs.getString(5),//umb
                        cnn.rs.getString(6),//grupoarticulo
                        cnn.rs.getString(7),//fecharequerida
                        cnn.rs.getString(8),//justificacion
                        cnn.rs.getString(9), //observacion
                        cnn.rs.getString(10), //observacion
                        cnn.rs.getString(12), //observacion
                        cnn.rs.getString(13), //observacion
                        cnn.rs.getString(14),
                        cnn.rs.getString(11)
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
    
    
    public String consultar_foto(){
        ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,reserva.getNumero_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
        modelo_material = material.consultar_fotomaterial();
        
        return modelo_material.getFoto_material();
        
    }
    
    public void consultar_reserva_detalle_aprobada(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
       
            buscar_sql(23);
        /*switch (perfil){
            
            case 0: buscar_sql(21);
                    break;
            case 1: buscar_sql(22);
                    break;
            case 2: buscar_sql(23);
                    break;
            case 3: buscar_sql(24);
                    break;
                    
                    
        }*/
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    
                    reserva.setId_reserva(cnn.rs.getInt(1));
                    reserva.setPosicion(cnn.rs.getInt(2));
                                       
                    if (reserva.getId_area().equals(0)){
                        buscar_sql(50);
                    }
                    else{
                        buscar_sql(51);
                    }
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            false,
                            cnn2.rs.getInt(1),   //posicion
                            cnn2.rs.getInt(2),   //nromaterial
                            cnn2.rs.getString(3),//materialsolicituado
                            cnn2.rs.getInt(4),   //cantidad reservada
                            cnn2.rs.getInt(4),   //cantidad aprobada
                            cnn2.rs.getString(6),//umb
                            cnn2.rs.getString(7),//grupoarticulo
                            cnn2.rs.getString(8),//fecharequerida
                            cnn2.rs.getString(9),//justificacion
                            cnn2.rs.getString(10), //observacion
                            cnn2.rs.getString(11), //observacion
                            cnn2.rs.getString(12), //observacion
                            cnn2.rs.getString(13), //observacion
                            cnn2.rs.getString(14),
                            cnn2.rs.getString(12)
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
    
    
    public void consultar_reserva_por_aprobar(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
       
        //switch (perfil){
            buscar_sql(12);
            
            /*case 0: buscar_sql(12);
                    break;
            case 1: buscar_sql(11);
                    break;
            case 2: buscar_sql(12);
                    break;
            case 3: buscar_sql(13);
                    break;*/
                    
                    
       // }
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    
                    reserva.setId_reserva(cnn.rs.getInt(1));
                    
                    
                    if (reserva.getId_area().equals(0)){
                        buscar_sql(16);
                    }
                    else{
                        buscar_sql(15);
                    }
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    if (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //RESERVA
                            cnn2.rs.getInt(2),   //cedula
                            cnn2.rs.getString(3),   //nombres
                            cnn2.rs.getString(4),//area
                            cnn2.rs.getString(5),   //proyecto
                            cnn2.rs.getString(6),//empresa
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
    
    public Boolean aprobar_reserva_posicion(Integer nivel){
        conexion cnn;
        
        ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,reserva.getNumero_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
        modelo_material = material.consultar_disponibilidad_reserva_material_maestro();
        
        //if (!nivel.equals(4) && !nivel.equals(5)){
        
            if ( modelo_material.getStock_disponible() >= reserva.getCantidad_solicitada()){
                
            
            buscar_sql(19);
            
            /*switch (nivel){
            
                case 0: buscar_sql(17);
                        break;
                case 1: buscar_sql(18);
                        break;
                case 2: buscar_sql(19);
                        break;
                case 3: buscar_sql(20);
                        break;
            }*/
                
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "LA CANTIDAD DE MATERIAL SOLICITADA SUPERA A LO QUE DISPONE EL INVENTARIO");
                return false;
            }
        //}
     
       
       
    }
    
     public Boolean autorizar_reserva_posicion_anular(Integer nivel){
        conexion cnn;
        
       // if (nivel.equals(0) || nivel.equals(1) || nivel.equals(2)){
        
            buscar_sql(27);
               
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return true;
       // }
     
       // return false;
       
    }
    
    public void consultar_estatus_reserva(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
        if (reserva.getId_area().equals(0)){
            buscar_sql(28);
        }
        else{
            buscar_sql(29);
        }
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    
                    modelotabla.addRow(new Object[]{
                            cnn.rs.getInt(1),   //RESERVA
                            cnn.rs.getInt(2),   //cedula
                            cnn.rs.getString(3),   //nombres
                            cnn.rs.getString(4),//area
                            cnn.rs.getString(5),   //proyecto
                            cnn.rs.getString(6)//empresa
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
    
    public void consultar_reserva_detalle_estatus(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
        String statusjefe;
        String fechajefe;
        String statusgerente;
        String fechagerente;
        String statusalmacen;
        String fechaalmacen;
        String statusposicion;
        
        modelotabla.setRowCount(0);
              
        if (reserva.getId_area().equals(0)){
            buscar_sql(33);
        }
        else{
            buscar_sql(34);
        }
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    
                    reserva.setId_reserva(cnn.rs.getInt(1));
                    reserva.setPosicion(cnn.rs.getInt(2));
                    
                    if (cnn.rs.getString(15).equals("0")){
                        statusjefe = "PENDIENTE";
                        fechajefe = "";
                    }
                    else{
                        statusjefe = "APROBADO";
                        fechajefe = cnn.rs.getString(16);
                    }
                    
                    if (cnn.rs.getString(21).equals("0")){
                        statusgerente = "PENDIENTE";
                        fechagerente = "";
                    }
                    else{
                        statusgerente = "APROBADO";
                        fechagerente = cnn.rs.getString(22);
                    }
                    
                    if (cnn.rs.getString(18).equals("0")){
                        statusalmacen = "PENDIENTE";
                        fechaalmacen = "";
                    }
                    else{
                        statusalmacen = "APROBADO";
                        fechaalmacen = cnn.rs.getString(19);
                    }
                    
                    if(cnn.rs.getString(9).equals("0")){
                        statusposicion = "ACTIVO";
                    }
                    else{
                        statusposicion = "ANULADO";
                    }
                    
                    modelotabla.addRow(new Object[]{
                            cnn.rs.getInt(1),   //posicion
                            cnn.rs.getInt(2),   //nromaterial
                            cnn.rs.getString(3),//materialsolicituado
                            cnn.rs.getInt(4),   //cantidad
                            cnn.rs.getString(5),//umb
                            cnn.rs.getString(7),//fecharequerida
                            statusjefe,//aprobacionJefe
                            fechajefe,//fechaaprobacionjefe
                            statusgerente, //aprobacion gerente
                            fechagerente, //fechaaprobaciongerente
                            statusalmacen, //conformacionalmacen
                            fechaalmacen, //fechaconformacionalmacen
                            statusposicion //anulado
               
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
    
    public void consultar_reserva_detalle_salida(JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
        buscar_sql(30);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),   //reserva
                        cnn.rs.getInt(2),   //posicion
                        cnn.rs.getInt(3),   //nromaterial
                        cnn.rs.getString(4),//materialsolicituado
                        cnn.rs.getInt(5),   //cantidad
                        cnn.rs.getString(6),//umb
                        cnn.rs.getString(8),//fecharequerida
                        cnn.rs.getString(11), //observacion
                        cnn.rs.getString(12), //observacion
                        cnn.rs.getString(13), //observacion
                        cnn.rs.getString(14)
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
    
    public void consultar_reserva_por_autorizar(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
        
        //switch (perfil){
            buscar_sql(11);
            
            /*case 0: buscar_sql(12);
                    break;
            case 1: buscar_sql(11);
                    break;
            case 2: buscar_sql(12);
                    break;
            case 3: buscar_sql(13);
                    break;*/
                    
                    
       // }
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    
                    reserva.setId_reserva(cnn.rs.getInt(1));
                    
                    
                    if (reserva.getId_area().equals(0)){
                        buscar_sql(16);
                    }
                    else{
                        buscar_sql(15);
                    }
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    if (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //RESERVA
                            cnn2.rs.getInt(2),   //cedula
                            cnn2.rs.getString(3),   //nombres
                            cnn2.rs.getString(4),//area
                            cnn2.rs.getString(5),   //proyecto
                            cnn2.rs.getString(6),//empresa
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
    
    public void consultar_reserva_detalle_autorizada(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
       
            buscar_sql(22);
        /*switch (perfil){
            
            case 0: buscar_sql(21);
                    break;
            case 1: buscar_sql(22);
                    break;
            case 2: buscar_sql(23);
                    break;
            case 3: buscar_sql(24);
                    break;
                    
                    
        }*/
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    
                    reserva.setId_reserva(cnn.rs.getInt(1));
                    reserva.setPosicion(cnn.rs.getInt(2));
                                       
                    if (reserva.getId_area().equals(0)){
                        buscar_sql(25);
                    }
                    else{
                        buscar_sql(26);
                    }
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            false,
                            cnn2.rs.getInt(1),   //posicion
                            cnn2.rs.getInt(2),   //nromaterial
                            cnn2.rs.getString(3),//materialsolicituado
                            cnn2.rs.getInt(5),   //cantidad aprobada
                            cnn2.rs.getInt(5),   //cantidad autorizada
                            cnn2.rs.getString(7),//umb
                            cnn2.rs.getString(8),//grupoarticulo
                            cnn2.rs.getString(9),//fecharequerida
                            cnn2.rs.getString(10),//justificacion
                            cnn2.rs.getString(11), //observacion
                            cnn2.rs.getString(12), //observacion
                            cnn2.rs.getString(14), //observacion
                            cnn2.rs.getString(15), //observacion
                            cnn2.rs.getString(16),
                            cnn2.rs.getString(13)
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
    
    public Boolean autorizar_reserva_posicion(Integer nivel){
        conexion cnn;
        
        ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,reserva.getNumero_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
        modelo_material = material.consultar_disponibilidad_reserva_material_maestro();
        
        
        
        if (nivel.equals(0) || nivel.equals(1) || nivel.equals(2)){
        
            if ( modelo_material.getStock_disponible() >= reserva.getCantidad_solicitada()){
          
                buscar_sql(18);
            
            /*switch (nivel){
            
                case 0: buscar_sql(17);
                        break;
                case 1: buscar_sql(18);
                        break;
                case 2: buscar_sql(19);
                        break;
                case 3: buscar_sql(20);
                        break;
            }*/
                
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "LA CANTIDAD DE MATERIAL SOLICITADA SUPERA A LO QUE DISPONE EL INVENTARIO");
                return false;
            }
        }
     
        return false;
       
    }
    
    public void consultar_reserva_por_conformar(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
        
        //switch (perfil){
            buscar_sql(13);
            
            /*case 0: buscar_sql(12);
                    break;
            case 1: buscar_sql(11);
                    break;
            case 2: buscar_sql(12);
                    break;
            case 3: buscar_sql(13);
                    break;*/
                    
                    
       // }
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    
                    reserva.setId_reserva(cnn.rs.getInt(1));
                    
                    
                    if (reserva.getId_area().equals(0)){
                        buscar_sql(16);
                    }
                    else{
                        buscar_sql(15);
                    }
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    if (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //RESERVA
                            cnn2.rs.getInt(2),   //cedula
                            cnn2.rs.getString(3),   //nombres
                            cnn2.rs.getString(4),//area
                            cnn2.rs.getString(5),   //proyecto
                            
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
    
    public void consultar_reserva_detalle_conformar(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
       
            buscar_sql(24);
        /*switch (perfil){
            
            case 0: buscar_sql(21);
                    break;
            case 1: buscar_sql(22);
                    break;
            case 2: buscar_sql(23);
                    break;
            case 3: buscar_sql(24);
                    break;
                    
                    
        }*/
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    
                    reserva.setId_reserva(cnn.rs.getInt(1));
                    reserva.setPosicion(cnn.rs.getInt(2));
                                       
                    if (reserva.getId_area().equals(0)){
                        buscar_sql(25);
                    }
                    else{
                        buscar_sql(26);
                    }
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            false,
                            cnn2.rs.getInt(1),   //posicion
                            cnn2.rs.getInt(2),   //nromaterial
                            cnn2.rs.getString(3),//materialsolicituado
                            cnn2.rs.getInt(4),   //cantidad
                            cnn2.rs.getInt(4),   //cantidad
                            cnn2.rs.getString(7),//umb
                            cnn2.rs.getString(8),//grupoarticulo
                            cnn2.rs.getString(9),//fecharequerida
                            cnn2.rs.getString(10),//justificacion
                            cnn2.rs.getString(11), //observacion
                            cnn2.rs.getString(12), //observacion
                            cnn2.rs.getString(14), //observacion
                            cnn2.rs.getString(15), //observacion
                            cnn2.rs.getString(16),
                            cnn2.rs.getString(13)
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

    public Boolean conformar_reserva_posicion(Integer nivel){
        conexion cnn;

        ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,reserva.getNumero_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
        modelo_material = material.consultar_disponibilidad_reserva_material_maestro2();
        
                
        //if (nivel.equals(0)||nivel.equals(1)||nivel.equals(2)||nivel.equals(3)){
        
            if ( modelo_material.getStock_disponible() >= reserva.getCantidad_aprobada()){
            
            buscar_sql(19);
            
            /*switch (nivel){
            
                case 0: buscar_sql(17);
                        break;
                case 1: buscar_sql(18);
                        break;
                case 2: buscar_sql(19);
                        break;
                case 3: buscar_sql(20);
                        break;
            }*/
                
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "LA CANTIDAD DE MATERIAL SOLICITADA SUPERA A LO QUE DISPONE EL INVENTARIO");
                return false;
            }
            
        //}
     
        //return false;
       
    }

    public void consultar_reserva_conformadas(JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
        buscar_sql(31);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),   //reserva
                        cnn.rs.getInt(2),   //posicion
                        cnn.rs.getInt(3),   //nromaterial
                        cnn.rs.getString(4),//materialsolicituado
                        cnn.rs.getInt(5),   //cantidad conformada
                        cnn.rs.getString(6),//umb
                        cnn.rs.getString(7),//grupoarticulo
                        cnn.rs.getString(8),//fecharequerida
                        cnn.rs.getString(9),//empresa
                        cnn.rs.getString(10), //usuario
                        cnn.rs.getString(11), //nombres
                        cnn.rs.getString(12), //proyecto
                        cnn.rs.getString(13)//idproyecto
                       
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
    
    public void consultar_reserva_fase(JTable tabla,Integer consulta,String fechadesde,String fechahasta,Integer nivel){
        
        String[] aux;
        int i = 0;
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
        this.cadena = "";
        
        switch (consulta){
            
            case 0 :  this.cadena = "WHERE 1=1 AND anulado = FALSE AND aprobado_solicitado = FALSE ";
                       break;
            case 1 :  this.cadena = "WHERE 1=1 AND anulado = FALSE AND aprobado_solicitado = TRUE ";
                       break; 
            case 2 :  this.cadena = "WHERE 1=1 AND anulado = TRUE ";
                       break;  
            case 5 :  this.cadena = "WHERE 1=1 AND anulado = FALSE ";
                       break;             
        }
        
        if (!fechadesde.equals("") && !fechahasta.equals("")){
            this.cadena += "AND fecha_reserva BETWEEN '" + fechadesde + "' AND '" + fechahasta + "' ";
        }

        if (!reserva.getId_proyecto().equals(0)){
            this.cadena += "AND fk_proyecto = " + reserva.getId_proyecto() + " ";
        }

        if (!reserva.getId_reserva().equals(0)){
            this.cadena += "AND fk_reserva LIKE '%" + reserva.getId_reserva() + "%' ";
        }

        if (!reserva.getDescripcion_material().equals("")){
            if(reserva.getDescripcion_material().contains("*")){
               aux = reserva.getDescripcion_material().split("\\*");
               while (i < aux.length){
                    this.cadena += "AND descripcionmat LIKE '%" + aux[i]  + "%' ";
                    i++;    
               }
              
            }
            else{
                this.cadena += "AND descripcionmat LIKE '%" + reserva.getDescripcion_material().trim()  + "%' ";
            }
             
        }
        
        
        switch (nivel){
            case 4: this.cadena += " AND fk_area = " + reserva.getId_area() + " ";
                     break;
            case 9: this.cadena += " AND fk_usuario = " + reserva.getCedula() + " AND fk_area = " + reserva.getId_area() + " ";
                     break;
            case 10: this.cadena += " AND fk_usuario = " + reserva.getCedula() + " ";
                     break;         
        } 
        
        
        buscar_sql(53);
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){

            try{       
                while (cnn.rs.next()){
                       
                       
                        modelotabla.addRow(new Object[]{
                            cnn.rs.getInt(1),   //idarea
                            cnn.rs.getInt(2),   //idproyecto
                            false,
                            cnn.rs.getInt(3),   //nro reserva
                            cnn.rs.getInt(6),//posiciom
                            cnn.rs.getInt(4),   //numero material  
                            cnn.rs.getString(5),//descripcion material
                            cnn.rs.getInt(7),//cantidad solicitada
                            cnn.rs.getString(8),//codigo umb
                            cnn.rs.getString(9), //proyecto
                            cnn.rs.getString(10), //empresa
                            funciones.fecha_bd_usuario(cnn.rs.getDate(11).toString(),1),//fecha solicitud
                            cnn.rs.getBoolean(12), //aprobacion solicitid
                            cnn.rs.getString(13), //fecha aprobaciom
                            cnn.rs.getInt(14), //cantidad aprobada
                            cnn.rs.getBoolean(15), //autorizado solicitud
                            cnn.rs.getString(16), //fecha autorizado
                            cnn.rs.getInt(17), //cantidad autorizada
                            cnn.rs.getBoolean(18), //conformacion solicitud
                            cnn.rs.getString(19), //fecha conformacion
                            cnn.rs.getInt(20), // cantidad conformada
                            cnn.rs.getString(21) //observaciones                       

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
    
    
    
    public void consultar_reserva_activa(JTable tabla,Integer tipo,String fechadesde,String fechahasta,Integer opcion,Integer nivel){
        
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
        switch (opcion){
            case 0: this.anulado = "WHERE 1=1 ";
                     break;
            case 1: this.anulado = "WHERE anulado = FALSE ";
                     break;
            case 2: this.anulado = "WHERE anulado = TRUE ";
                     break;         
        }
        
        switch (nivel){
            case 4: this.anulado += " AND fk_area = " + reserva.getId_area() + " ";
                     break;
            case 9: this.anulado += " AND fk_usuario = " + reserva.getCedula() + " AND fk_area = " + reserva.getId_area() + " ";
                     break;
            case 10: this.anulado += " AND fk_usuario = " + reserva.getCedula() + " ";
                     break;         
        } 
 
        
        switch (tipo){
            case 0: buscar_sql(40);
                    break;
            case 1: buscar_sql(41);
                    break;
            case 2: buscar_sql(42);
                    break;
            case 3: buscar_sql(43);
                    break;
            /*case 4: buscar_sql(44);
                    break;*/   
            case 5: this.fechadesde = fechadesde;
                    this.fechahasta = fechahasta;
                    buscar_sql(45);
                    break;           
        }
        
        conexion cnn = new conexion(sql,"buscar");
        
            if (cnn.estado){
            
                try{       
                    while (cnn.rs.next()){
                        modelotabla.addRow(new Object[]{
                            cnn.rs.getInt(1),   //idarea
                            cnn.rs.getInt(2),   //idproyecto
                            false,
                            cnn.rs.getInt(3),   //nro reserva
                            cnn.rs.getInt(4),   //numero material  
                            cnn.rs.getString(5),//descripcion material
                            cnn.rs.getInt(6),//posiciom
                            cnn.rs.getInt(7),//cantidad solicitada
                            cnn.rs.getString(8),//codigo umb
                            cnn.rs.getString(9), //proyecto
                            cnn.rs.getString(10), //empresa
                            
                            funciones.fecha_bd_usuario(cnn.rs.getDate(11).toString(),1),//fecha solicitud
                            cnn.rs.getBoolean(12), //aprobacion solicitid
                            cnn.rs.getString(13), //fecha aprobaciom
                            cnn.rs.getInt(14), //cantidad aprobada
                            cnn.rs.getBoolean(15), //autorizado solicitud
                            cnn.rs.getString(16), //fecha autorizado
                            cnn.rs.getInt(17), //cantidad autorizada
                            cnn.rs.getBoolean(18), //conformacion solicitud
                            cnn.rs.getString(19), //fecha conformacion
                            cnn.rs.getInt(20) // cantidad conformada
                        
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
    
    public Boolean actualizar_reserva_posicion(){
        conexion cnn;
        
       
            buscar_sql(46);
            
            
                
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return true;
            
       
    }
    
    public Boolean anular_reserva_posicion(){
        conexion cnn;
        
       
            buscar_sql(47);
            
            
                
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return true;
            
       
    }

public Boolean reversar_reserva_posicion(){
        conexion cnn;
        
            buscar_sql(48);
               
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return true;
        
       
}

public Boolean reversar_reserva_posicion_autorizada(){
        conexion cnn;
        
            buscar_sql(49);
               
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return true;
        
       
}

   public void consultar_reserva_activainactivatodas(JTable tabla,Integer consulta,String fechadesde,String fechahasta,Integer nivel){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
        
        switch (consulta){
            
            case 0 :  this.cadena = "WHERE 1=1 ";
                       break;
            case 1 :  this.cadena = "WHERE 1=1 AND anulado = FALSE ";
                       break;   
            case 2 :  this.cadena = "WHERE 1=1 AND anulado = TRUE ";
                       break;          
        }
        
        if (!fechadesde.equals("") && !fechahasta.equals("")){
            this.cadena += "AND fecha_reserva BETWEEN '" + fechadesde + "' AND '" + fechahasta + "' ";
        }

        if (!reserva.getId_proyecto().equals(0)){
            this.cadena += "AND fk_proyecto = " + reserva.getId_proyecto() + " ";
        }

        if (!reserva.getId_reserva().equals(0)){
            this.cadena += "AND fk_solicitud LIKE '%" + reserva.getId_reserva() + "%' ";
        }

        if (!reserva.getDescripcion_material().equals("")){
            this.cadena += "AND descripcionmat LIKE '%" + reserva.getDescripcion_material() + "%' ";
        }

        switch (nivel){
            case 4: this.cadena += " AND fk_area = " + reserva.getId_area() + " ";
                     break;
            case 9: this.cadena += " AND fk_usuario = " + reserva.getCedula() + " AND fk_area = " + reserva.getId_area() + " ";
                     break;
            case 10: this.cadena += " AND fk_usuario = " + reserva.getCedula() + " ";
                     break;         
        } 
 
        
        
        buscar_sql(52);
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){

            try{       
                while (cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                           cnn.rs.getInt(1),   //idarea
                            cnn.rs.getInt(2),   //idproyecto
                            false,
                            cnn.rs.getInt(3),   //nro reserva
                            cnn.rs.getInt(4),   //numero material  
                            cnn.rs.getString(5),//descripcion material
                            cnn.rs.getInt(6),//posiciom
                            cnn.rs.getInt(7),//cantidad solicitada
                            cnn.rs.getString(8),//codigo umb
                            cnn.rs.getString(9), //proyecto
                            cnn.rs.getString(10), //empresa
                            
                            funciones.fecha_bd_usuario(cnn.rs.getDate(11).toString(),1),//fecha solicitud
                            cnn.rs.getBoolean(12), //aprobacion solicitid
                            cnn.rs.getString(13), //fecha aprobaciom
                            cnn.rs.getInt(14), //cantidad aprobada
                            cnn.rs.getBoolean(15), //autorizado solicitud
                            cnn.rs.getString(16), //fecha autorizado
                            cnn.rs.getInt(17), //cantidad autorizada
                            cnn.rs.getBoolean(18), //conformacion solicitud
                            cnn.rs.getString(19), //fecha conformacion
                            cnn.rs.getInt(20) // cantidad conformada

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

   public String consultar_email_usuarioreserva(){
       String email="";
       
       buscar_sql(54);
       
       conexion cnn = new conexion(sql,"buscar");
       
       if (cnn.estado){
           
           try {
               if(cnn.rs.next()){
                   email = cnn.rs.getString(1);
               }
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "ERROR EN ENVIAR CORREO AL SOLICITANTE " + ex.getMessage());
           }
           
           
       }
       cnn.cerrar();
       
       return email;
   
   }
   
   public Boolean agregar_notificacionreserva(String usuarioreceptor){
       
       sql = "INSERT INTO tbl_notificaciondocumento VALUES(DEFAULT," + reserva.getCedula() + "," + reserva.getId_reserva() + ",FALSE,'" + funciones.fecha_bd_usuario(funciones.getfechacalendario(), 2) + "','" + funciones.fecha_bd_usuario(funciones.getfechacalendario(), 2) + "'," + usuarioreceptor.trim() + ");";
       conexion cnn = new conexion(sql,"");
       cnn.cerrar();
       return true;
      
   }
   
   public String consultar_email_usuariosupervisor(Integer Nivel){
       Integer supervisor=0;
       Integer area;
       String email = "";
       String usuario = "";
       Integer i = 0;
       area = reserva.getId_area();
       //area = 0;
       switch (Nivel){
           case 10: supervisor = 1; 
                    break;
           case 9: supervisor = 4; 
                    break;
           case 8: supervisor = 4; 
                    break;
           default: supervisor = 0;
       }
       
       sql = "SELECT correo,id_usuario ";
       sql += "FROM( "; 
       sql += "SELECT correo,id_usuario ";
       sql += "FROM tbl_usuario ";
       sql += "WHERE id_usuario = (SELECT fk_usuario FROM vw_perfil WHERE fk_perfil = " +  supervisor + " AND fk_area = " + area + " AND fk_usuario <> '13090757') ";
       sql += "UNION ";
       sql += "SELECT correo,id_usuario ";
       sql += "FROM tbl_usuario ";
       sql += "WHERE id_usuario = (SELECT fk_usuario FROM vw_perfil WHERE fk_perfil = 0 AND fk_usuario <> '13090757') ";
       sql += ") AS CONSULTA;";
       
       
       conexion cnn = new conexion(sql,"buscar");
       
       if (cnn.estado){
           
           try {
               if(cnn.rs.next()){
                   email += cnn.rs.getString(1);
                   agregar_notificacionreserva(cnn.rs.getString(2));
               }
               if(cnn.rs.next()){
                   email += "," + cnn.rs.getString(1);
                   agregar_notificacionreserva(cnn.rs.getString(2));
               }
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "ERROR EN ENVIAR CORREO AL SUPERVISOR " + ex.getMessage());
           }
           
           
       }
       cnn.cerrar();
       
       return email;
        
   }

   public class_reserva consultar_posicion_noaprob(JTable tabla){
        
                  
        sql = "SELECT max(posicion) ";
        sql += "FROM vw_reserva_detalle ";
        sql += "WHERE fk_reserva = " + reserva.getId_reserva() + " AND aprobado_solicitado = FALSE  AND anulado = FALSE ";
 
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                if(cnn.rs.next()){
                    reserva.setPosicion(cnn.rs.getInt(1));
                }
            
                cnn.cerrar();
            } 
            catch (SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
            }    
        } 
        
              
        sql = "SELECT posicion,numero_material,descripcionmat,cantidad_solicitada,unidad_medida,descripciongrupo,fecha_requerida,justificacion,'' AS observacion ";
         sql += "FROM vw_reserva_detalle ";
         sql += "WHERE fk_reserva = " + reserva.getId_reserva() + " AND aprobado_solicitado = FALSE AND anulado = FALSE ";
         sql += "ORDER BY posicion;";
         

        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),   //posicion
                        cnn.rs.getInt(2),   //nromaterial
                        cnn.rs.getString(3),//materialsolicituado
                        cnn.rs.getInt(4),   //cantidad
                        cnn.rs.getString(5),//umb
                        cnn.rs.getString(6),//grupoarticulo
                        cnn.rs.getString(7),//fecharequerida
                        cnn.rs.getString(8),//justificacion
                        cnn.rs.getString(9) //observacion
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
        
        
        return reserva;
        
    }   
  
   
public void buscar_sql(Integer consulta) {
        
        
        switch (consulta){
            case 1:
                 sql = "SELECT numero_material,descripcionmaterial FROM vw_matclasegrupo WHERE numero_material LIKE '%" + Integer.parseInt(reserva.getNumero_material().toString().trim()) + "%';";
                 
                 break;  
            case 2:
                 sql = "SELECT numero_material,descripcionmaterial FROM vw_matclasegrupo WHERE descripcionmaterial LIKE '%" + reserva.getDescripcion_material().trim() + "%';";
       
                break;    
                
            case 3:
                
                sql = "INSERT INTO tbl_reserva VALUES(" + reserva.getId_reserva() + ",'ABIERTA');"; 
                                
                break;    
            
            case 4: 
                sql = "INSERT INTO tbl_reserva_det VALUES(" + reserva.getId_reserva() + "," + reserva.getCedula() + "," + reserva.getId_area()  + "," + reserva.getId_material() + "," + reserva.getId_empresa() + "," + reserva.getId_proyecto() + "," + reserva.getPosicion() + "," + reserva.getCantidad_solicitada() + ",0,0,0,'" +  reserva.getFecha_reserva() + "','" + reserva.getFecha_requerida() + "','" + reserva.getJustificacion() + "'," + reserva.isAutorizado() + ",FALSE,NULL,0,FALSE,NULL,0,FALSE,NULL,0,'');";  
                break;
                
            case 5:
                sql = "SELECT id_material FROM tbl_maestromaterial WHERE numero_material = " + reserva.getNumero_material() + ";";
                break;
            
            case 6:
                sql = "SELECT posicion, numero_material,descripcionmat,cantidad_solicitada,unidad_medida,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea FROM vw_reserva_detalle WHERE  anulado = FALSE AND fk_reserva = " + reserva.getId_reserva() + " ORDER BY fk_reserva,posicion;";
                
                break;    
            
            case 7:
                sql = "SELECT MAX(id_reserva)FROM tbl_reserva;";
                break;
            
            case 8:
                sql = "DELETE FROM tbl_reserva_det WHERE posicion = " + reserva.getPosicion() + " AND fk_reserva = " + reserva.getId_reserva();
                
                break;      
            case 9:
                sql = "UPDATE tbl_reserva_det SET posicion =  " + posicion_act + " WHERE fk_reserva = " + reserva.getId_reserva() + " AND posicion = " + reserva.getPosicion() +";";
                break;  
            
            /*case 10:
                sql = "SELECT id_reserva FROM tbl_reserva AND estatus = FALSE; ";
                break;*/
            case 11:
                sql = "SELECT DISTINCT fk_reserva FROM tbl_reserva_det WHERE aprobado_solicitado = TRUE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND anulado = FALSE";
                break;
                
            case 12:
                sql = "SELECT DISTINCT fk_reserva  FROM tbl_reserva_det WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND anulado = FALSE";
                break;
            
            case 13:
               // sql = "SELECT DISTINCT fk_reserva FROM tbl_reserva_det WHERE aprobado_solicitado = TRUE AND aprobado_gerente = TRUE AND conformado_almacen = FALSE AND anulado = FALSE";
                 sql = "SELECT DISTINCT fk_reserva FROM tbl_reserva_det WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND anulado = FALSE";
                
                break;
                
            case 14:
                sql = "SELECT posicion, numero_material,descripcionmat,cantidad_solicitada,unidad_medida,descripciongrupo, fecha_requerida, justificacion, autorizado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea FROM vw_reserva_detalle WHERE anulado = FALSE AND fk_area = " + reserva.getId_area() + " AND fk_reserva = " + reserva.getId_reserva()  + " ORDER BY fk_reserva,posicion;";
                break;    
             
            
                
             case 15:
                //sql = "SELECT DISTINCT fk_reserva,fk_usuario,nombres,descripcionarea,descripcionproyecto,descripcionempresa FROM vw_reserva_detalle WHERE  anulado = FALSE AND fk_area = " + reserva.getId_area() + " AND fk_reserva = " + reserva.getId_reserva() + " ORDER BY fk_reserva,posicion;";
                sql = "SELECT fk_reserva,fk_usuario,nombres,descripcionarea,COUNT(posicion) as posicion  ";
                sql += "FROM vw_reserva_detalle ";
                sql += "WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND anulado = FALSE AND fk_area = " + reserva.getId_area() + " AND fk_reserva = " + reserva.getId_reserva() + "  ";
                sql += "GROUP BY fk_reserva,fk_usuario,nombres,descripcionarea ";
                sql += "ORDER BY fk_reserva,posicion;";
       
                 break;     
                
             case 16:
                //sql = "SELECT DISTINCT fk_reserva,fk_usuario,nombres,descripcionarea,descripcionproyecto,descripcionempresa FROM vw_reserva_detalle WHERE anulado = FALSE AND fk_reserva = " + reserva.getId_reserva()  + " ORDER BY fk_reserva,posicion;";
                
                sql = "SELECT fk_reserva,fk_usuario,nombres,descripcionarea,COUNT(posicion) as posicion  ";
                sql += "FROM vw_reserva_detalle ";
                sql += "WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND anulado = FALSE AND fk_reserva = " + reserva.getId_reserva() + "  ";
                sql += "GROUP BY fk_reserva,fk_usuario,nombres,descripcionarea ";
                sql += "ORDER BY fk_reserva,posicion;";
                 
                break; 
                
             /*case 17:
                 sql = "UPDATE tbl_reserva_det SET conformado_almacen = TRUE,fecha_aprobado_almacen='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_almacen = " + reserva.getCedula() + ",aprobado_gerente = TRUE,fecha_aprobado_gerente='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_gerente = " + reserva.getCedula() + ",aprobado_solicitado = TRUE,fecha_aprobado_solicitado='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_jefe = " + reserva.getCedula() + " WHERE fk_reserva = " + reserva.getId_reserva() + " AND posicion = " + reserva.getPosicion() +";";
                break; */
             
             case 18:
                 sql = "UPDATE tbl_reserva_det SET cantidad_autorizada = " + reserva.getCantidad_autorizada() + ", aprobado_gerente = TRUE,fecha_aprobado_gerente='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_gerente = " + reserva.getCedula() + ",justificacion= '" + reserva.getJustificacion() + "' WHERE fk_reserva = " + reserva.getId_reserva() + " AND posicion = " + reserva.getPosicion() +";";
                break;    
            
            case 19:
                 sql = "UPDATE tbl_reserva_det SET cantidad_conformada = " + reserva.getCantidad_aprobada() + ",conformado_almacen = TRUE,fecha_aprobado_almacen='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_almacen = " + reserva.getCedula() + ",cantidad_autorizada = " + reserva.getCantidad_aprobada() + ", aprobado_gerente = TRUE,fecha_aprobado_gerente='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_gerente = " + reserva.getCedula() + ",cantidad_aprobada = " + reserva.getCantidad_aprobada() + ",aprobado_solicitado = TRUE,fecha_aprobado_solicitado='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_jefe = " + reserva.getCedula() + ",justificacion= '" + reserva.getJustificacion() + "' WHERE fk_reserva = " + reserva.getId_reserva() + " AND posicion = " + reserva.getPosicion() +";";
                break; 
                
            case 20:
                 sql = "UPDATE tbl_reserva_det SET cantidad_conformada = " + reserva.getCantidad_conformada() + ",conformado_almacen = TRUE,fecha_aprobado_almacen='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_almacen = " + reserva.getCedula() + ",justificacion= '" + reserva.getJustificacion() + "' WHERE fk_reserva = " + reserva.getId_reserva() + " AND posicion = " + reserva.getPosicion() +";";
                break;        
                
            /*case 21:
                sql = "SELECT fk_reserva,posicion FROM tbl_reserva_det WHERE fk_reserva = " + reserva.getId_reserva() + " AND anulado = FALSE;";
                break;*/
            case 22:
                sql = "SELECT DISTINCT fk_reserva,posicion FROM tbl_reserva_det WHERE aprobado_solicitado = TRUE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND fk_reserva = " + reserva.getId_reserva() + " AND anulado = FALSE ORDER BY posicion;";
                break;
                
            case 23:
                sql = "SELECT DISTINCT fk_reserva,posicion  FROM tbl_reserva_det WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND fk_reserva = " + reserva.getId_reserva() + " AND anulado = FALSE ORDER BY posicion;";
                break;
            
            case 24:
                //sql = "SELECT DISTINCT fk_reserva,posicion FROM tbl_reserva_det WHERE aprobado_solicitado = TRUE AND aprobado_gerente = TRUE AND conformado_almacen = FALSE AND fk_reserva = " + reserva.getId_reserva() + " AND anulado = FALSE ORDER BY posicion;";
                sql = "SELECT DISTINCT fk_reserva,posicion FROM tbl_reserva_det WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND fk_reserva = " + reserva.getId_reserva() + " AND anulado = FALSE ORDER BY posicion;";
                
                break;          
            case 25:
                sql = "SELECT posicion, numero_material,descripcionmat,cantidad_solicitada,cantidad_aprobada,cantidad_autorizada,unidad_medida,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_reserva_detalle WHERE anulado = FALSE AND fk_reserva = " + reserva.getId_reserva()  + " AND posicion = " + reserva.getPosicion() + " ORDER BY fk_reserva,posicion;";
                
                break;       
            case 26:
                sql = "SELECT posicion, numero_material,descripcionmat,cantidad_solicitada,cantidad_aprobada,cantidad_autorizada,unidad_medida,descripciongrupo, fecha_requerida, justificacion, autorizado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_reserva_detalle WHERE  anulado = FALSE AND fk_area = " + reserva.getId_area() + " AND fk_reserva = " + reserva.getId_reserva() + " AND posicion = " + reserva.getPosicion() + " ORDER BY fk_reserva,posicion;";
                break; 
                
            case 27:
                sql = "UPDATE tbl_reserva_det SET observaciones = '" + reserva.getObservaciones() + "',justificacion = '" + reserva.getJustificacion() +  "',anulado=TRUE WHERE fk_reserva = " + reserva.getId_reserva() + " AND posicion = " + reserva.getPosicion() +";";
                break;      
            
            case 28:
                sql = "SELECT DISTINCT fk_reserva,fk_usuario,nombres,descripcionarea,descripcionproyecto,descripcionempresa FROM vw_reserva_detalle WHERE  anulado = FALSE ORDER BY fk_reserva,posicion;";
                break;     
                
            case 29:
                sql = "SELECT DISTINCT fk_reserva,fk_usuario,nombres,descripcionarea,descripcionproyecto,descripcionempresa FROM vw_reserva_detalle WHERE  fk_area = " + reserva.getId_area() + " AND anulado = FALSE ORDER BY fk_reserva,posicion;";
                               
                break;     
            
           case 30:
                sql = "SELECT fk_reserva,posicion, numero_material,descripcionmat,cantidad_conformada,unidad_medida,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,fk_proyecto FROM vw_reserva_detalle WHERE anulado = FALSE AND conformado_almacen = TRUE AND fk_reserva LIKE '%" + reserva.getId_reserva() + "' ORDER BY fk_reserva,posicion;";
                
                break;        
                
           case 31:
                sql = "SELECT fk_reserva,posicion, numero_material,descripcionmat,cantidad_conformada,unidad_medida,descripciongrupo, fecha_requerida,descripcionempresa,fk_usuario,nombres,descripcionproyecto,fk_proyecto ";
                sql += "FROM vw_reserva_detalle ";
                //sql += "WHERE aprobado_solicitado = TRUE AND aprobado_gerente = TRUE AND conformado_almacen = TRUE AND anulado = FALSE; ";
                sql += "WHERE aprobado_solicitado = TRUE AND anulado = FALSE; ";
                
                break;  
            
            case 32:
                sql = "SELECT fk_reserva,posicion, numero_material,descripcionmat,cantidad_solicitada,unidad_medida,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea FROM vw_reserva_detalle WHERE anulado = FALSE AND conformado_almacen = TRUE AND fk_reserva = " + reserva.getId_reserva() + " ORDER BY fk_reserva,posicion;";
                
                break;   
                
            case 33:
                sql = "SELECT posicion, numero_material,descripcionmat,cantidad_solicitada,unidad_medida,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_reserva_detalle WHERE anulado = FALSE AND fk_reserva = " + reserva.getId_reserva()  + " ORDER BY fk_reserva,posicion;";
                
                break;       
            case 34:
                sql = "SELECT posicion, numero_material,descripcionmat,cantidad_solicitada,unidad_medida,descripciongrupo, fecha_requerida, justificacion, autorizado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_reserva_detalle WHERE anulado = FALSE AND fk_area = " + reserva.getId_area() + " AND fk_reserva = " + reserva.getId_reserva() + " ORDER BY fk_reserva,posicion;";
                break;  
                
            case 40:
                sql = "SELECT fk_area,fk_proyecto,fk_reserva,numero_material,descripcionmat,posicion,cantidad_solicitada,unidad_medida,descripcionproyecto,descripcionempresa,fecha_reserva, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada ";
                sql += "FROM vw_reserva_detalle ";
                sql += this.anulado + ";";
                break;
            
            case 41:
                sql = "SELECT fk_area,fk_proyecto,fk_reserva,numero_material,descripcionmat,posicion,cantidad_solicitada,unidad_medida,descripcionproyecto,descripcionempresa,fecha_reserva, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada ";
                sql += "FROM vw_reserva_detalle ";
                sql +=  this.anulado + " and fk_reserva LIKE '%" + reserva.getId_reserva() + "%';";
                break;
            
            case 42:
                sql = "SELECT fk_area,fk_proyecto,fk_reserva,numero_material,descripcionmat,posicion,cantidad_solicitada,unidad_medida,descripcionproyecto,descripcionempresa,fecha_reserva, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada ";
                sql += "FROM vw_reserva_detalle ";
                sql += this.anulado + " and descripcionmat LIKE '%" + reserva.getDescripcion_material() + "%';";
                break;
            
           case 43:
                sql = "SELECT fk_area,fk_proyecto,fk_reserva,numero_material,descripcionmat,posicion,cantidad_solicitada,unidad_medida,descripcionproyecto,descripcionempresa,fecha_reserva, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada ";
                sql += "FROM vw_reserva_detalle ";
                sql += this.anulado + " and fk_proyecto = " + reserva.getId_proyecto() + ";";
                break;
            
           /*case 44:
                sql = "SELECT fk_area,fk_proyecto,fk_reserva,numero_material,descripcionmat,posicion,cantidad_solicitada,unidad_medida,descripcionproyecto,descripcionempresa,fecha_reserva, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada ";
                sql += "FROM vw_reserva_detalle ";
                sql += "WHERE anulado = FALSE and fk_tiposolicitud = " + solicitud.getId_tiposolicitud() + ";";
                break;  */   

           case 45:
                sql = "SELECT fk_area,fk_proyecto,fk_reserva,numero_material,descripcionmat,posicion,cantidad_solicitada,unidad_medida,descripcionproyecto,descripcionempresa,fecha_reserva, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada ";
                sql += "FROM vw_reserva_detalle ";
                sql += this.anulado +" and fecha_reserva BETWEEN '" + this.fechadesde + "' AND '" + this.fechahasta + "';";
                break;  
                
           case 46:
                sql = "UPDATE tbl_reserva_det SET fk_proyecto = " + reserva.getId_proyecto() + ",fk_empresa = " + reserva.getId_empresa() + " WHERE fk_reserva = " + reserva.getId_reserva() + " AND posicion = " + reserva.getPosicion() +";";
                break;       
           
           case 47:
                sql = "UPDATE tbl_reserva_det SET observaciones = '" + reserva.getObservaciones() + "',anulado = TRUE WHERE fk_reserva = " + reserva.getId_reserva() + " AND posicion = " + reserva.getPosicion() +";";
                break;      
           
           case 48:
                sql = "UPDATE tbl_reserva_det SET aprobado_solicitado = FALSE,justificacion = '" + reserva.getJustificacion() +  "' WHERE fk_reserva = " + reserva.getId_reserva() + " AND posicion = " + reserva.getPosicion() +";";
                break; 
           
           case 49:
                sql = "UPDATE tbl_reserva_det SET cantidad_aprobada = 0, cantidad_autorizada = 0, cantidad_conformada = 0,conformado_almacen = FALSE,aprobado_solicitado = FALSE,aprobado_gerente = FALSE,observaciones = '" + reserva.getObservaciones() +  "' WHERE fk_reserva = " + reserva.getId_reserva() + " AND posicion = " + reserva.getPosicion() +";";
                break; 
                
           case 50:
                sql = "SELECT posicion, numero_material,descripcionmat,cantidad_solicitada,cantidad_aprobada,unidad_medida,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_reserva_detalle WHERE anulado = FALSE AND fk_reserva = " + reserva.getId_reserva()  + " AND posicion = " + reserva.getPosicion() + " ORDER BY fk_reserva,posicion;";
                
                break;       
           case 51:
                sql = "SELECT posicion, numero_material,descripcionmat,cantidad_solicitada,cantidad_aprobada,unidad_medida,descripciongrupo, fecha_requerida, justificacion, autorizado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_reserva_detalle WHERE  anulado = FALSE AND fk_area = " + reserva.getId_area() + " AND fk_reserva = " + reserva.getId_reserva() + " AND posicion = " + reserva.getPosicion() + " ORDER BY fk_reserva,posicion;";
                break; 
                
           case 52:
                sql = "SELECT fk_area,fk_proyecto,fk_reserva,numero_material,descripcionmat,posicion,cantidad_solicitada,unidad_medida,descripcionproyecto,descripcionempresa,fecha_reserva, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada ";
                sql += "FROM vw_reserva_detalle ";
                sql += this.cadena;
                break;  
            case 53:
                sql = "SELECT fk_area,fk_proyecto,fk_reserva,numero_material,descripcionmat,posicion,cantidad_solicitada,unidad_medida,descripcionproyecto,descripcionempresa,fecha_reserva, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada,observaciones ";
                sql += "FROM vw_reserva_detalle ";
                sql += this.cadena;
                sql += " ORDER BY fk_reserva,posicion ASC;";
                break; 
            case 54:
                sql = "SELECT b.correo,a.fk_usuario ";
                sql += "FROM tbl_reserva_det a "; 
                sql += "INNER JOIN tbl_usuario b ON ";
                sql += "a.fk_usuario = b.id_usuario ";
                sql += "WHERE fk_reserva = " + reserva.getId_reserva() + ";";
                break;    
                
       
        }
       
         System.out.println(sql);
    }
    
}
