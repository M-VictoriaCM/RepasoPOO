import java.time.LocalDate;
import java.util.ArrayList;

public class Fotografia extends Elemento implements Comparable<Fotografia>{
    private int identificador;
    private String titulo;
    private int peso;
    private ArrayList<String>personas;


    public Fotografia(int identificador, String titulo, int peso, LocalDate fechaDeCreacion) {
        super(titulo,fechaDeCreacion);
        this.identificador = identificador;
        this.titulo = titulo;
        this.peso = peso;
        this.personas = new ArrayList<>();
    }
    public boolean contienePersona(String persona){
        return this.personas.contains(persona);
    }
    public void addPersona(String persona) {
        if(personas == null){
            personas = new ArrayList<>();
        }
        if(!contienePersona(persona)){
            this.personas.add(persona);
        }
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public int getCantidadFotografias() {
        return 1;
    }

    @Override
    public ArrayList<String> listaDepersonas() {
        ArrayList<String>copia = new ArrayList<>();
        copia.addAll(personas);

        return copia;
    }

    @Override
    public ArrayList<Fotografia> buscar(Criterio criterio) {
        ArrayList<Fotografia>encontrada= new ArrayList<>();
        if(criterio.cumple(this)){
            encontrada.add(this);
        }
        return encontrada;
    }


    @Override
    public int compareTo(Fotografia o) {
        int fotografia = this.getFechaDeCreacion().compareTo(o.getFechaDeCreacion());

        if(fotografia != 0){
            return fotografia;
        }else{
            fotografia = this.getPeso() - o.getPeso();
        }
        return fotografia;
    }
    @Override
    public  boolean equals(Object obj){
        try{
            Fotografia otro= (Fotografia) obj;
            return this.getIdentificador() == otro.getIdentificador() &&
                    this.getTitulo().equals(otro.getTitulo()) &&
                    this.getFechaDeCreacion().equals(otro.getFechaDeCreacion());
        }catch(Exception e){
            return false;
        }
    }
}
