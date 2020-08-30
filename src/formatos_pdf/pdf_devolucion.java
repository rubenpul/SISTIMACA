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
public class pdf_devolucion extends PdfPageEventHelper {
    
    
  private static String sql;
  private static String sql2;
  private static String sql3;
  private static String sql4;
  private static String sql5;
  
  public static void dato(String ruta,Integer devolucion,String Modo) throws DocumentException, MalformedURLException, IOException, SQLException {
    Integer numero = (int) (Math.random() * 10000000) + 1;
    try {
         
        buscar_sql(1,devolucion);
        buscar_sql(2,devolucion);
        buscar_sql(3,devolucion);
        buscar_sql(4,devolucion);
        buscar_sql(5,devolucion);
        
              
        conexion cnn = new conexion(sql2,"buscar");  
        // 
           FileOutputStream archivo = new FileOutputStream(ruta +  "/doc_devolucion" + numero + ".pdf");  
           
           Document doc = new Document();
           PdfWriter writer = PdfWriter.getInstance(doc, archivo);
           
           
           // Protocolo de Página
             Rectangle rect = new Rectangle(50, 50, 1000, 1000);
             writer.setBoxSize("art", rect);
           
             pdf_devolucion event = new pdf_devolucion();
             writer.setPageEvent(event);
        
              doc.open();
              doc.addTitle("DEVOLUCIÓN DE MATERIALES" );
              
              
     
    
           
        // 
           
        PdfPTable item1 = new PdfPTable(2);
        PdfPCell info;      
      
        float[] medidaCeldas = {0.5f,0.9f};
        item1.setWidths(medidaCeldas);
        item1.setWidthPercentage(100);
        doc.add(new Phrase("\n"));
     
       if (cnn.estado){       
                
        cnn.rs.next();  
        
        
     
        // Texto Documento
        info = new PdfPCell(new Paragraph("PROVEEDOR: " + cnn.rs.getString(1),FontFactory.getFont("arial",8,BaseColor.BLACK) ));
        info.setHorizontalAlignment(Element.ALIGN_LEFT);
        info.setBorderWidthRight(0.0F);
        info.setBorderWidthBottom(0.0F);
        item1.addCell(info);
     
        info = new PdfPCell(new Paragraph("PERSONA CONTACTO: " + cnn.rs.getString(2),FontFactory.getFont("arial",8,BaseColor.BLACK) ));
        info.setHorizontalAlignment(Element.ALIGN_RIGHT);
        info.setBorderWidthLeft(0.0F);
        info.setBorderWidthBottom(0.0F);
        item1.addCell(info);  
        
        
        // documento origen
         info = new PdfPCell(new Paragraph("DOCUMENTO ENTRADA: " + cnn.rs.getString(3),FontFactory.getFont("arial",8,BaseColor.BLACK) ));
         info.setHorizontalAlignment(Element.ALIGN_LEFT);
         info.setBorderWidthTop(0.0F);
         info.setBorderWidthRight(0.0F);
         item1.addCell(info);
         
         // oc
         info = new PdfPCell(new Paragraph("ORDEN DE COMPRA: " + cnn.rs.getString(4),FontFactory.getFont("arial",8,BaseColor.BLACK) ));
         info.setHorizontalAlignment(Element.ALIGN_RIGHT);
         info.setBorderWidthTop(0.0F);
         info.setBorderWidthLeft(0.0F);
         item1.addCell(info);
         buscar_sql(5,Integer.parseInt(cnn.rs.getString(4)));
                  
     
     
         
        
        // Agregar Item 1 al Documento
         doc.add(item1);
         cnn.cerrar();
         
     }    
         
    // --------------------------------------------------------------------
    cnn = new conexion(sql,"buscar");  
     if (cnn.estado){       
                
        cnn.rs.next();  
        
            PdfPTable table = new PdfPTable(10); 
            
            float[] medidaCeldas1 = {0.3f,1.4f,0.6f,0.6f,0.6f,0.6f,0.6f,0.6f,0.6f,0.6f};
            table.setWidths(medidaCeldas1);
            table.setWidthPercentage(100);
            
                     
            
          
                info = new PdfPCell(new Phrase("NRO MATERIAL",FontFactory.getFont("arial",8,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                info = new PdfPCell(new Phrase("DESCRIPCIÓN",FontFactory.getFont("arial",8,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                info = new PdfPCell(new Phrase("CANTIDAD DEVUELTA",FontFactory.getFont("arial",8,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                info = new PdfPCell(new Phrase("UMB",FontFactory.getFont("arial",8,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                info = new PdfPCell(new Phrase("FECHA DEVOLUCIÓN",FontFactory.getFont("arial",8,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                info = new PdfPCell(new Phrase("MOTIVO",FontFactory.getFont("arial",8,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                info = new PdfPCell(new Phrase("FECHA ENTRADA",FontFactory.getFont("arial",8,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);

                info = new PdfPCell(new Phrase("PROYECTO",FontFactory.getFont("arial",8,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
                
                info = new PdfPCell(new Phrase("ALMACÉN",FontFactory.getFont("arial",8,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);

                info = new PdfPCell(new Phrase("UBICACIÓN",FontFactory.getFont("arial",8,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);                
            
                     
              cnn.rs.previous();
              while(cnn.rs.next()){   
                //codigo
                info = new PdfPCell(new Paragraph(cnn.rs.getInt(1) + "",FontFactory.getFont("arial",7,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                // descripcion
                info = new PdfPCell(new Paragraph(cnn.rs.getString(2) + "",FontFactory.getFont("arial",7,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
            
                // cantidad devuelta
                info = new PdfPCell(new Paragraph(cnn.rs.getDouble(3) + "",FontFactory.getFont("arial",7,BaseColor.GRAY)));
                info.setBorder(0);
                table.addCell(info);
            
                // umb
                info = new PdfPCell(new Paragraph(cnn.rs.getString(4) + "",FontFactory.getFont("arial",7,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
                
                 //  Fecha devolucion
                info = new PdfPCell(new Paragraph(cnn.rs.getString(5) + "",FontFactory.getFont("arial",7,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
                
         
                //  motivo
                info = new PdfPCell(new Paragraph(cnn.rs.getString(6) + "",FontFactory.getFont("arial",7,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                //  fecha entrada
                info = new PdfPCell(new Paragraph(cnn.rs.getString(7) + "",FontFactory.getFont("arial",7,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
                
               //  proyecto
                info = new PdfPCell(new Paragraph(cnn.rs.getString(8) + "",FontFactory.getFont("arial",7,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
                
               //  almacen
                info = new PdfPCell(new Paragraph(cnn.rs.getString(9) + "",FontFactory.getFont("arial",7,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
                
               //  ubicacion
                info = new PdfPCell(new Paragraph(cnn.rs.getString(10) + "",FontFactory.getFont("arial",7,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            }
            //  Fin de Ciclo 
           //
           cnn.cerrar();
           doc.add(table);
          
     }    
 

       try {
        
      item1 = new PdfPTable(2);
            
      
        float[] medidaCeldas1 = {0.6f,1.0f};
      
          item1.setWidths(medidaCeldas1);
      
        item1.setWidthPercentage(100);
        
        
        
       cnn = new conexion(sql3,"buscar");  
        
         if (cnn.estado){
       
           
            cnn.rs.next();
       
     
       
        // Texto General
        info = new PdfPCell(new Paragraph("Autorizado Por(Unidad Almacen):\n Fecha: ___/ ___/ ____ \n ",FontFactory.getFont("arial",8,BaseColor.GRAY)));
        item1.addCell(info);      
       
        info = new PdfPCell(new Paragraph("Recibido Conforme Por:\n Fecha: ___/ ___/ ____ \n ",FontFactory.getFont("arial",8,BaseColor.GRAY)));
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
         doc.add(item1);
         
         } 
        
        } catch (DocumentException ex) {
          System.out.println("--> " + ex);
      } catch (SQLException ex) {
          Logger.getLogger(pdf_devolucion.class.getName()).log(Level.SEVERE, null, ex);
      }     
     
     
        doc.close();
           
           File archivo_abrir = new File(ruta + "/doc_devolucion" + numero + ".pdf");
                 Desktop.getDesktop().open(archivo_abrir);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "ERROR ABRIR ARCHIVO" + e.getMessage());
         
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
      
      conexion cnn = new conexion(sql5,"buscar");  
      
      if (cnn.estado){
       
            
          cnn.rs.next();
      // Agregar Imagen
         Image img = Image.getInstance("\\\\192.168.0.3\\dist\\imagenes\\" + cnn.rs.getString(1) + ".png"); 
         img.scaleAbsolute(50, 50);
         img.setAlignment(Element.ALIGN_LEFT);
         table.addCell(img);
         
        // Texto Titulo
        info = new PdfPCell(new Paragraph("\n                       DEVOLUCIÓN DE MATERIALES"));
        info.setHorizontalAlignment(Element.ALIGN_CENTER);
        info.setBorder(PdfPCell.NO_BORDER);
        table.addCell(info);
        
        cnn.cerrar();
         cnn = new conexion(sql4,"buscar");  
      
        if (cnn.estado){
       
            
           cnn.rs.next();

       
        info = new PdfPCell(new Paragraph(" Fecha de Devolución: " + cnn.rs.getString(1) + " \n  Fecha de Impresión: " + funciones.getfechacalendario(),FontFactory.getFont("arial",8,BaseColor.GRAY)));
        cnn.cerrar();
          
        }
        info.setColspan(3);
        info.setBorder(PdfPCell.NO_BORDER);
        info.setHorizontalAlignment(Element.ALIGN_RIGHT);
        table.addCell(info);
        
        }
        // Agregar Tabla a documento desde cabecera
        document.add(table);
               
    } catch (Exception e) {}
        
  }
  
    
    
    
  
 
    
    public static void buscar_sql(Integer consulta,Integer devolucion){
        
        switch(consulta){
            
            case 1: sql = "SELECT numero_material,descripcionmaterial,cantidad_devuelta,codigo_umb,fecha_devuelta,CONCAT(descripcionmotivo,' ',otromotivo) as motivo,fecha_entrada,descripcionproyecto,descripcionalmacen,descripcionubicacion FROM vw_devolucion WHERE nro_documentodevolucion = " + devolucion + " ORDER BY id_devolucion;";
                   System.out.println(sql);
                     break;
                    
            case 2: sql2 = "SELECT DISTINCT CONCAT(rif,'-',nombre) as proveedor,CONCAT(personacontacto,'-',telefono1) as contacto,nro_documentoentrada,orden_compra FROM vw_devolucion ";
                    sql2 += " WHERE nro_documentodevolucion = " + devolucion + ";";
                   System.out.println(sql2);
                     break; 
                    
             case 3: sql3 = "SELECT DISTINCT fk_usuario,nombres FROM vw_devolucion ";
                    sql3 += " WHERE nro_documentodevolucion = " + devolucion + ";";
                    System.out.println(sql3);
                     break;   
             
             case 4: sql4 = "SELECT fecha_devuelta FROM vw_devolucion WHERE nro_documentodevolucion = " + devolucion + ";";
                    System.out.println(sql4);
                     break;
                    
             case 5: sql5 = "SELECT DISTINCT c.descripcionempresa FROM sistimaca.tbl_entrada a , tbl_cotizacion b ,vw_solicitud_detalle c ";
                     sql5 += "WHERE a.orden_compra = " + devolucion + " AND b.nro_ordencompra = " + devolucion + " AND  b.fk_solicitud =  c.fk_solicitud AND a.status = TRUE;";       
                     System.out.println(sql5);
                     break;
        }
        
    }
    
    
}
  
      





