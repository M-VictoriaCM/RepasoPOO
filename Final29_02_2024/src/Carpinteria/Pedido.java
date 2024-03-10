package Carpinteria;

import Calculador.AplicoAdicional;

import java.util.ArrayList;

public class Pedido {
    private int local;
    private String vendedor;
    private ArrayList<Elemento> elementos;

    public Pedido(int local, String vendedor){
        this.local = local;
        this.vendedor = vendedor;
        this.elementos = new ArrayList<>();
    }
    public void addElemento(Elemento e){
        this.elementos.add(e);
    }
    public boolean contieneElemento(Elemento e){
        return elementos.contains(e);
    }
    public ArrayList<Elemento>getElementos(){
        ArrayList<Elemento>copia =new ArrayList<>();
        copia.addAll(elementos);
        return copia;
    }


    public double costoTotal(AplicoAdicional valor){
        double total=0.0;
        for(Elemento e: elementos){
            total+=valor.calcular(e);
        }
        return total;
    }

    public int getLocal() {
        return local;
    }

    public void setLocal(int local) {
        this.local = local;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
}
