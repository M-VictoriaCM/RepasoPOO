package FileSystem;

import java.time.LocalDate;

public abstract class ElementoFS {
    protected String nombre;
    protected LocalDate fechaDeCreacion;
    protected LocalDate fechaDeModificacion;

    public ElementoFS(String nombre) {
        this.nombre = nombre;
        this.fechaDeCreacion = LocalDate.now();
        this.fechaDeModificacion = fechaDeCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public LocalDate getFechaDeModificacion() {
        return fechaDeModificacion;
    }

    protected void setFechaDeModificacion(LocalDate fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }
    public abstract int getTamanio();
    public abstract int cantidadDeArchivos();
}
