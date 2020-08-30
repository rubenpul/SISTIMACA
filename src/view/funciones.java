/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.toedter.calendar.JDateChooser;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Base64;
import java.util.Calendar;
import javax.imageio.ImageIO;


/**
 *
 * @author ruben
 */
public class funciones {
    
    public static String separadormilesflotante(String numero,Boolean convertir){
        
        Integer length;
        numero = numero.replace(".", "");
       
        Integer i;
        String flotante = "";
        
        if(numero.contains(",")){
            String [] arr = numero.split(",");
            numero = arr[0];
            length = numero.trim().length();
            
            if (arr.length > 1){
                flotante = "," + arr[1];
            }
            else{
                flotante = ",";
            }
        }    
        else{
            length = numero.trim().length();
        }    
        
        if (convertir){
            if (length>=4){
                switch (length){
                    
                    case 4: //1.000
                         numero = numero.substring(0, 1) + "." + numero.substring(1) + flotante;
                        break;
                    case 5: //10.000
                        numero =  numero.substring(0, 2) + "." + numero.substring(2) + flotante;
                        break;
                    case 6: //100.000
                        numero =  numero.substring(0, 3) + "." + numero.substring(3) + flotante;
                        break;  
                    case 7: //1.000.000
                        numero =  numero.substring(0, 1) + "." + numero.substring(1,4) + "." + numero.substring(4,7) + flotante;
                        break;      
                    case 8: //10.000.000
                        numero =  numero.substring(0, 2) + "." + numero.substring(2,5) + "." + numero.substring(5,8) + flotante;
                        break;  
                    case 9: //100.000.000
                        numero =  numero.substring(0, 3) + "." + numero.substring(3,6) + "." + numero.substring(6,9) + flotante;
                        break;  
                    case 10: //1.000.000.000
                        numero =  numero.substring(0, 1) + "." + numero.substring(1,4) + "." + numero.substring(4,7) + "." + numero.substring(7,10) + flotante;
                        break; 
                    case 11: //10.000.000.000
                        numero =  numero.substring(0, 2) + "." + numero.substring(2,5) + "." + numero.substring(5,8) + "." + numero.substring(8,11) + flotante;
                        break; 
                    case 12: //100.000.000.000
                        numero =  numero.substring(0, 3) + "." + numero.substring(3,6) + "." + numero.substring(6,9) + "." + numero.substring(9,12) + flotante;
                        break;
                    case 13: //1.000.000.000.000
                        numero =  numero.substring(0, 1) + "." + numero.substring(1,4) + "." + numero.substring(4,7) + "." + numero.substring(7,10) + "." + numero.substring(10,13) + flotante;
                        break;
                    case 14: //10.000.000.000.000
                        numero =  numero.substring(0, 2) + "." + numero.substring(2,5) + "." + numero.substring(5,8) + "." + numero.substring(8,11) + "." + numero.substring(11,14) + flotante;
                        break;  
                    case 15: //100.000.000.000.000
                        numero =  numero.substring(0, 3) + "." + numero.substring(3,6) + "." + numero.substring(6,9) + "." + numero.substring(9,12) + "." + numero.substring(12,15) + flotante;
                        break;  
                    case 16: //1.000.000.000.000.000
                        numero =  numero.substring(0, 1) + "." + numero.substring(1,4) + "." + numero.substring(4,7) + "." + numero.substring(7,10) + "." + numero.substring(10,13) + "." + numero.substring(13,16) + flotante;
                        break;  
                    case 17: //10.000.000.000.000.000
                        numero = numero.substring(0, 2) + "." + numero.substring(2,5) + "." + numero.substring(5,8) + "." + numero.substring(8,11) + "." + numero.substring(11,14) + "." + numero.substring(14,17) + flotante;
                        break;
                    case 18: //100.000.000.000.000.000
                        numero = numero.substring(0, 3) + "." + numero.substring(3,6) + "." + numero.substring(6,9) + "." + numero.substring(9,12) + "." + numero.substring(12,15) + "." + numero.substring(15,18) + flotante;
                        break;
                    case 19: //1.000.000.000.000.000.000
                        numero =  numero.substring(0, 1) + "." + numero.substring(1,4) + "." + numero.substring(4,7) + "." + numero.substring(7,10) + "." + numero.substring(10,13) + "." + numero.substring(13,16) + "." + numero.substring(16,19) + flotante;
                        break; 
                    case 20: //10.000.000.000.000.000.000
                        numero =  numero.substring(0, 2) + "." + numero.substring(2,5) + "." + numero.substring(5,8) + "." + numero.substring(8,11) + "." + numero.substring(11,14) + "." + numero.substring(14,17) + "." + numero.substring(17,20) + flotante;
                        break;     
                }
            }
            else{
                numero += flotante;
            }
               
        }
        else{
          if(!flotante.equals(",") && !flotante.equals("")){  
            numero += flotante;
            numero = numero.replace(".", "");
            numero = numero.replace(",", ".");
          }
          else{
            numero = numero.replace(".", "");  
          }
        }
        
        return numero;
    }
    
        
    public static String logoempresa(){
        String direccion;
        
        direccion = "\\\\192.168.0.3\\dist\\imagenes\\TIMACA.jpg";
        //direccion = "c:\\users\\ruben\\Desktop\\TIMACA.jpg";
        
        return direccion;
    }
    
