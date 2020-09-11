package mementApp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class AppManager {
    private List<AppMemento> mementos = new ArrayList<>();

    public void addMemento(AppMemento appMemento){
        mementos.add(appMemento);
        System.out.println("Saved ver: "+ appMemento.getVersion()+", Index: "+(mementos.size()-1));
    }
    public AppMemento getMemento(int i){
        System.out.println("Loaded version: "+mementos.get(i).getVersion());
        return mementos.get(i);
    }
}
