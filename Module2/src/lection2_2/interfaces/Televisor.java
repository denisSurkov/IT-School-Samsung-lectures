package lection2_2.interfaces;

public class Televisor implements Controller {
    public String[] channelList = {"Discovery", "National geographics", "disnay"};
    private int soundLevel, currentChannel;

    private final static int MAX_SOUND_LEVEL = 10;

    boolean power;

    public void channelUp(){
        if (currentChannel < channelList.length - 1){
            currentChannel++;
        } else {
            currentChannel = 0;
        }
        System.out.printf("current channel is %s %n", channelList[currentChannel]);
    }

    public void channelDown(){
        if (currentChannel > 0){
            currentChannel--;
        } else {
            currentChannel = channelList.length - 1;
        }
        System.out.printf("current channel is %s %n", channelList[currentChannel]);
    }

    public void soundUp(){
        if (soundLevel < MAX_SOUND_LEVEL) soundLevel ++;
        System.out.printf("sound is %d %n", soundLevel);
    }
    public void soundDown(){
        if (soundLevel > 0) soundLevel--;
        System.out.printf("sound is %d %n", soundLevel);
    }

    public void power(){
        power = !power;
        System.out.printf("Питание:%b %n", power);
    }

}
