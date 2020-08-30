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
public class class_notificacion {
    
    
    private Integer fk_usuario; 
    private Integer fk_documento;
    private Boolean visto;
    private String fecharegistro;
    private String fechavisto;
    private Integer usuarioreceptor;

    public class_notificacion(Integer fk_usuario, Integer fk_documento, Boolean visto, String fecharegistro, String fechavisto, Integer usuarioreceptor) {
        this.fk_usuario = fk_usuario;
        this.fk_documento = fk_documento;
        this.visto = visto;
        this.fecharegistro = fecharegistro;
        this.fechavisto = fechavisto;
        this.usuarioreceptor = usuarioreceptor;
    }

    public Integer getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(Integer fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    public Integer getFk_documento() {
        return fk_documento;
    }

    public void setFk_documento(Integer fk_documento) {
        this.fk_documento = fk_documento;
    }

    public Boolean getVisto() {
        return visto;
    }

    public void setVisto(Boolean visto) {
        this.visto = visto;
    }

    public String getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(String fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public String getFechavisto() {
        return fechavisto;
    }

    public void setFechavisto(String fechavisto) {
        this.fechavisto = fechavisto;
    }

    public Integer getUsuarioreceptor() {
        return usuarioreceptor;
    }

    public void setUsuarioreceptor(Integer usuarioreceptor) {
        this.usuarioreceptor = usuarioreceptor;
    }
    
    
}
