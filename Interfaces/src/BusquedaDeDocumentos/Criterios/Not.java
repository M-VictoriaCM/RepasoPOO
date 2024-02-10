package BusquedaDeDocumentos.Criterios;

import BusquedaDeDocumentos.Documento;

public class Not implements Criterio{
    private Criterio condicion;

    public Not(Criterio condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Documento documentos) {
        return !condicion.cumple(documentos);
    }
}
