package Iterator.Polaczenie1;

import java.util.Iterator;

/**
 * Created by PZON_SM on 23.07.2020.
 **/
public class SkladMenuIterator implements Iterator {
    SkladMenu[] list;
    int pozycja =0;

    public SkladMenuIterator(SkladMenu[] list) {
        this.list = list;
    }

    @Override
    public void remove() {
        if(pozycja<=0){
            throw new IllegalStateException("Nie masz nic do usówania");
        }

        if(list[pozycja-1] != null){
            for(int i = pozycja-1; i<(list.length-1); i++){
                list[i]=list[i+1];
            }
            list[list.length-1]=null;
        }
    }

    @Override
    public boolean hasNext() {
        if(pozycja>=list.length || list[pozycja] == null) return false;
        else return true;
    }

    @Override
    public Object next(){
        SkladMenu skladMenu = list[pozycja];
        pozycja++;
        return skladMenu;
    }
}
