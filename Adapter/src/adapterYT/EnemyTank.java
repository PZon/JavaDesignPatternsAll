package adapterYT;

import java.util.Random;

/**
 * Created by PZON_SM on 11.09.2020.
 **/
public class EnemyTank implements EnemyAttacker {
    Random randomNr = new Random();

    @Override
    public void fireWeapon() {
        int nrDamages = randomNr.nextInt(10)+1;
        System.out.println("Enemy's tank does "+nrDamages+" damage/s");
    }

    @Override
    public void moveFireWeapon() {
        int nrMeters = randomNr.nextInt(8)+1;
        System.out.println("Weapon has been moved about "+nrMeters+" meters forward");

    }

    @Override
    public void assignFireWeaponDriver(String name) {
        System.out.println(name + " is driving a tank");
    }
}
