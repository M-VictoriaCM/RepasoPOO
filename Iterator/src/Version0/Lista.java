package Version0;

import java.util.Iterator;

public class Lista implements Iterable<Integer>{
    private Nodo primero;

    public Lista() {
        this.primero= null;
    }
    public void addNumero(int nuevoNodo){
        Nodo nuevo = new Nodo(nuevoNodo);
        if(primero == null){
            primero= nuevo;
        }else{
            Nodo nodoActual = primero;
            while(nodoActual.getSiguiente() != null){
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nuevo);
        }
    }
    public void remove(int numeroAeliminar){
        if(primero !=null){
            Nodo actual =primero;
            Nodo anterior = null;
            while((actual != null)&&(actual.getValor()!=numeroAeliminar)){//Esta parte busca el valor
                anterior = actual;
                actual =actual.getSiguiente();
            }
            if((actual!= null) && (actual.getValor()== numeroAeliminar)){
                anterior.setSiguiente(actual.getSiguiente());
            }
            if(actual == primero){
                primero = actual.getSiguiente();
            }else if((actual !=  null) && (actual.getValor() ==numeroAeliminar)){
                anterior.setSiguiente(actual.getSiguiente());
            }
        }
    }
    public boolean isEmpty(){
        return primero ==null;
    }
    private int size(){
        int cantidad =0;
        Nodo  actual=primero;
        while(actual != null){
            cantidad++;
            actual = actual.getSiguiente();
        }
        return cantidad;
    }

    public Iterator<Integer> iterator() {
        return new IteradorDeLista(primero);
    }
}
