package Pilot3;

/**
 * Created by PZON_SM on 13.07.2020.
 **/
public class SwiatloWlacz implements Polecenie {
    Swiatlo swiatlo;
    int poprzeniPoziom;

    public SwiatloWlacz(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        poprzeniPoziom = swiatlo.getPoziom();
        swiatlo.wlaczSwiatlo();
    }

    @Override
    public void cofnij() {
        swiatlo.jasnosc(poprzeniPoziom);
    }
}
