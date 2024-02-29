package Adicional2022;

import java.util.ArrayList;

public class Paciente {
    private String nombre;
    private String apellido;
    private ArrayList<String>sintomas;
    private Mutual mutual;

    public Paciente(String nombre, String apellido, Mutual mutual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mutual = mutual;
        this.sintomas = new ArrayList<>();
    }
    public void addSintomas(String sintoma){
        if(!this.sintomas.contains(sintoma)){
            this.sintomas.add(sintoma);
        }
    }
    public boolean tieneSintomas(String sintoma){
        return this.sintomas.contains(sintoma);
    }
    //TODO verifica que un paciente puede ser tratado con un medicamento
    public boolean puedeSerTratadoPor(Medicamento m){
        for(String s: sintomas){
            if(! (m.tieneSintoma(s))){
                return false;
            }
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Mutual getMutual() {
        return mutual;
    }

    public void setMutual(Mutual mutual) {
        this.mutual = mutual;
    }
}
