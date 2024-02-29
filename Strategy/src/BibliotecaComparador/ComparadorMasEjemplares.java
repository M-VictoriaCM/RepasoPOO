package BibliotecaComparador;

import java.util.Comparator;

public class ComparadorMasEjemplares implements Comparator<Libro> {
    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getCantidadDeEjemplares()-o2.getCantidadDeEjemplares();
    }
}
