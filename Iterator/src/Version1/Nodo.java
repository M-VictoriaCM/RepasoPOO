package Version1;

import java.util.Comparator;

public class Nodo {
    private Nodo siguiente;
    private Comparable valor;

    public Nodo(Comparable valor) {
        this.siguiente = null;
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Comparable getValor() {
        return valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setValor(Comparable valor) {
        this.valor = valor;
    }
}
