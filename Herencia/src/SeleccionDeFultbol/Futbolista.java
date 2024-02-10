package SeleccionDeFultbol;

import java.util.Date;

public class Futbolista extends Contingente {
    private String posicion;
    private String lateralidadDominante;
    private int cantidadDeGoles;


    public Futbolista(String nombre, String apellido, int pasaporte, Date fechaDeNacimiento, String paisDeOrigen, String paisActual, String posicion, String lateralidadDominante, int cantidadDeGoles) {
        super(nombre, apellido, pasaporte, fechaDeNacimiento, paisDeOrigen, paisActual);
        this.posicion = posicion;
        this.lateralidadDominante = lateralidadDominante;
        this.cantidadDeGoles = cantidadDeGoles;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getLateralidadDominante() {
        return lateralidadDominante;
    }

    public void setLateralidadDominante(String lateralidadDominante) {
        this.lateralidadDominante = lateralidadDominante;
    }

    public int getCantidadDeGoles() {
        return cantidadDeGoles;
    }

    public void setCantidadDeGoles(int cantidadDeGoles) {
        this.cantidadDeGoles = cantidadDeGoles;
    }
    @Override
    public boolean disponible(){
        return super.disponible();
    }
}
