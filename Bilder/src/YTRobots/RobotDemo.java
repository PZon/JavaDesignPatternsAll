package YTRobots;

/**
 * Created by PZON_SM on 07.09.2020.
 **/
public class RobotDemo {
    public static void main(String[] args){
        RobotBuilder oldRobot = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldRobot);

        robotEngineer.makeRobot();
        Robot oneR = robotEngineer.getRobot();
        System.out.println("Robot is made of:");
        System.out.println(oneR.getHead());
        System.out.println(oneR.getBody());
        System.out.println(oneR.getArms());
        System.out.println(oneR.getLegs());
    }

}
