package FileSystem;

public class ArchivoComprimido extends Carpeta{
    private double factorDeCompresion;
    public ArchivoComprimido(String nombre, double factorDeCompresion) {
        super(nombre);
        this.factorDeCompresion= factorDeCompresion;
    }

    @Override
    public int getTamanio() {
        return (int) (super.getTamanio()*factorDeCompresion);
    }

}
