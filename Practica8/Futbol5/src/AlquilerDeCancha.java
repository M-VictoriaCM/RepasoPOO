public class AlquilerDeCancha {
    private int idCancha;
    private double alquiler;

    public AlquilerDeCancha(int idCancha, double alquiler) {
        this.idCancha = idCancha;
        this.alquiler = alquiler;
    }
    public int getId(){
        return idCancha;
    }
    public double  getAquilerPagado(){
        return alquiler;
    }
    public double cuotaSinPagar(){
        return 0;
    }
}
