package Procesador;

public class Task {
    private double cpu;
    private double memoria;
    private double prioridad;

    public Task(double cpu, double memoria, double prioridad) {
        this.cpu = cpu;
        this.memoria= memoria;
        this.prioridad = prioridad;
    }
    public void ejecutarTarea(){
        System.out.println("Se ejecuto la tarea"+this);
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public double getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(double prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Task{" +
                "cpu=" + cpu +
                ", memoria=" + memoria +
                ", prioridad=" + prioridad +
                '}';
    }
}
