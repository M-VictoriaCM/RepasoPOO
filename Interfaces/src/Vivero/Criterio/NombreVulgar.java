package Vivero.Criterio;

import Vivero.Criterio.Criterio;
import Vivero.Planta;

public class NombreVulgar implements Criterio {
    private String nombre;
    public NombreVulgar(String nombre) {
        this.nombre= nombre;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.tienenNombre(nombre.toLowerCase());
    }
}
