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
public class class_entrada {
    
    private Integer id_entrada;
    private Integer posicion;
    private Integer id_material;
    private String descripcion_material;
    private class_solicitud solicitud;
    private Integer id_valoracion;
    private String descripcion_valoracion;
    private Integer id_moneda;
    private String descripcion_moneda;
    private Integer id_almacen;
    private String descripcion_almacen;
    private Integer ubicacion;
    private String descripcion_ubicacion;
    private Integer procedencia;
    private String descripcion_procedencia;
    private Integer clase_movimiento;
    private String descripcion_movimiento;
    private Integer id_proyecto;
    private String descripcion_proyecto;
    private Integer Id_usuario;
    private String codigo_alterno;
    private Integer id_documento;
    private Integer id_ordendecompra;
    private Integer nro_factura;
    private String fecha_entrada;
    private Integer cantidad_ingresada;
    private Double precio_unitario;
    private Double monto;
    private Double flete;
    private Double total;
    private String observaciones;
    private boolean status;

    public class_entrada(Integer id_entrada,Integer posicion,Integer id_material, String descripcion_material, Integer id_valoracion, String descripcion_valoracion, Integer id_moneda, String descripcion_moneda, Integer id_almacen, String descripcion_almacen, Integer ubicacion, String descripcion_ubicacion, Integer procedencia, String descripcion_procedencia,Integer clase_movimiento, String descripcion_movimiento,Integer id_proyecto, String descripcion_proyecto, Integer Id_usuario,String codigo_alterno,Integer id_documento, Integer id_ordendecompra, Integer nro_factura, String fecha_entrada, Integer cantidad_ingresada, Double precio_unitario, Double monto, Double flete, Double total, String observaciones,Boolean status) {
        this.id_entrada = id_entrada;
        this.posicion = posicion;
        this.id_material = id_material;
        this.descripcion_material = descripcion_material;
        this.id_valoracion = id_valoracion;
        this.descripcion_valoracion = descripcion_valoracion;
        this.id_moneda = id_moneda;
        this.descripcion_moneda = descripcion_moneda;
        this.id_almacen = id_almacen;
        this.descripcion_almacen = descripcion_almacen;
        this.ubicacion = ubicacion;
        this.descripcion_ubicacion = descripcion_ubicacion;
        this.procedencia = procedencia;
        this.descripcion_procedencia = descripcion_procedencia;
        this.clase_movimiento = clase_movimiento;
        this.descripcion_movimiento = descripcion_movimiento;
        this.id_proyecto = id_proyecto;
        this.descripcion_proyecto = descripcion_proyecto;
        this.Id_usuario = Id_usuario;
        this.codigo_alterno = codigo_alterno;
        this.id_documento = id_documento;
        this.id_ordendecompra = id_ordendecompra;
        this.nro_factura = nro_factura;
        this.fecha_entrada = fecha_entrada;
        this.cantidad_ingresada = cantidad_ingresada;
        this.precio_unitario = precio_unitario;
        this.monto = monto;
        this.flete = flete;
        this.total = total;
        this.observaciones = observaciones;
        this.status = status;
    }

    public Integer getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(Integer Id_usuario) {
        this.Id_usuario = Id_usuario;
    }

    
    
    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getDescripcion_proyecto() {
        return descripcion_proyecto;
    }

    public void setDescripcion_proyecto(String descripcion_proyecto) {
        this.descripcion_proyecto = descripcion_proyecto;
    }

    
    
    public Integer getClase_movimiento() {
        return clase_movimiento;
    }

    public void setClase_movimiento(Integer clase_movimiento) {
        this.clase_movimiento = clase_movimiento;
    }

    public String getDescripcion_movimiento() {
        return descripcion_movimiento;
    }

    public void setDescripcion_movimiento(String descripcion_movimiento) {
        this.descripcion_movimiento = descripcion_movimiento;
    }
    
    

    public String getCodigo_alterno() {
        return codigo_alterno;
    }

    public void setCodigo_alterno(String codigo_alterno) {
        this.codigo_alterno = codigo_alterno;
    }

    
    
    
    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(Integer procedencia) {
        this.procedencia = procedencia;
    }

    public String getDescripcion_procedencia() {
        return descripcion_procedencia;
    }

    public void setDescripcion_procedencia(String descripcion_procedencia) {
        this.descripcion_procedencia = descripcion_procedencia;
    }

    
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescripcion_ubicacion() {
        return descripcion_ubicacion;
    }

    public void setDescripcion_ubicacion(String descripcion_ubicacion) {
        this.descripcion_ubicacion = descripcion_ubicacion;
    }

    
    
    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Integer getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(Integer id_entrada) {
        this.id_entrada = id_entrada;
    }

    public Integer getId_material() {
        return id_material;
    }

    public void setId_material(Integer id_material) {
        this.id_material = id_material;
    }

    public String getDescripcion_material() {
        return descripcion_material;
    }

    public void setDescripcion_material(String descripcion_material) {
        this.descripcion_material = descripcion_material;
    }

    public Integer getId_valoracion() {
        return id_valoracion;
    }

    public void setId_valoracion(Integer id_valoracion) {
        this.id_valoracion = id_valoracion;
    }

    public String getDescripcion_valoracion() {
        return descripcion_valoracion;
    }

    public void setDescripcion_valoracion(String descripcion_valoracion) {
        this.descripcion_valoracion = descripcion_valoracion;
    }

    public Integer getId_moneda() {
        return id_moneda;
    }

    public void setId_moneda(Integer id_moneda) {
        this.id_moneda = id_moneda;
    }

    public String getDescripcion_moneda() {
        return descripcion_moneda;
    }

    public void setDescripcion_moneda(String descripcion_moneda) {
        this.descripcion_moneda = descripcion_moneda;
    }

    public Integer getId_almacen() {
        return id_almacen;
    }

    public void setId_almacen(Integer id_almacen) {
        this.id_almacen = id_almacen;
    }

    public String getDescripcion_almacen() {
        return descripcion_almacen;
    }

    public void setDescripcion_almacen(String descripcion_almacen) {
        this.descripcion_almacen = descripcion_almacen;
    }


    
    public Integer getId_documento() {
        return id_documento;
    }

    public void setId_documento(Integer id_documento) {
        this.id_documento = id_documento;
    }

    public Integer getId_ordendecompra() {
        return id_ordendecompra;
    }

    public void setId_ordendecompra(Integer id_ordendecompra) {
        this.id_ordendecompra = id_ordendecompra;
    }

    public Integer getNro_factura() {
        return nro_factura;
    }

    public void setNro_factura(Integer nro_factura) {
        this.nro_factura = nro_factura;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Integer getCantidad_ingresada() {
        return cantidad_ingresada;
    }

    public void setCantidad_ingresada(Integer cantidad_ingresada) {
        this.cantidad_ingresada = cantidad_ingresada;
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
