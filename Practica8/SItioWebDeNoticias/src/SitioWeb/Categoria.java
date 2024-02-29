package SitioWeb;


import CriterioDeBusqueda.CriterioDeBusqueda;

import java.util.ArrayList;

public class Categoria extends ElementoWeb{
    private ArrayList<ElementoWeb>elementos;
    private String descripcion;
    private String imagen;

    public Categoria(String descripcion, String imagen) {
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.elementos= new ArrayList<>();
    }
    public void addElemento(ElementoWeb e){
        elementos.add(e);
    }

    @Override
    public int cantidadNoticias() {
        int contador= 0;
        for(ElementoWeb e: elementos){
            contador += e.cantidadNoticias();
        }
        return contador;
    }

    @Override
    public ArrayList<Noticia> buscar(CriterioDeBusqueda criterio) {
        ArrayList<Noticia>encotrada= new ArrayList<>();
        for(ElementoWeb e: elementos){
            encotrada.addAll((e.buscar(criterio)));
        }
        return encotrada;
    }

    @Override
    public ElementoWeb copiaRestringida(CriterioDeBusqueda c) {
        ArrayList<ElementoWeb>copiaHijo= new ArrayList<>();
        for(ElementoWeb e: elementos){
            ElementoWeb copia= e.copiaRestringida(c);
            if(copia != null){
                copiaHijo.add(copia);
            }
        }
        if(copiaHijo.isEmpty()){
            return  null;
        }
        Categoria copia = new Categoria(descripcion, imagen);
        for(ElementoWeb e: elementos){
            copia.addElemento(e);
        }
        return copia;
    }

    @Override
    public ArrayList<String> imprimirMapaSitio() {
        ArrayList<String>salida = new ArrayList<>();
        String generales = this.getDescripcion();
        salida.add(generales);
        for(ElementoWeb e: elementos){
            for(String string : e.imprimirMapaSitio()){
                String nuevo = generales + "\\"+string;
                salida.add(nuevo);
            }

        }
        return salida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public boolean equals(Object obj){
        try{
            Categoria otra= (Categoria) obj;
            return this.getDescripcion().equals(otra.getDescripcion()) &&
                    this.getImagen().equals(otra.getImagen());
         }catch (Exception e){
            return false;
        }
    }

}
