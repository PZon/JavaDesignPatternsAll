package Pilot2;

/**
 * Created by PZON_SM on 10.07.2020.
 **/
public class Pilot {
    Polecenie[] wylaczP;
    Polecenie[] wlaczP;

    public Pilot(){
      wlaczP = new Polecenie[7];
      wylaczP = new Polecenie[7];

        Polecenie brakP = new BrakPolecenia();
        for(int i=0; i<7; i++){
            wlaczP[i] = brakP;
            wylaczP[i] = brakP;
        }
    }

    public void pressedWlacz(int slot){
        wlaczP[slot].wykonaj();
    }

    public void pressedWylacz(int slot){
        wylaczP[slot].wykonaj();
    }

    public void zaprogramujPilota(int slot, Polecenie wlaczPP, Polecenie wylaczPP){
        wlaczP[slot] = wlaczPP;
        wylaczP[slot] = wylaczPP;
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n ----- PILOT -----\n");
        for(int i=0; i<wlaczP.length; i++){
            int j = i+1;
            stringBuffer.append("[slot "+ j +" ] "+ wlaczP[i].getClass().getName()+" - "+wylaczP[i]+getClass().getName()+"   \n");
        }
        return  stringBuffer.toString();
    }
}
