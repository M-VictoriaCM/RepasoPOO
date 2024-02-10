package FacturaciónDeEmpleados;

public class Bonos extends CalculoSueldo{
    private int minimoVentas;
    private double monto;

    public Bonos(int minimoVentas, double monto) {
        this.minimoVentas = minimoVentas;
    }
    public double sueldo(Empleado e){
        if(e.getCantidadVentas()>=minimoVentas){
            return super.sueldo(e)+monto;
        }
        return 0.0;
    }

    public int getMinimoVentas() {
        return minimoVentas;
    }

    public void setMinimoVentas(int minimoVentas) {
        this.minimoVentas = minimoVentas;
    }
}
