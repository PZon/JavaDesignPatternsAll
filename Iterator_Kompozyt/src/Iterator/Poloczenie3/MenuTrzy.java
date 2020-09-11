package Iterator.Poloczenie3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by PZON_SM on 31.07.2020.
 **/
public class MenuTrzy implements Menu {
    ArrayList menuPozycje;

    @Override
    public Iterator stworzPolaczenie() {
        return menuPozycje.iterator();
    }

    public ArrayList getMenuPozycje(){return menuPozycje;}

    public void dodajPozycjeMenu(String nazwa, String opis, boolean veggie, double cena){
        MenuSkladniki menuSkladniki = new MenuSkladniki(nazwa, opis, veggie, cena);
        menuPozycje.add(menuSkladniki);
    }

    public MenuTrzy(){
        menuPozycje = new ArrayList();
        dodajPozycjeMenu("trzyJeden", "opis: TrzyJeden", true, 3.1);
        dodajPozycjeMenu("trzyDwa", "opis: TrzyDwa", true, 3.2);
        dodajPozycjeMenu("trzyTrzy", "opis: TrzyTrzy", false, 3.3);
    }


}
