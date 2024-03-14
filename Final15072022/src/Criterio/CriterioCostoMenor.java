package Criterio;

import Empresa.Curso;

public class CriterioCostoMenor implements Criterio{
    private double costo;

    public CriterioCostoMenor(double costo) {
        this.costo = costo;
    }

    @Override
    public boolean cumple(Curso c) {
        return c.getCosto() < costo;
    }
}
