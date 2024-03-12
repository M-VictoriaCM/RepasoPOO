package Criterio;

import Carpinteria.Elemento;

public class CriterioPrecioMenor implements Especialidades{
    private double precio;

    public CriterioPrecioMenor(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getPrecioBase()< precio;
    }
}
