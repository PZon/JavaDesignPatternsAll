package Iterator.Poloczenie3;

import java.util.Iterator;

/**
 * Created by PZON_SM on 27.07.2020.
 **/
public class MenuDwa implements Menu {
    MenuSkladniki[] pozycjaMenu;
    int iloscPozycji = 0;
    static final int MAX_POZYCJI = 3;

    public MenuDwa(){
        pozycjaMenu = new MenuSkladniki[MAX_POZYCJI];

        dodajPozycjeMenu("dwa_jeden", "opis dwa_jeden", false, 2.1);
        dodajPozycjeMenu("dwa_dwa", "opis dwa_dwa", true, 2.2);
        dodajPozycjeMenu("dwa_trzy", "opis dwa_trzy", false, 2.3);
    }

    public  void  dodajPozycjeMenu(String nazwa, String opis, boolean veggie, double cena){
        MenuSkladniki menuSkladniki = new MenuSkladniki(nazwa, opis, veggie, cena);
        if(iloscPozycji>=MAX_POZYCJI) System.out.println("ZA dużo pozycji w MENU");
        else{
           pozycjaMenu[iloscPozycji] = menuSkladniki;
           iloscPozycji++;
        }
    }

    public MenuSkladniki[] getPozycjaMenu() {
        return pozycjaMenu;
    }

    @Override
    public Iterator stworzPolaczenie() {
        return new MenuDwaItr(pozycjaMenu);
    }
}
