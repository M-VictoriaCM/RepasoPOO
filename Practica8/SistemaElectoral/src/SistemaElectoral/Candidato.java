package SistemaElectoral;

public class Candidato implements Comparable<Candidato>{
    private String nombre;
    private String partidoPolitico;
    private String agrupacion;

    public Candidato(String nombre, String partidoPolitico, String agrupacion) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.agrupacion = agrupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }
    public boolean equals(Object obj){
         try{
             Candidato otroCandidato = (Candidato) obj;
             return this.getNombre().equals(otroCandidato.getNombre()) &&
                     this.getPartidoPolitico().equals(otroCandidato.getPartidoPolitico()) &&
                     this.getAgrupacion().equals(otroCandidato.getAgrupacion());
         }catch(Exception e){
             return false;
         }
    }

    @Override
    public int compareTo(Candidato o) {
        int candidato= this.partidoPolitico.compareTo(o.getPartidoPolitico());
        if(candidato != 0){
            return candidato;
        }else{
            candidato = this.agrupacion.compareTo(o.getAgrupacion());
            if(candidato != 0){
                return candidato;
            }else{
                candidato = this.nombre.compareTo(o.getNombre());
            }

        }
        return candidato;
    }
}
