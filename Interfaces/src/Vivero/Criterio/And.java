package Vivero.Criterio;

import Vivero.Planta;

public class And implements Criterio{
    private Criterio condicion1, condicion2;

    public And(Criterio condicion1, Criterio condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(Planta p) {
        return condicion1.cumple(p) && condicion2.cumple(p);
    }
}
