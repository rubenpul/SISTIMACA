/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ruben
 */
public class class_almacen {
   
    private Integer id_almacen;
    private String codigo_almacen;
    private String descripcion;
    private String tipo;
    private boolean status;
    private Integer id_almacen_alter;

   
    public class_almacen(Integer id_almacen, String codigo_almacen,String descripcion, String tipo,Integer id_almacen_alter) {
        this.id_almacen = id_almacen;
        this.codigo_almacen = codigo_almacen;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.id_almacen_alter = id_almacen_alter;
    }

    public String getCodigo_almacen() {
        return codigo_almacen;
    }

    public void setCodigo_almacen(String codigo_almacen) {
        this.codigo_almacen = codigo_almacen;
    }
    
    

    public Integer getId_almacen_alter() {
        return id_almacen_alter;
    }

    public void setId_almacen_alter(Integer id_almacen_alter) {
        this.id_almacen_alter = id_almacen_alter;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
        
    public Integer getId_almacen() {
        return id_almacen;
    }

    public void setId_almacen(Integer id_almacen) {
        this.id_almacen = id_almacen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
