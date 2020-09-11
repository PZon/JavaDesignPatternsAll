package adapterYT;

/**
 * Created by PZON_SM on 11.09.2020.
 **/
public class EnemyRobotAdapter implements EnemyAttacker {
    EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void fireWeapon() {
        enemyRobot.handAttack();
    }

    @Override
    public void moveFireWeapon() {
        enemyRobot.robotMoves();
    }

    @Override
    public void assignFireWeaponDriver(String name) {
        enemyRobot.robotAction(name);
    }
}
