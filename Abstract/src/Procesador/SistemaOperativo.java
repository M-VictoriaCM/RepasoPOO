package Procesador;

public class SistemaOperativo {
    public static void main(String[] args) {
        Task t1= new Task(10,10,1);
        Task t2= new Task(20,10,3);
        Task t3= new Task(50,10,1);
        Task t4= new Task(35,10,2);
        Task t5= new Task(60,10,4);
        Task t6= new Task(70,10,2);
        Task t7= new Task(100,10,6);

        Procesador procesadorNuevo = new ProcesadorPrioridad();
        procesadorNuevo.addTareas(t1);
        procesadorNuevo.addTareas(t2);
        procesadorNuevo.addTareas(t3);
        procesadorNuevo.addTareas(t4);
        procesadorNuevo.addTareas(t5);
        procesadorNuevo.addTareas(t6);
        procesadorNuevo.addTareas(t7);

        for(;procesadorNuevo.haymasTareas();){
            procesadorNuevo.ejecutarTarea();
        }
    }
}
