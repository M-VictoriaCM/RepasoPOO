package Calculador;

import Carpinteria.Elemento;
import Criterio.Especialidades;

public class AdicionalPorCondicion implements AplicoAdicional{
    private Especialidades criterio;
    private double valorExtra;
    private double getValorExtra1;

    public AdicionalPorCondicion(Especialidades criterio, double valorExtra, double getValorExtra1) {
        this.criterio = criterio;
        this.valorExtra = valorExtra;
        this.getValorExtra1 =getValorExtra1;
    }

    @Override
    public double calcular(Elemento e) {
        if(criterio.cumple(e)){
            return e.getPrecioBase()+valorExtra;
        }
        return e.getPrecioBase() + getValorExtra1;
    }
}
