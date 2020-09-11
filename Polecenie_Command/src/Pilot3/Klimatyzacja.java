package Pilot3;

/**
 * Created by PZON_SM on 13.07.2020.
 **/
public class Klimatyzacja {
    public static final int WYSOKI = 3;
    public static final int SREDNI = 2;
    public static final int NISKI = 1;
    public static final int WYLACZONY = 0;
    String gdzie;
    int moc;

    public Klimatyzacja(String gdzie) {
        this.gdzie = gdzie;
        moc = WYLACZONY;
    }

    public void wysoki(){
        moc = WYSOKI;
        System.out.println(gdzie + "siła klimatyzacji : wysoka");
    }

    public void sredni(){
        moc = SREDNI;
        System.out.println(gdzie + "siła klimatyzacji : srednia");
    }

    public void niski(){
        moc = NISKI;
        System.out.println(gdzie + "siła klimatyzacji : Niska");
    }

    public void wylaczony(){
        moc = WYLACZONY;
        System.out.println(gdzie + "siła klimatyzacji : wylaczona");
    }

    public int getMoc(){
        return moc;
    }
}


