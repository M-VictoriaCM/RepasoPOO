package Sueldos;

public class Main {
        public static void main(String[] args) {
            // Crear un empleado con salario fijo
            Empleado empleadoFijo = new Empleado("Juan", "Perez", 1000.0);

            // Crear un empleado por horas extras
            EmpleadosPorHorasExtras empleadoHorasExtras = new EmpleadosPorHorasExtras("Ana", "Gomez", 1000.0, 10, 20.0);

            // Crear un empleado por comisión
            EmpleadosPorComision empleadoComision = new EmpleadosPorComision("Carlos", "Lopez", 1000.0, 5, 5.0);

            // Calcular salarios
            double salarioFijo = empleadoFijo.obtenerSueldo();
            double salarioHorasExtras = empleadoHorasExtras.obtenerSueldo();
            double salarioComision = empleadoComision.obtenerSueldo();

            // Imprimir resultados
            System.out.println("Salario fijo de " + empleadoFijo.getNombre() + ": $" + salarioFijo);
            System.out.println("Salario con horas extras de " + empleadoHorasExtras.getNombre() + ": $" + salarioHorasExtras);
            System.out.println("Salario con comisión de " + empleadoComision.getNombre() + ": $" + salarioComision);
        }


}
