package Iterator.Polaczenie1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by PZON_SM on 24.07.2020.
 **/
public class MenuDwa implements Menu {
    ArrayList menuPozycje;

    @Override
    public Iterator stworzIterator() {
        return menuPozycje.iterator();
    }

    public ArrayList getMenuItems() {
        return menuPozycje;
    }

    public void dodajPozycje(String nazwa, String opis, boolean vegie, double cena){
        SkladMenu menuPozycja = new SkladMenu( nazwa, opis, vegie, cena);
        menuPozycje.add(menuPozycja);
    }

    public MenuDwa(){
        menuPozycje = new ArrayList();
        dodajPozycje("dwaJeden", "opis 21", true, 21.13);
        dodajPozycje("dwaDwa", "opis 22", false, 20.11);
        dodajPozycje("dwaTrzy", "opis 23", true, 13.13);
        dodajPozycje("dwaCztery", "opis 24", false, 1.45);
    }
}
