public class OrdenadoPorEdad extends Ordenamiento{
    @Override
    public int comparar(Socio s1, Socio s2) {
        return s1.getEdad() - s2.getEdad();
    }
}
