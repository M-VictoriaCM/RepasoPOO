package FileSystem;

public class AccesoDirecto extends ElementoFS{
    private ElementoFS elementoFS;
    public static final String PREFIJO= "Acceso directo a ";
    public static final int TAMANIO =1;

    public AccesoDirecto(String nombre, ElementoFS elementoFS) {
        super(PREFIJO+elementoFS.getNombre() );
        this.elementoFS = elementoFS;
    }
    @Override
    public String getNombre(){
        return PREFIJO+ elementoFS.getNombre();
    }

    @Override
    public int getTamanio() {
        return  TAMANIO;
    }

    @Override
    public int cantidadDeArchivos() {
        return 0;
    }
}
