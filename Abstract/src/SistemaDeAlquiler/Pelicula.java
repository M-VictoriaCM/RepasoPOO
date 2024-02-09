package SistemaDeAlquiler;

public class Pelicula  extends Item{
    private String nombre;
    private String informacionFilmografica;
    private int cantidadDeCopias;

    public Pelicula(String nombre, String informacionFilmografica, int cantidadDeCopias) {
        super();
        this.nombre = nombre;
        this.informacionFilmografica = informacionFilmografica;
        this.cantidadDeCopias = cantidadDeCopias;
    }
    //TODO debo controlar las copias disponibles
    public boolean copiasDisponibles(){
        return this.getCantidadDeCopias()>0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInformacionFilmografica() {
        return informacionFilmografica;
    }

    public void setInformacionFilmografica(String informacionFilmografica) {
        this.informacionFilmografica = informacionFilmografica;
    }

    public int getCantidadDeCopias() {
        return cantidadDeCopias;
    }

    public void setCantidadDeCopias(int cantidadDeCopias) {
        if(copiasDisponibles()){
            this.cantidadDeCopias = cantidadDeCopias;
        }
    }
    @Override
    public void alquilar(Cliente c) {
        if(this.copiasDisponibles() && this.isDisponible()){
            this.isDisponible();
            setCantidadDeCopias(this.getCantidadDeCopias()-1);
        }
    }
    @Override
    public void devolucion(Cliente c) {
        setCantidadDeCopias(getCantidadDeCopias()+1);
        this.isDisponible();
    }
    @Override
    public boolean isDisponible() {
        return this.cantidadDeCopias > 0;
    }
}
