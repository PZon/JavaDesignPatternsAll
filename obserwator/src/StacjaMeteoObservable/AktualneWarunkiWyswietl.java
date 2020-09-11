package StacjaMeteoObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by PZON_SM on 10.06.2020.
 **/
public class AktualneWarunkiWyswietl implements Observer, WyswietlElement {
    Observable observable;
    private float temp;
    private float wilgotnosc;

    public AktualneWarunkiWyswietl(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if(obs instanceof DanePogodowe){
            DanePogodowe danePogodowe = (DanePogodowe)obs;
            this.temp=danePogodowe.getTemp();
            this.wilgotnosc=danePogodowe.getWilgotnosc();
            wyswietl();
        }
    }

    @Override
    public void wyswietl() {
        System.out.println("Warunki bieżące " + temp+ " stopni C oraz "+wilgotnosc+" % wilgotnosc");
    }
}
