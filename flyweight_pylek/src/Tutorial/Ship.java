package Tutorial;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class Ship {
    private int x;
    private int y;
    private int healthLeft;

    private MainStats stats;

    public Ship(int x, int y) {
        this.x = x;
        this.y = y;
        this.stats = UnitStats.getShip();
        this.healthLeft = stats.getHealth();
    }
}
