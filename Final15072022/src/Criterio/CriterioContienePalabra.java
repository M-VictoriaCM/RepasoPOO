package Criterio;

import Empresa.Curso;

public class CriterioContienePalabra implements Criterio{
    private String nombre;

    public CriterioContienePalabra(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Curso c) {
        return c.getNombre().contains(nombre);
    }
}
