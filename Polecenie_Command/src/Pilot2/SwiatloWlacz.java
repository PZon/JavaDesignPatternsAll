package Pilot2;

/**
 * Created by PZON_SM on 10.07.2020.
 **/
public class SwiatloWlacz implements Polecenie {
    Swiatlo swiatlo;

    public SwiatloWlacz(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        swiatlo.wlacz();
    }
}
