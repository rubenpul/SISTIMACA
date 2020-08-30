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
import model.class_proveedor;

/**
 *
 * @author ruben
 */
public class ctrl_proveedor {
    
    class_proveedor proveedor;
    private String sql;
    
    public ctrl_proveedor(Integer id_proveedor, String rif, String nombre, String direccion, String ciudad,String estado,String pais,String codigopostal,String tipo,String personacontacto,String telefono1,String telefono2,String correoelectronico,String banco1,String nrocuenta1,String tipocuenta1,String banco2,String nrocuenta2,String tipocuenta2,String banco3,String nrocuenta3,String tipocuenta3,Integer clasematerial,Integer grupomaterial,Boolean status) {
        proveedor = new class_proveedor(id_proveedor,rif,nombre,direccion,ciudad,estado,pais,codigopostal,tipo,personacontacto,telefono1,telefono2,correoelectronico,banco1,nrocuenta1,tipocuenta1,banco2,nrocuenta2,tipocuenta2,banco3,nrocuenta3,tipocuenta3,clasematerial,grupomaterial,status);
        sql = "";
    }
    
    public class_proveedor buscar_proveedor(){
         buscar_sql(2);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    proveedor.setId_proveedor(cnn.rs.getInt(1));
                    proveedor.setRif(cnn.rs.getString(2));
                    proveedor.setNombre(cnn.rs.getString(3)); 
                    proveedor.setDireccion(cnn.rs.getString(4));
                    proveedor.setCiudad(cnn.rs.getString(5));
                    proveedor.setEstado(cnn.rs.getString(6)); 
                    proveedor.setPais(cnn.rs.getString(7));
                    proveedor.setCodigopostal(cnn.rs.getString(8));
                    proveedor.setTipo(cnn.rs.getString(9)); 
                    proveedor.setPersonacontacto(cnn.rs.getString(10));
                    proveedor.setTelefono1(cnn.rs.getString(11));
                    proveedor.setTelefono2(cnn.rs.getString(12)); 
                    proveedor.setCorreoelectronico(cnn.rs.getString(13));
                    proveedor.setBanco1(cnn.rs.getString(14));
                    proveedor.setNrocuenta1(cnn.rs.getString(15)); 
                    proveedor.setTipocuenta1(cnn.rs.getString(16));
                    proveedor.setBanco2(cnn.rs.getString(17));
                    proveedor.setNrocuenta2(cnn.rs.getString(18)); 
                    proveedor.setTipocuenta2(cnn.rs.getString(19));
                    proveedor.setBanco3(cnn.rs.getString(20));
                    proveedor.setNrocuenta3(cnn.rs.getString(21)); 
                    proveedor.setTipocuenta3(cnn.rs.getString(22));
                    proveedor.setStatus(true);
                    cnn.cerrar(); 
                    return proveedor;
                }
                cnn.cerrar(); 
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                proveedor.setStatus(false);
                return proveedor;
            }    
         }   
        else{
             cnn.cerrar();
             proveedor.setStatus(false);
             return proveedor;
        }
    
        return proveedor;
    }
    
    public class_proveedor guardar_proveedor(){
        
        buscar_sql(2);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "EL RIF EXISTE EN LA BASE DE DATOS");    
                    proveedor.setStatus(true);
                    cnn.cerrar(); 
                    return proveedor;
                }
                else{
                    cnn.cerrar(); 
                }
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                proveedor.setStatus(false);
                return proveedor;
            }    
         }   
        else{
             cnn.cerrar();
             proveedor.setStatus(false);
             return proveedor;
        }
        
        
        buscar_sql(1);
        
          
        cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            cnn.cerrar();
            buscar_sql(4);
            cnn = new conexion(sql,"buscar");
            
            if (cnn.estado){
                try{
                    if (cnn.rs.next()){
                        proveedor.setId_proveedor(cnn.rs.getInt(1));
                        cnn.cerrar();
                        proveedor.setStatus(true);
                        return proveedor;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL PROVEEDOR");
                        proveedor.setStatus(false);
                        return proveedor;
                    }    
                }
                catch(SQLException ex){}
                
            }
            else{  
                JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL PROVEEDOR");
                cnn.cerrar();
                proveedor.setStatus(false);
                return proveedor;
            } 
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL PROVEEDOR");
            cnn.cerrar();
            proveedor.setStatus(false);
            return proveedor;
            
        }
        return proveedor; 
    }
    
    
    public class_proveedor actualizar_proveedor(){
        
        buscar_sql(6);
                  
        conexion cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            cnn.cerrar();
//            buscar_sql(7);
//            cnn = new conexion(sql,"");
            
//            if (cnn.estado){
//                cnn.cerrar();
                proveedor.setStatus(true);
                return proveedor;
//            }
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACIÓN DEL PROVEEDOR");
            cnn.cerrar();
            proveedor.setStatus(true);
            return proveedor;
        }
        
        
