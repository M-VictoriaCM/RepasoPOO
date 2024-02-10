package Alarma;

public class Alarma {

    private boolean seRompioVidrio;
    private boolean seAbrioPuertaoVentana;
    private boolean seDetectoMovimiento;
    private Timbre senalSonora;

    public Alarma(Timbre senalSonora) {
        this.senalSonora = senalSonora;
    }

    public Alarma(boolean seRompioVidrio, boolean seAbrioPuertaoVentana, boolean seDetectoMovimiento, Timbre senalSonora) {
        this.seRompioVidrio = seRompioVidrio;
        this.seAbrioPuertaoVentana = seAbrioPuertaoVentana;
        this.seDetectoMovimiento = seDetectoMovimiento;
        this.senalSonora = senalSonora;
    }

    public boolean isSeRompioVidrio() {
        return seRompioVidrio;
    }

    public void setSeRompioVidrio(boolean seRompioVidrio) {
        this.seRompioVidrio = seRompioVidrio;
    }

    public boolean isSeAbrioPuertaoVentana() {
        return seAbrioPuertaoVentana;
    }

    public void setSeAbrioPuertaoVentana(boolean seAbrioPuertaoVentana) {
        this.seAbrioPuertaoVentana = seAbrioPuertaoVentana;
    }

    public boolean isSeDetectoMovimiento() {
        return seDetectoMovimiento;
    }

    public void setSeDetectoMovimiento(boolean seDetectoMovimiento) {
        this.seDetectoMovimiento = seDetectoMovimiento;
    }

    public boolean comprobar(){
        if((seRompioVidrio || seAbrioPuertaoVentana || seDetectoMovimiento)== true){
            senalSonora.hacerSonar();
            return true;
        }
        senalSonora.noSonar();
        return false;
    }
}
