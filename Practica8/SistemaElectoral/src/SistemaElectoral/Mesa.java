package SistemaElectoral;

import Criterio.Criterio;

import java.util.ArrayList;
import java.util.Collections;

public class Mesa extends ElmentoEstablecimiento {
    private ArrayList<Voto>votos;
    private ArrayList<Integer>padron;
    private int numero;

    public Mesa(int numero) {
        this.numero = numero;
        this.padron = new ArrayList<>();
        this.votos = new ArrayList<>();
    }
    public boolean dniHabilitado(int dni){
        return this.padron.contains(dni);
    }
    public void emitirVoto(int dni, Candidato c){
        if(!dniHabilitado(dni)){
            votos.add(new Voto(c));
        }
    }
    public ArrayList<Integer>getPadron(){
        ArrayList<Integer>copia = new ArrayList<>();
        copia.addAll(padron);
        return copia;
    }
    //TODO servicios
    @Override
    public int cantidadTotalDeVotos() {
        return votos.size();
    }

    @Override
    public int cantidadVotos(Criterio c) {
        int total=0;
        for(Voto v: votos){
            if(c.cumple(v)){
                total++;
            }
        }
        return total;
    }

    @Override
    public ArrayList<Candidato> listarCandidatos() {
        ArrayList<Candidato>lista = new ArrayList<>();
        for(Voto v: votos){
            Candidato c = v.getVotado();
            if(!lista.contains(c)){
                lista.add(c);
            }
        }
        Collections.sort(lista);
        return lista;
    }


}
