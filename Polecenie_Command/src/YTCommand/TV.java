package YTCommand;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class TV implements Devices {
    private int volume;
    public TV() {
        this.volume=0;
    }

    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }

    @Override
    public void up() {
        this.volume++;
        System.out.println("TV volume up. Level: "+this.volume);
    }

    @Override
    public void down() {
        this.volume--;
        System.out.println("TV volume up. Level: "+this.volume);
    }
}
