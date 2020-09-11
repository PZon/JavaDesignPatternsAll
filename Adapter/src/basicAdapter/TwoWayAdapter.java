package basicAdapter;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class TwoWayAdapter implements EuDevice, UkDevice, USDevice {
    USRadio usRadio;
    UkRadio ukRadio;
    EuRadio euRadio;

    public TwoWayAdapter(USRadio usRadio, UkRadio ukRadio, EuRadio euRadio) {
        this.usRadio = usRadio;
        this.ukRadio = ukRadio;
        this.euRadio = euRadio;
    }

    @Override
    public void powerOn() {
        usRadio.powerOn();
        ukRadio.powerOn();
        euRadio.powerOn();
    }
}
