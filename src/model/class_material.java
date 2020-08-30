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
public class class_material {
    
        private Integer id_material;
        private Integer numero_material;
        private String codigo_mat_alter; 
        private String foto_material; 
        private String descripcion; 
        private String marca; 
        private String modelo; 
        private Integer unidad_medida;
        private String descripcion_medida;
        private Integer stock_inicial; 
        private Integer stock_disponible;
        private Integer stock_usado; 
        private Integer stock_minimo; 
        private Integer stock_pedido; 
        private Integer stock_maximo; 
        private Double preciounitario; 
        private Double preciototal; 
        private String fecha_actualizacion;
        private Integer id_usuario; 
        private String descripcionusuario;
        private Integer cantidad_entrante;
        private Integer cantidad_saliente; 
        private String observaciones; 
        private String usomaterial;
        
        private Integer id_clasearticulo;
        private String descripcionclasearticulo;
        private Integer id_grupoarticulo;
        private String descripciongrupoarticulo;
        private Integer id_moneda;
        private String descripcionmoneda;
        private String ubicacion;
        private Integer id_almacen;
        private String descripcionalmacen;
        private Integer id_empresa;
        private String descripcionempresa;
        private Integer id_valoracion;
        private String descripcionvaloracion;
        private boolean status;

    public class_material(Integer id_material, Integer numero_material, String codigo_mat_alter, String foto_material, String descripcion, String marca, String modelo, Integer unidad_medida, String descripcion_medida, Integer stock_inicial, Integer stock_disponible, Integer stock_usado, Integer stock_minimo, Integer stock_pedido, Integer stock_maximo, Double preciounitario, Double preciototal, String fecha_actualizacion, Integer id_usuario, String descripcionusuario, Integer cantidad_entrante, Integer cantidad_saliente, String observaciones, String usomaterial, Integer id_clasearticulo, String descripcionclasearticulo, Integer id_grupoarticulo, String descripciongrupoarticulo, Integer id_moneda,String descripcionmoneda, String ubicacion, Integer id_almacen, String descripcionalmacen, Integer id_empresa, String descripcionempresa, Integer id_valoracion, String descripcionvaloracion,Boolean status) {
        this.id_material = id_material;
        this.numero_material = numero_material;
        this.codigo_mat_alter = codigo_mat_alter;
        this.foto_material = foto_material;
        this.descripcion = descripcion;
        this.marca = marca;
        this.modelo = modelo;
        this.unidad_medida = unidad_medida;
        this.descripcion_medida = descripcion_medida;
        this.stock_inicial = stock_inicial;
        this.stock_disponible = stock_disponible;
        this.stock_usado = stock_usado;
        this.stock_minimo = stock_minimo;
        this.stock_pedido = stock_pedido;
        this.stock_maximo = stock_maximo;
        this.preciounitario = preciounitario;
        this.preciototal = preciototal;
        this.fecha_actualizacion = fecha_actualizacion;
        this.id_usuario = id_usuario;
        this.descripcionusuario = descripcionusuario;
        this.cantidad_entrante = cantidad_entrante;
        this.cantidad_saliente = cantidad_saliente;
        this.observaciones = observaciones;
        this.usomaterial = usomaterial;
        this.id_clasearticulo = id_clasearticulo;
        this.descripcionclasearticulo = descripcionclasearticulo;
        this.id_grupoarticulo = id_grupoarticulo;
        this.descripciongrupoarticulo = descripciongrupoarticulo;
        this.id_moneda = id_moneda;
        this.descripcionmoneda = descripcionmoneda;
        this.ubicacion = ubicacion;
        this.id_almacen = id_almacen;
        this.descripcionalmacen = descripcionalmacen;
        this.id_empresa = id_empresa;
        this.descripcionempresa = descripcionempresa;
        this.id_valoracion = id_valoracion;
        this.descripcionvaloracion = descripcionvaloracion;
        this.status = status;
    }

    
    public String getDescripcion_medida() {
        return descripcion_medida;
    }

    public void setDescripcion_medida(String descripcion_medida) {
        this.descripcion_medida = descripcion_medida;
    }
    
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    public Integer getId_clasearticulo() {
        return id_clasearticulo;
    }

    public void setId_clasearticulo(Integer id_clasearticulo) {
        this.id_clasearticulo = id_clasearticulo;
    }

