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
public class class_ordendecompra {
    
    private Integer id_compra;
    private String proveedor;
    private Integer id_solicitud;
    private Integer posicion;
    private Integer nro_material;
    private Integer cantidad_comprar;
    private Double precio_unitario;
    private Double precio_total;
    private String fecha_compra;
    private String justificacion;
    private String observacion;
    
    private boolean status;

    public class_ordendecompra(Integer id_compra, String proveedor, Integer id_solicitud, Integer posicion, Integer nro_material, Integer cantidad_comprar, Double precio_unitario, Double precio_total, String fecha_compra, String justificacion, String observacion) {
        this.id_compra = id_compra;
        this.proveedor = proveedor;
        this.id_solicitud = id_solicitud;
        this.posicion = posicion;
        this.nro_material = nro_material;
        this.cantidad_comprar = cantidad_comprar;
        this.precio_unitario = precio_unitario;
        this.precio_total = precio_total;
        this.fecha_compra = fecha_compra;
        this.justificacion = justificacion;
        this.observacion = observacion;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
    public Integer getId_compra() {
        return id_compra;
    }

    public void setId_compra(Integer id_compra) {
        this.id_compra = id_compra;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Integer getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(Integer id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Integer getNro_material() {
        return nro_material;
    }

    public void setNro_material(Integer nro_material) {
        this.nro_material = nro_material;
    }

    public Integer getCantidad_comprar() {
        return cantidad_comprar;
    }

    public void setCantidad_comprar(Integer cantidad_comprar) {
        this.cantidad_comprar = cantidad_comprar;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public Double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(Double precio_total) {
        this.precio_total = precio_total;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    
    
    
}