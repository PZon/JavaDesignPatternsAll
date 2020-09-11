package Iterator.Polaczenie1;

import java.util.Iterator;

/**
 * Created by PZON_SM on 23.07.2020.
 **/
public class MenuJeden implements Menu {
    static final int MAX_POSILKOW = 3;
    int iloscPosilkow=0;
    SkladMenu [] skladMenus;

    public MenuJeden(){
        skladMenus = new SkladMenu[MAX_POSILKOW];

        dodajPozycje("jeden", "opis 1 - vegie", true, 1.13);
        dodajPozycje("dwa", "opis dwa - nie vegie", false, 2.13);
        dodajPozycje("trzy", "opis 3 - nie vegie", false, 3.13);
        dodajPozycje("cztery", "czwrty opis- vegie", true, 4.13);
    }

    public SkladMenu[] getSkladMenus() {
        return skladMenus;
    }

    public void dodajPozycje(String nazwa, String opis, boolean veg, double cena){
        SkladMenu skladMenu = new SkladMenu(nazwa, opis, veg, cena);
        if(iloscPosilkow>=MAX_POSILKOW) System.out.println("MENU PELNE");
        else{
            skladMenus[iloscPosilkow] = skladMenu;
            iloscPosilkow+=1;
        }
    }

    @Override
    public Iterator stworzIterator() {
        return new SkladMenuIterator(skladMenus);
        //return new AltSkladMenuIterator(skladMenus);
    }
}
