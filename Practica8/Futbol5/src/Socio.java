import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<AlquilerDeCancha> alquileresDeCanchas;

    public Socio(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.alquileresDeCanchas = new ArrayList<>();
    }

    public void alquilarCancha(AlquilerDeCancha cancha){
        this.alquileresDeCanchas.add(cancha);
    }
    public int cantidadDeAlquileres(){
        return this.alquileresDeCanchas.size();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean equals(Object obj){
        try {
            Socio otroSocio = (Socio) obj;
            return this.getNombre().equals(otroSocio.getNombre()) &&
                    this.getApellido().equals(otroSocio.getApellido());
        }catch(Exception e){
            return false;
        }
    }
}
