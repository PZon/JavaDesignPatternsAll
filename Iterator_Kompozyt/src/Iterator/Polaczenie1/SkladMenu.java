package Iterator.Polaczenie1;

/**
 * Created by PZON_SM on 23.07.2020.
 **/
public class SkladMenu {
    String menu;
    String opis;
    boolean vegetaianska;
    double cena;

    public SkladMenu(String menu, String opis, boolean vegetaianska, double cena) {
        this.menu = menu;
        this.opis = opis;
        this.vegetaianska = vegetaianska;
        this.cena = cena;
    }

    public String getMenu() {
        return menu;
    }

    public String getOpis() {
        return opis;
    }

    public boolean isVegetaianska() {
        return vegetaianska;
    }

    public double getCena() {
        return cena;
    }
}
