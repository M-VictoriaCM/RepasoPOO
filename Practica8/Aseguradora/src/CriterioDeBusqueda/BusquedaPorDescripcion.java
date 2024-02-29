package CriterioDeBusqueda;

import Aseguradora.Seguro;

public class BusquedaPorDescripcion implements CriterioDeBusqueda{
    private String descripcion;

    public BusquedaPorDescripcion(String descripcion) {
        this.descripcion = descripcion.toLowerCase();
    }

    @Override
    public boolean cumple(Seguro s) {
        return s.getDescripcion().toLowerCase().contains(descripcion);
    }
}
