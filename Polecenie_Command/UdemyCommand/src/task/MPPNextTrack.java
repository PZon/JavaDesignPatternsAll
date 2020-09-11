package task;

/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class MPPNextTrack implements PlayerCommand {
    private MusicPlayer musicPlayer;

    public MPPNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
