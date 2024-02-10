package Monstruo;

public class ShowMonstruos {
    public void asusta(Monstruo m){
        m.asustar();
    }
    public  void asustaMcuho(MonstruoPeligroso m){
        m.asustar();
        m.destruir();
    }
    public void loiquida(MonstruoLetal m){
        m.matar();
    }

    public static void main(String[] args) {
        ShowMonstruos show = new ShowMonstruos();
        MonstruoPeligroso barney =new Godzila();
        System.out.println("Sale Barney");
        show.asusta(barney);
        /*-------------------------------------------------------------*/
        show.asustaMcuho(barney);

        System.out.println("Sale dracula");
        Vampiro dracula= new VampiroMalefico();
    }
}
