package Iterator.Polaczenie2;

/**
 * Created by PZON_SM on 24.07.2020.
 **/
public class MenuDwaItr implements Iterator {
    PozycjaMenu[] pozycjeMenu;
    int pozycja = 0;

    public MenuDwaItr(PozycjaMenu[] pozycjaMenu) {
        this.pozycjeMenu = pozycjaMenu;
    }

    @Override
    public boolean hasNext() {
        if(pozycja >= pozycjeMenu.length || pozycjeMenu[pozycja] == null) return false;
        else return true;
    }

    @Override
    public Object next() {
        PozycjaMenu pozycjaMenu = pozycjeMenu[pozycja];
        pozycja++;
        return pozycjaMenu;
    }
}
