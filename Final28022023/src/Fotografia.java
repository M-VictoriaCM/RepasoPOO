import com.sun.jdi.ArrayReference;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fotografia extends Elemento implements Comparable<Fotografia>{
    private int identificador;
    private int peso;
    private ArrayList<String>personas;

    public Fotografia(String titulo, LocalDate fecha, int identificador, int peso) {
        super(titulo, fecha);
        this.identificador = identificador;
        this.peso = peso;
        this.personas = new ArrayList<>();
    }
    public boolean tienePersona(String persona){
        return this.personas.contains(persona);
    }
    public void addPersona(String persona){
        if(this.personas == null){
            personas= new ArrayList<>();
        }
        if(!tienePersona(persona)){
            personas.add(persona);
        }
    }

    @Override
    public int getCantidadDeElemento() {
        return 1;
    }

    @Override
    public int getPesoTotal() {
        return peso;
    }

    @Override
    public Elemento copia(Criterio criterio) {
        if (criterio.cumple(this)) {
            Fotografia copia = new Fotografia(getTitulo(), getFecha(), getIdentificador(), getPeso());
            return copia;
        }
        return null;
    }
    @Override
    public int compareTo(Fotografia o){
        int foto= this.getFecha().compareTo(o.getFecha());
        if(foto !=0){
            return foto;
        }else{
            foto= this.getPeso() - o.getPeso();
        }
        return foto;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
