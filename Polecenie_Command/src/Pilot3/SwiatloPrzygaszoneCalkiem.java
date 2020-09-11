package Pilot3;

/**
 * Created by PZON_SM on 13.07.2020.
 **/
public class SwiatloPrzygaszoneCalkiem implements Polecenie {
    Swiatlo swiatlo;
    int poprzedniPoziom;

    public SwiatloPrzygaszoneCalkiem(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        poprzedniPoziom = swiatlo.getPoziom();
        swiatlo.jasnosc(50);
    }

    @Override
    public void cofnij() {
        swiatlo.jasnosc(poprzedniPoziom);
    }
}
