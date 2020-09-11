package Iterator.Poloczenie3;

/**
 * Created by PZON_SM on 31.07.2020.
 **/
/*public class Kelner {
    Menu menuJeden;
    Menu menuDwa;
    Menu menuTrzy;

    public Kelner(Menu menuJeden, Menu menuDwa, Menu menuTrzy) {
        this.menuJeden = menuJeden;
        this.menuDwa = menuDwa;
        this.menuTrzy = menuTrzy;
    }

    public void wydrukMenu(){
        Iterator menuJeden = menuJeden.stworzPolaczenie();
        Iterator menuDwa = menuDwa.stworzPolaczenie();
        Iterator menuTrzy = menuTrzy.stworzPolaczenie();

        System.out.println("MENU\n----\nMENU JEDEN");
        wydrukMenu(menuJeden);
        System.out.println("\nMENU DWA");
        wydrukMenu(menuDwa);
        System.out.println("\nMENU TRZY");
        wydrukMenu(menuTrzy);
    }

    private void wydrukMenu(Iterator iterator){
        while (iterator.hasNext()) {
            MenuSkladniki menuSkladniki = (MenuSkladniki) iterator.next();
            System.out.print(menuSkladniki.getNazwa() + ", ");
            System.out.print(menuSkladniki.getCena() + " -- ");
            System.out.print(menuSkladniki.getOpis());
        }
    }

    public void wydrukVeggieMenu(){
        System.out.println("\nMENU WEGETARIAŃSKIE\n-------------------------");
        wydrukVeggieMenu(menuJeden.stworzPolaczenie());
        wydrukVeggieMenu(menuDwa.stworzPolaczenie());
        wydrukVeggieMenu(menuTrzy.stworzPolaczenie());
    }

    private void wydrukVeggieMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuSkladniki menuSkladniki=(MenuSkladniki)iterator.next();
            if(menuSkladniki.isVeggie()){
                System.out.print(menuSkladniki.getNazwa() + ", ");
                System.out.print(menuSkladniki.getCena() + " -- ");
                System.out.print(menuSkladniki.getOpis());
            }
        }
    }

    public boolean isMenuVeggie(String nazwa){
        Iterator jedenItr = menuJeden.stworzPolaczenie();
        if(isVeggie(nazwa, jedenItr)) return true;
        Iterator dwaItr = menuDwa.stworzPolaczenie();
        if(isVeggie(nazwa,dwaItr)) return true;
        Iterator trzyItr = menuTrzy.stworzPolaczenie();
        if(isVeggie(nazwa,trzyItr)) return true;

        return false;
    }

    private boolean isVeggie(String nazwa, Iterator iterator){
        while (iterator.hasNext()){
            MenuSkladniki menuSkladniki = (MenuSkladniki)iterator.next();
            if(menuSkladniki.getNazwa().equals(nazwa)){
                if(menuSkladniki.isVeggie()){
                    return true;
                }
            }
        }
        return false;
    }
}
*/