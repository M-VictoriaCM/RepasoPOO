package BusquedaDeDocumentos.Criterios;

import BusquedaDeDocumentos.Documento;

public class TienePalabraClave implements Criterio{
    private String palabra;

    public TienePalabraClave(String palabra) {
        this.palabra =palabra;
    }

    @Override
    public boolean cumple(Documento documentos) {
        return documentos.tienePalabrasClaves(palabra);
    }
}
