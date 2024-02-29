package Aseguradora;

import CriterioDeBusqueda.CriterioDeBusqueda;
import Ordenamiento.Ordenamiento;

import java.util.ArrayList;

public abstract class Seguro {
    private int dni;
    private String descripcion;

    public Seguro(int dni, String descripcion) {
        this.dni = dni;
        this.descripcion = descripcion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract int getPoliza();
    public abstract double getMontoAsegurado();
    public abstract double costo();
    public abstract ArrayList<Seguro>buscar(CriterioDeBusqueda c, Ordenamiento o);
}
