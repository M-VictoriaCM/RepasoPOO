package Adicional;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private ArrayList<String>autoresFavoritos;
    private ArrayList<String>generosFavoritos;
    private ArrayList<ElementoLibreria>listaDeCompras;
    private double descuento;

    public Cliente(String nombre, String apellido, int dni, String direccion, double descuento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.descuento = descuento;
        this.autoresFavoritos = new ArrayList<>();
        this.generosFavoritos = new ArrayList<>();
        this.listaDeCompras=new ArrayList<>();
    }
    public void addAutorFavorito(String autor){
            autoresFavoritos.add(autor);
    }
    public void addGeneroFavorito(String genero){
        generosFavoritos.add(genero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public double getPrecio(ElementoLibreria e){
        return  e.getPrecio() + (e.getPrecio()*getDescuento());
    }
    public boolean compraProducto(ElementoLibreria e){
        return listaDeCompras.contains(e);
    }
    public boolean leGustaLibro(Libro l){
        return autoresFavoritos.contains(l);
    }
    public boolean leGustaGenero(Libro l){
        return generosFavoritos.contains(l);
    }
    public boolean leAustaAutor(String a){
        return autoresFavoritos.contains(a);
    }
    public ArrayList<String> getAutoresFavoritos(){
        ArrayList<String> copia = new ArrayList<>();
        for(String a: autoresFavoritos){
            copia.add(a);
        }
        return copia;
    }
    public ArrayList<String>getGenerosFavoritos(){
        ArrayList<String>copia = new ArrayList<>();
        for(String a: generosFavoritos){
            copia.add(a);
        }
        return copia;
    }
    public boolean equals(Object obj){
        try{
            Cliente otroCliente = (Cliente)obj;
            return this.getNombre().equals(otroCliente.getNombre()) &&
                    this.getApellido().equals(otroCliente.getApellido()) &&
                    this.getDni()==(otroCliente.getDni());
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", descuento=" + descuento +
                '}';
    }
}
