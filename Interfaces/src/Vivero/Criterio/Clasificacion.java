package Vivero.Criterio;

import Vivero.Criterio.Criterio;
import Vivero.Planta;

public class Clasificacion implements Criterio {
    private String clasificacion;
    public Clasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getClasificacion().equals(clasificacion);
    }
}
