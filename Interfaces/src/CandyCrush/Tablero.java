package CandyCrush;

import java.util.ArrayList;

public class Tablero {
    private double puntajeMinimo;
    private ArrayList<Ficha>fichas;

    public Tablero(double puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
        this.fichas = new ArrayList<>();
    }
    public ArrayList<Ficha>busqueda(Condicion c){
        ArrayList<Ficha>salida = new ArrayList<>();
        for(Ficha f: fichas){
            if(c.cumple(f)){
                salida.add(f);
            }
        }
        return salida;
    }
    public double totalFortaleza(){
        int total=0;
        for(Ficha f:fichas){
            total += f.getFortaleza();
        }
        return total;
    }
    public int totalDestruccion(){
        int total= 0;
        for(Ficha f: fichas){
            total += f.getPoderDeDestruccion();
        }
        return total;
    }
    public double dificultad(){
        return totalFortaleza() / totalDestruccion();
    }
    public void addFichas(Ficha f){
        if(!this.fichas.contains(f)){
            this.fichas.add(f);
        }
    }
    public boolean tieneFicha(Ficha f){
        return this.fichas.contains(f);
    }

    public double getPuntajeMinimo() {
        return puntajeMinimo;
    }

    public void setPuntajeMinimo(double puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
    }
}
