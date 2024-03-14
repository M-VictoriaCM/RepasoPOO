import java.time.LocalDate;
import java.util.ArrayList;

public class AdministracionFotografica {
    private String titulo;
    private ArrayList<Elemento>elementosFotografico;

    public AdministracionFotografica(String titulo) {
        this.titulo = titulo;
        this.elementosFotografico = new ArrayList<>();
    }

    //TODO permitir la creacion
    public void addAlbum(Elemento e){
        elementosFotografico.add(e);
    }
    //TODO  agrupar fotografias relacionadas a diferentes criterio
    public ArrayList<Fotografia>lista(Criterio criterio){
        ArrayList<Fotografia>listado= new ArrayList<>();
        for (Elemento elemento: elementosFotografico){
            ArrayList<Fotografia>aux= elemento.buscar(criterio);
            for (Fotografia f: aux){
                if(!listado.contains(f) && criterio.cumple(f)){
                    listado.add(f);
                }
            }
        }
        return listado;
    }
    public static void main(String[] args) {

        // Crear una administración de fotografías
        AdministracionFotografica administracionFotografica = new AdministracionFotografica("Mis Fotos");


        // Crear algunos álbumes
        Album albumVacaciones2023 = new Album("Vacaciones 2023", LocalDate.of(2023, 12, 1));
        Album albumCumpleanos = new Album("Cumpleaños", LocalDate.of(2023, 07, 14));

            // Crear algunas fotografías
        Fotografia fotoPlaya = new Fotografia(1, "Playa", 500, LocalDate.of(2023, 12, 25));
        Fotografia fotoCumple = new Fotografia(2, "Cumpleaños Juan", 300, LocalDate.of(2023, 10, 15));
        Fotografia fotoAmigos = new Fotografia(3, "Amigos en la playa", 400, LocalDate.of(2023, 12, 26));

        // Agregar las fotografías a los álbumes
        albumVacaciones2023.addElemento(fotoPlaya);
        albumVacaciones2023.addElemento(fotoAmigos);
        albumCumpleanos.addElemento(fotoCumple);

        // Agregar los álbumes a la administración
        administracionFotografica.addAlbum(albumVacaciones2023);
        administracionFotografica.addAlbum(albumCumpleanos);

        // Obtener el peso total de un álbum
        int pesoTotalVacaciones = albumVacaciones2023.getPeso();
        System.out.println("Peso total álbum Vacaciones 2023: " + pesoTotalVacaciones + " KB");

        // Listar las personas que aparecen en un álbum
        ArrayList<String> personasCumple = albumCumpleanos.listaDepersonas();
        System.out.println("Personas en álbum Cumpleaños: " + personasCumple);

        // Buscar fotografías con un criterio
        Criterio criterioPersona = new CriterioPersona("Juan");
        ArrayList<Fotografia> fotosJuan = administracionFotografica.lista(criterioPersona);
        System.out.println("Fotos con Juan: " + fotosJuan);
    }

}
