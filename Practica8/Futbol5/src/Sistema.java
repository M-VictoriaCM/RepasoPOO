import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sistema {
    private ArrayList<Socio>socios;
    private ArrayList<AlquilerDeCancha>alquileres;

    public Sistema() {
        this.socios= new ArrayList<>();
        this.alquileres= new ArrayList<>();

    }
    public ArrayList<Socio> buscar(Criterio criterio, Ordenamiento condicion){
        ArrayList<Socio>encotrado = new ArrayList<>();
        for(Socio s : socios){
            encotrado.add(s);
            Collections.sort(encotrado, condicion);

        }
        return encotrado;
    }
}
