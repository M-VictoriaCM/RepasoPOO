package FacturaciónDeEmpleados;

public class CalculoFijo extends CalculoSueldo{
    private double monto;

    public CalculoFijo(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    @Override
    public double sueldo(Empleado e){
        return monto;
    }
}
