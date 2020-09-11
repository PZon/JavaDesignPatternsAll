package task;

import java.util.Arrays;
import java.util.List;

/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class MusicPlayer {
    private List<String> tracks = Arrays.asList("track 1", "track 2", "track 3", "track 4","track 5");
    private int currentTrack= 0;

    public void playFirstTrack(){
        System.out.println("play: "+ tracks.get(0));
    }

    public void playNextTrack(){
        currentTrack++;
        if(currentTrack>4) currentTrack=0;
        System.out.println("play: "+tracks.get(currentTrack));
    }

    public void playRandomTrack(){
        int randTrack = (int )(Math.random() * 5);
        System.out.println("play: "+tracks.get(randTrack));
    }
}
