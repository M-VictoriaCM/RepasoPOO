public class OrdenamientoPorAlfabeto extends Ordenamiento{
    @Override
    public int comparar(Socio s1, Socio s2) {
        return (s1.getApellido().compareTo(s2.getApellido()));
    }
}
