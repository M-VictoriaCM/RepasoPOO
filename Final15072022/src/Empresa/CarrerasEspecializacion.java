package Empresa;

import Adicional.Adicional;

import java.util.ArrayList;

public class CarrerasEspecializacion extends Carreras {
    private ArrayList<Elemento>elementos;

    public CarrerasEspecializacion(String nombre, String tema, int porcentaje) {
        super(nombre, tema, porcentaje);
    }


    @Override
    public double getCosto() {
        double descuento= super.getCosto()*(this.getPorcentaje()/100);
        return super.getCosto()-descuento;
    }
}
