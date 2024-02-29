package Criterio;

import Libreria.Elementolibreria;

public class MayorVolumen extends Politica{
    private double volumen;
    @Override
    public boolean cumple(Elementolibreria e) {
        return e.getVolumen()>volumen;
    }
}
