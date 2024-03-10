package Criterio;

import Carpinteria.Elemento;

public class CondicionOr implements Criterio{
    private Criterio condicion1, condicion2;

    public CondicionOr(Criterio condicion1, Criterio condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(Elemento e) {
        return condicion1.cumple(e) || condicion2.cumple(e);
    }
}
