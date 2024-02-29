package SistemaElectoral;

import java.time.LocalDate;

public class Voto {
    private Candidato candidato;
    private LocalDate hora;

    public Voto() {
        this.candidato = candidato;
        this.hora = LocalDate.now();
    }

    public Voto(Candidato candidato) {
        this.candidato = candidato;
        this.hora = LocalDate.now();
    }
    public Candidato getVotado(){
        return candidato;
    }
    public boolean votoEnBlanco(){
        return candidato == null;
    }
    public LocalDate getHoraVotacion(){
        return hora;
    }

}
