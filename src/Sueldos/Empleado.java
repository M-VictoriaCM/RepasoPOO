package Sueldos;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioFijo;

    public Empleado(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    public Empleado(String nombre, String apellido, double salarioFijo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioFijo = salarioFijo;
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

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }
    public double obtenerSueldo(){
        return this.salarioFijo;
    }
}
