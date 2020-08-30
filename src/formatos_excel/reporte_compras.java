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
public class reporte_compras {
    
    private File file;
    private String nombreTab;
    private JTable tablaentrada;
    private JTable tablasalida;

    public reporte_compras(File file, String nombreTab, JTable tablaentrada, JTable tablasalida) {
        this.file = file;
        this.nombreTab = nombreTab;
        this.tablaentrada = tablaentrada;
        this.tablasalida = tablasalida;
    }

    public reporte_compras(File file, String nombreTab, JTable tablaentrada) {
        this.file = file;
        this.nombreTab = nombreTab;
        this.tablaentrada = tablaentrada;
        
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
            Label etiqueta_titulo = new Label(0, j, "NÚMERO DE MATERIAL", celda_titulo); 
            s.addCell(etiqueta_titulo);
                       
            Label etiqueta_subtitulo = new Label(1, j, "CÓDIGO MAESTRO", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
            etiqueta_subtitulo = new Label(2, j, "DESCRIPCIÓN MATERIAL", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
            etiqueta_subtitulo = new Label(3, j, "MARCA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
            
            etiqueta_subtitulo = new Label(4, j, "MODELO", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(5, j, "UMB", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(6, j, "CLASE DE ARTÍCULO", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(7, j, "GRUPO DE ARTÍCULO", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(8, j, "ALMACÉN", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(9, j, "UBICACIÓN", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(10, j, "PROCEDENCIA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(11, j, "PROYECTO", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(12, j, "CANTIDAD", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(13, j, "PRECIO UNITARIO", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);
       
            etiqueta_subtitulo = new Label(14, j, "MONEDA", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

            etiqueta_subtitulo = new Label(15, j, "VALORACIÓN", celda_subtitulo); 
            s.addCell(etiqueta_subtitulo);

             j++;
            
                       
            Label etiqueta_datos; 
            
            while(i < tablaentrada.getRowCount()){
                 etiqueta_subtitulo = new Label(0, j, tablaentrada.getValueAt(i,0).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(1, j, tablaentrada.getValueAt(i,1).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(2, j, tablaentrada.getValueAt(i,2).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(3, j, tablaentrada.getValueAt(i,3).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(4, j, tablaentrada.getValueAt(i,4).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(5, j, tablaentrada.getValueAt(i,5).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(6, j, tablaentrada.getValueAt(i,6).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(7, j, tablaentrada.getValueAt(i,7).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(8, j, tablaentrada.getValueAt(i,8).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(9, j, tablaentrada.getValueAt(i,9).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(10, j, tablaentrada.getValueAt(i,10).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(11, j, tablaentrada.getValueAt(i,11).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(12, j, tablaentrada.getValueAt(i,12).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(13, j, tablaentrada.getValueAt(i,13).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(14, j, tablaentrada.getValueAt(i,14).toString(), celda_datos); 
                 s.addCell(etiqueta_subtitulo);
                 etiqueta_subtitulo = new Label(15, j, tablaentrada.getValueAt(i,15).toString(), celda_datos); 
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
        return tablaentrada;
    }

    public void setTablaentrada(JTable tablaentrada) {
        this.tablaentrada = tablaentrada;
    }

    public JTable getTablasalida() {
        return tablasalida;
    }

    public void setTablasalida(JTable tablasalida) {
        this.tablasalida = tablasalida;
    }
    
    
    
}
