package adapterYT;

import java.util.Random;

/**
 * Created by PZON_SM on 11.09.2020.
 **/
public class EnemyRobot {
    Random randomNr = new Random();

    public void handAttack(){
        int hits = randomNr.nextInt(5)+1;
        System.out.println("Enemy's robot does "+hits+" damage/s his hands");
    }

    public void robotMoves(){
        int steps = randomNr.nextInt(15)+1;
        System.out.println("Robot has moved about "+steps+" steps forward");
    }

    public void robotAction(String name){
        System.out.println("Robot has been stuck by "+name);
    }
}
