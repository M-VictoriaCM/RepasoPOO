package Carpinteria;

import Calculador.AplicoAdicional;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Elemento>elementos;
    private int numLocal;
    private String vendedor;

    public Pedido(int numLocal, String vendedor) {
        this.numLocal = numLocal;
        this.vendedor = vendedor;
    }
    public void addElemento(Elemento e){
        elementos.add(e);
    }
    public boolean contieneElemento(Elemento e){
        return this.elementos.contains(e);
    }
    public ArrayList<Elemento>getElementos(){
        ArrayList<Elemento>copia = new ArrayList<>();
        copia.addAll(elementos);

        return copia;
    }
    public double costoTotal(){
        double total=0.0;
        for(Elemento e: elementos){
            total+=e.getPrecioBase();
        }
        return total;
    }

}
