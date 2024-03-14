public class CriterioAnd implements Criterio{
    private Criterio condicion1, condicion2;

    public CriterioAnd(Criterio condicion1, Criterio condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }
    @Override
    public boolean cumple(Pista pista){
        return condicion1.cumple(pista)&& condicion2.cumple(pista);
    }
}
