package Criterio;

import SistemaElectoral.Voto;

public class PorVotoEnBlanco implements Criterio{
    public PorVotoEnBlanco() {
    }

    @Override
    public boolean cumple(Voto v) {
        return v.votoEnBlanco();
    }
}
