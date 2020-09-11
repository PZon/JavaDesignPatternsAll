package Kompzyt.menuJeden;


/**
 * Created by PZON_SM on 04.08.2020.
 **/
public class menuJedenDemo {
    public static void main(String args[]){
        KomponentMenu menuJeden = new Menu("menu jeden", "opis menu jeden");
        KomponentMenu menuDwa = new Menu("menu dwa", "opis menu dwa");
        KomponentMenu menuTrzy = new Menu("menu trzy", "opis menu trzy");
        KomponentMenu wszystkieMenus = new Menu("Wszystkie posiłki", "opis do wszystkich posiłków");

        wszystkieMenus.dodaj(menuJeden);
        wszystkieMenus.dodaj(menuDwa);
        wszystkieMenus.dodaj(menuTrzy);

        menuJeden.dodaj(new PozycjaMenu("jeden jeden", "opis 11", 1.1, true));
        menuJeden.dodaj(new PozycjaMenu("jeden dwa", "opis jeden 2", 1.2, false));

        menuDwa.dodaj(new PozycjaMenu("dwa jeden", "opis dwa jeden", 2.1, false));
        menuDwa.dodaj(new PozycjaMenu("dwa dwa", "opis dwa dwa", 2.2, true));

        menuTrzy.dodaj(new PozycjaMenu("trzy jeden", "opis trzy jeden", 3.1, true));

        wszystkieMenus.dodaj(menuDwa);

        Kelner kelner = new Kelner(wszystkieMenus);
        kelner.drukujMenus();
    }
}
