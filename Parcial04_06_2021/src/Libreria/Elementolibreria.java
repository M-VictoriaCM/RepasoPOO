package Libreria;

import Criterio.Politica;

import java.util.ArrayList;

public abstract class Elementolibreria {
    private String nombre;
    public Elementolibreria(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    /*TODO 1. Implementar todos los servicios para acceder al precio, volumen, marca,
     *  nombre de un producto, kit o paquete*/
    public abstract double getVolumen();
    public abstract String getMarca();
    public abstract double getPrecio();

    /*TODO Obtener la cantidad de productos de un kit/paquete*/
    public abstract int getCantidad();

    /*TODO Buscar en la librería los productos/kits/paquetes que cumplan con ciertas características*/
    public abstract ArrayList<Elementolibreria>buscar(Politica politica);

}
