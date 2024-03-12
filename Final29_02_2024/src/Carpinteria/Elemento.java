package Carpinteria;

public abstract class Elemento {
    private String nombre;
    private String tipo;
    private String modoPresentacion;

    public Elemento(String nombre, String tipo, String modoPresentacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modoPresentacion = modoPresentacion;
    }
    public abstract double getPeso();
    public abstract  double getPrecioBase();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModoPresentacion() {
        return modoPresentacion;
    }

    public void setModoPresentacion(String modoPresentacion) {
        this.modoPresentacion = modoPresentacion;
    }
}
