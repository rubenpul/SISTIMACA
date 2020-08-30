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
public class class_empresa {
    
    private Integer id_empresa;
    private String descripcionempresa;
    private Integer id_empresa_alter;
    private boolean status;

    public class_empresa(Integer id_empresa, String descripcionempresa, Integer id_empresa_alter) {
        this.id_empresa = id_empresa;
        this.descripcionempresa = descripcionempresa;
        this.id_empresa_alter = id_empresa_alter;
    }

    public Integer getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getDescripcionempresa() {
        return descripcionempresa;
    }

    public void setDescripcionempresa(String descripcionempresa) {
        this.descripcionempresa = descripcionempresa;
    }

    public Integer getId_empresa_alter() {
        return id_empresa_alter;
    }

    public void setId_empresa_alter(Integer id_empresa_alter) {
        this.id_empresa_alter = id_empresa_alter;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
            
    
    
}
