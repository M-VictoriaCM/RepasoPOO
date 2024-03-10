package Carpinteria;

import Calculador.AdicionalPorCondicion;
import Calculador.AplicoAdicional;
import Calculador.PorcentajeAdicional;
import Criterio.Criterio;
import Criterio.CriterioTipo;
import Criterio.CriterioPresentacion;
import Criterio.CriterioAnd;
import Criterio.CriterioMayorTiempo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear un pedido
        Pedido pedido = new Pedido(1, "Vendedor 1");
        Simple elem1 = new Simple("Tabla de picar", "Cocina", "Crudo", 1.5, 2, 100);
        Simple elem2 =new Simple("Cuchillo", "Cocina", "Laqueado", 0.5, 1, 50);
        Simple elem3 =new Simple("Tenedor", "Cocina", "Laqueado", 0.25, 1, 30);
        Simple elem4 = new Simple("Plato", "Cocina", "Laqueado", 0.25, 1, 25);

        // Agregar elementos al pedido
        pedido.addElemento(elem1);
        pedido.addElemento(elem2);
        pedido.addElemento(elem3);
        pedido.addElemento(elem4);

        Pedido pedido1 = new Pedido(2, "Vendedor 2");
        Complejo com1 = new Complejo("Juego de tablas de carne y picada","Crudo", "Laqueado");
        Complejo com2 = new Complejo("Juego de asado completo", "Cocina", "Crudo");

        // Definir criterios de selección de elementos para los talleres
        Criterio criterioCocinaLaqueado = new CriterioAnd(new CriterioTipo("Cocina"), new CriterioPresentacion("laqueado"));
        Criterio criterioCocinaMas6Dias = new CriterioAnd(new CriterioTipo("Cocina"), new CriterioMayorTiempo(6));

        Carpinteria carpinteria = new Carpinteria();
        // Obtener los elementos del pedido que se pueden preparar en el taller 1
        ArrayList<Elemento> elementosTaller1= carpinteria.derivoATaller(criterioCocinaLaqueado);

        // Obtener los elementos del pedido que se pueden preparar en el taller 2
        ArrayList<Elemento> elementosTaller2 = carpinteria.derivoATaller(criterioCocinaMas6Dias);



        // Mostrar información del pedido 1
        System.out.println("Pedido:");
        System.out.println("Local: " + pedido.getLocal());
        System.out.println("Vendedor: " + pedido.getVendedor());
        System.out.println("Elementos"+pedido.getElementos());

        // Calculamos el costo total del pedido
        AplicoAdicional adicionalPorcentaje = new PorcentajeAdicional(10);
        double costoTotal1 = pedido.costoTotal(adicionalPorcentaje);

        // Imprimimos el costo total
        System.out.println("Costo total del pedido: $" + costoTotal1);

        // Calcular el costo total del pedido con el adicional por tiempo de preparación
        AplicoAdicional adicionalTiempo = new AdicionalPorCondicion(new CriterioMayorTiempo(2), 50);
        double costoTotal = pedido.costoTotal(adicionalTiempo);
        // Imprimimos el costo total
        System.out.println("Costo total del pedido: $" + costoTotal);


        // Mostrar información de los elementos que se pueden preparar en el taller 1
        System.out.println("Elementos para taller 1:");
        for (Elemento elemento : elementosTaller1) {
            System.out.println(" - " + elemento.getNombre());
        }

        // Mostrar información de los elementos que se pueden preparar en el taller 2
        System.out.println("Elementos para taller 2:");
        for (Elemento elemento : elementosTaller2) {
            System.out.println(" - " + elemento.getNombre());
        }
    }
}
