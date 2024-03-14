import java.time.LocalDate;

public class CriterioFecha implements Criterio{
    private LocalDate fecha;

    public CriterioFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(Fotografia fotografia) {
        return fotografia.getFechaDeCreacion().isBefore(fecha);
    }
}
