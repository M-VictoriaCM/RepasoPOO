package Version3;

public class Main {
    public static void main(String[] args) {
       /* Arbol palabras =  new Arbol();
        palabras.addValor("hola");
        palabras.addValor("como");
        palabras.addValor("Estas");
        palabras.addValor("perro");

        palabras.recorrido();*/

        Arbol numeros = new Arbol();
        numeros.addValor(8);
        numeros.addValor(3);
        numeros.addValor(10);
        numeros.addValor(1);
        numeros.addValor(6);
        numeros.addValor(4);
        numeros.addValor(7);
        numeros.addValor(10);
        numeros.addValor(14);
        numeros.addValor(13);

        System.out.println(numeros.recorrido());
    }
}
