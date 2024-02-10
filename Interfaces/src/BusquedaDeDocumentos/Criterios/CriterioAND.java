package BusquedaDeDocumentos.Criterios;

import BusquedaDeDocumentos.Documento;

public class CriterioAND implements Criterio{
    Criterio condicion1, condicion2;

    public CriterioAND(Criterio condicion1, Criterio condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(Documento documentos) {
        return condicion1.cumple(documentos) && condicion2.cumple(documentos);
    }
}
