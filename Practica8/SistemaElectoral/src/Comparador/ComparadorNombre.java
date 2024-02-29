package Comparador;

import SistemaElectoral.Candidato;

import java.util.Calendar;
import java.util.Comparator;

public class ComparadorNombre implements Comparator<Candidato> {
    @Override
    public int compare(Candidato o1, Candidato o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
