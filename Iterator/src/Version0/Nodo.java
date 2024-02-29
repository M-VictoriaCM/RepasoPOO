package Version0;

public class Nodo {
    private Nodo siguiente;
    private int valor;

    public Nodo(int valor) {
        this.siguiente = null;
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public int getValor() {
        return valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
