/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formatos_pdf;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.JOptionPane;
import controlador.conexion;
import java.awt.Desktop;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.funciones;
/**
 *
 * @author ROBERT
 */
public class pdf_cotizacion extends PdfPageEventHelper {
    
    
  private static String sql;
  private static String sql2;
  private static String sql3;
  
  public static void dato(String ruta,Integer cotizacion,String Modo) throws DocumentException, MalformedURLException, IOException, SQLException {
    try {
         
        buscar_sql(1,cotizacion);
        buscar_sql(2,cotizacion);
        buscar_sql(3,cotizacion);
        
        conexion cnn = new conexion(sql,"buscar");  
        // 
           FileOutputStream archivo = new FileOutputStream(ruta + "/doc_cotizacion.pdf");  
           
           Document doc = new Document();
           PdfWriter writer = PdfWriter.getInstance(doc, archivo);
           
           
           // Protocolo de Página
             Rectangle rect = new Rectangle(50, 50, 1000, 1000);
             writer.setBoxSize("art", rect);
           
             pdf_cotizacion event = new pdf_cotizacion();
             writer.setPageEvent(event);
        
              doc.open();
              doc.addTitle("COTIZACION DE MATERIALES" );
              
              
     
    
           
        // 
           
        PdfPTable item1 = new PdfPTable(2);
        PdfPCell info;      
      
        float[] medidaCeldas = {0.5f,0.9f};
        item1.setWidths(medidaCeldas);
        item1.setWidthPercentage(100);
        doc.add(new Phrase("\n"));
     
       if (cnn.estado){       
                
        cnn.rs.next();  
        
        
        // Texto Departamento
            info = new PdfPCell(new Paragraph("PROVEEDOR: " + cnn.rs.getString(13)));
       
        info.setBorderWidthBottom(0.0F);
        info.setBorderWidthRight(0.0F);
        item1.addCell(info);
           
        
        // Texto Documento
        info = new PdfPCell(new Paragraph("RIF: " + cnn.rs.getString(12) ));
        info.setHorizontalAlignment(Element.ALIGN_RIGHT);
        info.setBorderWidthBottom(0.0F);
        info.setBorderWidthLeft(0.0F);
        item1.addCell(info);
         
         // Texto Documento
        info = new PdfPCell(new Paragraph("TELEFONO: " + cnn.rs.getString(14) ));
        info.setHorizontalAlignment(Element.ALIGN_RIGHT);
        info.setBorderWidthBottom(0.0F);
        info.setBorderWidthLeft(0.0F);
        item1.addCell(info);       
        
         // Texto Documento
        info = new PdfPCell(new Paragraph("NRO COTIZACION: CT-" + cotizacion ));
        info.setHorizontalAlignment(Element.ALIGN_RIGHT);
        info.setBorderWidthBottom(0.0F);
        info.setBorderWidthLeft(0.0F);
        item1.addCell(info);     
        
        // Agregar Item 1 al Documento
         doc.add(item1);
         doc.add(new Phrase("\n"));
         
         
         
    // --------------------------------------------------------------------
         
            PdfPTable table = new PdfPTable(7); 
            
            float[] medidaCeldas1 = {0.3f,0.5f,1.4f,0.6f,0.4f,0.4f,0.6f};
            table.setWidths(medidaCeldas1);
            table.setWidthPercentage(100);
            
                     
           
          
                info = new PdfPCell(new Phrase("POS",FontFactory.getFont("arial",9,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                info = new PdfPCell(new Phrase("CÓDIGO",FontFactory.getFont("arial",9,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                info = new PdfPCell(new Phrase("DESCRIPCIÓN",FontFactory.getFont("arial",9,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
           
                info = new PdfPCell(new Phrase("CANT. COTIZAR",FontFactory.getFont("arial",9,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                info = new PdfPCell(new Phrase("UMB",FontFactory.getFont("arial",9,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                info = new PdfPCell(new Phrase("PRECIO UNITARIO(" + cnn.rs.getString(15) + ")" ,FontFactory.getFont("arial",9,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                info = new PdfPCell(new Phrase("TOTAL(" + cnn.rs.getString(15) + ")",FontFactory.getFont("arial",9,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
           
            
            
            
            
           
              cnn.rs.previous();
              while(cnn.rs.next()){   
                
                info = new PdfPCell(new Paragraph(cnn.rs.getInt(1) + "",FontFactory.getFont("arial",10,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                // Código
                info = new PdfPCell(new Paragraph(cnn.rs.getInt(2) + "",FontFactory.getFont("arial",10,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
            
                // Descripción
                info = new PdfPCell(new Paragraph(cnn.rs.getString(3) + "",FontFactory.getFont("arial",10,BaseColor.GRAY)));
                info.setBorder(0);
                table.addCell(info);
            
                               
                 //  CANTIDAD
                info = new PdfPCell(new Paragraph(cnn.rs.getInt(4) + "",FontFactory.getFont("arial",10,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
                
                //  UMB
                info = new PdfPCell(new Paragraph(cnn.rs.getString(5) + "",FontFactory.getFont("arial",10,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                //  ALMACEN
                info = new PdfPCell(new Paragraph(cnn.rs.getDouble(6) + "",FontFactory.getFont("arial",10,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                //  UBICACIÓN
                info = new PdfPCell(new Paragraph(cnn.rs.getDouble(7) + "",FontFactory.getFont("arial",10,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            }
            //  Fin de Ciclo 
           //
           cnn.cerrar();
           doc.add(table);
           doc.close();
        } 
          
           //JOptionPane.showMessageDialog(null,"PDF Creado Exitosamente","Exito!", JOptionPane.INFORMATION_MESSAGE);
           
           File archivo_abrir = new File(ruta + "/doc_cotizacion.pdf");
                 Desktop.getDesktop().open(archivo_abrir);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "ERROR ABRIR ARCHIVO");
         
            }
        
    
    
   
  }
  
  
  
 
  // ----------------------------------------------------------------------
 // ENCABEZADO
  public void onStartPage(PdfWriter writer,Document document) {
     try {
    
     // Añadir Tabla de Organización
      PdfPTable table = new PdfPTable(3); 
      PdfPCell info;      
      
      float[] medidaCeldas = {0.2f,0.8f,0.35f};
      table.setWidths(medidaCeldas);
      table.setWidthPercentage(100);
      table.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
      
      conexion cnn = new conexion(sql2,"buscar");  
      
      // Agregar Imagen
         Image img = Image.getInstance("imagenes/TIMACA.jpg"); 
         img.scaleAbsolute(10, 10);
         img.setAlignment(Element.ALIGN_LEFT);
         table.addCell(img);
      
        // Texto Titulo
        info = new PdfPCell(new Paragraph("\n                       COTIZACION DE MATERIALES"));
        info.setHorizontalAlignment(Element.ALIGN_CENTER);
        info.setBorder(PdfPCell.NO_BORDER);
        table.addCell(info);
        
        if (cnn.estado){
       
            // Agregar Fechas
            cnn.rs.next();
            info = new PdfPCell(new Paragraph(" Fecha de Cotizacion: " + cnn.rs.getString(1) + " \n  Fecha de Impresión: " + funciones.getfechacalendario(),FontFactory.getFont("arial",8,BaseColor.GRAY)));
            cnn.cerrar();
        }
        info.setColspan(3);
        info.setBorder(PdfPCell.NO_BORDER);
        info.setHorizontalAlignment(Element.ALIGN_RIGHT);
        table.addCell(info);

        // Agregar Tabla a documento desde cabecera
        document.add(table);
               
    } catch (Exception e) {}
        
  }
  
    
    
    
  
    // ----------------------------------------------------------------------
    // PIE DE PÁGINA 
    public void onEndPage(PdfWriter writer,Document document) {
    	
    // ---------------------------------------------------------------------
        // Agregar Contenido
        
        try {
        
      PdfPTable item1 = new PdfPTable(2);
            
      
        float[] medidaCeldas1 = {0.6f,1.0f};
      
          item1.setWidths(medidaCeldas1);
      
        item1.setWidthPercentage(100);
        PdfPCell info;  
        
        
       conexion cnn = new conexion(sql3,"buscar");  
        
         if (cnn.estado){
       
           
            cnn.rs.next();
       
       
        // Texto General
        info = new PdfPCell(new Paragraph("Autorizado Por:  \n\n Fecha: ___/ ___/ ____ \n ",FontFactory.getFont("arial",11,BaseColor.GRAY)));
        item1.addCell(info);
        
        
       
        info = new PdfPCell(new Paragraph("Recibido Conforme Por: \n\n Fecha: ___/ ___/ ____ \n ",FontFactory.getFont("arial",11,BaseColor.GRAY)));
        info.setHorizontalAlignment(Element.ALIGN_LEFT);
        info.setBorderWidthLeft(0.0F);
        item1.addCell(info);
         
        // User
         info = new PdfPCell(new Phrase("USUARIO: " + cnn.rs.getString(2) + "" ,FontFactory.getFont("arial",6,BaseColor.GRAY)));
         info.setColspan(2);
         info.setBorder(0);
         info.setHorizontalAlignment(Element.ALIGN_RIGHT);
         item1.addCell(info);
        
        // HORA
         info = new PdfPCell(new Phrase("HORA: " + funciones.gethoracalendario(),FontFactory.getFont("arial",6,BaseColor.GRAY)));
         info.setColspan(2);
         info.setBorder(0);
          info.setHorizontalAlignment(Element.ALIGN_RIGHT);
         item1.addCell(info);
         
         //document.add(new Phrase("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"));
         cnn.cerrar();
         document.add(item1);
         
         } 
        
        } catch (DocumentException ex) {
          System.out.println("--> " + ex);
      } catch (SQLException ex) {
          Logger.getLogger(pdf_cotizacion.class.getName()).log(Level.SEVERE, null, ex);
      }
   
    }  
    
    public static void buscar_sql(Integer consulta,Integer cotizacion){
        
        switch(consulta){
            
            case 1: sql = "SELECT posicion,numero_material,descripcionmat,cantidad_cotizar,codigo_umb,preciounitario,preciototal,fecha_cotizar,fk_usuario,usuario,fk_proveedor,rif,nombre,telefono,codigo_moneda FROM vw_cotizacion WHERE id_cotizacion = " + cotizacion + " ORDER BY id_cotizacion,posicion;";

                    break;
                    
            case 2: sql2 = "SELECT DISTINCT fecha_cotizar FROM vw_cotizacion ";
                    sql2 += " WHERE id_cotizacion = " + cotizacion + ";";
                    break;  
                    
             case 3: sql3 = "SELECT DISTINCT fk_usuario,usuario FROM vw_cotizacion ";
                    sql3 += " WHERE id_cotizacion = " + cotizacion + ";";
                    break;          
            
        }
        System.out.println(sql);
    }
    
    
}
  
      





