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
public class class_proveedor {
    
    private Integer id_proveedor;
    private String rif;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String estado;
    private String pais;
    private String codigopostal;
    private String tipo;
    private String personacontacto;
    private String telefono1;
    private String telefono2;
    private String correoelectronico;
    private String banco1;
    private String nrocuenta1;
    private String tipocuenta1;
    private String banco2;
    private String nrocuenta2;
    private String tipocuenta2;
    private String banco3;
    private String nrocuenta3;
    private String tipocuenta3;
    private Integer clasematerial;
    private Integer grupomaterial;
   
    
    private Boolean status;

    public class_proveedor(Integer id_proveedor, String rif, String nombre, String direccion, String ciudad,String estado,String pais,String codigopostal,String tipo,String personacontacto,String telefono1,String telefono2,String correoelectronico,String banco1,String nrocuenta1,String tipocuenta1,String banco2,String nrocuenta2,String tipocuenta2,String banco3,String nrocuenta3,String tipocuenta3,Integer clasematerial, Integer grupomaterial,Boolean status) {
        this.id_proveedor = id_proveedor;
        this.rif = rif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
        this.codigopostal = codigopostal;
        this.tipo = tipo;
        this.personacontacto = personacontacto;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.correoelectronico = correoelectronico;
        this.banco1 = banco1;
        this.nrocuenta1 = nrocuenta1;
        this.tipocuenta1 = tipocuenta1;
        this.banco2 = banco2;
        this.nrocuenta2 = nrocuenta2;
        this.tipocuenta2 = tipocuenta2;
        this.banco3 = banco3;
        this.nrocuenta3 = nrocuenta3;
        this.tipocuenta3 = tipocuenta3;
        this.clasematerial = clasematerial;  
        this.grupomaterial = grupomaterial;  
        this.status = status;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPersonacontacto() {
        return personacontacto;
    }

    public void setPersonacontacto(String personacontacto) {
        this.personacontacto = personacontacto;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getBanco1() {
        return banco1;
    }

    public void setBanco1(String banco1) {
        this.banco1 = banco1;
    }

    public String getNrocuenta1() {
        return nrocuenta1;
    }

    public void setNrocuenta1(String nrocuenta1) {
        this.nrocuenta1 = nrocuenta1;
    }

    public String getTipocuenta1() {
        return tipocuenta1;
    }

    public void setTipocuenta1(String tipocuenta1) {
        this.tipocuenta1 = tipocuenta1;
    }

    public String getBanco2() {
        return banco2;
    }

    public void setBanco2(String banco2) {
        this.banco2 = banco2;
    }

    public String getNrocuenta2() {
        return nrocuenta2;
    }

    public void setNrocuenta2(String nrocuenta2) {
        this.nrocuenta2 = nrocuenta2;
    }

    public String getTipocuenta2() {
        return tipocuenta2;
    }

    public void setTipocuenta2(String tipocuenta2) {
        this.tipocuenta2 = tipocuenta2;
    }

    public String getBanco3() {
        return banco3;
    }

    public void setBanco3(String banco3) {
        this.banco3 = banco3;
    }

    public String getNrocuenta3() {
        return nrocuenta3;
    }

    public void setNrocuenta3(String nrocuenta3) {
        this.nrocuenta3 = nrocuenta3;
    }

    public String getTipocuenta3() {
        return tipocuenta3;
    }

    public void setTipocuenta3(String tipocuenta3) {
        this.tipocuenta3 = tipocuenta3;
    }

    public Integer getClasematerial() {
        return clasematerial;
    }

    public void setClasematerial(Integer clasematerial) {
        this.clasematerial = clasematerial;
    }

    public Integer getGrupomaterial() {
        return grupomaterial;
    }

    public void setGrupomaterial(Integer grupomaterial) {
        this.grupomaterial = grupomaterial;
    }

    
    
    
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

   
    
    
    
}
