package Empresa;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String apellido;
    private ArrayList<Curso>cursosAprobados;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public boolean tieneCursoAprobado(Curso curso){
        return cursosAprobados.contains(curso);
    }
    public void addCursoAprobados(Curso curso){
        if(cursosAprobados== null){
            cursosAprobados= new ArrayList<>();
        }
    }
    public ArrayList<Curso>getCursosAprobados(){
        ArrayList<Curso> copia= new ArrayList<>();

        copia.addAll(cursosAprobados);

        return copia;
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
}
