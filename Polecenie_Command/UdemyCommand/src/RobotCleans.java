/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class RobotCleans implements Command {
    private Robot robot;

    public RobotCleans(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void run() {
        robot.cleanRoom();
    }

    @Override
    public void prev() {
        robot.sayHello();
    }
}
