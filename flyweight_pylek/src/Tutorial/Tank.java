package Tutorial;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class Tank {
    private int x;
    private int y;
    private int hl;

    private MainStats stats;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        this.stats = UnitStats.getTank();
        this.hl = stats.getHealth();
    }
}
