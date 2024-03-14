public class PlayListconDuracionMaxima extends PlayList {
    private double duracionMax;
    public PlayListconDuracionMaxima(String nombre, double duracionMax) {
        super(nombre);
        this.duracionMax = duracionMax;
    }

    @Override
    public void addElemento(Elemento e) {
        if(e.getDuracion()<= duracionMax) {
            super.addElemento(e);
        }
    }
}
