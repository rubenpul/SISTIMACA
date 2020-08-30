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
public class class_proyecto {
    
    private Integer id;
    private String id_proyecto;
    private String descripcionproyecto;
    private String fechadesde;
    private String fechahasta;
    private boolean status;
    private Integer id_proyecto_alter;
    private Integer cedula;
    private String nombres;
    private String tipo_orden;
    private String nro_orden;
    private String cliente;
    
    public class_proyecto(Integer id,String id_proyecto, String descripcionproyecto, String fechadesde, String fechahasta, String tipo_orden,String nro_orden,String cliente,Integer id_proyecto_alter) {
        this.id = id;
        this.id_proyecto = id_proyecto;
        this.descripcionproyecto = descripcionproyecto;
        this.fechadesde = fechadesde;
        this.fechahasta = fechahasta;
        this.tipo_orden = tipo_orden;
        this.nro_orden = nro_orden;
        this.cliente = cliente;
        this.id_proyecto_alter = id_proyecto_alter;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
    public String getNro_orden() {
        return nro_orden;
    }

    public void setNro_orden(String nro_orden) {
        this.nro_orden = nro_orden;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String getTipo_orden() {
        return tipo_orden;
    }

    public void setTipo_orden(String tipo_orden) {
        this.tipo_orden = tipo_orden;
    }
    
    
    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

   
    public String getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(String id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getDescripcionproyecto() {
        return descripcionproyecto;
    }

    public void setDescripcionproyecto(String descripcionproyecto) {
        this.descripcionproyecto = descripcionproyecto;
    }

    public String getFechadesde() {
        return fechadesde;
    }

    public void setFechadesde(String fechadesde) {
        this.fechadesde = fechadesde;
    }

    public String getFechahasta() {
        return fechahasta;
    }

    public void setFechahasta(String fechahasta) {
        this.fechahasta = fechahasta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Integer getId_proyecto_alter() {
        return id_proyecto_alter;
    }

    public void setId_proyecto_alter(Integer id_proyecto_alter) {
        this.id_proyecto_alter = id_proyecto_alter;
    }
    
    
    
    
}
