package Iterator.Poloczenie3;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by PZON_SM on 27.07.2020.
 **/
public class MenuJeden implements Menu{
    Hashtable pozycjaMenu = new Hashtable();

    public MenuJeden(){
        dodajPozycjeMenu("jeden jeden", "opis 11", true, 1.11);
        dodajPozycjeMenu("jeden dwa", "opis 12", true, 1.12);
        dodajPozycjeMenu("jeden trzy", "opis 13", true, 1.13);

    }

    public void dodajPozycjeMenu(String nazwa, String opis, boolean veggie, double cena){
        MenuSkladniki menuSkladniki = new MenuSkladniki(nazwa,opis, veggie, cena);
        pozycjaMenu.put(menuSkladniki.getNazwa(), menuSkladniki);
    }

    public Hashtable getPozycjaMenu() {
        return pozycjaMenu;
    }

    @Override
    public Iterator stworzPolaczenie() {
       return pozycjaMenu.values().iterator();
    }
}
