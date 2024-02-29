package BibliotecaComparador;

import java.time.LocalDate;

public class Libro {
    private String nombre;
    private LocalDate fechaDeCompra;
    private int cantidadDeEjemplares;
    private int cantidadDeVecesPrestados;

    public Libro(String nombre, LocalDate fechaDeCompra, int cantidadDeEjemplares, int cantidadDeVecesPrestados) {
        this.nombre = nombre;
        this.fechaDeCompra = fechaDeCompra;
        this.cantidadDeEjemplares = cantidadDeEjemplares;
        this.cantidadDeVecesPrestados = cantidadDeVecesPrestados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(LocalDate fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public int getCantidadDeEjemplares() {
        return cantidadDeEjemplares;
    }

    public void setCantidadDeEjemplares(int cantidadDeEjemplares) {
        this.cantidadDeEjemplares = cantidadDeEjemplares;
    }

    public int getCantidadDeVecesPrestados() {
        return cantidadDeVecesPrestados;
    }

    public void setCantidadDeVecesPrestados(int cantidadDeVecesPrestados) {
        this.cantidadDeVecesPrestados = cantidadDeVecesPrestados;
    }
    public boolean equals(Object obj){
        try{
            Libro otroLibro = (Libro) obj;
            return this.getNombre().equals(otroLibro.getNombre()) &&
                    this.getFechaDeCompra().equals(otroLibro.getFechaDeCompra());
        }catch(Exception e){
            return false;
        }
    }
}
