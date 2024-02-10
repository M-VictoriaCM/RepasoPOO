package Adicional;

public class ClienteExigente extends Cliente{


    public ClienteExigente(String nombre, String apellido, int dni, String direccion, double descuento) {
        super(nombre, apellido, dni, direccion, descuento);
    }

    @Override
    public boolean leGustaLibro(Libro l) {
        return super.leGustaLibro(l) && leGustaGenero(l);
    }
}
