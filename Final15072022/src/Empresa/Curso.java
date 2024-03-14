package Empresa;

import Criterio.Criterio;

import java.util.ArrayList;

public class Curso extends Elemento{
    private double costo;
    private int numeroDeCreditos;
    private String profesor;
    public Curso(String nombre, String tema, double costo, int numeroDeCreditos, String profesor) {
        super(nombre, tema);
        this.costo=costo;
        this.numeroDeCreditos= numeroDeCreditos;
        this.profesor=profesor;
    }

    public Curso(String nombre, String tema, double costo, int numeroDeCreditos) {
        super(nombre, tema);
        this.costo=costo;
        this.numeroDeCreditos= numeroDeCreditos;
        this.profesor=profesor;
    }

    @Override
    public double getCosto() {
        return costo;
    }

    @Override
    public int getNumeroDeCreditos() {
        return numeroDeCreditos;
    }

    @Override
    public ArrayList<Curso> buscar(Criterio criterio) {
        ArrayList<Curso>encontrado= new ArrayList<>();
        if(criterio.cumple(this)){
            encontrado.add(this);
        }
        return encontrado;
    }
    public boolean equals(Object obj){
        try{
            Curso otro= (Curso) obj;
            return this.getNombre().equals(otro.getNombre()) &&
                    this.getTema().equals(otro.getTema()) &&
                    this.getProfesor().equals(otro.getProfesor()) &&
                    this.getCosto() == otro.getCosto();
        }catch (Exception e){
            return false;
        }
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
}
