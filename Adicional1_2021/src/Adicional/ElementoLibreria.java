package Adicional;

public class ElementoLibreria {
    private String nombre;
    private String autor;
    private double precio;

    public ElementoLibreria(String nombre, String autor, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean equals(Object obj){
        try{
            ElementoLibreria otro = (ElementoLibreria) obj;
            return this.getNombre().equals(((ElementoLibreria) obj).getNombre()) ||
                    this.getAutor().equals(((ElementoLibreria) obj).getAutor());
        }catch (Exception e){
            return false;
        }
    }

}
