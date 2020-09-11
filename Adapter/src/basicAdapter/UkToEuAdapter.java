package basicAdapter;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class UkToEuAdapter implements EuDevice {
    UkRadio ukRadio;

    public UkToEuAdapter(UkRadio ukRadio) {
        this.ukRadio = ukRadio;
    }

    @Override
    public void powerOn() {
        ukRadio.powerOn();
    }
}
