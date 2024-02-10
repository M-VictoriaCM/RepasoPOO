package SistemaDeControlDeGastosPublicos;

public class ContribuyeVenta extends Contribuyente{
    private double facturado;
    private double porcentajeImpuesto;
    private double porcentajeFacturado;
    private static final double BASE=100;

    public ContribuyeVenta(String nombre, String codigo, double impuesto, double facturado, double porcentajeImpuesto, double porcentajeFacturado) {
        super(nombre, codigo, impuesto);
        this.facturado = facturado;
        this.porcentajeImpuesto = porcentajeImpuesto;
        this.porcentajeFacturado = porcentajeFacturado;
    }
    @Override
    public double getImpuesto(){
        return super.getImpuesto() *(porcentajeImpuesto/BASE) + (facturado *(porcentajeFacturado/BASE));
    }

    public double getFacturado() {
        return facturado;
    }

    public void setFacturado(double facturado) {
        this.facturado = facturado;
    }

    public double getPorcentajeImpuesto() {
        return porcentajeImpuesto;
    }

    public void setPorcentajeImpuesto(double porcentajeImpuesto) {
        this.porcentajeImpuesto = porcentajeImpuesto;
    }

    public double getPorcentajeFacturado() {
        return porcentajeFacturado;
    }

    public void setPorcentajeFacturado(double porcentajeFacturado) {
        this.porcentajeFacturado = porcentajeFacturado;
    }
}
