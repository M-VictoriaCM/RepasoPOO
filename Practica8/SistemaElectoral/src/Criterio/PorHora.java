package Criterio;

import SistemaElectoral.Voto;

import java.time.LocalDate;

public class PorHora implements Criterio{
    private LocalDate hora;

    public PorHora(LocalDate hora) {
        this.hora = hora;
    }

    @Override
    public boolean cumple(Voto v) {
        return v.getHoraVotacion().compareTo(hora)==0;
    }
}
