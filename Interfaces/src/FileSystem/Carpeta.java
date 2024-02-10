package FileSystem;

import java.nio.file.FileSystem;
import java.util.ArrayList;

public class Carpeta extends ElementoFS{
    private ArrayList<ElementoFS>elementos;

    public Carpeta(String nombre) {
        super(nombre);
        this.elementos= new ArrayList<>();
    }
    public int getTamanio(){
        int suma=0;
        for(ElementoFS elemento: elementos){
            suma +=elemento.getTamanio();
        }
        return suma;
    }
    public int cantidadDeArchivos(){
        int cantidad= elementos.size();
        for(ElementoFS elemento : elementos){
            cantidad+=elemento.cantidadDeArchivos();
        }
        return cantidad;
    }

    private void addElemento(ElementoFS c){
        if(!elementos.contains(c)){
            elementos.add(c);
        }
    }
    @Override
    public boolean equals(Object  obj){
        try{
            Carpeta otraCarpeta = (Carpeta) obj;
            return this.getNombre().equals(otraCarpeta.getNombre());
        }catch (Exception e){
            return false;
        }
    }
}
