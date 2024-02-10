package Avicola;

import java.util.Date;

public class Refrigerados extends Fresco{
    private int codigo;
    private int temperatura;

    public Refrigerados(Date fechaDeVencimiento, int numeroDeLote, Date fechaEnvasado, String granjaOrigen,int codigo,int temperatura) {
        super(fechaDeVencimiento, numeroDeLote, fechaEnvasado, granjaOrigen);
        this.codigo=codigo;
        this.temperatura=temperatura;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {//fechaDeVencimiento, numeroDeLote, fechaEnvasado, granjaOrigen
        return "Producto Refrigerados:" +"\n"+
                super.toString()+"\n"+
                "codigo: " + codigo +"\n"+
                "temperatura: " + temperatura;
    }
}
