import java.util.ArrayList;
import java.util.List;

/**
 * Created by PZON_SM on 02.09.2020.
 **/
public class SGDemo {
    public static void main(String[] args){
        List<SavedGamesIntf> savedGames = loadSavedGames();
        listSavedGames(savedGames);
    }

    private static List<SavedGamesIntf> loadSavedGames(){
        List<SavedGamesIntf> savedGames = new ArrayList<>(20);
        for(int i=0; i<20; i++) {
            SavedGamesIntf sg = new SavedGamesProxy();
            sg.initialize();
            savedGames.add(sg);
        }
        return savedGames;
    }

    private static void listSavedGames(List<SavedGamesIntf> savedGamesIntfs){
        for(SavedGamesIntf savedGamesIntf : savedGamesIntfs){
            System.out.println(savedGamesIntf.getName());
        }
    }
}
