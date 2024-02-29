package Parcialito4to_2021;

import java.util.ArrayList;

public class Comercio {
    private String nombre;
    private String rubro;
    private double mtsCuadrados;
    private boolean aireLibre;
    private ArrayList<String>protocolos;

    public Comercio(String nombre, String rubro, double mtsCuadrados, boolean aireLibre) {
        this.nombre = nombre;
        this.rubro = rubro;
        this.mtsCuadrados = mtsCuadrados;
        this.aireLibre = aireLibre;
        this.protocolos = new ArrayList<>();
    }
    public void addProtocolo(String protocolo){
        if(!this.protocolos.contains(protocolo)){
            this.protocolos.add(protocolo);
        }
    }
    public boolean tieneProtocolo(String protocolo){
        return this.protocolos.contains(protocolo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public double getMtsCuadrados() {
        return mtsCuadrados;
    }

    public void setMtsCuadrados(double mtsCuadrados) {
        this.mtsCuadrados = mtsCuadrados;
    }

    public boolean isAireLibre() {
        return aireLibre;
    }

    public void setAireLibre(boolean aireLibre) {
        this.aireLibre = aireLibre;
    }
    public boolean equals(Object obj){
        try{
            Comercio otroComercio = (Comercio) obj;
            return this.getNombre().equals(otroComercio.getNombre()) &&
                    this.getRubro().equals(otroComercio.getRubro());
        }catch(Exception e){
            return false;
        }
    }
}
