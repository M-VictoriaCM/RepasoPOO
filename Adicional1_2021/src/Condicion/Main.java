package Condicion;

import Adicional.Cliente;
import Adicional.ClienteExigente;
import Adicional.Libreria;
public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria("Lumi");
        Cliente cliente1 = new ClienteExigente("Marcelo", "Armentano", 12345, "altura1", 20);
        Cliente cliente2 = new Cliente("Andrea", "Gherbi", 98761, "altura2", 30);
        cliente1.addAutorFavorito("Luis");
        cliente1.addAutorFavorito("Noelia");
        cliente2.addAutorFavorito("Noelia");
        cliente2.addAutorFavorito("Cristian");
        libreria.addCliente(cliente1);
        libreria.addCliente(cliente2);
        Condicion busqueda1 = new CondicionAutor("Noelia");
        Condicion busqueda2 = new CondicionNot(new CondicionAutor("Cristian"));
        Condicion busquedaAutor = new CondicionAnd(busqueda1, busqueda2);
        System.out.println("Busqueda por autor"+"\n"+libreria.buscar(busqueda1));
        System.out.println("Busqueda con negacion"+"\n"+libreria.buscar(busqueda2));
        System.out.println("Busqueda con condicional"+"\n"+libreria.buscar(busquedaAutor));
    }
}