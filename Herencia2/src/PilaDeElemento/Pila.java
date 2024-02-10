package PilaDeElemento;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pila {
    private ArrayList<Object>pilas;

    public Pila() {
        this.pilas=new ArrayList<>();
    }
    public void push(Object o){//Metodo para insertar
        this.pilas.add(0,o);
    }
    public Object pop(){//Metodo para saca el ultimo elemento
        if(pilas.size()>0){
            return pilas.remove(0);
        }else{
            return null;
        }
    }
    public int size(){//retorna la cantidad de elementos
        return this.pilas.size();
    }
    public Pila copy(){//devuelve una copia de la pila
       Pila copia = new Pila();

        for(int i=0; i<size()-1; i--){
            copia.push(this.pilas.get(i));
            return copia;
        }
        return null;
    }
    public Object top(){
        Object aux = null;
        int size=size();
        if(size >0){
            aux=pilas.get(0 );
        }
        return aux;
    }
    public Object reverse(){//devuelve una copia de la pila
        Pila copia = new Pila();

        for (int i = size() - 1; i >= 0; i--) {
            copia.push(this.pilas.get(i));
        }

        return copia;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size(); i++) {
            result.append(pilas.get(i));
            if (i < size() - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

}
