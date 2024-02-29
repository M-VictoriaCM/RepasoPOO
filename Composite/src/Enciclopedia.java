package Editorial;

import Criterio.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Enciclopedia extends Elemento{//compuesto
    private String nombre;
    private ArrayList<Elemento>elementos;

    public Enciclopedia(String nombre, LocalDate anioDePublicacion, Persona editor, String nombre1) {
        super(nombre, anioDePublicacion, editor);
        this.nombre = nombre1;
    }
    public void addElemento(Elemento e){
        if(!this.elementos.contains(e)){
            this.elementos.add(e);
        }
    }

    @Override
    public ArrayList<String> getTema() {
        ArrayList<String>encontrado=new ArrayList<>();
        for(Elemento e: elementos){
            encontrado.addAll(e.getTema());
        }
        return encontrado;
    }

    @Override
    public int cantidadPaginas() {
        return 0;
    }

    @Override
    public Elemento copiaRestringida(Criterio c) {
        ArrayList<Elemento>copia = new ArrayList<>();
        for(Elemento e: elementos){
            Elemento aux=e.copiaRestringida(c);
            if(aux != null){
                copia.add(aux);
            }
            if(copia.size() > 0){
                Enciclopedia nueva = new Enciclopedia(nombre, getAnioDePublicacion(), getEditor(), nombre);
                for(Elemento el: copia){
                    nueva.addElemento(el);
                }
                return nueva;
            }else{
                return null;
            }
        }
        return null;
    }

    @Override
    public double getMonto() {
        int total= 0;
        for(Elemento e: elementos){
            total += e.getMonto();
        }
        return total;
    }

    /*TODO listado de todos los autores (sin repetidos) que trabajaron en una
        enciclopedia/libro.*/
        /*TODO listado de todos los editores (sin repetidos) que trabajaron en una
        enciclopedia/libro. */
    /* la cantidad de páginas de una enciclopedia/libro, la misma es la suma de las
        páginas de sus componentes.*/



}
