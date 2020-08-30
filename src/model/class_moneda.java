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
public class class_moneda {
    
    private Integer id_moneda;
    private String cod_moneda;
    private String descripcionmoneda;
    private boolean status;

    public class_moneda(Integer id_moneda,String cod_moneda, String descripcionmoneda) {
        this.id_moneda = id_moneda;
        this.cod_moneda = cod_moneda;
        this.descripcionmoneda = descripcionmoneda;
    }

    public String getCod_moneda() {
        return cod_moneda;
    }

    public void setCod_moneda(String cod_moneda) {
        this.cod_moneda = cod_moneda;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public Integer getId_moneda() {
        return id_moneda;
    }

    public void setId_moneda(Integer id_moneda) {
        this.id_moneda = id_moneda;
    }

    public String getDescripcionmoneda() {
        return descripcionmoneda;
    }

    public void setDescripcionmoneda(String descripcionmoneda) {
        this.descripcionmoneda = descripcionmoneda;
    }
    
    
    
    
}
