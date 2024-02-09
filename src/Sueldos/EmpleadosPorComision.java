package Sueldos;

public class EmpleadosPorComision extends Empleado{
    private int cantidadDeVentas;
    private double porcentaje;

    public EmpleadosPorComision(String nombre, String apellido, double salarioFijo) {
        super(nombre, apellido, salarioFijo);
        this.cantidadDeVentas =cantidadDeVentas;
        this.porcentaje= porcentaje;
    }

    public EmpleadosPorComision(double salarioFijo, int cantidadDeVentas, double porcentaje) {
        super(salarioFijo);
        this.cantidadDeVentas = cantidadDeVentas;
        this.porcentaje = porcentaje;
    }

    public EmpleadosPorComision(String nombre, String apellido, double salarioFijo, int cantidadDeVentas, double porcentaje) {
        super(nombre, apellido, salarioFijo);
        this.cantidadDeVentas = cantidadDeVentas;
        this.porcentaje = porcentaje;
    }

    public int getCantidadDeVentas() {
        return cantidadDeVentas;
    }

    public void setCantidadDeVentas(int cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    @Override
    public double obtenerSueldo(){
        return super.getSalarioFijo() + (this.getCantidadDeVentas()*(this.getPorcentaje()/100));
    }
}
