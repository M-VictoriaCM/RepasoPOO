package CandyCrush;

public class Ficha {
    private String nombre;
    private int fortaleza;
    private int poderDeDestruccion;
    private int espacioQueOpcupa;

    public Ficha(String nombre, int fortaleza, int poderDeDestruccion, int espacioQueOpcupa) {
        this.nombre = nombre;
        this.fortaleza = fortaleza;
        this.poderDeDestruccion = poderDeDestruccion;
        this.espacioQueOpcupa = espacioQueOpcupa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getPoderDeDestruccion() {
        return poderDeDestruccion;
    }

    public void setPoderDeDestruccion(int poderDeDestruccion) {
        this.poderDeDestruccion = poderDeDestruccion;
    }

    public int getEspacioQueOpcupa() {
        return espacioQueOpcupa;
    }

    public void setEspacioQueOpcupa(int espacioQueOpcupa) {
        this.espacioQueOpcupa = espacioQueOpcupa;
    }
    public boolean equals(Object obj){
        try{
            Ficha otra = (Ficha) obj;
            return this.getNombre().equals(otra.getNombre()) &&
                    this.getFortaleza() == otra.getFortaleza();
        }catch (Exception e ){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Ficha{" +"\n"+
                "nombre='" + nombre + "\n"+
                "fortaleza=" + fortaleza +"\n"+
                "poderDeDestruccion=" + poderDeDestruccion +"\n"+
                "espacioQueOpcupa=" + espacioQueOpcupa +"\n"+
                '}';
    }
}
