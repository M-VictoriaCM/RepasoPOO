package Avicola.TipoDeCongelados;

import Avicola.Congelados;

import java.util.Date;

public class PorAgua extends Congelados {
    private int litrosDeAgua;
    private int sal;

    public PorAgua(Date fechaDeVencimiento, int numeroDeLote, Date fechaEnvasado, String granjaOrigen, int codigo, int temperatura) {
        super(fechaDeVencimiento, numeroDeLote, fechaEnvasado, granjaOrigen, codigo, temperatura);
        this.litrosDeAgua=litrosDeAgua;
        this.sal=sal;
    }


    public int salinidad(){
        return this.getLitrosDeAgua()*this.getSal();
    }

    public int getLitrosDeAgua() {
        return litrosDeAgua;
    }

    public void setLitrosDeAgua(int litrosDeAgua) {
        this.litrosDeAgua = litrosDeAgua;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "PorAgua{" +
                "litrosDeAgua=" + litrosDeAgua +
                ", sal=" + sal +
                '}';
    }
}
