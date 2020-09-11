package YTCommandBefore;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class Tv implements Device {
    private int volume=0;

    @Override
    public void on() {
        System.out.println("tv is on");
    }

    @Override
    public void off() {
        System.out.println("tv is off");
    }

    @Override
    public void up() {
        volume++;
        System.out.println("tv volume up. Level: "+volume);
    }

    @Override
    public void down() {
        volume--;
        System.out.println("tv volume down. Level: "+volume);
    }
}
