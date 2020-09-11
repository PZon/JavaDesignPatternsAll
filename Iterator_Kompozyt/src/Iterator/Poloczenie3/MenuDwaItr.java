package Iterator.Poloczenie3;


import java.util.Iterator;

/**
 * Created by PZON_SM on 27.07.2020.
 **/
public class MenuDwaItr implements Iterator {
    MenuSkladniki[] pozycjeMenu;
    int pozycja = 0;

    public MenuDwaItr(MenuSkladniki[] pozycjeMenu) {
        this.pozycjeMenu = pozycjeMenu;
    }

    @Override
    public void remove() {
        if(pozycja<=0){
            throw new IllegalStateException("nie możesz usunąc tej pozycji");
        }
        if(pozycjeMenu[pozycja-1] != null){
            for(int i = pozycja - 1; i<(pozycjeMenu.length-1); i++){
                pozycjeMenu[i]=pozycjeMenu[i+1];
            }
            pozycjeMenu[pozycjeMenu.length-1]=null;
        }
    }

    @Override
    public boolean hasNext() {
        if(pozycja>=pozycjeMenu.length || pozycjeMenu[pozycja] == null) return false;
        else return true;

    }

    @Override
    public Object next() {
        MenuSkladniki pozycjaMenu = pozycjeMenu[pozycja];
        pozycja++;
        return pozycjaMenu;
    }
}
