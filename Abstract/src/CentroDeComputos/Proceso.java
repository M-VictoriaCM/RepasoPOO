package CentroDeComputos;

public class Proceso extends Elemento{
    private String nombre;
    private double requerimientoMemoria;

    public Proceso(String nombre, double requerimientoMemoria) {
        this.nombre = nombre;
        this.requerimientoMemoria = requerimientoMemoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRequerimientoMemoria() {
        return requerimientoMemoria;
    }

    public void setRequerimientoMemoria(double requerimientoMemoria) {
        this.requerimientoMemoria = requerimientoMemoria;
    }
    @Override
    public boolean esMayor(Elemento otroElemento) {
        if (otroElemento instanceof Proceso){
            Proceso otroProcesador = (Proceso) otroElemento;
            return this.getRequerimientoMemoria() > otroProcesador.getRequerimientoMemoria();
        } else {
            // Manejo de error o retorno adecuado en caso de que otroElemento no sea un Procesador
            return false;
        }
    }
    @Override
    public String toString() {
        return "Proceso{" +
                "nombre='" + nombre + '\'' +
                ", requerimientoMemoria=" + requerimientoMemoria +
                '}';
    }
}
