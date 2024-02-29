package CandyCrush;

public class PoderDeDestruccion implements Condicion{
    private int poder;

    public PoderDeDestruccion(int poder) {
        this.poder = poder;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getPoderDeDestruccion()>= poder;
    }
}
