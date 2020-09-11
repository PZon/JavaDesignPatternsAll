package Pilot_1;

/**
 * Created by PZON_SM on 09.07.2020.
 **/
public class PilotOne {
    Polecenie przycisk;

    public PilotOne() { }

    public void odbierzPolecenie(Polecenie polecenie) {przycisk = polecenie;}
    public void wykonajOdebranePolecenie(){przycisk.wykonajPolecenie();}
}
