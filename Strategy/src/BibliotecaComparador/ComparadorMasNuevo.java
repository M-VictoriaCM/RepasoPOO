package BibliotecaComparador;

import java.util.Comparator;

public class ComparadorMasNuevo implements Comparator<Libro> {
    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getFechaDeCompra().compareTo(o2.getFechaDeCompra());
    }
}
