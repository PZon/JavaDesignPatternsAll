package Pilot2;

/**
 * Created by PZON_SM on 10.07.2020.
 **/
public class Klmatyzator {
    String gdzie="";

    public Klmatyzator(String gdzie) {
        this.gdzie = gdzie;
    }

    public void wlacz(){
        System.out.println(gdzie + " klima zoatała włączona");
    }

    public void wylacz(){
        System.out.println(gdzie + " klima zoatała wyłączona");
    }
}
