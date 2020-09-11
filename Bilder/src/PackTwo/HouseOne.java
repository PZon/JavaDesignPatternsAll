package PackTwo;

/**
 * Created by PZON_SM on 10.08.2020.
 **/
public class HouseOne implements HouseBuilder {
    private House house;

    public HouseOne() {
        this.house = new House();
    }


    @Override
    public void buildFloors() {
        this.house.setFloors(2);

    }

    @Override
    public void buildWalls() {
        this.house.setWalls("Brick walls");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms(6);
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("Wooden windows");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Roof tails");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("Double garage");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
