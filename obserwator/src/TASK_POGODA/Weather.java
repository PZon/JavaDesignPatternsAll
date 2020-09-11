package TASK_POGODA;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by PZON_SM on 07.08.2020.
 **/
public class Weather implements ObservableObject {
    private int temp;
    private int pressure;
    Set<Observer> registeredObservers = new HashSet<Observer>();

    public Weather(int temp, int pressure) {
        this.temp = temp;
        this.pressure = pressure;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public void addObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: registeredObservers){
            observer.updateWeather(this);
        }
    }

    public void updateWeather(int temp, int press){
        setTemp(temp);
        setPressure(press);
        notifyObservers();
    }

}
