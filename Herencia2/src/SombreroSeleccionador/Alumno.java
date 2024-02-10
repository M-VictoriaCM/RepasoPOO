package SombreroSeleccionador;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String>cualidades;
    private ArrayList<Alumno>familiares;
    private Casa casa;

    public Alumno(String nombre, Casa casa) {
        this.nombre = nombre;
        this.casa = casa;
        this.cualidades= new ArrayList<>();
        this.familiares = new ArrayList<>();
    }
    public void addCualidades(String c){
        if(!this.cualidades.contains(c)){
            this.cualidades.add(c);
        }
    }
    public void addFamiliares(Alumno f){
        if(!this.familiares.contains(f)){
            this.familiares.add(f);
        }
    }
    public boolean contieneTodasCualidades(ArrayList<String>cualidadesNecesarias){
        return this.cualidades.containsAll(cualidadesNecesarias);
    }
    public boolean tieneCasa(){
        return casa!=null;
    }
    //verificar familiares en casa
    public boolean familiaresEn(Casa casafamiliar){
        for(int i=0; i<familiares.size(); i++){
            if(familiares.get(i).tieneCasa() &&
                    familiares.get(i).getCasa().equals(casafamiliar)){
                return true;
            }
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
}
