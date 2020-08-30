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
public class class_cotizacion {
    
    private Integer id_cotizacion;
    private Integer id_proveedor;
    private String rif;
    private String nombre_proveedor;
    private Integer id_solicitud;
    private Integer nro_material;
    private Integer posicion;
    private Integer cedula;
    private Integer codigo_moneda;
    private Integer cantidad_cotizar;
    private Double precio_unitario;
    private Double precio_total;
    private String fecha_cotizacion;
    private String tipoplazoentrega;
    private Integer diasplazoentrega;
    private String condicionpago;
    private String tipotransporteflete;
    private Integer diasflete;
    private Double costoflete;
    private Integer codigo_moneda_flete;
    private String fotocotizacion;
    private String justificacion;
    private String observacion;
    private Boolean recomendacion_comprador;
    private Boolean aprobado_procura;
    private String fecha_aprobado_procura;
    private Boolean aprobado_gerencia;
    private String fecha_aprobado_gerencia;
    private Boolean orden_compra;
    private Integer nro_ordencompra;
    private String fecha_carga_compras;
    private Boolean status;

    public class_cotizacion(Integer id_cotizacion, Integer id_proveedor, String rif, String nombre_proveedor, Integer id_solicitud, Integer nro_material,Integer posicion, Integer cedula, Integer codigo_moneda, Integer cantidad_cotizar, Double precio_unitario, Double precio_total, String fecha_cotizacion, String tipoplazoentrega,Integer diasplazoentrega,String condicionpago,String tipotransporteflete,Integer diasflete,Double costoflete,Integer codigo_moneda_flete,String fotocotizacion,String justificacion, String observacion, Boolean recomendacion_comprador, Boolean aprobado_procura, String fecha_aprobado_procura, Boolean aprobado_gerencia, String fecha_aprobado_gerencia, Boolean orden_compra, Integer nro_ordencompra,String fecha_carga_compras, Boolean status) {
        this.id_cotizacion = id_cotizacion;
        this.id_proveedor = id_proveedor;
        this.rif = rif;
        this.nombre_proveedor = nombre_proveedor;
        this.id_solicitud = id_solicitud;
        this.nro_material = nro_material;
        this.posicion = posicion;
        this.cedula = cedula;
        this.codigo_moneda = codigo_moneda;
        this.cantidad_cotizar = cantidad_cotizar;
        this.precio_unitario = precio_unitario;
        this.precio_total = precio_total;
        this.fecha_cotizacion = fecha_cotizacion;
        this.tipoplazoentrega = tipoplazoentrega;
        this.diasplazoentrega = diasplazoentrega;
        this.condicionpago = condicionpago;
        this.tipotransporteflete = tipotransporteflete;
        this.diasflete = diasflete;
        this.costoflete = costoflete;
        this.codigo_moneda_flete = codigo_moneda_flete;
        this.fotocotizacion = fotocotizacion; 
        this.justificacion = justificacion;
        this.observacion = observacion;
        this.recomendacion_comprador = recomendacion_comprador;
        this.aprobado_procura = aprobado_procura;
        this.fecha_aprobado_procura = fecha_aprobado_procura;
        this.aprobado_gerencia = aprobado_gerencia;
        this.fecha_aprobado_gerencia = fecha_aprobado_gerencia;
        this.orden_compra = orden_compra;
        this.nro_ordencompra = nro_ordencompra;
        this.fecha_carga_compras = fecha_carga_compras;
        this.status = status;
    }

    public String getTipoplazoentrega() {
        return tipoplazoentrega;
    }

    public void setTipoplazoentrega(String tipoplazoentrega) {
        this.tipoplazoentrega = tipoplazoentrega;
    }

    public Integer getDiasplazoentrega() {
        return diasplazoentrega;
    }

    public void setDiasplazoentrega(Integer diasplazoentrega) {
        this.diasplazoentrega = diasplazoentrega;
    }

    public String getTipotransporteflete() {
        return tipotransporteflete;
    }

