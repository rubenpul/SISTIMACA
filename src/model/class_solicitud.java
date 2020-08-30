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
public class class_solicitud {
    
    private Integer id_solicitud;
    private Integer cedula;
    private Integer id_area;
    private String descripcion_area;
    private Integer id_tiposolicitud;
    private String descripcion_tiposolicitud;
    private Integer id_material;
    private Integer numero_material;
    private String descripcion_material;
    private Integer id_empresa;
    private String descripcion_empresa;
    private Integer id_proyecto;
    private String descripcion_proyecto;
    private Integer posicion;
    
    private Integer cantidad_solicitada;
    private Integer cantidad_aprobada;
    private Integer cantidad_autorizada;
    private Integer cantidad_conformada;
    private String fecha_solicitud;
    private String fecha_requerida;
    private String justificacion;
    private boolean autorizado;
    
    private String aprobado_solicitado;
    private String fecha_aprobado_solicitado;
    private String conformado_almacen;
    private String fecha_conformado_almacen;
    private String compras_recibido;
    private String fecha_compras_recibido;
    private String autorizado_gerente;
    private String fecha_autorizado_gerente;
    private String observaciones;
    private boolean status;

    public class_solicitud(Integer id_solicitud, Integer cedula, Integer id_area, String descripcion_area, Integer id_tiposolicitud, String descripcion_tiposolicitud, Integer id_material, Integer numero_material, String descripcion_material, Integer id_empresa, String descripcion_empresa, Integer id_proyecto, String descripcion_proyecto, Integer posicion, Integer cantidad_solicitada,Integer cantidad_aprobada,Integer cantidad_autorizada,Integer cantidad_conformada, String fecha_solicitud, String fecha_requerida, String justificacion, boolean autorizado, String aprobado_solicitado, String fecha_aprobado_solicitado, String conformado_almacen, String fecha_conformado_almacen, String compras_recibido, String fecha_compras_recibido, String autorizado_gerente, String fecha_autorizado_gerente,String observaciones) {
        this.id_solicitud = id_solicitud;
        this.cedula = cedula;
        this.id_area = id_area;
        this.descripcion_area = descripcion_area;
        this.id_tiposolicitud = id_tiposolicitud;
        this.descripcion_tiposolicitud = descripcion_tiposolicitud;
        this.id_material = id_material;
        this.numero_material = numero_material;
        this.descripcion_material = descripcion_material;
        this.id_empresa = id_empresa;
        this.descripcion_empresa = descripcion_empresa;
        this.id_proyecto = id_proyecto;
        this.descripcion_proyecto = descripcion_proyecto;
        this.posicion = posicion;
        this.cantidad_solicitada = cantidad_solicitada;
        this.cantidad_aprobada = cantidad_aprobada;
        this.cantidad_autorizada = cantidad_autorizada;
        this.cantidad_conformada = cantidad_conformada;
        this.fecha_solicitud = fecha_solicitud;
        this.fecha_requerida = fecha_requerida;
        this.justificacion = justificacion;
        this.autorizado = autorizado;
        this.aprobado_solicitado = aprobado_solicitado;
        this.fecha_aprobado_solicitado = fecha_aprobado_solicitado;
        this.conformado_almacen = conformado_almacen;
        this.fecha_conformado_almacen = fecha_conformado_almacen;
        this.compras_recibido = compras_recibido;
        this.fecha_compras_recibido = fecha_compras_recibido;
        this.autorizado_gerente = autorizado_gerente;
        this.fecha_autorizado_gerente = fecha_autorizado_gerente;
        this.observaciones = observaciones;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
    public Integer getCantidad_aprobada() {
        return cantidad_aprobada;
    }

    public void setCantidad_aprobada(Integer cantidad_aprobada) {
        this.cantidad_aprobada = cantidad_aprobada;
    }

    public Integer getCantidad_autorizada() {
        return cantidad_autorizada;
    }

    public void setCantidad_autorizada(Integer cantidad_autorizada) {
        this.cantidad_autorizada = cantidad_autorizada;
    }

    public Integer getCantidad_conformada() {
        return cantidad_conformada;
    }

    public void setCantidad_conformada(Integer cantidad_conformada) {
        this.cantidad_conformada = cantidad_conformada;
    }
    
    

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Integer getNumero_material() {
        return numero_material;
    }

    public void setNumero_material(Integer numero_material) {
        this.numero_material = numero_material;
    }

    public Integer getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(Integer id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
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

    public Integer getId_tiposolicitud() {
        return id_tiposolicitud;
    }

    public void setId_tiposolicitud(Integer id_tiposolicitud) {
        this.id_tiposolicitud = id_tiposolicitud;
    }

    public String getDescripcion_tiposolicitud() {
        return descripcion_tiposolicitud;
    }

    public void setDescripcion_tiposolicitud(String descripcion_tiposolicitud) {
        this.descripcion_tiposolicitud = descripcion_tiposolicitud;
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

    public Integer getCantidad_solicitada() {
        return cantidad_solicitada;
    }

    public void setCantidad_solicitada(Integer cantidad_solicitada) {
        this.cantidad_solicitada = cantidad_solicitada;
    }

    public String getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(String fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public String getFecha_requerida() {
        return fecha_requerida;
    }

    public void setFecha_requerida(String fecha_requerida) {
        this.fecha_requerida = fecha_requerida;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public String getAprobado_solicitado() {
        return aprobado_solicitado;
    }

    public void setAprobado_solicitado(String aprobado_solicitado) {
        this.aprobado_solicitado = aprobado_solicitado;
    }

    public String getFecha_aprobado_solicitado() {
        return fecha_aprobado_solicitado;
    }

    public void setFecha_aprobado_solicitado(String fecha_aprobado_solicitado) {
        this.fecha_aprobado_solicitado = fecha_aprobado_solicitado;
    }

    public String getConformado_almacen() {
        return conformado_almacen;
    }

    public void setConformado_almacen(String conformado_almacen) {
        this.conformado_almacen = conformado_almacen;
    }

    public String getFecha_conformado_almacen() {
        return fecha_conformado_almacen;
    }

    public void setFecha_conformado_almacen(String fecha_conformado_almacen) {
        this.fecha_conformado_almacen = fecha_conformado_almacen;
    }

    public String getCompras_recibido() {
        return compras_recibido;
    }

    public void setCompras_recibido(String compras_recibido) {
        this.compras_recibido = compras_recibido;
    }

    public String getFecha_compras_recibido() {
        return fecha_compras_recibido;
    }

    public void setFecha_compras_recibido(String fecha_compras_recibido) {
        this.fecha_compras_recibido = fecha_compras_recibido;
    }

    public String getAutorizado_gerente() {
        return autorizado_gerente;
    }

    public void setAutorizado_gerente(String autorizado_gerente) {
        this.autorizado_gerente = autorizado_gerente;
    }

    public String getFecha_autorizado_gerente() {
        return fecha_autorizado_gerente;
    }

    public void setFecha_autorizado_gerente(String fecha_autorizado_gerente) {
        this.fecha_autorizado_gerente = fecha_autorizado_gerente;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
}
