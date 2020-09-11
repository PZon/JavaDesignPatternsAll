package SndAproach;


/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class EuToUkAdptr implements UkDev{
    EuDev euDev;

    public EuToUkAdptr(EuDev euDev) {
        this.euDev = euDev;
    }

    @Override
    public void ukPowOn() {
        euDev.euPowOn();
    }
}
