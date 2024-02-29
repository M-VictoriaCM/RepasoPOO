package OMS;

import Criterio.Criterio;

import java.util.ArrayList;

public class Voluntario extends OMS.ElementoZona {
    private String nacionalidad;
    private int edad;
    private String genero;
    private ArrayList<String>enfermedadesPreexistentes;
    private boolean vacuna;
    private boolean contagiado;

    public Voluntario(String nombre, String nacionalidad, int edad, String genero, boolean vacuna, boolean contagiado) {
        super(nombre);
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.genero = genero;
        this.vacuna = vacuna;
        this.contagiado = contagiado;
        this.enfermedadesPreexistentes = new ArrayList<>();
    }

    public boolean padeceEnfermedad(String enfermedad){
        return this.enfermedadesPreexistentes.contains(enfermedad);
    }
    public void addEnfermedad(String enfermedad){
        if(!padeceEnfermedad(enfermedad)){
            this.enfermedadesPreexistentes.add(enfermedad);
        }
    }
    public boolean sinEnfermedades(){
        return enfermedadesPreexistentes.size()==0;
    }
    //TODO recicio placebo
    public boolean recibioPlacebo(){
        return !vacuna;
    }

    //TODO recibio vancuna
    public boolean recibioVacuna(){
        return vacuna;
    }
    public boolean contagiado(){
        return contagiado;
    }
    public void aplicarVacuna(){
        vacuna=true;
    }
    public void aplicarPlacebo(){
        vacuna=false;
    }

    @Override
    public int cantidadVoluntarios() {
        return 1;
    }

    @Override
    public int cantidadVoluntarios(Criterio c) {
        if (c.cumple(this)) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public ArrayList<Voluntario> listarVoluntarios(Criterio c) {
        ArrayList<Voluntario>encontrado= new ArrayList<>();
        if(c.cumple(this)){
            encontrado.add(this);
        }
        return encontrado;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isContagiado() {
        return contagiado;
    }

    public void setContagiado(boolean contagiado) {
        this.contagiado = contagiado;
    }
}
