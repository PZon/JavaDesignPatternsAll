package CarBefore;

/**
 * Created by PZON_SM on 07.09.2020.
 **/
public class CarDemo {
    public static void main(String[] args){
        Car car = new Car("Ford", "T","oldSchool", "black", 0.0, "petrol");
        Car car1 = new Car("Ford", "Mustang", "Sport car");

        System.out.println(car.getBrand());
        System.out.println(car1.getBrand());
        System.out.println(car.getModel());
        System.out.println(car1.getModel());
        System.out.println(car.getCarType());
        System.out.println(car1.getCarType());
    }
}
