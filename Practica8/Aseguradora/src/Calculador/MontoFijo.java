package Calculador;

import Aseguradora.Seguro;

public class MontoFijo extends Calculador{
    private double montoFijo;

    public MontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double Calcular(Seguro seguro) {
        return montoFijo;
    }
}
