package BibliotecaStrategy;

public class LibroMasNuevo extends Estrategia{


    @Override
    public boolean comparar(Libro libro, Libro masNuevo) {
        return libro.getFechaDeCompra().isAfter(masNuevo.getFechaDeCompra());
    }
}
