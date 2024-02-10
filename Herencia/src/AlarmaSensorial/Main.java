package AlarmaSensorial;
public class Main {
    public static void main(String[] args) {
        // Crear un timbre para la alarma
        Timbre timbre = new Timbre();

        // Crear una alarma con el timbre
        Alarma alarma = new Alarma(timbre);

        // Crear sensores para diferentes zonas
        Sensor sensor1 = new Sensor("Puerta Principal", "seRompioVidrio", true);
        Sensor sensor2 = new Sensor("Ventana Sala", "seDetectoMovimiento", false);
        Sensor sensor3 = new Sensor("Movimiento Cocina", "seAbrioPuertaoVentana", false);

        // Agregar sensores a la alarma
        alarma.addSensores(sensor1);
        alarma.addSensores(sensor2);
        alarma.addSensores(sensor3);

        // Comprobar la alarma
        System.out.println("Comprobando alarma:");
        alarma.comprobar();
    }
}
