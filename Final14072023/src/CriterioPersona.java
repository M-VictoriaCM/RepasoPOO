public class CriterioPersona implements Criterio{
    private String nombre;

    public CriterioPersona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Fotografia fotografia) {
        return fotografia.contienePersona(nombre);
    }
}
