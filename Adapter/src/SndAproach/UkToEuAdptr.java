package SndAproach;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class UkToEuAdptr implements EuDev {
    UkDev ukDev;

    public UkToEuAdptr(UkDev ukDev) {
        this.ukDev = ukDev;
    }

    @Override
    public void euPowOn() {
        ukDev.ukPowOn();
    }
}
