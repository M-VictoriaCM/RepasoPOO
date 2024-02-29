package CriterioBusqueda;

import FileSyst.ElementoFS;

import java.time.LocalDate;

public class FechaDeCreacion implements Criterio {
    private LocalDate fecha;

    public FechaDeCreacion(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(ElementoFS elem) {
        return elem.getFechaDeModificacion().isBefore(fecha);
    }
}
