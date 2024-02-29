package BibliotecaStrategy;

public class MasEjemplares extends Estrategia{

    @Override
    public boolean comparar(Libro libro, Libro masNuevo) {
        return libro.getCantidadDeEjemplares() > masNuevo.getCantidadDeEjemplares();
    }
}
