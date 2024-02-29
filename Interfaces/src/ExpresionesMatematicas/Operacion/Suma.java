package ExpresionesMatematicas.Operacion;

public class Suma implements Operacion{
    @Override
    public double aplicar(double a, double b) {
        return a + b;
    }
}
