package FileSyst;

import CriterioDeBusqueda.CriterioDeBusqueda;

import java.util.ArrayList;

public class Carpeta extends ElementoFS{
    protected ArrayList<ElementoFS>elementos;

    public Carpeta(String nombre) {
        super(nombre);
        this.elementos= new ArrayList<>();
    }
    public int getTamanio(){
        int suma=0;
        for(ElementoFS elemento: elementos){
            suma +=elemento.getTamanio();
        }
        return suma;
    }
    public int cantidadDeArchivos(){
        int cantidad= elementos.size();
        for(ElementoFS elemento : elementos){
            cantidad+=elemento.cantidadDeArchivos();
        }
        return cantidad;
    }

    public void addElemento(ElementoFS c){
        if(!elementos.contains(c)){
            elementos.add(c);
        }
    }
    @Override
    public boolean equals(Object  obj){
        try{
            Carpeta otraCarpeta = (Carpeta) obj;
            return this.getNombre().equals(otraCarpeta.getNombre());
        }catch (Exception e){
            return false;
        }
    }
    @Override
    public ArrayList<ElementoFS> buscar(CriterioDeBusqueda criterio) {
        ArrayList<ElementoFS>encontrado = new ArrayList<>();
        if(criterio.cumple(this)){//si la carpeta cumple
            encontrado.add(this);
        }
        for(ElementoFS e: elementos){//sino, busca en los hijos
            encontrado.addAll(e.buscar(criterio));
        }
        return encontrado;
    }
    public Carpeta duplicar(){
        return  new Carpeta(this.getNombre());
    }

    @Override
    public ElementoFS copia() {
        Carpeta copia = duplicar();
        for(ElementoFS e: elementos){
            copia.addElemento(e.copia());
        }
        return copia;
    }

    @Override
    public ElementoFS copiaRestringida(CriterioDeBusqueda c) {
        //intento duplicar los hijos y los
        ArrayList<ElementoFS>copiaHijos = new ArrayList<>();
        for(ElementoFS e: elementos){//en caso que no devuelva null lo agrrega
            ElementoFS copiaElemento = e.copia();
            if(copiaElemento != null){
                copiaHijos.add(copiaElemento);
            }
        }
        Carpeta copia =null;
        if(c.cumple(this)){
            copia=duplicar();
        }
        if(!copiaHijos.isEmpty()){//vefico los hijos en caso que la carpeta sea null
            copia = duplicar();
            for(ElementoFS hijo: copiaHijos){
                copia.addElemento(hijo);
            }
        }
        return null;
    }

}
