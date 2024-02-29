package ExpresionesMatematicas.Operacion;

public class Division implements Operacion{
    @Override
    public double aplicar(double a, double b) {
        if(b == 0){
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a/b;
    }
}
