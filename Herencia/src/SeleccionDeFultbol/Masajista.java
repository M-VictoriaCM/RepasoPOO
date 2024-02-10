package SeleccionDeFultbol;

import java.util.Date;

public class Masajista extends Contingente{
    private String titulo;
    private int anioDeExperiencia;

    public Masajista(String nombre, String apellido, int pasaporte, Date fechaDeNacimiento, String paisDeOrigen, String paisActual, String titulo, int anioDeExperiencia) {
        super(nombre, apellido, pasaporte, fechaDeNacimiento, paisDeOrigen, paisActual);
        this.titulo = titulo;
        this.anioDeExperiencia = anioDeExperiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioDeExperiencia() {
        return anioDeExperiencia;
    }

    public void setAnioDeExperiencia(int anioDeExperiencia) {
        this.anioDeExperiencia = anioDeExperiencia;
    }
    @Override
    public boolean disponible(){
        return super.disponible();
    }
}
