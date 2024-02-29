package Criterio;

import CriterioDeBusqueda.CriterioDeBusqueda;
import SitioWeb.Noticia;

public class textoSuperior implements CriterioDeBusqueda {
    private int cantidad;

    public textoSuperior(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        String[] palabras = noticia.getTexto().split(" ");
        return palabras.length >= cantidad;
    }
}
