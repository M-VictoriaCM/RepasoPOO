import java.time.LocalDate;

public abstract class Elemento {
    private String titulo;
    private LocalDate fecha;

    public Elemento(String titulo, LocalDate fecha) {
        this.titulo = titulo;
        this.fecha = LocalDate.now();
    }
    public abstract int getCantidadDeElemento();
    public abstract int getPesoTotal();
    public abstract Elemento copia(Criterio criterio);

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
