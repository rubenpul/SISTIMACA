/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.class_material;

import model.class_solicitud;
import model.class_usuario;
import view.frm_progress;
import view.funciones;

/**
 *
 * @author ruben
 */
public class ctrl_solicitud {
    
    class_solicitud solicitud;
    ctrl_usuario responsable;
    private Integer posicion_act;
    private String sql;
    String fechadesde;
    String fechahasta;
    String cadena;
    String fecha;
    String anulado;
    String filtroconsulta;
    String consulta2;
    
    public ctrl_solicitud(Integer id_solicitud, Integer cedula, Integer id_area, String descripcion_area, Integer id_tiposolicitud, String descripcion_tiposolicitud, Integer id_material, Integer numero_material,String descripcion_material, Integer id_empresa, String descripcion_empresa, Integer id_proyecto, String descripcion_proyecto, Integer posicion, Integer cantidad_solicitada,Integer cantidad_aprobada,Integer cantidad_autorizada,Integer cantidad_cotizada, String fecha_solicitud, String fecha_requerida, String justificacion, boolean autorizado, String aprobado_solicitado, String fecha_aprobado_solicitado, String conformado_almacen, String fecha_conformado_almacen, String compras_recibido, String fecha_compras_recibido, String autorizado_gerente, String fecha_autorizado_gerente, String observaciones) {
        solicitud = new class_solicitud(id_solicitud,cedula,id_area,descripcion_area,id_tiposolicitud,descripcion_tiposolicitud,id_material,numero_material,descripcion_material,id_empresa,descripcion_empresa,id_proyecto,descripcion_proyecto,posicion,cantidad_solicitada,cantidad_aprobada,cantidad_autorizada,cantidad_cotizada,fecha_solicitud,fecha_requerida,justificacion,autorizado,aprobado_solicitado,fecha_aprobado_solicitado,conformado_almacen,fecha_conformado_almacen,compras_recibido,fecha_compras_recibido,autorizado_gerente,fecha_autorizado_gerente,observaciones);
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
        String[] aux;
        i=0;
        if (solicitud.getNumero_material().equals(-1)){
            if(solicitud.getDescripcion_material().contains("*")){
               aux = solicitud.getDescripcion_material().split("\\*");
               while (i < aux.length){
                    if (i.equals(0)){
                        consulta2 = "descripcionmaterial LIKE '%" + aux[i]  + "%' ";
                    }
                    else{
                        consulta2 += "AND descripcionmaterial LIKE '%" + aux[i]  + "%' ";
                    }
                    i++;    
               }
               consulta2 += ";";
            }
            else{
                consulta2 = "descripcionmaterial LIKE '%" + solicitud.getDescripcion_material().trim()  + "%';";
            }
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
                        cnn.rs.getString(2),
                        cnn.rs.getString(3),
                        cnn.rs.getString(4),
                        cnn.rs.getString(5)
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
                solicitud.setId_material(cnn.rs.getInt(1));
            }
            cnn.cerrar();
            //return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN BÚSQUEDA DE CODIGO DE MATERIAL");
            cnn.cerrar();
           
        }
        
    }
  
    
    
    public class_solicitud crear_posicion(JTable tabla) throws SQLException{
        conexion cnn;
        
        buscar_id_material();
        
        if (solicitud.getId_solicitud().equals(0)){
            buscar_sql(7);
            cnn = new conexion(sql,"buscar");
            
            if (cnn.estado){
            
                try{
                    if(cnn.rs.next()){
                        solicitud.setId_solicitud(cnn.rs.getInt(1)+1);
                    }
                    
                    if (solicitud.getId_solicitud().equals(1)){
                        solicitud.setId_solicitud(100000000);
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
            solicitud.setPosicion(1);
            
            buscar_sql(4);
            cnn = new conexion(sql,"");
            cnn.cerrar();
            
            
        }
        else{
            solicitud.setPosicion(solicitud.getPosicion()+1);
            buscar_sql(4);
            cnn = new conexion(sql,"");
            cnn.cerrar();
        }    
                
        consultar_solicitud_detalle(tabla);
        
    
        return solicitud;
        
    }
    
    public class_solicitud borrar_posicion(JTable tabla,Integer pos){
        Integer i;
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        solicitud.setPosicion(Integer.parseInt(modelotabla.getValueAt(pos,0).toString()));
        
        modelotabla.removeRow(pos);
        tabla.revalidate();
        
        buscar_sql(8);
        conexion cnn = new conexion(sql,"");
        cnn.cerrar();
        solicitud.setStatus(true);
        
       
        for(i = 0; i <= modelotabla.getRowCount()-1 ;i++){
           modelotabla.setValueAt(i+1, i,0);
        } 
        
        buscar_sql(6);
        
        cnn = new conexion(sql,"buscar");
        
            
            if (cnn.estado){
            
                try{
                    
                    while(cnn.rs.next()){
                        solicitud.setPosicion(cnn.rs.getInt(1));
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
        
        
        
        return solicitud;
    }
  
    
    
    public void consultar_solicitud_detalle(JTable tabla){
        
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
                        cnn.rs.getString(11),//descripcionproyecto
                        cnn.rs.getString(8), //justificacion
                        cnn.rs.getString(10), //descripcionempresa
                        cnn.rs.getString(11), //
                        cnn.rs.getString(12) //descripciontipo
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
    
    public void consultar_solicitud_por_aprobar(Integer perfil,JTable tabla){
        
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
                    
                    solicitud.setId_solicitud(cnn.rs.getInt(1));
                    
                    
                    
                    buscar_sql(39);
                   
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                      if(!cnn2.rs.getString(5).equals("0")){
                        
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //RESERVA
                            cnn2.rs.getInt(2),   //cedula
                            cnn2.rs.getString(3),   //nombres
                            cnn2.rs.getString(4),//area
                            cnn2.rs.getString(5)   //proyecto
                            
                           
                        });
                      }  
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
    
     public String consultar_foto(){
        ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,solicitud.getNumero_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
        modelo_material = material.consultar_fotomaterial();
        
        return modelo_material.getFoto_material();
        
    }
    
    public void consultar_solicitud_detalle_cotizar(Integer perfil,JTable tabla){
        
               
        int inicio = 0;
        int fin = 0;
        int i = 0;
        String aprobado;
        String autorizado;
        
        if (!solicitud.getId_solicitud().equals(0)){
            this.cadena = " WHERE 1=1 AND fk_solicitud LIKE '%" + solicitud.getId_solicitud() + "%' AND ";
        }
        else{
            this.cadena = " WHERE 1=1 AND ";
        }
        JLabel label_verde = new JLabel();
        JLabel label_amarillo = new JLabel();
        JLabel label_rojo = new JLabel();

        label_verde.setIcon(new ImageIcon("\\\\192.168.0.3\\dist\\imagenes\\Green_Ball.png"));
        label_amarillo.setIcon(new ImageIcon("\\\\192.168.0.3\\dist\\imagenes\\Yellow_Ball.png"));
        label_rojo.setIcon(new ImageIcon("\\\\192.168.0.3\\dist\\imagenes\\Red_Ball.png"));

        //label_verde.setIcon(new ImageIcon("C:\\Users\\ruben\\Desktop\\Green_Ball.png"));
        //label_amarillo.setIcon(new ImageIcon("C:\\Users\\ruben\\Desktop\\Yellow_Ball.png"));
        //label_rojo.setIcon(new ImageIcon("C:\\Users\\ruben\\Desktop\\Red_Ball.png"));
       
        
        
        Object[] rows = new Object[3];
        
        rows[0] = label_verde;
        rows[1] = label_amarillo;
        rows[2] = label_rojo;
         
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
      
        buscar_sql(38);

        conexion cnn2 = new conexion(sql,"buscar");
        try {
            while (cnn2.rs.next()){
            
                inicio = cnn2.rs.getString(12).indexOf("(");
                fin = cnn2.rs.getString(12).indexOf(")", inicio + 1);
                
                solicitud.setId_solicitud(cnn2.rs.getInt(1));
                solicitud.setPosicion(cnn2.rs.getInt(2));
                
                               
                buscar_sql(62);
                
                conexion cnn3 = new conexion(sql,"buscar");
                i=2;
                aprobado = "NO";
                autorizado = "NO";
                while (cnn3.rs.next()){
                    if (/*cnn3.rs.getBoolean(2) &&*/ cnn3.rs.getBoolean(3)){
                        i=0;
                        aprobado = "SI";
                        autorizado = "SI";
                        cnn3.rs.afterLast();
                    } 
                    else{
                        i=1;              
                        /*if(cnn3.rs.getBoolean(2)){
                             aprobado = "SI";
                        }
                        else{
                            aprobado = "NO";
                        }
                        
                        if(cnn3.rs.getBoolean(3)){
                             autorizado = "SI";
                        }
                        else{
                            autorizado = "NO";
                        }*/
                        aprobado = "NO";
                        autorizado = "NO";
                    }   
                }
                cnn3.cerrar();
                                               
                modelotabla.addRow(new Object[]{
                    rows[i],
                    cnn2.rs.getInt(1),  //nro solicitud
                    cnn2.rs.getInt(2),   //posicion
                    cnn2.rs.getInt(3),   //nromaterial
                    cnn2.rs.getString(4),//materialsolicituado
                    cnn2.rs.getString(5),//solicitante
                    cnn2.rs.getString(6),//area
                    cnn2.rs.getInt(7),  //cant autorizada
                    cnn2.rs.getString(8),//umb
                    cnn2.rs.getString(9),//grupoarticulo
                    funciones.fecha_bd_usuario(cnn2.rs.getDate(10).toString(),1),//fecharequerida
                    cnn2.rs.getString(11), //proyecto\
                    cnn2.rs.getString(12).substring(inicio + 1, fin), //tiposolicitud
                    cnn2.rs.getString(13), //justificacion
                    aprobado, //aprobado
                    autorizado  //autorizado
                });
                // }    
        }
        cnn2.cerrar();
                
      } 
      catch (SQLException ex) {
           cnn2.cerrar();
      }

       
       
        
    } 
    
    public void consultar_solicitud_detalle(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
     
            buscar_sql(29);
            
        /*switch (perfil){
            
            case 0: 
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
                    
                    solicitud.setId_solicitud(cnn.rs.getInt(1));
                    //solicitud.setPosicion(cnn.rs.getInt(2));
                                       
                    
                    buscar_sql(25);
                    
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                        //if(!cnn2.rs.getString(5).equals("0")){
                            modelotabla.addRow(new Object[]{
                                false,
                                cnn2.rs.getInt(1),   //posicion
                                cnn2.rs.getInt(2),   //nromaterial
                                cnn2.rs.getString(3),//materialsolicituado
                                cnn2.rs.getInt(4),   //cantidad solicitada
                                cnn2.rs.getInt(4),   //cantidad aprobada  
                                cnn2.rs.getString(6),//umb
                                cnn2.rs.getString(7),//grupoarticulo
                                cnn2.rs.getString(8),//fecharequerida
                                cnn2.rs.getString(9),//justificacion
                                cnn2.rs.getString(10), //observacion
                                cnn2.rs.getString(11), //empresa
                                cnn2.rs.getString(12), //proyecto
                                cnn2.rs.getString(13), //cedula
                                cnn2.rs.getString(14), //usuario
                                cnn2.rs.getString(15), //usuario
                                cnn2.rs.getString(16), //tipo de solicitud


                            });
                        //}    
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
 
    public Boolean solicitud_posicion_anular(Integer nivel){
        conexion cnn;
        
        if (nivel.equals(0) || nivel.equals(1) || nivel.equals(2)){
        
            buscar_sql(27);
               
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return true;
        }
     
        return false;
       
    }
     
     public Boolean aprobar_solicitud_posicion(Integer nivel){
        conexion cnn;
        
        /*ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,solicitud.getNumero_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
        modelo_material = material.consultar_disponibilidad_reserva_material_maestro();*/
        
        //if (!nivel.equals(4) && !nivel.equals(5)){
        
            //if ( modelo_material.getStock_disponible() >= solicitud.getCantidad_aprobada()){
                
            
                buscar_sql(31);
            
                           
                cnn = new conexion(sql,"");
                cnn.cerrar();
                return true;
        
        //}
            /*    else{
                    JOptionPane.showMessageDialog(null, "LA CANTIDAD DE MATERIAL SOLICITADA SUPERA A LO QUE DISPONE EL INVENTARIO");
                    return false;
                }*/
        //}
     
       // return false;
       
    }
    
    public void consultar_solicitud_por_autorizar(Integer perfil,JTable tabla){
        
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
                    
                    solicitud.setId_solicitud(cnn.rs.getInt(1));
                    
                    
                    if (solicitud.getId_area().equals(0)){
                        buscar_sql(16);
                    }
                    else{
                        buscar_sql(15);
                    }
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                      if(!cnn2.rs.getString(5).equals("0")){
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //SOLICITUD
                            cnn2.rs.getInt(2),   //cedula
                            cnn2.rs.getString(3),   //nombres
                            cnn2.rs.getString(4),//area
                            cnn2.rs.getInt(5)   //proyecto
                            
                        });
                      }
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
    
    public void consultar_solicitud_detalle_autorizada(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
       
            buscar_sql(22);
      
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    
                    solicitud.setId_solicitud(cnn.rs.getInt(1));
                    //solicitud.setPosicion(cnn.rs.getInt(2));
                                       
                    
                    buscar_sql(35);
                    
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                            modelotabla.addRow(new Object[]{
                                false,
                                cnn2.rs.getInt(1),   //posicion
                                cnn2.rs.getInt(2),   //nromaterial
                                cnn2.rs.getString(3),//materialsolicituado
                                cnn2.rs.getInt(4),   //cantidad
                                cnn2.rs.getInt(4),   //cantidad
                                cnn2.rs.getString(6),//umb
                                cnn2.rs.getString(7),//grupoarticulo
                                cnn2.rs.getString(8),//fecharequerida
                                cnn2.rs.getString(9),//justificacion
                                cnn2.rs.getString(10), //observacion
                                cnn2.rs.getString(11), //empresa
                                cnn2.rs.getString(12), //proyecto
                                cnn2.rs.getString(13), //cedula
                                cnn2.rs.getString(14), //usuario
                                cnn2.rs.getString(15), //usuario
                                cnn2.rs.getString(17), //tipo de solicitud
                                cnn2.rs.getInt(16) //tipo de solicitud


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
    
    public Boolean autorizar_solicitud_posicion(Integer nivel){
        conexion cnn;
        
       /* ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,solicitud.getNumero_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
        modelo_material = material.consultar_disponibilidad_reserva_material_maestro();*/
        
        
        
        //if (nivel.equals(0) || nivel.equals(1) || nivel.equals(2)){
        
            //if ( modelo_material.getStock_disponible() >= solicitud.getCantidad_solicitada()){
         if (!solicitud.getId_tiposolicitud().equals(1)){
             buscar_sql(59);
         }
         else{
             buscar_sql(30);
         }
            
                
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return true;
            /*}
            else{
                JOptionPane.showMessageDialog(null, "LA CANTIDAD DE MATERIAL SOLICITADA SUPERA A LO QUE DISPONE EL INVENTARIO");
                return false;
            }*/
        //}
     
       // return false;
       
    }
    
    
    public void consultar_solicitud_autorizada(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
          
            buscar_sql(34);
            
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
                    
                    //if(cnn.rs.getInt(1) != cnn.rs.getInt(2)){ //VALIDA QUE NO ESTE COTIZADA LA SOLICITUD
                    
                        solicitud.setId_solicitud(cnn.rs.getInt(1));
                    
                        buscar_sql(36);
                    
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
                    //}   
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
    public void consultar_solicitudes_activa(JTable tabla,Integer tipo,String fechadesde,String fechahasta,Integer opcion,Integer nivel){
        
        int inicio = 0;
        int fin = 0;
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
        switch (opcion){
            
            case 0 :  this.cadena = "WHERE 1=1 AND anulado = FALSE AND aprobado_solicitado = FALSE ";
                       break;
            case 1 :  this.cadena = "WHERE 1=1 AND anulado = FALSE AND conformado_almacen = TRUE ";
                       break;   
            case 2 :  this.cadena = "WHERE 1=1 AND anulado = FALSE AND aprobado_solicitado = TRUE ";
                       break; 
            case 3 :  this.cadena = "WHERE 1=1 AND anulado = FALSE AND aprobado_gerente = TRUE ";
                       break;          
            case 4 :  this.cadena = "WHERE 1=1 AND anulado = TRUE ";
                       break;              
        }
 
         
        switch (nivel){
            case 4: this.anulado += " AND fk_area = " + solicitud.getId_area() + " ";
                     break;
            case 9: this.anulado += " AND fk_usuario = " + solicitud.getCedula() + " AND fk_area = " + solicitud.getId_area() + " ";
                     break;
            case 10: this.anulado += " AND fk_usuario = " + solicitud.getCedula() + " ";
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
            case 4: buscar_sql(44);
                    break;   
            case 5: this.fechadesde = fechadesde;
                    this.fechahasta = fechahasta;
                    buscar_sql(45);
                    break;           
        }
        
                    
        conexion cnn = new conexion(sql,"buscar");
        
            if (cnn.estado){
            
                try{       
                    while (cnn.rs.next()){
                        
                        inicio = cnn.rs.getString(12).indexOf("(");
                        fin = cnn.rs.getString(12).indexOf(")", inicio + 1);
                       
                        modelotabla.addRow(new Object[]{
                            cnn.rs.getInt(1),   //idarea
                            cnn.rs.getInt(2),   //idproyecto
                            cnn.rs.getInt(3),//idtiposolictud
                            false,
                            cnn.rs.getInt(4),   //nro solicitud
                            cnn.rs.getInt(7),//posiciom
                            cnn.rs.getInt(5),   //numero material  
                            cnn.rs.getString(6),//descripcion material
                            cnn.rs.getString(23), // fecha requerida
                            cnn.rs.getString(24), // descripciongrupo
                            cnn.rs.getInt(8),//cantidad solicitada
                            cnn.rs.getString(9),//codigo umb
                            cnn.rs.getString(10), //proyecto
                            cnn.rs.getString(11), //empresa
                            cnn.rs.getString(12).substring(inicio + 1, fin), //tiposolicitud
                            funciones.fecha_bd_usuario(cnn.rs.getDate(13).toString(),1),//fecha solicitud
                            cnn.rs.getBoolean(14), //aprobacion solicitid
                            cnn.rs.getString(15), //fecha aprobaciom
                            cnn.rs.getInt(16), //cantidad aprobada
                            cnn.rs.getBoolean(17), //autorizado solicitud
                            cnn.rs.getString(18), //fecha autorizado
                            cnn.rs.getInt(19), //cantidad autorizada
                            cnn.rs.getBoolean(20), //conformacion solicitud
                            cnn.rs.getString(21), //fecha conformacion
                            cnn.rs.getInt(22) // cantidad conformada
                           
                        
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
      
    
    public Boolean actualizar_solicitud_posicion(){
        conexion cnn;
        
       
        
            buscar_sql(46);
            
            
                
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return true;
            
       
    }
    
    public Boolean anular_solicitud_posicion(){
        conexion cnn;
        
       
            buscar_sql(47);
            
            
                
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return true;
            
       
    }
    
    public Boolean reversar_solicitud_posicion(Integer opcion){
        conexion cnn;
        
        switch (opcion){
            
            case 1: buscar_sql(48);
                    break; 
            case 2: buscar_sql(56);
                    break;         
        }
            
            
            
                
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return true;
            
       
    }
    
    public void consultar_solicitudes_fase(JTable tabla,Integer consulta,String fechadesde,String fechahasta,Integer nivel){
        
        int inicio = 0;
        int fin = 0;
        String[] aux;
        int i = 0;
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
        this.cadena = "";
        
        switch (consulta){
            
            case 0 :  this.cadena = "WHERE 1=1 AND anulado = FALSE AND aprobado_solicitado = FALSE  AND conformado_almacen = FALSE ";
                       break;
            case 1 :  this.cadena = "WHERE 1=1 AND anulado = FALSE AND conformado_almacen = TRUE ";
                       break;   
            case 2 :  this.cadena = "WHERE 1=1 AND anulado = FALSE AND aprobado_solicitado = TRUE ";
                       break; 
            case 3 :  this.cadena = "WHERE 1=1 AND anulado = FALSE AND aprobado_gerente = TRUE ";
                       break;          
            case 4 :  this.cadena = "WHERE 1=1 AND anulado = TRUE ";
                       break;  
            case 5 :  this.cadena = "WHERE 1=1 AND anulado = FALSE ";
                       break;             
        }
        
        if (!fechadesde.equals("") && !fechahasta.equals("")){
            this.cadena += "AND fecha_solicitud BETWEEN '" + fechadesde + "' AND '" + fechahasta + "' ";
        }

        if (!solicitud.getId_proyecto().equals(0)){
            this.cadena += "AND fk_proyecto = " + solicitud.getId_proyecto() + " ";
        }

        if (!solicitud.getId_tiposolicitud().equals(0)){
            this.cadena += "AND fk_tiposolicitud = " + solicitud.getId_tiposolicitud() + " ";
        }

        if (!solicitud.getId_solicitud().equals(0)){
            this.cadena += "AND fk_solicitud LIKE '%" + solicitud.getId_solicitud() + "%' ";
        }

        if (!solicitud.getDescripcion_material().equals("")){
            if(solicitud.getDescripcion_material().contains("*")){
               aux = solicitud.getDescripcion_material().split("\\*");
               while (i < aux.length){
                    this.cadena += "AND descripcionmat LIKE '%" + aux[i]  + "%' ";
                    i++;    
               }
              
            }
            else{
                this.cadena += "AND descripcionmat LIKE '%" + solicitud.getDescripcion_material().trim()  + "%' ";
            }
        }
        
        
        switch (nivel){
            case 4: this.cadena += " AND fk_area = " + solicitud.getId_area() + " ";
                     break;
            case 9: this.cadena += " AND fk_usuario = " + solicitud.getCedula() + " AND fk_area = " + solicitud.getId_area() + " ";
                     break;
            case 10: this.cadena += " AND fk_usuario = " + solicitud.getCedula() + " ";
                     break;         
        } 
        
        
        buscar_sql(49);
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){

            try{       
                while (cnn.rs.next()){
                        inicio = cnn.rs.getString(12).indexOf("(");
                        fin = cnn.rs.getString(12).indexOf(")", inicio + 1);
                       
                        modelotabla.addRow(new Object[]{
                            cnn.rs.getInt(1),   //idarea
                            cnn.rs.getInt(2),   //idproyecto
                            cnn.rs.getInt(3),//idtiposolictud
                            false,
                            cnn.rs.getInt(4),   //nro solicitud
                            cnn.rs.getInt(7),//posiciom
                            cnn.rs.getInt(5),   //numero material  
                            cnn.rs.getString(6),//descripcion material
                            cnn.rs.getString(9),//codigo umb
                            funciones.fecha_bd_usuario(cnn.rs.getDate(23).toString(),1), // fecha requerida
                            cnn.rs.getString(24), // descripciongrupo
                            cnn.rs.getInt(8),//cantidad solicitada
                            cnn.rs.getString(10), //proyecto
                            cnn.rs.getString(11), //empresa
                            cnn.rs.getString(12).substring(inicio + 1, fin), //tiposolicitud
                            funciones.fecha_bd_usuario(cnn.rs.getDate(13).toString(),1),//fecha solicitud
                            cnn.rs.getBoolean(14), //aprobacion solicitid
                            cnn.rs.getString(15), //fecha aprobaciom
                            cnn.rs.getInt(16), //cantidad aprobada
                            cnn.rs.getBoolean(17), //autorizado solicitud
                            cnn.rs.getString(18), //fecha autorizado
                            cnn.rs.getInt(19), //cantidad autorizada
                            cnn.rs.getBoolean(20), //conformacion solicitud
                            cnn.rs.getString(21), //fecha conformacion
                            cnn.rs.getInt(22) // cantidad conformada

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

    
public void consultar_solicitud_por_conformar(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
      
        //switch (perfil){
            buscar_sql(50);
            
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
                    
                    solicitud.setId_solicitud(cnn.rs.getInt(1));
                    
                    
                    if (solicitud.getId_area().equals(0)){
                        buscar_sql(52);
                    }
                    else{
                        buscar_sql(51);
                    }
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    if (cnn2.rs.next()){
                      if(!cnn2.rs.getString(5).equals("0")){
                        modelotabla.addRow(new Object[]{
                            cnn2.rs.getInt(1),   //SOLICITUD
                            cnn2.rs.getInt(2),   //cedula
                            cnn2.rs.getString(3),   //nombres
                            cnn2.rs.getString(4),//area
                            cnn2.rs.getInt(5)   //proyecto
                            //cnn2.rs.getString(6),//empresa
                        });
                     }
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
    
    public void consultar_solicitud_detalle_porconformar(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
       
            buscar_sql(53);
      
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    
                    solicitud.setId_solicitud(cnn.rs.getInt(1));
                    //solicitud.setPosicion(cnn.rs.getInt(2));
                                       
                    
                    buscar_sql(54);
                    
                    conexion cnn2 = new conexion(sql,"buscar");
                    
                    while (cnn2.rs.next()){
                        modelotabla.addRow(new Object[]{
                            false,
                            cnn2.rs.getInt(1),   //posicion
                            cnn2.rs.getInt(2),   //nromaterial
                            cnn2.rs.getString(3),//materialsolicituado
                            cnn2.rs.getInt(4),   //cantidad
                            cnn2.rs.getInt(4),   //cantidad
                            cnn2.rs.getString(6),//umb
                            cnn2.rs.getString(7),//grupoarticulo
                            cnn2.rs.getString(8),//fecharequerida
                            cnn2.rs.getString(9),//justificacion
                            cnn2.rs.getString(10), //observacion
                            cnn2.rs.getString(11), //empresa
                            cnn2.rs.getString(12), //proyecto
                            cnn2.rs.getString(13), //cedula
                            cnn2.rs.getString(14), //usuario
                            cnn2.rs.getString(15), //usuario
                            cnn2.rs.getString(16), //tipo de solicitud
                            
                            
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

 public Boolean conformar_solicitud_posicion(Integer nivel){
        conexion cnn;
        
       /* ctrl_material material = null;
        class_material modelo_material = null;
        
        material = new ctrl_material(0,solicitud.getNumero_material(),"","","","","",0,"",0,0,0,0,0,0,0.0,0.0,"",0,"",0,0,"","",0,"",0,"", 0,"","",0,"",0,"", 0,"",true);
        
        modelo_material = material.consultar_disponibilidad_reserva_material_maestro();*/
        
        
        
     //   if (nivel.equals(0) || nivel.equals(1) || nivel.equals(2)){
        
            //if ( modelo_material.getStock_disponible() >= solicitud.getCantidad_solicitada()){
          
            buscar_sql(55);
            
            
                
            cnn = new conexion(sql,"");
            cnn.cerrar();
            return true;
            /*}
            else{
                JOptionPane.showMessageDialog(null, "LA CANTIDAD DE MATERIAL SOLICITADA SUPERA A LO QUE DISPONE EL INVENTARIO");
                return false;
            }*/
        //}
     
        
       
    }
    
    public void consultar_solicitud_conformada(Integer perfil,JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
       
          
            buscar_sql(57);
            
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
                    
                   // if(cnn.rs.getInt(1) != cnn.rs.getInt(2)){ //VALIDA QUE NO ESTE COTIZADA LA SOLICITUD
                    
                        solicitud.setId_solicitud(cnn.rs.getInt(1));
                    
                        buscar_sql(58);
                    
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
                    //}   
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
 
    public class_solicitud consultar_posicion_noaprob_noconform(JTable tabla){
        
        buscar_sql(61);
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                if(cnn.rs.next()){
                    solicitud.setPosicion(cnn.rs.getInt(1));
                }
            
                cnn.cerrar();
            } 
            catch (SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
            }    
        } 
        buscar_sql(60);

        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
      
         cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                   modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),   //posicion
                        cnn.rs.getInt(2),   //mromaterial
                        cnn.rs.getString(3),   //mat solicitado
                        cnn.rs.getInt(4),//cantidad
                        cnn.rs.getString(5),   //umb
                        cnn.rs.getString(6),//grupo art
                        cnn.rs.getString(6),//fecha req
                        cnn.rs.getString(7),//proyecto
                        cnn.rs.getString(8),//justificacion 
                        cnn.rs.getString(9)//observacion 
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
        
        
        return solicitud;
        
    }

    public Boolean consultar_solicitud_ordendecompra(JTable data){
        int inicio = 0;
        int fin = 0;
        
        this.filtroconsulta = "";
        DefaultTableModel modelotabla = (DefaultTableModel) data.getModel();

        modelotabla.setRowCount(0);
        
        this.filtroconsulta = "WHERE b.nro_ordencompra > 0 ";
        
        if (!solicitud.getId_empresa().equals(0)){
            this.filtroconsulta += " AND a.fk_empresa = " + solicitud.getId_empresa() + " ";
        }
        
        if (!solicitud.getId_tiposolicitud().equals(0)){
            this.filtroconsulta += " AND a.fk_tiposolicitud = " + solicitud.getId_tiposolicitud() + " ";
        }
 
        if (!solicitud.getId_proyecto().equals(0)){
            this.filtroconsulta += " AND a.fk_proyecto = " + solicitud.getId_proyecto() + " ";
        }
 
        if (!solicitud.getId_area().equals(0)){
            this.filtroconsulta += " AND a.fk_area = " + solicitud.getId_area() + " ";
        }
 
        
        buscar_sql(63);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                    inicio = cnn.rs.getString(3).indexOf("(");
                    fin = cnn.rs.getString(3).indexOf(")", inicio + 1);
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getString(1),
                        cnn.rs.getString(2),
                        cnn.rs.getString(3).substring(inicio + 1, fin),
                        cnn.rs.getString(4),
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        funciones.fecha_bd_usuario(cnn.rs.getDate(7).toString(),1),
                        funciones.fecha_bd_usuario(cnn.rs.getDate(8).toString(),1),
                        cnn.rs.getString(9),
                        cnn.rs.getString(10),
                        cnn.rs.getString(11),
                        cnn.rs.getString(12),
                        cnn.rs.getString(13),
                        cnn.rs.getString(14),
                        cnn.rs.getString(15),
                        cnn.rs.getString(16),
                        cnn.rs.getString(17),
                        cnn.rs.getString(18),
                        cnn.rs.getString(19),
                        cnn.rs.getString(20),
                        cnn.rs.getString(21),
                        funciones.fecha_bd_usuario(cnn.rs.getDate(22).toString(),1),
                        cnn.rs.getString(23),
                        cnn.rs.getString(24)
                        
                    });
                    
                    
                    solicitud.setStatus(true);
                    
                }
                
                cnn.cerrar();
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                solicitud.setStatus(false);
                
            }    
         }   
        else{
             cnn.cerrar();
             solicitud.setStatus(false);
             
        }
        
        return solicitud.isStatus();
    }    

    public String consultar_email_usuariosupervisor(Integer Nivel){
       Integer supervisor=0;
       Integer area;
       String email = "";
       Integer i = 0;
       area = solicitud.getId_area();
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
       
       sql = "SELECT correo ";
       sql += "FROM( "; 
       sql += "SELECT correo ";
       sql += "FROM tbl_usuario ";
       sql += "WHERE id_usuario = (SELECT fk_usuario FROM vw_perfil WHERE fk_perfil = " +  supervisor + " AND fk_area = " + area + " AND fk_usuario <> '13090757') ";
       sql += "UNION ";
       sql += "SELECT correo ";
       sql += "FROM tbl_usuario ";
       sql += "WHERE id_usuario = (SELECT fk_usuario FROM vw_perfil WHERE fk_perfil = 0 AND fk_usuario <> '13090757') ";
       sql += ") AS CONSULTA;";
       
       
       conexion cnn = new conexion(sql,"buscar");
       
       if (cnn.estado){
           
           try {
               if(cnn.rs.next()){
                   email += cnn.rs.getString(1);
               }
               if(cnn.rs.next()){
                   email += "," + cnn.rs.getString(1);
               }
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "ERROR EN ENVIAR CORREO AL SUPERVISOR " + ex.getMessage());
           }
           
           
       }
       cnn.cerrar();
       
       return email;
        
   }

 public void consultar_documento(JTable tabla,Integer documento){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
     
        modelotabla.setRowCount(0);
        
        sql = "SELECT fk_reserva,numero_material,descripcionmat,cantidad_solicitada,unidad_medida,descripcionproyecto,nombres ";
        sql += "FROM vw_reserva_detalle ";
        sql += "WHERE anulado = FALSE AND fk_reserva = " + documento + " ";
        sql += "UNION ";
        sql += "SELECT fk_solicitud,numero_material,descripcionmat,cantidad_solicitada,codigo_umb,descripcionproyecto,nombres ";
        sql += "FROM vw_solicitud_detalle ";
        sql += "WHERE anulado = FALSE AND fk_solicitud = " + documento;
        
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                   modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),   //documento
                        cnn.rs.getInt(2),   //mromaterial
                        cnn.rs.getString(3),   //descripcion
                        cnn.rs.getInt(4),//cantidad
                        cnn.rs.getString(5),   //umb
                        cnn.rs.getString(6),
                        cnn.rs.getString(7)//usuario
                       
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
    
 public String consultar_email_usuariosolicitud(){
       String email="";
       
       buscar_sql(64);
       
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

    public Boolean anular_documento(Integer documento,String motivo){
        conexion cnn;
        
       
        sql = "UPDATE tbl_solicitud_det SET observaciones = '" + motivo + "',anulado = TRUE WHERE fk_solicitud = " + documento + ";";
        cnn = new conexion(sql,"");
        cnn.cerrar();
        
        sql = "UPDATE tbl_reserva_det SET observaciones = '" + motivo + "',anulado = TRUE WHERE fk_reserva = " + documento + ";";
        cnn = new conexion(sql,"");
        cnn.cerrar();
       
        return true;
            
       
    }
 
    public void buscar_sql(Integer consulta) {
        
        
        switch (consulta){
            case 1:
                 sql = "SELECT numero_material,descripcionmaterial,codigo_umb,marca,modelo FROM vw_matclasegrupo WHERE numero_material LIKE '%" + Integer.parseInt(solicitud.getNumero_material().toString().trim()) + "%';";
                 
                 break;  
            case 2:
                 sql = "SELECT numero_material,descripcionmaterial,codigo_umb,marca,modelo FROM vw_matclasegrupo WHERE " + consulta2;
       
                break;    
                
            case 3:
                
                sql = "INSERT INTO tbl_solicitud VALUES(" + solicitud.getId_solicitud() + ",'ABIERTA');"; 
                                
                break;    
            
            case 4:
                    
                sql = "INSERT INTO tbl_solicitud_det VALUES(" + solicitud.getId_solicitud() + "," + solicitud.getCedula() + "," + solicitud.getId_area() + "," + solicitud.getId_tiposolicitud()  + "," + solicitud.getId_material() + "," + solicitud.getId_empresa() + "," + solicitud.getId_proyecto() + "," + solicitud.getPosicion() + "," + solicitud.getCantidad_solicitada() + "," + solicitud.getCantidad_aprobada() + "," + solicitud.getCantidad_autorizada() + "," + solicitud.getCantidad_conformada() + ",'" +  solicitud.getFecha_solicitud() + "','" + solicitud.getFecha_requerida() + "','" + solicitud.getJustificacion() + "'," + solicitud.isAutorizado() + ",FALSE,NULL,0,FALSE,NULL,0,FALSE,NULL,0,'');"; 
                break;
                
            case 5:
                sql = "SELECT id_material FROM tbl_maestromaterial WHERE numero_material = " + solicitud.getNumero_material() + ";";
                break;
            
            case 6:
                sql = "SELECT posicion, numero_material,descripcionmat,cantidad_solicitada,codigo_umb,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,descripciontipo,fk_usuario,nombres,descripcionarea FROM vw_solicitud_detalle WHERE anulado = FALSE AND fk_solicitud = " + solicitud.getId_solicitud() + " ORDER BY fk_solicitud,posicion;";
                
                break;    
            
            case 7:
                sql = "SELECT MAX(id_solicitud)FROM tbl_solicitud;";
                break;
            
            case 8:
                sql = "DELETE FROM tbl_solicitud_det WHERE posicion = " + solicitud.getPosicion() + " AND fk_solicitud = " + solicitud.getId_solicitud();
                
                break;      
            case 9:
                sql = "UPDATE tbl_solicitud_det SET posicion =  " + posicion_act + " WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND posicion = " + solicitud.getPosicion() +";";
                break;    
                
             /*case 10:
                sql = "SELECT id_solicitud FROM tbl_solicitud WHERE estatus = FALSE; ";
                break;*/
           case 11:
                //sql = "SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_solicitado = TRUE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND anulado = FALSE";
                //sql = "SELECT DISTINCT fk_solicitud  FROM tbl_solicitud_det WHERE aprobado_solicitado = TRUE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND fk_tiposolicitud <> 1 AND anulado = FALSE ";
                sql = "SELECT DISTINCT fk_solicitud  FROM tbl_solicitud_det WHERE aprobado_gerente = FALSE AND fk_tiposolicitud = 2 AND anulado = FALSE "; //SS
                sql +="UNION ";
                sql +="SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_gerente = FALSE AND conformado_almacen = TRUE AND fk_tiposolicitud = 1 AND anulado = FALSE "; //SD
                sql +="UNION ";
                sql +="SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_gerente = FALSE AND aprobado_solicitado = TRUE AND fk_tiposolicitud = 3 AND anulado = FALSE ";//SI
                sql +="ORDER BY fk_solicitud;";

                break;
                
            case 12:
                //sql = "SELECT DISTINCT fk_solicitud  FROM tbl_solicitud_det WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND anulado = FALSE";
                sql = "SELECT DISTINCT fk_solicitud  FROM tbl_solicitud_det WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND fk_tiposolicitud = 3 AND anulado = FALSE ";
                /*sql +="UNION ";
                sql +="SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = TRUE AND fk_tiposolicitud = 1 AND anulado = FALSE; ";*/
                sql +="ORDER BY fk_solicitud;";        
                break;
            
            case 13:
                sql = "SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_solicitado = TRUE AND aprobado_gerente = TRUE AND conformado_almacen = FALSE AND anulado = FALSE";
                break;   
                
            case 15:
                sql = "SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,SUM(posicion) as posicion ";
                sql += "FROM( ";
                //sql += "SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion) as posicion  FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_solicitado = TRUE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE  AND fk_tiposolicitud <> 1 AND fk_solicitud = " + solicitud.getId_solicitud() + " ";
                sql += "SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion) as posicion  FROM vw_solicitud_detalle WHERE fk_area = " + solicitud.getId_area() + " AND anulado = FALSE AND aprobado_gerente = FALSE AND fk_tiposolicitud = 2  AND fk_solicitud = " + solicitud.getId_solicitud() + " "; //SS
                sql +="UNION ALL ";
                sql +="SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion) as posicion  FROM vw_solicitud_detalle WHERE fk_area = " + solicitud.getId_area() + " AND anulado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = TRUE  AND fk_tiposolicitud = 1 AND fk_solicitud = " + solicitud.getId_solicitud() + " "; //SD
                sql +="UNION ALL ";
                sql +="SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion) as posicion  FROM vw_solicitud_detalle WHERE fk_area = " + solicitud.getId_area() + " AND anulado = FALSE AND aprobado_gerente = FALSE AND aprobado_solicitado = TRUE  AND fk_tiposolicitud = 3 AND fk_solicitud = " + solicitud.getId_solicitud() + " "; //SI
                sql += ") as consulta ";
                sql += "GROUP BY fk_solicitud,fk_usuario,nombres,descripcionarea;";    
                break;    
                               
            case 16:
                
                sql = "SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,SUM(posicion) as posicion ";
                sql += "FROM( ";
                //sql += "SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion) as posicion  FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_solicitado = TRUE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE  AND fk_tiposolicitud <> 1 AND fk_solicitud = " + solicitud.getId_solicitud() + " ";
                sql += "SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion) as posicion  FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_gerente = FALSE AND fk_tiposolicitud = 2  AND fk_solicitud = " + solicitud.getId_solicitud() + " "; //SS
                sql +="UNION ALL ";
                sql +="SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion) as posicion  FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = TRUE  AND fk_tiposolicitud = 1 AND fk_solicitud = " + solicitud.getId_solicitud() + " "; //SD
                sql +="UNION ALL ";
                sql +="SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion) as posicion  FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_gerente = FALSE AND aprobado_solicitado = TRUE  AND fk_tiposolicitud = 3 AND fk_solicitud = " + solicitud.getId_solicitud() + " "; //SI
                sql += ") as consulta ";
                sql += "GROUP BY fk_solicitud,fk_usuario,nombres,descripcionarea;";    
                break;    
                
            case 21:
                sql = "SELECT fk_solicitud,posicion FROM tbl_solicitud_det WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND anulado = FALSE;";
                break;
                
            case 22:
                //sql = "SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_solicitado = TRUE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND fk_tiposolicitud <> 1 AND fk_solicitud = " + solicitud.getId_solicitud() + " AND anulado = FALSE ";
                sql = "SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_gerente = FALSE AND fk_tiposolicitud = 2 AND fk_solicitud = " + solicitud.getId_solicitud() + " AND anulado = FALSE "; //SS
                sql +="UNION ";
                sql += "SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_gerente = FALSE AND conformado_almacen = TRUE AND fk_tiposolicitud = 1 AND fk_solicitud = " + solicitud.getId_solicitud() + " AND anulado = FALSE "; //SD
                sql +="UNION ";
                sql += "SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_gerente = FALSE AND aprobado_solicitado = TRUE AND fk_tiposolicitud = 3 AND fk_solicitud = " + solicitud.getId_solicitud() + " AND anulado = FALSE;";//SI
                       
                break;
                
            /*case 23:
                sql = "SELECT DISTINCT fk_solicitud,posicion  FROM tbl_solicitud_det WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND fk_solicitud = " + solicitud.getId_solicitud() + " AND anulado = FALSE ORDER BY posicion;";
                break;
            
            case 24:
                sql = "SELECT DISTINCT fk_solicitud,posicion FROM tbl_solicitud_det WHERE aprobado_solicitado = TRUE AND aprobado_gerente = TRUE AND conformado_almacen = FALSE AND fk_solicitud = " + solicitud.getId_solicitud() + " AND anulado = FALSE ORDER BY posicion;";
                break;   */       
            
            case 25:
                //sql = "SELECT DISTINCT posicion, numero_material,descripcionmat,cantidad_solicitada,cantidad_aprobada,codigo_umb,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,descripciontipo,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND fk_solicitud = " + solicitud.getId_solicitud()  + " ORDER BY fk_solicitud,posicion;";
               
                sql = "SELECT DISTINCT posicion, numero_material,descripcionmat,cantidad_solicitada,cantidad_aprobada,codigo_umb,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,descripciontipo,fk_usuario,nombres,descripcionarea,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE  AND fk_tiposolicitud = 3 AND fk_solicitud = " + solicitud.getId_solicitud()  + " ";
                /*sql += "UNION ";
                sql += "SELECT DISTINCT posicion, numero_material,descripcionmat,cantidad_conformada,cantidad_aprobada,codigo_umb,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,descripciontipo,fk_usuario,nombres,descripcionarea,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = TRUE AND fk_tiposolicitud = 1 AND fk_solicitud = " + solicitud.getId_solicitud()  + ";";*/
                sql += "ORDER BY posicion;";
                break;       
            
            case 26:
                sql = "SELECT posicion, numero_material,descripcionmat,cantidad_solicitada,codigo_umb,descripciongrupo, fecha_requerida, justificacion, autorizado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,descripciontipo,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_solicitud_detalle WHERE anulado = FALSE AND fk_area = " + solicitud.getId_area() + " AND fk_solicitud = " + solicitud.getId_solicitud() + " ORDER BY fk_solicitud,posicion;";
                break;   
                
            case 27:
                sql = "UPDATE tbl_solicitud_det SET justificacion = '" + solicitud.getJustificacion() +  "',anulado=TRUE WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND posicion = " + solicitud.getPosicion() +";";
                break;      
            case 28:
                sql = "UPDATE tbl_solicitud_det SET justificacion = '" + solicitud.getJustificacion() +  "',anulado=TRUE WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND posicion = " + solicitud.getPosicion() +";";
                break;    
            case 29:
                sql = "SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND fk_tiposolicitud = 3 AND fk_solicitud = " + solicitud.getId_solicitud() + " AND anulado = FALSE; ";
                /*sql += "UNION ";
                sql += "SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = TRUE AND fk_tiposolicitud = 1 AND fk_solicitud = " + solicitud.getId_solicitud() + " AND anulado = FALSE;";*/
                break;    
            case 30:
                 sql = "UPDATE tbl_solicitud_det SET aprobado_gerente = TRUE,fecha_aprobado_gerente='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_gerente = " + solicitud.getCedula() + ",justificacion= '" + solicitud.getJustificacion() + "',cantidad_autorizada = " + solicitud.getCantidad_autorizada() + " WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND posicion = " + solicitud.getPosicion()  +";";
                break;    
            case 31:
                 //sql = "UPDATE tbl_solicitud_det SET aprobado_solicitado = TRUE,fecha_aprobado_solicitado='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_jefe = " + solicitud.getCedula() + ",justificacion= '" + solicitud.getJustificacion() + "',cantidad_aprobada = " + solicitud.getCantidad_aprobada() + " WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND posicion = " + solicitud.getPosicion()  +";";
                sql = "UPDATE tbl_solicitud_det SET aprobado_solicitado = TRUE,fecha_aprobado_solicitado='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_jefe = " + solicitud.getCedula() + ",aprobado_gerente = TRUE,fecha_aprobado_gerente='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_gerente = " + solicitud.getCedula() + ",conformado_almacen = TRUE,fecha_aprobado_almacen='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_almacen = " + solicitud.getCedula() + ",justificacion= '" + solicitud.getJustificacion() + "',cantidad_aprobada = " + solicitud.getCantidad_aprobada() + ",cantidad_autorizada = " + solicitud.getCantidad_aprobada() + ",cantidad_conformada = " + solicitud.getCantidad_aprobada() + " WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND posicion = " + solicitud.getPosicion()  +";";
                
                break; 
            case 32:
                 sql = "UPDATE tbl_solicitud_det SET conformado_almacen = TRUE,fecha_aprobado_almacen='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_almacen = " + solicitud.getCedula() + ",justificacion= '" + solicitud.getJustificacion() + "',cantidad_conformada = " + solicitud.getCantidad_conformada() + " WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND posicion = " + solicitud.getPosicion()  +";";
                break;
            case 33:
                sql = "SELECT DISTINCT posicion, numero_material,descripcionmat,cantidad_aprobada,cantidad_autorizada,codigo_umb,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,descripciontipo,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_solicitud_detalle WHERE anulado = FALSE AND fk_solicitud = " + solicitud.getId_solicitud()  + " ORDER BY fk_solicitud,posicion;";
                
                break;        
             case 34:
                 
                //sql = "SELECT DISTINCT a.fk_solicitud,b.fk_solicitud ";
                sql = "SELECT DISTINCT a.fk_solicitud ";
                sql += "FROM tbl_solicitud_det a ";
                //sql += "LEFT OUTER JOIN tbl_cotizacion b ON ";
                //sql += "a.fk_solicitud = b.fk_solicitud AND a.posicion = b.posicion ";
                sql += "WHERE a.aprobado_solicitado = TRUE AND a.aprobado_gerente = TRUE AND a.anulado = FALSE; ";
                 
                break;
            
             case 35:
                //sql = "SELECT DISTINCT posicion, numero_material,descripcionmat,cantidad_aprobada,cantidad_autorizada,codigo_umb,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,fk_tiposolicitud,descripciontipo,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_solicitado = TRUE AND aprobado_gerente = FALSE AND fk_solicitud = " + solicitud.getId_solicitud()  + " ORDER BY fk_solicitud,posicion;";
                sql = "SELECT DISTINCT posicion, numero_material,descripcionmat,cantidad_solicitada,cantidad_autorizada,codigo_umb,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,fk_tiposolicitud,descripciontipo,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_gerente = FALSE AND fk_tiposolicitud = 2 AND fk_solicitud = " + solicitud.getId_solicitud()  + " ";//SS
                sql += "UNION ";
                sql += "SELECT DISTINCT posicion, numero_material,descripcionmat,cantidad_conformada,cantidad_autorizada,codigo_umb,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,fk_tiposolicitud,descripciontipo,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = TRUE AND fk_tiposolicitud = 1 AND fk_solicitud = " + solicitud.getId_solicitud()  + " ";//SD
                sql += "UNION ";
                sql += "SELECT DISTINCT posicion, numero_material,descripcionmat,cantidad_aprobada,cantidad_autorizada,codigo_umb,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,fk_tiposolicitud,descripciontipo,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_gerente = FALSE AND aprobado_solicitado = TRUE AND fk_tiposolicitud = 3 AND fk_solicitud = " + solicitud.getId_solicitud()  + " ";//SI
                sql += "ORDER BY posicion;";
                break; 
             
            case 36:
                sql = "SELECT DISTINCT fk_solicitud,fk_usuario,nombres,descripcionarea,descripcionproyecto,descripcionempresa FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_solicitado = TRUE AND aprobado_gerente = TRUE AND fk_solicitud = " + solicitud.getId_solicitud()  + " ORDER BY fk_solicitud,posicion;";
                
                break;    
            
            case 37:
                sql = "SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_solicitado = TRUE AND aprobado_gerente = TRUE  AND anulado = FALSE AND fk_solicitud = " + solicitud.getId_solicitud() + " AND anulado = FALSE;";
                break;      
            
            case 38:
                
                //sql = "SELECT DISTINCT a.posicion,a.numero_material,a.descripcionmat,a.cantidad_conformada,a.codigo_umb,a.descripciongrupo,a.fecha_requerida,a.descripcionempresa,a.descripcionproyecto,a.descripciontipo,b.posicion ";
                sql = "SELECT DISTINCT a.fk_solicitud, a.posicion,a.numero_material,a.descripcionmat,a.nombres,a.descripcionarea,a.cantidad_autorizada,a.codigo_umb,a.descripciongrupo,a.fecha_requerida,a.descripcionproyecto,a.descripciontipo,a.justificacion ";
                sql += "FROM vw_solicitud_detalle a ";
               // sql += "LEFT OUTER JOIN tbl_cotizacion b ON a.fk_solicitud = b.fk_solicitud AND a.posicion = b.posicion ";
                sql += this.cadena + " a.anulado = FALSE AND a.aprobado_gerente = TRUE  AND a.anulado = FALSE  ORDER BY a.fk_solicitud,a.posicion ASC;";
                             
                break;   
            
            case 39:
                //sql = "SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion),descripcionempresa  FROM vw_solicitud_detalle WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND anulado = FALSE AND fk_solicitud = " + solicitud.getId_solicitud()  + ";";
                
                /*sql = "SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,SUM(posicion) as posicion ";
                sql += "FROM( ";*/
                sql = "SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion) as posicion  FROM vw_solicitud_detalle WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND anulado = FALSE AND fk_tiposolicitud = 3 AND fk_solicitud = " + solicitud.getId_solicitud()  + " "; //SI
               /* sql += "UNION ALL ";
                sql += "SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion) as posicion  FROM vw_solicitud_detalle WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = TRUE AND anulado = FALSE AND fk_tiposolicitud = 1 AND fk_solicitud = " + solicitud.getId_solicitud()  + " ";
                sql += ") as consulta ";*/
                sql += "GROUP BY fk_solicitud,fk_usuario,nombres,descripcionarea ";
                sql += "ORDER BY fk_solicitud;";
                break;   
            
            case 40:
                sql = "SELECT fk_area,fk_proyecto,fk_tiposolicitud,fk_solicitud,numero_material,descripcionmat,posicion,cantidad_solicitada,codigo_umb,descripcionproyecto,descripcionempresa,descripciontipo,fecha_solicitud, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada,fecha_requerida,descripciongrupo ";
                sql += "FROM vw_solicitud_detalle ";
                sql += this.anulado;
                sql += " ORDER BY fk_solicitud,posicion ASC";
                
                break;
            
            case 41:
                sql = "SELECT fk_area,fk_proyecto,fk_tiposolicitud,fk_solicitud,numero_material,descripcionmat,posicion,cantidad_solicitada,codigo_umb,descripcionproyecto,descripcionempresa,descripciontipo,fecha_solicitud, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada,fecha_requerida,descripciongrupo ";
                sql += "FROM vw_solicitud_detalle ";
                sql += this.anulado + " and fk_solicitud LIKE '%" + solicitud.getId_solicitud() + "%';";
                sql += " ORDER BY fk_solicitud,posicion ASC";
                break;
            
            case 42:
                sql = "SELECT fk_area,fk_proyecto,fk_tiposolicitud,fk_solicitud,numero_material,descripcionmat,posicion,cantidad_solicitada,codigo_umb,descripcionproyecto,descripcionempresa,descripciontipo,fecha_solicitud, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada,fecha_requerida,descripciongrupo ";
                sql += "FROM vw_solicitud_detalle ";
                sql += this.anulado + " and descripcionmat LIKE '%" + solicitud.getDescripcion_material() + "%';";
                sql += " ORDER BY fk_solicitud,posicion ASC";
                break;
            
           case 43:
                sql = "SELECT fk_area,fk_proyecto,fk_tiposolicitud,fk_solicitud,numero_material,descripcionmat,posicion,cantidad_solicitada,codigo_umb,descripcionproyecto,descripcionempresa,descripciontipo,fecha_solicitud, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada,fecha_requerida,descripciongrupo ";
                sql += "FROM vw_solicitud_detalle ";
                sql += this.anulado + " and fk_proyecto = " + solicitud.getId_proyecto() + ";";
                sql += " ORDER BY fk_solicitud,posicion ASC";
                break;
            
           case 44:
                sql = "SELECT fk_area,fk_proyecto,fk_tiposolicitud,fk_solicitud,numero_material,descripcionmat,posicion,cantidad_solicitada,codigo_umb,descripcionproyecto,descripcionempresa,descripciontipo,fecha_solicitud, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada,fecha_requerida,descripciongrupo ";
                sql += "FROM vw_solicitud_detalle ";
                sql += this.anulado + " and fk_tiposolicitud = " + solicitud.getId_tiposolicitud() + ";";
                sql += " ORDER BY fk_solicitud,posicion ASC";
                break;     

           case 45:
                sql = "SELECT fk_area,fk_proyecto,fk_tiposolicitud,fk_solicitud,numero_material,descripcionmat,posicion,cantidad_solicitada,codigo_umb,descripcionproyecto,descripcionempresa,descripciontipo,fecha_solicitud, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada,fecha_requerida,descripciongrupo ";
                sql += "FROM vw_solicitud_detalle ";
                sql += this.anulado + " and fecha_solicitud BETWEEN '" + this.fechadesde + "' AND '" + this.fechahasta + "';";
                sql += " ORDER BY fk_solicitud,posicion ASC";
                break;  
                
           case 46:
                sql = "UPDATE tbl_solicitud_det SET fk_proyecto = " + solicitud.getId_proyecto() + ",fk_empresa = " + solicitud.getId_empresa() + ",fk_tiposolicitud = " + solicitud.getId_tiposolicitud() +  " WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND posicion = " + solicitud.getPosicion() +";";
                break;       
           
           case 47:
                sql = "UPDATE tbl_solicitud_det SET observaciones = '" + solicitud.getObservaciones() + "',anulado = TRUE,justificacion = '" + solicitud.getJustificacion() + "' WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND posicion = " + solicitud.getPosicion() +";";
                break;   
                
           case 48:
                sql = "UPDATE tbl_solicitud_det SET aprobado_solicitado = FALSE,justificacion = '" + solicitud.getJustificacion() + "' WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND posicion = " + solicitud.getPosicion() +";";
                break;  
           case 49:
                sql = "SELECT fk_area,fk_proyecto,fk_tiposolicitud,fk_solicitud,numero_material,descripcionmat,posicion,cantidad_solicitada,codigo_umb,descripcionproyecto,descripcionempresa,descripciontipo,fecha_solicitud, ";
                sql += "aprobado_solicitado, fecha_aprobado_solicitado, cantidad_aprobada,";
                sql += "aprobado_gerente, fecha_aprobado_gerente,cantidad_autorizada,";
                sql += "conformado_almacen, fecha_aprobado_almacen,cantidad_conformada,fecha_requerida,descripciongrupo ";
                sql += "FROM vw_solicitud_detalle ";
                sql += this.cadena;
                sql += " ORDER BY fk_solicitud,posicion ASC;";
                break;   
           case 50:
                //sql = "SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_solicitado = TRUE AND aprobado_gerente = TRUE AND conformado_almacen = FALSE AND fk_tiposolicitud = 1 AND anulado = FALSE";
               sql = "SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND fk_tiposolicitud = 1 AND anulado = FALSE ";
               sql += "ORDER BY fk_solicitud;"; 
               break;
                
           case 51:
                //sql = "SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion),descripcionempresa  FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_solicitado = TRUE AND aprobado_gerente = TRUE AND conformado_almacen = FALSE AND fk_tiposolicitud = 1 AND fk_area = " + solicitud.getId_area() + " AND fk_solicitud = " + solicitud.getId_solicitud() + ";";
               sql = "SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion)  FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND fk_tiposolicitud = 1 AND fk_area = " + solicitud.getId_area() + " AND fk_solicitud = " + solicitud.getId_solicitud() + " GROUP BY fk_solicitud,fk_usuario,nombres,descripcionarea;";
                 
               break;     
                
           case 52:
                //sql = "SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion),descripcionempresa  FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_solicitado = TRUE AND aprobado_gerente = TRUE AND conformado_almacen = FALSE AND fk_tiposolicitud = 1 AND fk_solicitud = " + solicitud.getId_solicitud()  + ";";
                sql = "SELECT fk_solicitud,fk_usuario,nombres,descripcionarea,COUNT(posicion) FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND fk_tiposolicitud = 1 AND fk_solicitud = " + solicitud.getId_solicitud()  + " GROUP BY fk_solicitud,fk_usuario,nombres,descripcionarea;";
                
                break; 
           case 53:
                //sql = "SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE aprobado_solicitado = TRUE AND aprobado_gerente = TRUE AND conformado_almacen = FALSE AND fk_solicitud = " + solicitud.getId_solicitud() + " AND anulado = FALSE;";
                sql = "SELECT DISTINCT fk_solicitud FROM tbl_solicitud_det WHERE fk_tiposolicitud = 1 AND aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND fk_solicitud = " + solicitud.getId_solicitud() + " AND anulado = FALSE;";
                
                
                break;
           case 54:
                //sql = "SELECT DISTINCT posicion, numero_material,descripcionmat,cantidad_aprobada,cantidad_autorizada,codigo_umb,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,descripciontipo,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_solicitado = TRUE AND aprobado_gerente = TRUE AND conformado_almacen = FALSE AND fk_solicitud = " + solicitud.getId_solicitud()  + " ORDER BY fk_solicitud,posicion;";
                sql = "SELECT DISTINCT posicion, numero_material,descripcionmat,cantidad_solicitada,cantidad_conformada,codigo_umb,descripciongrupo, fecha_requerida, justificacion, anulado,descripcionempresa,descripcionproyecto,fk_usuario,nombres,descripcionarea,descripciontipo,aprobado_solicitado,fecha_aprobado_solicitado,cedula_jefe,conformado_almacen,fecha_aprobado_almacen,cedula_almacen,aprobado_gerente,fecha_aprobado_gerente,cedula_gerente,anulado FROM vw_solicitud_detalle WHERE fk_tiposolicitud = 1 AND anulado = FALSE AND aprobado_solicitado = FALSE AND aprobado_gerente = FALSE AND conformado_almacen = FALSE AND fk_solicitud = " + solicitud.getId_solicitud()  + " ORDER BY fk_solicitud,posicion;";
                
                break; 
           case 55:
                 sql = "UPDATE tbl_solicitud_det SET observaciones = '" + solicitud.getObservaciones() + "',conformado_almacen = TRUE,fecha_aprobado_almacen='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_almacen = " + solicitud.getCedula() + ",justificacion= '" + solicitud.getJustificacion() + "',cantidad_conformada = " + solicitud.getCantidad_conformada() + " WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND posicion = " + solicitud.getPosicion()  +";";
                break;    
           case 56:
                sql = "UPDATE tbl_solicitud_det SET cantidad_aprobada=0,cantidad_autorizada=0,cantidad_conformada=0,aprobado_solicitado = FALSE,conformado_almacen = FALSE,aprobado_gerente = FALSE,observaciones = '" + solicitud.getObservaciones() + "' WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND posicion = " + solicitud.getPosicion() +";";
                break;  
            case 57:
                 
                //sql = "SELECT DISTINCT a.fk_solicitud,b.fk_solicitud ";
                sql = "SELECT DISTINCT a.fk_solicitud ";
                sql += "FROM tbl_solicitud_det a ";
               // sql += "LEFT OUTER JOIN tbl_cotizacion b ON ";
               // sql += "a.fk_solicitud = b.fk_solicitud AND a.posicion = b.posicion ";
                sql += "WHERE a.aprobado_solicitado = TRUE AND a.aprobado_gerente = TRUE AND a.conformado_almacen = TRUE AND a.anulado = FALSE; ";
                 
                break;
           case 58:
                sql = "SELECT DISTINCT fk_solicitud,fk_usuario,nombres,descripcionarea,descripcionproyecto,descripcionempresa FROM vw_solicitud_detalle WHERE anulado = FALSE AND aprobado_solicitado = TRUE AND aprobado_gerente = TRUE AND conformado_almacen = TRUE AND fk_solicitud = " + solicitud.getId_solicitud()  + " ORDER BY fk_solicitud,posicion;";
                
                break;
                
           case 59:
                 sql = "UPDATE tbl_solicitud_det SET aprobado_gerente = TRUE,conformado_almacen = TRUE, fecha_aprobado_almacen ='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "', fecha_aprobado_gerente='" + funciones.fecha_bd_usuario(funciones.getfechacalendario(),2) + "',cedula_almacen = " + solicitud.getCedula() +", cedula_gerente = " + solicitud.getCedula() + ",justificacion= '" + solicitud.getJustificacion() + "',cantidad_conformada = " + solicitud.getCantidad_autorizada() + ",cantidad_autorizada = " + solicitud.getCantidad_autorizada() + " WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND posicion = " + solicitud.getPosicion()  +";";
                break;        
            
           case 60:
                sql = "SELECT posicion,numero_material,descripcionmat,cantidad_solicitada,codigo_umb,descripciongrupo,fecha_requerida,descripcionproyecto,justificacion,'' AS observacion ";
                sql += "FROM vw_solicitud_detalle ";
                sql += "WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND aprobado_solicitado = FALSE AND conformado_almacen = FALSE AND anulado = FALSE ";
                sql += "ORDER BY posicion;";
                
                break;
           
            case 61:
                sql = "SELECT max(posicion) ";
                sql += "FROM vw_solicitud_detalle ";
                sql += "WHERE fk_solicitud = " + solicitud.getId_solicitud() + " AND aprobado_solicitado = FALSE AND conformado_almacen = FALSE AND anulado = FALSE ";
                
                
                break;  
            
            case 62:
                sql = "SELECT b.fk_solicitud,b.aprobado_procura,b.aprobado_gerencia ";
                sql += "FROM tbl_cotizacion b "; 
                sql += "WHERE b.status = TRUE AND b.fk_solicitud = " + solicitud.getId_solicitud() + " AND b.posicion = " + solicitud.getPosicion(); 
                break;
            
            case 63:
                sql = "SELECT a.fk_solicitud, a.descripcionempresa,a.descripciontipo, a.posicion,a.descripcionproyecto,a.descripcionarea,a.fecha_solicitud,"; 
                sql += "a.fecha_requerida,a.cantidad_solicitada, a.cantidad_aprobada, a.cantidad_autorizada, a.cantidad_conformada, a.anulado,";
                sql += "a.numero_material, a.descripcionmat, a.codigo_umb, a.descripciongrupo,b.cantidad_cotizar,c.cantidad_ingresada,";
                sql += "(a.cantidad_autorizada-c.cantidad_ingresada) as pendientecotizar, b.nro_ordencompra, b.fecha_carga_compras, b.preciounitario, b.preciototal ";
                sql += "FROM vw_solicitud_detalle a ";
                sql += "LEFT OUTER JOIN tbl_cotizacion b ON a.fk_solicitud = b.fk_solicitud AND a.posicion = b.posicion ";
                sql += "LEFT OUTER JOIN tbl_entrada c ON b.nro_ordencompra = c.orden_compra AND c.fk_material = a.fk_material ";
                sql += this.filtroconsulta + " ";
                sql += "ORDER BY a.fk_solicitud,a.posicion ASC;";                
                break;    
                
             case 64:
                sql = "SELECT b.correo,a.fk_usuario ";
                sql += "FROM tbl_solicitud_det a "; 
                sql += "INNER JOIN tbl_usuario b ON ";
                sql += "a.fk_usuario = b.id_usuario ";
                sql += "WHERE fk_solicitud = " + solicitud.getId_solicitud() + ";";
                break;    
        }
       
        System.out.println(sql);
    }
    
    
    
    
}
