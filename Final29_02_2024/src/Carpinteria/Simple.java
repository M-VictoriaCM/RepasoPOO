package Carpinteria;

public class Simple extends Elemento{
        private double peso;
    private double tiempoDePreparacion;
    private double precio;

    public Simple(String nombre, String tipo, String modoDePreparacion, double peso, double tiempoDePreparacion, double precio) {
        super(nombre, tipo, modoDePreparacion);
        this.peso = peso;
        this.tiempoDePreparacion=tiempoDePreparacion;
        this.precio= precio;
    }


    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public double getTiempoDePreparacion() {
        return tiempoDePreparacion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
