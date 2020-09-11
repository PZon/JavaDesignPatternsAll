package Pilot3;

/**
 * Created by PZON_SM on 13.07.2020.
 **/
public class SwiatloPrzygaszoneTroszke implements Polecenie {
    Swiatlo swiatlo;
    int poprzedniPoziom;

    public SwiatloPrzygaszoneTroszke(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        poprzedniPoziom = swiatlo.getPoziom();
        swiatlo.jasnosc(75);
    }

    @Override
    public void cofnij() {
        swiatlo.jasnosc(poprzedniPoziom);
    }
}
