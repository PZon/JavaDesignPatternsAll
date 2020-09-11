package YTRobots;

/**
 * Created by PZON_SM on 07.09.2020.
 **/
public interface RobotBuilder {
    void buildHead();
    void buildBody();
    void buildArms();
    void buildLegs();

    Robot getRobot();
}
