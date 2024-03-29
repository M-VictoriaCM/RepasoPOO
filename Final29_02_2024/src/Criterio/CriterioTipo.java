package Criterio;
import Carpinteria.Elemento;

public class CriterioTipo implements Especialidades{
    private String tipo;

    public CriterioTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getTipo().equals(tipo);
    }
}
