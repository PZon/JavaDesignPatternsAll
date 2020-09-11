package task;

/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class MPRandomTrack implements PlayerCommand{
    private MusicPlayer musicPlayer;

    public MPRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playRandomTrack();
    }
}
