package SistemaElectoral;

import Criterio.Criterio;

import java.util.ArrayList;
import java.util.Collections;

public class Establecimiento extends ElmentoEstablecimiento {
    private ArrayList<ElmentoEstablecimiento>elementos;

    public Establecimiento() {
        this.elementos = new ArrayList<>();
    }
    public void addElemento(ElmentoEstablecimiento e){
        if(!this.elementos.contains(e)){
            this.elementos.add(e);
        }
    }
    //TODO servicios
    @Override
    public int cantidadTotalDeVotos() {
        int total =0;
        for (ElmentoEstablecimiento e: elementos){
            total += e.cantidadTotalDeVotos();
        }
        return total;
    }

    @Override
    public int cantidadVotos(Criterio c) {
        int total=0;
        for(ElmentoEstablecimiento e: elementos){
            total+= e.cantidadVotos(c);
        }
        return total;
    }

    @Override
    public ArrayList<Candidato> listarCandidatos() {
        ArrayList<Candidato>lista = new ArrayList<>();
        for (ElmentoEstablecimiento e : elementos){
            ArrayList<Candidato>aux = e.listarCandidatos();
            for(Candidato l : aux){
                if(!lista.contains(l)){
                    lista.add(l);
                }
            }
        }
        Collections.sort(lista);
        return lista;
    }


}
