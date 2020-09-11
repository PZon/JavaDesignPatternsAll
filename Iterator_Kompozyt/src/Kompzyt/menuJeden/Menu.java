package Kompzyt.menuJeden;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by PZON_SM on 03.08.2020.
 **/
public class Menu extends KomponentMenu{
    ArrayList komponentyMenu = new ArrayList();
    String nazwa;
    String opis;

    public Menu(String nazwa, String opis) {
        this.nazwa = nazwa;
        this.opis = opis;
    }

    public void dodaj(KomponentMenu komponentMenu){
        komponentyMenu.add(komponentMenu);
    }

    public void usun(KomponentMenu komponentMenu){
        komponentyMenu.remove(komponentMenu);
    }

    public KomponentMenu getChild(int i){
        return (KomponentMenu)komponentyMenu.get(i);
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String getOpis() {
        return opis;
    }

    public void wydruk() {
        System.out.print("\n"+ getNazwa());
        System.out.println(", "+ getOpis());
        System.out.println("-------------------------");
        Iterator iterator = komponentyMenu.iterator();
        while (iterator.hasNext()) {
            KomponentMenu komponentMenu = (KomponentMenu)iterator.next();
            komponentMenu.wydruk();
        }
    }
}
