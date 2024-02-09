package SistemaDeAlquiler;

import java.util.Objects;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private boolean alquileresVencidos;

    public Cliente(int id, String nombre, String apellido, boolean alquileresVencidos) {
        this.id=id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.alquileresVencidos = alquileresVencidos;
    }

    public int getId() {
        return id;
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

    public boolean isAlquileresVencidos() {
        return alquileresVencidos;
    }

    public void setAlquileresVencidos(boolean alquileresVencidos) {
        this.alquileresVencidos = alquileresVencidos;
    }
    public boolean equals(Object obj){
        try{
             Cliente otroCliente = (Cliente) obj;
             return this.getId() == otroCliente.getId() &&
                     this.getNombre().equals(otroCliente.getNombre()) &&
                     this.getApellido().equals(otroCliente.getApellido());
        }catch (Exception e){
            return false;
        }
    }
}
