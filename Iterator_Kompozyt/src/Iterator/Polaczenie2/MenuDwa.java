package Iterator.Polaczenie2;

/**
 * Created by PZON_SM on 24.07.2020.
 **/
public class MenuDwa implements Menu {
    static final int MAX_POZYCJI =4;
     int pozycja = 0;
     PozycjaMenu[] pozycjeMenu;

    @Override
    public Iterator stworzIterator() {
        return new MenuDwaItr(pozycjeMenu);
    }

    public PozycjaMenu[] getPozycjeMenu() {
        return pozycjeMenu;
    }

    public void dodajPozycje(String nazwa, String opis, boolean veggie, double cena){
        PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, veggie, cena);
        if(pozycja>= MAX_POZYCJI) System.out.println("Lista Pełna!!!");
        else pozycjeMenu[pozycja] = pozycjaMenu;
        pozycja++;
    }

    public MenuDwa() {
        pozycjeMenu = new PozycjaMenu[MAX_POZYCJI];

        dodajPozycje("nazwa dwa jeden", "opis 21", false, 2.1);
        dodajPozycje("nazwa dwa dwa", "opis 22", true, 2.2);
        dodajPozycje("nazwa dwa trzy", "opis 23", false, 2.3);
        dodajPozycje("nazwa dwa cztery", "opis 24", true, 2.4);
    }
}
