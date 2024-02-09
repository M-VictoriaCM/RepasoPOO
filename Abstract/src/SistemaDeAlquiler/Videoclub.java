package SistemaDeAlquiler;

import java.time.LocalDate;
import java.util.ArrayList;

public class Videoclub {
    private ArrayList<Alquiler>alquileres;
    private ArrayList<Cliente>clientes;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;

    public Videoclub() {
        this.alquileres= new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    /*TODO el sistema debe permitir alquilar un item a un determinado cliente hasta
   una determinada fecha*/
    public void add(Alquiler alquiler){
        if(alquiler.isDisponible()){
            alquiler.AlquilarItems();
            alquileres.add(alquiler);
        }else{
            System.out.println("El item no esta disponible");
        }
    }
    //TODO controlar los items alquilados a cada cliente
    public ArrayList<Alquiler>getItemAlquiladosPor(Cliente c){
        ArrayList<Alquiler>salida = new ArrayList<>();
        for(Alquiler a : alquileres){
            if(a.getCliente().equals(c)){
                salida.add(a);
            }
        }
        return salida;
    }
    //TODO permitir conocer quienes son los clientes que posseen alquileres vencidos.
    public ArrayList<Cliente>getClienteConAlquilereVencidos(){
        ArrayList<Cliente>salida = new ArrayList<>();
        for(Alquiler a: alquileres){
            if(a.getFechaDevolucion().isBefore(LocalDate.now())){
                salida.add(a.getCliente());
            }
        }
        return salida;
    }

    //------------------------------- Getter y Setter---------------------------------
    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }
    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public static void main(String[] args) {
        // Creamos algunos clientes
        Cliente cliente1 = new Cliente(1, "Juan", "Pérez", false);
        Cliente cliente2 = new Cliente(2, "María", "Gómez", false);

        // Creamos algunas películas
        Pelicula pelicula1 = new Pelicula("El Señor de los Anillos", "Fantasía épica", 3);
        Pelicula pelicula2 = new Pelicula("Star Wars", "Ciencia ficción", 2);
        System.out.println("Cantidad de pliculas"+pelicula1.getCantidadDeCopias());
        // Creamos un vehículo
        Vehiculo vehiculo1 = new Vehiculo("Renault", 10000, "ABC123", "Auto");

        Alquiler a1 = new Alquiler(LocalDate.now(), LocalDate.of(2024, 02, 20),cliente1);
        Alquiler a2= new Alquiler(LocalDate.now(), LocalDate.of(2024, 02, 15),cliente2);

        // Creamos un videoclub
        Videoclub videoclub = new Videoclub();
        videoclub.add(a1);
        videoclub.add(a2);

// Obtenemos la lista de alquileres del cliente 1
        ArrayList<Alquiler> alquileresCliente1 = videoclub.getItemAlquiladosPor(cliente1);

// Imprimimos la información de los alquileres
        for (Alquiler alquiler : alquileresCliente1) {
            System.out.println("Fecha de alquiler: " + alquiler.getFechaAlquiler());
            System.out.println("Fecha de devolución: " + alquiler.getFechaDevolucion());
            System.out.println("Items alquilados: " + alquiler.getItems());
        }


        // Alquilamos un vehículo para el cliente 2
        //videoclub.add();
        System.out.println(pelicula1.getCantidadDeCopias());
        // Mostramos los clientes con alquileres vencidos (en este caso, ninguno)
        for (Cliente cliente : videoclub.getClienteConAlquilereVencidos()) {
            System.out.println("Cliente con alquileres vencidos: " + cliente.getNombre() + " " + cliente.getApellido());
        }

        // Devolvemos la película alquilada por el cliente 1
        pelicula1.devolucion(cliente1);

        System.out.println(pelicula1.getCantidadDeCopias());

        // Mostramos la disponibilidad de la película
        System.out.println("Disponibilidad de la película " + pelicula1.getNombre() + ": " + pelicula1.isDisponible()+"Copias disponibles"+pelicula1.getCantidadDeCopias());

        // Mostramos el kilometraje del vehículo
        System.out.println("Kilometraje del vehículo " + vehiculo1.getMarca() + ": " + vehiculo1.getKm());
    }
}
