package Pilot2;

/**
 * Created by PZON_SM on 10.07.2020.
 **/
public class DrzwiZamknij implements Polecenie {
    Drzwi drzwi;

    public DrzwiZamknij(Drzwi drzwi) {
        this.drzwi = drzwi;
    }

    @Override
    public void wykonaj() {
        drzwi.zamknij();
    }
}
