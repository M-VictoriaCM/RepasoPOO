package Vivero.Criterio;

import Vivero.Planta;

public class RiegoSuperior implements Criterio{
    private int nivelDeRiego;

    public RiegoSuperior(int nivelDeRiego) {
        this.nivelDeRiego = nivelDeRiego;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getRequerimientoRiego() > nivelDeRiego;
    }
}
