import java.util.ArrayList;

public class Coleccion {
    private ArrayList<Pista> pistas;
    private ArrayList<PlayList>playLists;

    public Coleccion() {
        this.pistas =new ArrayList<>();
    }
    public boolean tienePista(Pista pista){
        return this.pistas.contains(pista);
    }
    //TODO Se puede agregar a una coleccion
    public void addPista(Pista pista){
        if(!tienePista(pista)){
            this.pistas.add(pista);
        }
    }
    //TODO se puede eliminar de una coleccion
    public void removePista(Pista pista){
        this.pistas.remove(pista.getId());
    }
    //TODO modificar los atributos
    public void upDatePista(Pista pista){
        int index = this.pistas.indexOf(pista);
        if(index != -1){
            pistas.set(index, pista);
        }
    }
}
