package Strategy;

import Editorial.Capitulo;

public class MontoporCantidadAutores extends Calculadora{
    private double monto;

    public MontoporCantidadAutores(double monto) {
        this.monto = monto;
    }

    @Override
    public double calcular(Capitulo cap) {
        return monto * cap.cantidadAutore();
    }
}
