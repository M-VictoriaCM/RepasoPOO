package Agroquimicos;

import java.util.ArrayList;

public class  ProductoQuimico {
    private String nombre;
    private ArrayList<Cultivo>seDesaconseja;
    private ArrayList<String>estadoPatologicos;

    public ProductoQuimico(String nombre) {
        this.nombre = nombre;
        this.seDesaconseja= new ArrayList<>();
        this.estadoPatologicos = new ArrayList<>();
    }
    public void addCultivosDesaconsejados(Cultivo c){
        if(!this.seDesaconseja.contains(c)){
            this.seDesaconseja.add(c);
        }
    }
    public void addEstado(String e){
        if(!this.estadoPatologicos.contains(e)){
            estadoPatologicos.add(e);
        }
    }
    public boolean tieneEstadoPatologico(String e){
        return estadoPatologicos.contains(e);
    }
    public boolean cultivosPermitido(Cultivo c){
        for(Cultivo cultivo: seDesaconseja){
            if(seDesaconseja.contains(c)){
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
}
