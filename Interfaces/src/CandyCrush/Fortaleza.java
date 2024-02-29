package CandyCrush;

public class Fortaleza implements Condicion{
    private int fortaleza;

    public Fortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getFortaleza()> fortaleza;
    }
}
