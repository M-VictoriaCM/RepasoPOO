package Parcialito4to_2021;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Municipio {
    private String nombre;
    private ArrayList<Cliente>clientes;
    private ArrayList<Comercio>comercios;

    public Municipio(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.comercios= new ArrayList<>();
    }
    //TODO  Dado un cliente, listar todos los comercios a los que podría asistir
    public ArrayList<Comercio>puedeAsistir(Cliente cliente){
        ArrayList<Comercio>encontrado= new ArrayList<>();
        for(Comercio comercio : comercios){
            if(cliente.puedeAsistir(comercio)){
                encontrado.add(comercio);
            }
        }
        return encontrado;
    }
}
