import java.util.ArrayList;

public class Grupo extends ElementoEmpresa {
    private ArrayList<ElementoEmpresa>elemento;
    public Grupo(String nombre) {
        super(nombre);
        this.elemento = new ArrayList<>();
    }
    public void addElemento(ElementoEmpresa e){
        elemento.add(e);
    }

    @Override
    public String getEspecialidad() {
        int maximo = 0;
        String especialidad = null;
        for(ElementoEmpresa e: elemento){
            String expAux= e.getEspecialidad();
            int contador= e.contarEmpleado(expAux);
            if(contador>maximo){
                maximo = contador;
                especialidad =expAux;
            }
        }
        return especialidad;
    }

    @Override
    public int contarEmpleado(String especialidad) {
        int cantidad = 0;
        for(ElementoEmpresa ee : elemento){
            cantidad += ee.contarEmpleado(especialidad);
        }
        return cantidad;
    }

    @Override
    public ArrayList<ElementoEmpresa> tieneEspecialidad(String especialidad) {
        ArrayList<ElementoEmpresa>listaAuxiliar = new ArrayList<>();
        for(ElementoEmpresa ee : elemento){
            listaAuxiliar.addAll(ee.tieneEspecialidad(especialidad));
        }
        return listaAuxiliar;
    }
}
