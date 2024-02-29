package Criterio;

import SistemaElectoral.Voto;

public class CriterioAnd implements Criterio{
    private Criterio condicion1, condicion2;

    public CriterioAnd(Criterio condicion1, Criterio condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(Voto v) {
        return condicion1.cumple(v) && condicion2.cumple(v);
    }
}
