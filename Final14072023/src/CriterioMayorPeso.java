public class CriterioMayorPeso implements Criterio{
    private int peso;

    public CriterioMayorPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(Fotografia fotografia) {
        return fotografia.getPeso() > peso;
    }
}
