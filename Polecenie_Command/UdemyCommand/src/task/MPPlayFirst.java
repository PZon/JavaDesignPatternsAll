package task;

/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class MPPlayFirst implements PlayerCommand {
    private MusicPlayer musicPlayer;

    public MPPlayFirst(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playFirstTrack();
    }
}
