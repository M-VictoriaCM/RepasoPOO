package FileSyst;

import CriterioBusqueda.ContieneNombre;
import CriterioDeBusqueda.CriterioDeBusqueda;
import CriterioBusqueda.FechaDeCreacion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Explore {
    private Carpeta raiz;

    public Explore() {
        this.raiz = new Carpeta("/");
    }
    public void addCarpeta(ElementoFS elem){
        raiz.addElemento(elem);
    }
    public ArrayList<ElementoFS> buscar(CriterioDeBusqueda criterio){
        return raiz.buscar(criterio);

    }

    public static void main(String[] args) {
        Explore explore = new Explore();
        Carpeta tudai = new Carpeta("TUDAI");
        Carpeta anio1= new Carpeta("1er anio");
        Carpeta anio2 = new Carpeta("2do anio");

        Archivo calendario = new Archivo("calendario", "pdf", 100);
        tudai.addElemento(calendario);
        tudai.addElemento(anio1);
        tudai.addElemento(anio2);

        Carpeta prog2= new Carpeta("prg2");
        Archivo parcial = new Archivo("Parcial", "doc", 1500);
        Archivo recu= new Archivo("Recu", "pdf", 987);
        Archivo prefi = new Archivo("Prefi", "txt", 1050);

        prog2.addElemento(parcial);
        prog2.addElemento(recu);
        prog2.addElemento(prefi);
        anio1.addElemento(prog2);
        explore.addCarpeta(tudai);
        parcial.setFechaDeModificacion(LocalDate.of(2024, 02, 19));

        CriterioDeBusqueda busqueda= new ContieneNombre("anio");
        //System.out.println(explore.buscar(busqueda));

        CriterioDeBusqueda fecha = new FechaDeCreacion(LocalDate.of(2024, 02, 20));
        System.out.println(explore.buscar(fecha));

    }
}
