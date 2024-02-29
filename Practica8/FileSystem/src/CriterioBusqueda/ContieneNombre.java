package CriterioBusqueda;

import FileSyst.ElementoFS;

public class ContieneNombre implements Criterio {
    private String nombre;

    public ContieneNombre(String nombre) {
        this.nombre = nombre.toLowerCase();
    }

    @Override
    public boolean cumple(ElementoFS elem) {
        return elem.getNombre().toLowerCase().contains(nombre);
    }
}
