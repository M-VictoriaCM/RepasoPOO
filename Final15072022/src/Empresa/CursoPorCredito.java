package Empresa;

import Adicional.Adicional;

public class CursoPorCredito extends Curso {
    private double monto;

    public CursoPorCredito(String nombre, String tema, double costo, int numeroDeCreditos, double monto) {
        super(nombre, tema, costo, numeroDeCreditos);
        this.monto=monto;
    }


    @Override
    public double getCosto() {
        return super.getNumeroDeCreditos()*monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
