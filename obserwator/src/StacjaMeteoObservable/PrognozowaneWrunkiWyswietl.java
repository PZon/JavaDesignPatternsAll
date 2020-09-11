package StacjaMeteoObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by PZON_SM on 12.06.2020.
 **/
public class PrognozowaneWrunkiWyswietl implements Observer, WyswietlElement {
    Observable observable;
    private float aktualneCisnienie=29.9f;
    private float ostatniCiesnienie;

    public PrognozowaneWrunkiWyswietl(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if(obs instanceof DanePogodowe){
            DanePogodowe danePogodowe = (DanePogodowe)obs;
            ostatniCiesnienie=aktualneCisnienie;
            aktualneCisnienie=danePogodowe.getCisnienie();
            wyswietl();
        }
    }

    @Override
    public void wyswietl() {
        System.out.print("Prognozy: ");
        if(aktualneCisnienie>ostatniCiesnienie){
            System.out.println("Nadchodzi poprawa");
        }else if(aktualneCisnienie==ostatniCiesnienie){
            System.out.println("Podoga się nie zmieni");
        }else if(aktualneCisnienie<ostatniCiesnienie){
            System.out.println("Bedzie chłodniej");
        }
    }
}
