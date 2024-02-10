package BusquedaDeDocumentos.Criterios;

import BusquedaDeDocumentos.Documento;

public class PorTitulo implements Criterio{
    private String titulo;

    public PorTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Documento documentos) {
        return documentos.getTitulo().equals(titulo);
    }
}
