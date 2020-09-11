package Pilot2;

/**
 * Created by PZON_SM on 10.07.2020.
 **/
public class Drzwi {
    String gdzie = "";

    public Drzwi(String gdzie) {
        this.gdzie = gdzie;
    }

    public void otworz(){
            System.out.println(gdzie + " drzwi zostały otwarte");
    }

    public void zamknij(){
        System.out.println(gdzie + " drzwi zostały zamknięte");
    }
}
