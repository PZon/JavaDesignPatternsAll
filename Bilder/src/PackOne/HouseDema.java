package PackOne;

/**
 * Created by PZON_SM on 10.08.2020.
 **/
public class HouseDema {
    public static void main(String[] args){
        House house = new House.HouseBuilder()
                .setFloors(2)
                .setGarage("single garage")
                .setRooms(6)
                .setWalls("Plaster board")
                .setRoof("tails")
                .build();

        House house1 =new House.HouseBuilder()
                .setFloors(1)
                .setRooms(3)
                .setWalls("briks")
                .setRoof("Azbest")
                .build();

        System.out.println(house);
        System.out.println(house1);
        System.out.println(house.toString());
    }
}
