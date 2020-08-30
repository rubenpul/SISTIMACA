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
public class class_clasematerial {
    
    private Integer id_clasematerial;
    private String codigo_clasematerial;
    private String descripcionclasematerial;
    private Integer id_clasematerial_alter;
    private boolean status;
    
    public class_clasematerial(Integer id_clasematerial, String codigo_clasematerial,String descripcionclasematerial, Integer id_clasematerial_alter) {
        this.id_clasematerial = id_clasematerial;
        this.codigo_clasematerial = codigo_clasematerial;
        this.descripcionclasematerial = descripcionclasematerial;
        this.id_clasematerial_alter = id_clasematerial_alter;
    }

    public String getCodigo_clasematerial() {
        return codigo_clasematerial;
    }

    public void setCodigo_clasematerial(String codigo_clasematerial) {
        this.codigo_clasematerial = codigo_clasematerial;
    }

        
    public Integer getId_clasematerial() {
        return id_clasematerial;
    }

    public void setId_clasematerial(Integer id_clasematerial) {
        this.id_clasematerial = id_clasematerial;
    }

    public String getDescripcionclasematerial() {
        return descripcionclasematerial;
    }

    public void setDescripcionclasematerial(String descripcionclasematerial) {
        this.descripcionclasematerial = descripcionclasematerial;
    }

    public Integer getId_clasematerial_alter() {
        return id_clasematerial_alter;
    }

    public void setId_clasematerial_alter(Integer id_clasematerial_alter) {
        this.id_clasematerial_alter = id_clasematerial_alter;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
            
    
    
    
    
}
