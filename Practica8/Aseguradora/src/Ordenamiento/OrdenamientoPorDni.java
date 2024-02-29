package Ordenamiento;

import Aseguradora.Seguro;

public class OrdenamientoPorDni extends Ordenamiento {

    @Override
    public int comparar(Seguro s1, Seguro s2) {
        return s1.getDni() - s2.getDni();
    }
}
