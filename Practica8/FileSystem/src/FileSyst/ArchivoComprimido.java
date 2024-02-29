package FileSyst;

import CriterioDeBusqueda.CriterioDeBusqueda;

import java.util.ArrayList;

public class ArchivoComprimido extends Carpeta{
    private double factorDeCompresion;
    public ArchivoComprimido(String nombre, double factorDeCompresion) {
        super(nombre);
        this.factorDeCompresion= factorDeCompresion;
    }

    @Override
    public Carpeta duplicar() {
        return new ArchivoComprimido(this.getNombre(), this.factorDeCompresion);
    }

    @Override
    public ArrayList<ElementoFS> buscar(CriterioDeBusqueda criterio) {
        ArrayList<ElementoFS>encontrado = new ArrayList<>();
        for(ElementoFS e: elementos){
            if(!e.buscar(criterio).isEmpty()){
                encontrado.add(this);
                return encontrado;
            }
        }

        return encontrado;
    }

    @Override
    public int getTamanio() {
        return (int) (super.getTamanio()*factorDeCompresion);
    }

}
