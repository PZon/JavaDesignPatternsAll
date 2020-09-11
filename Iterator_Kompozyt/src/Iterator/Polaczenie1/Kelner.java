package Iterator.Polaczenie1;

import java.util.Iterator;

/**
 * Created by PZON_SM on 24.07.2020.
 **/
public class Kelner {
    Menu menuJeden;
    Menu menuDwa;

    public Kelner(Menu menuJeden, Menu menuDwa) {
        this.menuJeden = menuJeden;
        this.menuDwa = menuDwa;
    }

    public void wydrukMenu(){
        Iterator jedenIterator = menuJeden.stworzIterator();
        Iterator dwaItereator = menuDwa.stworzIterator();

        System.out.println("MENU\n ----- \n Jeden");
        wydrukMenu(jedenIterator);
        System.out.println("\nDwa");
        wydrukMenu(dwaItereator);
    }

    private void wydrukMenu(Iterator iterator){
        while (iterator.hasNext()){
            SkladMenu skladMenu = (SkladMenu)iterator.next();
            System.out.print(skladMenu.getMenu() + ", ");
            System.out.print(skladMenu.getCena() + " -- ");
            System.out.print(skladMenu.getOpis()+"\n");
        }
    }

    public void wydrukVeggieMenu(){
        System.out.println("\nMENU WEGETARIAŃSKIE\n ----- \n Jeden");
        wydrukVeggieMenu(menuJeden.stworzIterator());
        System.out.println(" \n Dwa\n");
        wydrukVeggieMenu(menuDwa.stworzIterator());
    }

    private void wydrukVeggieMenu(Iterator iterator){
        while (iterator.hasNext()){
            SkladMenu skladMenu = (SkladMenu)iterator.next();
            if(skladMenu.isVegetaianska()){
                System.out.println(skladMenu.getMenu());
                System.out.println("\t\t"+ skladMenu.getCena());
                System.out.println("\t"+ skladMenu.getOpis());
            }
        }
    }

    private boolean isVeggie(String nazwa, Iterator iterator){
        while (iterator.hasNext()){
            SkladMenu skladMenu = (SkladMenu)iterator.next();
            if(skladMenu.getMenu().equals(nazwa)){
                if(skladMenu.isVegetaianska()){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isZamowienieVeggie(String nazwa){
        Iterator jedenItr = menuJeden.stworzIterator();
        Iterator dwaItr = menuDwa.stworzIterator();
        if(isVeggie(nazwa, jedenItr)) return  true;
        if(isVeggie(nazwa, dwaItr)) return true;
        return false;
    }
}
