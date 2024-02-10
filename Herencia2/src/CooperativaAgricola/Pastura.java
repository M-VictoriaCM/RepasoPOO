package CooperativaAgricola;

public class Pastura extends Cereal {
    private int superficieMinima;

    public Pastura(String nombre) {
        super(nombre);
    }
    @Override
    public boolean acepta(Lote l){
        if(this.getSuperficieMinima() > superficieMinima){
            return super.acepta(l);
        }
        return true;
    }

    public int getSuperficieMinima() {
        return superficieMinima;
    }

    public void setSuperficieMinima(int superficieMinima) {
        this.superficieMinima = superficieMinima;
    }


}