//        return proveedor;
    }
    
    public void buscar_proveedor_detalle(JTable tabla) throws SQLException{
        Integer i;
        
        //if (proveedor.getRif().equals(-1)){
            buscar_sql(2);
        //}
        //else{
        //    buscar_sql(1);
        //}
        
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
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        cnn.rs.getString(7),
                        cnn.rs.getString(8), 
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
                        cnn.rs.getString(22)
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
    
    public void buscar_proveedor_detalle_descripcion(JTable tabla){
        Integer i;
        
        //if (proveedor.getRif().equals(-1)){
            buscar_sql(8);
        //}
        //else{
        //    buscar_sql(1);
        //}
        
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
                        cnn.rs.getString(5),
                        cnn.rs.getString(6),
                        cnn.rs.getString(7),
                        cnn.rs.getString(8), 
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
                        cnn.rs.getString(22)
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

    public class_proveedor buscar_proveedor_exacto(){
         buscar_sql(9);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                if(cnn.rs.next()){
                     proveedor.setId_proveedor(cnn.rs.getInt(1));
                    proveedor.setRif(cnn.rs.getString(2));
                    proveedor.setNombre(cnn.rs.getString(3)); 
                    proveedor.setDireccion(cnn.rs.getString(4));
                    proveedor.setCiudad(cnn.rs.getString(5));
                    proveedor.setEstado(cnn.rs.getString(6)); 
                    proveedor.setPais(cnn.rs.getString(7));
                    proveedor.setCodigopostal(cnn.rs.getString(8));
                    proveedor.setTipo(cnn.rs.getString(9)); 
                    proveedor.setPersonacontacto(cnn.rs.getString(10));
                    proveedor.setTelefono1(cnn.rs.getString(11));
                    proveedor.setTelefono2(cnn.rs.getString(12)); 
                    proveedor.setCorreoelectronico(cnn.rs.getString(13));
                    proveedor.setBanco1(cnn.rs.getString(14));
                    proveedor.setNrocuenta1(cnn.rs.getString(15)); 
                    proveedor.setTipocuenta1(cnn.rs.getString(16));
                    proveedor.setBanco2(cnn.rs.getString(17));
                    proveedor.setNrocuenta2(cnn.rs.getString(18)); 
                    proveedor.setTipocuenta2(cnn.rs.getString(19));
                    proveedor.setBanco3(cnn.rs.getString(20));
                    proveedor.setNrocuenta3(cnn.rs.getString(21)); 
                    proveedor.setTipocuenta3(cnn.rs.getString(22));
                    proveedor.setStatus(true);

                   cnn.cerrar(); 
                    return proveedor;
                }
                cnn.cerrar(); 
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
                proveedor.setStatus(false);
                return proveedor;
            }    
         }   
        else{
             cnn.cerrar();
             proveedor.setStatus(false);
             return proveedor;
        }
    
        return proveedor;
    }
   
    public void guardar_clasematerial_proveedor(JTable tabla){
        Integer i;
                
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        i = 0;
        
        buscar_sql(12);
        conexion cnn = new conexion(sql,"");
        cnn.cerrar();
        
        while(i<modelotabla.getRowCount()){
            if (modelotabla.getValueAt(i,1).equals(true)){
                proveedor.setClasematerial(Integer.parseInt(modelotabla.getValueAt(i,0).toString()));
                buscar_sql(3);
                cnn = new conexion(sql,"");
                cnn.cerrar();
            }
            
            i++;
        } 
    }
    
    public void guardar_grupomaterial_proveedor(JTable tabla){
        Integer i;
                
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        i = 0;
        
        buscar_sql(13);
        conexion cnn = new conexion(sql,"");
        cnn.cerrar();
        
        while(i<modelotabla.getRowCount()){
            if (modelotabla.getValueAt(i,0).equals(true)){
                proveedor.setGrupomaterial(Integer.parseInt(modelotabla.getValueAt(i,1).toString()));
                buscar_sql(10);
                cnn = new conexion(sql,"");
                cnn.cerrar();
            }
            
            i++;
        } 
    }
    public void consultar_clasematerial_proveedor(JTable tabla) throws SQLException{
        Integer i;
        Boolean bandera;        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        
        
        buscar_sql(14);
        conexion cnn = new conexion(sql,"buscar");
               
        if (cnn.estado){
            while(cnn.rs.next()){
                i = 0;
                bandera = true;
                while(i<modelotabla.getRowCount() && bandera){
                    if(cnn.rs.getInt(1) == Integer.parseInt(modelotabla.getValueAt(i, 0).toString())){
                        modelotabla.setValueAt(true,i, 1);
                        bandera = false;
                    }
                    i++;
                }
               
            }
            cnn.cerrar();
        }        
    }    
    public void consultar_grupomaterial_proveedor(JTable tabla) throws SQLException{
        Integer i;
        Boolean bandera;        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
        
        
        buscar_sql(15);
        conexion cnn = new conexion(sql,"buscar");
               
        if (cnn.estado){
            while(cnn.rs.next()){
                i = 0;
                bandera = true;
                while(i<modelotabla.getRowCount() && bandera){
                    if(cnn.rs.getInt(1) == Integer.parseInt(modelotabla.getValueAt(i, 1).toString())){
                        modelotabla.setValueAt(true,i, 0);
                        bandera = false;
                    }
                    i++;
                }
            }
            cnn.cerrar();
        }        
    } 
    
    public class_proveedor anular_proveedor(){
        
        
        
        
        buscar_sql(16);
                  
        conexion cnn = new conexion(sql,"");
        
        if (cnn.estado){
           
            cnn.cerrar();
                proveedor.setStatus(true);
                return proveedor;
        }
        else{
            cnn.cerrar();
            proveedor.setStatus(true);
            return proveedor;
        }

    }
    
    public void consultar_proveedor_todos(JTable tabla){

        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();

        buscar_sql(17);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                     modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getString(2),
                        cnn.rs.getString(3), 
                        cnn.rs.getString(5),
                        cnn.rs.getString(6), 
                        cnn.rs.getString(7),
                        cnn.rs.getString(9), 
                        cnn.rs.getString(10),
                        cnn.rs.getString(11)
                     });
                }
                cnn.cerrar(); 
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
            }    
        }   
        else{
             cnn.cerrar();
             
            
        }
    
       
    }
    
    
    public void consultar_proveedores_rif(JTable tabla){

        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();

         modelotabla.setRowCount(0);
        
        buscar_sql(18);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                     modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getString(2),
                        cnn.rs.getString(3), 
                        cnn.rs.getString(5),
                        cnn.rs.getString(6), 
                        cnn.rs.getString(7),
                        cnn.rs.getString(9), 
                        cnn.rs.getString(10),
                        cnn.rs.getString(11)
                     });
                }
                cnn.cerrar(); 
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
            }    
        }   
        else{
             cnn.cerrar();
             
            
        }
    
       
    }

    public void consultar_proveedores_razonsocial(JTable tabla){

        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();

         modelotabla.setRowCount(0);
        
        buscar_sql(8);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                     modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getString(2),
                        cnn.rs.getString(3), 
                        cnn.rs.getString(5),
                        cnn.rs.getString(6), 
                        cnn.rs.getString(7),
                        cnn.rs.getString(9), 
                        cnn.rs.getString(10),
                        cnn.rs.getString(11)
                     });
                }
                cnn.cerrar(); 
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
            }    
        }   
        else{
             cnn.cerrar();
             
            
        }
    
       
    }    
    
    public void consultar_proveedores_clasematerial(JTable tabla){

        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();

        modelotabla.setRowCount(0);
        buscar_sql(19);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                     modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getString(2),
                        cnn.rs.getString(3), 
                        cnn.rs.getString(5),
                        cnn.rs.getString(6), 
                        cnn.rs.getString(7),
                        cnn.rs.getString(9), 
                        cnn.rs.getString(10),
                        cnn.rs.getString(11)
                     });
                }
                cnn.cerrar(); 
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
            }    
        }   
        else{
             cnn.cerrar();
             
            
        }
    
       
    }    

    public void consultar_proveedores_grupomaterial(JTable tabla){

        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();

         modelotabla.setRowCount(0);
        
        buscar_sql(20);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                     modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getString(2),
                        cnn.rs.getString(3), 
                        cnn.rs.getString(5),
                        cnn.rs.getString(6), 
                        cnn.rs.getString(7),
                        cnn.rs.getString(9), 
                        cnn.rs.getString(10),
                        cnn.rs.getString(11)
                     });
                }
                cnn.cerrar(); 
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
            }    
        }   
        else{
             cnn.cerrar();
             
            
        }
    
       
    }    
    
    public void consultar_proveedores_tipo(JTable tabla){

        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();

         modelotabla.setRowCount(0);
        
        buscar_sql(21);
        conexion cnn = new conexion(sql,"buscar");
        
        if (cnn.estado){
            
            try {
                while(cnn.rs.next()){
                     modelotabla.addRow(new Object[]{
                        cnn.rs.getInt(1),
                        cnn.rs.getString(2),
                        cnn.rs.getString(3), 
                        cnn.rs.getString(5),
                        cnn.rs.getString(6), 
                        cnn.rs.getString(7),
                        cnn.rs.getString(9), 
                        cnn.rs.getString(10),
                        cnn.rs.getString(11)
                     });
                }
                cnn.cerrar(); 
            } 
            catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());   
                cnn.cerrar();
            }    
        }   
        else{
             cnn.cerrar();
             
            
        }
    
       
    }    
    
    
    public void buscar_sql(Integer consulta){
        
         switch (consulta){
            case 1:
                 sql = "INSERT INTO tbl_proveedor VALUES(DEFAULT,'" + proveedor.getRif() + "','" + proveedor.getNombre().toUpperCase() + "','" + proveedor.getDireccion().toUpperCase() + "','" + proveedor.getCiudad().toUpperCase() + "','" + proveedor.getEstado().toUpperCase() + "','" + proveedor.getPais().toUpperCase() + "','" + proveedor.getCodigopostal().toUpperCase() + "','" + proveedor.getTipo().toUpperCase() + "','" + proveedor.getPersonacontacto().toUpperCase() + "','" + proveedor.getTelefono1() + "','" + proveedor.getTelefono2() + "','" + proveedor.getCorreoelectronico() + "','" + proveedor.getBanco1().toUpperCase() + "','" + proveedor.getNrocuenta1() + "','" + proveedor.getTipocuenta1() + "','" + proveedor.getBanco2().toUpperCase() + "','" + proveedor.getNrocuenta2() + "','" + proveedor.getTipocuenta2()+ "','" + proveedor.getBanco3().toUpperCase() + "','" + proveedor.getNrocuenta3() + "','" + proveedor.getTipocuenta3() + "',TRUE" + ");";
                 break;
            case 2:
                 sql = "SELECT id_proveedor, rif, nombre, direccion, ciudad, estado, pais, codigopostal, tipo, personacontacto, telefono1, telefono2, correoelectronico, banco1, nrocuenta1, tipocuenta1, banco2, nrocuenta2, tipocuenta2, banco3, nrocuenta3, tipocuenta3, status FROM tbl_proveedor WHERE status = TRUE AND rif LIKE '%" + proveedor.getRif() + "%'";
                 break; 
            case 3:
                 sql = "INSERT INTO tbl_proveedorclase VALUES(" + proveedor.getId_proveedor() + "," + proveedor.getClasematerial()+ ");";
                 break;
            case 4:
                 sql = "SELECT MAX(id_proveedor) FROM tbl_proveedor;";
                 break;
               
            case 6:
                 sql = "UPDATE tbl_proveedor SET rif = '" + proveedor.getRif() + "',nombre='" + proveedor.getNombre().toUpperCase() + "',direccion='" + proveedor.getDireccion().toUpperCase() + "',ciudad='" + proveedor.getCiudad().toUpperCase() + "',estado='" + proveedor.getEstado().toUpperCase() + "',pais='" + proveedor.getPais().toUpperCase() + "',codigopostal='" + proveedor.getCodigopostal() + "',tipo='" + proveedor.getTipo() + "',personacontacto='" + proveedor.getPersonacontacto().toUpperCase() + "',telefono1='" + proveedor.getTelefono1() + "',telefono2='" + proveedor.getTelefono2() + "',correoelectronico='" + proveedor.getCorreoelectronico() + "',banco1='" + proveedor.getBanco1().toUpperCase() + "',nrocuenta1='" + proveedor.getNrocuenta1() + "',tipocuenta1='" + proveedor.getTipocuenta1() + "',banco2='" + proveedor.getBanco2().toUpperCase() + "',nrocuenta2='" + proveedor.getNrocuenta2() + "',tipocuenta2='" + proveedor.getTipocuenta2()+ "',banco3='" + proveedor.getBanco3().toUpperCase() + "',nrocuenta3='" + proveedor.getNrocuenta3() + "',tipocuenta3='" + proveedor.getTipocuenta3() + "' WHERE id_proveedor = "  + proveedor.getId_proveedor() + ";";
                 break;
            case 7:
                 sql = "UPDATE tbl_proveedorclase SET fk_clasematerial = " + proveedor.getClasematerial() + " WHERE fk_proveedor = "  + proveedor.getId_proveedor() + ";";
                 break;     
            case 8:
                 sql = "SELECT id_proveedor, rif, nombre, direccion, ciudad, estado, pais, codigopostal, tipo, personacontacto, telefono1, telefono2, correoelectronico, banco1, nrocuenta1, tipocuenta1, banco2, nrocuenta2, tipocuenta2, banco3, nrocuenta3, tipocuenta3, status FROM tbl_proveedor WHERE status = TRUE AND nombre LIKE '%" + proveedor.getNombre().toUpperCase() + "%'";
                 break;     
            case 9:
                 sql = "SELECT id_proveedor, rif, nombre, direccion, ciudad, estado, pais, codigopostal, tipo, personacontacto, telefono1, telefono2, correoelectronico, banco1, nrocuenta1, tipocuenta1, banco2, nrocuenta2, tipocuenta2, banco3, nrocuenta3, tipocuenta3, status FROM tbl_proveedor WHERE status = TRUE AND rif = '" + proveedor.getRif() + "'";
                 break;      
            case 10:
                 sql = "INSERT INTO tbl_proveedorgrupo VALUES(" + proveedor.getId_proveedor() + "," + proveedor.getGrupomaterial()+ ");";
                 break;
            case 11:
                 sql = "UPDATE tbl_proveedorgrupo SET fk_grupomaterial = " + proveedor.getGrupomaterial() + " WHERE fk_proveedor = "  + proveedor.getId_proveedor() + ";";
                 break; 
            case 12:
                 sql = "DELETE FROM tbl_proveedorclase WHERE fk_proveedor = " + proveedor.getId_proveedor() + ";";
                 break; 
             case 13:
                 sql = "DELETE FROM tbl_proveedorgrupo WHERE fk_proveedor = " + proveedor.getId_proveedor() + ";";
                 break; 
             case 14:
                 sql = "SELECT fk_clasematerial FROM tbl_proveedorclase WHERE fk_proveedor = " + proveedor.getId_proveedor() + ";";
                 break; 
             case 15:
                 sql = "SELECT fk_grupomaterial FROM tbl_proveedorgrupo WHERE fk_proveedor = " + proveedor.getId_proveedor() + ";";
                 break; 
             case 16:
                 sql = " UPDATE tbl_proveedor SET status = FALSE WHERE id_proveedor = " + proveedor.getId_proveedor() + ";";
                 break; 
             case 17:
                 sql = "SELECT id_proveedor, rif, nombre, direccion, ciudad, estado, pais, codigopostal, tipo, personacontacto, telefono1, telefono2, correoelectronico, banco1, nrocuenta1, tipocuenta1, banco2, nrocuenta2, tipocuenta2, banco3, nrocuenta3, tipocuenta3, status FROM tbl_proveedor WHERE status = TRUE;";
                 break;  
             case 18:
                 sql = "SELECT id_proveedor, rif, nombre, direccion, ciudad, estado, pais, codigopostal, tipo, personacontacto, telefono1, telefono2, correoelectronico, banco1, nrocuenta1, tipocuenta1, banco2, nrocuenta2, tipocuenta2, banco3, nrocuenta3, tipocuenta3, status FROM tbl_proveedor WHERE status = TRUE AND rif LIKE '" + proveedor.getRif() + "'";
                 break;    
             case 19:     
                 sql = "SELECT a.id_proveedor, a.rif, a.nombre, a.direccion, a.ciudad, a.estado, a.pais, a.codigopostal, a.tipo, a.personacontacto, a.telefono1, a.telefono2, a.correoelectronico, a.banco1, a.nrocuenta1, a.tipocuenta1, a.banco2, a.nrocuenta2, a.tipocuenta2, a.banco3, a.nrocuenta3, a.tipocuenta3, a.status ";
                 sql += "FROM tbl_proveedor a ";
                 sql += "INNER JOIN tbl_proveedorclase b ON ";
                 sql += "a.id_proveedor = b.fk_proveedor ";
                 sql += "WHERE b.fk_clasematerial = " + proveedor.getClasematerial();
                 break; 
             case 20:     
                 sql = "SELECT a.id_proveedor, a.rif, a.nombre, a.direccion, a.ciudad, a.estado, a.pais, a.codigopostal, a.tipo, a.personacontacto, a.telefono1, a.telefono2, a.correoelectronico, a.banco1, a.nrocuenta1, a.tipocuenta1, a.banco2, a.nrocuenta2, a.tipocuenta2, a.banco3, a.nrocuenta3, a.tipocuenta3, a.status ";
                 sql += "FROM tbl_proveedor a ";
                 sql += "INNER JOIN tbl_proveedorgrupo b ON ";
                 sql += "a.id_proveedor = b.fk_proveedor ";
                 sql += "WHERE b.fk_grupomaterial = " + proveedor.getGrupomaterial();
                 break;    
            case 21:
                 sql = "SELECT id_proveedor, rif, nombre, direccion, ciudad, estado, pais, codigopostal, tipo, personacontacto, telefono1, telefono2, correoelectronico, banco1, nrocuenta1, tipocuenta1, banco2, nrocuenta2, tipocuenta2, banco3, nrocuenta3, tipocuenta3, status FROM tbl_proveedor WHERE status = TRUE AND tipo = '" + proveedor.getTipo() + "'";
                 break;       
                 
         }        
        
        
    }
}
