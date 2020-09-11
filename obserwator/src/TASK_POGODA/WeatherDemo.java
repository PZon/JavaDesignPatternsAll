package TASK_POGODA;

/**
 * Created by PZON_SM on 07.08.2020.
 **/
public class WeatherDemo {
    public static void main(String[] args){
        Weather weather = new Weather(25,77);
        ObsInternet internet = new ObsInternet();
        ObsRadio radio = new ObsRadio();
        ObsTvNews tv = new ObsTvNews();

        weather.addObserver(internet);
        weather.addObserver(radio);
        weather.addObserver(tv);
        weather.notifyObservers();
        System.out.println("\n--- New weather forecast: ---");
        weather.removeObserver(radio);
        weather.updateWeather(30,90);
        System.out.println("\n--- New weather forecast: ---");
        weather.removeObserver(tv);
        weather.updateWeather(20,80);
    }
}
