import java.time.LocalDate;
import java.util.ArrayList;

public class Album extends Elemento{
    private ArrayList<Elemento>elementos;

    public Album(String titulo, LocalDate fecha) {
        super(titulo, fecha);
        this.elementos= new ArrayList<>();
    }
    public void addElemento(Elemento e){
        this.elementos.add(e);
    }

    @Override
    public int getCantidadDeElemento() {
        int total= 0;
        for(Elemento e: elementos){
            total+= e.getCantidadDeElemento();
        }
        return total;
    }

    @Override
    public int getPesoTotal() {
        int total =0;
        for(Elemento e:elementos){
            total += e.getPesoTotal();
        }
        return total;
    }

    @Override
    public Elemento copia(Criterio criterio) {
        ArrayList<Elemento>copia = new ArrayList<>();
        for (Elemento e: elementos){
            Elemento copiaElemento= e.copia(criterio);
            if(copiaElemento != null){
                copia.add(copiaElemento);
            }
        }
        if(copia.isEmpty()){
            return null;
        }
        Album album = new Album(getTitulo(), getFecha());
        for (Elemento e: copia){
            album.addElemento(e);
        }
        return album;
    }
}
