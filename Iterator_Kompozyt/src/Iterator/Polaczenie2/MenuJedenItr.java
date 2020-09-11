package Iterator.Polaczenie2;

import java.util.ArrayList;

/**
 * Created by PZON_SM on 24.07.2020.
 **/
public class MenuJedenItr implements Iterator {
    ArrayList lista;
    int pozycja=0;

    public MenuJedenItr(ArrayList lista) {
        this.lista = lista;
    }

    @Override
    public boolean hasNext() {
        if(pozycja>=lista.size()) return false;
        else return true;
    }

    @Override
    public Object next() {
        Object object = lista.get(pozycja);
        pozycja++;
        return object;
    }
}
