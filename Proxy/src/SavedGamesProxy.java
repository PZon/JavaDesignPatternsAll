import java.util.Random;

/**
 * Created by PZON_SM on 02.09.2020.
 **/
public class SavedGamesProxy implements SavedGamesIntf{
    private String name;
    private SavedGamesIntf sg;

    @Override
    public void initialize() {
        this.name = "Saved game nr: "+new Random().nextInt(((900)+1)+100);
    }

    @Override
    public void loadGame() {
        sg = new SavedGamesMain();
        sg.initialize();
        sg.loadGame();

    }

    @Override
    public String getName() {
        return this.name;
    }
}
