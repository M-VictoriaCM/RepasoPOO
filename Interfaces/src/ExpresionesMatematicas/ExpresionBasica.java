package ExpresionesMatematicas;

import ExpresionesMatematicas.Operacion.Operacion;

import java.util.ArrayList;
import java.util.List;

public class ExpresionBasica implements  Expresion{
    private String expresion;
    private ArrayList<Integer> numero;
    private ArrayList<String>operadores;
    private ArrayList<Operacion>operaciones;

    public ExpresionBasica(String expresion) {
        this.expresion = expresion;
        this.numero= new ArrayList<>();
        this.operadores = new ArrayList<>();
        this.operaciones = new ArrayList<>();
    }

    @Override
    public double evaluar() {
        return 0;
    }
}
