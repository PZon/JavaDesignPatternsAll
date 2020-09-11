package PackTwo;

/**
 * Created by PZON_SM on 10.08.2020.
 **/
public class HouseManager {
    private HouseBuilder houseBuilder;

    public HouseManager(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse(){
        houseBuilder.buildFloors();
        houseBuilder.buildWalls();
        houseBuilder.buildRooms();
        houseBuilder.buildWindows();
        houseBuilder.buildRoof();
        houseBuilder.buildGarage();
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }

}
