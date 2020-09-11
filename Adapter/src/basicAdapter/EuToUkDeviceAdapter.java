package basicAdapter;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class EuToUkDeviceAdapter implements UkDevice {
    EuRadio euRadio;

    public EuToUkDeviceAdapter(EuRadio euRadio) {
        this.euRadio = euRadio;
    }

    @Override
    public void powerOn() {
        euRadio.powerOn();
    }
}
