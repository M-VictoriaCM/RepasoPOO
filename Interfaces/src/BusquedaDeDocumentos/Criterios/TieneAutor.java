package BusquedaDeDocumentos.Criterios;

import BusquedaDeDocumentos.Documento;

public class TieneAutor implements Criterio{
    private String autor;

    public TieneAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Documento documentos) {
        return documentos.tieneAutor(autor);
    }
}
