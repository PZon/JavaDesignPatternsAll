package Pilot2;

/**
 * Created by PZON_SM on 10.07.2020.
 **/
public class HiFiWlacz implements Polecenie {
    HiFi hiFi;

    public HiFiWlacz(HiFi hiFi) {
        this.hiFi = hiFi;
    }

    @Override
    public void wykonaj() {
        hiFi.wlacz();
    }
}
