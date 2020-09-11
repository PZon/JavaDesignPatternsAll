import java.util.Random;

import static java.lang.Thread.sleep;

/**
 * Created by PZON_SM on 02.09.2020.
 **/
public class SavedGamesMain implements SavedGamesIntf {
    private String name;
    private String gameData;

    @Override
    public void initialize() {
        this.name = "Saved game nr: "+new Random().nextInt(((900)+1)+100);
        this.gameData = loadFromStorage();
    }

    @Override
    public void loadGame() {
        System.out.println("Game loaded");
    }

    @Override
    public String getName() {
        return this.name;
    }

    private String loadFromStorage(){
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "loaded";
    }
}
