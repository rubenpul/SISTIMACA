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
import model.class_usuario;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;


public class ctrl_usuario {
    class_usuario usuario;
    private String sql;
    
    
    
    public ctrl_usuario(Integer cedula, String nombres, String id_usuario, String password, String confirmarpassword, Integer id_perfil,String descripcionperfil,Integer id_area, String firmadigital, Integer id_usuario_alter,boolean status,String email) {
        usuario = new class_usuario(cedula, nombres, id_usuario, password, confirmarpassword, id_perfil,descripcionperfil,id_area, firmadigital,id_usuario_alter,status,email);
        sql = "";
    }
    
    private  String encriptar(String cadena){
        StandardPBEStringEncryptor s = new StandardPBEStringEncryptor();
        s.setPassword("uniquekey");
        return s.encrypt(cadena);
    }
  
    private  String desencriptar(String cadena){
        
        
        StandardPBEStringEncryptor s = new StandardPBEStringEncryptor();
        s.setPassword("uniquekey");
        String cadena_original="";
        
        try{
            cadena_original = s.decrypt(cadena);
        }
        catch(Exception e){
            
        }
        
        return cadena_original;
    }
    
    public  class_usuario actualizar_usuario(){
        
        //buscar si existe el usuario
        
        buscar_sql(1);
       
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "EL USUARIO EXISTE EN LA BASE DE DATOS");                     
                    usuario.setStatus(false);
                    cnn.cerrar(); 
                    return usuario;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
               //usuario.setStatus(false);
               //return usuario;
            }    
         }   
        else{
             cnn.cerrar();
            // usuario.setStatus(false);
             //return usuario;
        }
        
        
        //AGREGAR USUARIO
        
        buscar_sql(2);
        
        cnn.cerrar(); 
                  
        cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            //JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DEL USUARIO SATISFACTORIA");
             cnn.cerrar();
            //usuario.setStatus(true);
            //return usuario;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL USUARIO");
            cnn.cerrar();
            usuario.setStatus(false);
            return usuario;
        }
        
        //AGREGAR PERFIL
        
        buscar_sql(3);
        
                  
        cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            //JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DEL USUARIO SATISFACTORIA");
             cnn.cerrar();
            //usuario.setStatus(true);
            //return usuario;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL PERFIL USUARIO");
            cnn.cerrar();
            usuario.setStatus(false);
            return usuario;
        }
        
        //AGREGAR PERMISOLOGIA
