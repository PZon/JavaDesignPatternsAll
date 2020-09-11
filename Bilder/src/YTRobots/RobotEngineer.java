package YTRobots;

/**
 * Created by PZON_SM on 07.09.2020.
 **/
public class RobotEngineer {
    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public void makeRobot(){
        robotBuilder.buildHead();
        robotBuilder.buildBody();
        robotBuilder.buildArms();
        robotBuilder.buildLegs();
    }

    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }
}
