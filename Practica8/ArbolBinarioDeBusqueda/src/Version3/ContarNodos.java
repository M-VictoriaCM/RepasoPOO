package Version3;

public class ContarNodos implements AccionEjecutable{
    private int contador;

    public ContarNodos() {
        this.contador = 0;
    }

    public int getContador() {
        return contador;
    }
    @Override
    public void ejecutarNodo(Object nodo) {
        contador++;

    }
}
