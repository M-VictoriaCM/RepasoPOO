package FileSyst;

import CriterioDeBusqueda.CriterioDeBusqueda;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoFS {
    protected String nombre;
   private LocalDate fechaDeCreacion;
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
    public abstract ArrayList<ElementoFS>buscar(CriterioDeBusqueda criterio);
    public abstract ElementoFS copia();//Copia completa
    public abstract ElementoFS copiaRestringida(CriterioDeBusqueda c);

    @Override
    public String toString() {
        return "FileSyst.ElementoFS{" +"\n"+
                "nombre='" + nombre + '\'' +"\n"+
                ", fechaDeCreacion=" + fechaDeCreacion +"\n"+
                ", fechaDeModificacion=" + fechaDeModificacion +
                '}'+"\n";
    }
}
