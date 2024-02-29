package Vivero;

import Vivero.Criterio.*;

import java.util.ArrayList;

public class Vivero {
    private String nombre;
    private ArrayList<Planta>plantas;

    public Vivero(String nombre) {
        this.nombre = nombre;
        this.plantas= new ArrayList<>();
    }
    public void addPlantas(Planta p){
        if(!this.plantas.contains(p)){
            this.plantas.add(p);
        }
    }
    private ArrayList<Planta>buscar(Criterio criterio){
        ArrayList<Planta>salida = new ArrayList<>();
        for(Planta p : plantas){
            if(criterio.cumple(p)){
                salida.add(p);
            }
        }
        return salida;
    }

    public static void main(String[] args) {
        Vivero vivero = new Vivero("ViveroX");

        Planta p1 = new Planta("Epipremnum aureum", "Epipremnum","Araceae", "Monocotyledoneae", "interior",4,3 );
        p1.addNombreVulgar("potus");
        p1.addNombreVulgar("pothos o potos");

        Planta p2 = new Planta("Aloe vera", "Aloe", "Xanthorrhoeaceae", "Monocotyledoneae", "exterior", 6, 2);
        p2.addNombreVulgar("sábila");

        //Agrego las plantas al vivero
        vivero.addPlantas(p1);
        vivero.addPlantas(p2);


        //TODO a)Todas las plantas cuyo nombre científico incluya la palabra “auereum
        Criterio nombreCientifico = new NombreCientifico("Epipremnum aureum");
        System.out.println("Todas las plantas cuyo nombre científico incluya la palabra “auereum");
        System.out.println(vivero.buscar(nombreCientifico));
        System.out.println("-------------------------------------------------------------------------------------");
        //TODO b) Todas las plantas a las que se conozca vulgarmente como “lengua de suegra
        System.out.println("Todas las plantas a las que se conozca vulgarmente como “lengua de suegra");
        Criterio nombreVulgar = new NombreVulgar("lengua de suegra");
        for (Planta p: vivero.buscar(nombreVulgar)){
            System.out.println("Nombre vulgar "+p);
        }
        System.out.println("-------------------------------------------------------------------------------------");
        //TODO c) Todas las plantas cuya clasificación sea “Crassula”
        Criterio clasificacion = new Clasificacion("Crassula");
        System.out.println("Todas las plantas cuya clasificación sea “Crassula”");
        System.out.println(vivero.buscar(clasificacion));
        System.out.println("-------------------------------------------------------------------------------------");
        //TODO d) Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3
        System.out.println("Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3");
        Criterio busquedaAnd= new And(new SolSuperior(5),
                new Not(new RiegoSuperior(3)));
        for (Planta p: vivero.buscar(busquedaAnd)){
            System.out.println("Plantas"+ p);
        }

        System.out.println("-------------------------------------------------------------------------------------");
        //TODO e)Todas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4
        Criterio busquedaAnd1= new And(new Not(new SolSuperior(4)), new RiegoSuperior(4));
        System.out.println("Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3");
        for (Planta p: vivero.buscar(busquedaAnd1)){
            System.out.println(p);
        }
        System.out.println("-------------------------------------------------------------------------------------");
        //TODO f) Todas las plantas de interior que necesiten poco riego (inferior a 3)
        System.out.println("Todas las plantas de interior que necesiten poco riego (inferior a 3)");
        Criterio busqueda3 = new Not(new RiegoSuperior(3));
        System.out.println(vivero.buscar(busqueda3));
        System.out.println("-------------------------------------------------------------------------------------");


    }
}
