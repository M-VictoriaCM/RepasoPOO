package CentroDeComputos;

import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.util.ArrayList;

public class CentroDeComputos {
    ColaEspera computadoras;
    ColaEspera proceso;

    public CentroDeComputos() {
        this.computadoras = new ColaEspera();
        this.proceso = new ColaEspera();
    }
    public void addComputadora(Computadora nueva){
        computadoras.add(nueva);
    }
    public void addProceso(Proceso nuevoProceso){
        computadoras.add(nuevoProceso);
    }
    public void imprimir(){
        System.out.println("Lista de computadoras");
        for(int i=0; i< computadoras.size(); i++){
            System.out.println(computadoras.get(i));
        }
    }
    public void imprimirProceso(){
        System.out.println("Lista de Procesos");
        for (int i = 0;  i<proceso.size(); i++) {
            System.out.println(proceso.get(i));
        }
    }


    public static void main(String[] args) {
        CentroDeComputos c = new CentroDeComputos();
        Computadora pc1 =new Computadora("Pc1",10.5, 256 );
        Computadora pc2 =new Computadora("Pc2",150.2, 512.6);
        Computadora pc3 =new Computadora("Pc2",5.5, 1042);

        c.addComputadora(pc1);
        c.addComputadora(pc2);
        c.addComputadora(pc3);

        c.imprimir();
        Proceso proc1= new Proceso("windows", 2048);
        Proceso proc2= new Proceso("chorme", 9999999);

        c.addProceso(proc1);
        c.addProceso(proc2);
        c.imprimirProceso();
    }

}
