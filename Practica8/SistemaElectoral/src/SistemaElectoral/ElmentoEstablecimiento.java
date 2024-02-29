package SistemaElectoral;

import Criterio.Criterio;

import java.util.ArrayList;

public abstract class ElmentoEstablecimiento {
    public abstract int cantidadTotalDeVotos();
    public abstract int cantidadVotos(Criterio c);

    public double porcentajeDevotos(Criterio c){
        return (this.cantidadVotos(c)/ cantidadTotalDeVotos())*100;
    }
    public abstract ArrayList<Candidato>listarCandidatos();

}
