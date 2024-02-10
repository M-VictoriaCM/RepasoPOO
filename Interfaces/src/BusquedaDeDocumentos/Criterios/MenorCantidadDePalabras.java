package BusquedaDeDocumentos.Criterios;

import BusquedaDeDocumentos.Documento;

public class MenorCantidadDePalabras implements Criterio{
    private int cantidad;

    public MenorCantidadDePalabras(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean cumple(Documento documentos) {
        String[] palabras = documentos.getContenidoTextual().split(" ");
        return palabras.length <= cantidad;
    }
}
