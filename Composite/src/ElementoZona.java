package OMS;

import Criterio.Criterio;

import java.util.ArrayList;

public abstract class ElementoZona {
    private String nombre;

    public ElementoZona(String nombre) {
        this.nombre = nombre;
    }

    //TODO Contar la cantidad de voluntarios que participaron del estudio.
    public abstract int cantidadVoluntarios();
    //TODO Contar la cantidad de voluntarios que recibieron un placebo.
    public abstract int cantidadVoluntarios(Criterio c);
    //TODO Obtener el porcentaje de voluntarios que recibieron la vacuna.
    public double getPorcentaje(Criterio c){
        double total= cantidadVoluntarios();
        if(total ==0){
            return 0;
        }else {
            return (cantidadVoluntarios(c) / total) * 100;
        }
    }
    public abstract ArrayList<Voluntario>listarVoluntarios(Criterio c);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
