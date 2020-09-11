package Iterator.Polaczenie2;

import java.util.ArrayList;

/**
 * Created by PZON_SM on 24.07.2020.
 **/
public class MenuJeden implements Menu {
    ArrayList pozycjeMenu;

    @Override
    public Iterator stworzIterator() {
        return new MenuJedenItr(pozycjeMenu);
    }

    public ArrayList getPozycjeMenu() {
        return pozycjeMenu;
    }

    public void dodajPozycjeMenu(String nazwa, String opis, boolean veggie, double cena){
        PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, veggie, cena);
        pozycjeMenu.add(pozycjaMenu);
    }

    public MenuJeden() {
        pozycjeMenu = new ArrayList();

        dodajPozycjeMenu("nazwa jeden", "opis jeden", true, 1.1);
        dodajPozycjeMenu("nazwa dwa", "opis dwa", true, 1.2);
        dodajPozycjeMenu("nazwa trzy", "opis trzy", false, 1.3);
    }
}
