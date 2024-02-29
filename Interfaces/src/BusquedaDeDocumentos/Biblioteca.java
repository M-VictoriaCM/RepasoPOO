package BusquedaDeDocumentos;

import BusquedaDeDocumentos.Criterios.*;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private ArrayList<Documento> documentos;


    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.documentos = new ArrayList<>();
    }

    public void addDocumentos(Documento nuevo) {
        if (!documentos.contains(nuevo)) {
            documentos.add(nuevo);
        }
    }

    public ArrayList<Documento> busqueda(Criterio c) {
        ArrayList<Documento> salida = new ArrayList<>();
        for (Documento d : documentos) {
            if (c.cumple(d)) {
                salida.add(d);
            }
        }
        return salida;
    }

    public ArrayList<Documento> getDocumentos() {
        ArrayList<Documento> copia = new ArrayList<>();
        copia.addAll(documentos);
        return copia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "\n" +
                "nombre='" + nombre + '\n' +
                "direccion='" + direccion + '\n' +
                '}';
    }
}
