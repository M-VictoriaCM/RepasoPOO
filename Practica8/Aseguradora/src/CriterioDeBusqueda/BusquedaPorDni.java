package CriterioDeBusqueda;

import Aseguradora.Seguro;

public class BusquedaPorDni implements CriterioDeBusqueda{
    private int dni;

    public BusquedaPorDni(int dni) {
        this.dni = dni;
    }

    @Override
    public boolean cumple(Seguro s) {
        return s.getDni() == dni;
    }
}
