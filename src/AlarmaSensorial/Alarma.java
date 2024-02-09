package AlarmaSensorial;

import java.util.ArrayList;

public class Alarma {
    private ArrayList<Sensor> sensores;
    private Timbre senalSonora;

    public Alarma(Timbre senalSonora) {
        this.senalSonora = senalSonora;
        this.sensores = new ArrayList<>();
    }

    public void addSensores(Sensor s){
        if(!this.sensores.contains(s)){
            this.sensores.add(s);
        }
   }
   public boolean comprobar(){
        boolean activacion = false;
        for(Sensor s: sensores){
            if(s.estadoActivado()){
               activacion=true;
                System.out.println("Zona de conflicto");
            }
        }
        if(activacion){
            senalSonora.hacerSonar();
            return true;
        }else{
            senalSonora.noSonar();
            return false;
        }
   }
}
