/**
 * Created by PZON_SM on 21.07.2020.
 **/
public class KinoDomoweDemo {
    public static void main(String[] args) {
        TunerDvdCd tunerDvdCd = new TunerDvdCd("Wieża HiFi ");
        Tuner tuner= new Tuner("Radio ",tunerDvdCd);
        Dvd dvd=new Dvd("Odtwarzacz Dvd ", tunerDvdCd);
        Cd cd= new Cd("Odtwarzacz Cd ", tunerDvdCd);
        MaszynaDoPopkornu maszynaDoPopkornu = new MaszynaDoPopkornu("Popcorn ");
        Oswietlenie oswietlenie=new Oswietlenie("Oswietlenie KD ");
        Ekran ekran=new Ekran("Ekran ");
        Projektor projektor=new Projektor("Projektor ");

        KinoDomowe kinoDomowe=new KinoDomowe(tunerDvdCd,tuner,dvd,cd,maszynaDoPopkornu,oswietlenie,ekran,projektor);

        kinoDomowe.ogladajFilm("Bohemian Rapsody");
        kinoDomowe.koniecFilma();
    }
}
