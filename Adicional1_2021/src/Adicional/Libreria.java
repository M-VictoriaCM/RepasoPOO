package Adicional;



import Condicion.Condicion;
import Condicion.CondicionAnd;
import Condicion.CondicionAutor;
import Condicion.CondicionNot;

import java.util.ArrayList;

public class Libreria {

    private String nombre;
    private ArrayList<Cliente>clientes;
    private ArrayList<ElementoLibreria>elementos;

    public Libreria(String nombre) {
        this.nombre = nombre;
        this.clientes=new ArrayList<>();
        this.elementos= new ArrayList<>();
    }
    public void addCliente(Cliente c){
        if(!this.clientes.contains(c)){
            this.clientes.add(c);
        }
    }
    public void addProducto(ElementoLibreria e){
        this.elementos.add(e);
    }
    public ArrayList<Cliente>buscar(Condicion condicion){
        ArrayList<Cliente>salida= new ArrayList<>();
        for(Cliente c : clientes){
            if(condicion.cumple(c)){
                salida.add(c);
            }
        }
        return salida;
    }


}