    public static String separadordemiles(String numero,boolean convertir){
        DecimalFormatSymbols simbolo  = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator(',');
        DecimalFormat formato = new DecimalFormat("###,###.##",simbolo); 
        Integer tmp;
       
        
        if ( (convertir) && (!numero.equals("")) ){
            tmp = Integer.parseInt(numero);
            
            numero = String.valueOf(formato.format(tmp));
        }
        
        return numero;
            
   }
    
       
    public static String gethoracalendario(){
        Integer hora;
        Integer minuto;
        Integer am_pm;
        Calendar cal = Calendar.getInstance();
        String cadena= "";
        
            hora = cal.get(Calendar.HOUR);
            minuto = cal.get(Calendar.MINUTE);
            
            am_pm = cal.get(Calendar.AM_PM);
            
            if ( (hora > 9) &&(minuto < 10) ) {
                cadena = String.valueOf(hora) + ":0" + String.valueOf(minuto);
            }    
            else{
                if ( (hora < 10) &&(minuto > 9) ) {
                    cadena = "0" + String.valueOf(hora) + ":" + String.valueOf(minuto);                        
                }
                else{
                    if ((hora < 10) &&(minuto < 10)){
                        cadena = "0" + String.valueOf(hora) + ":0" + String.valueOf(minuto);
                    }    
                    else{
                        cadena = String.valueOf(hora) + ":" + String.valueOf(minuto);
                    }
                }
            }
        
            if (!am_pm.equals(0)){
                cadena = cadena + " PM" ;
            }
            else{
                cadena = cadena + " AM" ;
            }
    
        return cadena;    
    
    }
    
    
    public static String getfechacalendario(){
        Integer dia;
        Integer mes;
        Integer ano;
        Calendar cal = Calendar.getInstance();
        String cadena= "";
        
            dia = cal.get(Calendar.DATE);
            mes = cal.get(Calendar.MONTH)+1;
            ano = cal.get(Calendar.YEAR);
            
            if ((dia < 10) && (mes > 9)) {
                cadena = "0" + String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano);
            }
            else{
                if ((dia > 9) && (mes < 10)) {
                    cadena = String.valueOf(dia) + "/0" + String.valueOf(mes) + "/" + String.valueOf(ano);
                }
                else{
                    if ((dia < 10) && (mes < 10)) {
                        cadena = "0" + String.valueOf(dia) + "/0" + String.valueOf(mes) + "/" + String.valueOf(ano);
                    }
                    else{
                        cadena = String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano);
                    }
                }
            }
        
        return cadena;
    }
    
    
    public static String fecha_convertir_date(JDateChooser fecha_convertir,Integer modo){
        Calendar cal = Calendar.getInstance();
        String fecha="";
        Integer ano;
        Integer mes;
        Integer dia;
        
           try{ 
                cal.setTime(fecha_convertir.getDate());
                ano = cal.get(Calendar.YEAR);
                mes = cal.get(Calendar.MONDAY)+ 1;
                dia = cal.get(Calendar.DAY_OF_MONTH);
                
                if (modo.equals(1)){
                    if ((dia < 10) && (mes > 9)) {
                        fecha =  String.valueOf(ano) + "-" + String.valueOf(mes) + "-0" + String.valueOf(dia);
                    }
                    else{
                        if ((dia > 9) && (mes < 10)) {
                            fecha = String.valueOf(ano) + "-0" + String.valueOf(mes) + "-" + String.valueOf(dia);
                        }
                        else{
                            if ((dia < 10) && (mes < 10)) {
                                fecha = String.valueOf(ano) + "-0" + String.valueOf(mes) + "-0" + String.valueOf(dia);
                            }
                            else{
                                fecha = String.valueOf(ano) + "-" + String.valueOf(mes) + "-" + String.valueOf(dia);
                            }
                        }
                    }
                }
                else{
                    if ((dia < 10) && (mes > 9)) {
                        fecha = "0" + String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano);
                    }
                    else{
                        if ((dia > 9) && (mes < 10)) {
                            fecha = String.valueOf(dia) + "/0" + String.valueOf(mes) + "/" + String.valueOf(ano);
                        }
                        else{
                            if ((dia < 10) && (mes < 10)) {
                                fecha = "0" + String.valueOf(dia) + "/0" + String.valueOf(mes) + "/" + String.valueOf(ano);
                            }
                            else{
                                fecha = String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano);
                            }
                        }
                    }
                }
                
           }
           catch(NullPointerException ex){
               fecha = "";
           }
    
           return fecha;
    }
    
    
    public static String fecha_bd_usuario(String fecha_trans,Integer modo_fecha){  
          
          String ano;
          String mes;
          String dia;
          
          String fecha="1900-01-01";
          
          try{ 
          
          switch (modo_fecha){
                case 1: if (!fecha_trans.equals("")){ //MODO PARA VISUALIZACION EN EL SISTEMA
                            ano = fecha_trans.substring(0, 4);
                            mes = fecha_trans.substring(5, 7);
                            dia = fecha_trans.substring(8, 10);
                            fecha = dia + "/" + mes + "/" + ano;
                        }
                        break;
                case 2: if (!fecha_trans.equals("")){  //MODO PARA GUARDAR EN LA BD
                            ano = fecha_trans.substring(6, 10); 
                            mes = fecha_trans.substring(3, 5);
                            dia = fecha_trans.substring(0, 2);
                            fecha = ano + "-" + mes + "-" + dia;
                        }    
                        break;
        
            } 
          
          }
           catch(NullPointerException ex){
               
               fecha = "1900-01-01";
           }
      
            return fecha;
      }
    
     public static String fecha_bd_usuario_2(String fecha_trans,Integer modo_fecha){  
          
          String ano;
          String mes;
          String dia;
          
          String fecha="1900-01-01";
          
          try{ 
          
          switch (modo_fecha){
                case 1: if (!fecha_trans.equals("")){ //MODO PARA VISUALIZACION EN EL SISTEMA
                            ano = fecha_trans.substring(0, 4);
                            mes = fecha_trans.substring(5, 7);
                            dia = fecha_trans.substring(8, 10);
                            fecha = dia + "/" + mes + "/" + ano;
                        }
                        break;
                case 2: if (!fecha_trans.equals("")){  //MODO PARA GUARDAR EN LA BD
                            ano = "20" + fecha_trans.substring(6, 8); 
                            mes = fecha_trans.substring(3, 5);
                            dia = fecha_trans.substring(0, 2);
                            fecha = ano + "-" + mes + "-" + dia;
                        }    
                        break;
        
            } 
          
          }
           catch(NullPointerException ex){
               
               fecha = "1900-01-01";
           }
      
            return fecha;
      }
    
     public static String descripcion_mes(String mes){
    
        String desc_mes=null;
                 
        switch (Integer.parseInt(mes)){

            case 1: desc_mes = "ENERO";
                    break;
            case 2: desc_mes = "FEBRERO";
                    break;
            case 3: desc_mes = "MARZO";
                    break;
            case 4: desc_mes = "ABRIL";
                    break;
            case 5: desc_mes = "MAYO";
                    break;
            case 6: desc_mes = "JUNIO";
                    break;
            case 7: desc_mes = "JULIO";
                    break;
            case 8: desc_mes = "AGOSTO";
                    break;
            case 9: desc_mes = "SEPTIEMBRE";
                    break;
            case 10: desc_mes = "OCTUBRE";
                    break;
            case 11: desc_mes = "NOVIEMBRE";
                    break;
            case 12: desc_mes = "DICIEMBRE";
                                    
        }
                  
         
        return desc_mes;
    
    }
     
    public static Integer descripcion_mes_num(String mes){
    
        Integer desc_mes=0;
                 
        switch (mes){

            case "ENERO": desc_mes = 1;
                    break;
            case "FEBRERO": desc_mes = 2;
                    break;
            case "MARZO": desc_mes = 3;
                    break;
            case "ABRIL": desc_mes = 4;
                    break;
            case "MAYO": desc_mes = 5;
                    break;
            case "JUNIO": desc_mes = 6;
                    break;
            case "JULIO": desc_mes = 7;
                    break;
            case "AGOSTO": desc_mes = 8;
                    break;
            case "SEPTIEMBRE": desc_mes = 9;
                    break;
            case "OCTUBRE": desc_mes = 10;
                    break;
            case "NOVIEMBRE": desc_mes = 11;
                    break;
            case "DICIEMBRE": desc_mes = 12;
                                    
        }
                  
         
        return desc_mes;
    
    }
    
    public static String encodeToString(BufferedImage image) {
        String imageString = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            ImageIO.write(image, "jpg", bos);
            byte[] imageBytes = bos.toByteArray();
            
            imageString =  Base64.getEncoder().encodeToString(imageBytes);

            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageString;
    }
    
    public static BufferedImage decodeToImage(String imageString) {

        BufferedImage image = null;
        byte[] imageByte;
        try {
            imageByte = Base64.getDecoder().decode(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }
    
    public static String formato_ordencompra(Integer ordendecompra){
        String respuesta = "";
        
        switch (String.valueOf(ordendecompra).length()){
             
             case 1: respuesta = "OC-0000000" + String.valueOf(ordendecompra);
                     break;   
             case 2: respuesta = "OC-000000" + String.valueOf(ordendecompra);
                     break;   
             case 3: respuesta = "OC-00000" + String.valueOf(ordendecompra);
                     break;
             case 4: respuesta = "OC-0000" + String.valueOf(ordendecompra);
                     break;
             case 5: respuesta = "OC-000" + String.valueOf(ordendecompra);
                     break;
             case 6: respuesta = "OC-00" + String.valueOf(ordendecompra);
                     break;
             case 7: respuesta = "OC-0" + String.valueOf(ordendecompra);
                     break;
             case 8: respuesta = String.valueOf(ordendecompra);
                     break;
                    
        }
        
        return respuesta;
        
    }

     public static void fecha_convertir_string(String fecha_convertir,JDateChooser fecha){
        
        Calendar cal = Calendar.getInstance();
        
         try {
                cal.set(Integer.parseInt(fecha_convertir.substring(0, 4)),Integer.parseInt(fecha_convertir.substring(5, 7))-1,Integer.parseInt(fecha_convertir.substring(8, 10)));
                fecha.setCalendar(cal);
         }catch(NullPointerException ex){
                fecha.setDate(null);
         }
    }
   
    
}
