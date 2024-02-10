package BusquedaDeDocumentos.Criterios;

import BusquedaDeDocumentos.Documento;

public class títuloContienePalabraOFrase implements Criterio{
    private String frase;

    public títuloContienePalabraOFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public boolean cumple(Documento documentos) {
        return documentos.getTitulo().contains(frase);
    }
}
