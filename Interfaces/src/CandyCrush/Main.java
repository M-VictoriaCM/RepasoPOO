package CandyCrush;

public class Main {
    public static void main(String[] args) {
        Tablero tablero =new Tablero(1000);
        Ficha chocolate = new Ficha("Chocolate",1,0,1);
        Ficha piedra = new Ficha("Piedra", 6, 0, 1);
        Ficha caramelo= new Ficha("Caramelo",1, 10,1);
        Ficha torta = new Ficha("Torta",8,4,4);

        tablero.addFichas(chocolate);
        tablero.addFichas(piedra);
        tablero.addFichas(caramelo);
        tablero.addFichas(torta);

        Condicion busqueda1 = new PoderDeDestruccion(2);
        //TODO Todas las fichas que posean un poder de destrucción mayor a 2
        System.out.println("Todas las fichas que posean un poder de destrucción mayor a 2");
        System.out.println(tablero.busqueda(busqueda1));
        System.out.println("-----------------------------------------------");

        Condicion busqueda2 = new Espacio(4);
        //TODO Todas las fichas que ocupen más de 4 lugares
        System.out.println("odas las fichas que ocupen más de 4 lugares");
        System.out.println(tablero.busqueda(busqueda2));
        System.out.println("-----------------------------------------------");

        Condicion busqueda3 = new Fortaleza(5);
        //TODO Todas las fichas que tengan una fortaleza mayor a 5
        System.out.println("Todas las fichas que tengan una fortaleza mayor a 5");
        System.out.println(tablero.busqueda(busqueda3));
        System.out.println("-----------------------------------------------");

        System.out.println("Dificultad "+ tablero.dificultad());


    }
}
