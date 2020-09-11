package PackTwo;

/**
 * Created by PZON_SM on 10.08.2020.
 **/
public class House {
    private int floors;
    private int rooms;
    private String walls;
    private String roof;
    private String garage;
    private String windows;

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", rooms=" + rooms +
                ", walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", garage='" + garage + '\'' +
                ", windows='" + windows + '\'' +
                '}';
    }
}
