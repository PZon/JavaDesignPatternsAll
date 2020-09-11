package Kawiarnia_1;

/**
 * Created by PZON_SM on 21.07.2020.
 **/
public class KawiarniaDemo {
    public static void main(String[] args) {
        Herbata herbata = new Herbata();
        Kawa kawa = new Kawa();

        System.out.println("Robie herbate...");
        herbata.przygotowanieHerbaty(0);
        System.out.println("\n Robie Kawe...");
        kawa.przygotowanieKawy(1);
    }
}
