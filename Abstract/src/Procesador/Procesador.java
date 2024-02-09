package Procesador;

import java.util.ArrayList;

public abstract class Procesador  {
    ArrayList<Task>tareas;

    public Procesador() {
        this.tareas = new ArrayList<Task>();
    }
    public void ejecutarTarea(){
        if(tareas.size() >0){
            Task aEjecutar =tareas.get(0);
            aEjecutar.ejecutarTarea();
            tareas.remove(0);
        }
    }
    public void addTareas(Task taskNew){
        int pos=0;
        while((pos<tareas.size())&&(esMenor(taskNew, tareas.get(pos)))){
            pos++;
        }
        tareas.add(pos, taskNew);
    }

    public abstract boolean esMenor(Task taskNew, Task task);

    public boolean haymasTareas(){
        return !tareas.isEmpty();
    }

}
