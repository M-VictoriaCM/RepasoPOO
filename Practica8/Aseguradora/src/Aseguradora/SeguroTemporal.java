package Aseguradora;

import CriterioDeBusqueda.CriterioDeBusqueda;
import Ordenamiento.Ordenamiento;

import java.time.LocalDate;
import java.util.ArrayList;

public class SeguroTemporal extends Seguro {
    private LocalDate fechaInicio;
    private Seguro seguroContenido;
    private LocalDate fechaFin;

    public SeguroTemporal(int dni, String descripcion, LocalDate fechaInicio, LocalDate fechaFin) {
        super(dni, descripcion);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    public boolean fechaValidez(){
        LocalDate hoy= LocalDate.now();
        return hoy.isAfter(this.fechaInicio) && hoy.isBefore(this.getFechaFin());
    }

    @Override
    public int getPoliza() {
        if(fechaValidez()){
            return seguroContenido.getPoliza();
        }
        return 0;
    }

    @Override
    public double getMontoAsegurado() {
        return getMontoAsegurado();
    }

    @Override
    public double costo() {
        if(fechaValidez()){
           return seguroContenido.costo();
        }
        return 0;
    }

    @Override
    public ArrayList<Seguro> buscar(CriterioDeBusqueda c, Ordenamiento o) {
        ArrayList<Seguro>encontrada = new ArrayList<>();
        if(fechaValidez()){
            if(c.cumple(seguroContenido)){
                ArrayList<Seguro>aux= seguroContenido.buscar(c,o);
                encontrada.addAll(aux);
            }
        }
        return encontrada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
