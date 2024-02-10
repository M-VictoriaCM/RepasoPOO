package Monstruo;

public class VampiroMalefico implements Vampiro{
    @Override
    public void asustar() {
        System.out.println("buhhh!");
    }

    @Override
    public void matar() {
        System.out.println("crash");
    }

    @Override
    public void destruir() {
        System.out.println("plaf");
    }

    @Override
    public void succionar() {
        System.out.println("fffffffffffffffhhhhhhhhh");
    }
}
