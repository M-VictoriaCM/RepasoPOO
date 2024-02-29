package BibliotecaStrategy;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro>libros;
    private Estrategia estrategias;

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
        return estrategias.elegi(encontrado);
    }
    //TODO cambio de estrategia
    public void cambioDeEstrategia(Estrategia nueva){
        estrategias = nueva;
    }
}
