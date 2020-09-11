package Tutorial;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class GunMan {
    private int x;
    private int y;
    private int healthLeft;

    private MainStats stats;

    public GunMan(int x, int y) {
        this.x = x;
        this.y = y;
        this.stats = UnitStats.getGunMan();
        this.healthLeft = stats.getHealth();
    }
}
