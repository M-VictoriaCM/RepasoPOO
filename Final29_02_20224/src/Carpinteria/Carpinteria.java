package Carpinteria;

import Criterio.Criterio;

import java.util.ArrayList;

public class Carpinteria {
    private ArrayList<Elemento> pedidos;

    public Carpinteria() {
        this.pedidos = new ArrayList<>();
    }
    public ArrayList<Elemento>derivoATaller(Criterio c){
        ArrayList<Elemento>encontrada = new ArrayList<>();
        for(Elemento e: pedidos){
            if(c.cumple(e)){
                encontrada.add(e);
            }
        }
        return encontrada;
    }
}
