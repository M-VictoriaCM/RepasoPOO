package Criterio;

import Editorial.Capitulo;
import Editorial.Persona;

public class CriterioAutor implements Criterio{
    private Persona autor;

    public CriterioAutor(Persona autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Capitulo capitulo) {
        return capitulo.esAutor(autor);
    }
}
