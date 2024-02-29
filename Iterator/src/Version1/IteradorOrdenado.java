package Version1;

import java.util.Iterator;

public class IteradorOrdenado implements Iterator<Comparable> {
    private Nodo actual;
    public IteradorOrdenado(Nodo primerElemento) {
        this.actual =primerElemento;
    }

    @Override
    public boolean hasNext() {
        if(actual != null){
            return true;
        }
        return false;
    }

    @Override
    public Comparable next() {
        Nodo nodoActual =actual;
        if(hasNext()){
            actual = nodoActual.getSiguiente();
            return nodoActual.getValor();
        }
        return null;
    }
}
