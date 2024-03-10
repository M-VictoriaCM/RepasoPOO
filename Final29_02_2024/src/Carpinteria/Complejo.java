package Carpinteria;

import java.util.ArrayList;

public class Complejo extends Elemento {

    private ArrayList<Elemento> elementos;

    public Complejo(String nombre, String tipo, String modoDePreparacion) {
        super(nombre, tipo, modoDePreparacion);
        this.elementos = new ArrayList<>();
    }
    public void addElemento(Elemento e){
        elementos.add(e);
    }


    @Override
    public double getPeso() {
        double suma = 0.0;
        for(Elemento e: elementos){
            suma += e.getPeso();
        }
        return suma;
    }

    @Override
    public double getTiempoDePreparacion() {
        double suma = 0.0;
        for(Elemento e: elementos){
            suma += e.getTiempoDePreparacion();
        }
        return suma;
    }

    @Override
    public double getPrecio() {
        double suma = 0;
        for(Elemento e: elementos){
            suma += e.getPrecio();
        }
        return suma;
    }
}