//        agregar_permisologia();
    
         usuario.setStatus(true);
         return usuario;
       
    }
    
    public  class_usuario actualizar_usuario_detalle(){
        
        //ACTUALIZAR USUARIO
        
        buscar_sql(5);
       
        conexion cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            //JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DEL USUARIO SATISFACTORIA");
            cnn.cerrar();
            //return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL USUARIO");
            cnn.cerrar();
            usuario.setStatus(false);
            return usuario;
        }
        
        //ACTUALIZAR PERFIL
        
        buscar_sql(6);
        
                  
        cnn = new conexion(sql,"");
      
        if (cnn.estado){
           
            //JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DEL USUARIO SATISFACTORIA");
             cnn.cerrar();
            //usuario.setStatus(true);
            //return usuario;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL PERFIL USUARIO");
            cnn.cerrar();
            usuario.setStatus(false);
            return usuario;
        }
        
        //ACTUALIZAR PERMISOLOGIA
        actualizar_permisologia();
    
         usuario.setStatus(true);
         return usuario;
       
    }
    
    
    public void actualizar_permisologia(){
         buscar_sql(7);
         conexion cnn = new conexion(sql,"");
//         agregar_permisologia();
    }
    
    public void transaccion_bd(){
        conexion cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            //JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DEL USUARIO SATISFACTORIA");
            cnn.cerrar();
            //return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL USUARIO");
            cnn.cerrar();
            usuario.setStatus(false);
        }
        
    }
      
    
    public class_usuario buscar_usuario(){
        
        //buscar si existe el usuario
        
        buscar_sql(8);
       
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                                                           
                    usuario.setCedula(cnn.rs.getInt(1));
                    usuario.setNombres(cnn.rs.getString(2));
                    usuario.setId_usuario(cnn.rs.getString(3));
                    usuario.setPassword(desencriptar(cnn.rs.getString(4)));
                    usuario.setFirmadigital(desencriptar(cnn.rs.getString(5)));
                    usuario.setStatus(cnn.rs.getBoolean(6));
                    usuario.setEmail(cnn.rs.getString(7));
                    usuario.setConsultaestatus(true);
                    
                    cnn.cerrar();
                    
                    buscar_sql(14);
                    
                    cnn = new conexion(sql,"buscar");
                    
                    if (cnn.estado){
            
                        try {
                            if(cnn.rs.next()){
                                usuario.setId_perfil(cnn.rs.getInt(1));
                                usuario.setDescripcionperfil(cnn.rs.getString(3));
                                usuario.setDescripcionarea(cnn.rs.getString(4));
                                cnn.cerrar();
                    
//                                consultar_permisologia();
                                                             
                                return usuario;
                                
                            }    
                            else{
                                
                                usuario.setConsultaestatus(false);
                                cnn.cerrar(); 
                                return usuario;
                            }
                        }
                        catch (SQLException err) {
                            JOptionPane.showMessageDialog(null, err.getMessage());   
                            cnn.cerrar();
                            usuario.setConsultaestatus(false);
                            return usuario;  
                        }  
                    }
                    else{
                            usuario.setConsultaestatus(false);
                            return usuario;  
                    
                    }
                }
                else{
                    
                    usuario.setConsultaestatus(false);
                    return usuario;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                usuario.setConsultaestatus(false);
                return usuario;  
            }    
         }   
        else{
             cnn.cerrar();
             usuario.setConsultaestatus(false);
             return usuario;  
        }
        
        
    }
    
     public class_usuario buscarperfil_usuario(){
        
        //buscar si existe el usuario
        
        buscar_sql(9);
       
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){

                    usuario.setId_perfil(cnn.rs.getInt(2));
                    usuario.setDescripcionperfil(cnn.rs.getString(3));
                    usuario.setDescripcionarea(cnn.rs.getString(4)); 
                    cnn.cerrar(); 
                    return usuario;          
                   
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                
                return usuario;  
            }    
         }   
        else{
             cnn.cerrar();
            
             return usuario;  
        }
        
        
        return usuario;  
        
    }
    
        
    public  Boolean verificar_password(){
        
        buscar_sql(11);
        
        conexion cnn = new conexion(sql,"buscar");
        
         if (cnn.estado){
             try{
                if(cnn.rs.next()){
                   
                    if (this.desencriptar(cnn.rs.getString(1)).equals(usuario.getPassword())){
                       
                        cnn.cerrar(); 
                        return true;
                    }    
                    else{
                        cnn.cerrar(); 
                        return false;
                    }
                }
                else{
                    cnn.cerrar();
                    return false;                 
                }
                
             }
             catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());
                cnn.cerrar();
                return false;
            }

         }
         else{
             return false;
         }
    }
    
     public class_usuario buscar_usuario_login(){
        
        //buscar si existe el usuario
        
        buscar_sql(12);
       
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                                                           
                    usuario.setCedula(cnn.rs.getInt(1));
                    usuario.setNombres(cnn.rs.getString(2));
                    usuario.setId_usuario(cnn.rs.getString(3));
                    usuario.setPassword(desencriptar(cnn.rs.getString(4)));
                    usuario.setFirmadigital(desencriptar(cnn.rs.getString(5)));
                    usuario.setStatus(cnn.rs.getBoolean(6));
                    
                    usuario.setConsultaestatus(true);
                    
                    cnn.cerrar();
                    
                    buscar_sql(9);
                    
                    cnn = new conexion(sql,"buscar");
                    
                    if (cnn.estado){
            
                        try {
                            if(cnn.rs.next()){
                                usuario.setId_perfil(cnn.rs.getInt(2));
                                usuario.setDescripcionperfil(cnn.rs.getString(3));
                                usuario.setDescripcionarea(cnn.rs.getString(4));
                                usuario.setId_area(cnn.rs.getInt(6));
                                cnn.cerrar();
                    
//                                consultar_permisologia();
                                                             
                                return usuario;
                                
                            }    
                            else{
                                
                                usuario.setConsultaestatus(false);
                                cnn.cerrar(); 
                                return usuario;
                            }
                        }
                        catch (SQLException err) {
                            JOptionPane.showMessageDialog(null, err.getMessage());   
                            cnn.cerrar();
                            usuario.setConsultaestatus(false);
                            return usuario;  
                        }  
                    }
                    else{
                            usuario.setConsultaestatus(false);
                            return usuario;  
                    
                    }
                }
                else{
                    
                    usuario.setConsultaestatus(false);
                    return usuario;
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                usuario.setConsultaestatus(false);
                return usuario;  
            }    
         }   
        else{
             cnn.cerrar();
             usuario.setConsultaestatus(false);
             return usuario;  
        }
        
        
    }
    
    public Boolean getPermisologia(String modulo){
    
        Boolean resp = false;
        
         usuario.setModulo(modulo);
         buscar_sql(13);
         
         conexion cnn = new conexion(sql,"buscar");
         
          if (cnn.estado){
            
                        try {
                            if(cnn.rs.next()){
                                resp = cnn.rs.getBoolean(1);
                                cnn.cerrar();                                                        
                                return resp;
                               
                            }    
                            else{
                               cnn.cerrar();
                                return resp;
                                
                            }
                        }
                        catch (SQLException err) {
                             
                            cnn.cerrar();
                            
                        }  
                    }
                    else{
                           cnn.cerrar();
                            return resp;  
                    
                    }
          
                 return resp;
                 
    }
     
   public Boolean actualizar_status_usuario(){
        
        buscar_sql(15);
        conexion cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            //JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN DEL USUARIO SATISFACTORIA");
            cnn.cerrar();
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL USUARIO");
            cnn.cerrar();
            
        }
      
        return false;
    }

   public void consulta_usuarios(JTable tabla){
        Integer i;
        String status;
        buscar_sql(16);
        
        conexion cnn = new conexion(sql,"buscar");
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        modelotabla.setRowCount(0);
        
        if (cnn.estado){
            
            try{
                while(cnn.rs.next()){
                    if (cnn.rs.getBoolean(7) == true){
                        status = "ACTIVO";
                    }
                    else{
                        status = "INACTIVO";
                    }
                    modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getString(2),
                        cnn.rs.getString(3),
                        cnn.rs.getString(4),
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        status
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
   
   
    public void buscar_sql(Integer consulta) {
        
        
        switch (consulta){
            case 1:
                sql = "SELECT usuario FROM tbl_usuario WHERE usuario = '" + usuario.getId_usuario() + "'";
       
                break;  
                
            case 2:
                sql = "INSERT INTO tbl_usuario VALUES(" + usuario.getCedula() + ",'" + usuario.getNombres().toUpperCase() + "','"  + usuario.getId_usuario().toUpperCase() + "','" + encriptar(usuario.getPassword()) + "','" + encriptar(usuario.getFirmadigital()) + "',true,'"+ usuario.getEmail() + "');" ;
       
                break;    
                
            case 3:
                sql = "INSERT INTO tbl_usuario_perfil VALUES(" + usuario.getCedula() + "," + usuario.getId_perfil() + "," + usuario.getId_area() +  ");" ;
       
                break;
                
            /*case 4:
                sql = "INSERT INTO tbl_usuario_modulo VALUES(" + usuario.getCedula() + "," + usuario.getPermisologia().getModulo() + "," + usuario.isStatus() + ");" ;
       
                break;*/
                
            case 5:
                sql = "UPDATE tbl_usuario SET nombres = '" + usuario.getNombres().toUpperCase() + "', usuario = '"  + usuario.getId_usuario().toUpperCase() + "',contrasena = '" + encriptar(usuario.getPassword()) + "',firmadigital='" + encriptar(usuario.getFirmadigital()) + "',status=" + usuario.isStatus() + ",correo='" + usuario.getEmail() + "' WHERE id_usuario = " + usuario.getCedula() + ";";
               
                break;
                 
            case 6:
                sql = "UPDATE tbl_usuario_perfil SET fk_perfil = " + usuario.getId_perfil() + ",fk_area = " + usuario.getId_area() + " WHERE fk_usuario = " + usuario.getCedula() + ";" ;
               
                break;
                 
            case 7:
                sql = "DELETE FROM tbl_usuario_modulo WHERE fk_usuario = " + usuario.getCedula() + ";";
       
                break;  
            
            case 8:
                sql = "SELECT id_usuario, nombres, usuario, contrasena,firmadigital, status,correo FROM tbl_usuario WHERE id_usuario = " + usuario.getCedula() + ";";
                
                break;      
            
            case 9:
                sql = "SELECT fk_usuario, fk_perfil, descripcionperfil, descripcionarea, abreviatura,fk_area FROM vw_perfil WHERE fk_usuario = " + usuario.getCedula() + ";";
                
                break; 
            
             case 10:
                sql = "SELECT fk_usuario, fk_modulo, descripcion, permiso FROM vw_usuario_modulo WHERE fk_usuario = " + usuario.getCedula() + " ORDER BY fk_modulo;";
                
                break;     
                
             case 11:
                 sql = "SELECT contrasena FROM tbl_usuario WHERE usuario = '" + usuario.getId_usuario() + "' AND status = true";
                 
                 break;
                 
             case 12:
                sql = "SELECT id_usuario, nombres, usuario, contrasena,firmadigital, status FROM tbl_usuario WHERE usuario = '" + usuario.getId_usuario() + "';";
                
                break;  
                
             case 13:
                sql = "SELECT permiso FROM vw_usuario_modulo WHERE fk_usuario = " + usuario.getCedula() + " AND descripcion = '" + usuario.getModulo()  + "';";
                
                break;   
                
             case 14:
                sql = "SELECT fk_usuario, fk_perfil, CONCAT(descripcionperfil,'-',abreviatura) as descripcionperfil, descripcionarea, abreviatura,fk_area FROM vw_perfil WHERE fk_usuario = " + usuario.getCedula() + ";";
                
                break;   
             case 15:
                sql = "UPDATE tbl_usuario SET status = " + usuario.isStatus() + " WHERE id_usuario = " + usuario.getCedula() + ";" ;
               
                break;              
             
             case 16:
                 sql = "SELECT a.id_usuario, a.nombres, a.usuario, c.abreviatura as nivel , d.descripcion,a.correo,a.status ";
                 sql += "FROM tbl_usuario a ";
                 sql += "INNER JOIN tbl_usuario_perfil b ON ";
                 sql += "a.id_usuario = b.fk_usuario ";
                 sql += "INNER JOIN tbl_perfil c ON ";
                 sql += "b.fk_perfil = c.id_perfil ";
                 sql += "INNER JOIN tbl_area d ON ";
                 sql += "b.fk_area = d.id_area ";
                 sql += "ORDER BY a.id_usuario ";                 
                 break;
        }
        
        System.out.println(sql); 
    }
    
    
    
}
