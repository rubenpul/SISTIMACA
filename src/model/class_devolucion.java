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
public class class_devolucion {
    
    private Integer id_devolucion;
    private Integer fk_material;
    private Integer fk_proyecto;
    private Integer fk_almacen;
    private Integer fk_ubicacion;
    private Integer fk_motivo;
    private Integer fk_proveedor;
    private Integer fk_usuario;
    private String  codigo_umb;
    private String descripcionmotivo;
    private Integer posicion;
    private Integer nro_documentoentrada;
    private Integer nro_documentodevolucion;
    private Integer orden_compra;
    private String  fecha_entrada;
    private Double  cantidad_devuelta;
    private Double cantidad_reingresada;
    private String fecha_reingreso;
    private String fecha_devuelta;
    private String foto;
    private Boolean estatus;

    public class_devolucion(Integer id_devolucion,Integer fk_material, Integer fk_proyecto, Integer fk_almacen, Integer fk_ubicacion, Integer fk_motivo, Integer fk_proveedor, Integer fk_usuario, String codigo_umb, String descripcionmotivo, Integer posicion, Integer nro_documentoentrada, Integer nro_documentodevolucion, Integer orden_compra, String fecha_entrada, Double cantidad_devuelta, Double cantidad_reingresada, String fecha_reingreso, String fecha_devuelta, String foto, Boolean estatus) {
        this.id_devolucion = id_devolucion;
        this.fk_material = fk_material;
        this.fk_proyecto = fk_proyecto;
        this.fk_almacen = fk_almacen;
        this.fk_ubicacion = fk_ubicacion;
        this.fk_motivo = fk_motivo;
        this.fk_proveedor = fk_proveedor;
        this.fk_usuario = fk_usuario;
        this.codigo_umb = codigo_umb;
        this.descripcionmotivo = descripcionmotivo;
        this.posicion = posicion;
        this.nro_documentoentrada = nro_documentoentrada;
        this.nro_documentodevolucion = nro_documentodevolucion;
        this.orden_compra = orden_compra;
        this.fecha_entrada = fecha_entrada;
        this.cantidad_devuelta = cantidad_devuelta;
        this.cantidad_reingresada = cantidad_reingresada;
        this.fecha_reingreso = fecha_reingreso;
        this.fecha_devuelta = fecha_devuelta;
        this.foto = foto;
        this.estatus = estatus;
    }

    public Integer getId_devolucion() {
        return id_devolucion;
    }

    public void setId_devolucion(Integer id_devolucion) {
        this.id_devolucion = id_devolucion;
    }

    
    
    public String getFecha_reingreso() {
        return fecha_reingreso;
    }

    public void setFecha_reingreso(String fecha_reingreso) {
        this.fecha_reingreso = fecha_reingreso;
    }

    public Integer getFk_material() {
        return fk_material;
    }

    public void setFk_material(Integer fk_material) {
        this.fk_material = fk_material;
    }

    public Integer getFk_proyecto() {
        return fk_proyecto;
    }

    public void setFk_proyecto(Integer fk_proyecto) {
        this.fk_proyecto = fk_proyecto;
    }

    public Integer getFk_almacen() {
        return fk_almacen;
    }

    public void setFk_almacen(Integer fk_almacen) {
        this.fk_almacen = fk_almacen;
    }

    public Integer getFk_ubicacion() {
        return fk_ubicacion;
    }

    public void setFk_ubicacion(Integer fk_ubicacion) {
        this.fk_ubicacion = fk_ubicacion;
    }

    public Integer getFk_motivo() {
        return fk_motivo;
    }

    public void setFk_motivo(Integer fk_motivo) {
        this.fk_motivo = fk_motivo;
    }

    public Integer getFk_proveedor() {
        return fk_proveedor;
    }

    public void setFk_proveedor(Integer fk_proveedor) {
        this.fk_proveedor = fk_proveedor;
    }

    public Integer getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(Integer fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    public String getCodigo_umb() {
        return codigo_umb;
    }

    public void setCodigo_umb(String codigo_umb) {
        this.codigo_umb = codigo_umb;
    }

    public String getDescripcionmotivo() {
        return descripcionmotivo;
    }

    public void setDescripcionmotivo(String descripcionmotivo) {
        this.descripcionmotivo = descripcionmotivo;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Integer getNro_documentoentrada() {
        return nro_documentoentrada;
    }

    public void setNro_documentoentrada(Integer nro_documentoentrada) {
        this.nro_documentoentrada = nro_documentoentrada;
    }

    public Integer getNro_documentodevolucion() {
        return nro_documentodevolucion;
    }

    public void setNro_documentodevolucion(Integer nro_documentodevolucion) {
        this.nro_documentodevolucion = nro_documentodevolucion;
    }

    public Integer getOrden_compra() {
        return orden_compra;
    }

    public void setOrden_compra(Integer orden_compra) {
        this.orden_compra = orden_compra;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Double getCantidad_devuelta() {
        return cantidad_devuelta;
    }

    public void setCantidad_devuelta(Double cantidad_devuelta) {
        this.cantidad_devuelta = cantidad_devuelta;
    }

    public Double getCantidad_reingresada() {
        return cantidad_reingresada;
    }

    public void setCantidad_reingresada(Double cantidad_reingresada) {
        this.cantidad_reingresada = cantidad_reingresada;
    }

    public String getFecha_devuelta() {
        return fecha_devuelta;
    }

    public void setFecha_devuelta(String fecha_devuelta) {
        this.fecha_devuelta = fecha_devuelta;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }
    
    
}
