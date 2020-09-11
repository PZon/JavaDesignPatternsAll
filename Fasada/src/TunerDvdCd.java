/**
 * Created by PZON_SM on 20.07.2020.
 **/
public class TunerDvdCd {
    String opis;
    Tuner tuner;
    Dvd dvd;
    Cd cd;

    public TunerDvdCd(String opis) {
        this.opis = opis;
    }

    public void wlacz(){
        System.out.println(opis + "wlczony");
    }

    public void wylacz(){
        System.out.println(opis + "wylczony");
    }

    public void regulujGlosnosc(int poziom){
        System.out.println(opis+ " głośność ustwiona na poziom: "+poziom+"%");
    }

    public void setDvd(Dvd dvd) {
        System.out.println(opis + " ustawiono DVD na: " + dvd);
        this.dvd = dvd;
    }

    public void setCd(Cd cd) {
        System.out.println(opis+ "  ustawiono DVD na:  " + cd);
        this.cd = cd;
    }

    public void setTuner(Tuner tuner) {
        System.out.println(opis+ "  ustawiono tuner na:  " + cd);
        this.tuner = tuner;
    }

    public String przeksztalcTxt(){
        return opis;
    }
}
