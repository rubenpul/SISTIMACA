/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controlador.ctrl_material;
import controlador.ctrl_solicitud;
import formatos_excel.reporte_almacen;
import formatos_excel.reporte_solicitud;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import jxl.write.WriteException;
import view.frm_cotizacion;
import view.frm_entrada;
import view.frm_salida;
import view.frm_entradaexpress;
import view.frm_reporte_ordendecompra;
import view.frm_reporte_tomafisica;
import view.frm_transferenciamaterialproyecto;
import view.frm_transferenciamaterialubicacion;
import view.frm_transferenciamaterialubicacionenalmacen;

/**
 *
 * @author ruben
 */
public class TransaccionThread implements Runnable{
    
    private Integer proceso;
    
    public TransaccionThread(Integer proceso){
        this.proceso = proceso;
    }
    
    @Override
    
    
    public void run() {
       switch (proceso){
           case 1: frm_entradaexpress.contabilizar_entrada();
                   break;
           case 2: frm_transferenciamaterialubicacion.actualizar_material();         
                   break;
           case 3: frm_transferenciamaterialproyecto.actualizar_material_proyecto();
                   break;
           case 4: frm_entrada.agregar_entrada_oc();  
                   break;
           case 5: frm_transferenciamaterialubicacionenalmacen.actualizar_material_ubicacion_enalmacen();
                   break; 
           case 6: reporte_tomafisica();
                   break;  
           case 7: reporte_oc();
                   break;   
           case 8: frm_cotizacion.reporte_cotizacion();
                   break;  
           case 9: frm_salida.contabilizar_salida();
                   break;          
       }    
       
    }
    
    
    public void reporte_oc(){
        
         String nombre_archivo;
         Integer numero = (int) (Math.random() * 10000000) + 1;
        nombre_archivo = "\\\\192.168.0.3\\dist\\Documentos_SisTimaca\\OrdenCompra" + numero +".xls";
        //nombre_archivo = "C:\\Users\\ruben\\Desktop\\OrdenCompra" + numero +".xls";

        Boolean resp=false;

        Integer id_clasematerial=0;
        Integer id_empresa=0;
        Integer id_proyecto=0;
        Integer id_area=0; 
        Integer id_tiposolicitud=0; 
        
        try{
            
            id_empresa = Integer.parseInt(frm_reporte_ordendecompra.cmb_empresa.getSelectedItem().toString().substring(0,3).trim());
        }
        catch(NumberFormatException | NullPointerException ex){
            id_empresa = 0;
        }

        try{
            id_tiposolicitud = Integer.parseInt(frm_reporte_ordendecompra.cmb_tiposolicitud.getSelectedItem().toString().substring(0,3).trim());
        }
        catch(NumberFormatException | NullPointerException ex){
            id_tiposolicitud = 0;
        }
 
        
        id_proyecto = Integer.parseInt(frm_reporte_ordendecompra.txt_id.getText().trim());
        
 
        try{
            id_area = Integer.parseInt(frm_reporte_ordendecompra.cmb_area.getSelectedItem().toString().substring(0,3).trim());
        }
        catch(NumberFormatException | NullPointerException ex){
            id_area = 0;
        }
          
        
        
        ctrl_solicitud solicitud = new ctrl_solicitud(0/*id_solicitud*/,0 /*cedula*/,id_area /*id_area*/,""/*descripcionarea*/,id_tiposolicitud /*id_tiposolicitud*/,"" /*descripciontiposolicitud*/,0,0 /*numero de material*/,"" /*descripcion de material*/,id_empresa /*id_empresa*/,"" /*descripcionempresa*/,id_proyecto /*idproyecto*/,""/*descripcionproyecto*/,0 /*posicion*/,0 /*cantidadsolicitada*/,0,0,0,"" /*fecha solicitud*/,"" /*fecha_requerida*/,"" /*justificacion*/,false,"","","","","","","","","");  

        resp=solicitud.consultar_solicitud_ordendecompra(frm_reporte_ordendecompra.tabla_oc);

        if (resp){
                        
            reporte_solicitud ex = new reporte_solicitud(new File(nombre_archivo), "DATOS DE ORDENES DE COMPRA", frm_reporte_ordendecompra.tabla_oc);

            try {
                try {
                    if(ex.excel_export_reporte_oc()){

                        File archivo_abrir = new File(nombre_archivo);
                        Desktop.getDesktop().open(archivo_abrir);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "ERROR EN EXPORTAR ARCHIVO EXCEL");
                    }
                } catch (WriteException ex1) {
                    
                }
            }catch (IOException ex1) {
                JOptionPane.showMessageDialog(null, "ERROR ABRIR ARCHIVO");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "NO HAY DATOS PARA LA CONSULTA");
        }
    }
    
    public void reporte_tomafisica(){
         String nombre_archivo;
         Integer numero = (int) (Math.random() * 10000000) + 1;
        nombre_archivo = "\\\\192.168.0.3\\dist\\Documentos_SisTimaca\\TomaFisica" + numero +".xls";
        //nombre_archivo = "C:\\Users\\ruben\\Desktop\\TomaFisica" + numero +".xls";

        Boolean resp=false;

        Integer id_clasematerial=0;
        Integer id_almacen=0;

        try{
            id_almacen = Integer.parseInt(frm_reporte_tomafisica.cmb_almacen.getSelectedItem().toString().substring(0,3).trim());
        }
        catch(NumberFormatException | NullPointerException ex){
            id_almacen = 0;
        }

        try{
            id_clasematerial = Integer.parseInt(frm_reporte_tomafisica.cmb_articulo.getSelectedItem().toString().substring(0,3).trim());
        }
        catch(NumberFormatException | NullPointerException ex){
            id_clasematerial = 0;
        }
        
        ctrl_material material = new ctrl_material(0 /*id_material*/, 0 /*numero_material*/, "" /*codigo_mat_alter*/, "" /*foto_material*/, "" /*descripcion*/, "" /*marca*/, "" /*modelo*/, 0 /*unidad_medida*/, "" /*descripcion_medida*/, 0 /*stock_inicial*/, 0 /*stock_disponible*/, 0 /*stock_usado*/, 0 /*stock_minimo*/, 0 /*stock_pedido*/, 0 /*stock_maximo*/, 0.0 /*preciounitario*/, 0.0 /*preciototal*/, "" /*fecha_actualizacion*/, 0 /*id_usuario*/, "" /*descripcionusuario*/, 0 /*cantidad_entrante*/, 0 /*cantidad_saliente*/, "" /*observaciones*/, "" /*usomaterial*/, id_clasematerial /*id_clasearticulo*/, "" /*descripcionclasearticulo*/, 0 /*id_grupoarticulo*/, "" /*descripciongrupoarticulo*/, 0 /*id_moneda*/, "" /*descripcionmoneda*/, "" /*ubicacion*/, id_almacen /*id_almacen*/, "" /*descripcionalmacen*/, 0 /*id_empresa*/, "" /*descripcionempresa*/, 0 /*id_valoracion*/, "" /*descripcionvaloracion*/,true /*status*/);
    

        resp=material.consultar_tomafisica(frm_reporte_tomafisica.tabla_tomafisica);

        if (resp){
                        
            reporte_almacen ex = new reporte_almacen(new File(nombre_archivo), "DATOS DE TOMA FÍSICA", frm_reporte_tomafisica.tabla_tomafisica);

            try {
                try {
                    if(ex.excel_export_reporte_tomafisica()){

                        File archivo_abrir = new File(nombre_archivo);
                        Desktop.getDesktop().open(archivo_abrir);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "ERROR EN EXPORTAR ARCHIVO EXCEL");
                    }
                } catch (WriteException ex1) {
                    
                }
            }catch (IOException ex1) {
                JOptionPane.showMessageDialog(null, "ERROR ABRIR ARCHIVO");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "NO HAY DATOS PARA LA CONSULTA");
        }
    }
    
}
