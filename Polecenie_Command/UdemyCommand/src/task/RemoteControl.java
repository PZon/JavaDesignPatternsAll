package task;

/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class RemoteControl {
    private PlayerCommand playerCommand;

    public void setPlayerCommand(PlayerCommand playerCommand) {
        this.playerCommand = playerCommand;
    }

    public void pressButton(){
        playerCommand.play();
    }
}
