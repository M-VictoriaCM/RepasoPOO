package CandyCrush;

public class Espacio implements Condicion{
    private int lugar;

    public Espacio(int lugar) {
        this.lugar = lugar;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getEspacioQueOpcupa()>=lugar;
    }
}
