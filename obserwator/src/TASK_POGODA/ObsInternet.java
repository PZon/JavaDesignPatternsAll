package TASK_POGODA;

/**
 * Created by PZON_SM on 07.08.2020.
 **/
public class ObsInternet implements Observer {
    public void updateWeather(Weather weather) {
        System.out.println("WWW News: Prognoza pogody: "+weather.getTemp()+" st.C, ciśnienie: "+weather.getPressure());
    }
}
