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
public class class_area {
    
    private Integer id_area;
    private String descripcionarea;
    private Integer id_area_alter;
    private boolean status;

    public class_area(Integer id_area, String descripcionarea, Integer id_area_alter) {
        this.id_area = id_area;
        this.descripcionarea = descripcionarea;
        this.id_area_alter = id_area_alter;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Integer getId_area() {
        return id_area;
    }

    public void setId_area(Integer id_area) {
        this.id_area = id_area;
    }

    public String getDescripcionarea() {
        return descripcionarea;
    }

    public void setDescripcionarea(String descripcionarea) {
        this.descripcionarea = descripcionarea;
    }

    public Integer getId_area_alter() {
        return id_area_alter;
    }

    public void setId_area_alter(Integer id_area_alter) {
        this.id_area_alter = id_area_alter;
    }
    
    
    
}
