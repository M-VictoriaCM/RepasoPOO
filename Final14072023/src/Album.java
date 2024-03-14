import java.time.LocalDate;
import java.util.ArrayList;

public class Album extends Elemento{
    private ArrayList<Elemento>elementos;
    public Album(String titulo, LocalDate fechaDeCreacion) {
        super(titulo, fechaDeCreacion);
        this.elementos =new ArrayList<>();
    }
    public void addElemento(Elemento e){
        if(!this.elementos.contains(e)){
            this.elementos.add(e);
        }
    }

    @Override
    public int getPeso() {
        int total = 0;
        for(Elemento e: elementos){
            total += e.getPeso();
        }
        return total;
    }

    @Override
    public int getCantidadFotografias() {
        int total= 0;
        for(Elemento e: elementos){
            total += e.getCantidadFotografias();
        }
        return total;
    }

    @Override
    public ArrayList<String> listaDepersonas() {
        ArrayList<String>encontrada= new ArrayList<>();
        for (Elemento e:elementos){
            encontrada.addAll(e.listaDepersonas());
        }
        return encontrada;
    }

    @Override
    public ArrayList<Fotografia> buscar(Criterio criterio) {
        ArrayList<Fotografia>encontrada= new ArrayList<>();
        for(Elemento e: elementos){
            encontrada.addAll(e.buscar(criterio));
        }
        return encontrada;
    }
}
