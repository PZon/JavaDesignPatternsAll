package Cars;

/**
 * Created by PZON_SM on 08.09.2020.
 **/

public class CarDemo {
    public static void main(String[] args){
        CarBuilder fordT = new BuilderFordT();
        CarEngineer carEngineer = new CarEngineer(fordT);
        carEngineer.makeCar();
        Car tOne = carEngineer.getCar();

        System.out.println("Your dreamed car is:");
        System.out.println(tOne.getBrand());
        System.out.println(tOne.getModel());
        System.out.println(tOne.getColor());
        System.out.println(tOne.getCarType());
        System.out.println(tOne.getEngineSize());
        System.out.println(tOne.getEngineType());
        System.out.println("============================");
        CarBuilder mustang = new BuildFordMustang();
        CarEngineer carEngineer1 = new CarEngineer(mustang);
        carEngineer1.makeCar();
        Car car = carEngineer1.getCar();
        System.out.println("Your dreamed car is:");
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getCarType());
        System.out.println(car.getEngineSize());
        System.out.println(car.getEngineType());

    }
}
