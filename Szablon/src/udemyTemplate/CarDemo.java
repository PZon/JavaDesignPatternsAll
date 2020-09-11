package udemyTemplate;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class CarDemo {
    public static void main(String[] args){
        StartTheCar man = new Manual();
        man.startCar();
        System.out.println("===========================================");
        StartTheCar aut = new Automatic();
        aut.startCar();
    }
}
