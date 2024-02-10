package BusquedaDeDocumentos.Criterios;

import BusquedaDeDocumentos.Documento;

public class PalabraOFraseContenido implements Criterio{
    private String palabraOFrase;

    public PalabraOFraseContenido(String palabraOFrase) {
        this.palabraOFrase = palabraOFrase;
    }

    @Override
    public boolean cumple(Documento documentos) {
        return documentos.getContenidoTextual().contains(palabraOFrase);
    }
}
