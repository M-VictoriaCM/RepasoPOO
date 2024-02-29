package CandyCrush;

public class FichaEspecial extends Ficha {

    public FichaEspecial(String nombre, int fortaleza, int poderDeDestruccion, int espacioQueOpcupa) {
        super(nombre, fortaleza, poderDeDestruccion, espacioQueOpcupa);
    }

    @Override
    public int getPoderDeDestruccion() {
        return (super.getFortaleza() / super.getEspacioQueOpcupa());
    }


}
