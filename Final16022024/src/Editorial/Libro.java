package Editorial;

import Criterio.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Libro extends Elemento{
    private ArrayList<Capitulo> capitulos;

    public Libro(String nombre, LocalDate anioDePublicacion, Persona editor) {
        super(nombre, anioDePublicacion, editor);
        this.capitulos = new ArrayList<>();
    }
    public void addCapitulo(Capitulo cap){
        if(!this.capitulos.contains(cap)){
            this.capitulos.add(cap);
        }
    }

    @Override
    public ArrayList<String> getTema() {
        ArrayList<String>encontrado = new ArrayList<>();
        for(Capitulo c: capitulos){
            encontrado.add(c.getTema());
        }
        return encontrado;
    }

    @Override
    public int cantidadPaginas() {
        int total = 0;
        for(Capitulo c: capitulos){
            total+= c.getCantidadPaginas();
        }
        return total;
    }

    @Override
    public Elemento copiaRestringida(Criterio c) {
        for(Capitulo cap :capitulos){
            if(c.cumple(cap)){
                Libro copia = new Libro(this.getNombre(), getAnioDePublicacion(), getEditor());
                return copia;
            }
        }
        return null;
    }

    @Override
    public double getMonto() {
        int total= 0;
        for(Capitulo c : capitulos){
            total+= c.getMonto();
        }
        return total;
    }

}
