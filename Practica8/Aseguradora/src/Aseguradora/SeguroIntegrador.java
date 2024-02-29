package Aseguradora;

import CriterioDeBusqueda.CriterioDeBusqueda;
import Ordenamiento.Ordenamiento;

import java.util.ArrayList;

public class SeguroIntegrador extends Seguro {
    private ArrayList<Seguro> seguros;

    public SeguroIntegrador(int dni, String descripcion) {
        super(dni, descripcion);
        this.seguros= new ArrayList<>();
    }
    public void add(Seguro elemento){
        if(!this.seguros.contains(elemento)){
            this.seguros.add(elemento);
        }
    }
    public boolean tieneSeguro(Seguro seguro){
        return this.seguros.contains(seguro);
    }

    @Override
    public int getPoliza() {
        int numero=  0;
        for(Seguro seguro: seguros){
            int aux = seguro.getPoliza();
            if(aux > numero){
                numero = aux;
            }
        }
        return numero;
    }

    @Override
    public double getMontoAsegurado() {
        double contador=0;
        for(Seguro seguro:seguros){
            contador += seguro.getMontoAsegurado();
        }
        return contador;
    }

    @Override
    public double costo() {
        double contador= 0;
        for (Seguro seguroContenido: seguros){
            contador+= seguroContenido.costo();
        }
        return contador;
    }

    @Override
    public ArrayList<Seguro> buscar(CriterioDeBusqueda c, Ordenamiento o) {
        ArrayList<Seguro>encontrada= new ArrayList<>();
        for(Seguro seguro: seguros){
            if(c.cumple(seguro)){
                ArrayList<Seguro>aux= seguro.buscar(c, o);
                encontrada.addAll(aux);
            }
        }
        return encontrada;
    }
}
