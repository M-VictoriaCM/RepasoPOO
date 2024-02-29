package Version1;

import java.util.Iterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ListaOrdenada listaPrueba = new ListaOrdenada();
        listaPrueba.add(5);
        listaPrueba.add(3);
        listaPrueba.add(6);
        listaPrueba.add(7);
        listaPrueba.add(1);

        System.out.println("--------------------------------------");
       for(Comparable i: listaPrueba){
           System.out.println(i);
       }
    }
}