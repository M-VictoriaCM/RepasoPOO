public class CriterioDuracion implements Criterio{
    private double duracion;

    public CriterioDuracion(double duracion) {
        this.duracion = duracion;
    }
    public boolean cumple(Pista pista){
        return pista.getDuracion()> duracion;
    }
}
