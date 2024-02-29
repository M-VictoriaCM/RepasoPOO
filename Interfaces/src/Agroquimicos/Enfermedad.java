package Agroquimicos;

import java.util.ArrayList;

public class  Enfermedad {
    private String nombre;
    private ArrayList<String>estadosPatologicos;

    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.estadosPatologicos= new ArrayList<>();
    }
    public boolean esTratada(ProductoQuimico pq){
        for(String estado: estadosPatologicos){
            if(pq.tieneEstadoPatologico(estado)){
               return true;
            }
        }
        return false;
    }
    public boolean contieneEstado(String estado){
        return this.estadosPatologicos.contains(estado);
    }
    public void addEstadosPatologicos(String estados){
        if(!this.estadosPatologicos.contains(estados)){
            this.estadosPatologicos.add(estados);
        }
    }
    public void removeEstado(String estado){
        this.estadosPatologicos.remove(estado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
