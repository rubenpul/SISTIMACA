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
public class class_usuario {
    
    private Integer cedula;
    private String nombres;
    private String id_usuario;
    private String password;
    private String confirmarpassword;
    private Integer id_perfil;
    private String descripcionperfil;
    private String firmadigital;
    private Integer id_area;
    private String descripcionarea;
    private Integer id_usuario_alter;
    private boolean status;
    private boolean consultaestatus;
    private String modulo;
    private String email;

    public class_usuario(Integer cedula, String nombres, String id_usuario, String password, String confirmarpassword, Integer id_perfil, String descripcionperfil, Integer id_area, String firmadigital,Integer id_usuario_alter,boolean status,String email) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.id_usuario = id_usuario;
        this.password = password;
        this.confirmarpassword = confirmarpassword;
        this.id_perfil = id_perfil;
        this.descripcionperfil = descripcionperfil;
        this.id_area = id_area;
        this.firmadigital = firmadigital;
        this.id_usuario_alter = id_usuario_alter;
        this.status = status;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
    
    public String getDescripcionarea() {
        return descripcionarea;
    }

    public void setDescripcionarea(String descripcionarea) {
        this.descripcionarea = descripcionarea;
    }
    
    public String getFirmadigital() {
        return firmadigital;
    }

    public void setFirmadigital(String firmadigital) {
        this.firmadigital = firmadigital;
    }

    public Integer getId_area() {
        return id_area;
    }

    public void setId_area(Integer id_area) {
        this.id_area = id_area;
    }

    
    
    
    public String getDescripcionperfil() {
        return descripcionperfil;
    }

    public void setDescripcionperfil(String descripcionperfil) {
        this.descripcionperfil = descripcionperfil;
    }

        
    public boolean isConsultaestatus() {
        return consultaestatus;
    }

    public void setConsultaestatus(boolean consultaestatus) {
        this.consultaestatus = consultaestatus;
    }

    
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmarpassword() {
        return confirmarpassword;
    }

    public void setConfirmarpassword(String confirmarpassword) {
        this.confirmarpassword = confirmarpassword;
    }

    public Integer getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(Integer id_perfil) {
        this.id_perfil = id_perfil;
    }

    public Integer getId_usuario_alter() {
        return id_usuario_alter;
    }

    public void setId_usuario_alter(Integer id_usuario_alter) {
        this.id_usuario_alter = id_usuario_alter;
    }

    
   
    
    
    
    
}
