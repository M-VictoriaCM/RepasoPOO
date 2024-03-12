package Carpinteria;

import Calculador.AdicionalPorCondicion;
import Calculador.AplicoAdicional;

import java.util.ArrayList;

public class Carpinteria {
    private String nombre;
    private ArrayList<Taller>talleres;
    private ArrayList<Pedido>pedidos;

    public Carpinteria(String nombre) {
        this.nombre = nombre;
        this.talleres = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }
    public boolean Asignado(Pedido pedido){
        for(Elemento e: pedido.getElementos()){
            if(!talleres.contains(e)){
                return false;
            }
        }
        return true;
    }
    public void addPedido(Pedido p){
        pedidos.add(p);
    }
    public void derivoATaller(Pedido pedido){
        if (!Asignado(pedido)) {
            for (Elemento e : pedido.getElementos()) {
                Taller tallerAsignado = buscarTaller(e);
                if(tallerAsignado != null){
                    tallerAsignado.agregarElementoAlTaller(e);
                }
            }
            Asignado(pedido);
        }
    }

    private Taller buscarTaller(Elemento e) {
        for(Taller taller : talleres){
            if(taller.aceptaElemento(e)){
                return taller;
            }
        }
        return null;
    }

    public double costoTotal(Pedido pedido, AplicoAdicional valor){
        double total=0.0;
        for (Elemento e: pedido.getElementos()){
            total=pedido.costoTotal()+valor.calcular(e);
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
