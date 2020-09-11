package Pilot2;

/**
 * Created by PZON_SM on 10.07.2020.
 **/
public class Swiatlo {
    String gdzie = " ";

    public Swiatlo(String gdzie) {
        this.gdzie = gdzie;
    }

    public void wlacz(){
        System.out.println(gdzie + " swiatło zostało włączone");
    }

    public void wylacz(){
        System.out.println(gdzie + " swiatło zostało wyłączone");
    }
}
