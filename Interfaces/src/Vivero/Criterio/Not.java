package Vivero.Criterio;

import Vivero.Planta;

public class Not implements Criterio{
    private Criterio condicion;

    public Not(Criterio condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Planta p) {
        return !(condicion.cumple(p));
    }

}
