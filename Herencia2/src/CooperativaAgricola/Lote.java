package CooperativaAgricola;

import java.util.ArrayList;

public class Lote {
    private int superficie;
    private ArrayList<String> minerales;
    private Cereal cereales;

    public Lote(int superficie) {
        this.superficie = superficie;
        this.minerales =new ArrayList<>();
    }
    public boolean acepta(Cereal c){
        return true;
    }
    public void add(String m){
        if(!minerales.contains(m)){
            minerales.add(m);
        }
    }
    public ArrayList<String>getMinerales(){//esto es una copia de la lista
        ArrayList<String>aux = new ArrayList<String>();
        aux.addAll(minerales);
        return aux;
    }
    public boolean contieneMineral(String m){
        return minerales.contains(m);
    }
    public int getSuperficie() {
        return superficie;
    }
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

}
