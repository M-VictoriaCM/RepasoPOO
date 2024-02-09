package SistemaDeAlquiler;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alquiler {
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Cliente cliente;
    private ArrayList<Item>items;

    public Alquiler(LocalDate fechaAlquiler, LocalDate fechaDevolucion, Cliente cliente) {
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion= fechaDevolucion;
        this.cliente= cliente;
        this.items = new ArrayList<>();

    }
    public void AlquilarItems() {
        try{
            for(Item item : items){
                if(item.isDisponible()){
                    item.alquilar(cliente);
                    this.setFechaAlquiler(fechaAlquiler);
                    this.setFechaAlquiler(fechaDevolucion);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public boolean isDisponible() {
        boolean aux=false;
        for (Item item: items){
            aux = item.isDisponible();
        }
        return aux;
    }
    public void devolucionDeItem(Cliente c, Item item){
        if(getFechaDevolucion().isBefore(LocalDate.now())){
            item.devolucion(c);
        }else{
            alquilerVencido(c);
        }
    }
    private void alquilerVencido(Cliente c) {
        if(getFechaDevolucion().isAfter(LocalDate.now())){
            c.setAlquileresVencidos(getCliente().isAlquileresVencidos());
        }
    }
    public ArrayList<Item>getItems(){
        ArrayList<Item>salida= new ArrayList<>();
        for(Item i: items){
            salida.add(i);
        }
        return salida;
    }
    //----------------------------Getter y setter-------------------------------------
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
        this.fechaDevolucion = LocalDate.now();
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}




