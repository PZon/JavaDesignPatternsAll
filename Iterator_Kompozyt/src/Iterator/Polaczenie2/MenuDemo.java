package Iterator.Polaczenie2;

/**
 * Created by PZON_SM on 24.07.2020.
 **/
public class MenuDemo {
    public static void main(String args[]) {
        MenuJeden menuJeden = new MenuJeden();
        MenuDwa menuDwa = new MenuDwa();

        Kelner kelner = new Kelner(menuJeden, menuDwa);
        kelner.drukujMenu();
    }
}
