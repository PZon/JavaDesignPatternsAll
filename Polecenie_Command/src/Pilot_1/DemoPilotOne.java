package Pilot_1;

/**
 * Created by PZON_SM on 09.07.2020.
 **/
public class DemoPilotOne {
    public static void main(String[] args) {
        PilotOne pilot = new PilotOne();
        Okno okno = new Okno();
        Swiatlo swiatlo = new Swiatlo();

        PolecenieOtworz otworzOkno = new PolecenieOtworz(okno);
        PolecenieUchyl uchylOkno = new PolecenieUchyl(okno);
        PolecenieZamknij zaknijOkno = new PolecenieZamknij(okno);

        PolecenieWlacz wlaczSwiatlo = new PolecenieWlacz(swiatlo);
        PolecenieWylacz wylaczSwiatlo = new PolecenieWylacz(swiatlo);

        pilot.odbierzPolecenie(wlaczSwiatlo);
        pilot.wykonajOdebranePolecenie();
        pilot.odbierzPolecenie(wylaczSwiatlo);
        pilot.wykonajOdebranePolecenie();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        pilot.odbierzPolecenie(otworzOkno);
        pilot.wykonajOdebranePolecenie();
        pilot.odbierzPolecenie(uchylOkno);
        pilot.wykonajOdebranePolecenie();
        pilot.odbierzPolecenie(zaknijOkno);
        pilot.wykonajOdebranePolecenie();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
