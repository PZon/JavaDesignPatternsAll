package Pilot_1;

/**
 * Created by PZON_SM on 09.07.2020.
 **/
public class PolecenieWlacz implements Polecenie {
    Swiatlo swiatlo;

    public PolecenieWlacz(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonajPolecenie() {
        swiatlo.wlacz();
    }
}
