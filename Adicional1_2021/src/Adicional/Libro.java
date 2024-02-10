package Adicional;

import java.util.ArrayList;

public class Libro extends ElementoLibreria{
    private int cantidadDePaginas;
    private String resumen;
    private String genero;

    public Libro(String nombre, String autor, double precio, int cantidadDePaginas, String resumen, String genero) {
        super(nombre, autor, precio);
        this.cantidadDePaginas = cantidadDePaginas;
        this.resumen = resumen;
        this.genero = genero;
    }

    public int getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    public void setCantidadDePaginas(int cantidadDePaginas) {
        this.cantidadDePaginas = cantidadDePaginas;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
