package SombreroSeleccionador;

public class CasaFamiliar extends Casa{
    public CasaFamiliar(String nombre, int cantidadMaximaDeAlumnos) {
        super(nombre, cantidadMaximaDeAlumnos);
    }

    @Override
    public boolean acepta(Alumno a){
        return (super.acepta(a)  && a.familiaresEn(this));
    }
}
