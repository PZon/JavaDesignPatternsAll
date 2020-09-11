package Pilot_1;

/**
 * Created by PZON_SM on 09.07.2020.
 **/
public class PolecenieUchyl implements Polecenie {
    Okno okno;

    public PolecenieUchyl(Okno okno) {
        this.okno = okno;
    }


    @Override
    public void wykonajPolecenie() {
        okno.uchyl();
    }
}
