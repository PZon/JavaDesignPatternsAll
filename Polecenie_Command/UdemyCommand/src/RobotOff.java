/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class RobotOff implements Command {
    private Robot robot;

    public RobotOff(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void run() {
        robot.switchOff();
    }

    @Override
    public void prev() {
        robot.switchOn();
    }
}
