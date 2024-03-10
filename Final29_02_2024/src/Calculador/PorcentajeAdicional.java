package Calculador;

import Carpinteria.Elemento;

public class PorcentajeAdicional implements AplicoAdicional{
    private double porcentaje;

    public PorcentajeAdicional(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcular(Elemento e) {
        return e.getPrecio()+(porcentaje *e.getPrecio()/100);
    }
}
