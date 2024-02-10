package SombreroSeleccionador;

public class Escuela {
    public static void main(String[] args) {
        // Crear casas
        Casa casa1 = new Casa("Casa1", 3);
        Casa casa2 = new Casa("Casa2", 2);

        // Agregar cualidades requeridas a las casas
        casa1.addCualidades("Inteligente");
        casa2.addCualidades("Valiente");

        // Crear alumnos
        Alumno alumno1 = new Alumno("Harry", casa1);
        alumno1.addCualidades("Inteligente");

        Alumno alumno2 = new Alumno("Ron", casa2);
        alumno2.addCualidades("Valiente");

        Alumno alumno3 = new Alumno("Hermione", null);
        alumno3.addCualidades("Inteligente");

        // Asignar familiares a los alumnos
        alumno1.addFamiliares(alumno3);

        // Agregar alumnos a las casas
        casa1.agregarAlumno(alumno1);
        casa2.agregarAlumno(alumno2);

        // Crear casas enemigas y establecer enemistad
        CasaEnemiga casaEnemiga = new CasaEnemiga("CasaEnemiga", 3);
        casaEnemiga.addCualidades("Astuto");



        // Verificar si los alumnos pueden ser asignados a las casas
        System.out.println("Alumno 1 aceptado en Casa1: " + casa1.agregarAlumno(alumno1));
        System.out.println("Alumno 2 aceptado en Casa2: " + casa2.agregarAlumno(alumno2));
        System.out.println("Alumno 3 aceptado en Casa1: " + casa1.agregarAlumno(alumno3));
    }
}
