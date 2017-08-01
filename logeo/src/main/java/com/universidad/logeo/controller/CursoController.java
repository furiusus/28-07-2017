package com.universidad.logeo.controller;

import com.universidad.logeo.rest.curso.Curso;
import com.universidad.logeo.rest.curso.CursoRequest;
import com.universidad.logeo.rest.curso.CursoResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "servicioCurso")
public class CursoController {
    @RequestMapping(value = "buscarCurso",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody CursoResponse buscarCurso( @RequestBody CursoRequest cursoRequest){
        CursoResponse cursoResponse = new CursoResponse();
        cursoResponse.setCursos(new ArrayList<Curso>());
        if(cursoRequest.getUsuario().equals("71197765")){
            Curso objCurso1=new Curso();
            objCurso1.setCurso("LPOO");
            objCurso1.setDocente("Hancco");
            objCurso1.setHorario("Lunes 8:00 \u00AD 12:00");
            objCurso1.setSeccion("U");
            Curso objCurso2=new Curso();
            objCurso2.setCurso("Fisica1");
            objCurso2.setDocente("Salcedo");
            objCurso2.setHorario("Martes 8:00 \u00AD 12:00");
            objCurso2.setSeccion("v");
            Curso objCurso3=new Curso();
            objCurso3.setCurso("CONSTI");
            objCurso3.setDocente("SanSalo");
            objCurso3.setHorario("Miercoles 8:00 \u00AD 12:00");
            objCurso3.setSeccion("V");
            cursoResponse.getCursos().add(objCurso1);
            cursoResponse.getCursos().add(objCurso2);
            cursoResponse.getCursos().add(objCurso3);
        }
        if(cursoRequest.getUsuario().equals("09603244")){
            Curso objCurso1=new Curso();
            objCurso1.setCurso("LPE");
            objCurso1.setDocente("Cordova");
            objCurso1.setHorario("Lunes 8:00 \u00AD 12:00");
            objCurso1.setSeccion("V");
            Curso objCurso2=new Curso();
            objCurso2.setCurso("Fisica2");
            objCurso2.setDocente("Salc");
            objCurso2.setHorario("Jueves 8:00 \u00AD 12:00");
            objCurso2.setSeccion("W");
            Curso objCurso3=new Curso();
            objCurso3.setCurso("Micro");
            objCurso3.setDocente("Margaracha");
            objCurso3.setHorario("Viernes 8:00 \u00AD 12:00");
            objCurso3.setSeccion("P");
            cursoResponse.getCursos().add(objCurso1);
            cursoResponse.getCursos().add(objCurso2);
            cursoResponse.getCursos().add(objCurso3);
        }
        return cursoResponse;
    }
}
