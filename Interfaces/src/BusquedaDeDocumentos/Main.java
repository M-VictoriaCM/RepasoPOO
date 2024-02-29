package BusquedaDeDocumentos;

import BusquedaDeDocumentos.Criterios.*;

public class Main {
    public static void main(String[] args) {
        // Crear documentos de ejemplo
        Documento documento1 = new Documento("La Revolución Francesa", "Este documento habla sobre la Revolución Francesa");
        documento1.addAutores("Jules Michelet");
        documento1.addPalabrasClaves("Francia");
        documento1.addPalabrasClaves("Revolución");
        documento1.addPalabrasClaves("Siglo XVIII");

        Documento documento2 = new Documento("La Segunda Guerra Mundial", "Este documento describe los eventos de la Segunda Guerra Mundial");
        documento2.addAutores("Winston Churchill");
        documento2.addAutores("Dwight D. Eisenhower");
        documento2.addPalabrasClaves("Guerra");
        documento2.addPalabrasClaves("Nazismo");
        documento2.addPalabrasClaves("Aliados");

        Documento documento3 = new Documento("El Descubrimiento de América", "Este documento narra el descubrimiento de América por Cristóbal Colón");
        documento3.addAutores("Cristóbal Colón");
        documento3.addPalabrasClaves("América");
        documento1.addPalabrasClaves("Exploración");
        documento1.addPalabrasClaves("Siglo XV");

        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional", "Avenida Libertador 1516");

        // Agregar documentos a la biblioteca
        biblioteca.addDocumentos(documento1);
        biblioteca.addDocumentos(documento2);
        biblioteca.addDocumentos(documento3);

        // Crear criterios de búsqueda
        System.out.println("-----------------------------------------------------------------------------------------");
        //TODO a) Todos los documentos cuyo título sea exactamente igual a un título dado
        System.out.println("Todos los documentos cuyo título sea exactamente igual a: El Descubrimiento de América");
        Criterio criterioTitulo = new IgualTitulo("El Descubrimiento de América");
        System.out.println(biblioteca.busqueda(criterioTitulo));

        System.out.println("-----------------------------------------------------------------------------------------");
        //TODO b) Todos los documentos cuyo título contenga una palabra o frase dada.
        System.out.println("Todos los documentos título contenga una palabra o frase dada: Francesa");
        Criterio palabra = new títuloContienePalabraOFrase("Francesa");
        Criterio frase = new PalabraOFraseContenido("La Revolución");
        Criterio busquedaCompuesta = new CriterioOr(palabra, frase);
        System.out.println(biblioteca.busqueda(busquedaCompuesta));
        System.out.println("-----------------------------------------------------------------------------------------");
        //TODO c ) Todos los documentos que contengan una palabra clave dada.
        System.out.println("Todos los documentos que contengan una palabra clave dada.");
        Criterio contienePalabraClave = new TienePalabraClave("Exploración");
        for (Documento documento : biblioteca.busqueda(contienePalabraClave)) {
            System.out.println(documento.getTitulo());
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        //TODO d) Todos los documentos que no contengan ninguna palabra clave.
        System.out.println("Todos los documentos que no contengan ninguna palabra clave");
        Criterio noPalabrasClaves = new Not(new TienePalabraClave("América"));
        for (Documento d : biblioteca.busqueda(noPalabrasClaves)) {
            System.out.println("Libro: "+d.getTitulo());
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        //TODO e) Todos los documentos de un autor determinado.
        System.out.println("Todos los documentos de un autor determinado");
        Criterio autorDeterminado = new TieneAutor("Jules Michelet");
        for (Documento d : biblioteca.busqueda(autorDeterminado)){
            System.out.println("Titulo: "+d.getTitulo());
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        //TODO f) Todos los documentos cuyo contenido tenga una palabra o frase dada
        System.out.println("Todos los documentos cuyo contenido tenga una palabra o frase dada: Este documento narra...");
        Criterio palabraOFraseContenido = new PalabraOFraseContenido("Este documento narra");
        for (Documento d : biblioteca.busqueda(palabraOFraseContenido)){
            System.out.println("Titulo: "+d.getTitulo());
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        //TODO Todos los documentos cuyo contenido tenga al menos 20 palabras
        System.out.println("Todos los documentos cuyo contenido tenga al menos 20 palabras");
        Criterio cantidadPalabra = new MenorCantidadDePalabras(20);
        for (Documento d: biblioteca.busqueda(cantidadPalabra)){
            System.out.println("Titulo: "+d.getTitulo());
        }
        //TODO Cualquier combinación lógica de las formas anteriores.
        Criterio and = new CriterioAND(new PalabraOFraseContenido("documento"), new IgualTitulo("Cristóbal Colón"));



    }
}
