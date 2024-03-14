import java.sql.Time;
import java.util.ArrayList;

public abstract class Elemento {

    //TODO duracion total
    public abstract double getDuracion();

    //TODO Buscar copn criterio
    public abstract ArrayList<Pista>buscar(Criterio criterio);
    public abstract Elemento copia(Criterio criterio);
}
