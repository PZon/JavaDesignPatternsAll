import java.util.ArrayList;
import java.util.List;

/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class CommandExecutor {
    private List<Command> commands = new ArrayList<Command>();

    public void addToCommands(Command command){
        commands.add(command);
    }

    public void execute(){
        if(commands.isEmpty()) System.out.println("No commands");

        for(Command command : commands){
            command.run();
        }
        commands.clear();
    }

    public void prevCommand(){
        for (Command command : commands){
            command.prev();
        }
    }
}
