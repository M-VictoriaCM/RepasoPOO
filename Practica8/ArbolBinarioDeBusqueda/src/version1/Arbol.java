package version1;

public class Arbol {
    private Nodo raiz;

    public void addNodo(int valor){
        if(!isEmpty()){
            if(!this.contains(valor)){
                raiz.add(valor);
            }
            raiz.add(valor);
        }else {
            raiz = new Nodo(valor);
        }
    }
    public boolean contains(int valor){
        if(isEmpty()){
            return false;
        }else {
            return raiz.contains(valor);
        }
    }
    public boolean isEmpty(){
        return raiz== null;
    }
}
