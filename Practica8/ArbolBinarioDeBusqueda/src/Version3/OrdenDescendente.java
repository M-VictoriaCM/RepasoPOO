package Version3;

import java.util.Vector;

public class OrdenDescendente implements AccionEjecutable{
    private Vector vector;

    public OrdenDescendente(Vector vector) {
        this.vector = vector;
    }

    @Override
    public void ejecutarNodo(Object nodo) {
        vector.add(0, nodo);
    }
}
