package TASK_POGODA;

/**
 * Created by PZON_SM on 07.08.2020.
 **/
public class ObsRadio implements Observer {
    public void updateWeather(Weather weather) {
        System.out.println("Radio News: Prognoza pogody: "+weather.getTemp()+" st.C, ciśnienie: "+weather.getPressure());
    }
}
