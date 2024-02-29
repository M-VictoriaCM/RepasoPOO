package Agroquimicos;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrecuentes;

    public Cultivo(String nombre) {
        this.nombre = nombre;
        this.enfermedadesFrecuentes= new ArrayList<>();
    }
    public void addEnfermedadesFrecuentes(Enfermedad enf){
        if(!this.enfermedadesFrecuentes.contains(enf)){
            this.enfermedadesFrecuentes.add(enf);
        }
    }
    public boolean tieneEnfermedad(Enfermedad enf){
        return this.enfermedadesFrecuentes.contains(enf);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
