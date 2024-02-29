package FileSyst;

import CriterioDeBusqueda.CriterioDeBusqueda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Archivo extends ElementoFS {
    private String extension;
    private int tamanio;

    public Archivo(String nombre, String extension, int tamanio) {
        super(nombre);
        this.extension = extension;
        this.tamanio = tamanio;
    }

    public String getExtension() {
        return extension;
    }

    public int getTamanio() {
        return tamanio;
    }

    @Override
    public int cantidadDeArchivos() {
        return 1;
    }

    @Override
    public ArrayList<ElementoFS> buscar(CriterioDeBusqueda criterio) {
        ArrayList<ElementoFS>encontrado = new ArrayList<>();
        if(criterio.cumple(this)){
            encontrado.add(this);
        }
        return encontrado;
    }

    @Override
    public ElementoFS copia() {
        ElementoFS copia= new Archivo(this.getNombre(), this.getExtension(), this.getTamanio());

        return copia;
    }

    @Override
    public ElementoFS copiaRestringida(CriterioDeBusqueda c) {
        if(c.cumple(this)){
            ElementoFS copia = new Archivo(this.getNombre(), this.getExtension(), this.getTamanio());
            return copia;
        }else {
            return null;
        }
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
        this.setFechaDeModificacion(LocalDate.now());
    }

    @Override
    public boolean equals(Object obj){
        try{
            Archivo otroArchivo = (Archivo) obj;
            return this.getNombre().equals(otroArchivo.getNombre()) &&
                    this.getExtension().equals(otroArchivo.getExtension());
        }catch (Exception e){
            return false;
        }
    }
}
