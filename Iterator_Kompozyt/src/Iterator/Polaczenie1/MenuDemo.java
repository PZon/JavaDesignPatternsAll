package Iterator.Polaczenie1;

/**
 * Created by PZON_SM on 24.07.2020.
 **/
public class MenuDemo {
    public static void main(String args[]) {
        MenuJeden menuJeden = new MenuJeden();
        MenuDwa menuDwa = new MenuDwa();
        Kelner kelner = new Kelner(menuJeden,menuDwa);

        kelner.wydrukMenu();
        kelner.wydrukVeggieMenu();

        if(kelner.isZamowienieVeggie("dwaJeden")) System.out.println("Jest Veggie !!!");
        else System.out.println("Nie jest Veggie !!!");

        if(kelner.isZamowienieVeggie("jeden")) System.out.println("Jest Veggie !!!");
        else System.out.println("Nie jest Veggie !!!");
    }
}
