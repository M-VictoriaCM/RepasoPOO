package BusquedaDeDocumentos.Criterios;

import BusquedaDeDocumentos.Documento;

public interface Criterio {
    boolean cumple(Documento documentos);
}
