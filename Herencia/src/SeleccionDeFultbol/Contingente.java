package SeleccionDeFultbol;

import java.util.ArrayList;
import java.util.Date;

public class Contingente {
    private String nombre;
    private String apellido;
    private int pasaporte;
    private Date fechaDeNacimiento;
    private String paisDeOrigen;
    private String paisActual;
    private ArrayList<Futbolista>futbolistas;
    private ArrayList<String>equipoTecnico;
    private ArrayList<String> estado;

    public Contingente(String nombre, String apellido, int pasaporte, Date fechaDeNacimiento, String paisDeOrigen, String paisActual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.paisDeOrigen = paisDeOrigen;
        this.paisActual = paisActual;
        this.futbolistas = new ArrayList<>();
        this.equipoTecnico = new ArrayList<>();
        this.estado = new ArrayList<>();
    }

    public void  addEstado(String e){
        this.estado.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getPaisActual() {
        return paisActual;
    }

    public void setPaisActual(String paisActual) {
        this.paisActual = paisActual;
    }

    public boolean enConcentracion(){
        return estado.contains("en concentracion");
    }
    public boolean disponible(){
        return this.getPaisActual().equals(paisDeOrigen) && !enConcentracion();
    }


}
