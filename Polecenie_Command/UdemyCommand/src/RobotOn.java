/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class RobotOn implements Command {
    private Robot robot;

    public RobotOn(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void run() {
        robot.switchOn();
    }

    @Override
    public void prev() {
        robot.switchOff();
    }
}
