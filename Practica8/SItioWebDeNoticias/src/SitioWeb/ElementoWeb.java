package SitioWeb;

import CriterioDeBusqueda.CriterioDeBusqueda;

import java.util.ArrayList;

public abstract class ElementoWeb{

    public abstract int cantidadNoticias();
    public abstract ArrayList<Noticia>buscar(CriterioDeBusqueda criterio);
    public abstract ElementoWeb copiaRestringida(CriterioDeBusqueda c);
    public abstract ArrayList<String> imprimirMapaSitio();

}
