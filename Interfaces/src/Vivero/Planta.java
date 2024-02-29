package Vivero;

import java.util.ArrayList;

public class Planta {
    private String nombreCientifico;
    private ArrayList<String>nombreVulgares;
    private String clasificacion;
    private String familia;
    private String clase;
    private String ambiente;
    private int requerimientoSol;
    private int RequerimientoRiego;

    public Planta(String nombreCientifico, String clasificacion, String familia, String clase, String ambiente, int requerimientoSol, int requerimientoRiego) {
        this.nombreCientifico = nombreCientifico;
        this.clasificacion = clasificacion;
        this.familia = familia;
        this.clase = clase;
        this.ambiente = ambiente;
        this.requerimientoSol = requerimientoSol;
        this.RequerimientoRiego = requerimientoRiego;
        this.nombreVulgares =new ArrayList<>();
    }
    public boolean tienenNombre(String nombre){
        return this.nombreVulgares.contains(nombre);
    }
    public void addNombreVulgar(String nombre){
        if(!this.nombreVulgares.contains(nombre)){
            this.nombreVulgares.add(nombre);
        }
    }
    public void deleteNombre(String nombre){
        this.nombreVulgares.remove(nombre);
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public int getRequerimientoSol() {
        return requerimientoSol;
    }

    public void setRequerimientoSol(int requerimientoSol) {
        if(this.requerimientoSol>=1 && this.requerimientoSol<=10){
            this.requerimientoSol = requerimientoSol;
        }

    }

    public int getRequerimientoRiego() {
        return RequerimientoRiego;
    }

    public void setRequerimientoRiego(int requerimientoRiego) {
        if(this.RequerimientoRiego>=1 && this.RequerimientoRiego<=10) {
            RequerimientoRiego = requerimientoRiego;
        }
    }

    public boolean equals(Object obj){
        try{
            Planta otraplanta = (Planta) obj;
            return this.nombreCientifico.equals(otraplanta.nombreCientifico) &&
                    this.familia.equals(otraplanta.getFamilia());
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Planta{" +"\n"+
                "nombreCientifico='" + nombreCientifico + "\n"+
                "nombreVulgares=" + nombreVulgares +"\n"+
                "clasificacion='" + clasificacion+"\n"+
                "familia='" + familia +"\n"+
                "clase='" + clase +"\n"+
                "ambiente='" + ambiente+"\n"+
                " requerimientoSol=" + requerimientoSol+"\n"+
                " RequerimientoRiego=" + RequerimientoRiego +"\n"+
                '}';
    }
}
