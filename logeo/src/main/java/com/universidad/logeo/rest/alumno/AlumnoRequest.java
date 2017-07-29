package com.universidad.logeo.rest.alumno;

/**
 * Created by furiusus on 7/29/17.
 */
public class AlumnoRequest extends Alumno{
    private String usuario;
    private String credencial;


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCredencial() {
        return credencial;
    }

    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }
}
