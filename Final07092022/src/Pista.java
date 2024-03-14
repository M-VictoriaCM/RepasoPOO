import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;

public class Pista extends Elemento{
    private int id;
    private String titulo;
    private double duracion;
    private String artista;
    private String tituloAlbum;
    private LocalDate anio;
    private String genero;

    public Pista(int id, String titulo, double duracion, String artista, String tituloAlbum, LocalDate anio, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.artista = artista;
        this.tituloAlbum = tituloAlbum;
        this.anio = anio;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public double getDuracion() {
        return duracion;
    }

    @Override
    public ArrayList<Pista> buscar(Criterio criterio) {
        ArrayList<Pista>encontrada= new ArrayList<>();
        if(criterio.cumple(this)){
            encontrada.add(this);
        }
        return encontrada;
    }

    @Override
    public Elemento copia(Criterio criterio) {
        if(criterio.cumple(this)){
            Pista copia = new Pista(getId(), getTitulo(), getDuracion(), getArtista(),getTituloAlbum(), getAnio(),getGenero());

            return  copia;
        }
        return null;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTituloAlbum() {
        return tituloAlbum;
    }

    public void setTituloAlbum(String tituloAlbum) {
        this.tituloAlbum = tituloAlbum;
    }

    public LocalDate getAnio() {
        return anio;
    }

    public void setAnio(LocalDate anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
