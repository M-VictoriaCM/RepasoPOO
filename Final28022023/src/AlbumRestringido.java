import java.time.LocalDate;

public class AlbumRestringido extends Album {
    private int limite;

    public AlbumRestringido(String titulo, LocalDate fecha, int limite) {
        super(titulo, fecha);
        this.limite = limite;
    }

    @Override
    public void addElemento(Elemento e) {
        if(getCantidadDeElemento() <= limite) {
            super.addElemento(e);
        }
    }
}
