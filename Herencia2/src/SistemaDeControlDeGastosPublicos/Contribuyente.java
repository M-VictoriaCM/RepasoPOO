package SistemaDeControlDeGastosPublicos;

public class Contribuyente {
    private String nombre;
    private String codigo;
    private double impuesto;

    public Contribuyente(String nombre, String codigo, double impuesto) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.impuesto = impuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
}
