package CriterioDeBusqueda;

import Aseguradora.Seguro;

public class BusquedaMontoSuperior implements CriterioDeBusqueda{
    private double monto;

    public BusquedaMontoSuperior(double monto) {
        this.monto = monto;
    }

    @Override
    public boolean cumple(Seguro s) {
        return s.getMontoAsegurado() > monto;
    }
}
