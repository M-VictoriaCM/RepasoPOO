package Editorial;

import Strategy.Calculadora;

import java.util.ArrayList;

public class Capitulo {
    private String nombre;
    private ArrayList<Persona>autores;
    private String tema;
    private int cantidadPaginas;
    public Calculadora calcularMonto;

    public Capitulo(String nombre, String tema, int cantidadPaginas) {
        this.nombre = nombre;
        this.tema = tema;
        this.cantidadPaginas= cantidadPaginas;
    }
    public double getMonto(){
        return calcularMonto.calcular(this);
    }
    public boolean esRevisor(Persona p){
        return !this.autores.contains(p);
    }
    public boolean esAutor(Persona persona){
        return this.autores.contains(persona);
    }
    public int cantidadAutore(){
        return autores.size();
    }
    public void addAutores(Persona persona){
        if(!esRevisor(persona)){
            this.autores.add(persona);
        }
    }


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

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }
}
