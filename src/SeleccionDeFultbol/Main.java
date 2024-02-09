package SeleccionDeFultbol;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear un futbolista
        Futbolista messi = new Futbolista("Lionel", "Messi", 123456, new Date(), "Argentina", "Argentina", "delantero", "zurdo", 100);
      messi.addEstado("en concentracion");
        // Crear un entrenador
        Entrenador pepGuardiola = new Entrenador("Pepe", "Guardiola", 789012, new Date(), "España", "Argentina", 123);

        // Verificar disponibilidad
        System.out.println("Messi está disponible: " + messi.disponible());
        System.out.println("Guardiola está disponible: " + pepGuardiola.disponible());
    }
}
