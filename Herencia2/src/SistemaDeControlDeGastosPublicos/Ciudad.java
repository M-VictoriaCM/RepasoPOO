package SistemaDeControlDeGastosPublicos;

import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private ArrayList<Contribuyente>contribuyentes;
    private ArrayList<Integer>habitantes;
    private ArrayList<Integer>impuestos;
    private double gasto;

    public Ciudad(String nombre, double gasto) {
        this.nombre = nombre;
        this.gasto = gasto;
    }
    public void addContribuyente(Contribuyente c){
        if(!contribuyentes.contains(c)){
            this.contribuyentes.add(c);
        }
    }
    public int cantidadDeHabitantes(){
        return habitantes.size();
    }
    public int getIngresosTotales(){
        int contador=0;
        for(int i=0; i<impuestos.size(); i++){
            contador += this.impuestos.get(i);
        }
        return contador;
    }
    public boolean superavit(){
        return getIngresosTotales()< gasto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }
}
