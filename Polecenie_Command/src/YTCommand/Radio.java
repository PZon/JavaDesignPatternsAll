package YTCommand;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class Radio implements Devices {
    private int volume;
    public Radio() {
        this.volume=0;
    }

    @Override
    public void on() {
        System.out.println("Radio is on");
    }

    @Override
    public void off() {
        System.out.println("Radio is off");
    }

    @Override
    public void up() {
        this.volume++;
        System.out.println("Radio volume up. Level: "+this.volume);
    }

    @Override
    public void down() {
        this.volume--;
        System.out.println("Radio volume up. Level: "+this.volume);
    }
}
