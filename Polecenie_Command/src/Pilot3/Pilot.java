package Pilot3;

/**
 * Created by PZON_SM on 13.07.2020.
 **/
public class Pilot {
    Polecenie[] wylaczP;
    Polecenie[] wlaczP;
    Polecenie cofnijP;

    public Pilot() {
        wlaczP = new Polecenie[7];
        wylaczP = new Polecenie[7];

        Polecenie brakP = new PolecenieBrak();
        for (int i = 0; i < 7; i++) {
            wlaczP[i] = brakP;
            wylaczP[i] = brakP;
        }
        cofnijP = brakP;
    }

    public void ustawPolecenie(int przycisk, Polecenie wlacz, Polecenie wylacz){
        wlaczP[przycisk] = wlacz;
        wylaczP[przycisk] =wylacz;
    }

    public void wcisnietoPrzyciskWlacz(int przycisk){
        wlaczP[przycisk].wykonaj();
        cofnijP = wlaczP[przycisk];
    }

    public void wcisnietoPrzyciskWylacz(int przycisk){
        wylaczP[przycisk].wykonaj();
        cofnijP = wylaczP[przycisk];
    }

    public void wcisnietoPrzyciskCofnij(){
        cofnijP.cofnij();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < wlaczP.length; i++) {
            stringBuff.append("[slot " + i + "] " + wlaczP[i].getClass().getName()
                    + "    " + wylaczP[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + cofnijP.getClass().getName() + "\n");
        return stringBuff.toString();
    }
}
