/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formatos_excel;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author ruben
 */
public class reporte_solicitud {
    
    private File file;
    private String nombreTab;
    private JTable tablasolicitud;
   
  

    public reporte_solicitud(File file, String nombreTab, JTable tablasolicitud) {
        this.file = file;
        this.nombreTab = nombreTab;
        this.tablasolicitud = tablasolicitud;
        
    }
  
public Boolean excel_export_reporte_oc() throws IOException, WriteException{
    
        int i=0;
        int j=0;
        WritableFont fuente_titulo = new WritableFont(WritableFont.ARIAL, 14, WritableFont.BOLD, true);
        WritableCellFormat celda_titulo = new WritableCellFormat(fuente_titulo); 
        WritableFont fuente_subtitulo = new WritableFont(WritableFont.ARIAL, 12, WritableFont.BOLD, true);
        WritableCellFormat celda_subtitulo = new WritableCellFormat(fuente_subtitulo); 
        WritableFont fuente_datos = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD, true);
        WritableCellFormat celda_datos = new WritableCellFormat(fuente_datos); 
        
        try{
        
            //Nuestro flujo de salida para apuntar a donde vamos a escribir
            DataOutputStream out=new DataOutputStream(new FileOutputStream(file));
 
            //Representa nuestro archivo en excel y necesita un OutputStream para saber donde va locoar los datos
            WritableWorkbook w = Workbook.createWorkbook(out);
                    
            WritableSheet s = w.createSheet(nombreTab, 0);

            j++;
            Label etiqueta_titulo = new Label(0, j, "NRO DE SOLICITUD", celda_titulo); 
            s.addCell(etiqueta_titulo);
                       
            Label etiqueta_subtitulo = new Label(1, j, "EMPRESA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
            etiqueta_subtitulo = new Label(2, j, "TIPO DE SOLICITUD", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
            etiqueta_subtitulo = new Label(3, j, "POS"); 
            s.addCell(etiqueta_subtitulo);
            
            etiqueta_subtitulo = new Label(4, j, "PROYECTO", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(5, j, "DESCRIPCIÓN ÁREA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(6, j, "FECHA SOLICITUD", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(7, j, "FECHA REQUERIDA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(8, j, "CANT. SOLICITADA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(9, j, "CANT. APROBADA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(10, j, "CANT. AUTORIZADA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(11, j, "CANT. CONFORMADA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(12, j, "ANULADO?", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(13, j, "NÚMERO DE MATERIAL", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
       
            etiqueta_subtitulo = new Label(14, j, "DESCRIPCIÓN MATERIAL", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(15, j, "UMB", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
            etiqueta_subtitulo = new Label(16, j, "GRUPO ART", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
                    
             etiqueta_subtitulo = new Label(17, j, "CANT. COTIZADA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
             etiqueta_subtitulo = new Label(18, j, "CANT. INGRESADA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
             etiqueta_subtitulo = new Label(19, j, "CANT. PENDIENTE", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
             etiqueta_subtitulo = new Label(20, j, "NRO O/C", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
             etiqueta_subtitulo = new Label(21, j, "FECHA O/C", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
             etiqueta_subtitulo = new Label(22, j, "PRECIO UNITARIO", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(23, j, "PRECIO TOTAL", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            
             j++;
            
                       
            Label etiqueta_datos; 
            
            while(i < tablasolicitud.getRowCount()){
                 etiqueta_subtitulo = new Label(0, j, tablasolicitud.getValueAt(i,0).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(1, j, tablasolicitud.getValueAt(i,1).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(2, j, tablasolicitud.getValueAt(i,2).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(3, j, tablasolicitud.getValueAt(i,3).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(4, j, tablasolicitud.getValueAt(i,4).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(5, j, tablasolicitud.getValueAt(i,5).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(6, j, tablasolicitud.getValueAt(i,6).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(7, j, tablasolicitud.getValueAt(i,7).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(8, j, tablasolicitud.getValueAt(i,8).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(9, j, tablasolicitud.getValueAt(i,9).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(10, j, tablasolicitud.getValueAt(i,10).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(11, j, tablasolicitud.getValueAt(i,11).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                try{
                    tablasolicitud.setValueAt(tablasolicitud.getValueAt(i,12).toString().replace("1", "SI"),i,12);
                    tablasolicitud.setValueAt(tablasolicitud.getValueAt(i,12).toString().replace("0", "NO"),i,12);
                    etiqueta_subtitulo = new Label(12, j, tablasolicitud.getValueAt(i,12).toString(), celda_datos); 
                 }
                 catch(NullPointerException ex){
                    etiqueta_subtitulo = new Label(12, j, "", celda_datos);  
                 }
                 s.addCell(etiqueta_subtitulo);
                  etiqueta_subtitulo = new Label(13, j, tablasolicitud.getValueAt(i,13).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                  etiqueta_subtitulo = new Label(14, j, tablasolicitud.getValueAt(i,14).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                  etiqueta_subtitulo = new Label(15, j, tablasolicitud.getValueAt(i,15).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                  etiqueta_subtitulo = new Label(16, j, tablasolicitud.getValueAt(i,16).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                  etiqueta_subtitulo = new Label(17, j, tablasolicitud.getValueAt(i,17).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 
                 try{
                    etiqueta_subtitulo = new Label(18, j, tablasolicitud.getValueAt(i,18).toString(), celda_datos); 
                 }
                 catch(NullPointerException ex){
                    etiqueta_subtitulo = new Label(18, j, "", celda_datos);  
                 }
                 s.addCell(etiqueta_subtitulo);                  
                 
                 try{
                    etiqueta_subtitulo = new Label(19, j, tablasolicitud.getValueAt(i,19).toString(), celda_datos); 
                 }
                 catch(NullPointerException ex){
                    etiqueta_subtitulo = new Label(19, j, "", celda_datos);  
                 }                  
                 s.addCell(etiqueta_subtitulo);
                 
                 etiqueta_subtitulo = new Label(20, j, tablasolicitud.getValueAt(i,20).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                  etiqueta_subtitulo = new Label(21, j, tablasolicitud.getValueAt(i,21).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                  etiqueta_subtitulo = new Label(22, j, tablasolicitud.getValueAt(i,22).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(23, j, tablasolicitud.getValueAt(i,23).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
 
 
                 /*try{
                    tablasolicitud.setValueAt(tablasolicitud.getValueAt(i,16).toString().replace("true", "SI"),i,16);
                    tablasolicitud.setValueAt(tablasolicitud.getValueAt(i,16).toString().replace("false", "NO"),i,16);
                    etiqueta_subtitulo = new Label(12, j, tablasolicitud.getValueAt(i,16).toString(), celda_datos); 
                 }
                 catch(NullPointerException ex){
                    etiqueta_subtitulo = new Label(12, j, "", celda_datos);  
                 }
                 s.addCell(etiqueta_subtitulo);*/
                
                 
                i++;
                j++;
            }
            
            w.write(); 
            //Cerramos el WritableWorkbook y DataOutputStream
            w.close();
            out.close();
 
 
            //si todo sale bien salimos de aqui con un true :D
            return true;
 
        }catch(IOException | WriteException ex){JOptionPane.showMessageDialog(null, "EL ARCHIVO ESTA ABIERTO. POR FAVOR CERRAR.");}
 
        //Si llegamos hasta aqui algo salio mal
        return false;
}
    
    
public Boolean excel_export_reporte_cotizaciones()  throws IOException, WriteException{
        int i=0;
        int j=0;
        WritableFont fuente_titulo = new WritableFont(WritableFont.ARIAL, 14, WritableFont.BOLD, true);
        WritableCellFormat celda_titulo = new WritableCellFormat(fuente_titulo); 
        WritableFont fuente_subtitulo = new WritableFont(WritableFont.ARIAL, 12, WritableFont.BOLD, true);
        WritableCellFormat celda_subtitulo = new WritableCellFormat(fuente_subtitulo); 
        WritableFont fuente_datos = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD, true);
        WritableCellFormat celda_datos = new WritableCellFormat(fuente_datos); 
        
        try{
        
            //Nuestro flujo de salida para apuntar a donde vamos a escribir
            DataOutputStream out=new DataOutputStream(new FileOutputStream(file));
 
            //Representa nuestro archivo en excel y necesita un OutputStream para saber donde va locoar los datos
            WritableWorkbook w = Workbook.createWorkbook(out);
                    
            WritableSheet s = w.createSheet(nombreTab, 0);

            j++;
            Label etiqueta_titulo = new Label(0, j, "NRO DE SOLICITUD", celda_titulo); 
            s.addCell(etiqueta_titulo);
                       
            Label etiqueta_subtitulo = new Label(1, j, "POS", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
            etiqueta_subtitulo = new Label(2, j, "NRO DE MATERIAL", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
            etiqueta_subtitulo = new Label(3, j, "MATERIAL SOLICITADO"); 
            s.addCell(etiqueta_subtitulo);
            
            etiqueta_subtitulo = new Label(4, j, "SOLICITANTE", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(5, j, "DESCRIPCIÓN ÁREA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(6, j, "GRUPO ARTÍCULO", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(7, j, "CANTIDAD", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(8, j, "UMB", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(9, j, "FECHA REQUERIDA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(10, j, "PROYECTO", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(11, j, "TIPO DE SOLICITUD", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

             etiqueta_subtitulo = new Label(12, j, "JUSTIFICACIÓN", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
              etiqueta_subtitulo = new Label(13, j, "APROBADO?", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
              etiqueta_subtitulo = new Label(14, j, "AUTORIZADO?", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
             j++;
            
                       
            Label etiqueta_datos; 
            
            while(i < tablasolicitud.getRowCount()){
                 etiqueta_subtitulo = new Label(0, j, tablasolicitud.getValueAt(i,1).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(1, j, tablasolicitud.getValueAt(i,2).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(2, j, tablasolicitud.getValueAt(i,3).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(3, j, tablasolicitud.getValueAt(i,4).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(4, j, tablasolicitud.getValueAt(i,5).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(5, j, tablasolicitud.getValueAt(i,6).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(6, j, tablasolicitud.getValueAt(i,7).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(7, j, tablasolicitud.getValueAt(i,8).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(8, j, tablasolicitud.getValueAt(i,9).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(9, j, tablasolicitud.getValueAt(i,10).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(10, j, tablasolicitud.getValueAt(i,11).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(11, j, tablasolicitud.getValueAt(i,12).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(12, j, tablasolicitud.getValueAt(i,13).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(13, j, tablasolicitud.getValueAt(i,14).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(14, j, tablasolicitud.getValueAt(i,15).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                               
                 
                i++;
                j++;
            }
            
            w.write(); 
            //Cerramos el WritableWorkbook y DataOutputStream
            w.close();
            out.close();
 
 
            //si todo sale bien salimos de aqui con un true :D
            return true;
 
        }catch(IOException | WriteException ex){JOptionPane.showMessageDialog(null, "EL ARCHIVO ESTA ABIERTO. POR FAVOR CERRAR.");}
 
        //Si llegamos hasta aqui algo salio mal
        return false;
    
}
    
public Boolean excel_export_reporte() throws IOException, WriteException{
    
        int i=0;
        int j=0;
        WritableFont fuente_titulo = new WritableFont(WritableFont.ARIAL, 14, WritableFont.BOLD, true);
        WritableCellFormat celda_titulo = new WritableCellFormat(fuente_titulo); 
        WritableFont fuente_subtitulo = new WritableFont(WritableFont.ARIAL, 12, WritableFont.BOLD, true);
        WritableCellFormat celda_subtitulo = new WritableCellFormat(fuente_subtitulo); 
        WritableFont fuente_datos = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD, true);
        WritableCellFormat celda_datos = new WritableCellFormat(fuente_datos); 
        
        try{
        
            //Nuestro flujo de salida para apuntar a donde vamos a escribir
            DataOutputStream out=new DataOutputStream(new FileOutputStream(file));
 
            //Representa nuestro archivo en excel y necesita un OutputStream para saber donde va locoar los datos
            WritableWorkbook w = Workbook.createWorkbook(out);
                    
            WritableSheet s = w.createSheet(nombreTab, 0);

            j++;
            Label etiqueta_titulo = new Label(0, j, "NRO DE SOLICITUD", celda_titulo); 
            s.addCell(etiqueta_titulo);
                       
            Label etiqueta_subtitulo = new Label(1, j, "POS", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
            etiqueta_subtitulo = new Label(2, j, "NRO DE MATERIAL", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
            etiqueta_subtitulo = new Label(3, j, "MATERIAL SOLICITADO"); 
            s.addCell(etiqueta_subtitulo);
            
            etiqueta_subtitulo = new Label(4, j, "UMB", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(5, j, "FECHA REQUERIDA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(6, j, "GRUPO ARTÍCULO", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(7, j, "CANTIDAD SOLICITADA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(8, j, "PROYECTO", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(9, j, "EMPRESA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(10, j, "TIPO SOLICITUD", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(11, j, "FECHA SOLICITUD", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(12, j, "SOLICITUD APROBADA?", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(13, j, "FECHA APROBACIÓN", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
       
            etiqueta_subtitulo = new Label(14, j, "CANTIDAD APROBADA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(15, j, "SOLICITUD AUTORIZADA?", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
            etiqueta_subtitulo = new Label(16, j, "FECHA AUTORIZACIÓN", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
                    
             etiqueta_subtitulo = new Label(17, j, "CANTIDAD AUTORIZADA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
             etiqueta_subtitulo = new Label(18, j, "SOLICITUD CONFORMADA?", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
             etiqueta_subtitulo = new Label(19, j, "FECHA DE CONFORMACIÓN", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
             etiqueta_subtitulo = new Label(20, j, "CANTIDAD CONFORMADA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

             j++;
            
                       
            Label etiqueta_datos; 
            
            while(i < tablasolicitud.getRowCount()){
                 etiqueta_subtitulo = new Label(0, j, tablasolicitud.getValueAt(i,4).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(1, j, tablasolicitud.getValueAt(i,5).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(2, j, tablasolicitud.getValueAt(i,6).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(3, j, tablasolicitud.getValueAt(i,7).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(4, j, tablasolicitud.getValueAt(i,8).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(5, j, tablasolicitud.getValueAt(i,9).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(6, j, tablasolicitud.getValueAt(i,10).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(7, j, tablasolicitud.getValueAt(i,11).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(8, j, tablasolicitud.getValueAt(i,12).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(9, j, tablasolicitud.getValueAt(i,13).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(10, j, tablasolicitud.getValueAt(i,14).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(11, j, tablasolicitud.getValueAt(i,15).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 try{
                    tablasolicitud.setValueAt(tablasolicitud.getValueAt(i,16).toString().replace("true", "SI"),i,16);
                    tablasolicitud.setValueAt(tablasolicitud.getValueAt(i,16).toString().replace("false", "NO"),i,16);
                    etiqueta_subtitulo = new Label(12, j, tablasolicitud.getValueAt(i,16).toString(), celda_datos); 
                 }
                 catch(NullPointerException ex){
                    etiqueta_subtitulo = new Label(12, j, "", celda_datos);  
                 }
                 s.addCell(etiqueta_subtitulo);
                 try{
                    etiqueta_subtitulo = new Label(13, j, tablasolicitud.getValueAt(i,17).toString(), celda_datos); 
                 }
                 catch(NullPointerException ex){
                    etiqueta_subtitulo = new Label(13, j, "", celda_datos);  
                 }
                  s.addCell(etiqueta_subtitulo);
                 try{
                    etiqueta_subtitulo = new Label(14, j, tablasolicitud.getValueAt(i,18).toString(), celda_datos); 
                 }
                 catch(NullPointerException ex){
                    etiqueta_subtitulo = new Label(14, j, "", celda_datos);  
                 }
                  s.addCell(etiqueta_subtitulo);
                 try{
                    tablasolicitud.setValueAt(tablasolicitud.getValueAt(i,19).toString().replace("true", "SI"),i,19);
                    tablasolicitud.setValueAt(tablasolicitud.getValueAt(i,19).toString().replace("false", "NO"),i,19);
      
                    etiqueta_subtitulo = new Label(15, j, tablasolicitud.getValueAt(i,19).toString(), celda_datos); 
                 }
                 catch(NullPointerException ex){
                    etiqueta_subtitulo = new Label(15, j, "", celda_datos);  
                 }
                  s.addCell(etiqueta_subtitulo);
                 try{
                    etiqueta_subtitulo = new Label(16, j, tablasolicitud.getValueAt(i,20).toString(), celda_datos); 
                 }
                 catch(NullPointerException ex){
                    etiqueta_subtitulo = new Label(16, j, "", celda_datos);  
                 }
                 s.addCell(etiqueta_subtitulo);
                 try{
                    etiqueta_subtitulo = new Label(17, j, tablasolicitud.getValueAt(i,21).toString(), celda_datos); 
                 }
                 catch(NullPointerException ex){
                    etiqueta_subtitulo = new Label(17, j, "", celda_datos);  
                 }
                  s.addCell(etiqueta_subtitulo);
                 try{
                    tablasolicitud.setValueAt(tablasolicitud.getValueAt(i,22).toString().replace("true", "SI"),i,22);
                    tablasolicitud.setValueAt(tablasolicitud.getValueAt(i,22).toString().replace("false", "NO"),i,22);
      
                    etiqueta_subtitulo = new Label(18, j, tablasolicitud.getValueAt(i,22).toString(), celda_datos); 
                 }
                 catch(NullPointerException ex){
                    etiqueta_subtitulo = new Label(18, j, "", celda_datos);  
                 }
                  s.addCell(etiqueta_subtitulo);
                 try{
                    etiqueta_subtitulo = new Label(19, j, tablasolicitud.getValueAt(i,23).toString(), celda_datos); 
                 }
                 catch(NullPointerException ex){
                    etiqueta_subtitulo = new Label(19, j, "", celda_datos);  
                 }
                  s.addCell(etiqueta_subtitulo);
                 try{
                    etiqueta_subtitulo = new Label(20, j, tablasolicitud.getValueAt(i,24).toString(), celda_datos); 
                 }
                 catch(NullPointerException ex){
                    etiqueta_subtitulo = new Label(20, j, "", celda_datos);  
                 }
                 s.addCell(etiqueta_subtitulo);

                 
                 
                i++;
                j++;
            }
            
            w.write(); 
            //Cerramos el WritableWorkbook y DataOutputStream
            w.close();
            out.close();
 
 
            //si todo sale bien salimos de aqui con un true :D
            return true;
 
        }catch(IOException | WriteException ex){JOptionPane.showMessageDialog(null, "EL ARCHIVO ESTA ABIERTO. POR FAVOR CERRAR.");}
 
        //Si llegamos hasta aqui algo salio mal
        return false;
}


    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getNombreTab() {
        return nombreTab;
    }

    public void setNombreTab(String nombreTab) {
        this.nombreTab = nombreTab;
    }

    public JTable getTablaentrada() {
        return tablasolicitud;
    }

    public void setTablaentrada(JTable tablasolicitud) {
        this.tablasolicitud = tablasolicitud;
    }

 
    
    
}
