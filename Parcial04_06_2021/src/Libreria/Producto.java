package Libreria;


import Criterio.Politica;

import java.util.ArrayList;

public class Producto extends Elementolibreria{
    private String marca;
    private double precio;
    private double volumen;

    public Producto(String nombre, String marca,double precio, double volumen) {
        super(nombre);
        this.marca=marca;
        this.precio=precio;
        this.volumen = volumen;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getCantidad() {
        return 1;
    }

    @Override
    public ArrayList<Elementolibreria> buscar(Politica politica) {
        ArrayList<Elementolibreria>encontrado = new ArrayList<>();
        if(politica.cumple(this)){
            encontrado.add(this);
        }
        return encontrado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
}
