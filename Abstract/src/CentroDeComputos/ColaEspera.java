package CentroDeComputos;

import java.util.ArrayList;
import java.util.Objects;

public class ColaEspera{
    ArrayList<Elemento>elementos;

    public ColaEspera() {
        this.elementos= new ArrayList<>();
    }

    public void add(Elemento nuevaElemento){
        boolean insertada = false;
        int i = 0;
        while (i<elementos.size() && !insertada){
            if (nuevaElemento.esMayor(elementos.get(i)) ){
                elementos.add(i, nuevaElemento);
                insertada = true;
            }
            i++;
        }
        if (!insertada)
            elementos.add(nuevaElemento);
    }

    public int size(){
        return elementos.size();
    }
    public Elemento get(int index){
        return  elementos.get(index);
    }

}
