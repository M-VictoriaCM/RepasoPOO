package Criterio;

import Libreria.Elementolibreria;

public class PrecioIgual extends Politica{
    private double precio;

    public PrecioIgual(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Elementolibreria e) {
        return e.getPrecio() == precio;
    }
}
