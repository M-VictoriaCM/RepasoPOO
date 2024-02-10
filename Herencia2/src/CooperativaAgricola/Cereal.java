package CooperativaAgricola;

import java.util.ArrayList;

public class Cereal {
    protected String nombre;
    protected ArrayList<String>mineralesRequeridos;

    public Cereal(String nombre) {
        this.nombre = nombre;
        this.mineralesRequeridos= new ArrayList<>();
    }
    public void addMinerales(String m){
        if(!this.mineralesRequeridos.contains(m)){
            this.mineralesRequeridos.add(m);
        }
    }
    public boolean requiereMineral(String m){
       return mineralesRequeridos.contains(m);
    }

    public boolean acepta(Lote l){
        for(int i=0; i<mineralesRequeridos.size(); i++){
            if(!l.contieneMineral(mineralesRequeridos.get(i))){
                return false;
            }
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
