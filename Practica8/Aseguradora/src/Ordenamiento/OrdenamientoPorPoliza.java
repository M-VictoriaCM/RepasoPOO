package Ordenamiento;

import Aseguradora.Seguro;

public class OrdenamientoPorPoliza extends Ordenamiento{
    @Override
    public int comparar(Seguro s1, Seguro s2) {
        return s1.getPoliza()- s2.getPoliza();
    }
}
