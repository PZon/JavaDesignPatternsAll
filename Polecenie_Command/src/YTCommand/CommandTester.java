package YTCommand;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class CommandTester {
    public static void main(String[] args){
        Devices tv = new TV();
        Devices radio = new Radio();
        CommandExecutor commandExecutor = new CommandExecutor();

        commandExecutor.addCommand(new TvOn(tv));
        commandExecutor.addCommand(new TvUp(tv));
        commandExecutor.addCommand(new TvUp(tv));
        commandExecutor.addCommand(new TvDown(tv));
        commandExecutor.addCommand(new RadioOn(radio));
        commandExecutor.addCommand(new RadioUp(radio));
        commandExecutor.addCommand(new RadioUp(radio));
        commandExecutor.addCommand(new RadioDown(radio));
        commandExecutor.addCommand(new RadioOff(radio));

        //commandExecutor.undoCommands();
        commandExecutor.executeCommands();

    }
}
