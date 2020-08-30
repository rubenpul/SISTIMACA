
package controlador;

import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
    
    public  String url; // Ip_de_la_maquina/nombre_de_la_base_de_datos
    public  String login;
    public  String password;
    public  Connection cnn;
    public  Statement st;
    public  ResultSet rs;
    public  boolean estado;

       
    public conexion(String sql,String modo){
        
        url = "jdbc:mysql://192.168.0.3/sistimaca?zeroDateTimeBehavior=convertToNull&autoReconnect=true&useSSL=false";
        //url = "jdbc:mysql://localhost/sistimaca?zeroDateTimeBehavior=convertToNull&autoReconnect=true&useSSL=false";
        
        login = "usr_timaca";
        password = "timaca2017";
        cnn = null;
        st = null;
        rs = null;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(url,login,password);
            
            if (cnn != null){
                System.out.println("Conexión a base de datos "+url+" ... Ok");
            
                st = cnn.createStatement();
           
                if (modo.equals("buscar")){
               //JOptionPane.showMessageDialog(null,sql);
                    rs = st.executeQuery(sql);
                }
                else{
                //JOptionPane.showMessageDialog(null,sql);
                    st.execute(sql);
                }
                
                estado = true;
            }
                    
        }
        catch(SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos "+url);
            System.out.println(ex);
            estado = false;
        }
        catch(ClassNotFoundException ex) {
            System.out.println ("La clase no fue encontrada");
            System.out.println(ex);
            estado = false;
        }
               
    }
    
    public conexion(){
        
        //url = "jdbc:mysql://192.168.0.3/sistimaca?zeroDateTimeBehavior=convertToNull&autoReconnect=true&useSSL=false";
        url = "jdbc:mysql://localhost/sistimaca?zeroDateTimeBehavior=convertToNull&autoReconnect=true&useSSL=false";
        
        login = "usr_timaca";
        password = "timaca2017";
        cnn = null;
        st = null;
        rs = null;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(url,login,password);
            
            if (cnn != null){
                System.out.println("Conexión a base de datos "+url+" ... Ok");              
                estado = true;
            }
                    
        }
        catch(SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos "+url);
            System.out.println(ex);
            estado = false;
        }
        catch(ClassNotFoundException ex) {
            System.out.println ("La clase no fue encontrada");
            System.out.println(ex);
            estado = false;
        }
               
    }
    
    
   
    public void realizar_transaccion(String sql,String modo){
            try {
                st = cnn.createStatement();
            } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"Error en la Transaccion en la Base de Datos(createStatement) " + ex.getMessage());

            }

           if (modo.equals("buscar")){
                try {
                    //JOptionPane.showMessageDialog(null,sql);
                    rs = st.executeQuery(sql);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Error en la Transaccion en la Base de Datos(executeQuery) " + ex.getMessage());
                }
           }
           else{
                try {
                    //JOptionPane.showMessageDialog(null,sql);
                    st.execute(sql);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Error en la Transaccion en la Base de Datos(execute) " + ex.getMessage());
                }
           }

           estado = true;
       
    }
    
    
    public void cerrar_transaccion(){
        try {
            st.close();
            
        } catch (SQLException ex) {
            estado = false;
        }
        
    }
    
    public void cerrar_conexion(){
        try {
            cnn.close();
        } catch (SQLException ex) {
           estado = false;
        }
        
    }
    
    public void cerrar(){
        
        try {
            st.close();
        } catch (SQLException ex) {
            estado = false;
        }
        
        try {
            cnn.close();
        } catch (SQLException ex) {
           estado = false;
        }
    }
    
  
    
}
