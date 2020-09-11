package Pilot2;

/**
 * Created by PZON_SM on 10.07.2020.
 **/
public class DemoPilot {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        Swiatlo swiatloDom = new Swiatlo(":Dom");
        Swiatlo swiatloGaraz = new Swiatlo(":Garaz");
        Klmatyzator klimatyzacja = new Klmatyzator(":Dom");
        Drzwi drzwiGaraz = new Drzwi(":Garaż");
        Drzwi drzwiDom = new Drzwi(":Dom");
        HiFi radio = new HiFi(":Dom");

        DrzwiOtworz garazDrzwiOtworz = new DrzwiOtworz(drzwiGaraz);
        DrzwiZamknij garazDrzwiZamknij = new DrzwiZamknij(drzwiGaraz);
        SwiatloWlacz garazZapalSwiatlo = new SwiatloWlacz(swiatloGaraz);
        SwiatloWylacz garazWylaczSwiatlo = new SwiatloWylacz(swiatloGaraz);
        DrzwiOtworz domDrzwiOtworz = new DrzwiOtworz(drzwiDom);
        DrzwiZamknij domDrzwiZamknij = new DrzwiZamknij(drzwiDom);
        SwiatloWlacz domZapalSwiatlo = new SwiatloWlacz(swiatloDom);
        SwiatloWylacz domWylaczSwiatlo = new SwiatloWylacz(swiatloDom);
        HiFiWlacz domRadioOn = new HiFiWlacz(radio);
        HiFiWylacz domRadioOff = new HiFiWylacz(radio);
        KlimaWlacz klimaOn = new KlimaWlacz(klimatyzacja);
        KlimaWylacz klimaOff = new KlimaWylacz(klimatyzacja);

        pilot.zaprogramujPilota(0, garazDrzwiOtworz,garazDrzwiZamknij);
        pilot.zaprogramujPilota(1,garazZapalSwiatlo,garazWylaczSwiatlo);
        pilot.zaprogramujPilota(2, domDrzwiOtworz,domDrzwiZamknij);
        pilot.zaprogramujPilota(3, domRadioOn,domRadioOff);
        pilot.zaprogramujPilota(4, klimaOn, klimaOff);
        pilot.zaprogramujPilota(5, domZapalSwiatlo,domWylaczSwiatlo);
        System.out.println(pilot);

        pilot.pressedWlacz(0);
        pilot.pressedWlacz(1);
        pilot.pressedWylacz(1);
        pilot.pressedWylacz(0);
        pilot.pressedWlacz(2);
        pilot.pressedWylacz(2);
        pilot.pressedWlacz(5);
        pilot.pressedWlacz(4);
        pilot.pressedWlacz(3);
    }
}
