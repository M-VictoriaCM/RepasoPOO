package Libreria;

import Criterio.Politica;

import java.util.ArrayList;

public class Kit extends Elementolibreria {
    private ArrayList<Elementolibreria>elementos;
    public Kit(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }
    public boolean tieneProducto(Elementolibreria e){
        return this.elementos.contains(e);
    }
    public void addElemento(Elementolibreria e){
        if(!tieneProducto(e)){
            this.elementos.add(e);
        }
    }

    @Override
    public double getVolumen() {
        double mayor=0;
        for(Elementolibreria e: elementos){
            double aux =e.getVolumen();
            if(aux > mayor){
                mayor=aux;
            }
        }
        return mayor;
    }

    @Override
    public String getMarca() {
        if(elementos.size() > 0){
            return elementos.get(0).getMarca();
        }
        return null;
    }

    @Override
    public double getPrecio() {
        double suma=0;
        for(Elementolibreria e : elementos){
            suma += e.getPrecio();
        }
        return suma;
    }

    @Override
    public int getCantidad() {
        int total = 0;
        for(Elementolibreria e: elementos){
            total += e.getCantidad();
        }
        return total;
    }

    @Override
    public ArrayList<Elementolibreria> buscar(Politica politica) {
        ArrayList<Elementolibreria>encotrado = new ArrayList<Elementolibreria>();
        if(politica.cumple(this)){
            encotrado.add(this);
        }
        for(Elementolibreria e: elementos){
            encotrado.addAll(e.buscar(politica));
        }
        return encotrado;
    }

    public boolean equals(Object obj){
        try{
            Kit otro= (Kit) obj;
            return this.getNombre().equals(otro.getNombre()) &&
                    this.getMarca().equals(otro.getMarca());
        }catch (Exception e){
            return false;
        }
    }
}
