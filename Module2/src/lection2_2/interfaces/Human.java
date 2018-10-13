package lection2_2.interfaces;

public class Human {

    public Human(Controller controller) throws InterruptedException{
        log("want to watch tv, turn on..");
        controller.power();

        Thread.sleep(1000);
        controller.channelUp();
        Thread.sleep(500);
        controller.channelUp();
        Thread.sleep(500);
        log("cool tv, need to sound up");
        controller.soundUp();

        Thread.sleep(500);
        controller.soundUp();
        log("turn off");
        controller.power();

    }

    private void log(String msg){
        System.out.printf("[human]: %s %n", msg);
    }
}
