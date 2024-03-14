import java.time.LocalDate;

public class CriterioAnio implements Criterio{
    private LocalDate anio;

    public CriterioAnio(LocalDate anio) {
        this.anio = anio;
    }
    public boolean cumple(Pista pista){
        return pista.getAnio() == anio;
    }
}
