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
public class class_prestamo {
    private Integer id_prestamo;
    private Integer id_material;
    private String descripcionmaterial;
    private Integer id_empresa;
    private String descripcion_empresa;
    private Integer id_area;
    private String descripcion_area;
    private String nombre_solicitante;
    private Integer id_almacen;
    private String descripcionalmacen;
    private Integer id_proyecto;
    private String descripcionproyecto;
    private Integer id_ubicacion;
    private String descripcionubicacion;
    private Integer id_documento;
    private Integer posicion;
    private Integer cantidad_prestada;
    private String fecha_solicitud;
    private String fecha_desde;
    private String fecha_hasta;
    private String justificacion;
    private String fecha_recepcion;
    private Boolean dano;
    private String foto;
    private String descripciondano;
    private Integer id_entrada;
    private Boolean status;

    public class_prestamo(Integer id_prestamo, Integer id_material, String descripcionmaterial, Integer id_empresa, String descripcion_empresa, Integer id_area, String descripcion_area, String nombre_solicitante, Integer id_almacen, String descripcionalmacen, Integer id_ubicacion, String descripcionubicacion, Integer id_proyecto, String descripcionproyecto, Integer posicion,Integer cantidad_prestada, Integer id_documento,String fecha_solicitud, String fecha_desde, String fecha_hasta, String justificacion, String fecha_recepcion, Boolean dano, String foto, String descripciondano, Integer id_entrada,Boolean status) {
        this.id_prestamo = id_prestamo;
        this.id_material = id_material;
        this.descripcionmaterial = descripcionmaterial;
        this.id_empresa = id_empresa;
        this.descripcion_empresa = descripcion_empresa;
        this.id_area = id_area;
        this.descripcion_area = descripcion_area;
        this.nombre_solicitante = nombre_solicitante;
        this.id_almacen = id_almacen;
        this.descripcionalmacen = descripcionalmacen;
        this.id_ubicacion = id_ubicacion;
        this.descripcionubicacion = descripcionubicacion;
        this.id_proyecto = id_proyecto;
        this.descripcionproyecto = descripcionproyecto;
        this.posicion = posicion;
        this.cantidad_prestada = cantidad_prestada;
        this.id_documento = id_documento;
        this.fecha_solicitud = fecha_solicitud;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.justificacion = justificacion;
        this.fecha_recepcion = fecha_recepcion;
        this.dano = dano;
        this.foto = foto;
        this.descripciondano = descripciondano;
        this.id_entrada = id_entrada;
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    

    public Integer getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(Integer id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public Integer getId_material() {
        return id_material;
    }

    public void setId_material(Integer id_material) {
        this.id_material = id_material;
    }

    public String getDescripcionmaterial() {
        return descripcionmaterial;
    }

    public void setDescripcionmaterial(String descripcionmaterial) {
        this.descripcionmaterial = descripcionmaterial;
    }

    public Integer getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getDescripcion_empresa() {
        return descripcion_empresa;
    }

    public void setDescripcion_empresa(String descripcion_empresa) {
        this.descripcion_empresa = descripcion_empresa;
    }

    public Integer getId_area() {
        return id_area;
    }

    public void setId_area(Integer id_area) {
        this.id_area = id_area;
    }

    public String getDescripcion_area() {
        return descripcion_area;
    }

    public void setDescripcion_area(String descripcion_area) {
        this.descripcion_area = descripcion_area;
    }

    public String getNombre_solicitante() {
        return nombre_solicitante;
    }

    public void setNombre_solicitante(String nombre_solicitante) {
        this.nombre_solicitante = nombre_solicitante;
    }

    public Integer getId_almacen() {
        return id_almacen;
    }

    public void setId_almacen(Integer id_almacen) {
        this.id_almacen = id_almacen;
    }

    public String getDescripcionalmacen() {
        return descripcionalmacen;
    }

    public void setDescripcionalmacen(String descripcionalmacen) {
        this.descripcionalmacen = descripcionalmacen;
    }

    public Integer getCantidad_prestada() {
        return cantidad_prestada;
    }

    public void setCantidad_prestada(Integer cantidad_prestada) {
        this.cantidad_prestada = cantidad_prestada;
    }

    public String getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(String fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public String getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(String fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public String getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(String fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public String getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(String fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public Boolean getDano() {
        return dano;
    }

    public void setDano(Boolean dano) {
        this.dano = dano;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescripciondano() {
        return descripciondano;
    }

    public void setDescripciondano(String descripciondano) {
        this.descripciondano = descripciondano;
    }

    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getDescripcionproyecto() {
        return descripcionproyecto;
    }

    public void setDescripcionproyecto(String descripcionproyecto) {
        this.descripcionproyecto = descripcionproyecto;
    }

    public Integer getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(Integer id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public String getDescripcionubicacion() {
        return descripcionubicacion;
    }

    public void setDescripcionubicacion(String descripcionubicacion) {
        this.descripcionubicacion = descripcionubicacion;
    }

    public Integer getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(Integer id_entrada) {
        this.id_entrada = id_entrada;
    }

    public Integer getId_documento() {
        return id_documento;
    }

    public void setId_documento(Integer id_documento) {
        this.id_documento = id_documento;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }
    
    
    
    
}
