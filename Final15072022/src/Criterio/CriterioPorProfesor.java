package Criterio;

import Empresa.Curso;

public class CriterioPorProfesor implements Criterio{
    private String profesor;
    @Override
    public boolean cumple(Curso c) {
        return c.getProfesor().equals(profesor);
    }
}
