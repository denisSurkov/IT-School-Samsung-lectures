package lection2_2.interfaces;

public class Xbox implements Controller {
    @Override
    public void channelUp() {
        System.out.println("XBOX: next game");
    }

    @Override
    public void channelDown() {

        System.out.println("XBOX: prev game");
    }

    @Override
    public void soundUp() {

        System.out.println("XBOX: sound up");
    }

    @Override
    public void soundDown() {
        System.out.println("XBOX: sound down");

    }

    @Override
    public void power() {
        System.out.println("XBOX: power");
    }
}
