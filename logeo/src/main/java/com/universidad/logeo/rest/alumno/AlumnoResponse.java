package com.universidad.logeo.rest.alumno;

/**
 * Created by furiusus on 7/29/17.
 */
public class AlumnoResponse {
    private String mensaje;
    private Boolean adentro;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Boolean getAdentro() {
        return adentro;
    }

    public void setAdentro(Boolean adentro) {
        this.adentro = adentro;
    }
}