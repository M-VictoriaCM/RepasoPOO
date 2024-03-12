package Criterio;
import Carpinteria.Elemento;
public class CriterioPresentacion implements Especialidades{
    private String presentacion;

    public CriterioPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getModoPresentacion().equals(presentacion);
    }
}
