package FileSyst;

import CriterioDeBusqueda.CriterioDeBusqueda;

import java.util.ArrayList;

public class AccesoDirecto extends ElementoFS{
    private ElementoFS elementoFS;
    public static final String PREFIJO= "Acceso directo a ";
    public static final int TAMANIO =1;

    public AccesoDirecto(ElementoFS elementoFS) {
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

    @Override
    public ArrayList<ElementoFS> buscar(CriterioDeBusqueda criterio) {
        ArrayList<ElementoFS>encontrado = new ArrayList<>();
        if(criterio.cumple(this.elementoFS)){
            encontrado.add(this);
        }
        return encontrado;
    }

    @Override
    public ElementoFS copia() {
        return new AccesoDirecto(this.elementoFS.copia());
    }

    @Override
    public ElementoFS copiaRestringida(CriterioDeBusqueda c) {
        return null;
    }
}
