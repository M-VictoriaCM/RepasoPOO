package version1;

public class Nodo {
    private Nodo hijoIzq;
    private Nodo hijoDer;
    private Nodo padre;
    private int valor;

    public Nodo(int valor) {
        this.valor = valor;
        this.hijoDer=null;
        this.hijoIzq = null;
    }
    public Nodo(int valor, Nodo  padre){
        this(valor);
        this.padre= padre;
    }
    public void add(int valor){
        if(this.valor>valor){
            if(hijoDer == null){
                hijoDer = new Nodo(valor, this);
            }else{
                hijoDer.add(valor);
            }
        }else{
            if(hijoIzq== null){
                hijoIzq= new Nodo(valor, this);
            }else{
                hijoDer.add(valor);
            }
        }
    }
    public boolean contains(int valor){
        if(this.valor ==valor){
            return true;
        }else if(valor > this.valor && hijoDer!= null){
            return hijoDer.contains(valor);
        }else if(valor < this.valor && hijoIzq != null){
            return hijoIzq.contains(valor);
        }
        return false;
    }
}
