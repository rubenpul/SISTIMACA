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
public class class_umb {
    
    private Integer id_umb;
    private String cod_umb;
    private String descripcionumb;
    private boolean status;

    public class_umb(Integer id_umb,String cod_umb, String descripcionumb) {
        this.id_umb = id_umb;
        this.cod_umb = cod_umb;
        this.descripcionumb = descripcionumb;
    }

    public String getCod_umb() {
        return cod_umb;
    }

    public void setCod_umb(String cod_umb) {
        this.cod_umb = cod_umb;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public Integer getId_umb() {
        return id_umb;
    }

    public void setId_umb(Integer id_umb) {
        this.id_umb = id_umb;
    }

    public String getDescripcionumb() {
        return descripcionumb;
    }

    public void setDescripcionumb(String descripcionumb) {
        this.descripcionumb = descripcionumb;
    }
    
    
    
    
}
