package StacjaMeteoObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by PZON_SM on 15.06.2020.
 **/
public class IndexCiepla implements Observer, WyswietlElement {
    Observable observable;
    float indexCiepla = 0.0f;

    public IndexCiepla(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof DanePogodowe) {
            DanePogodowe danePogodowe = (DanePogodowe) obs;
            float temp = danePogodowe.getTemp();
            float wilgotnosc = danePogodowe.getWilgotnosc();
            indexCiepla=(float)
                    (
                            (16.923 + (0.185212 * temp)) +
                                    (5.37941 * wilgotnosc) -
                                    (0.100254 * temp * wilgotnosc) +
                                    (0.00941695 * (temp * temp)) +
                                    (0.00728898 * (wilgotnosc * wilgotnosc)) +
                                    (0.000345372 * (temp * temp * wilgotnosc)) -
                                    (0.000814971 * (temp * wilgotnosc * wilgotnosc)) +
                                    (0.0000102102 * (temp * temp * wilgotnosc * wilgotnosc)) -
                                    (0.000038646 * (temp * temp * temp)) +
                                    (0.0000291583 * (wilgotnosc * wilgotnosc * wilgotnosc)) +
                                    (0.00000142721 * (temp * temp * temp * wilgotnosc)) +
                                    (0.000000197483 * (temp * wilgotnosc * wilgotnosc * wilgotnosc)) -
                                    (0.0000000218429 * (temp* temp * temp * wilgotnosc * wilgotnosc)) +
                                    (0.000000000843296 * (temp * temp * wilgotnosc * wilgotnosc * wilgotnosc)) -
                                    (0.0000000000481975 * (temp * temp * temp * wilgotnosc * wilgotnosc * wilgotnosc)));
            wyswietl();
        }
    }

    @Override
    public void wyswietl() {
        System.out.println("Index ciepla: "+indexCiepla);
    }
}
