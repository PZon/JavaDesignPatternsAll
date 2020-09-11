package Ptaki;

/**
 * Created by PZON_SM on 16.07.2020.
 **/
public class KaczkaDemo {
    public static void main(String[] args) {
        KaczkaDomowa kaczkaDomowa = new KaczkaDomowa();
        IndykDomowy indykDomowy = new IndykDomowy();
        Kaczka indykAdapter = new IndykAdapter(indykDomowy);

        System.out.println(" Indyk dzwiek: ...........");
        indykDomowy.dziwekI();
        indykDomowy.lot();

        System.out.println(" Kaczka dzwiek: ...........");
        testKaczka(kaczkaDomowa);

        System.out.println(" IndykAdapter dzwiek: ...........");
        testKaczka(indykAdapter);
    }

    static void testKaczka(Kaczka kaczka){
        kaczka.dzwiek();
        kaczka.lot();
    }
}
