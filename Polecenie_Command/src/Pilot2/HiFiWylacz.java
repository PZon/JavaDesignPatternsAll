package Pilot2;

/**
 * Created by PZON_SM on 10.07.2020.
 **/
public class HiFiWylacz implements Polecenie {
    HiFi hiFi;

    public HiFiWylacz(HiFi hiFi) {
        this.hiFi = hiFi;
    }

    @Override
    public void wykonaj() {
        hiFi.wylacz();
    }
}
