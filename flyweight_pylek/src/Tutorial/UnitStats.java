package Tutorial;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class UnitStats {
    private static MainStats ship = new MainStats("ship",100,50,1000000);
    private static MainStats tank = new MainStats("tank", 100, 80, 500000);
    private static MainStats gunMan = new MainStats("Gunman", 100, 25, 100);

    public UnitStats() { }

    public static MainStats getShip() {
        return ship;
    }

    public static MainStats getTank() {
        return tank;
    }

    public static MainStats getGunMan() {
        return gunMan;
    }
}

