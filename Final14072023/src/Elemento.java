import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Elemento {
    private String titulo;
    private LocalDate fechaDeCreacion;

    public Elemento(String titulo, LocalDate fechaDeCreacion) {
        this.titulo = titulo;
        this.fechaDeCreacion= LocalDate.now();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    //TODO Peso total del album
    public abstract int getPeso();
    //TODO cantidad de fotografias
    public abstract int getCantidadFotografias();

    //TODO listado de personas(sin repetir), que aparecen en la coleccion
    public abstract ArrayList<String>listaDepersonas();

    //TODO busqueda de fotografias por criterios
    public abstract ArrayList<Fotografia>buscar(Criterio criterio);
}
