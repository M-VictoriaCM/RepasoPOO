package SombreroSeleccionador;

import java.util.ArrayList;

public class CasaEnemiga extends Casa{
    private ArrayList<Casa>casaEnemiga = new ArrayList<>();
    public CasaEnemiga(String nombre, int cantidadMaximaDeAlumnos) {
        super(nombre, cantidadMaximaDeAlumnos);
        this.casaEnemiga= new ArrayList<>();
    }
    public void addCasaEnemiga(Casa casaEne){
        if(this.casaEnemiga.contains(casaEne)){
            this.casaEnemiga.add(casaEne);
        }
    }
    public boolean admitido(Alumno a){
        for(Casa casa : casaEnemiga){
            if(!casa.acepta(a)){
                return false;
            }
        }
        return true;
    }
    @Override
    public boolean acepta(Alumno a){
        return (super.acepta(a) && admitido(a));
    }

}
