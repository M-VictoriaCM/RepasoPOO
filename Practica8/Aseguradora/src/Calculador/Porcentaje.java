package Calculador;

import Aseguradora.Seguro;

public class Porcentaje extends Calculador{
    private double porcentaje;

    public Porcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double Calcular(Seguro seguro) {
        return seguro.getMontoAsegurado() * (porcentaje/100);
    }
}
