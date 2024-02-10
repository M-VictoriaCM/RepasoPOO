package BusquedaDeDocumentos;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String>autores;
    private String contenidoTextual;
    private ArrayList<String>palabrasClaves;

    public Documento(String titulo, String contenidoTextual) {
        this.titulo = titulo;
        this.contenidoTextual = contenidoTextual;
        this.palabrasClaves= new ArrayList<>();
        this.autores = new ArrayList<>();
    }
    public void addAutores(String a){
        autores.add(a);
    }
    public void addPalabrasClaves(String palabra){
        palabrasClaves.add(palabra);
    }
    public ArrayList<String>getAutores(){//copia de la lista
        ArrayList<String> copia = new ArrayList<>();
        copia.addAll(autores);

        return copia;
    }
    public ArrayList<String>getPalabrasClaves(){
        ArrayList<String>copia= new ArrayList<>();
        copia.addAll(palabrasClaves);

        return copia;
    }
    public boolean tienePalabrasClaves(String a){
        return palabrasClaves.contains(a);
    }
    public boolean tieneAutor(String a){
        return autores.contains(a);
    }
    public void removeAutor(String a){
        autores.remove(a);
    }
    public void remoPalabrasClaves(String a){
        palabrasClaves.remove(a);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenidoTextual() {
        return contenidoTextual;
    }

    public void setContenidoTextual(String contenidoTextual){
        this.contenidoTextual = contenidoTextual;
    }
    public boolean equals(Object obj){
        try{
            Documento otroDoc = (Documento) obj;
            return this.getTitulo().equals(otroDoc.getTitulo()) ||
                    this.getContenidoTextual().equals(otroDoc.getContenidoTextual());
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Documento{" +"\n"+
                "titulo='" + titulo + '\n' +
                "contenidoTextual='" + contenidoTextual + '\n' +
                '}';
    }
}
