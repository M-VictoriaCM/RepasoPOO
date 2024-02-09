package PuertoDeCereales;

import java.time.LocalDateTime;

public class Camion extends Elemento{
    private String patente;
    private double capacidad;
    private LocalDateTime horaDeDescargo;

    public Camion(String patente, double capacidad, LocalDateTime horaDeDescargo) {
        this.patente = patente;
        this.capacidad = capacidad;
        this.horaDeDescargo = horaDeDescargo;
    }

    @Override
    public boolean esMayor(Elemento otrElemento) {
        Camion otroCamion= (Camion) otrElemento;
        return this.horaDeDescargo.isBefore(otroCamion.getHoraDeDescargo());
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public LocalDateTime getHoraDeDescargo() {
        return horaDeDescargo;
    }
    public void setHoraDeDescargo(LocalDateTime horaDeDescargo) {
        this.horaDeDescargo = horaDeDescargo;
    }

    @Override
    public String toString() {
        return "Camion{" +"\n"+
                "patente='" + patente + '\'' +"\n"+
                ", capacidad=" + capacidad +"\n"+
                ", horaDeDescargo=" + horaDeDescargo +"\n"+
                '}';
    }
}
