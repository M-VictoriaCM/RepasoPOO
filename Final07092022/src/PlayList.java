import java.lang.reflect.Array;
import java.sql.Time;
import java.util.ArrayList;

public class PlayList extends Elemento{
    private String nombre;
    private ArrayList<Elemento>elementos;

    public PlayList(String nombre) {
        this.nombre = nombre;
        this.elementos= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addElemento(Elemento e){
        this.elementos.add(e);
    }

    @Override
    public double getDuracion() {
        double total =0;
        for (Elemento e: elementos){
            total+= e.getDuracion();
        }
        return total;
    }

    @Override
    public ArrayList<Pista> buscar(Criterio criterio) {
        ArrayList<Pista>encontrada = new ArrayList<>();
        for(Elemento e: elementos){
            encontrada.addAll(e.buscar(criterio));
        }
        return encontrada;
    }

    @Override
    public Elemento copia(Criterio criterio) {
        ArrayList<Elemento>copia = new ArrayList<>();
        for (Elemento e: elementos){
            Elemento aux = e.copia(criterio);
            if(aux != null){
                copia.add(aux);
            }
        }
        if(!copia.isEmpty()){
            return null;
        }
        PlayList nueva = new PlayList(getNombre());
        for(Elemento e: copia){
            nueva.addElemento(e);
        }
        return nueva;
    }
}
