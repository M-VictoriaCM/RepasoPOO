package Avicola;

import java.util.Date;

public class Fresco extends Producto{
    private Date fechaEnvasado;
    private String granjaOrigen;
    public Fresco(Date fechaDeVencimiento, int numeroDeLote, Date fechaEnvasado, String granjaOrigen) {
        super(fechaDeVencimiento, numeroDeLote);
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    @Override
    public String toString() {
        return "Producto Fresco:" +"\n"+
                super.toString()+"\n"+
                "fecha Envasado=" + fechaEnvasado +"\n"+
                ", granjaOrigen='" + granjaOrigen;
    }
}
