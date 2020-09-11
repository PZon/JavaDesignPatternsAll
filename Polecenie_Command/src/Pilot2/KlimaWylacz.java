package Pilot2;

/**
 * Created by PZON_SM on 10.07.2020.
 **/
public class KlimaWylacz implements Polecenie {
    Klmatyzator klmatyzator;

    public KlimaWylacz(Klmatyzator klmatyzator) {
        this.klmatyzator = klmatyzator;
    }

    @Override
    public void wykonaj() {
        klmatyzator.wylacz();
    }
}
