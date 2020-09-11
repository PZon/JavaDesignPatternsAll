package PackTwo;

/**
 * Created by PZON_SM on 10.08.2020.
 **/
public interface HouseBuilder {
    void buildFloors();
    void buildWalls();
    void buildRooms();
    void buildWindows();
    void buildRoof();
    void buildGarage();

    House getHouse();
}
