package Carpinteria;

public abstract class Elemento {
    private String nombre;
    private String tipo;
    private String modoDePreparacion;


    public Elemento(String nombre, String tipo, String modoDePreparacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modoDePreparacion = modoDePreparacion;
    }

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

    public String getModoDePreparacion() {
        return modoDePreparacion;
    }

    public void setModoDePreparacion(String modoDePreparacion) {
        this.modoDePreparacion = modoDePreparacion;
    }

    public abstract double getPeso();
    public abstract double getTiempoDePreparacion();
    public abstract double getPrecio();

    @Override
    public String toString() {
        return "Elemento{" +"\n"+
                "nombre='" + this.getNombre()+"\n"+
                ", tipo='" + this.getTipo() +"\n"+
                ", modoDePreparacion='" + this.getModoDePreparacion() +"\n"+
                ",tiempo de preparacion='"+ this.getTiempoDePreparacion()+"dias"+"\n"+
                ", peso='"+ this.getPeso()+" kg"+"\n"+
                '}';
    }
}
