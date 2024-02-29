package Version1;

import java.util.Iterator;

public class ListaOrdenada implements Iterable<Comparable>{
    private Nodo primero;

    public ListaOrdenada () {
        this.primero= null;
    }
    public void add(Comparable nuevoNodo){
        Nodo nuevo = new Nodo(nuevoNodo);
        if(primero == null){
            primero= nuevo;
        }else{
            Nodo nodoActual = primero;
            Nodo anterior = null;
            while((nodoActual != null)&& (nodoActual.getValor().compareTo(nuevoNodo)<0)){
                anterior = nodoActual;
                nodoActual = nodoActual.getSiguiente();
            }
            if(nodoActual == null){//si es null inserto al final
                anterior.setSiguiente(nuevo);
            }else{
                nuevo.setSiguiente(nodoActual);
                if(nodoActual == primero){
                    primero = nuevo;
                }else{
                    anterior.setSiguiente(nuevo);
                }
            }

        }
    }
    public void remove(Comparable numeroAeliminar){
        if(primero !=null){
            Nodo actual =primero;
            Nodo anterior = null;
            while((actual != null)&&(!actual.getValor().equals(numeroAeliminar)) && actual.getValor().compareTo(numeroAeliminar)>0){//Esta parte busca el valor
                anterior = actual;
                actual =actual.getSiguiente();
            }
            if((actual!= null) && (!actual.getValor().equals(numeroAeliminar))){
                anterior.setSiguiente(actual.getSiguiente());
            }
            if(actual == primero){
                primero = actual.getSiguiente();
            }else if((actual !=  null) && (!actual.getValor().equals(numeroAeliminar))){
                anterior.setSiguiente(actual.getSiguiente());
            }
        }
    }
    public boolean isEmpty(){
        return primero ==null;
    }
    private int size(){
        int cantidad =0;
        Nodo actual=primero;
        while(actual != null){
            cantidad++;
            actual = actual.getSiguiente();
        }
        return cantidad;
    }

    @Override
    public Iterator<Comparable> iterator() {
        return new IteradorOrdenado(primero);
    }
}
