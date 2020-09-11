/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class RobotSays implements Command {
    private Robot robot;

    public RobotSays(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void run() {
        robot.sayHello();
    }

    @Override
    public void prev() {
        System.out.println("No command before");
    }
}
