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
public class class_ubicacion {
    
    private Integer id_ubicacion;
    private String cod_ubicacion;
    private String descripcionubicacion;
    private boolean status;

    public class_ubicacion(Integer id_ubicacion,String cod_ubicacion, String descripcionubicacion) {
        this.id_ubicacion = id_ubicacion;
        this.cod_ubicacion = cod_ubicacion;
        this.descripcionubicacion = descripcionubicacion;
    }

    public String getCod_ubicacion() {
        return cod_ubicacion;
    }

    public void setCod_ubicacion(String cod_ubicacion) {
        this.cod_ubicacion = cod_ubicacion;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public Integer getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(Integer id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public String getDescripcionubicacion() {
        return descripcionubicacion;
    }

    public void setDescripcionubicacion(String descripcionubicacion) {
        this.descripcionubicacion = descripcionubicacion;
    }
    
    
    
    
}
