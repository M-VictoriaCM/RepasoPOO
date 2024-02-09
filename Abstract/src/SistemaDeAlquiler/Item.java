package SistemaDeAlquiler;

public abstract class Item {
    //TODO hacer  comportamiento para alquilar items
    private Cliente c;

    public Item() {
        this.c=c;
    }
    public abstract void alquilar(Cliente c);
    public abstract void devolucion(Cliente c);

    public abstract boolean isDisponible();


}
