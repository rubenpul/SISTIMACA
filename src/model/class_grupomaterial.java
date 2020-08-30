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
public class class_grupomaterial {
    
    private Integer id_grupomaterial;
    private String descripciongrupomaterial;
    private Integer id_grupomaterial_alter;
    private boolean status;

    public class_grupomaterial(Integer id_grupomaterial, String descripciongrupomaterial, Integer id_grupomaterial_alter) {
        this.id_grupomaterial = id_grupomaterial;
        this.descripciongrupomaterial = descripciongrupomaterial;
        this.id_grupomaterial_alter = id_grupomaterial_alter;
    }

    public Integer getId_grupomaterial() {
        return id_grupomaterial;
    }

    public void setId_grupomaterial(Integer id_grupomaterial) {
        this.id_grupomaterial = id_grupomaterial;
    }

    public String getDescripciongrupomaterial() {
        return descripciongrupomaterial;
    }

    public void setDescripciongrupomaterial(String descripciongrupomaterial) {
        this.descripciongrupomaterial = descripciongrupomaterial;
    }

    public Integer getId_grupomaterial_alter() {
        return id_grupomaterial_alter;
    }

    public void setId_grupomaterial_alter(Integer id_grupomaterial_alter) {
        this.id_grupomaterial_alter = id_grupomaterial_alter;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
