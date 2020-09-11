package Pilot3;

/**
 * Created by PZON_SM on 13.07.2020.
 **/
public class SwiatloWylacz implements Polecenie {
    Swiatlo swiatlo;
    int poprzedniPoziom;

    public SwiatloWylacz(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        poprzedniPoziom = swiatlo.getPoziom();
        swiatlo.wylaczSwiatlo();
    }

    @Override
    public void cofnij() {
        swiatlo.jasnosc(poprzedniPoziom);
    }
}
