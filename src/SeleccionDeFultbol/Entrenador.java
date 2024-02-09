package SeleccionDeFultbol;

import java.util.Date;

public class Entrenador extends Contingente{
    private int idDeLaFederacion;

    public Entrenador(String nombre, String apellido, int pasaporte, Date fechaDeNacimiento, String paisDeOrigen, String paisActual, int idDeLaFederacion) {
        super(nombre, apellido, pasaporte, fechaDeNacimiento, paisDeOrigen, paisActual);
        this.idDeLaFederacion = idDeLaFederacion;
    }

    public int getIdDeLaFederacion() {
        return idDeLaFederacion;
    }
    @Override
    public boolean disponible(){
        return super.disponible();
    }
}
