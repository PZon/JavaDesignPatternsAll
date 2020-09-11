package Pilot2;

/**
 * Created by PZON_SM on 10.07.2020.
 **/
public class HiFi {
    String gdzie = "";

    public HiFi(String gdzie) {
        this.gdzie = gdzie;
    }

    public void wlacz(){
        System.out.println(gdzie + " HiFi zoatała włączone");
    }

    public void wylacz(){
        System.out.println(gdzie + " HiFi zoatała wyłączone");
    }
}
