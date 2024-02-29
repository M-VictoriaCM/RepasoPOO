package ExpresionesMatematicas.Operacion;

public class Resta implements Operacion{
    @Override
    public double aplicar(double a, double b) {
        return a-b;
    }
}
