import java.util.ArrayList;

public abstract class ElementoEmpresa {
    private String nombre;

    public ElementoEmpresa(String nombre) {
        this.nombre = nombre;
    }
    public abstract String getEspecialidad();
    public abstract int contarEmpleado(String especialidad);
    public abstract ArrayList<ElementoEmpresa>tieneEspecialidad(String especialidad);
}
