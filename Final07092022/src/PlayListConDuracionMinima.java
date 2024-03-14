public class PlayListConDuracionMinima extends PlayList {
    private double duracionMinima;

    public PlayListConDuracionMinima(String nombre, double duracionMinima) {
        super(nombre);
        this.duracionMinima = duracionMinima;
    }

    @Override
    public void addElemento(Elemento e) {
        if(e.getDuracion() >= duracionMinima){
            super.addElemento(e);
        }

    }
}
