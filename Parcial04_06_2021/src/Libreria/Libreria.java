package Libreria;

import Criterio.MarcaIgual;
import Criterio.Politica;
import Criterio.PrecioIgual;

import java.util.ArrayList;

public class Libreria {
    private String nombre;
    private ArrayList<Elementolibreria>utiles;
    private Politica politica;

    public Libreria(String nombre) {
        this.nombre = nombre;
        this.politica = politica;
    }

    /*TODO Implementar un servicio para que, dado un producto/kit/paquete, determine si se puede
                   publicitar en el diario*/
    public boolean saleEnElDiario(Elementolibreria e){
        return politica.cumple(e);
    }
    public void setPoliticaPublicitaria(Politica politica){
        this.politica=politica;
    }
    public ArrayList<Elementolibreria>buscar(Politica politica){
        ArrayList<Elementolibreria>encontrado =new ArrayList<Elementolibreria>();
        for(Elementolibreria e: utiles){
            encontrado.addAll(e.buscar(politica));
        }
        return encontrado;
    }
    public void addUtiles(Elementolibreria e){
        this.utiles.add(e);
    }

    public static void main(String[] args) {
        Libreria libreria = new Libreria("La Libreria");

        Producto p1= new Producto("Fibra", "Pelikan", 181.00, 95.00 );
        Producto p2= new Producto("Fibra1", "Pelikan", 181.00, 100.00 );
        Producto p3= new Producto("Fibra2", "Standler", 181.00, 200.00 );

        Kit k= new Kit("Fibras");
        k.addElemento(p1);
        k.addElemento(p2);
        k.addElemento(p3);

        libreria.addUtiles(k);

        Politica politica1 = new MarcaIgual("Standler");
        System.out.println(libreria.buscar(politica1));

    }

}
