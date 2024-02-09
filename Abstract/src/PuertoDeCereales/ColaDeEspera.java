package PuertoDeCereales;

import java.util.ArrayList;

public class ColaDeEspera {
    private ArrayList<Elemento>elementos;

    public ColaDeEspera() {
        this.elementos= new ArrayList<>();
    }
    public void add(Elemento nuevo){
        boolean insertada= false;
        int i=0;
        while(i<elementos.size() && !insertada){
            if(nuevo.esMayor(elementos.get(i))){
                elementos.add(i, nuevo);
                insertada = true;
            }
            i++;
        }
        if(!insertada){
            elementos.add(nuevo);
        }
    }
    public int size(){
        return elementos.size();
    }
    public Elemento get(int index){
        return elementos.get(index);
    }
}
