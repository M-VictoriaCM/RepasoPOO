package Calculador;

import Aseguradora.Seguro;

public class Suma extends Calculador{
    private Calculador op1, op2;

    public Suma(Calculador op1, Calculador op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public double Calcular(Seguro seguro) {
        return op1.Calcular(seguro)+ op2.Calcular(seguro);
    }
}
