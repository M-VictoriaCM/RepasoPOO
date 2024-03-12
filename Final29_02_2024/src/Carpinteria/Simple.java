package Carpinteria;

public class Simple extends Elemento{
    private double peso;
    private double precioBase;
    public Simple(String nombre, String tipo, String modoPresentacion, double peso, double precioBase) {
        super(nombre, tipo, modoPresentacion);
        this.peso= peso;
        this.precioBase= precioBase;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public double getPrecioBase() {
        return precioBase;
    }
}
