package basicAdapter;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class UsToEuAdapter implements EuDevice {
    USRadio usRadio;

    public UsToEuAdapter(USRadio usRadio) {
        this.usRadio = usRadio;
    }

    @Override
    public void powerOn() {
        usRadio.powerOn();
    }
}
