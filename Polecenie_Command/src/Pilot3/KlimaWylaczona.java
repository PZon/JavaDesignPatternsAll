package Pilot3;

/**
 * Created by PZON_SM on 13.07.2020.
 **/
public class KlimaWylaczona implements Polecenie {
    Klimatyzacja klimatyzacja;
    int poprzedniaMoc;

    public KlimaWylaczona(Klimatyzacja klimatyzacja) {
        this.klimatyzacja = klimatyzacja;
    }


    @Override
    public void wykonaj() {
        poprzedniaMoc = klimatyzacja.getMoc();
        klimatyzacja.wylaczony();
    }

    public void cofnij() {
        if(poprzedniaMoc == klimatyzacja.WYSOKI) klimatyzacja.wysoki();
        else if(poprzedniaMoc == klimatyzacja.SREDNI) klimatyzacja.sredni();
        else if(poprzedniaMoc==klimatyzacja.NISKI) klimatyzacja.niski();
        else if(poprzedniaMoc == klimatyzacja.WYLACZONY) klimatyzacja.wylaczony();
    }
}
