package Ordenamiento;

import Aseguradora.Seguro;

import java.util.Comparator;

public abstract class Ordenamiento implements Comparator<Seguro> {
    private Ordenamiento comparador;
    public Ordenamiento() {
        this.comparador = null;
    }

    public Ordenamiento(Ordenamiento comparador) {
        this.comparador = comparador;
    }

    @Override
    public int compare(Seguro s1, Seguro s2) {
        int resultado = comparar(s1, s2);
        if(resultado == 0){
            if(comparador != null){
                comparador.compare(s1, s2);
            }else{
                return 0;
            }
        }
        return resultado;
    }

    public abstract int comparar(Seguro s1, Seguro s2);
}
