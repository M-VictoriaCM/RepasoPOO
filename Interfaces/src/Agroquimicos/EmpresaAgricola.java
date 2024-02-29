package Agroquimicos;

import java.util.ArrayList;

public class EmpresaAgricola {
    private String nombre;
    private ArrayList<ProductoQuimico>productos;

    public EmpresaAgricola(String nombre) {
        this.nombre = nombre;
        this.productos=new ArrayList<>();
    }
    private void addProductosQ(ProductoQuimico pq){
        if(!this.productos.contains(pq)){
            this.productos.add(pq);
        }
    }
    public ArrayList<ProductoQuimico>productos(){
        ArrayList<ProductoQuimico>copia= new ArrayList<>();
        copia.addAll(productos);
        return copia;
    }
    //TODO Proveer un listado de agroquímicos que puedan tratar una enfermedad determinada
    public ArrayList<ProductoQuimico>puedenTratar(Enfermedad e){
        ArrayList<ProductoQuimico>salida= new ArrayList<>();
        for(ProductoQuimico pq: productos){
            if(e.esTratada(pq)){
                salida.add(pq);
            }
        }
        return salida;
    }
    //TODO Dado un cultivo y una enfermedad devolver el listado de agroquímicos con los
    //pueden tratar. Tener en cuenta que ciertos agroquímicos no pueden aplicarse sobre
    //determinados cultivos.
    public ArrayList<ProductoQuimico>listado(Cultivo c, Enfermedad e){
        ArrayList<ProductoQuimico>lista = new ArrayList<>();
        for(ProductoQuimico pq: productos){
            if(e.esTratada(pq) && pq.cultivosPermitido(c)){
                lista.add(pq);
            }
        }
        return lista;
    }

    public static void main(String[] args) {
        EmpresaAgricola empresa = new EmpresaAgricola("Acme Agro");

        // Creación de los productos químicos
        ProductoQuimico herbicida = new ProductoQuimico("Herbicidax");
        herbicida.addCultivosDesaconsejados(new Cultivo("Girasol"));
        herbicida.addCultivosDesaconsejados(new Cultivo("Lino"));
        herbicida.addEstado("Hojas Amarillas");
        herbicida.addEstado("Maleza");
        herbicida.tieneEstadoPatologico("Hojas Amarillas");
        herbicida.tieneEstadoPatologico("Maleza");



        //Agrego los herbicidas
        empresa.addProductosQ(herbicida);



        Enfermedad enfermedad1 = new Enfermedad("Oidio");
        enfermedad1.addEstadosPatologicos("Hojas Amarillas");

        Enfermedad enfermedad2 = new Enfermedad("Pulgón");
        enfermedad2.addEstadosPatologicos("Hojas mordidas");

        Enfermedad enfermedad3 = new Enfermedad("Gusano Cogollero");
        enfermedad3.addEstadosPatologicos("Hojas mordidas");

        ProductoQuimico insecticida = new ProductoQuimico("Insecticida X");
        insecticida.tieneEstadoPatologico("Hoja mordidas");
        insecticida.tieneEstadoPatologico("Pulgón");

        Cultivo trigo = new Cultivo("trigo");
        trigo.addEnfermedadesFrecuentes(enfermedad1);
        trigo.addEnfermedadesFrecuentes(enfermedad2);



        Cultivo maiz= new Cultivo("Maiz");
        maiz.addEnfermedadesFrecuentes(enfermedad3);

        ArrayList<ProductoQuimico> listaOidioTrigo = empresa.puedenTratar(enfermedad1);
        System.out.println("Agroquimico para el oidio en trigo:");
        for(ProductoQuimico pq: listaOidioTrigo){
            System.out.println(pq.getNombre());
        }
    }
}
