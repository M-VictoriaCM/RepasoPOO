package AlarmaSensorial;

public class Sensor {
    private String nombre;
    private String comportamiento;
    private boolean estado;

    public Sensor(String nombre, String comportamiento, boolean estado) {
        this.nombre = nombre;
        this.comportamiento = comportamiento;
        this.estado= estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public boolean estadoActivado(){
        return estado == true;
    }
}
