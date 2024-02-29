package Version0;

import java.util.Iterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Lista listaPrueba = new Lista();
        listaPrueba.addNumero(5);
        listaPrueba.addNumero(3);
        listaPrueba.addNumero(6);
        listaPrueba.addNumero(7);

        Iterator<Integer>it= listaPrueba.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
       }
        System.out.println("--------------------------------------");
       for(Integer i: listaPrueba){
           System.out.println(i);
       }
    }
}