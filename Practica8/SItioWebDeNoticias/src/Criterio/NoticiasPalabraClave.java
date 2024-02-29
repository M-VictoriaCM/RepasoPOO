package Criterio;

import CriterioDeBusqueda.CriterioDeBusqueda;
import SitioWeb.Noticia;

public class NoticiasPalabraClave implements CriterioDeBusqueda {
    private String palabra;

    public NoticiasPalabraClave(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.tienePalabraClave(palabra);
    }
}
