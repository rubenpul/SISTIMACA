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
public class class_salida {
    
    
    private Integer id_salida;
    private Integer posicion;
    private Integer id_material;
    private String descripcion_material;
    private Integer id_usuario;
    private String nombre_usuario;
    private Integer id_almacen;
    private String descripcion_almacen;
    private Integer id_ubicacion;
    private String descripcion_ubicacion;
    private String fecha_salida;
    private Integer cantidad_salida;
    private Integer id_proyecto;
    private Integer id_movimiento;
    private Integer id_documento;
    private String destino;
    private String justificacion;
    private boolean status;

    public class_salida(Integer id_salida, Integer posicion, Integer id_material, String descripcion_material, Integer id_usuario, String nombre_usuario, Integer id_almacen, String descripcion_almacen, Integer id_ubicacion, String descripcion_ubicacion, String fecha_salida, Integer cantidad_salida, Integer id_proyecto, Integer id_movimiento, Integer id_documento,String destino, String justificacion, boolean status) {
        this.id_salida = id_salida;
        this.posicion = posicion;
        this.id_material = id_material;
        this.descripcion_material = descripcion_material;
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.id_almacen = id_almacen;
        this.descripcion_almacen = descripcion_almacen;
        this.id_ubicacion = id_ubicacion;
        this.descripcion_ubicacion = descripcion_ubicacion;
        this.fecha_salida = fecha_salida;
        this.cantidad_salida = cantidad_salida;
        this.id_proyecto = id_proyecto;
        this.id_movimiento = id_movimiento;
        this.id_documento = id_documento;
        this.destino = destino;
        this.justificacion = justificacion;
        this.status = status;
    }

    public Integer getId_documento() {
        return id_documento;
    }

    public void setId_documento(Integer id_documento) {
        this.id_documento = id_documento;
    }

       
    public Integer getId_movimiento() {
        return id_movimiento;
    }

    public void setId_movimiento(Integer id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public Integer getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(Integer id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public String getDescripcion_ubicacion() {
        return descripcion_ubicacion;
    }

    public void setDescripcion_ubicacion(String descripcion_ubicacion) {
        this.descripcion_ubicacion = descripcion_ubicacion;
    }

    
    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public Integer getId_salida() {
        return id_salida;
    }

    public void setId_salida(Integer id_salida) {
        this.id_salida = id_salida;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
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

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
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

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Integer getCantidad_salida() {
        return cantidad_salida;
    }

    public void setCantidad_salida(Integer cantidad_salida) {
        this.cantidad_salida = cantidad_salida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
