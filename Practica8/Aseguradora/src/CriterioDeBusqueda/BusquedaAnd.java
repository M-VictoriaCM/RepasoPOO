package CriterioDeBusqueda;

import Aseguradora.Seguro;

public class BusquedaAnd implements CriterioDeBusqueda{
    CriterioDeBusqueda opcion1, opcion2;

    public BusquedaAnd(CriterioDeBusqueda opcion1, CriterioDeBusqueda opcion2) {
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
    }

    @Override
    public boolean cumple(Seguro s) {
        return opcion1.cumple(s) && opcion2.cumple(s);
    }
}
