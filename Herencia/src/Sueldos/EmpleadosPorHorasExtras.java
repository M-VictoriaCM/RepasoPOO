package Sueldos;

public class EmpleadosPorHorasExtras extends Empleado{
    private int horasTrabajadas;
    private double montoExtra;

    public EmpleadosPorHorasExtras(String nombre, String apellido, double salarioFijo) {
        super(nombre, apellido, salarioFijo);
        this.horasTrabajadas = horasTrabajadas;
        this.montoExtra = montoExtra;
    }

    public EmpleadosPorHorasExtras(double salarioFijo, int horasTrabajadas, double montoExtra) {
        super(salarioFijo);
        this.horasTrabajadas = horasTrabajadas;
        this.montoExtra = montoExtra;
    }

    public EmpleadosPorHorasExtras(String nombre, String apellido, double salarioFijo, int horasTrabajadas, double montoExtra) {
        super(nombre, apellido, salarioFijo);
        this.horasTrabajadas = horasTrabajadas;
        this.montoExtra = montoExtra;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getMontoExtra() {
        return montoExtra;
    }

    public void setMontoExtra(double montoExtra) {
        this.montoExtra = montoExtra;
    }
    @Override
    public double obtenerSueldo(){
        return super.getSalarioFijo()+(this.getHorasTrabajadas()* this.getMontoExtra());
    }
}
