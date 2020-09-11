package Pilot_1;

/**
 * Created by PZON_SM on 09.07.2020.
 **/
public class PolecenieZamknij implements Polecenie {
    Okno okno;

    public PolecenieZamknij(Okno okno) {
        this.okno = okno;
    }

    @Override
    public void wykonajPolecenie() {
        okno.zamknij();
    }
}
