package BibliotecaStrategy;

import java.util.List;

public abstract class Estrategia {
    public Libro elegi(List<Libro>libros){
        if(libros.isEmpty()){
            return null;
        }
        Libro masNuevo = libros.get(0);
        for (int i=0; i< libros.size(); i++){
            if(comparar(libros.get(i), masNuevo)){
                masNuevo = libros.get(i);
            }
        }
        return masNuevo;
    }

    public abstract boolean comparar(Libro libro, Libro masNuevo);
}
