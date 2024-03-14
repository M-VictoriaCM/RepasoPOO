package Strategy;

import Editorial.Capitulo;

public class CalculadoraSuma extends Calculadora{
    private Calculadora op1, op2;

    public CalculadoraSuma(Calculadora op1, CalculadoraSuma o2){
        this.op1= op1;
        this.op2= op2;
    }
    public double calcular(Capitulo cap){
        return op1.calcular(cap) +op2.calcular(cap);
    }
}
