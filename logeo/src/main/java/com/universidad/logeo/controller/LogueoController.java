package com.universidad.logeo.controller;

import com.universidad.logeo.rest.alumno.Alumno;
import com.universidad.logeo.rest.alumno.AlumnoRequest;
import com.universidad.logeo.rest.alumno.AlumnoResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;

/**
 * Created by furiusus on 7/29/17.
 */
@Controller
@RequestMapping(value = "servicio")
public class LogueoController {
    @RequestMapping(value = "autenticar",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody AlumnoResponse autenticar(@RequestBody AlumnoRequest alumnoRequest){
        AlumnoResponse alumnoResponse=new AlumnoResponse();
        if(alumnoRequest.getUsuario().equals("71197765") && alumnoRequest.getCredencial().equals("12345")){
            alumnoResponse.setAdentro(true);
        }
        if(alumnoRequest.getUsuario().equals("09603244") && alumnoRequest.getCredencial().equals("54321")){
            alumnoResponse.setAdentro(true);
        }
        /*else{
            alumnoResponse.setAdentro(false);
            alumnoResponse.setMensaje("Datos Incorrectos \n Ingrese nuevamente los datos por favor");
        }*/
        return alumnoResponse;
    }

}