    public Integer getId_grupoarticulo() {
        return id_grupoarticulo;
    }

    public void setId_grupoarticulo(Integer id_grupoarticulo) {
        this.id_grupoarticulo = id_grupoarticulo;
    }

    public Integer getId_moneda() {
        return id_moneda;
    }

    public void setId_moneda(Integer id_moneda) {
        this.id_moneda = id_moneda;
    }

    public Integer getId_material() {
        return id_material;
    }

    public void setId_material(Integer id_material) {
        this.id_material = id_material;
    }

    public Integer getNumero_material() {
        return numero_material;
    }

    public void setNumero_material(Integer numero_material) {
        this.numero_material = numero_material;
    }

    public String getCodigo_mat_alter() {
        return codigo_mat_alter;
    }

    public void setCodigo_mat_alter(String codigo_mat_alter) {
        this.codigo_mat_alter = codigo_mat_alter;
    }

    public String getFoto_material() {
        return foto_material;
    }

    public void setFoto_material(String foto_material) {
        this.foto_material = foto_material;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(Integer unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public Integer getStock_inicial() {
        return stock_inicial;
    }

    public void setStock_inicial(Integer stock_inicial) {
        this.stock_inicial = stock_inicial;
    }

    public Integer getStock_disponible() {
        return stock_disponible;
    }

    public void setStock_disponible(Integer stock_disponible) {
        this.stock_disponible = stock_disponible;
    }

    public Integer getStock_usado() {
        return stock_usado;
    }

    public void setStock_usado(Integer stock_usado) {
        this.stock_usado = stock_usado;
    }

    public Integer getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(Integer stock_minimo) {
        this.stock_minimo = stock_minimo;
    }

    public Integer getStock_pedido() {
        return stock_pedido;
    }

    public void setStock_pedido(Integer stock_pedido) {
        this.stock_pedido = stock_pedido;
    }

    public Integer getStock_maximo() {
        return stock_maximo;
    }

    public void setStock_maximo(Integer stock_maximo) {
        this.stock_maximo = stock_maximo;
    }

    public Double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(Double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public Double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(Double preciototal) {
        this.preciototal = preciototal;
    }

    public String getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(String fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getDescripcionusuario() {
        return descripcionusuario;
    }

    public void setDescripcionusuario(String descripcionusuario) {
        this.descripcionusuario = descripcionusuario;
    }

    public Integer getCantidad_entrante() {
        return cantidad_entrante;
    }

    public void setCantidad_entrante(Integer cantidad_entrante) {
        this.cantidad_entrante = cantidad_entrante;
    }

    public Integer getCantidad_saliente() {
        return cantidad_saliente;
    }

    public void setCantidad_saliente(Integer cantidad_saliente) {
        this.cantidad_saliente = cantidad_saliente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getUsomaterial() {
        return usomaterial;
    }

    public void setUsomaterial(String usomaterial) {
        this.usomaterial = usomaterial;
    }

   
    public String getDescripcionclasearticulo() {
        return descripcionclasearticulo;
    }

    public void setDescripcionclasearticulo(String descripcionclasearticulo) {
        this.descripcionclasearticulo = descripcionclasearticulo;
    }

   
    public String getDescripciongrupoarticulo() {
        return descripciongrupoarticulo;
    }

    public void setDescripciongrupoarticulo(String descripciongrupoarticulo) {
        this.descripciongrupoarticulo = descripciongrupoarticulo;
    }

    public String getDescripcionmoneda() {
        return descripcionmoneda;
    }

    public void setDescripcionmoneda(String descripcionmoneda) {
        this.descripcionmoneda = descripcionmoneda;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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

    public Integer getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getDescripcionempresa() {
        return descripcionempresa;
    }

    public void setDescripcionempresa(String descripcionempresa) {
        this.descripcionempresa = descripcionempresa;
    }

    public Integer getId_valoracion() {
        return id_valoracion;
    }

    public void setId_valoracion(Integer id_valoracion) {
        this.id_valoracion = id_valoracion;
    }

    public String getDescripcionvaloracion() {
        return descripcionvaloracion;
    }

    public void setDescripcionvaloracion(String descripcionvaloracion) {
        this.descripcionvaloracion = descripcionvaloracion;
    }
        
        
        
        
        
        
}
