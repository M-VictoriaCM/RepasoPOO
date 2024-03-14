package Editorial;

import Criterio.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Elemento {
    private String nombre;
    private LocalDate anioDePublicacion;
    private Persona editor;

    public Elemento(String nombre, LocalDate anioDePublicacion, Persona editor) {
        this.nombre = nombre;
        this.anioDePublicacion = anioDePublicacion;
        this.editor = editor;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public void setAnioDePublicacion(LocalDate anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }

    public Persona getEditor() {
        return editor;
    }

    public void setEditor(Persona editor) {
        this.editor = editor;
    }
    public abstract ArrayList<String>getTema();
    public abstract int cantidadPaginas();
    public abstract Elemento copiaRestringida(Criterio c);
    public abstract double getMonto();

    public boolean equals(Object obj){
        try{
            Elemento otro = (Elemento) obj;
            return this.getNombre().equals(otro.getNombre()) &&
                    this.getEditor().equals(otro.getEditor());
        }catch(Exception e){
            return false;
        }
    }
}
