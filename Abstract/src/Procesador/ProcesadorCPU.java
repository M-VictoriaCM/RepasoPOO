package Procesador;

public class ProcesadorCPU extends Procesador{

    @Override
    public boolean esMenor(Task taskNew, Task task) {
        return taskNew.getCpu() < task.getCpu();
    }
}
