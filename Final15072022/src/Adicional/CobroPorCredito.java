package Adicional;

import Empresa.Elemento;

public class CobroPorCredito implements Adicional{
    private int cantidadCredito;
    private double montoFijo;
    private double otroMonto;

    public CobroPorCredito(int cantidadCredito, double montoFijo, double otroMonto) {
        this.cantidadCredito = cantidadCredito;
        this.montoFijo = montoFijo;
    }

    @Override
    public double valor(Elemento e) {
        if(e.getNumeroDeCreditos() == cantidadCredito){
            return e.getNumeroDeCreditos()* montoFijo;
        }
        return e.getNumeroDeCreditos()*otroMonto;
    }
}
