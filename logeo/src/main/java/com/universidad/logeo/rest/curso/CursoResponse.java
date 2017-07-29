package com.universidad.logeo.rest.curso;

import java.util.List;

/**
 * Created by furiusus on 7/29/17.
 */
public class CursoResponse {
    private List<Curso> cursos;

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
