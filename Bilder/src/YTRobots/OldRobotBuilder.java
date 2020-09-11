package YTRobots;

/**
 * Created by PZON_SM on 07.09.2020.
 **/
public class OldRobotBuilder implements RobotBuilder {
    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildHead() {
        robot.setHead("Tin head");
    }

    @Override
    public void buildBody() {
        robot.setBody("Cardboard body");
    }

    @Override
    public void buildArms() {
        robot.setArms("Kitchen towels arms");
    }

    @Override
    public void buildLegs() {
        robot.setLegs("old tank tracks");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }

}
