package Criterio;

import Editorial.Capitulo;
import Editorial.Persona;

public class CriterioRevisor implements Criterio{
    private Persona revisor;
    @Override
    public boolean cumple(Capitulo capitulo) {
        return capitulo.esRevisor(revisor);
    }
}
