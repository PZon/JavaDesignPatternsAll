package StacjaMeteoObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by PZON_SM on 15.06.2020.
 **/
public class StatystyczneDanePogodowe implements Observer, WyswietlElement {
    Observable observable;
    private float maxTemp=0.0f;
    private float minTemp=200;
    private float sumTemp=0.0f;
    private int nrOdczytow;

    public StatystyczneDanePogodowe(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void wyswietl() {
        System.out.println("Srednia/Max/Min temp: "+ (sumTemp/nrOdczytow)+" / "+ maxTemp+ " / "+minTemp);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(observable instanceof DanePogodowe) {
            DanePogodowe danePogodowe = (DanePogodowe) obs;
            float temp = danePogodowe.getTemp();
            sumTemp += temp;
            nrOdczytow++;

            if (temp > maxTemp) maxTemp = temp;
            if (temp < minTemp) minTemp = temp;

            wyswietl();
        }
    }
}
