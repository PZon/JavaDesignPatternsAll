/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class CommandDemo {
    public static void main(String[] arga){
        Robot robot = new Robot();
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        CommandExecutor commandExecutor = new CommandExecutor();

        commandExecutor.addToCommands(new RobotOn(robot));
        commandExecutor.addToCommands(new RobotSays(robot));
        commandExecutor.addToCommands(new RobotCleans(robot));
        commandExecutor.addToCommands(new VacuumOn(vacuumCleaner));
        commandExecutor.addToCommands(new VacuumClean(vacuumCleaner));
        commandExecutor.addToCommands(new VacuumCharging(vacuumCleaner));
        commandExecutor.addToCommands(new VacuumOff(vacuumCleaner));
        commandExecutor.addToCommands(new RobotOff(robot));

        commandExecutor.execute();
    }
}
