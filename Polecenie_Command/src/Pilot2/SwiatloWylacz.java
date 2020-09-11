package Pilot2;

/**
 * Created by PZON_SM on 10.07.2020.
 **/
public class SwiatloWylacz implements Polecenie {
    Swiatlo swiatlo;

    public SwiatloWylacz(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        swiatlo.wylacz();
    }
}
