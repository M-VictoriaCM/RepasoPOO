package Criterio;

import CriterioDeBusqueda.CriterioDeBusqueda;
import SitioWeb.Noticia;

public class NoticiasPorAutor implements CriterioDeBusqueda {
    private String autor;

    public NoticiasPorAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTitulo().equals(autor);
    }
}
