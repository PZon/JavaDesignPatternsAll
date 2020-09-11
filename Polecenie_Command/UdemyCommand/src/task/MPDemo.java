package task;

/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class MPDemo {
    public static void main(String[] args){
        MusicPlayer musicPlayer = new MusicPlayer();
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setPlayerCommand(new MPPlayFirst(musicPlayer));
        remoteControl.pressButton();
        remoteControl.setPlayerCommand(new MPPNextTrack(musicPlayer));
        remoteControl.pressButton();
        remoteControl.pressButton();
        remoteControl.setPlayerCommand(new MPRandomTrack(musicPlayer));
        remoteControl.pressButton();
        remoteControl.pressButton();
        remoteControl.pressButton();
    }
}
