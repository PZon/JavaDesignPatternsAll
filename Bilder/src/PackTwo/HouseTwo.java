package PackTwo;

/**
 * Created by PZON_SM on 10.08.2020.
 **/
public class HouseTwo implements HouseBuilder {
    private House house;

    public HouseTwo() {
        this.house = new House();
    }


    @Override
    public void buildFloors() {
        this.house.setFloors(1);

    }

    @Override
    public void buildWalls() {
        this.house.setWalls("Plaster walls");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms(4);
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("Plastick windows");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Wooden roof");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("Single garage");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
