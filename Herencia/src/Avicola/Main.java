package Avicola;

import Avicola.TipoDeCongelados.PorAgua;
import Avicola.TipoDeCongelados.PorAire;
import Avicola.TipoDeCongelados.PorNitrogeno;

import java.sql.Time;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear un producto fresco
        Fresco productoFresco = new Fresco(new Date(), 123, new Date(), "Granja A");
        System.out.println(productoFresco);
        System.out.println("------------------------------------------------------------------------");

        // Crear un producto refrigerado
        Refrigerados productoRefrigerado = new Refrigerados(new Date(), 456, new Date(), "Granja B", 789, 5);
        System.out.println(productoRefrigerado);
        System.out.println("------------------------------------------------------------------------");
        // Crear un producto congelado por aire
        PorAire productoPorAire = new PorAire(new Date(), 789, new Date(), "Granja C", 10, 20, 30, 40);
        System.out.println(productoPorAire);
        System.out.println("------------------------------------------------------------------------");
        // Crear un producto congelado por agua
        PorAgua productoPorAgua = new PorAgua(new Date(), 101, new Date(), "Granja D", 50, 2);
        System.out.println(productoPorAgua);
        System.out.println("------------------------------------------------------------------------");
        // Crear un producto congelado por nitrógeno
        PorNitrogeno productoPorNitrogeno = new PorNitrogeno(new Date(), 121, new Date(), "Granja E", 123, 50,"Informacion del producto", new java.sql.Time(5000));
        System.out.println(productoPorNitrogeno);
    }

}