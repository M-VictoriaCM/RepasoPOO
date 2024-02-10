package CooperativaAgricola;

import java.util.ArrayList;

public class Cooperativa {
    private ArrayList<Lote>lotes;
    private ArrayList<Cereal>cereales;
    private ArrayList<String>mineralesDeInteresPrimario;

    public Cooperativa() {
        this.lotes = new ArrayList<>();
        this.cereales =cereales;
    }
    public boolean puedeSembrarse(Lote l, Cereal c){
        return c.acepta(l);
    }
    public ArrayList<Cereal>getCerealesQuePuedeEn(Lote l){
        ArrayList<Cereal>salida = new ArrayList<>();
        for(int i=0; i<cereales.size(); i++){
            Cereal aux = cereales.get(i);
            if(aux.acepta(l)){
                salida.add(aux);
            }
        }
        return salida;
    }
    public ArrayList<Lote>getLoteSirvePara(Cereal c){
        ArrayList<Lote>salida= new ArrayList<>();
        for(int i= 0; i<lotes.size(); i++){
            Lote aux = lotes.get(i);
            if(c.acepta(aux)){
                salida.add(aux);
            }
        }
        return salida;
    }

    public boolean esEspecial(Lote l){
        for(int i= 0; i<mineralesDeInteresPrimario.size(); i++){
            String mineral= mineralesDeInteresPrimario.get(i);
                if(l.contieneMineral(mineral)){
                    return true;
                }
            }
        return false;
    }

}
