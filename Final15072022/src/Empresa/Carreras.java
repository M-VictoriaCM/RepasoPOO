package Empresa;

import Adicional.Adicional;
import Criterio.Criterio;

import java.util.ArrayList;

public class Carreras extends Elemento{
    private ArrayList<Elemento>elementos;
    private int porcentaje;

    public Carreras(String nombre, String tema, int porcentaje) {
        super(nombre, tema);
        this.porcentaje = porcentaje;
        this.elementos= new ArrayList<>();
    }

    public boolean contieneElemento(Elemento e){
        return this.elementos.contains(e);
    }
    public void addElemento(Elemento e){
        if(!contieneElemento(e)){
            this.elementos.add(e);
        }
    }

    @Override
    public double getCosto() {
        double total=0.0;
        for (Elemento elemento: elementos){
            double descuento= elemento.getCosto()*(this.getPorcentaje()/100);
            total= elemento.getCosto()-descuento;
        }
        return total;
    }

    @Override
    public int getNumeroDeCreditos() {
        int total=0;
        for(Elemento elemento: elementos){
            total += elemento.getNumeroDeCreditos();
        }
        return total;
    }

    @Override
    public ArrayList<Curso> buscar(Criterio criterio) {
        ArrayList<Curso>encontrado= new ArrayList<>();
        for(Elemento e: elementos){
            encontrado.addAll(e.buscar(criterio));
        }
        return encontrado;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
}
