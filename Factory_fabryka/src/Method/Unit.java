package Method;

/**
 * Created by PZON_SM on 11.08.2020.
 **/
public abstract class Unit {
    private int health;
    private int expirience;
    private int damages;

    public Unit(int health, int expirience, int damages) {
        this.health = health;
        this.expirience = expirience;
        this.damages = damages;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExpirience() {
        return expirience;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }

    public int getDamages() {
        return damages;
    }

    public void setDamages(int damages) {
        this.damages = damages;
    }
}
