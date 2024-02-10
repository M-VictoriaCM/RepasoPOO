package FileSystem;

import java.time.LocalDate;

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
