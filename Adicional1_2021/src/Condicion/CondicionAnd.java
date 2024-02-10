package Condicion;

import Adicional.Cliente;

public class CondicionAnd implements Condicion{
    Condicion c1, c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Cliente cliente) {
        return c1.cumple(cliente) && c2.cumple(cliente);
    }
}
