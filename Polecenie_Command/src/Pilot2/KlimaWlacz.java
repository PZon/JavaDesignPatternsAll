package Pilot2;

/**
 * Created by PZON_SM on 10.07.2020.
 **/
public class KlimaWlacz implements Polecenie{
    Klmatyzator klmatyzator;

    public KlimaWlacz(Klmatyzator klmatyzator) {
        this.klmatyzator = klmatyzator;
    }

    @Override
    public void wykonaj() {
        klmatyzator.wlacz();
    }
}
