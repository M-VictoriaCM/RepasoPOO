package Criterio;

import Carpinteria.Elemento;

public class CriterioNot implements Criterio{
    private Criterio condicion;

    public CriterioNot(Criterio condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Elemento e) {
        return !condicion.cumple(e);
    }
}
