package Vivero.Criterio;

import Vivero.Planta;

public class SolSuperior implements Criterio{
    private int nivel;

    public SolSuperior(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getRequerimientoSol() > nivel;
    }
}
