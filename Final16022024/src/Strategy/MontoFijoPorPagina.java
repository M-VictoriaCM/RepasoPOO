package Strategy;

import Editorial.Capitulo;

public class MontoFijoPorPagina extends Calculadora{
    private double monto;

    public MontoFijoPorPagina(double monto) {
        this.monto = monto;
    }

    @Override
    public double calcular(Capitulo cap) {
        return monto * cap.getCantidadPaginas();
    }
}
