package Criterio;

import Empresa.Curso;

public class CriterioPorTema implements Criterio{
    private String tema;

    public CriterioPorTema(String tema) {
        this.tema = tema;
    }

    @Override
    public boolean cumple(Curso c) {
        return c.getTema().equals(tema);
    }
}
