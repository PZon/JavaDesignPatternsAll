package adapterYT;

/**
 * Created by PZON_SM on 11.09.2020.
 **/
public class EnemyDemo {
    public static void main(String[] args){
        EnemyTank enemyTank = new EnemyTank();
        EnemyRobot enemyRobot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(enemyRobot);

        System.out.println("enemy Tank");
        enemyTank.fireWeapon();
        enemyTank.moveFireWeapon();
        enemyTank.assignFireWeaponDriver("XXX");
        System.out.println("===============================");
        System.out.println(" enemy Robot");
        enemyRobot.handAttack();
        enemyRobot.robotMoves();
        enemyRobot.robotAction("YYY");
        System.out.println("===============================");
        System.out.println("robot Adapter");
        robotAdapter.fireWeapon();
        robotAdapter.moveFireWeapon();
        robotAdapter.assignFireWeaponDriver("ZZZ");
    }
}
