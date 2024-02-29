package BibliotecaStrategy;

public class MenosPrestado extends Estrategia{

    @Override
    public boolean comparar(Libro libro, Libro masNuevo) {
        return libro.getCantidadDeVecesPrestados() < masNuevo.getCantidadDeVecesPrestados();
    }
}
