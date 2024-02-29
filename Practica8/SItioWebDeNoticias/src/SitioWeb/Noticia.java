package SitioWeb;

import CriterioDeBusqueda.CriterioDeBusqueda;

import java.util.ArrayList;

public class Noticia extends ElementoWeb {
    private String titulo;
    private ArrayList<String>palabrasClaves;
    private String introduccion;
    private String texto;
    private String autor;
    private String linkAsociado;

    public Noticia(String titulo,  String introduccion, String texto, String autor, String linkAsociado) {
        this.titulo = titulo;
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.linkAsociado = linkAsociado;
        this.palabrasClaves = new ArrayList<>();
    }
    @Override
    public int cantidadNoticias() {
        return 1;
    }

    @Override
    public ArrayList<Noticia> buscar(CriterioDeBusqueda criterio) {
        ArrayList<Noticia>encontrado= new ArrayList<>();
        if(criterio.cumple(this)){
            encontrado.add(this);
        }
        return encontrado;
    }


    @Override
    public ElementoWeb copiaRestringida(CriterioDeBusqueda c) {
        if(c.cumple(this)) {
            Noticia copia = new Noticia(this.getTitulo(), this.getIntroduccion(), this.getTexto(), this.getAutor(), this.getLinkAsociado());
            for(String p: palabrasClaves){
                copia.add(p);
            }
            return copia;
        }
        return null;
    }

    @Override
    public ArrayList<String> imprimirMapaSitio() {
        ArrayList<String>salida = new ArrayList<>();
        salida.add(this.getLinkAsociado());
        return salida;
    }

    public void add(String palabra){//al ingresar una nueva palarba, genera una copia de la noticia
        this.palabrasClaves.add(palabra);
    }
    public boolean tienePalabraClave(String palabra){
        return this.palabrasClaves.contains(palabra);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLinkAsociado() {
        return linkAsociado;
    }

    public void setLinkAsociado(String linkAsociado) {
        this.linkAsociado = linkAsociado;
    }

    @Override
    public String toString() {
        return "SitioWeb.Noticia{" +
                "titulo='" + titulo + '\'' +
                ", palabrasClaves=" + palabrasClaves +
                ", introduccion='" + introduccion + '\'' +
                ", texto='" + texto + '\'' +
                ", autor='" + autor + '\'' +
                ", linkAsociado='" + linkAsociado + '\'' +
                '}';
    }
    public boolean equals(Object obj){
        try{
            Noticia otra = (Noticia) obj;
            return this.getTitulo().equals(otra.getTitulo()) &&
                    this.getAutor().equals(otra.getAutor());
        }catch (Exception e){
            return false;
        }
    }

}
