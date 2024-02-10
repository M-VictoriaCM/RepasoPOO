package SombreroSeleccionador;

import java.util.ArrayList;

public class Casa {
    private String nombre;
    private ArrayList<String>cualidadesRequeridas;
    private ArrayList<Alumno>alumnos;
    private int cantidadMaximaDeAlumnos;

    public Casa(String nombre, int cantidadMaximaDeAlumnos) {
        this.nombre = nombre;
        cantidadMaximaDeAlumnos = cantidadMaximaDeAlumnos;
        this.cualidadesRequeridas = new ArrayList<>();
        this.alumnos= new ArrayList<>();
    }
    public void addCualidades(String c){
        if(!this.cualidadesRequeridas.contains(c)){
            this.cualidadesRequeridas.add(c);
        }
    }
    public boolean contieneCualidades(Alumno a){
        return alumnos.contains(a);
    }
    public int cantidadAlumno(Alumno a){
        return alumnos.size();
    }

    public boolean acepta(Alumno a){
       return  (cantidadMaximaDeAlumnos<cantidadAlumno(a) &&
               a.contieneTodasCualidades(cualidadesRequeridas) && !a.tieneCasa());
    }
    public boolean agregarAlumno(Alumno a){
        if(acepta(a)){
            alumnos.add(a);
            a.setCasa(this);
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadMaximaDeAlumnos() {
        return cantidadMaximaDeAlumnos;
    }

    public void setCantidadMaximaDeAlumnos(int cantidadMaximaDeAlumnos) {
        cantidadMaximaDeAlumnos = cantidadMaximaDeAlumnos;
    }
}
