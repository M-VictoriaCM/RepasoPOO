package Criterio;

import Carpinteria.Elemento;

public class CriterioMayorPeso implements Especialidades{
    private double peso;

    public CriterioMayorPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getPeso() > peso;
    }
}
