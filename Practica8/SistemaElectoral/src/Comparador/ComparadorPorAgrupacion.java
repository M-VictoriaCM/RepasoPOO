package Comparador;

import SistemaElectoral.Candidato;

import java.util.Comparator;

public class ComparadorPorAgrupacion implements Comparator<Candidato> {
    @Override
    public int compare(Candidato o1, Candidato o2) {
        return o1.getAgrupacion().compareTo(o2.getAgrupacion());
    }
}
