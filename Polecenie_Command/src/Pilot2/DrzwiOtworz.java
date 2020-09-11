package Pilot2;

/**
 * Created by PZON_SM on 10.07.2020.
 **/
public class DrzwiOtworz implements Polecenie{
    Drzwi drzwi;

    public DrzwiOtworz(Drzwi drzwi) {
        this.drzwi = drzwi;
    }

    @Override
    public void wykonaj() {
        drzwi.otworz();
    }
}
