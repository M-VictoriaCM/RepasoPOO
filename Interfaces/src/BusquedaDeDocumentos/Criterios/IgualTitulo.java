package BusquedaDeDocumentos.Criterios;

import BusquedaDeDocumentos.Documento;

public class IgualTitulo implements Criterio{
    private String titulo;

    public IgualTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Documento documentos) {
        return documentos.getTitulo().contains(titulo);
    }
}
