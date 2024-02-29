package Criterio;

import Libreria.Elementolibreria;

public class PoliticaPrecioMayor extends Politica{
    private double precio;

    public PoliticaPrecioMayor(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Elementolibreria e) {
        return e.getPrecio() > precio;
    }
}
