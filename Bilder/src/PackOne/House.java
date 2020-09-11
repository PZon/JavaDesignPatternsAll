package PackOne;

/**
 * Created by PZON_SM on 10.08.2020.
 **/
public class House {
    private int floors;
    private int rooms;
    private String walls;
    private String roof;
    private String garage;

    public House(HouseBuilder houseBuilder) {
        this.floors = houseBuilder.floors;
        this.rooms = houseBuilder.rooms;
        this.walls = houseBuilder.walls;
        this.roof = houseBuilder.roof;
        this.garage = houseBuilder.garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", rooms=" + rooms +
                ", walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }

    public static class HouseBuilder{
        private int floors;
        private int rooms;
        private String walls;
        private String roof;
        private String garage;

        public HouseBuilder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder setWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setGarage(String garage) {
            this.garage = garage;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}
