/**
 * Created by PZON_SM on 20.07.2020.
 **/
public class Tuner {
    String opis;
    TunerDvdCd tunerDvdCd;
    double czestotliwosc;

    public Tuner(String opis, TunerDvdCd tunerDvdCd) {
        this.opis = opis;
    }

    public void wlacz(){
        System.out.println(opis + "wlczony");
    }

    public void wylacz(){
        System.out.println(opis + "wylczony");
    }

    public void setCzestotliwosc(double czestotliwosc) {
        System.out.println(opis+" ustawona na wartosc: "+czestotliwosc);
        this.czestotliwosc = czestotliwosc;
    }

    public String przeksztalcTxt(){
        return opis;
    }
}
