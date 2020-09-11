package Kompzyt.menuJeden;

/**
 * Created by PZON_SM on 04.08.2020.
 **/
public class Kelner {
    KomponentMenu wszystkieMenus;

    public Kelner(KomponentMenu wszystkieMenus) {
        this.wszystkieMenus = wszystkieMenus;
    }

    public void drukujMenus(){
        wszystkieMenus.wydruk();
    }
}
