package YTCommandBefore;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class RadioManager  {
    private Radio radio;

    public RadioManager(Radio radio) {
        this.radio = radio;
    }

    public void execute(){
        radio.on();
        radio.up();
        radio.up();
        radio.down();
        radio.off();
    }
}
