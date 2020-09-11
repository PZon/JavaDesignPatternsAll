package YTCommandBefore;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class Radio implements Device {
    private int volume=0;

    @Override
    public void on() {
        System.out.println("radio is on");
    }

    @Override
    public void off() {
        System.out.println("radio is off");
    }

    @Override
    public void up() {
        volume++;
        System.out.println("radio volume up. Level: "+volume);
    }

    @Override
    public void down() {
        volume--;
        System.out.println("radio volume down. Level: "+volume);
    }
}
