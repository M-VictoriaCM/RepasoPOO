package SistemaDeAlquiler;

import java.util.ArrayList;

public class Vehiculo extends Item{
    private String marca;
    private double km;
    private String patente;
    private String tipo;
    private boolean estado;

    public Vehiculo(String marca, double km, String patente, String tipo ) {
        this.marca = marca;
        this.km = km;
        this.patente = patente;
        this.tipo = tipo;
        this.estado= estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        if(km > 0){
            this.km = km;
        }
    }
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void alquilar(Cliente c) {
        if(this.isDisponible()){
            setEstado(true);
            alquilar(c);
        }
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    private boolean estaAquilado() {
        return estado;
    }

    @Override
    public void devolucion(Cliente c) {
        devolucion(c);
    }

    @Override
    public boolean isDisponible() {
        return !this.estaAquilado();
    }
}
