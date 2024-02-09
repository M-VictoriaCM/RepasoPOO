package PuertoDeCereales;

public class Barco extends Elemento{
    private String nombre;
    private String patente;
    private double capacidad;

    public Barco(String nombre, String patente, double capacidad) {
        this.nombre = nombre;
        this.patente = patente;
        this.capacidad = capacidad;
    }

    @Override
    public boolean esMayor(Elemento otrElemento) {
        Barco otroBarco = (Barco) otrElemento;
        return this.getCapacidad() > otroBarco.getCapacidad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Barco{" +"\n"+
                "nombre='" + nombre + '\'' +"\n"+
                ", patente='" + patente + '\'' +"\n"+
                ", capacidad=" + capacidad +"\n"+
                '}';
    }
}
