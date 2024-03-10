package Criterio;

import Carpinteria.Elemento;

public class CriterioMayorTiempo implements Criterio{
    private double tiempo;

    public CriterioMayorTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getTiempoDePreparacion()> tiempo;
    }
}
