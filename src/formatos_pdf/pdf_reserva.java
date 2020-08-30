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
public class pdf_reserva extends PdfPageEventHelper {
    
    
  private static String sql;
  private static String sql2;
  private static String sql3;
  
  public static void dato(String ruta,Integer reserva,String Modo) throws DocumentException, MalformedURLException, IOException, SQLException {
     Integer numero = (int) (Math.random() * 10000000) + 1;
    try {
         
        buscar_sql(1,reserva);
        buscar_sql(2,reserva);
        buscar_sql(3,reserva);
        
        conexion cnn = new conexion(sql,"buscar");  
        // 
           FileOutputStream archivo = new FileOutputStream(ruta + "/doc_reserva" + numero + ".pdf");  
           
           Document doc = new Document();
           PdfWriter writer = PdfWriter.getInstance(doc, archivo);
           
           
           // Protocolo de Página
             Rectangle rect = new Rectangle(50, 50, 1000, 1000);
             writer.setBoxSize("art", rect);
           
             pdf_reserva event = new pdf_reserva();
             writer.setPageEvent(event);
        
              doc.open();
              doc.addTitle("SOLICITUD DE RESERVA DE MATERIALES" );
              
              
     
    
           
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
            info = new PdfPCell(new Paragraph("USUARIO: " + cnn.rs.getString(8)));
       
        info.setBorderWidthBottom(0.0F);
        info.setBorderWidthRight(0.0F);
        item1.addCell(info);
           
        
        // Texto Documento
        info = new PdfPCell(new Paragraph("Solicitante: " + cnn.rs.getString(9) ));
        info.setHorizontalAlignment(Element.ALIGN_RIGHT);
        info.setBorderWidthBottom(0.0F);
        info.setBorderWidthLeft(0.0F);
        item1.addCell(info);
         
        // Area
         info = new PdfPCell(new Paragraph("Area: " + cnn.rs.getString(10)));
         info.setBorderWidthTop(0.0F);
         info.setBorderWidthRight(0.0F);
         info.setColspan(1);
         item1.addCell(info);
       
                  
     
        info = new PdfPCell(new Paragraph("Nro de Reserva: " + reserva ));
        info.setHorizontalAlignment(Element.ALIGN_RIGHT);
        info.setBorderWidthTop(0.0F);
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
            
                info = new PdfPCell(new Phrase("PROYECTO",FontFactory.getFont("arial",9,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                info = new PdfPCell(new Phrase("CANT.",FontFactory.getFont("arial",9,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                info = new PdfPCell(new Phrase("UMB",FontFactory.getFont("arial",9,BaseColor.BLACK)));
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                info = new PdfPCell(new Phrase("FECHA REQUERIDA",FontFactory.getFont("arial",9,BaseColor.BLACK)));
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
            
                // Fecha Requerida
                info = new PdfPCell(new Paragraph(cnn.rs.getString(4) + "",FontFactory.getFont("arial",10,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
                
                 //  CANTIDAD
                info = new PdfPCell(new Paragraph(cnn.rs.getInt(5) + "",FontFactory.getFont("arial",10,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
                
                //  UMB
                info = new PdfPCell(new Paragraph(cnn.rs.getString(6) + "",FontFactory.getFont("arial",10,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
                //  ALMACEN
                info = new PdfPCell(new Paragraph(cnn.rs.getString(7) + "",FontFactory.getFont("arial",10,BaseColor.GRAY)));
                info.setBorder(0);
                info.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(info);
            
               
            }
            //  Fin de Ciclo 
           //
           cnn.cerrar();
           doc.add(table);
           
         try {
        
        item1 = new PdfPTable(2);
            
      
        float[] medidaCeldas2 = {0.6f,1.0f};
      
          item1.setWidths(medidaCeldas2);
      
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
              Logger.getLogger(pdf_reserva.class.getName()).log(Level.SEVERE, null, ex);
          }          
          
           doc.close();
        } 
          
           //JOptionPane.showMessageDialog(null,"PDF Creado Exitosamente","Exito!", JOptionPane.INFORMATION_MESSAGE);
           
           File archivo_abrir = new File(ruta + "/doc_reserva" + numero + ".pdf");
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
      PdfPCell info ;      
      
      float[] medidaCeldas = {0.2f,0.8f,0.35f};
      table.setWidths(medidaCeldas);
      table.setWidthPercentage(100);
      table.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
      
      conexion cnn = new conexion(sql2,"buscar");  
      
      if (cnn.estado){
       
         cnn.rs.next();
      // Agregar Imagen
         Image img = Image.getInstance("\\\\192.168.0.3\\dist\\imagenes\\" + cnn.rs.getString(2) + ".png"); 
         img.scaleAbsolute(10, 10);
         img.setAlignment(Element.ALIGN_LEFT);
         table.addCell(img);
      
        // Texto Titulo
        info = new PdfPCell(new Paragraph("\n                       SOLICITUD DE RESERVA DE MATERIAL"));
        info.setHorizontalAlignment(Element.ALIGN_CENTER);
        info.setBorder(PdfPCell.NO_BORDER);
        table.addCell(info);
        
        
            info = new PdfPCell(new Paragraph(" Fecha de Entrada: " + cnn.rs.getString(1) + " \n  Fecha de Impresión: " + funciones.getfechacalendario(),FontFactory.getFont("arial",8,BaseColor.GRAY)));
            cnn.cerrar();
            
             info.setColspan(3);
            info.setBorder(PdfPCell.NO_BORDER);
            info.setHorizontalAlignment(Element.ALIGN_RIGHT);
            table.addCell(info);
        }
       

        // Agregar Tabla a documento desde cabecera
        document.add(table);
               
    } catch (Exception e) {}
        
  }
      
    public static void buscar_sql(Integer consulta,Integer reserva){
        
        switch(consulta){
            
            case 1: sql = "SELECT posicion,numero_material,descripcionmat,codigoproyecto,cantidad_solicitada,unidad_medida,fecha_requerida,usuario,nombres,descripcionarea  FROM vw_reserva_detalle WHERE fk_reserva = " + reserva + " ORDER BY fk_reserva,posicion;";

                    break;
                    
            case 2: sql2 = "SELECT DISTINCT fecha_reserva,descripcionempresa FROM vw_reserva_detalle ";
                    sql2 += " WHERE fk_reserva = " + reserva + ";";
                    System.out.println(sql2);
                    break;  
                    
             case 3: sql3 = "SELECT DISTINCT fk_usuario,usuario FROM vw_reserva_detalle ";
                    sql3 += " WHERE fk_reserva = " + reserva + ";";
                    break;          
            
        }
        
    }
    
    
}
  
      





