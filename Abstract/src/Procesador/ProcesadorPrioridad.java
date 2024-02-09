package Procesador;



public class ProcesadorPrioridad extends Procesador {

    @Override
    public boolean esMenor(Task taskNew, Task task) {
        return taskNew.getPrioridad()< task.getPrioridad();
    }
}
