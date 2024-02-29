package Version3;

import java.util.ArrayList;

public class Arbol {
    private Nodo raiz;

    public void addValor(Comparable valor){
        if (!isEmpty()) {
            if (!this.contains(valor))
                raiz.add(valor);
        }
        else {
            raiz = new Nodo(valor);
        }
    }
    public boolean contains(Comparable valor){
        if(!isEmpty()){
            return false;
        }
        return raiz.contains(valor);
    }
    public boolean isEmpty(){
        return raiz== null;
    }
    public ArrayList<Comparable>recorrido(){
        if(!isEmpty()){
          return raiz.recorrido();
        }
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        if(!isEmpty()){
            return raiz.toString();
        }else {
            return "";
        }
    }
}
