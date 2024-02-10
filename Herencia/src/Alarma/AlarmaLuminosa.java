package Alarma;

public class AlarmaLuminosa extends Alarma{
    private Luz luz;

    public AlarmaLuminosa(boolean seRompioVidrio, boolean seAbrioPuertaoVentana, boolean seDetectoMovimiento, Timbre senalSonora) {
        super(seRompioVidrio, seAbrioPuertaoVentana, seDetectoMovimiento, senalSonora);
        this.luz = luz;
    }

    public AlarmaLuminosa(Timbre senalSonora, Luz luz) {
        super(senalSonora);
        this.luz = luz;
    }

    public AlarmaLuminosa(boolean seRompioVidrio, boolean seAbrioPuertaoVentana, boolean seDetectoMovimiento, Timbre senalSonora, Luz luz) {
        super(seRompioVidrio, seAbrioPuertaoVentana, seDetectoMovimiento, senalSonora);
        this.luz = luz;
    }

    @Override
    public boolean comprobar(){
        if(super.comprobar()){
            luz.encender();
            return true;
        }
       luz.apagando();
        return false;
    }
}
