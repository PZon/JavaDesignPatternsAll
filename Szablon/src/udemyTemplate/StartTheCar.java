package udemyTemplate;

import java.sql.SQLOutput;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public abstract class StartTheCar {

    public final void startCar(){
        openTheDoor();
        haveASeat();
        shootTheDoor();
        switchIgnitionOn();
        setAGear();
        pressAccelerationPedal();
        offYouGo();
    }

    private void offYouGo(){
        System.out.println("Have a nice trip");
    };

    private void pressAccelerationPedal() {
        System.out.println("Watch your speed");
    }

    public abstract void setAGear();

    public abstract void switchIgnitionOn();

    private void shootTheDoor() {
      System.out.println("Door are closed");
    }

    private void haveASeat(){
        System.out.println("Adjust your head rest and fasten your seat belt");

    };

    private void openTheDoor(){
        System.out.println("Use your key to open the door");
    };
}
