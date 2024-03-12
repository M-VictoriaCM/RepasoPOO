package Carpinteria;

import Criterio.Especialidades;

import java.util.ArrayList;

public class Taller {
    private String nombre;
    private ArrayList<Especialidades>especialidades;
    private ArrayList<Elemento>elementos;

    public Taller(String nombre) {
        this.nombre = nombre;
        this.especialidades= new ArrayList<>();
        this.elementos = new ArrayList<>();
    }
    public void addEspecialidades(Especialidades esp){
        especialidades.add(esp);
    }
    public boolean aceptaElemento(Elemento e){
        for(Especialidades especialidad: especialidades){
            if (!especialidad.cumple(e)){
                return false;
            }
        }
        return true;
    }
    public void agregarElementoAlTaller(Elemento e){
        elementos.add(e);
    }
}
