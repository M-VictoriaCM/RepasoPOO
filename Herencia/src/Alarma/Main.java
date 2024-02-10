package Alarma;

public class Main {
    public static void main(String[] args) {
        // Crear una alarma con timbre
        Timbre timbre = new Timbre();
        Alarma alarma = new Alarma(false, false, false, timbre);

        // Comprobar la alarma
        System.out.println("Comprobando alarma sin luz:");
        alarma.comprobar();
        System.out.println();

        // Crear una alarma luminosa con timbre y luz
        Luz luz = new Luz();
        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa(false, false, false, timbre, luz);

        // Comprobar la alarma luminosa
        System.out.println("Comprobando alarma luminosa:");
        alarmaLuminosa.comprobar();
    }
}
