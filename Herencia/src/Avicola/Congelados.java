package Avicola;

import java.util.Date;

public class Congelados extends Refrigerados{


    public Congelados(Date fechaDeVencimiento, int numeroDeLote, Date fechaEnvasado, String granjaOrigen, int codigo, int temperatura) {
        super(fechaDeVencimiento, numeroDeLote, fechaEnvasado, granjaOrigen, codigo, temperatura);
    }

    @Override
    public String toString() {
        return "Producto Congelados:" +"\n"+super.toString();
    }
}

