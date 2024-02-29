package version2;

import Version3.AccionEjecutable;

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
    public void recorrido(AccionEjecutable accion){
        if(!isEmpty()){
         raiz.recorrido(accion);
        }
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
