package BibliotecaComparador;

import BibliotecaStrategy.Estrategia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro>libros;
    private Comparator estrategias;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    public void addLibro(Libro l){
        this.libros.add(l);
    }
    public Libro prestar(String titulo){//Strategy
        ArrayList<Libro>encontrado= new ArrayList<>();
        for(Libro l : libros){
            if(l.getNombre().equals(titulo)){
                encontrado.add(l);
            }
        }
        if(encontrado.isEmpty()){
            return null;
        }else {
            Collections.sort(encontrado, estrategias);

        }
        return encontrado.get(0);
    }
    //TODO cambio de estrategia
    public void cambioDeEstrategia(Comparator nueva){
        estrategias = nueva;
    }
}
