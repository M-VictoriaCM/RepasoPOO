package CentroDeComputos;

public class Computadora extends Elemento{
    private String nombre;
    private double velocidadCPU;
    private double memoriaDisponible;

    public Computadora(String nombre,double velocidadCPU, double memoriaDisponible) {
        this.nombre = nombre;
        this.velocidadCPU = velocidadCPU;
        this.memoriaDisponible = memoriaDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidadCPU() {
        return velocidadCPU;
    }

    public void setVelocidadCPU(double velocidadCPU) {
        this.velocidadCPU = velocidadCPU;
    }

    public double getMemoriaDisponible() {
        return memoriaDisponible;
    }

    public void setMemoriaDisponible(double memoriaDisponible) {
        this.memoriaDisponible = memoriaDisponible;
    }


    @Override
    public boolean esMayor(Elemento otroElemento) {
        Computadora otraPc =(Computadora) otroElemento;
        return this.getVelocidadCPU() > otraPc.getVelocidadCPU();
    }
    @Override
    public String toString() {
        return "Computadora{" +
                "nombre='" + nombre + '\'' +
                ", velocidadCPU=" + velocidadCPU +
                ", memoriaDisponible=" + memoriaDisponible +
                '}';
    }
}
