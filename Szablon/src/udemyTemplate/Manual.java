package udemyTemplate;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class Manual extends StartTheCar{
    @Override
    public void setAGear() {
        System.out.println("Look around and set 1st or revers gear!!!");
    }

    @Override
    public void switchIgnitionOn() {
        System.out.println("Use a key or press Start button");
    }
}
