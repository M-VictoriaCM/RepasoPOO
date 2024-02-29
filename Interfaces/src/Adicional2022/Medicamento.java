package Adicional2022;

import java.util.ArrayList;

public class Medicamento {
    private String nombre;
    private String laboratorio;
    private ArrayList<String> sintomasQueTrata;
    private double precio;

    public Medicamento(String nombre, String laboratorio, double precio) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.precio = precio;
    }
    public void addSintomas(String sintoma){
        if(!this.sintomasQueTrata.contains(sintoma)){
            this.sintomasQueTrata.add(sintoma);
        }
    }
    public boolean tieneSintoma(String sintoma){
        return this.sintomasQueTrata.contains(sintoma);
    }
    //TODO verificar sin puede tratar a un paciente
    public boolean puedeTratarA(Paciente p){
        return p.puedeSerTratadoPor(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean equals(Object obj){
        try{
            Medicamento otro = (Medicamento) obj;
            return this.getNombre().equals(otro.getNombre()) ||
                    this.getLaboratorio().equals(otro.getLaboratorio());
        }catch (Exception e){
            return false;
        }
    }
}
