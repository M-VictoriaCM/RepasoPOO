package Version3;

import java.util.Vector;

public class OrdenAscendente implements AccionEjecutable{
    private Vector vector;

    public OrdenAscendente(Vector vector) {
        this.vector = vector;
    }

    @Override
    public void ejecutarNodo(Object nodo) {
        vector.add(nodo);
    }
}
