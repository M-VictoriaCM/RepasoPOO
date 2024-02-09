package Avicola;

import java.util.Date;

public class Producto {
    private Date fechaDeVencimiento;
    private int numeroDeLote;

    public Producto(Date fechaDeVencimiento, int numeroDeLote) {
        super();
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.numeroDeLote = numeroDeLote;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public int getNumeroDeLote() {
        return numeroDeLote;
    }

    public void setNumeroDeLote(int numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }

    @Override
    public String toString() {
        return "Etiqueta del Producto{" +
                "fechaDeVencimiento=" + fechaDeVencimiento +
                ", numeroDeLote=" + numeroDeLote +
                '}';
    }
}
