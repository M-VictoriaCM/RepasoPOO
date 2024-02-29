package Criterio;

import Libreria.Elementolibreria;

public class MarcaIgual extends Politica{
    private String marca;

    public MarcaIgual(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean cumple(Elementolibreria e) {
        return e.getMarca().equals(marca);
    }
}
