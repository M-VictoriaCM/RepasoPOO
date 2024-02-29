package Criterio;

import SistemaElectoral.Voto;

public class PorCandidato implements Criterio{
    private String nombre;

    public PorCandidato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Voto v) {
        return v.getVotado().getNombre().contains(nombre);
    }
}
