package PuertoDeCereales;

import java.time.LocalDateTime;

public class Puerto {
    private ColaDeEspera barcos;
    private ColaDeEspera camiones;

    public Puerto() {
        this.barcos = new ColaDeEspera();
        this.camiones = new ColaDeEspera();
    }
    public void addBarco(Barco nuevo){
        barcos.add(nuevo);
    }
    public void addCamion(Camion nuevo){
        camiones.add(nuevo);
    }
    public void imprimirBarco(){
        System.out.println("Lista de barcos");
        for(int i=0; i<barcos.size(); i++){
            System.out.println(barcos.get(i));
        }
    }
    public void imprimirCamiones(){
        System.out.println("Lista de Camiones");
        for (int i = 0;  i<camiones.size(); i++) {
            System.out.println(camiones.get(i));
        }
    }
    public static void main(String[] args) {
        Puerto puerto = new Puerto();

        Barco barco1 = new Barco("Barco1", "ABC123", 1000.0);
        Barco barco2 = new Barco("Barco2", "DEF456", 1500.0);

        Camion camion1 = new Camion("XYZ789", 500.0, LocalDateTime.now());
        Camion camion2 = new Camion("HIJ321", 700.0, LocalDateTime.now().minusHours(2));

        puerto.addBarco(barco1);
        puerto.addBarco(barco2);

        puerto.imprimirBarco();

        puerto.addCamion(camion1);
        puerto.addCamion(camion2);
        puerto.imprimirCamiones();

        // Aquí puedes realizar otras operaciones relacionadas con el puerto según tus necesidades.
    }
}
