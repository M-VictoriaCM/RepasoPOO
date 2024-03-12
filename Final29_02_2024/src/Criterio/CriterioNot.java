package Criterio;

import Carpinteria.Elemento;

public class CriterioNot implements Especialidades{
    private Especialidades condicion;

    public CriterioNot(Especialidades condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Elemento e) {
        return !condicion.cumple(e);
    }
}
