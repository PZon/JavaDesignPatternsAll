package YTCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class CommandExecutor {
    private List<Commands> commands = new ArrayList<>();

    public void addCommand(Commands command){
        commands.add(command);
    }

    public void executeCommands(){
        if(commands.isEmpty()) System.out.println("No commands to execute");
        for(Commands cmnd: commands){
            cmnd.execute();
        }
        commands.clear();
    }

    public void undoCommands(){
        if(commands.isEmpty()) System.out.println("No commands to execute");
        for (Commands cmnd: commands){
            cmnd.undo();
        }
        commands.clear();
    }
}
