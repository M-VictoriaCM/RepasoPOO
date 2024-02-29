package Vivero.Criterio;

import Vivero.Planta;

import java.util.Locale;

public class NombreCientifico implements Criterio{
    private String nombre;

    public NombreCientifico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getNombreCientifico().toLowerCase().contains(nombre.toLowerCase());
    }
}
