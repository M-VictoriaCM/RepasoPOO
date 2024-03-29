package Condicion;

import Adicional.Cliente;

public class CondicionNot implements Condicion{
    Condicion condicion;

    public CondicionNot(Condicion condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Cliente cliente) {
        return !condicion.cumple(cliente);
    }
}
