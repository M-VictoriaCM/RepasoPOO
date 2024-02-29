import java.util.Comparator;

public abstract class Ordenamiento implements Comparator<Socio> {
    private Ordenamiento comparador;

    public Ordenamiento() {
        this.comparador = null;
    }

    public Ordenamiento(Ordenamiento comparador) {
        this.comparador = comparador;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        int resultado = comparar(o1, o2);
        if(resultado ==0){
            comparador.compare(o1, o2);
        }else{
            return 0;
        }
        return resultado;
    }

    public abstract  int comparar(Socio s1, Socio s2);
}
