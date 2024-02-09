package Procesador;

public class ProcesadorMemoria extends Procesador{

    @Override
    public boolean esMenor(Task taskNew, Task task) {
        return taskNew.getMemoria() < task.getMemoria();
    }
}
