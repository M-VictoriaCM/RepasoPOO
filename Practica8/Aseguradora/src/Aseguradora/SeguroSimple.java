package Aseguradora;

import Calculador.Calculador;
import CriterioDeBusqueda.CriterioDeBusqueda;
import Ordenamiento.Ordenamiento;

import java.util.ArrayList;
import java.util.Collections;

public class SeguroSimple extends Seguro {

    private int poliza;
    private double montoAsegurado;
    private Calculador calcularMonto;

    public SeguroSimple(int dni, String descripcion, int poliza, double montoAsegurado) {
        super(dni, descripcion);
        this.poliza=poliza;
        this.montoAsegurado =montoAsegurado;
    }

    @Override
    public int getPoliza() {
        return poliza;
    }

    @Override
    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    @Override
    public double costo() {
        return calcularMonto.Calcular(this);
    }

    @Override
    public ArrayList<Seguro> buscar(CriterioDeBusqueda c, Ordenamiento o) {
        ArrayList<Seguro>encontrada = new ArrayList<>();
        if(c.cumple(this)){
            encontrada.add(this);
            Collections.sort(encontrada, o);
        }
        return encontrada;
    }
}
