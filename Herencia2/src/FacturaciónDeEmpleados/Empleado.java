package FacturaciónDeEmpleados;

public class Empleado {
    private String nombre;
    private String apellido;
    private int DNI;
    private int cantidadVentas;
    private double totalVentas;
    private CalculoSueldo formaDePago;

    public Empleado(String nombre, String apellido, int DNI, double sueldo,CalculoSueldo formaDePago) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.formaDePago = formaDePago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSueldo() {
        return formaDePago.sueldo(this);
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }
}
