package PilaDeElemento;

public class Main {
        public static void main(String[] args) {
            // Crear una pila
            Pila miPila = new Pila();

            // Insertar elementos en la pila
            miPila.push("Elemento 1");
            miPila.push("Elemento 2");
            miPila.push("Elemento 3");
            miPila.push("Elemento 4");
            miPila.push("Elemento 5");
            miPila.push("Elemento 6");
            miPila.push("Elemento 7");

            // Mostrar la cantidad de elementos en la pila
            System.out.println("Cantidad de elementos en la pila: " + miPila.size());
            System.out.println("tope"+miPila.top());
            // Hacer una copia de la pila
            Pila copiaPila = miPila.copy();
            System.out.println("Cantidad de elementos en la pila: " + miPila.size());
            // Sacar elementos de la pila original
            System.out.println("Elemento sacado: " + miPila.pop());
            System.out.println("Cantidad de elementos en la pila: " + miPila.size());
            System.out.println(" ");
            // Mostrar la cantidad de elementos en la pila original después de sacar un elemento
            System.out.println("Cantidad de elementos en la pila original: " + miPila.size());

            // Mostrar la cantidad de elementos en la pila copia
            System.out.println("pila Actual: " + miPila);

            System.out.println("Pila invertida"+miPila.reverse());
        }
}


