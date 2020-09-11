package PackTwo;

/**
 * Created by PZON_SM on 10.08.2020.
 **/
public class HouseDemo {
    public static void main(String[] args){
        HouseOne houseOne = new HouseOne();
        HouseTwo houseTwo = new HouseTwo();
        HouseManager houseManager = new HouseManager(houseOne);
        houseManager.buildHouse();
        House house = houseOne.getHouse();
        System.out.println(house);
        System.out.println("=====================================================================");
        houseManager = new HouseManager(houseTwo);
        houseManager.buildHouse();
        house = houseTwo.getHouse();
        System.out.println(house);



    }
}
