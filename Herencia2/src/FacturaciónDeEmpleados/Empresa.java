package FacturaciónDeEmpleados;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado>empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados= new ArrayList<>();
    }
    public void addEmpleado(Empleado e){
        if(!empleados.contains(e)){
            empleados.add(e);
        }
    }
    public double sumaTotalDeGasto(){
        int suma=0;
        for(int i=0; i< empleados.size(); i++){
            suma+= empleados.get(i).getSueldo();
        }
        return suma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
