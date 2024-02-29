import java.util.ArrayList;

public class Empleado extends ElementoEmpresa {
    private String especialidad;
    private double sueldo;

    public Empleado(String nombre, String especialidad, double sueldo) {
        super(nombre);
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    @Override
    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public int contarEmpleado(String especialidad) {
        if(this.getEspecialidad().equals(especialidad)){
            return 1;
        }
        return 0;
    }

    @Override
    public ArrayList<ElementoEmpresa> tieneEspecialidad(String especialidad) {
        ArrayList<ElementoEmpresa>listaAuxiliar = new ArrayList<>();
        if(this.getEspecialidad().equals(especialidad)){
            listaAuxiliar.add(this);
        }
        return listaAuxiliar;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