    public void setTipotransporteflete(String tipotransporteflete) {
        this.tipotransporteflete = tipotransporteflete;
    }

    public Integer getDiasflete() {
        return diasflete;
    }

    public void setDiasflete(Integer diasflete) {
        this.diasflete = diasflete;
    }

    public Double getCostoflete() {
        return costoflete;
    }

    public void setCostoflete(Double costoflete) {
        this.costoflete = costoflete;
    }

    public Integer getCodigo_moneda_flete() {
        return codigo_moneda_flete;
    }

    public void setCodigo_moneda_flete(Integer codigo_moneda_flete) {
        this.codigo_moneda_flete = codigo_moneda_flete;
    }

    public String getFotocotizacion() {
        return fotocotizacion;
    }

    public void setFotocotizacion(String fotocotizacion) {
        this.fotocotizacion = fotocotizacion;
    }

    
    
    public String getFecha_carga_compras() {
        return fecha_carga_compras;
    }

    public void setFecha_carga_compras(String fecha_carga_compras) {
        this.fecha_carga_compras = fecha_carga_compras;
    }

    
    public Integer getNro_material() {
        return nro_material;
    }

    public void setNro_material(Integer nro_material) {
        this.nro_material = nro_material;
    }

      public String getCondicionpago() {
        return condicionpago;
    }

    public void setCondicionpago(String condicionpago) {
        this.condicionpago = condicionpago;
    }

    public Boolean getRecomendacion_comprador() {
        return recomendacion_comprador;
    }

    public void setRecomendacion_comprador(Boolean recomendacion_comprador) {
        this.recomendacion_comprador = recomendacion_comprador;
    }

    public Boolean getAprobado_procura() {
        return aprobado_procura;
    }

    public void setAprobado_procura(Boolean aprobado_procura) {
        this.aprobado_procura = aprobado_procura;
    }

    public String getFecha_aprobado_procura() {
        return fecha_aprobado_procura;
    }

    public void setFecha_aprobado_procura(String fecha_aprobado_procura) {
        this.fecha_aprobado_procura = fecha_aprobado_procura;
    }

    public Boolean getAprobado_gerencia() {
        return aprobado_gerencia;
    }

    public void setAprobado_gerencia(Boolean aprobado_gerencia) {
        this.aprobado_gerencia = aprobado_gerencia;
    }

    public String getFecha_aprobado_gerencia() {
        return fecha_aprobado_gerencia;
    }

    public void setFecha_aprobado_gerencia(String fecha_aprobado_gerencia) {
        this.fecha_aprobado_gerencia = fecha_aprobado_gerencia;
    }

    public Boolean getOrden_compra() {
        return orden_compra;
    }

    public void setOrden_compra(Boolean orden_compra) {
        this.orden_compra = orden_compra;
    }

    public Integer getNro_ordencompra() {
        return nro_ordencompra;
    }

    public void setNro_ordencompra(Integer nro_ordencompra) {
        this.nro_ordencompra = nro_ordencompra;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    

    public Integer getCodigo_moneda() {
        return codigo_moneda;
    }

    public void setCodigo_moneda(Integer codigo_moneda) {
        this.codigo_moneda = codigo_moneda;
    }

      
    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
    public Integer getId_cotizacion() {
        return id_cotizacion;
    }

    public void setId_cotizacion(Integer id_cotizacion) {
        this.id_cotizacion = id_cotizacion;
    }

    public Integer getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Integer id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
    
    
    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }
    
     public String getNombreproveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String Nombre_proveedor) {
        this.nombre_proveedor = Nombre_proveedor;
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

    public Integer getCantidad_cotizar() {
        return cantidad_cotizar;
    }

    public void setCantidad_cotizar(Integer cantidad_cotizar) {
        this.cantidad_cotizar = cantidad_cotizar;
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

    public String getFecha_cotizacion() {
        return fecha_cotizacion;
    }

    public void setFecha_cotizacion(String fecha_cotizacion) {
        this.fecha_cotizacion = fecha_cotizacion;
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