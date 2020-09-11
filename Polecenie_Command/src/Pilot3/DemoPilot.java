package Pilot3;

/**
 * Created by PZON_SM on 15.07.2020.
 **/
public class DemoPilot {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        Swiatlo kuchniaSwiatlo = new Swiatlo("kuchnia: ");
        SwiatloWlacz kuchniaSwiatloWlacz = new SwiatloWlacz(kuchniaSwiatlo);
        SwiatloPrzygaszoneTroszke kuchniaSwiatloPrzygaszoneTroche = new SwiatloPrzygaszoneTroszke(kuchniaSwiatlo);
        SwiatloPrzygaszoneCalkiem kuchniaPrzygaszoneCalkiem = new SwiatloPrzygaszoneCalkiem(kuchniaSwiatlo);
        SwiatloWylacz kuchniaSwiatloWylacz = new SwiatloWylacz(kuchniaSwiatlo);

        pilot.ustawPolecenie(0,kuchniaSwiatloWlacz, kuchniaSwiatloWylacz);
        pilot.ustawPolecenie(1,kuchniaSwiatloPrzygaszoneTroche,kuchniaSwiatloWylacz);
        pilot.ustawPolecenie(2, kuchniaPrzygaszoneCalkiem, kuchniaSwiatloWylacz);

        pilot.wcisnietoPrzyciskWlacz(0);
        pilot.wcisnietoPrzyciskCofnij();
        pilot.wcisnietoPrzyciskWlacz(1);
        pilot.wcisnietoPrzyciskWlacz(2);
        pilot.wcisnietoPrzyciskCofnij();
        pilot.wcisnietoPrzyciskWylacz(2);

    }
}
