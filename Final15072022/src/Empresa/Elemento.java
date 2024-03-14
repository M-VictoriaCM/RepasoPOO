package Empresa;

import Criterio.Criterio;

import java.util.ArrayList;

public abstract class Elemento {
    private String nombre;
    private String tema;

    public Elemento() {
        this.nombre = nombre;
        this.tema = tema;
    }

    public Elemento(String nombre, String tema) {
        this.nombre = nombre;
        this.tema = tema;
    }

    public abstract double getCosto();
    public abstract int getNumeroDeCreditos();
    public abstract ArrayList<Curso>buscar(Criterio criterio);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
