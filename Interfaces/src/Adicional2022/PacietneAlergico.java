package Adicional2022;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PacietneAlergico extends Paciente {
    private ArrayList<String>alergia;

    public  PacietneAlergico (String nombre, String apellido, Mutual mutual) {
        super(nombre, apellido, mutual);
        this.alergia = new ArrayList<>();
    }

    @Override
    public boolean puedeSerTratadoPor(Medicamento m) {
        if(!alergia.contains(m)){
            return super.puedeSerTratadoPor(m);
        }
        return false;
    }
}
