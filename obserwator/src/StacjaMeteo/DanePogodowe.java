package StacjaMeteo;

import java.util.ArrayList;

/**
 * Created by PZON_SM on 27.05.2020.
 **/
public class DanePogodowe implements Podmiot {
    private ArrayList obserwatorzy;
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public DanePogodowe(){
        obserwatorzy = new ArrayList();
    }

  /* public StacjaMeteo.DanePogodowe(ArrayList obserwatorzy) {
        this.obserwatorzy = obserwatorzy;
    }*/

    public void zarejestrujObserwatora(Obserwator o){
        obserwatorzy.add(o);
    }

    @Override
    public void usunObserwatora(Obserwator o) {
        int i = obserwatorzy.indexOf(o);
        if(i>=0){
            obserwatorzy.remove(i);
        }
    }

    @Override
    public void powiadomObserwatorow() {
        for(int i=0; i<obserwatorzy.size(); i++){
            Obserwator Obs = (Obserwator)obserwatorzy.get(i);
            Obs.akltualizacja(temperatura,wilgotnosc,cisnienie);
        }
    }

    public void odczytyZmiana(){
        powiadomObserwatorow();
    }

    public void ustawOdczyt(float temperatura, float wilgotnosc, float cisnienie){
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytyZmiana();
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getWilgotnosc() {
        return wilgotnosc;
    }

    public float getCisnienie() {
        return cisnienie;
    }
}
