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
public class class_permisologia {
    private boolean almacen;
    private boolean area;
    private boolean clasematerial;
    private boolean empresa;
    private boolean grupomaterial;
    private boolean moneda;
    private boolean proyecto;
    
    private boolean crearmaterial;
    private boolean actualizarmaterial;
    private boolean entradamaterial;
    private boolean maestromateriales;
    private boolean prestamomaterial;
    private boolean salidamaterial;
    
    private boolean agregarsolicitud;
    private boolean actualizarsolicitud;
    private boolean estatussolicitud;
    
    private boolean crearordendecompra;
    private boolean actualizarordendecompra;
    private boolean estatusordendecompra;
    
    private boolean crearreserva;
    private boolean actualizarreserva;
    private boolean estatusreserva;
    
    private Integer modulo;

    public class_permisologia(boolean almacen, boolean area, boolean clasematerial, boolean empresa, boolean grupomaterial, boolean moneda, boolean proyecto, boolean crearmaterial, boolean actualizarmaterial, boolean entradamaterial, boolean maestromateriales, boolean prestamomaterial, boolean salidamaterial, boolean agregarsolicitud, boolean actualizarsolicitud, boolean estatussolicitud, boolean crearordendecompra, boolean actualizarordendecompra, boolean estatusordendecompra, boolean crearreserva, boolean actualizarreserva, boolean estatusreserva) {
        this.almacen = almacen;
        this.area = area;
        this.clasematerial = clasematerial;
        this.empresa = empresa;
        this.grupomaterial = grupomaterial;
        this.moneda = moneda;
        this.proyecto = proyecto;
        this.crearmaterial = crearmaterial;
        this.actualizarmaterial = actualizarmaterial;
        this.entradamaterial = entradamaterial;
        this.maestromateriales = maestromateriales;
        this.prestamomaterial = prestamomaterial;
        this.salidamaterial = salidamaterial;
        this.agregarsolicitud = agregarsolicitud;
        this.actualizarsolicitud = actualizarsolicitud;
        this.estatussolicitud = estatussolicitud;
        this.crearordendecompra = crearordendecompra;
        this.actualizarordendecompra = actualizarordendecompra;
        this.estatusordendecompra = estatusordendecompra;
        this.crearreserva = crearreserva;
        this.actualizarreserva = actualizarreserva;
        this.estatusreserva = estatusreserva;
        
    }

    public boolean isCrearreserva() {
        return crearreserva;
    }

    public void setCrearreserva(boolean crearreserva) {
        this.crearreserva = crearreserva;
    }

    public boolean isActualizarreserva() {
        return actualizarreserva;
    }

    public void setActualizarreserva(boolean actualizarreserva) {
        this.actualizarreserva = actualizarreserva;
    }

    public boolean isEstatusreserva() {
        return estatusreserva;
    }

    public void setEstatusreserva(boolean estatusreserva) {
        this.estatusreserva = estatusreserva;
    }

    
    
    public Integer getModulo() {
        return modulo;
    }

    public void setModulo(Integer modulo) {
        this.modulo = modulo;
    }

       
    public boolean isAlmacen() {
        return almacen;
    }

    public void setAlmacen(boolean almacen) {
        this.almacen = almacen;
    }

    public boolean isArea() {
        return area;
    }

    public void setArea(boolean area) {
        this.area = area;
    }

    public boolean isClasematerial() {
        return clasematerial;
    }

    public void setClasematerial(boolean clasematerial) {
        this.clasematerial = clasematerial;
    }

    public boolean isEmpresa() {
        return empresa;
    }

    public void setEmpresa(boolean empresa) {
        this.empresa = empresa;
    }

    public boolean isGrupomaterial() {
        return grupomaterial;
    }

    public void setGrupomaterial(boolean grupomaterial) {
        this.grupomaterial = grupomaterial;
    }

    public boolean isMoneda() {
        return moneda;
    }

    public void setMoneda(boolean moneda) {
        this.moneda = moneda;
    }

    public boolean isProyecto() {
        return proyecto;
    }

    public void setProyecto(boolean proyecto) {
        this.proyecto = proyecto;
    }

    public boolean isCrearmaterial() {
        return crearmaterial;
    }

    public void setCrearmaterial(boolean crearmaterial) {
        this.crearmaterial = crearmaterial;
    }

    public boolean isActualizarmaterial() {
        return actualizarmaterial;
    }

    public void setActualizarmaterial(boolean actualizarmaterial) {
        this.actualizarmaterial = actualizarmaterial;
    }

    public boolean isEntradamaterial() {
        return entradamaterial;
    }

    public void setEntradamaterial(boolean entradamaterial) {
        this.entradamaterial = entradamaterial;
    }

    public boolean isMaestromateriales() {
        return maestromateriales;
    }

    public void setMaestromateriales(boolean maestromateriales) {
        this.maestromateriales = maestromateriales;
    }

    public boolean isPrestamomaterial() {
        return prestamomaterial;
    }

    public void setPrestamomaterial(boolean prestamomaterial) {
        this.prestamomaterial = prestamomaterial;
    }

    public boolean isSalidamaterial() {
        return salidamaterial;
    }

    public void setSalidamaterial(boolean salidamaterial) {
        this.salidamaterial = salidamaterial;
    }

    public boolean isAgregarsolicitud() {
        return agregarsolicitud;
    }

    public void setAgregarsolicitud(boolean agregarsolicitud) {
        this.agregarsolicitud = agregarsolicitud;
    }

    public boolean isActualizarsolicitud() {
        return actualizarsolicitud;
    }

    public void setActualizarsolicitud(boolean actualizarsolicitud) {
        this.actualizarsolicitud = actualizarsolicitud;
    }

    public boolean isEstatussolicitud() {
        return estatussolicitud;
    }

    public void setEstatussolicitud(boolean estatussolicitud) {
        this.estatussolicitud = estatussolicitud;
    }

    public boolean isCrearordendecompra() {
        return crearordendecompra;
    }

    public void setCrearordendecompra(boolean crearordendecompra) {
        this.crearordendecompra = crearordendecompra;
    }

    public boolean isActualizarordendecompra() {
        return actualizarordendecompra;
    }

    public void setActualizarordendecompra(boolean actualizarordendecompra) {
        this.actualizarordendecompra = actualizarordendecompra;
    }

    public boolean isEstatusordendecompra() {
        return estatusordendecompra;
    }

    public void setEstatusordendecompra(boolean estatusordendecompra) {
        this.estatusordendecompra = estatusordendecompra;
    }
    
}
