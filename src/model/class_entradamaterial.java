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
public class class_entradamaterial {
    
        private Integer id_entrada; 
        private Integer fk_material; 
        private Integer fk_solicitud; 
        private Integer id_documento; 
        private Integer orden_compra; 
        private Integer nro_factura; 
        private String fecha_llegada;
        private Integer cantidad_recibida; 
        private Double precio_unitario;
        private Double monto; 
        private Double flete; 
        private Double total;
        private String observaciones;

    public class_entradamaterial(Integer id_entrada, Integer fk_material, Integer fk_solicitud, Integer id_documento, Integer orden_compra, Integer nro_factura, String fecha_llegada, Integer cantidad_recibida, Double precio_unitario, Double monto, Double flete, Double total, String observaciones) {
        this.id_entrada = id_entrada;
        this.fk_material = fk_material;
        this.fk_solicitud = fk_solicitud;
        this.id_documento = id_documento;
        this.orden_compra = orden_compra;
        this.nro_factura = nro_factura;
        this.fecha_llegada = fecha_llegada;
        this.cantidad_recibida = cantidad_recibida;
        this.precio_unitario = precio_unitario;
        this.monto = monto;
        this.flete = flete;
        this.total = total;
        this.observaciones = observaciones;
    }

    public Integer getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(Integer id_entrada) {
        this.id_entrada = id_entrada;
    }

    public Integer getFk_material() {
        return fk_material;
    }

    public void setFk_material(Integer fk_material) {
        this.fk_material = fk_material;
    }

    public Integer getFk_solicitud() {
        return fk_solicitud;
    }

    public void setFk_solicitud(Integer fk_solicitud) {
        this.fk_solicitud = fk_solicitud;
    }

    public Integer getId_documento() {
        return id_documento;
    }

    public void setId_documento(Integer id_documento) {
        this.id_documento = id_documento;
    }

    public Integer getOrden_compra() {
        return orden_compra;
    }

    public void setOrden_compra(Integer orden_compra) {
        this.orden_compra = orden_compra;
    }

    public Integer getNro_factura() {
        return nro_factura;
    }

    public void setNro_factura(Integer nro_factura) {
        this.nro_factura = nro_factura;
    }

    public String getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(String fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public Integer getCantidad_recibida() {
        return cantidad_recibida;
    }

    public void setCantidad_recibida(Integer cantidad_recibida) {
        this.cantidad_recibida = cantidad_recibida;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getFlete() {
        return flete;
    }

    public void setFlete(Double flete) {
        this.flete = flete;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
        
        
        
        
}
