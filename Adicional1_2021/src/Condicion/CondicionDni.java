package Condicion;

import Adicional.Cliente;

public class CondicionDni implements Condicion{
    private int dni;

    public CondicionDni(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public boolean cumple(Cliente cliente) {
        return cliente.getDni() <= this.getDni();
    }
}
