package Carpinteria;

import java.util.ArrayList;

public class Complejo extends Elemento{
    private ArrayList<Elemento>elementos;
    public Complejo(String nombre, String tipo, String modoPresentacion) {
        super(nombre, tipo, modoPresentacion);
        this.elementos= new ArrayList<>();
    }
    public void addElementos(Elemento e){
        elementos.add(e);
    }

    @Override
    public double getPeso() {
        double total= 0.0;
        for(Elemento e: elementos){
            total += e.getPeso();
        }
        return total;
    }

    @Override
    public double getPrecioBase() {
        double total=0.0;
        for(Elemento e: elementos){
            total+=e.getPrecioBase();
        }
        return total;
    }
}
