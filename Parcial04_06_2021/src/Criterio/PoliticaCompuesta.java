package Criterio;

import Libreria.Elementolibreria;

public class PoliticaCompuesta extends Politica{
    private Politica p1, p2;

    public PoliticaCompuesta(Politica p1, Politica p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public boolean cumple(Elementolibreria e){
        return p1.cumple(e)&& p2.cumple(e);
    }
}
