package Version3;

public class ImprimirEnPantalla implements AccionEjecutable{
    @Override
    public void ejecutarNodo(Object nodo) {
        System.out.println(nodo.toString());
    }
}
