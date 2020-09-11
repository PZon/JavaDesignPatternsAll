package StacjaMeteoObservable;

import java.util.Observable;

/**
 * Created by PZON_SM on 10.06.2020.
 **/
public class DanePogodowe extends Observable {
    private float temp;
    private float wilgotnosc;
    private float cisnienie;

    public DanePogodowe() {
    }

    public float getTemp() {
        return temp;
    }

    public float getWilgotnosc() {
        return wilgotnosc;
    }

    public float getCisnienie() {
        return cisnienie;
    }

    public void ustawPomiary(float temp, float wilgotnosc, float cisnienie){
        this.temp=temp;
        this.wilgotnosc=wilgotnosc;
        this.cisnienie=cisnienie;
        zmianaPomiarow();
    }

    public void zmianaPomiarow(){
        setChanged();
        notifyObservers();
    }
}
