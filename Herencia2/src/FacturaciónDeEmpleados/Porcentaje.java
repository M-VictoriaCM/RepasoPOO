package FacturaciónDeEmpleados;

public class Porcentaje extends CalculoSueldo{
    private double poercentaje;
    private static final double BASE=100;

    public Porcentaje(double poercentaje) {
        this.poercentaje = poercentaje;
    }

    public double sueldo(Empleado e){
        return super.sueldo(e)+(e.getTotalVentas()*(this.poercentaje/BASE));
    }

    public double getPoercentaje() {
        return poercentaje;
    }

    public void setPoercentaje(double poercentaje) {
        this.poercentaje = poercentaje;
    }
}
