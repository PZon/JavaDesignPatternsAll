package Tutorial;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class MainStats {
    private String name;
    private int health;
    private int speed;
    private int price;

    public MainStats(String name, int health, int speed, int price) {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }
}
