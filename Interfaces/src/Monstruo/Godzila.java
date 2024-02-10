package Monstruo;

public class Godzila implements MonstruoPeligroso{
    @Override
    public void asustar() {
        System.out.println("Grrrrrr");
    }

    @Override
    public void destruir() {
        System.out.println("plaf");
    }
}
