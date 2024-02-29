package version2;

import Version3.*;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
       /* Arbol palabras =  new Arbol();
        palabras.addValor("hola");
        palabras.addValor("como");
        palabras.addValor("Estas");
        palabras.addValor("perro");

        palabras.recorrido();*/

        Arbol numeros = new Arbol();
        numeros.addValor(8);
        numeros.addValor(3);
        numeros.addValor(10);
        numeros.addValor(1);
        numeros.addValor(6);
        numeros.addValor(4);
        numeros.addValor(7);
        numeros.addValor(10);
        numeros.addValor(14);
        numeros.addValor(13);

        System.out.println("Recorrido en orden");
        numeros.recorrido(new ImprimirEnPantalla());
        //TODO Crear una acción que permita incorporar los elementos de forma ordenada
        //ascendentemente a un Vector.
        Vector ascendente = new Vector();
        numeros.recorrido(new OrdenAscendente(ascendente));
        System.out.println("vector ascendente"+ ascendente);

        //TODO Crear una acción que permita incorporar los elementos de forma ordenada
        //descendentemente a un Vector.
        Vector descente = new Vector();
        numeros.recorrido(new OrdenDescendente(descente));
        System.out.println("vector descente"+descente);

        //TODO Crear una acción que cuente la cantidad de elementos visitados.
        ContarNodos contar= new ContarNodos();
        numeros.recorrido(contar);
        System.out.println("la cantidad de nodos es: "+contar.getContador());

    }
}
