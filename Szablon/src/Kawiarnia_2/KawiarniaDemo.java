package Kawiarnia_2;

/**
 * Created by PZON_SM on 22.07.2020.
 **/
public class KawiarniaDemo {
    public static void main(String[] args) {
        PrzepisNaNapoj herbata = new Herbata();
        HerbataExtras herbataExtras = new HerbataExtras();
        Kawa kawa = new Kawa();
        KawaExtras kawaExtras = new KawaExtras();

        herbata.przygotujNapoj();
        kawaExtras.przygotujNapoj();
        kawa.przygotujNapoj();
        kawaExtras.przygotujNapoj();
    }
}
