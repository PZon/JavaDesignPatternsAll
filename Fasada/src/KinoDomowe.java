/**
 * Created by PZON_SM on 21.07.2020.
 **/
public class KinoDomowe {
    TunerDvdCd tunerDvdCd;
    Tuner tuner;
    Dvd dvd;
    Cd cd;
    MaszynaDoPopkornu maszynaDoPopkornu;
    Oswietlenie oswietlenie;
    Ekran ekran;
    Projektor projektor;

    public KinoDomowe(TunerDvdCd tunerDvdCd, Tuner tuner, Dvd dvd, Cd cd, MaszynaDoPopkornu maszynaDoPopkornu, Oswietlenie oswietlenie, Ekran ekran, Projektor projektor) {
        this.tunerDvdCd = tunerDvdCd;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.maszynaDoPopkornu = maszynaDoPopkornu;
        this.oswietlenie = oswietlenie;
        this.ekran = ekran;
        this.projektor = projektor;
    }

    public void ogladajFilm(String tytul){
        System.out.println("Zaraz rozpocznie się film: "+tytul);
        maszynaDoPopkornu.wlacz();
        maszynaDoPopkornu.robiSie();
        oswietlenie.przyciemnianie(25);
        ekran.rozwin();
        projektor.wlacz();
        tunerDvdCd.wlacz();
        tunerDvdCd.regulujGlosnosc(50);
        dvd.wlacz();
        dvd.play(5,"Soundtrack");
    }

    public void koniecFilma(){
        System.out.println("\n Wyłączanie kina domowego ...");
        dvd.wylacz();
        tunerDvdCd.wylacz();
        ekran.zwin();
        oswietlenie.przyciemnianie(0);
        maszynaDoPopkornu.wylacz();
    }
}
