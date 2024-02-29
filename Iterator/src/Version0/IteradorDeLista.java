package Version0;

import java.util.Iterator;

public class IteradorDeLista implements Iterator<Integer> {
    private Nodo actual;
    public IteradorDeLista(Nodo primerElemento) {
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
    public Integer next() {
        Nodo nodoActual =actual;
        if(hasNext()){
            actual = nodoActual.getSiguiente();
            return nodoActual.getValor();
        }
        return null;
    }
}
