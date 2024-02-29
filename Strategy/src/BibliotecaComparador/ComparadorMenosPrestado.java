package BibliotecaComparador;

import java.util.Comparator;

public class ComparadorMenosPrestado implements Comparator<Libro>{
    @Override
    public int compare(Libro o1, Libro o2) {
        return o2.getCantidadDeVecesPrestados() - o1.getCantidadDeVecesPrestados();
    }
}
