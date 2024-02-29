package Adicional2022;



import Adicional2022.Condicion.Cond;

import java.util.ArrayList;

public class Farmacia {
    private String nombre;
    private ArrayList<Medicamento>medicamentos;
    private ArrayList<Paciente>pacientes;

    public Farmacia(String nombre) {
        this.nombre = nombre;
        this.medicamentos=new ArrayList<>();
        this.pacientes= new ArrayList<>();
    }
    public void addPaciente(Paciente p){
        if(!this.pacientes.contains(p)){
            this.pacientes.add(p);
        }
    }
    public void addMedicamentos(Medicamento m){
        if(!this.medicamentos.contains(m)){
            this.medicamentos.add(m);
        }
    }
    public boolean puedeTratarA(Medicamento m, Paciente p){
        return m.puedeTratarA(p);
    }
    public ArrayList<Medicamento>buscarMedicamento(Cond condicion){
        ArrayList<Medicamento>salida = new ArrayList<>();
        for(Medicamento m : medicamentos){
            if(condicion.cumple(m)){
                salida.add(m);
            }
        }
        return salida;
    }
}
