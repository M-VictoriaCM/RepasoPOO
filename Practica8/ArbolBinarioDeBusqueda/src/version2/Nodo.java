package version2;

import Version3.AccionEjecutable;

import java.util.ArrayList;

public class Nodo {
    private Nodo hijoIzq;
    private Nodo hijoDer;
    private Nodo padre;
    private Comparable valor;

    public Nodo(Comparable valor) {
        this.valor = valor;
        this.hijoDer=null;
        this.hijoIzq = null;
    }
    public Nodo(Comparable valor, Nodo  padre){
        this(valor);
        this.padre= padre;
    }
    public void add(Comparable valor){
        if (valor.compareTo(this.valor)>0){
            if (hijoDer == null){
                hijoDer = new Nodo(valor, this);
            }
            else hijoDer.add(valor);
        }
        else {
            if (hijoIzq == null){
                hijoIzq = new Nodo(valor, this);
            }
            else hijoIzq.add(valor);
        }
    }
    public boolean contains(Comparable valor){
        if(this.valor.compareTo(valor)==0){
            return true;
        }else if(valor.compareTo(this.valor) >0 && hijoDer!= null){
            return hijoDer.contains(valor);
        }else if(valor.compareTo(this.valor) < 0 && hijoIzq != null){
            return hijoIzq.contains(valor);
        }
        return false;
    }
    public void recorrido(AccionEjecutable accion){
        if(hijoIzq !=null){
            hijoIzq.recorrido(accion);
        }
        accion.ejecutarNodo(valor);
        if(hijoDer != null){
            hijoDer.recorrido(accion);
        }
    }

    /*public ArrayList<Comparable>recorrido(){
        ArrayList<Comparable>listaAux = new ArrayList<>();
        if(hijoIzq != null){
            listaAux.addAll(hijoIzq.recorrido());
        }listaAux.add(this.valor);
        if(hijoDer != null){
            listaAux.addAll(hijoIzq.recorrido());
        }
        return listaAux;
    }*/

    @Override
    public String toString() {
        return this.valor + "\n"+
                "( "+this.hijoIzq+"\n"+
                this.hijoDer+")";
    }
}
