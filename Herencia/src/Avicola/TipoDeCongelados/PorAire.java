package Avicola.TipoDeCongelados;

import Avicola.Congelados;

import java.util.Date;

public class PorAire extends Congelados {
    private int nitrogeno;
    private int oxigeno;
    private int dioxidoDeCarbono;
    private int vaporDeAgua;

    public PorAire(Date fechaDeVencimiento, int numeroDeLote, Date fechaEnvasado, String granjaOrigen, int codigo, int temperatura, int nitrogeno, int oxigeno) {
        super(fechaDeVencimiento, numeroDeLote, fechaEnvasado, granjaOrigen, codigo, temperatura);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoDeCarbono = dioxidoDeCarbono;
        this.vaporDeAgua = vaporDeAgua;
    }


    public int getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(int nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public int getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
    }

    public int getDioxidoDeCarbono() {
        return dioxidoDeCarbono;
    }

    public void setDioxidoDeCarbono(int dioxidoDeCarbono) {
        this.dioxidoDeCarbono = dioxidoDeCarbono;
    }

    public int getVaporDeAgua() {
        return vaporDeAgua;
    }

    public void setVaporDeAgua(int vaporDeAgua) {
        this.vaporDeAgua = vaporDeAgua;
    }
}

