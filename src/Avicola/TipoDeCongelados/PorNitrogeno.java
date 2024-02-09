package Avicola.TipoDeCongelados;

import Avicola.Congelados;

import java.sql.Time;
import java.util.Date;

public class PorNitrogeno extends Congelados{
    private String informacion;
    private Time tiempoDeExposicion;

    public PorNitrogeno(Date fechaDeVencimiento, int numeroDeLote, Date fechaEnvasado, String granjaOrigen, int codigo, int temperatura, String informacion, Time tiempoDeExposicion) {
        super(fechaDeVencimiento, numeroDeLote, fechaEnvasado, granjaOrigen, codigo, temperatura);
        this.informacion =informacion;
        this.tiempoDeExposicion=tiempoDeExposicion;
    }




    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public Time getTiempoDeExposicion() {
        return tiempoDeExposicion;
    }

    public void setTiempoDeExposicion(Time tiempoDeExposicion) {
        this.tiempoDeExposicion = tiempoDeExposicion;
    }

    @Override
    public String toString() {
        return "PorNitrogeno{" +
                "informacion='" + informacion + '\'' +
                ", tiempoDeExposicion=" + tiempoDeExposicion +
                '}';
    }
}
