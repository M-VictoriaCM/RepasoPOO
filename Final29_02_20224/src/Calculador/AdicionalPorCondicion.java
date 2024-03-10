package Calculador;

import Carpinteria.Elemento;
import Criterio.Criterio;

public class AdicionalPorCondicion implements AplicoAdicional{
    private Criterio criterio;
    private double valorExtra;

    public AdicionalPorCondicion(Criterio criterio, double valorExtra) {
        this.criterio = criterio;
        this.valorExtra = valorExtra;
    }

    @Override
    public double calcular(Elemento e) {
        if(criterio.cumple(e)){
            return e.getPrecio()+valorExtra;
        }
        return 0;
    }
}
