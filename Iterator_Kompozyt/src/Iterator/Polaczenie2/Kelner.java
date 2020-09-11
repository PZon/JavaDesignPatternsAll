package Iterator.Polaczenie2;

/**
 * Created by PZON_SM on 24.07.2020.
 **/
public class Kelner {
    MenuJeden menuJeden;
    MenuDwa menuDwa;

    public Kelner(MenuJeden menuJeden, MenuDwa menuDwa) {
        this.menuJeden = menuJeden;
        this.menuDwa = menuDwa;
    }

    public void drukujMenu(){
        Iterator jedenItr = menuJeden.stworzIterator();
        Iterator dwaItr = menuDwa.stworzIterator();

        System.out.println("MENU\n --- \n lista 1");
        prvDrukujMenu(jedenItr);
        System.out.println("lista 2\n");
        prvDrukujMenu(dwaItr);
    }

    private void prvDrukujMenu(Iterator iterator){
        while (iterator.hasNext()){
            PozycjaMenu pozycjaMenu = (PozycjaMenu)iterator.next();
            System.out.print(pozycjaMenu.getNazwa()+"; ");
            System.out.print(pozycjaMenu.getCena()+" - ");
            System.out.print(pozycjaMenu.getOpis()+"\n");
        }
    }


}
